import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:dio/dio.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/i18n/app_strings.dart';
import '../../../core/platform/platform_detector.dart';
import '../../../core/services/service_locator.dart';
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
  final TextEditingController _nameController = TextEditingController();
  final TextEditingController _serverController = TextEditingController();
  final TextEditingController _usernameController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();

  static const List<_XtreamPreset> _presets = [
    _XtreamPreset(
      id: 'custom',
      label: 'Custom provider',
      server: '',
      username: '',
      password: '',
      suggestedName: '',
    ),
  ];

  String _selectedPresetId = 'custom';
  bool _includeVodSeries = true;
  bool _includeEpg = true;

  bool _showProgress = false;
  bool _isLoading = false;
  bool _importCompleted = false;
  String? _importError;
  String _phase = 'Ready';
  double _progress = 0.0;
  _XtreamSnapshot? _snapshot;

  @override
  void initState() {
    super.initState();
    _applyPreset(_presets.first);
  }

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

  void _applyPreset(_XtreamPreset preset) {
    _selectedPresetId = preset.id;
    _serverController.text = preset.server;
    _usernameController.text = preset.username;
    _passwordController.text = preset.password;
    if (preset.suggestedName.isNotEmpty) {
      _nameController.text = preset.suggestedName;
    }
  }

  Future<_XtreamSnapshot> _fetchXtreamSnapshot({
    required String baseServer,
    required String username,
    required String password,
  }) async {
    final dio = Dio(
      BaseOptions(
        connectTimeout: const Duration(seconds: 12),
        receiveTimeout: const Duration(seconds: 30),
        headers: {
          'User-Agent': 'Mozilla/5.0 (Android TV; VoXTV) AppleWebKit/537.36',
          'Accept': 'application/json,text/plain,*/*',
        },
        validateStatus: (status) => status != null && status < 500,
      ),
    );

    final authUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}';
    final authResponse = await dio.get(authUrl);
    if (authResponse.statusCode != 200 || authResponse.data == null || authResponse.data is! Map) {
      throw Exception('No se pudo validar la cuenta Xtream');
    }

    final authMap = authResponse.data as Map;
    final userInfo = (authMap['user_info'] is Map) ? authMap['user_info'] as Map : <String, dynamic>{};
    final authOk = userInfo['auth']?.toString() == '1';
    if (!authOk) {
      throw Exception('Usuario o contraseña incorrectos');
    }

    int liveCategories = 0;
    int liveChannels = 0;
    int vodCategories = 0;
    int vodItems = 0;
    int seriesCategories = 0;
    int seriesItems = 0;

    final liveCatUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_live_categories';
    final liveCatResp = await dio.get(liveCatUrl);
    if (liveCatResp.statusCode == 200 && liveCatResp.data is List) {
      liveCategories = (liveCatResp.data as List).length;
    }

    final liveUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_live_streams';
    final liveResp = await dio.get(liveUrl);
    if (liveResp.statusCode == 200 && liveResp.data is List) {
      liveChannels = (liveResp.data as List).length;
    }

    if (_includeVodSeries) {
      final vodCatUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_vod_categories';
      final vodCatResp = await dio.get(vodCatUrl);
      if (vodCatResp.statusCode == 200 && vodCatResp.data is List) {
        vodCategories = (vodCatResp.data as List).length;
      }

      final vodUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_vod_streams';
      final vodResp = await dio.get(vodUrl);
      if (vodResp.statusCode == 200 && vodResp.data is List) {
        vodItems = (vodResp.data as List).length;
      }

      final seriesCatUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_series_categories';
      final seriesCatResp = await dio.get(seriesCatUrl);
      if (seriesCatResp.statusCode == 200 && seriesCatResp.data is List) {
        seriesCategories = (seriesCatResp.data as List).length;
      }

      final seriesUrl = '$baseServer/player_api.php?username=${Uri.encodeComponent(username)}&password=${Uri.encodeComponent(password)}&action=get_series';
      final seriesResp = await dio.get(seriesUrl);
      if (seriesResp.statusCode == 200 && seriesResp.data is List) {
        seriesItems = (seriesResp.data as List).length;
      }
    }

    final expRaw = userInfo['exp_date']?.toString();
    String? expFormatted;
    if (expRaw != null && expRaw.isNotEmpty) {
      final epochSeconds = int.tryParse(expRaw);
      if (epochSeconds != null && epochSeconds > 0) {
        expFormatted = DateTime.fromMillisecondsSinceEpoch(epochSeconds * 1000).toLocal().toString().split('.').first;
      }
    }

    return _XtreamSnapshot(
      server: baseServer,
      username: userInfo['username']?.toString() ?? username,
      status: userInfo['status']?.toString() ?? 'Unknown',
      isActive: authOk,
      expiration: expFormatted,
      activeConnections: userInfo['active_cons']?.toString(),
      maxConnections: userInfo['max_connections']?.toString(),
      liveCategories: liveCategories,
      liveChannels: liveChannels,
      vodCategories: vodCategories,
      vodItems: vodItems,
      seriesCategories: seriesCategories,
      seriesItems: seriesItems,
    );
  }

  Future<void> _filterToLiveOnly(int playlistId) async {
    await ServiceLocator.database.delete(
      'channels',
      where: 'playlist_id = ? AND channel_type != ?',
      whereArgs: [playlistId, 'live'],
    );
    final countRows = await ServiceLocator.database.rawQuery(
      'SELECT COUNT(*) as cnt FROM channels WHERE playlist_id = ?',
      [playlistId],
    );
    int count = 0;
    if (countRows.isNotEmpty) {
      final value = countRows.first['cnt'];
      if (value is int) {
        count = value;
      } else if (value is num) {
        count = value.toInt();
      }
    }
    await ServiceLocator.database.update(
      'playlists',
      {'channel_count': count},
      where: 'id = ?',
      whereArgs: [playlistId],
    );
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

    setState(() {
      _isLoading = true;
      _showProgress = true;
      _importCompleted = false;
      _importError = null;
      _phase = 'Conectando con el servidor...';
      _progress = 0.05;
      _snapshot = null;
    });

    try {
      final validatedServer = await _validateXtreamAndGetServerBase(server, username, password);
      if (!mounted) return;

      setState(() {
        _phase = 'Obteniendo información de cuenta y contenido...';
        _progress = 0.2;
      });

      final snapshot = await _fetchXtreamSnapshot(
        baseServer: validatedServer,
        username: username,
        password: password,
      );

      if (!mounted) return;
      setState(() {
        _snapshot = snapshot;
        _phase = 'Importando LIVE/MOVIES/SERIES...';
        _progress = 0.45;
      });

      final url = _buildXtreamUrl(validatedServer, username, password);

      final provider = context.read<PlaylistProvider>();
      final settings = context.read<SettingsProvider>();
      final playlist = await provider.addPlaylistFromUrl(name, url, mergeRule: settings.channelMergeRule);

      if (!mounted) return;
      setState(() {
        _progress = 0.75;
        _phase = _includeVodSeries
            ? 'Aplicando configuración final...'
            : 'Filtrando solo LIVE (sin VOD/Series)...';
      });

      if (playlist != null && playlist.id != null && !_includeVodSeries) {
        await _filterToLiveOnly(playlist.id!);
      }

      if (playlist != null && mounted) {
        provider.setActivePlaylist(playlist, favoritesProvider: context.read<FavoritesProvider>());
        await context.read<ChannelProvider>().loadChannels(playlist.id!);

        if (mounted) {
          final epgProvider = context.read<EpgProvider>();
          if (_includeEpg && settings.enableEpg) {
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
          setState(() {
            _progress = 1.0;
            _phase = 'Importación completada';
            _importCompleted = true;
          });
          await Future.delayed(const Duration(milliseconds: 900));
          if (mounted) {
            ScaffoldMessenger.of(context).showSnackBar(
              SnackBar(content: Text(AppStrings.of(context)?.playlistImported ?? 'Playlist imported successfully'), backgroundColor: AppTheme.successColor),
            );
            Navigator.pop(context, true);
          }
        }
      }
    } catch (e) {
      if (mounted) {
        setState(() {
          _importError = e.toString().replaceAll('Exception: ', '');
          _phase = 'Error';
          _isLoading = false;
        });
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text(_importError!), backgroundColor: AppTheme.errorColor),
        );
      }
    } finally {
      if (mounted && !_importCompleted) {
        setState(() => _isLoading = false);
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    final isMobile = PlatformDetector.isMobile;

    final content = _showProgress
        ? _buildProgressContent()
        : Column(
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
        DropdownButtonFormField<String>(
          value: _selectedPresetId,
          decoration: const InputDecoration(
            hintText: 'Proveedor rápido',
          ),
          items: _presets
              .map((preset) => DropdownMenuItem<String>(
                    value: preset.id,
                    child: Text(preset.label),
                  ))
              .toList(),
          onChanged: _isLoading
              ? null
              : (value) {
                  if (value == null) return;
                  final preset = _presets.firstWhere((item) => item.id == value);
                  setState(() {
                    _applyPreset(preset);
                  });
                },
        ),
        const SizedBox(height: 10),
        TextField(controller: _nameController, decoration: const InputDecoration(hintText: 'Nombre de lista')),
        const SizedBox(height: 8),
        TextField(controller: _serverController, decoration: const InputDecoration(hintText: 'URL del servidor')),
        const SizedBox(height: 8),
        TextField(controller: _usernameController, decoration: const InputDecoration(hintText: 'Usuario')),
        const SizedBox(height: 8),
        TextField(controller: _passwordController, decoration: const InputDecoration(hintText: 'Contraseña'), obscureText: true),
        const SizedBox(height: 10),
        SwitchListTile(
          dense: true,
          contentPadding: EdgeInsets.zero,
          title: Text(
            'Incluir VOD y Series',
            style: TextStyle(color: AppTheme.getTextPrimary(context), fontSize: 14),
          ),
          value: _includeVodSeries,
          onChanged: _isLoading
              ? null
              : (value) {
                  setState(() {
                    _includeVodSeries = value;
                  });
                },
        ),
        SwitchListTile(
          dense: true,
          contentPadding: EdgeInsets.zero,
          title: Text(
            'Incluir TV Guide (EPG)',
            style: TextStyle(color: AppTheme.getTextPrimary(context), fontSize: 14),
          ),
          value: _includeEpg,
          onChanged: _isLoading
              ? null
              : (value) {
                  setState(() {
                    _includeEpg = value;
                  });
                },
        ),
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

  Widget _buildProgressContent() {
    final percent = (_progress * 100).clamp(0, 100).toInt();
    final progressColor = _progress >= 1.0 ? Colors.green : AppTheme.getPrimaryColor(context);

    return Column(
      mainAxisSize: MainAxisSize.min,
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: [
        Text(
          'Importando proveedor Xtream',
          style: TextStyle(
            color: AppTheme.getTextPrimary(context),
            fontSize: 18,
            fontWeight: FontWeight.w700,
          ),
          textAlign: TextAlign.center,
        ),
        const SizedBox(height: 12),
        LinearProgressIndicator(
          value: _progress,
          minHeight: 12,
          color: progressColor,
          backgroundColor: AppTheme.getCardColor(context),
        ),
        const SizedBox(height: 8),
        Text(
          '$percent%  •  $_phase',
          style: TextStyle(
            color: _importCompleted ? Colors.green : AppTheme.getTextSecondary(context),
            fontWeight: FontWeight.w600,
          ),
          textAlign: TextAlign.center,
        ),
        if (_snapshot != null) ...[
          const SizedBox(height: 14),
          _buildInfoCard('Cuenta', [
            'Usuario: ${_snapshot!.username}',
            'Estado: ${_snapshot!.isActive ? 'ACTIVO' : _snapshot!.status}',
            'Vence: ${_snapshot!.expiration ?? 'N/D'}',
            'Conexiones: ${_snapshot!.activeConnections ?? '-'} / ${_snapshot!.maxConnections ?? '-'}',
          ]),
          const SizedBox(height: 8),
          _buildInfoCard('Contenido detectado', [
            'LIVE: ${_snapshot!.liveCategories} categorías • ${_snapshot!.liveChannels} canales',
            'MOVIES: ${_snapshot!.vodCategories} categorías • ${_snapshot!.vodItems} items',
            'SERIES: ${_snapshot!.seriesCategories} categorías • ${_snapshot!.seriesItems} items',
          ]),
        ],
        if (_importError != null) ...[
          const SizedBox(height: 10),
          Container(
            padding: const EdgeInsets.all(10),
            decoration: BoxDecoration(
              color: AppTheme.errorColor.withOpacity(0.12),
              borderRadius: BorderRadius.circular(10),
            ),
            child: Text(
              _importError!,
              style: const TextStyle(color: AppTheme.errorColor),
            ),
          ),
        ],
        const SizedBox(height: 14),
        TVFocusable(
          onSelect: _isLoading ? null : () => Navigator.of(context).pop(false),
          child: TextButton(
            onPressed: _isLoading ? null : () => Navigator.of(context).pop(false),
            child: Text(_importCompleted ? 'Cerrar' : 'Cancelar'),
          ),
        ),
      ],
    );
  }

  Widget _buildInfoCard(String title, List<String> lines) {
    return Container(
      padding: const EdgeInsets.all(10),
      decoration: BoxDecoration(
        color: AppTheme.getCardColor(context),
        borderRadius: BorderRadius.circular(10),
        border: Border.all(color: AppTheme.getTextMuted(context).withOpacity(0.2)),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Text(
            title,
            style: TextStyle(
              color: AppTheme.getTextPrimary(context),
              fontWeight: FontWeight.w700,
            ),
          ),
          const SizedBox(height: 6),
          ...lines.map((line) => Padding(
                padding: const EdgeInsets.only(bottom: 3),
                child: Text(
                  line,
                  style: TextStyle(color: AppTheme.getTextSecondary(context), fontSize: 13),
                ),
              )),
        ],
      ),
    );
  }
}

class _XtreamPreset {
  final String id;
  final String label;
  final String server;
  final String username;
  final String password;
  final String suggestedName;

  const _XtreamPreset({
    required this.id,
    required this.label,
    required this.server,
    required this.username,
    required this.password,
    required this.suggestedName,
  });
}

class _XtreamSnapshot {
  final String server;
  final String username;
  final String status;
  final bool isActive;
  final String? expiration;
  final String? activeConnections;
  final String? maxConnections;
  final int liveCategories;
  final int liveChannels;
  final int vodCategories;
  final int vodItems;
  final int seriesCategories;
  final int seriesItems;

  const _XtreamSnapshot({
    required this.server,
    required this.username,
    required this.status,
    required this.isActive,
    required this.expiration,
    required this.activeConnections,
    required this.maxConnections,
    required this.liveCategories,
    required this.liveChannels,
    required this.vodCategories,
    required this.vodItems,
    required this.seriesCategories,
    required this.seriesItems,
  });
}
