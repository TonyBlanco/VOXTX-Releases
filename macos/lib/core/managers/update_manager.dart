import 'dart:io';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import '../models/app_update.dart';
import '../services/update_service.dart';
import '../widgets/update_dialog.dart';
import '../services/service_locator.dart';
import '../i18n/app_strings.dart';

class UpdateManager {
  static final UpdateManager _instance = UpdateManager._internal();
  factory UpdateManager() => _instance;
  UpdateManager._internal();

  final UpdateService _updateService = UpdateService();
  
  // Android  APK  MethodChannel
  static const _installChannel = MethodChannel('com.flutteriptv/install');

  /// 
  Future<void> checkAndShowUpdateDialog(BuildContext context, {bool forceCheck = false}) async {
    try {
      ServiceLocator.log.d('UPDATE_MANAGER: ...');

      final update = await _updateService.checkForUpdates(forceCheck: forceCheck);

      if (update != null && context.mounted) {
        ServiceLocator.log.d('UPDATE_MANAGER: ');
        _showUpdateDialog(context, update);
      } else {
        ServiceLocator.log.d('UPDATE_MANAGER: ');
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
    }
  }

  /// 
  Future<void> manualCheckForUpdate(BuildContext context) async {
    final strings = AppStrings.of(context);
    try {
      ServiceLocator.log.d('UPDATE_MANAGER: ...');

      // 
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Row(
            children: [
              SizedBox(
                width: 20,
                height: 20,
                child: CircularProgressIndicator(
                  strokeWidth: 2,
                  valueColor: AlwaysStoppedAnimation<Color>(Colors.white),
                ),
              ),
              SizedBox(width: 16),
              Text(strings?.checkingUpdate ?? 'Checking for updates...'),
            ],
          ),
          duration: Duration(seconds: 2),
        ),
      );

      final update = await _updateService.checkForUpdates(forceCheck: true);

      // 
      if (context.mounted) {
        ScaffoldMessenger.of(context).hideCurrentSnackBar();
      }

      if (update != null && context.mounted) {
        ServiceLocator.log.d('UPDATE_MANAGER: ');
        _showUpdateDialog(context, update);
      } else if (context.mounted) {
        ServiceLocator.log.d('UPDATE_MANAGER: ');
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text(strings?.alreadyLatestVersion ?? 'Already up to date'),
            backgroundColor: Colors.green,
          ),
        );
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
      if (context.mounted) {
        ScaffoldMessenger.of(context).hideCurrentSnackBar();
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text((strings?.checkUpdateFailed ?? 'Check update failed: {error}').replaceFirst('{error}', '$e')),
            backgroundColor: Colors.red,
          ),
        );
      }
    }
  }

  /// 
  void _showUpdateDialog(BuildContext context, AppUpdate update) {
    showDialog(
      context: context,
      barrierDismissible: false,
      builder: (context) => UpdateDialog(
        update: update,
        onUpdate: () => _handleUpdate(context, update),
        onCancel: () {
          Navigator.of(context).pop();
          ServiceLocator.log.d('UPDATE_MANAGER: ');
        },
      ),
    );
  }

  /// 
  Future<void> _handleUpdate(BuildContext context, AppUpdate update) async {
    final strings = AppStrings.of(context);
    try {
      ServiceLocator.log.d('UPDATE_MANAGER: ');

      // 
      if (context.mounted) {
        Navigator.of(context).pop();
      }

      if (Platform.isAndroid) {
        await _downloadAndInstallAndroid(context, update);
      } else if (Platform.isWindows) {
        await _downloadAndInstallWindows(context, update);
      } else {
        // 
        await _updateService.openDownloadPage();
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
      if (context.mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text((strings?.updateFailed ?? 'Update failed: {error}').replaceFirst('{error}', '$e')),
            backgroundColor: Colors.red,
          ),
        );
      }
    }
  }

  /// Android  APK
  Future<void> _downloadAndInstallAndroid(BuildContext context, AppUpdate update) async {
    final strings = AppStrings.of(context);
    double progress = 0;
    bool cancelled = false;
    void Function(void Function())? dialogSetState;
    BuildContext? dialogContext;
    
    showDialog(
      context: context,
      barrierDismissible: false,
      builder: (ctx) {
        dialogContext = ctx;
        return StatefulBuilder(
          builder: (context, setState) {
            dialogSetState = setState;
            return AlertDialog(
              title: Text(strings?.downloadUpdate ?? 'Download Update'),
              content: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  LinearProgressIndicator(value: progress),
                  const SizedBox(height: 16),
                  Text('${(progress * 100).toStringAsFixed(1)}%'),
                ],
              ),
              actions: [
                TextButton(
                  onPressed: () {
                    cancelled = true;
                    Navigator.of(ctx).pop();
                  },
                  child: Text(strings?.cancel ?? 'Cancel'),
                ),
              ],
            );
          },
        );
      },
    );

    try {
      final file = await _updateService.downloadUpdate(
        update,
        onProgress: (p) {
          if (!cancelled && dialogSetState != null) {
            progress = p;
            dialogSetState!(() {});
          }
        },
      );

      if (cancelled) {
        ServiceLocator.log.d('UPDATE_MANAGER: ');
        // 
        if (file != null && await file.exists()) {
          await file.delete();
        }
        return;
      }

      // 
      if (dialogContext != null && dialogContext!.mounted) {
        Navigator.of(dialogContext!).pop();
      }

      if (file != null) {
        ServiceLocator.log.d('UPDATE_MANAGER: : ${file.path}');
        await _installApk(file.path);
        
        // 
        Future.delayed(const Duration(seconds: 5), () async {
          try {
            if (await file.exists()) {
              await file.delete();
              ServiceLocator.log.d('UPDATE_MANAGER: ');
            }
          } catch (e) {
            ServiceLocator.log.d('UPDATE_MANAGER: : $e');
          }
        });
      } else {
        throw Exception((strings?.downloadFailed ?? 'Download failed: {error}').replaceFirst(': {error}', ''));
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
      if (dialogContext != null && dialogContext!.mounted) {
        Navigator.of(dialogContext!).pop();
      }
      if (context.mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text((strings?.downloadFailed ?? 'Download failed: {error}').replaceFirst('{error}', '$e')),
            backgroundColor: Colors.red,
          ),
        );
      }
    }
  }

  ///  APK
  Future<void> _installApk(String filePath) async {
    try {
      await _installChannel.invokeMethod('installApk', {'filePath': filePath});
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER:  APK : $e');
      rethrow;
    }
  }

  /// Windows 
  Future<void> _downloadAndInstallWindows(BuildContext context, AppUpdate update) async {
    final strings = AppStrings.of(context);
    double progress = 0;
    bool cancelled = false;
    bool dialogOpen = true;
    void Function(void Function())? dialogSetState;
    final navigatorState = Navigator.of(context);
    
    showDialog(
      context: context,
      barrierDismissible: false,
      builder: (ctx) {
        return StatefulBuilder(
          builder: (_, setState) {
            dialogSetState = setState;
            return AlertDialog(
              title: Text(strings?.downloadUpdate ?? 'Download Update'),
              content: Column(
                mainAxisSize: MainAxisSize.min,
                children: [
                  LinearProgressIndicator(value: progress),
                  const SizedBox(height: 16),
                  Text('${(progress * 100).toStringAsFixed(1)}%'),
                ],
              ),
              actions: [
                TextButton(
                  onPressed: () {
                    cancelled = true;
                    dialogOpen = false;
                    Navigator.of(ctx).pop();
                  },
                  child: Text(strings?.cancel ?? 'Cancel'),
                ),
              ],
            );
          },
        );
      },
    );

    try {
      final file = await _updateService.downloadUpdate(
        update,
        onProgress: (p) {
          if (!cancelled && dialogSetState != null) {
            progress = p;
            dialogSetState!(() {});
          }
        },
      );

      if (cancelled) {
        ServiceLocator.log.d('UPDATE_MANAGER: ');
        // 
        if (file != null && await file.exists()) {
          await file.delete();
          ServiceLocator.log.d('UPDATE_MANAGER: ');
        }
        return;
      }

      // 
      if (dialogOpen) {
        dialogOpen = false;
        navigatorState.pop();
      }

      ServiceLocator.log.d('UPDATE_MANAGER: file=${file?.path}');

      if (file != null) {
        ServiceLocator.log.d('UPDATE_MANAGER: : ${file.path}');
        
        // Windows: 
        if (context.mounted) {
          await showDialog(
            context: context,
            builder: (ctx) => AlertDialog(
              title: Text(strings?.downloadComplete ?? 'Download Complete'),
              content: Text(strings?.runInstallerNow ?? 'Run installer now?'),
              actions: [
                TextButton(
                  onPressed: () async {
                    Navigator.of(ctx).pop();
                    // 
                    try {
                      if (await file.exists()) {
                        await file.delete();
                        ServiceLocator.log.d('UPDATE_MANAGER: ');
                      }
                    } catch (e) {
                      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
                    }
                  },
                  child: Text(strings?.later ?? 'Later'),
                ),
                TextButton(
                  onPressed: () async {
                    Navigator.of(ctx).pop();
                    ServiceLocator.log.d('UPDATE_MANAGER: : ${file.path}');
                    // 
                    await Process.start(file.path, [], mode: ProcessStartMode.detached);
                    // 
                    exit(0);
                  },
                  child: Text(strings?.installNow ?? 'Install Now'),
                ),
              ],
            ),
          );
        } else {
          ServiceLocator.log.d('UPDATE_MANAGER: context not mounted, ');
          await Process.start(file.path, [], mode: ProcessStartMode.detached);
          exit(0);
        }
      } else {
        throw Exception((strings?.downloadFailed ?? 'Download failed: {error}').replaceFirst(': {error}', ''));
      }
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
      if (dialogOpen) {
        dialogOpen = false;
        navigatorState.pop();
      }
      if (context.mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text((strings?.downloadFailed ?? 'Download failed: {error}').replaceFirst('{error}', '$e')),
            backgroundColor: Colors.red,
          ),
        );
      }
    }
  }

  /// 
  Future<String> getCurrentVersion() async {
    try {
      return await _updateService.getCurrentVersion();
    } catch (e) {
      ServiceLocator.log.d('UPDATE_MANAGER: : $e');
      return '0.0.0';
    }
  }
}
