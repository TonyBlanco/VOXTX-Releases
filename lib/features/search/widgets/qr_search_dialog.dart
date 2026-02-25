import 'dart:async';

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:qr_flutter/qr_flutter.dart';

import '../../../core/theme/app_theme.dart';
import '../../../core/services/local_server_service.dart';
import '../../../core/services/service_locator.dart';
import '../../../core/widgets/tv_focusable.dart';
import '../../../core/i18n/app_strings.dart';
import '../../player/providers/player_provider.dart';

/// Dialog for scanning QR code to search channels on TV
class QrSearchDialog extends StatefulWidget {
  final Function(String query) onSearchReceived;
  
  const QrSearchDialog({
    super.key,
    required this.onSearchReceived,
  });

  @override
  State<QrSearchDialog> createState() => _QrSearchDialogState();
}

class _QrSearchDialogState extends State<QrSearchDialog> {
  final LocalServerService _serverService = LocalServerService();
  bool _isLoading = true;
  bool _isServerRunning = false;
  String? _error;
  String? _lastSearchQuery;   // shown as a "sent" banner after each search
  Timer? _bannerTimer;

  @override
  void initState() {
    super.initState();
    _startServer();
  }

  @override
  void dispose() {
    _bannerTimer?.cancel();
    _serverService.onSearchReceived = null;
    _serverService.onRemoteCommand = null;
    _serverService.stop();
    super.dispose();
  }

  Future<void> _startServer() async {
    ServiceLocator.log.d('...');

    setState(() {
      _isLoading = true;
      _error = null;
    });

    // Set up callbacks
    _serverService.onSearchReceived = _handleSearchReceived;
    _serverService.onRemoteCommand = _handleRemoteCommand;

    final success = await _serverService.start();
    ServiceLocator.log.d(': ${success ? "" : ""}');
    if (success) {
      ServiceLocator.log.d('URL: ${_serverService.serverUrl}');
    }

    setState(() {
      _isLoading = false;
      _isServerRunning = success;
      if (!success) {
        _error = _serverService.lastError ?? 
                (AppStrings.of(context)?.serverStartFailed ?? 'Failed to start local server. Please check network connection.');
      }
    });
  }

  void _handleSearchReceived(String query) {
    ServiceLocator.log.d(': $query');

    if (!mounted) return;

    // Forward the query to the search screen (TV updates results)
    widget.onSearchReceived(query);

    // Show a brief confirmation banner — keep dialog open for further searches
    _bannerTimer?.cancel();
    setState(() => _lastSearchQuery = query);
    _bannerTimer = Timer(const Duration(seconds: 3), () {
      if (mounted) setState(() => _lastSearchQuery = null);
    });
  }

  void _handleRemoteCommand(String command) {
    ServiceLocator.log.d('remote: $command');
    if (!mounted) return;
    final player = Provider.of<PlayerProvider>(context, listen: false);
    switch (command) {
      case 'play_pause':
        player.togglePlayPause();
        break;
      case 'volume_up':
        player.setVolume((player.volume + 0.1).clamp(0.0, 1.0));
        break;
      case 'volume_down':
        player.setVolume((player.volume - 0.1).clamp(0.0, 1.0));
        break;
      case 'mute':
        player.setVolume(player.volume > 0 ? 0.0 : 1.0);
        break;
      // Navigation commands (home, epg, favorites, ch+/- etc.) handled via app router in future
    }
  }

  @override
  Widget build(BuildContext context) {
    final isMobile = MediaQuery.of(context).size.width < 600;
    
    return Dialog(
      backgroundColor: AppTheme.getSurfaceColor(context),
      insetPadding: EdgeInsets.zero,
      child: ClipRRect(
        borderRadius: BorderRadius.circular(20),
        child: Container(
          width: isMobile ? null : 520,
          constraints: isMobile ? const BoxConstraints(maxWidth: 400) : null,
          decoration: BoxDecoration(
            color: AppTheme.getSurfaceColor(context),
          ),
          padding: EdgeInsets.all(isMobile ? 16 : 24),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              // Title
              Row(
                children: [
                  Container(
                    padding: const EdgeInsets.all(8),
                    decoration: BoxDecoration(
                      color: AppTheme.primaryColor.withAlpha(51),
                      borderRadius: BorderRadius.circular(10),
                    ),
                    child: const Icon(
                      Icons.qr_code_scanner_rounded,
                      color: AppTheme.primaryColor,
                      size: 22,
                    ),
                  ),
                  const SizedBox(width: 12),
                  Expanded(
                    child: Text(
                      AppStrings.of(context)?.scanToSearch ?? 'Scan to Search',
                      style: TextStyle(
                        color: AppTheme.getTextPrimary(context),
                        fontSize: isMobile ? 16 : 18,
                        fontWeight: FontWeight.bold,
                      ),
                    ),
                  ),
                ],
              ),

              const SizedBox(height: 20),

              // Content
              if (_isLoading) _buildLoadingState() else if (_error != null) _buildErrorState() else if (_isServerRunning) _buildQrCodeState(isMobile),

              // "Sent" confirmation banner
              if (_lastSearchQuery != null) ...[
                const SizedBox(height: 12),
                AnimatedOpacity(
                  opacity: _lastSearchQuery != null ? 1.0 : 0.0,
                  duration: const Duration(milliseconds: 300),
                  child: Container(
                    padding: const EdgeInsets.symmetric(horizontal: 14, vertical: 8),
                    decoration: BoxDecoration(
                      color: Colors.green.withAlpha(38),
                      borderRadius: BorderRadius.circular(8),
                      border: Border.all(color: Colors.green.withAlpha(76)),
                    ),
                    child: Row(
                      mainAxisSize: MainAxisSize.min,
                      children: [
                        const Icon(Icons.check_circle_outline, color: Colors.green, size: 16),
                        const SizedBox(width: 6),
                        Flexible(
                          child: Text(
                            '${AppStrings.of(context)?.sentToTV ?? "Sent"}: $_lastSearchQuery',
                            style: const TextStyle(color: Colors.green, fontSize: 13),
                            overflow: TextOverflow.ellipsis,
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ],

              const SizedBox(height: 20),

              // Close button
              TVFocusable(
                autofocus: true,
                onSelect: () => Navigator.of(context).pop(),
                child: SizedBox(
                  width: double.infinity,
                  child: OutlinedButton(
                    onPressed: () => Navigator.of(context).pop(),
                    style: OutlinedButton.styleFrom(
                      foregroundColor: AppTheme.getTextSecondary(context),
                      side: BorderSide(color: AppTheme.getCardColor(context)),
                      padding: const EdgeInsets.symmetric(vertical: 12),
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(10),
                      ),
                    ),
                    child: Text(AppStrings.of(context)?.close ?? 'Close'),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _buildLoadingState() {
    return Column(
      children: [
        const SizedBox(
          width: 48,
          height: 48,
          child: CircularProgressIndicator(
            strokeWidth: 3,
            color: AppTheme.primaryColor,
          ),
        ),
        const SizedBox(height: 16),
        Text(
          AppStrings.of(context)?.startingServer ?? 'Starting server...',
          style: TextStyle(color: AppTheme.getTextSecondary(context)),
        ),
      ],
    );
  }

  Widget _buildErrorState() {
    return Column(
      children: [
        const Icon(
          Icons.error_outline_rounded,
          color: AppTheme.errorColor,
          size: 48,
        ),
        const SizedBox(height: 16),
        Text(
          _error!,
          style: const TextStyle(color: AppTheme.errorColor),
          textAlign: TextAlign.center,
        ),
        const SizedBox(height: 16),
        TVFocusable(
          onSelect: _startServer,
          child: ElevatedButton(
            onPressed: _startServer,
            style: ElevatedButton.styleFrom(
              backgroundColor: AppTheme.primaryColor,
              foregroundColor: Colors.white,
            ),
            child: Text(AppStrings.of(context)?.retry ?? 'Retry'),
          ),
        ),
      ],
    );
  }

  Widget _buildQrCodeState(bool isMobile) {
    if (isMobile) {
      // 
      return Column(
        children: [
          // QR Code
          Container(
            padding: const EdgeInsets.all(12),
            decoration: BoxDecoration(
              color: Colors.white,
              borderRadius: BorderRadius.circular(12),
            ),
            child: QrImageView(
              data: _serverService.searchUrl,
              version: QrVersions.auto,
              size: 200,
              backgroundColor: Colors.white,
              errorCorrectionLevel: QrErrorCorrectLevel.M,
            ),
          ),

          const SizedBox(height: 16),

          // Instructions
          Container(
            padding: const EdgeInsets.all(12),
            decoration: BoxDecoration(
              color: AppTheme.getCardColor(context),
              borderRadius: BorderRadius.circular(10),
            ),
            child: Column(
              children: [
                _buildStep('1', AppStrings.of(context)?.qrSearchStep1 ?? 'Scan the QR code with your phone'),
                const SizedBox(height: 8),
                _buildStep('2', AppStrings.of(context)?.qrSearchStep2 ?? 'Enter search query on the webpage'),
                const SizedBox(height: 8),
                _buildStep('3', AppStrings.of(context)?.qrSearchStep3 ?? 'Results will appear on TV automatically'),
              ],
            ),
          ),

          const SizedBox(height: 12),

          // Server URL
          Container(
            padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
            decoration: BoxDecoration(
              color: AppTheme.getCardColor(context).withAlpha(128),
              borderRadius: BorderRadius.circular(8),
            ),
            child: Row(
              children: [
                Icon(
                  Icons.wifi_rounded,
                  color: AppTheme.getTextMuted(context),
                  size: 16,
                ),
                const SizedBox(width: 8),
                Expanded(
                  child: Text(
                    _serverService.searchUrl,
                    style: TextStyle(
                      color: AppTheme.getTextMuted(context),
                      fontSize: 11,
                      fontFamily: 'monospace',
                    ),
                    maxLines: 2,
                    overflow: TextOverflow.ellipsis,
                  ),
                ),
              ],
            ),
          ),
        ],
      );
    }
    
    // TV/
    return Row(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        // Left: QR Code
        Container(
          padding: const EdgeInsets.all(12),
          decoration: BoxDecoration(
            color: Colors.white,
            borderRadius: BorderRadius.circular(12),
          ),
          child: QrImageView(
            data: _serverService.searchUrl,
            version: QrVersions.auto,
            size: 160,
            backgroundColor: Colors.white,
            errorCorrectionLevel: QrErrorCorrectLevel.M,
          ),
        ),

        const SizedBox(width: 20),

        // Right: Instructions and URL
        Expanded(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              // Instructions
              Container(
                padding: const EdgeInsets.all(12),
                decoration: BoxDecoration(
                  color: AppTheme.getCardColor(context),
                  borderRadius: BorderRadius.circular(10),
                ),
                child: Column(
                  children: [
                    _buildStep('1', AppStrings.of(context)?.qrSearchStep1 ?? 'Scan the QR code with your phone'),
                    const SizedBox(height: 8),
                    _buildStep('2', AppStrings.of(context)?.qrSearchStep2 ?? 'Enter search query on the webpage'),
                    const SizedBox(height: 8),
                    _buildStep('3', AppStrings.of(context)?.qrSearchStep3 ?? 'Results will appear on TV automatically'),
                  ],
                ),
              ),

              const SizedBox(height: 12),

              // Server URL
              Container(
                padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
                decoration: BoxDecoration(
                  color: AppTheme.getCardColor(context).withAlpha(128),
                  borderRadius: BorderRadius.circular(8),
                ),
                child: Row(
                  children: [
                    Icon(
                      Icons.wifi_rounded,
                      color: AppTheme.getTextMuted(context),
                      size: 16,
                    ),
                    const SizedBox(width: 8),
                    Expanded(
                      child: Text(
                        _serverService.searchUrl,
                        style: TextStyle(
                          color: AppTheme.getTextMuted(context),
                          fontSize: 13,
                          fontFamily: 'monospace',
                        ),
                      ),
                    ),
                  ],
                ),
              ),
            ],
          ),
        ),
      ],
    );
  }

  Widget _buildStep(String number, String text) {
    return Row(
      children: [
        Container(
          width: 22,
          height: 22,
          decoration: BoxDecoration(
            color: AppTheme.primaryColor.withAlpha(51),
            shape: BoxShape.circle,
          ),
          child: Center(
            child: Text(
              number,
              style: const TextStyle(
                color: AppTheme.primaryColor,
                fontSize: 12,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
        ),
        const SizedBox(width: 10),
        Expanded(
          child: Text(
            text,
            style: TextStyle(
              color: AppTheme.getTextSecondary(context),
              fontSize: 13,
            ),
          ),
        ),
      ],
    );
  }
}
