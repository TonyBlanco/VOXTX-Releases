import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:dio/dio.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/i18n/app_strings.dart';
import '../../../core/platform/platform_detector.dart';
import '../providers/playlist_provider.dart';
import '../../channels/providers/channel_provider.dart';
import '../../favorites/providers/favorites_provider.dart';
import '../../settings/providers/settings_provider.dart';
import '../../epg/providers/epg_provider.dart';

class AddXtreamDialog extends StatefulWidget {
  const AddXtreamDialog({super.key});

  @override
  State<AddXtreamDialog> createState() => _AddXtreamDialogState();
}

class _AddXtreamDialogState extends State<AddXtreamDialog> {
  final TextEditingController _nameController = TextEditingController(text: 'Xtream - nextv');
  final TextEditingController _serverController = TextEditingController(text: 'http://nextv.ottb.xyz');
  final TextEditingController _usernameController = TextEditingController(text: '890395263975');
  final TextEditingController _passwordController = TextEditingController(text: '957195541666');
  bool _isLoading = false;

  String _normalizeServerUrl(String server) {
    var normalized = server.trim();
    if (normalized.isEmpty) return normalized;

    if (!normalized.startsWith('http://') && !normalized.startsWith('https://')) {
      normalized = 'http://$normalized';
    }

    if (normalized.endsWith('/')) {
      normalized = normalized.substring(0, normalized.length - 1);
    }

    return normalized;
  }

  Future<String> _validateXtreamAndGetServerBase(String server, String username, String password) async {
    final baseServer = _normalizeServerUrl(server);
    final authUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}';

    final dio = Dio(
      BaseOptions(
        connectTimeout: const Duration(seconds: 12),
        receiveTimeout: const Duration(seconds: 20),
        headers: {
          'User-Agent': 'Mozilla/5.0 (Android TV; FlutterIPTV) AppleWebKit/537.36',
          'Accept': 'application/json,text/plain,*/*',
        },
        validateStatus: (status) => status != null && status < 500,
      ),
    );

    final authResponse = await dio.get(authUrl);
    if (authResponse.statusCode != 200 || authResponse.data == null) {
      throw Exception('Error de conexión con el servidor (${authResponse.statusCode ?? 'sin código'})');
    }

    if (authResponse.data is! Map) {
      throw Exception('Respuesta inválida del servidor Xtream');
    }

    final map = authResponse.data as Map;
    final userInfo = map['user_info'];
    if (userInfo is! Map) {
      throw Exception('No se pudo validar usuario en Xtream');
    }

    final auth = userInfo['auth']?.toString() == '1';
    if (!auth) {
      throw Exception('Usuario o contraseña incorrectos');
    }

    // Comprobar que al menos LIVE categories responde
    final liveCategoriesUrl =
        '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_live_categories';
    final liveResponse = await dio.get(liveCategoriesUrl);

    if (liveResponse.statusCode != 200) {
      throw Exception('Autenticado, pero no se pudieron leer categorías LIVE');
    }

    if (liveResponse.data is List && (liveResponse.data as List).isEmpty) {
      throw Exception('La cuenta no tiene categorías LIVE disponibles');
    }

    final serverInfo = map['server_info'];
    if (serverInfo is Map) {
      final protocol = (serverInfo['server_protocol']?.toString().isNotEmpty ?? false)
          ? serverInfo['server_protocol'].toString()
          : Uri.parse(baseServer).scheme;
      final host = serverInfo['url']?.toString();
      final port = serverInfo['port']?.toString();

      if (host != null && host.isNotEmpty) {
        if (port != null && port.isNotEmpty) {
          return '$protocol://$host:$port';
        }
        return '$protocol://$host';
      }
    }

    return baseServer;
  }

  @override
  void dispose() {
    _nameController.dispose();
    _serverController.dispose();
    _usernameController.dispose();
    _passwordController.dispose();
    super.dispose();
  }

  String _buildXtreamUrl(String server, String username, String password) {
    var s = _normalizeServerUrl(server);
    // If user already provides a full get.php URL, return as-is
    if (s.contains('get.php')) {
      return s.replaceAll('{username}', Uri.encodeComponent(username)).replaceAll('{password}', Uri.encodeComponent(password));
    }

    // Default pattern
    return '$s/get.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&output=ts&type=m3u_plus';
  }

  Future<void> _submit() async {
    final name = _nameController.text.trim();
    final server = _serverController.text.trim();
    final username = _usernameController.text.trim();
    final password = _passwordController.text.trim();

    if (name.isEmpty || server.isEmpty || username.isEmpty || password.isEmpty) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text('Completa todos los campos'), backgroundColor: AppTheme.errorColor),
      );
      return;
    }

    setState(() => _isLoading = true);

    try {
      final validatedServer = await _validateXtreamAndGetServerBase(server, username, password);
      final url = _buildXtreamUrl(validatedServer, username, password);

      final provider = context.read<PlaylistProvider>();
      final settings = context.read<SettingsProvider>();
      final playlist = await provider.addPlaylistFromUrl(name, url, mergeRule: settings.channelMergeRule);

      if (playlist != null && mounted) {
        provider.setActivePlaylist(playlist, favoritesProvider: context.read<FavoritesProvider>());
        await context.read<ChannelProvider>().loadChannels(playlist.id!);

        if (mounted) {
          final epgProvider = context.read<EpgProvider>();
          if (settings.enableEpg) {
            final playlistEpgUrl = provider.lastExtractedEpgUrl;
            final fallbackEpgUrl = settings.epgUrl;
            if (playlistEpgUrl != null && playlistEpgUrl.isNotEmpty) {
              await epgProvider.loadEpg(playlistEpgUrl, fallbackUrl: fallbackEpgUrl, silent: true);
            } else if (fallbackEpgUrl != null && fallbackEpgUrl.isNotEmpty) {
              await epgProvider.loadEpg(fallbackEpgUrl, silent: true);
            }
          }
        }

        if (mounted) {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(content: Text(AppStrings.of(context)?.playlistImported ?? 'Playlist imported successfully'), backgroundColor: AppTheme.successColor),
          );
          Navigator.pop(context, true);
        }
      }
    } catch (e) {
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text(e.toString()), backgroundColor: AppTheme.errorColor),
        );
      }
    } finally {
      if (mounted) setState(() => _isLoading = false);
    }
  }

  @override
  Widget build(BuildContext context) {
    final isMobile = PlatformDetector.isMobile;

    final content = Column(
      mainAxisSize: MainAxisSize.min,
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: [
        Text(
          'Conexión Xtream Codes',
          style: TextStyle(
            color: AppTheme.getTextPrimary(context),
            fontSize: 18,
            fontWeight: FontWeight.w700,
          ),
          textAlign: TextAlign.center,
        ),
        const SizedBox(height: 12),
        TextField(controller: _nameController, decoration: const InputDecoration(hintText: 'Nombre de lista')),
        const SizedBox(height: 8),
        TextField(controller: _serverController, decoration: const InputDecoration(hintText: 'URL del servidor')),
        const SizedBox(height: 8),
        TextField(controller: _usernameController, decoration: const InputDecoration(hintText: 'Usuario')),
        const SizedBox(height: 8),
        TextField(controller: _passwordController, decoration: const InputDecoration(hintText: 'Contraseña'), obscureText: true),
        const SizedBox(height: 16),
        TVFocusable(
          onSelect: _isLoading ? null : _submit,
          child: ElevatedButton(
            onPressed: _isLoading ? null : _submit,
            style: ElevatedButton.styleFrom(backgroundColor: AppTheme.getPrimaryColor(context)),
            child: _isLoading
                ? const SizedBox(width: 18, height: 18, child: CircularProgressIndicator(color: Colors.white, strokeWidth: 2))
                : const Text('Conectar'),
          ),
        ),
      ],
    );

    if (isMobile) {
      return DraggableScrollableSheet(
        initialChildSize: 0.6,
        minChildSize: 0.3,
        maxChildSize: 0.9,
        expand: false,
        builder: (context, scrollController) {
          return Container(
            padding: const EdgeInsets.all(16),
            decoration: BoxDecoration(color: AppTheme.getBackgroundColor(context), borderRadius: const BorderRadius.vertical(top: Radius.circular(16))),
            child: SingleChildScrollView(controller: scrollController, child: content),
          );
        },
      );
    }

    return Dialog(child: Padding(padding: const EdgeInsets.all(16), child: content));
  }
}
