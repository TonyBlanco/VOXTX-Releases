import 'package:flutter/widgets.dart';
import 'package:flutter/foundation.dart';

class AppStrings {
  final Locale locale;
  final Map<String, String> _localizedValues;

  AppStrings(this.locale, this._localizedValues);

  static AppStrings? of(BuildContext context) {
    return Localizations.of<AppStrings>(context, AppStrings);
  }

  static const LocalizationsDelegate<AppStrings> delegate =
      _AppStringsDelegate();

  String get playlistManager => _localizedValues['playlistManager']!;
  String get playlistList => _localizedValues['playlistList']!;
  String get goToHomeToAdd => _localizedValues['goToHomeToAdd']!;
  String get addNewPlaylist => _localizedValues['addNewPlaylist']!;
  String get playlistName => _localizedValues['playlistName']!;
  String get playlistUrl => _localizedValues['playlistUrl']!;
  String get addFromUrl => _localizedValues['addFromUrl']!;
  String get fromFile => _localizedValues['fromFile']!;
  String get importing => _localizedValues['importing']!;
  String get noPlaylists => _localizedValues['noPlaylists']!;
  String get addFirstPlaylist => _localizedValues['addFirstPlaylist']!;
  String get deletePlaylist => _localizedValues['deletePlaylist']!;
  String get deleteConfirmation => _localizedValues['deleteConfirmation']!;
  String get cancel => _localizedValues['cancel']!;
  String get play => _localizedValues['play']!;
  String get delete => _localizedValues['delete']!;
  String get actions => _localizedValues['actions']!;
  String get settings => _localizedValues['settings']!;
  String get language => _localizedValues['language']!;
  String get general => _localizedValues['general']!;
  String get followSystem => _localizedValues['followSystem']!;
  String get languageFollowSystem => _localizedValues['languageFollowSystem']!;
  String get theme => _localizedValues['theme']!;
  String get themeDark => _localizedValues['themeDark']!;
  String get themeLight => _localizedValues['themeLight']!;
  String get themeSystem => _localizedValues['themeSystem']!;
  String get themeChanged => _localizedValues['themeChanged']!;
  String get fontFamily => _localizedValues['fontFamily']!;
  String get fontFamilyDesc => _localizedValues['fontFamilyDesc']!;
  String get fontChanged => _localizedValues['fontChanged']!;
  String get unknown => _localizedValues['unknown']!;
  String get save => _localizedValues['save']!;
  String get error => _localizedValues['error']!;
  String get success => _localizedValues['success']!;
  String get active => _localizedValues['active']!;
  String get refresh => _localizedValues['refresh']!;
  String get updated => _localizedValues['updated']!;
  String get version => _localizedValues['version']!;
  String get categories => _localizedValues['categories']!;
  String get allChannels => _localizedValues['allChannels']!;
  String get channels => _localizedValues['channels']!;
  String get noChannelsFound => _localizedValues['noChannelsFound']!;
  String get removeFavorites => _localizedValues['removeFavorites']!;
  String get addFavorites => _localizedValues['addFavorites']!;
  String get channelInfo => _localizedValues['channelInfo']!;
  String get playback => _localizedValues['playback']!;
  String get autoPlay => _localizedValues['autoPlay']!;
  String get autoPlaySubtitle => _localizedValues['autoPlaySubtitle']!;
  String get hardwareDecoding => _localizedValues['hardwareDecoding']!;
  String get hardwareDecodingSubtitle =>
      _localizedValues['hardwareDecodingSubtitle']!;
  String get bufferSize => _localizedValues['bufferSize']!;
  String get seconds => _localizedValues['seconds']!;
  String get playlists => _localizedValues['playlists']!;
  String get autoRefresh => _localizedValues['autoRefresh']!;
  String get autoRefreshSubtitle => _localizedValues['autoRefreshSubtitle']!;
  String get refreshInterval => _localizedValues['refreshInterval']!;
  String get hours => _localizedValues['hours']!;
  String get days => _localizedValues['days']!;
  String get day => _localizedValues['day']!;
  String get rememberLastChannel => _localizedValues['rememberLastChannel']!;
  String get rememberLastChannelSubtitle =>
      _localizedValues['rememberLastChannelSubtitle']!;
  String get epg => _localizedValues['epg']!;
  String get enableEpg => _localizedValues['enableEpg']!;
  String get enableEpgSubtitle => _localizedValues['enableEpgSubtitle']!;
  String get epgUrl => _localizedValues['epgUrl']!;
  String get notConfigured => _localizedValues['notConfigured']!;
  String get parentalControl => _localizedValues['parentalControl']!;
  String get enableParentalControl =>
      _localizedValues['enableParentalControl']!;
  String get enableParentalControlSubtitle =>
      _localizedValues['enableParentalControlSubtitle']!;
  String get changePin => _localizedValues['changePin']!;
  String get changePinSubtitle => _localizedValues['changePinSubtitle']!;
  String get about => _localizedValues['about']!;
  String get platform => _localizedValues['platform']!;
  String get resetAllSettings => _localizedValues['resetAllSettings']!;
  String get resetSettingsSubtitle =>
      _localizedValues['resetSettingsSubtitle']!;
  String get enterEpgUrl => _localizedValues['enterEpgUrl']!;
  String get setPin => _localizedValues['setPin']!;
  String get enterPin => _localizedValues['enterPin']!;
  String get resetSettings => _localizedValues['resetSettings']!;
  String get resetConfirm => _localizedValues['resetConfirm']!;
  String get reset => _localizedValues['reset']!;
  String get pleaseEnterPlaylistName =>
      _localizedValues['pleaseEnterPlaylistName']!;
  String get pleaseEnterPlaylistUrl =>
      _localizedValues['pleaseEnterPlaylistUrl']!;
  String get playlistAdded => _localizedValues['playlistAdded']!;
  String get playlistRefreshed => _localizedValues['playlistRefreshed']!;
  String get playlistRefreshFailed =>
      _localizedValues['playlistRefreshFailed']!;
  String get playlistDeleted => _localizedValues['playlistDeleted']!;
  String get playlistImported => _localizedValues['playlistImported']!;
  String get urlCopied => _localizedValues['urlCopied']!;
  String get errorPickingFile => _localizedValues['errorPickingFile']!;
  String get minutesAgo => _localizedValues['minutesAgo']!;
  String get hoursAgo => _localizedValues['hoursAgo']!;
  String get daysAgo => _localizedValues['daysAgo']!;
  String get live => _localizedValues['live']!;
  String get buffering => _localizedValues['buffering']!;
  String get paused => _localizedValues['paused']!;
  String get loading => _localizedValues['loading']!;
  String get playbackError => _localizedValues['playbackError']!;
  String get retry => _localizedValues['retry']!;
  String get goBack => _localizedValues['goBack']!;
  String get playbackSettings => _localizedValues['playbackSettings']!;
  String get playbackSpeed => _localizedValues['playbackSpeed']!;
  String get shortcutsHint => _localizedValues['shortcutsHint']!;
  String get lotusIptv => _localizedValues['lotusIptv']!;
  String get professionalIptvPlayer =>
      _localizedValues['professionalIptvPlayer']!;
  String get searchChannels => _localizedValues['searchChannels']!;
  String get searchHint => _localizedValues['searchHint']!;
  String get typeToSearch => _localizedValues['typeToSearch']!;
  String get popularCategories => _localizedValues['popularCategories']!;
  String get sports => _localizedValues['sports']!;
  String get movies => _localizedValues['movies']!;
  String get series => _localizedValues['series']!;
  String get news => _localizedValues['news']!;
  String get music => _localizedValues['music']!;
  String get kids => _localizedValues['kids']!;
  String get noResultsFound => _localizedValues['noResultsFound']!;
  String get noChannelsMatch => _localizedValues['noChannelsMatch']!;
  String get resultsFor => _localizedValues['resultsFor']!;
  String get favorites => _localizedValues['favorites']!;
  String get clearAll => _localizedValues['clearAll']!;
  String get noFavoritesYet => _localizedValues['noFavoritesYet']!;
  String get favoritesHint => _localizedValues['favoritesHint']!;
  String get noProgramInfo => _localizedValues['noProgramInfo']!;
  String get browseChannels => _localizedValues['browseChannels']!;
  String get removedFromFavorites => _localizedValues['removedFromFavorites']!;
  String get undo => _localizedValues['undo']!;
  String get clearAllFavorites => _localizedValues['clearAllFavorites']!;
  String get clearFavoritesConfirm =>
      _localizedValues['clearFavoritesConfirm']!;
  String get allFavoritesCleared => _localizedValues['allFavoritesCleared']!;
  String get home => _localizedValues['home']!;
  String get managePlaylists => _localizedValues['managePlaylists']!;
  String get noPlaylistsYet => _localizedValues['noPlaylistsYet']!;
  String get addFirstPlaylistHint => _localizedValues['addFirstPlaylistHint']!;
  String get addPlaylist => _localizedValues['addPlaylist']!;
  String get totalChannels => _localizedValues['totalChannels']!;

  // New translations
  String get volumeNormalization => _localizedValues['volumeNormalization']!;
  String get volumeNormalizationSubtitle =>
      _localizedValues['volumeNormalizationSubtitle']!;
  String get volumeBoost => _localizedValues['volumeBoost']!;
  String get noBoost => _localizedValues['noBoost']!;
  String get checkUpdate => _localizedValues['checkUpdate']!;
  String get checkUpdateSubtitle => _localizedValues['checkUpdateSubtitle']!;
  String get decodingMode => _localizedValues['decodingMode']!;
  String get decodingModeAuto => _localizedValues['decodingModeAuto']!;
  String get decodingModeHardware => _localizedValues['decodingModeHardware']!;
  String get decodingModeSoftware => _localizedValues['decodingModeSoftware']!;
  String get decodingModeAutoDesc => _localizedValues['decodingModeAutoDesc']!;
  String get decodingModeHardwareDesc =>
      _localizedValues['decodingModeHardwareDesc']!;
  String get decodingModeSoftwareDesc =>
      _localizedValues['decodingModeSoftwareDesc']!;
  String get channelMergeRule => _localizedValues['channelMergeRule']!;
  String get channelMergeRuleSubtitle => _localizedValues['channelMergeRuleSubtitle']!;
  String get channelMergeRuleSet => _localizedValues['channelMergeRuleSet']!;
  String get mergeByName => _localizedValues['mergeByName']!;
  String get mergeByNameDesc => _localizedValues['mergeByNameDesc']!;
  String get mergeByNameGroup => _localizedValues['mergeByNameGroup']!;
  String get mergeByNameGroupDesc => _localizedValues['mergeByNameGroupDesc']!;
  String get volumeBoostLow => _localizedValues['volumeBoostLow']!;
  String get volumeBoostSlightLow => _localizedValues['volumeBoostSlightLow']!;
  String get volumeBoostNormal => _localizedValues['volumeBoostNormal']!;
  String get volumeBoostSlightHigh =>
      _localizedValues['volumeBoostSlightHigh']!;
  String get volumeBoostHigh => _localizedValues['volumeBoostHigh']!;
  String get chinese => _localizedValues['chinese']!;
  String get english => _localizedValues['english']!;
  String get scanToImport => _localizedValues['scanToImport']!;
  String get importingPlaylist => _localizedValues['importingPlaylist']!;
  String get importSuccess => _localizedValues['importSuccess']!;
  String get importFailed => _localizedValues['importFailed']!;
  String get serverStartFailed => _localizedValues['serverStartFailed']!;
  String get processing => _localizedValues['processing']!;
  String get testChannel => _localizedValues['testChannel']!;
  String get unavailable => _localizedValues['unavailable']!;
  String get localFile => _localizedValues['localFile']!;

  // Home screen
  String get recommendedChannels => _localizedValues['recommendedChannels']!;
  String get watchHistory => _localizedValues['watchHistory']!;
  String get myFavorites => _localizedValues['myFavorites']!;
  String get continueWatching => _localizedValues['continueWatching']!;
  String get channelStats => _localizedValues['channelStats']!;
  String get noPlaylistYet => _localizedValues['noPlaylistYet']!;
  String get addM3uToStart => _localizedValues['addM3uToStart']!;
  String get search => _localizedValues['search']!;

  // Player hints
  String get playerHintTV => _localizedValues['playerHintTV']!;
  String get playerHintDesktop => _localizedValues['playerHintDesktop']!;

  // More UI strings
  String get more => _localizedValues['more']!;
  String get close => _localizedValues['close']!;
  String get startingServer => _localizedValues['startingServer']!;
  String get selectM3uFile => _localizedValues['selectM3uFile']!;
  String get noFileSelected => _localizedValues['noFileSelected']!;
  String get epgAutoApplied => _localizedValues['epgAutoApplied']!;
  String get addFirstPlaylistTV => _localizedValues['addFirstPlaylistTV']!;
  String get addPlaylistSubtitle => _localizedValues['addPlaylistSubtitle']!;
  String get importFromUsb => _localizedValues['importFromUsb']!;
  String get scanQrToImport => _localizedValues['scanQrToImport']!;
  String get playlistUrlHint => _localizedValues['playlistUrlHint']!;
  String get qrStep1 => _localizedValues['qrStep1']!;
  String get qrStep2 => _localizedValues['qrStep2']!;
  String get qrStep3 => _localizedValues['qrStep3']!;
  String get qrSearchStep1 => _localizedValues['qrSearchStep1']!;
  String get qrSearchStep2 => _localizedValues['qrSearchStep2']!;
  String get qrSearchStep3 => _localizedValues['qrSearchStep3']!;
  String get scanToSearch => _localizedValues['scanToSearch']!;

  // Player gestures and EPG
  String get nextChannel => _localizedValues['nextChannel']!;
  String get previousChannel => _localizedValues['previousChannel']!;
  String get source => _localizedValues['source']!;
  String get nowPlaying => _localizedValues['nowPlaying']!;
  String get endsInMinutes => _localizedValues['endsInMinutes']!;
  String get upNext => _localizedValues['upNext']!;

  // Update dialog
  String get newVersionAvailable => _localizedValues['newVersionAvailable']!;
  String get whatsNew => _localizedValues['whatsNew']!;
  String get updateLater => _localizedValues['updateLater']!;
  String get updateNow => _localizedValues['updateNow']!;
  String get noReleaseNotes => _localizedValues['noReleaseNotes']!;

  // Settings messages
  String get autoPlayEnabled => _localizedValues['autoPlayEnabled']!;
  String get autoPlayDisabled => _localizedValues['autoPlayDisabled']!;
  String get bufferStrength => _localizedValues['bufferStrength']!;
  String get showFps => _localizedValues['showFps']!;
  String get showFpsSubtitle => _localizedValues['showFpsSubtitle']!;
  String get fpsEnabled => _localizedValues['fpsEnabled']!;
  String get fpsDisabled => _localizedValues['fpsDisabled']!;
  String get showClock => _localizedValues['showClock']!;
  String get showClockSubtitle => _localizedValues['showClockSubtitle']!;
  String get clockEnabled => _localizedValues['clockEnabled']!;
  String get clockDisabled => _localizedValues['clockDisabled']!;
  String get showNetworkSpeed => _localizedValues['showNetworkSpeed']!;
  String get showNetworkSpeedSubtitle =>
      _localizedValues['showNetworkSpeedSubtitle']!;
  String get networkSpeedEnabled => _localizedValues['networkSpeedEnabled']!;
  String get networkSpeedDisabled => _localizedValues['networkSpeedDisabled']!;
  String get showVideoInfo => _localizedValues['showVideoInfo']!;
  String get showVideoInfoSubtitle =>
      _localizedValues['showVideoInfoSubtitle']!;
  String get videoInfoEnabled => _localizedValues['videoInfoEnabled']!;
  String get videoInfoDisabled => _localizedValues['videoInfoDisabled']!;
  String get enableMultiScreen => _localizedValues['enableMultiScreen']!;
  String get enableMultiScreenSubtitle =>
      _localizedValues['enableMultiScreenSubtitle']!;
  String get multiScreenEnabled => _localizedValues['multiScreenEnabled']!;
  String get multiScreenDisabled => _localizedValues['multiScreenDisabled']!;
  String get showMultiScreenChannelName =>
      _localizedValues['showMultiScreenChannelName']!;
  String get showMultiScreenChannelNameSubtitle =>
      _localizedValues['showMultiScreenChannelNameSubtitle']!;
  String get multiScreenChannelNameEnabled =>
      _localizedValues['multiScreenChannelNameEnabled']!;
  String get multiScreenChannelNameDisabled =>
      _localizedValues['multiScreenChannelNameDisabled']!;
  String get defaultScreenPosition =>
      _localizedValues['defaultScreenPosition']!;
  String get screenPosition1 => _localizedValues['screenPosition1']!;
  String get screenPosition2 => _localizedValues['screenPosition2']!;
  String get screenPosition3 => _localizedValues['screenPosition3']!;
  String get screenPosition4 => _localizedValues['screenPosition4']!;
  String get screenPositionDesc => _localizedValues['screenPositionDesc']!;
  String get screenPositionSet => _localizedValues['screenPositionSet']!;
  String get multiScreenMode => _localizedValues['multiScreenMode']!;
  String get notImplemented => _localizedValues['notImplemented']!;
  String get volumeNormalizationNotImplemented =>
      _localizedValues['volumeNormalizationNotImplemented']!;
  String get autoRefreshNotImplemented =>
      _localizedValues['autoRefreshNotImplemented']!;
  String get rememberLastChannelEnabled =>
      _localizedValues['rememberLastChannelEnabled']!;
  String get rememberLastChannelDisabled =>
      _localizedValues['rememberLastChannelDisabled']!;
  String get epgEnabledAndLoaded => _localizedValues['epgEnabledAndLoaded']!;
  String get epgEnabledButFailed => _localizedValues['epgEnabledButFailed']!;
  String get epgEnabledPleaseConfigure =>
      _localizedValues['epgEnabledPleaseConfigure']!;
  String get epgDisabled => _localizedValues['epgDisabled']!;
  String get weak => _localizedValues['weak']!;
  String get medium => _localizedValues['medium']!;
  String get strong => _localizedValues['strong']!;

  // Errors
  String get errorTimeout => _localizedValues['errorTimeout']!;
  String get errorNetwork => _localizedValues['errorNetwork']!;
  String get usingCachedSource => _localizedValues['usingCachedSource']!;

  // Multi-screen player strings
  String get backToPlayer => _localizedValues['backToPlayer']!;
  String get miniMode => _localizedValues['miniMode']!;
  String get exitMultiScreen => _localizedValues['exitMultiScreen']!;
  String get screenNumber => _localizedValues['screenNumber']!;
  String get clickToAddChannel => _localizedValues['clickToAddChannel']!;
  String get selectChannel => _localizedValues['selectChannel']!;

  // Channel test and update strings
  String get collapse => _localizedValues['collapse']!;
  String get channelCountLabel => _localizedValues['channelCountLabel']!;
  String get showOnlyFailed => _localizedValues['showOnlyFailed']!;
  String get moveToUnavailable => _localizedValues['moveToUnavailable']!;
  String get stopTest => _localizedValues['stopTest']!;
  String get startTest => _localizedValues['startTest']!;
  String get complete => _localizedValues['complete']!;
  String get runInBackground => _localizedValues['runInBackground']!;
  String get movedToUnavailable => _localizedValues['movedToUnavailable']!;
  String get checkingUpdate => _localizedValues['checkingUpdate']!;
  String get alreadyLatestVersion => _localizedValues['alreadyLatestVersion']!;
  String get checkUpdateFailed => _localizedValues['checkUpdateFailed']!;
  String get updateFailed => _localizedValues['updateFailed']!;
  String get downloadUpdate => _localizedValues['downloadUpdate']!;
  String get downloadFailed => _localizedValues['downloadFailed']!;
  String get downloadComplete => _localizedValues['downloadComplete']!;
  String get runInstallerNow => _localizedValues['runInstallerNow']!;
  String get later => _localizedValues['later']!;
  String get installNow => _localizedValues['installNow']!;
  String get deletedChannels => _localizedValues['deletedChannels']!;
  String get testing => _localizedValues['testing']!;
  String get channelAvailableRestored =>
      _localizedValues['channelAvailableRestored']!;
  String get testingInBackground => _localizedValues['testingInBackground']!;
  String get restoredToCategory => _localizedValues['restoredToCategory']!;
  String get dlnaCast => _localizedValues['dlnaCast']!;

  // More settings messages
  String get dlnaCasting => _localizedValues['dlnaCasting']!;
  String get enableDlnaService => _localizedValues['enableDlnaService']!;
  String get dlnaServiceStarted => _localizedValues['dlnaServiceStarted']!;
  String get allowOtherDevicesToCast =>
      _localizedValues['allowOtherDevicesToCast']!;
  String get dlnaServiceStartedMsg =>
      _localizedValues['dlnaServiceStartedMsg']!;
  String get dlnaServiceStoppedMsg =>
      _localizedValues['dlnaServiceStoppedMsg']!;
  String get dlnaServiceStartFailed =>
      _localizedValues['dlnaServiceStartFailed']!;
  String get parentalControlNotImplemented =>
      _localizedValues['parentalControlNotImplemented']!;
  String get changePinNotImplemented =>
      _localizedValues['changePinNotImplemented']!;
  String get decodingModeSet => _localizedValues['decodingModeSet']!;
  String get videoOutput => _localizedValues['videoOutput']!;
  String get videoOutputAuto => _localizedValues['videoOutputAuto']!;
  String get videoOutputLibmpv => _localizedValues['videoOutputLibmpv']!;
  String get videoOutputGpu => _localizedValues['videoOutputGpu']!;
  String get videoOutputAutoDesc => _localizedValues['videoOutputAutoDesc']!;
  String get videoOutputLibmpvDesc => _localizedValues['videoOutputLibmpvDesc']!;
  String get videoOutputGpuDesc => _localizedValues['videoOutputGpuDesc']!;
  String get videoOutputSet => _localizedValues['videoOutputSet']!;
  String get windowsHwdecMode => _localizedValues['windowsHwdecMode']!;
  String get windowsHwdecModeSet => _localizedValues['windowsHwdecModeSet']!;
  String get windowsHwdecAutoSafe => _localizedValues['windowsHwdecAutoSafe']!;
  String get windowsHwdecAutoCopy => _localizedValues['windowsHwdecAutoCopy']!;
  String get windowsHwdecD3d11va => _localizedValues['windowsHwdecD3d11va']!;
  String get windowsHwdecDxva2 => _localizedValues['windowsHwdecDxva2']!;
  String get windowsHwdecAutoSafeDesc =>
      _localizedValues['windowsHwdecAutoSafeDesc']!;
  String get windowsHwdecAutoCopyDesc =>
      _localizedValues['windowsHwdecAutoCopyDesc']!;
  String get windowsHwdecD3d11vaDesc =>
      _localizedValues['windowsHwdecD3d11vaDesc']!;
  String get windowsHwdecDxva2Desc =>
      _localizedValues['windowsHwdecDxva2Desc']!;
  String get allowSoftwareFallback =>
      _localizedValues['allowSoftwareFallback']!;
  String get allowSoftwareFallbackDesc =>
      _localizedValues['allowSoftwareFallbackDesc']!;
  String get allowSoftwareFallbackEnabled =>
      _localizedValues['allowSoftwareFallbackEnabled']!;
  String get allowSoftwareFallbackDisabled =>
      _localizedValues['allowSoftwareFallbackDisabled']!;
  String get fastBuffer => _localizedValues['fastBuffer']!;
  String get balancedBuffer => _localizedValues['balancedBuffer']!;
  String get stableBuffer => _localizedValues['stableBuffer']!;

  // Developer and debug settings
  String get developerAndDebug => _localizedValues['developerAndDebug']!;
  String get logLevel => _localizedValues['logLevel']!;
  String get logLevelSubtitle => _localizedValues['logLevelSubtitle']!;
  String get logLevelDebug => _localizedValues['logLevelDebug']!;
  String get logLevelRelease => _localizedValues['logLevelRelease']!;
  String get logLevelOff => _localizedValues['logLevelOff']!;
  String get logLevelDebugDesc => _localizedValues['logLevelDebugDesc']!;
  String get logLevelReleaseDesc => _localizedValues['logLevelReleaseDesc']!;
  String get logLevelOffDesc => _localizedValues['logLevelOffDesc']!;
  String get exportLogs => _localizedValues['exportLogs']!;
  String get exportLogsSubtitle => _localizedValues['exportLogsSubtitle']!;
  String get clearLogs => _localizedValues['clearLogs']!;
  String get clearLogsSubtitle => _localizedValues['clearLogsSubtitle']!;
  String get logFileLocation => _localizedValues['logFileLocation']!;
  String get logsCleared => _localizedValues['logsCleared']!;
  String get clearLogsConfirm => _localizedValues['clearLogsConfirm']!;
  String get clearLogsConfirmMessage =>
      _localizedValues['clearLogsConfirmMessage']!;
  String get bufferSizeNotImplemented =>
      _localizedValues['bufferSizeNotImplemented']!;
  String get volumeBoostSet => _localizedValues['volumeBoostSet']!;
  String get noBoostValue => _localizedValues['noBoostValue']!;
  String get epgUrlSavedAndLoaded => _localizedValues['epgUrlSavedAndLoaded']!;
  String get epgUrlSavedButFailed => _localizedValues['epgUrlSavedButFailed']!;
  String get epgUrlCleared => _localizedValues['epgUrlCleared']!;
  String get epgUrlSaved => _localizedValues['epgUrlSaved']!;
  String get pinNotImplemented => _localizedValues['pinNotImplemented']!;
  String get enter4DigitPin => _localizedValues['enter4DigitPin']!;
  String get allSettingsReset => _localizedValues['allSettingsReset']!;
  String get languageSwitchedToChinese =>
      _localizedValues['languageSwitchedToChinese']!;
  String get languageSwitchedToEnglish =>
      _localizedValues['languageSwitchedToEnglish']!;
  String get themeChangedMessage => _localizedValues['themeChangedMessage']!;
  String get defaultVersion => _localizedValues['defaultVersion']!;

  // Color scheme strings
  String get colorScheme => _localizedValues['colorScheme']!;
  String get selectColorScheme => _localizedValues['selectColorScheme']!;
  String get colorSchemeLotus => _localizedValues['colorSchemeLotus']!;
  String get colorSchemeOcean => _localizedValues['colorSchemeOcean']!;
  String get colorSchemeForest => _localizedValues['colorSchemeForest']!;
  String get colorSchemeSunset => _localizedValues['colorSchemeSunset']!;
  String get colorSchemeLavender => _localizedValues['colorSchemeLavender']!;
  String get colorSchemeMidnight => _localizedValues['colorSchemeMidnight']!;
  String get colorSchemeLotusLight =>
      _localizedValues['colorSchemeLotusLight']!;
  String get colorSchemeSky => _localizedValues['colorSchemeSky']!;
  String get colorSchemeSpring => _localizedValues['colorSchemeSpring']!;
  String get colorSchemeCoral => _localizedValues['colorSchemeCoral']!;
  String get colorSchemeViolet => _localizedValues['colorSchemeViolet']!;
  String get colorSchemeClassic => _localizedValues['colorSchemeClassic']!;
  String get colorSchemeDescLotus => _localizedValues['colorSchemeDescLotus']!;
  String get colorSchemeDescOcean => _localizedValues['colorSchemeDescOcean']!;
  String get colorSchemeDescForest =>
      _localizedValues['colorSchemeDescForest']!;
  String get colorSchemeDescSunset =>
      _localizedValues['colorSchemeDescSunset']!;
  String get colorSchemeDescLavender =>
      _localizedValues['colorSchemeDescLavender']!;
  String get colorSchemeDescMidnight =>
      _localizedValues['colorSchemeDescMidnight']!;
  String get colorSchemeDescLotusLight =>
      _localizedValues['colorSchemeDescLotusLight']!;
  String get colorSchemeDescSky => _localizedValues['colorSchemeDescSky']!;
  String get colorSchemeDescSpring =>
      _localizedValues['colorSchemeDescSpring']!;
  String get colorSchemeDescCoral => _localizedValues['colorSchemeDescCoral']!;
  String get colorSchemeDescViolet =>
      _localizedValues['colorSchemeDescViolet']!;
  String get colorSchemeDescClassic =>
      _localizedValues['colorSchemeDescClassic']!;
  String get colorSchemeChanged => _localizedValues['colorSchemeChanged']!;
  String get customColorPicker => _localizedValues['customColorPicker']!;
  String get selectedColor => _localizedValues['selectedColor']!;
  String get apply => _localizedValues['apply']!;
  String get customColorApplied => _localizedValues['customColorApplied']!;
  String get colorSchemeCustom => _localizedValues['colorSchemeCustom']!;

  // Local server web page strings
  String get importPlaylistTitle => _localizedValues['importPlaylistTitle']!;
  String get importPlaylistSubtitle =>
      _localizedValues['importPlaylistSubtitle']!;
  String get importFromUrlTitle => _localizedValues['importFromUrlTitle']!;
  String get importFromFileTitle => _localizedValues['importFromFileTitle']!;
  String get playlistNameOptional => _localizedValues['playlistNameOptional']!;
  String get enterPlaylistUrl => _localizedValues['enterPlaylistUrl']!;
  String get importUrlButton => _localizedValues['importUrlButton']!;
  String get selectFile => _localizedValues['selectFile']!;
  String get fileNameOptional => _localizedValues['fileNameOptional']!;
  String get fileUploadButton => _localizedValues['fileUploadButton']!;
  String get or => _localizedValues['or']!;
  String get pleaseEnterUrl => _localizedValues['pleaseEnterUrl']!;
  String get sentToTV => _localizedValues['sentToTV']!;
  String get sendFailed => _localizedValues['sendFailed']!;
  String get networkError => _localizedValues['networkError']!;
  String get uploading => _localizedValues['uploading']!;

  // Simple menu
  String get simpleMenu => _localizedValues['simpleMenu']!;
  String get simpleMenuSubtitle => _localizedValues['simpleMenuSubtitle']!;
  String get simpleMenuEnabled => _localizedValues['simpleMenuEnabled']!;
  String get simpleMenuDisabled => _localizedValues['simpleMenuDisabled']!;

  // Progress bar mode
  String get progressBarMode => _localizedValues['progressBarMode']!;
  String get progressBarModeSubtitle =>
      _localizedValues['progressBarModeSubtitle']!;
  String get progressBarModeAuto => _localizedValues['progressBarModeAuto']!;
  String get progressBarModeAlways =>
      _localizedValues['progressBarModeAlways']!;
  String get progressBarModeNever => _localizedValues['progressBarModeNever']!;
  String get progressBarModeAutoDesc =>
      _localizedValues['progressBarModeAutoDesc']!;
  String get progressBarModeAlwaysDesc =>
      _localizedValues['progressBarModeAlwaysDesc']!;
  String get progressBarModeNeverDesc =>
      _localizedValues['progressBarModeNeverDesc']!;
  String get progressBarModeSet => _localizedValues['progressBarModeSet']!;

  // Home display settings
  String get showWatchHistoryOnHome => _localizedValues['showWatchHistoryOnHome']!;
  String get showWatchHistoryOnHomeSubtitle => _localizedValues['showWatchHistoryOnHomeSubtitle']!;
  String get showFavoritesOnHome => _localizedValues['showFavoritesOnHome']!;
  String get showFavoritesOnHomeSubtitle => _localizedValues['showFavoritesOnHomeSubtitle']!;
  String get watchHistoryOnHomeEnabled => _localizedValues['watchHistoryOnHomeEnabled']!;
  String get watchHistoryOnHomeDisabled => _localizedValues['watchHistoryOnHomeDisabled']!;
  String get favoritesOnHomeEnabled => _localizedValues['favoritesOnHomeEnabled']!;
  String get favoritesOnHomeDisabled => _localizedValues['favoritesOnHomeDisabled']!;

  // Audio/Subtitle track selection
  String get audioTracks => _localizedValues['audioTracks']!;
  String get noAudioTracks => _localizedValues['noAudioTracks']!;
  String get subtitles => _localizedValues['subtitles']!;
  String get noSubtitleTracks => _localizedValues['noSubtitleTracks']!;
  String get disableSubtitles => _localizedValues['disableSubtitles']!;
  String get subtitlesDisabled => _localizedValues['subtitlesDisabled']!;
  // Offline downloads
  String get offlineDownloads => _localizedValues['offlineDownloads']!;
  String get downloadChannel => _localizedValues['downloadChannel']!;
  String get downloadStarted => _localizedValues['downloadStarted']!;
  String get downloading => _localizedValues['downloading']!;
  String get noOfflineRecordings => _localizedValues['noOfflineRecordings']!;
  String get offlineHint => _localizedValues['offlineHint']!;
  String get clearCompleted => _localizedValues['clearCompleted']!;
  String get recordLive => _localizedValues['recordLive']!;
  String get recordDuration => _localizedValues['recordDuration']!;
  String get record30min => _localizedValues['record30min']!;
  String get record1hour => _localizedValues['record1hour']!;
  String get record2hours => _localizedValues['record2hours']!;
  String get recordUnlimited => _localizedValues['recordUnlimited']!;

  // Map access for dynamic keys if needed
  String operator [](String key) => _localizedValues[key] ?? key;
}

class _AppStringsDelegate extends LocalizationsDelegate<AppStrings> {
  const _AppStringsDelegate();

  @override
    bool isSupported(Locale locale) => ['en', 'es'].contains(locale.languageCode);

  @override
  Future<AppStrings> load(Locale locale) {
    return SynchronousFuture<AppStrings>(
        AppStrings(locale, _getValues(locale)));
  }

  @override
  bool shouldReload(_AppStringsDelegate old) => false;

  Map<String, String> _getValues(Locale locale) {
        if (locale.languageCode == 'es') {
            return {
                ..._enValues,
                ..._esOverrides,
            };
    } else {
      return _enValues;
    }
  }

    static const Map<String, String> _esOverrides = {
        'language': 'Idioma',
        'general': 'General',
        'followSystem': 'Seguir sistema',
        'languageFollowSystem': 'Idioma configurado para seguir el sistema',
        'english': 'English',
        'chinese': 'Chinese',
        'theme': 'Tema',
        'themeDark': 'Oscuro',
        'themeLight': 'Claro',
        'themeSystem': 'Seguir sistema',
        'colorScheme': 'Esquema de color',
        'fontFamily': 'Fuente',
        'playback': 'Reproducción',
        'movies': 'Películas',
        'series': 'Series',
        'categories': 'Categorías',
        'allChannels': 'Todos',
        'channels': 'Canales',
        'live': 'En vivo',
        'noResultsFound': 'No se encontraron resultados',
        'loading': 'Cargando...',
        'buffering': 'Cargando búfer...',
        'upNext': 'Siguiente',
        'nowPlaying': 'En reproducción',
        'continueWatching': 'Continuar',
        'watchHistory': 'Historial',
        'myFavorites': 'Mis favoritos',
        'favorites': 'Favoritos',
        'search': 'Buscar',
        'settings': 'Configuración',
        'about': 'Acerca de',
        'platform': 'Plataforma',
        'version': 'Versión',
        'defaultVersion': 'Versión predeterminada',
        'refresh': 'Actualizar',
        'playlists': 'Listas',
        'managePlaylists': 'Administrar listas',
        'autoRefresh': 'Auto-actualización',
        'autoRefreshSubtitle': 'Actualizar listas periódicamente',
        'refreshInterval': 'Intervalo de actualización',
        'hours': 'horas',
        'days': 'días',
        'day': 'día',
        'rememberLastChannel': 'Recordar último canal',
        'rememberLastChannelSubtitle': 'Reanudar desde el último canal visto',
        'epg': 'Guía EPG',
        'enableEpg': 'Activar EPG',
        'enableEpgSubtitle': 'Mostrar programación de canales',
        'epgUrl': 'URL EPG',
        'notConfigured': 'No configurado',
        'checkUpdate': 'Buscar actualizaciones',
        'checkUpdateSubtitle': 'Comprobar si hay nueva versión disponible',
        'alreadyLatestVersion': 'Ya está actualizado',
        'checkUpdateFailed': 'Error al comprobar actualización: {error}',
        'newVersionAvailable': 'Nueva versión disponible',
        'resetAllSettings': 'Restablecer todos los ajustes',
        'resetSettingsSubtitle': 'Restaurar todos los ajustes a valores por defecto',
        'playlistImported': 'Lista importada correctamente',
        'playlistRefreshFailed': 'Error al refrescar la lista',
        'simpleMenu': 'Menú simple',
        'simpleMenuSubtitle': 'Mantener menú colapsado (sin auto-expansión)',
        'simpleMenuEnabled': 'Menú simple activado',
        'simpleMenuDisabled': 'Menú simple desactivado',
        'showWatchHistoryOnHome': 'Mostrar historial en inicio',
        'showWatchHistoryOnHomeSubtitle': 'Mostrar canales vistos recientemente en la pantalla principal',
        'watchHistoryOnHomeEnabled': 'Historial en inicio activado',
        'watchHistoryOnHomeDisabled': 'Historial en inicio desactivado',
        'showFavoritesOnHome': 'Mostrar favoritos en inicio',
        'showFavoritesOnHomeSubtitle': 'Mostrar canales favoritos en la pantalla principal',
        'favoritesOnHomeEnabled': 'Favoritos en inicio activado',
        'favoritesOnHomeDisabled': 'Favoritos en inicio desactivado',
        'developerAndDebug': 'Desarrollador y depuración',
        'logLevel': 'Nivel de logs',
        'logLevelSubtitle': 'Controla la cantidad de registros en consola y archivo',
        'logLevelDebug': 'Debug',
        'logLevelRelease': 'Release',
        'logLevelOff': 'Off',
        'logLevelDebugDesc': 'Muestra todos los logs de depuración',
        'logLevelReleaseDesc': 'Muestra solo logs importantes',
        'logLevelOffDesc': 'Desactiva completamente el registro',
        'exportLogs': 'Exportar logs',
        'exportLogsSubtitle': 'Escanea QR para ver o exportar archivos de logs',
        'clearLogs': 'Borrar logs',
        'clearLogsSubtitle': 'Eliminar todos los archivos de logs',
        'logFileLocation': 'Ubicación de logs',
        'logsCleared': 'Logs eliminados',
        'clearLogsConfirm': 'Borrar logs',
        'clearLogsConfirmMessage': '¿Seguro que quieres eliminar todos los archivos de logs?',
        'more': 'Más',
        'close': 'Cerrar',
        'success': 'Éxito',
        'error': 'Error',
        // Audio/Subtitle tracks
        'audioTracks': 'Pistas de audio',
        'noAudioTracks': 'No hay pistas de audio disponibles',
        'subtitles': 'Subtítulos',
        'noSubtitleTracks': 'No hay subtítulos disponibles',
        'disableSubtitles': 'Desactivar subtítulos',
        'subtitlesDisabled': 'Subtítulos desactivados',
        // Offline downloads
        'offlineDownloads': 'Descargas offline',
        'downloadChannel': 'Descargar canal',
        'downloadStarted': 'Descarga iniciada',
        'downloading': 'Descargando...',
        'noOfflineRecordings': 'No hay grabaciones guardadas',
        'offlineHint': 'Mantén pulsado un canal y toca "Descargar"',
        'clearCompleted': 'Limpiar completadas',
        'recordLive': 'Grabar canal en vivo',
        'recordDuration': 'Duración de grabación',
        'record30min': '30 minutos',
        'record1hour': '1 hora',
        'record2hours': '2 horas',
        'recordUnlimited': 'Hasta detener',
        'play': 'Reproducir',
    };

  static const Map<String, String> _zhValues = {
    'playlistManager': '',
    'playlistList': '',
    'goToHomeToAdd': '',
    'addNewPlaylist': '',
    'playlistName': '',
    'playlistUrl': 'M3U/M3U8/TXT ',
    'addFromUrl': '',
    'fromFile': '',
    'importing': '...',
    'noPlaylists': '',
    'addFirstPlaylist': '',
    'deletePlaylist': '',
    'deleteConfirmation': ' "{name}" ',
    'cancel': '',
    'delete': '',
    'actions': '',
    'settings': '',
    'language': '',
    'general': '',
    'followSystem': '',
    'languageFollowSystem': '',
    'theme': '',
    'themeDark': '',
    'themeLight': '',
    'themeSystem': '',
    'themeChanged': '',
    'fontFamily': '',
    'fontFamilyDesc': '',
    'fontChanged': ' {font}',
    'unknown': '',
    'save': '',
    'error': '',
    'success': '',
    'active': '',
    'refresh': '',
    'updated': '',
    'version': '',
    'categories': '',
    'allChannels': '',
    'channels': '',
    'noChannelsFound': '',
    'removeFavorites': '',
    'addFavorites': '',
    'channelInfo': '',
    'playback': '',
    'autoPlay': '',
    'autoPlaySubtitle': '',
    'hardwareDecoding': '',
    'hardwareDecodingSubtitle': '',
    'bufferSize': '',
    'seconds': '',
    'playlists': '',
    'autoRefresh': '',
    'autoRefreshSubtitle': '',
    'refreshInterval': '',
    'hours': '',
    'days': '',
    'day': '',
    'rememberLastChannel': '',
    'rememberLastChannelSubtitle': '',
    'epg': ' (EPG)',
    'enableEpg': ' EPG',
    'enableEpgSubtitle': '',
    'epgUrl': 'EPG ',
    'notConfigured': '',
    'parentalControl': '',
    'enableParentalControl': '',
    'enableParentalControlSubtitle': ' PIN ',
    'changePin': ' PIN ',
    'changePinSubtitle': ' PIN ',
    'about': '',
    'platform': '',
    'resetAllSettings': '',
    'resetSettingsSubtitle': '',
    'enterEpgUrl': ' EPG XMLTV ',
    'setPin': ' PIN ',
    'enterPin': ' 4  PIN ',
    'resetSettings': '',
    'resetConfirm': '',
    'reset': '',
    'pleaseEnterPlaylistName': '',
    'pleaseEnterPlaylistUrl': '',
    'playlistAdded': ' "{name}"',
    'playlistRefreshed': '',
    'playlistRefreshFailed': '',
    'playlistDeleted': '',
    'playlistImported': '',
    'urlCopied': 'URL',
    'errorPickingFile': ': {error}',
    'minutesAgo': '',
    'hoursAgo': '',
    'daysAgo': '',
    'live': '',
    'buffering': '...',
    'paused': '',
    'loading': '...',
    'playbackError': '',
    'retry': '',
    'goBack': '',
    'playbackSettings': '',
    'playbackSpeed': '',
    'shortcutsHint': '/:  • /:  • : / • M: ',
    'lotusIptv': 'VoXtv',
    'professionalIptvPlayer': ' IPTV ',
    'searchChannels': '',
    'searchHint': '...',
    'typeToSearch': '',
    'popularCategories': '',
    'sports': '',
    'movies': '',
    'series': '',
    'news': '',
    'music': '',
    'kids': '',
    'noResultsFound': '',
    'noChannelsMatch': ' "{query}" ',
    'resultsFor': ' "{query}" : {count} ',
    'favorites': '',
    'clearAll': '',
    'noFavoritesYet': '',
    'favoritesHint': '',
    'noProgramInfo': '',
    'browseChannels': '',
    'removedFromFavorites': ' "{name}"',
    'undo': '',
    'clearAllFavorites': '',
    'clearFavoritesConfirm': '',
    'allFavoritesCleared': '',
    'home': '',
    'managePlaylists': '',
    'noPlaylistsYet': '',
    'addFirstPlaylistHint': ' M3U ',
    'addPlaylist': '',
    'totalChannels': '',
    // New translations
    'volumeNormalization': '',
    'volumeNormalizationSubtitle': '',
    'volumeBoost': '',
    'noBoost': '',
    'checkUpdate': '',
    'checkUpdateSubtitle': '',
    'decodingMode': '',
    'decodingModeAuto': '',
    'decodingModeHardware': '',
    'decodingModeSoftware': '',
    'decodingModeAutoDesc': '',
    'decodingModeHardwareDesc': '',
    'decodingModeSoftwareDesc': 'CPU',
    'channelMergeRule': '',
    'channelMergeRuleSubtitle': '',
    'channelMergeRuleSet': '{rule}',
    'mergeByName': '',
    'mergeByNameDesc': '',
    'mergeByNameGroup': '+',
    'mergeByNameGroupDesc': '',
    'volumeBoostLow': '',
    'volumeBoostSlightLow': '',
    'volumeBoostNormal': '',
    'volumeBoostSlightHigh': '',
    'volumeBoostHigh': '',
    'chinese': '',
    'english': '',
    'scanToImport': '',
    'importingPlaylist': '',
    'importSuccess': '',
    'importFailed': '',
    'serverStartFailed': '',
    'processing': '...',
    'testChannel': '',
    'unavailable': '',
    'localFile': '',
    // Home screen
    'recommendedChannels': '',
    'watchHistory': '',
    'myFavorites': '',
    'continueWatching': '',
    'channelStats': '{channels}  · {categories}  · {favorites} ',
    'noPlaylistYet': '',
    'addM3uToStart': ' M3U ',
    'search': '',
    // Player hints
    'playerHintTV': '↑↓  · ←→  · ←  · OK / · OK ',
    'playerHintDesktop': '/:  · /:  · : / · M: ',
    // More UI strings
    'more': '',
    'close': '',
    'startingServer': '...',
    'selectM3uFile': 'M3U/M3U8/TXT',
    'noFileSelected': 'USB',
    'epgAutoApplied': 'EPG',
    'addFirstPlaylistTV': 'USB',
    'addPlaylistSubtitle': ' M3U/M3U8  URL ',
    'importFromUsb': 'USB',
    'scanQrToImport': '',
    'playlistUrlHint': 'M3U/M3U8/TXT ',
    'qrStep1': '',
    'qrStep2': '',
    'qrStep3': '',
    'qrSearchStep1': '',
    'qrSearchStep2': '',
    'qrSearchStep3': '',
    'scanToSearch': '',
    // Player gestures and EPG
    'nextChannel': '',
    'previousChannel': '',
    'source': '',
    'nowPlaying': '',
    'endsInMinutes': '{minutes}',
    'upNext': '',
    // Update dialog
    'newVersionAvailable': '',
    'whatsNew': '',
    'updateLater': '',
    'updateNow': '',
    'noReleaseNotes': '',
    // Settings messages
    'autoPlayEnabled': '',
    'autoPlayDisabled': '',
    'bufferStrength': '',
    'showFps': ' FPS',
    'showFpsSubtitle': '',
    'fpsEnabled': ' FPS ',
    'fpsDisabled': ' FPS ',
    'showClock': '',
    'showClockSubtitle': '',
    'clockEnabled': '',
    'clockDisabled': '',
    'showNetworkSpeed': '',
    'showNetworkSpeedSubtitle': '',
    'networkSpeedEnabled': '',
    'networkSpeedDisabled': '',
    'showVideoInfo': '',
    'showVideoInfoSubtitle': '',
    'videoInfoEnabled': '',
    'videoInfoDisabled': '',
    'enableMultiScreen': '',
    'enableMultiScreenSubtitle': '2x2',
    'multiScreenEnabled': '',
    'multiScreenDisabled': '',
    'showMultiScreenChannelName': '',
    'showMultiScreenChannelNameSubtitle': '',
    'multiScreenChannelNameEnabled': '',
    'multiScreenChannelNameDisabled': '',
    'defaultScreenPosition': '',
    'screenPosition1': ' (1)',
    'screenPosition2': ' (2)',
    'screenPosition3': ' (3)',
    'screenPosition4': ' (4)',
    'screenPositionDesc': '',
    'screenPositionSet': '{position}',
    'multiScreenMode': '',
    // Multi-screen player strings
    'backToPlayer': '',
    'miniMode': '',
    'exitMultiScreen': '',
    'screenNumber': ' {number}',
    'clickToAddChannel': '',
    'selectChannel': '',
    // Channel test and update strings
    'collapse': '',
    'channelCountLabel': '{count} ',
    'showOnlyFailed': ' ({count})',
    'moveToUnavailable': '',
    'stopTest': '',
    'startTest': '',
    'complete': '',
    'runInBackground': '',
    'movedToUnavailable': ' {count} ',
    'checkingUpdate': '...',
    'alreadyLatestVersion': '',
    'checkUpdateFailed': ': {error}',
    'updateFailed': ': {error}',
    'downloadUpdate': '',
    'downloadFailed': ': {error}',
    'downloadComplete': '',
    'runInstallerNow': '',
    'later': '',
    'installNow': '',
    'deletedChannels': ' {count} ',
    'testing': ': {name}',
    'channelAvailableRestored': '{name}  "{group}" ',
    'testingInBackground': ' {count} ',
    'restoredToCategory': ' {name} ',
    'dlnaCast': 'DLNA ',
    'notImplemented': '()',
    'volumeNormalizationNotImplemented': '',
    'autoRefreshNotImplemented': '',
    'rememberLastChannelEnabled': '',
    'rememberLastChannelDisabled': '',
    'epgEnabledAndLoaded': 'EPG ',
    'epgEnabledButFailed': 'EPG ',
    'epgEnabledPleaseConfigure': 'EPG  EPG ',
    'epgDisabled': 'EPG ',
    'weak': '',
    'medium': '',
    'strong': '',
    // More settings messages
    'dlnaCasting': 'DLNA ',
    'enableDlnaService': ' DLNA ',
    'dlnaServiceStarted': ': {deviceName}',
    'allowOtherDevicesToCast': '',
    'dlnaServiceStartedMsg': 'DLNA ',
    'dlnaServiceStoppedMsg': 'DLNA ',
    'dlnaServiceStartFailed': 'DLNA ',
    'parentalControlNotImplemented': '',
    'changePinNotImplemented': '()',
    'decodingModeSet': ': {mode}',
    'videoOutput': '',
    'videoOutputAuto': '',
    'videoOutputLibmpv': 'libmpv',
    'videoOutputGpu': 'GPU',
    'videoOutputAutoDesc': '',
    'videoOutputLibmpvDesc': ' libmpv ',
    'videoOutputGpuDesc': ' GPU ',
    'videoOutputSet': ': {mode}',
    'windowsHwdecMode': 'Windows ',
    'windowsHwdecModeSet': 'Windows : {mode}',
    'windowsHwdecAutoSafe': '',
    'windowsHwdecAutoCopy': '',
    'windowsHwdecD3d11va': 'D3D11VA',
    'windowsHwdecDxva2': 'DXVA2',
    'windowsHwdecAutoSafeDesc': '',
    'windowsHwdecAutoCopyDesc': '',
    'windowsHwdecD3d11vaDesc': ' D3D11VA',
    'windowsHwdecDxva2Desc': ' DXVA2',
    'allowSoftwareFallback': '',
    'allowSoftwareFallbackDesc': '',
    'allowSoftwareFallbackEnabled': '',
    'allowSoftwareFallbackDisabled': '',
    'fastBuffer': ' ()',
    'balancedBuffer': '',
    'stableBuffer': ' ()',
    'bufferSizeNotImplemented': '',
    'volumeBoostSet': ' {value}',
    'noBoostValue': '',
    'epgUrlSavedAndLoaded': 'EPG ',
    'epgUrlSavedButFailed': 'EPG ',
    'epgUrlCleared': 'EPG ',
    'epgUrlSaved': 'EPG ',
    'pinNotImplemented': 'PIN ',
    'enter4DigitPin': '4PIN',
    'allSettingsReset': '',
    'languageSwitchedToChinese': '',
    'languageSwitchedToEnglish': '',
    'themeChangedMessage': ': {theme}',
    'defaultVersion': '',
    // Color scheme strings
    'colorScheme': '',
    'selectColorScheme': '',
    'colorSchemeLotus': '',
    'colorSchemeOcean': '',
    'colorSchemeForest': '',
    'colorSchemeSunset': '',
    'colorSchemeLavender': '',
    'colorSchemeMidnight': '',
    'colorSchemeLotusLight': '',
    'colorSchemeSky': '',
    'colorSchemeSpring': '',
    'colorSchemeCoral': '',
    'colorSchemeViolet': '',
    'colorSchemeClassic': '',
    'colorSchemeDescLotus': '',
    'colorSchemeDescOcean': '',
    'colorSchemeDescForest': '',
    'colorSchemeDescSunset': '',
    'colorSchemeDescLavender': '',
    'colorSchemeDescMidnight': '',
    'colorSchemeDescLotusLight': '',
    'colorSchemeDescSky': '',
    'colorSchemeDescSpring': '',
    'colorSchemeDescCoral': '',
    'colorSchemeDescViolet': '',
    'colorSchemeDescClassic': '',
    'colorSchemeChanged': ': {scheme}',
    'customColorPicker': '',
    'selectedColor': '',
    'apply': '',
    'customColorApplied': '',
    'colorSchemeCustom': '',
    // Local server web page strings
    'importPlaylistTitle': '',
    'importPlaylistSubtitle': '',
    'importFromUrlTitle': '',
    'importFromFileTitle': '',
    'playlistNameOptional': '',
    'enterPlaylistUrl': ' M3U/M3U8/TXT ',
    'importUrlButton': '',
    'selectFile': '',
    'fileNameOptional': '',
    'fileUploadButton': '',
    'or': '',
    'pleaseEnterUrl': '',
    'sentToTV': '',
    'sendFailed': '',
    'networkError': '',
    'uploading': '...',
    // Simple menu
    'simpleMenu': '',
    'simpleMenuSubtitle': '',
    'simpleMenuEnabled': '',
    'simpleMenuDisabled': '',
    // Progress bar mode
    'progressBarMode': '',
    'progressBarModeSubtitle': '',
    'progressBarModeAuto': '',
    'progressBarModeAlways': '',
    'progressBarModeNever': '',
    'progressBarModeAutoDesc': '/',
    'progressBarModeAlwaysDesc': '',
    'progressBarModeNeverDesc': '',
    'progressBarModeSet': '{mode}',

    // Home display settings
    'showWatchHistoryOnHome': '',
    'showWatchHistoryOnHomeSubtitle': '',
    'showFavoritesOnHome': '',
    'showFavoritesOnHomeSubtitle': '',
    'watchHistoryOnHomeEnabled': '',
    'watchHistoryOnHomeDisabled': '',
    'favoritesOnHomeEnabled': '',
    'favoritesOnHomeDisabled': '',

    // Developer and debug settings
    'developerAndDebug': '',
    'logLevel': '',
    'logLevelSubtitle': '',
    'logLevelDebug': '',
    'logLevelRelease': '',
    'logLevelOff': '',
    'logLevelDebugDesc': '',
    'logLevelReleaseDesc': '',
    'logLevelOffDesc': '',
    'exportLogs': '',
    'exportLogsSubtitle': '',
    'clearLogs': '',
    'clearLogsSubtitle': '',
    'logFileLocation': '',
    'logsCleared': '',
    'clearLogsConfirm': '',
    'clearLogsConfirmMessage': '',
    'errorTimeout': '',
    'errorNetwork': '',
    'usingCachedSource': '',
  };

  static const Map<String, String> _enValues = {
    'playlistManager': 'Playlist Manager',
    'playlistList': 'Sources',
    'goToHomeToAdd': 'Go to Home to add playlists',
    'addNewPlaylist': 'Add New Playlist',
    'playlistName': 'Playlist Name',
    'playlistUrl': 'M3U/M3U8/TXT URL',
    'addFromUrl': 'Add from URL',
    'fromFile': 'From File',
    'importing': 'Importing...',
    'noPlaylists': 'No Playlists',
    'addFirstPlaylist': 'Add your first playlist above',
    'deletePlaylist': 'Delete Playlist',
    'deleteConfirmation':
        'Are you sure you want to delete "{name}"? This will also remove all channels from this playlist.',
    'cancel': 'Cancel',
    'delete': 'Delete',
    'actions': 'Actions',
    'settings': 'Settings',
    'language': 'Language',
    'general': 'General',
    'followSystem': 'Follow System',
    'languageFollowSystem': 'Set to follow system language',
    'theme': 'Theme',
    'themeDark': 'Dark',
    'themeLight': 'Light',
    'themeSystem': 'Follow System',
    'themeChanged': 'Theme changed',
    'fontFamily': 'Font Family',
    'fontFamilyDesc': 'Choose application display font',
    'fontChanged': 'Font changed to {font}',
    'unknown': 'Unknown',
    'save': 'Save',
    'error': 'Error',
    'success': 'Success',
    'active': 'ACTIVE',
    'refresh': 'Refresh',
    'updated': 'Updated',
    'version': 'Version',
    'categories': 'Categories',
    'allChannels': 'All Channels',
    'channels': 'channels',
    'noChannelsFound': 'No channels found',
    'removeFavorites': 'Remove from Favorites',
    'addFavorites': 'Add to Favorites',
    'channelInfo': 'Channel Info',
    'playback': 'Playback',
    'autoPlay': 'Auto-play on Startup',
    'autoPlaySubtitle':
        'Automatically continue playing last watched content when app starts',
    'hardwareDecoding': 'Hardware Decoding',
    'hardwareDecodingSubtitle': 'Use hardware acceleration for video playback',
    'bufferSize': 'Buffer Size',
    'seconds': 'seconds',
    'playlists': 'Playlists',
    'autoRefresh': 'Auto-refresh',
    'autoRefreshSubtitle': 'Automatically update playlists periodically',
    'refreshInterval': 'Refresh Interval',
    'hours': 'hours',
    'days': 'days',
    'day': 'day',
    'rememberLastChannel': 'Remember Last Channel',
    'rememberLastChannelSubtitle': 'Resume playback from last watched channel',
    'epg': 'EPG (Electronic Program Guide)',
    'enableEpg': 'Enable EPG',
    'enableEpgSubtitle': 'Show program information for channels',
    'epgUrl': 'EPG URL',
    'notConfigured': 'Not configured',
    'parentalControl': 'Parental Control',
    'enableParentalControl': 'Enable Parental Control',
    'enableParentalControlSubtitle': 'Require PIN to access certain content',
    'changePin': 'Change PIN',
    'changePinSubtitle': 'Update your parental control PIN',
    'about': 'About',
    'platform': 'Platform',
    'resetAllSettings': 'Reset All Settings',
    'resetSettingsSubtitle': 'Restore all settings to default values',
    'enterEpgUrl': 'Enter EPG XMLTV URL',
    'setPin': 'Set PIN',
    'enterPin': 'Enter 4-digit PIN',
    'resetSettings': 'Reset Settings',
    'resetConfirm':
        'Are you sure you want to reset all settings to their default values?',
    'reset': 'Reset',
    'pleaseEnterPlaylistName': 'Please enter a playlist name',
    'pleaseEnterPlaylistUrl': 'Please enter a playlist URL',
    'playlistAdded': 'Added "{name}"',
    'playlistRefreshed': 'Playlist refreshed successfully',
    'playlistRefreshFailed': 'Failed to refresh playlist',
    'playlistDeleted': 'Playlist deleted',
    'playlistImported': 'Playlist imported successfully',
    'urlCopied': 'URL copied to clipboard',
    'errorPickingFile': 'Error picking file: {error}',
    'minutesAgo': 'm ago',
    'hoursAgo': 'h ago',
    'daysAgo': 'd ago',
    'live': 'LIVE',
    'buffering': 'Buffering...',
    'paused': 'Paused',
    'loading': 'Loading...',
    'playbackError': 'Playback Error',
    'retry': 'Retry',
    'goBack': 'Go Back',
    'playbackSettings': 'Playback Settings',
    'playbackSpeed': 'Playback Speed',
    'shortcutsHint':
        'Left/Right: Seek • Up/Down: Change Channel • Enter: Play/Pause • M: Mute',
    'lotusIptv': 'VoXtv',
    'professionalIptvPlayer': 'Professional IPTV Player',
    'searchChannels': 'Search Channels',
    'searchHint': 'Search channels...',
    'typeToSearch': 'Type to search by channel name or category',
    'popularCategories': 'Popular Categories',
    'sports': 'Sports',
    'movies': 'Movies',
    'series': 'Series',
    'news': 'News',
    'music': 'Music',
    'kids': 'Kids',
    'noResultsFound': 'No Results Found',
    'noChannelsMatch': 'No channels match "{query}"',
    'resultsFor': '{count} result(s) for "{query}"',
    'favorites': 'Favorites',
    'clearAll': 'Clear All',
    'noFavoritesYet': 'No Favorites Yet',
    'favoritesHint': 'Long press on a channel to add it to favorites',
    'noProgramInfo': 'No Program Info',
    'browseChannels': 'Browse Channels',
    'removedFromFavorites': 'Removed "{name}" from favorites',
    'undo': 'Undo',
    'clearAllFavorites': 'Clear All Favorites',
    'clearFavoritesConfirm':
        'Are you sure you want to remove all channels from your favorites?',
    'allFavoritesCleared': 'All favorites cleared',
    'home': 'Home',
    'managePlaylists': 'Manage Playlists',
    'noPlaylistsYet': 'No Playlists Yet',
    'addFirstPlaylistHint': 'Add your first M3U playlist to start watching',
    'addPlaylist': 'Add Playlist',
    'totalChannels': 'Total Channels',
    // New translations
    'volumeNormalization': 'Volume Normalization',
    'volumeNormalizationSubtitle':
        'Auto-adjust volume differences between channels',
    'volumeBoost': 'Volume Boost',
    'noBoost': 'No boost',
    'checkUpdate': 'Check for Updates',
    'checkUpdateSubtitle': 'Check if a new version is available',
    'decodingMode': 'Decoding Mode',
    'decodingModeAuto': 'Auto',
    'decodingModeHardware': 'Hardware',
    'decodingModeSoftware': 'Software',
    'decodingModeAutoDesc': 'Automatically choose best option. Recommended.',
    'decodingModeHardwareDesc':
        'Force MediaCodec. May cause errors on some devices.',
    'decodingModeSoftwareDesc':
        'Use CPU decoding. More compatible but uses more power.',
    'channelMergeRule': 'Channel Merge Rule',
    'channelMergeRuleSubtitle': 'Control how duplicate channels are merged',
    'channelMergeRuleSet': 'Channel merge rule set to: {rule}',
    'mergeByName': 'Merge by Name',
    'mergeByNameDesc': 'Merge channels with same name across all groups',
    'mergeByNameGroup': 'Merge by Name + Group',
    'mergeByNameGroupDesc': 'Only merge channels with same name AND group',
    'volumeBoostLow': 'Significantly lower volume',
    'volumeBoostSlightLow': 'Slightly lower volume',
    'volumeBoostNormal': 'Keep original volume',
    'volumeBoostSlightHigh': 'Slightly higher volume',
    'volumeBoostHigh': 'Significantly higher volume',
    'chinese': '',
    'english': 'English',
    'scanToImport': 'Scan to Import Playlist',
    'importingPlaylist': 'Importing',
    'importSuccess': 'Import successful',
    'importFailed': 'Import failed',
    'serverStartFailed':
        'Failed to start local server. Please check network connection.',
    'processing': 'Processing, please wait...',
    'testChannel': 'Test Channel',
    'unavailable': 'Unavailable',
    'localFile': 'Local File',
    // Home screen
    'recommendedChannels': 'Recommended',
    'watchHistory': 'Watch History',
    'myFavorites': 'My Favorites',
    'continueWatching': 'Continue Watching',
    'channelStats':
        '{channels} channels · {categories} categories · {favorites} favorites',
    'noPlaylistYet': 'No Playlists Yet',
    'addM3uToStart': 'Add M3U playlist to start watching',
    'search': 'Search',
    // Player hints
    'playerHintTV':
        '↑↓ Switch Channel · ←→ Switch Source · Hold← Categories · OK Play/Pause · Hold OK Favorite',
    'playerHintDesktop':
        'Left/Right: Seek · Up/Down: Switch · Enter: Play/Pause · M: Mute',
    // More UI strings
    'more': 'More',
    'close': 'Close',
    'startingServer': 'Starting server...',
    'selectM3uFile': 'Please select a playlist file (M3U/M3U8/TXT)',
    'noFileSelected':
        'No file selected. Please ensure your device has USB storage or network storage configured.',
    'epgAutoApplied': 'EPG source auto-applied',
    'addFirstPlaylistTV': 'Import via USB or scan QR code',
    'addPlaylistSubtitle': 'Import M3U/M3U8 playlist from URL or file',
    'importFromUsb': 'Import from USB or local storage',
    'scanQrToImport': 'Use your phone to scan QR code',
    'playlistUrlHint': 'M3U/M3U8/TXT URL',
    'qrStep1': 'Scan the QR code with your phone',
    'qrStep2': 'Enter URL or upload file on the webpage',
    'qrStep3': 'Click import, TV receives automatically',
    'qrSearchStep1': 'Scan the QR code with your phone',
    'qrSearchStep2': 'Enter search query on the webpage',
    'qrSearchStep3': 'Results will appear on TV automatically',
    'scanToSearch': 'Scan to Search',
    // Player gestures and EPG
    'nextChannel': 'Next channel',
    'previousChannel': 'Previous channel',
    'source': 'Source',
    'nowPlaying': 'Now playing',
    'endsInMinutes': 'Ends in {minutes} min',
    'upNext': 'Up next',
    // Update dialog
    'newVersionAvailable': 'New version available',
    'whatsNew': 'What\'s new',
    'updateLater': 'Update later',
    'updateNow': 'Update now',
    'noReleaseNotes': 'No release notes',
    // Settings messages
    'autoPlayEnabled': 'Auto-play on startup enabled',
    'autoPlayDisabled': 'Auto-play on startup disabled',
    'bufferStrength': 'Buffer Strength',
    'showFps': 'Show FPS',
    'showFpsSubtitle': 'Show frame rate in top-right corner of player',
    'fpsEnabled': 'FPS display enabled',
    'fpsDisabled': 'FPS display disabled',
    'showClock': 'Show Clock',
    'showClockSubtitle': 'Show current time in top-right corner of player',
    'clockEnabled': 'Clock display enabled',
    'clockDisabled': 'Clock display disabled',
    'showNetworkSpeed': 'Show Network Speed',
    'showNetworkSpeedSubtitle':
        'Show download speed in top-right corner of player',
    'networkSpeedEnabled': 'Network speed display enabled',
    'networkSpeedDisabled': 'Network speed display disabled',
    'showVideoInfo': 'Show Resolution',
    'showVideoInfoSubtitle':
        'Show video resolution and bitrate in top-right corner',
    'videoInfoEnabled': 'Resolution display enabled',
    'videoInfoDisabled': 'Resolution display disabled',
    'enableMultiScreen': 'Multi-Screen Mode',
    'enableMultiScreenSubtitle':
        'Enable 2x2 split screen for simultaneous viewing',
    'multiScreenEnabled': 'Multi-screen mode enabled',
    'multiScreenDisabled': 'Multi-screen mode disabled',
    'showMultiScreenChannelName': 'Show Channel Names',
    'showMultiScreenChannelNameSubtitle':
        'Display channel names in multi-screen playback',
    'multiScreenChannelNameEnabled':
        'Multi-screen channel name display enabled',
    'multiScreenChannelNameDisabled':
        'Multi-screen channel name display disabled',
    'defaultScreenPosition': 'Default Screen Position',
    'screenPosition1': 'Top Left (1)',
    'screenPosition2': 'Top Right (2)',
    'screenPosition3': 'Bottom Left (3)',
    'screenPosition4': 'Bottom Right (4)',
    'screenPositionDesc':
        'Choose which screen position to use by default when clicking a channel:',
    'screenPositionSet': 'Default screen position set to: {position}',
    'multiScreenMode': 'Multi-Screen Mode',
    // Multi-screen player strings
    'backToPlayer': 'Back',
    'miniMode': 'Mini Mode',
    'exitMultiScreen': 'Exit Multi-Screen',
    'screenNumber': 'Screen {number}',
    'clickToAddChannel': 'Click to add channel',
    'selectChannel': 'Select Channel',
    // Channel test and update strings
    'collapse': 'Collapse',
    'channelCountLabel': '{count} channels',
    'showOnlyFailed': 'Show only failed ({count})',
    'moveToUnavailable': 'Move to Unavailable',
    'stopTest': 'Stop Test',
    'startTest': 'Start Test',
    'complete': 'Complete',
    'runInBackground': 'Run in Background',
    'movedToUnavailable':
        'Moved {count} unavailable channels to Unavailable category',
    'checkingUpdate': 'Checking for updates...',
    'alreadyLatestVersion': 'Already up to date',
    'checkUpdateFailed': 'Check update failed: {error}',
    'updateFailed': 'Update failed: {error}',
    'downloadUpdate': 'Download Update',
    'downloadFailed': 'Download failed: {error}',
    'downloadComplete': 'Download Complete',
    'runInstallerNow': 'Run installer now?',
    'later': 'Later',
    'installNow': 'Install Now',
    'deletedChannels': 'Deleted {count} unavailable channels',
    'testing': 'Testing: {name}',
    'channelAvailableRestored':
        '{name} available, restored to "{group}" category',
    'testingInBackground': 'Testing in background, {count} channels remaining',
    'restoredToCategory': 'Restored {name} to original category',
    'dlnaCast': 'DLNA Cast',
    'notImplemented': '(Not implemented)',
    'volumeNormalizationNotImplemented':
        'Volume normalization not implemented, setting will not take effect',
    'autoRefreshNotImplemented':
        'Auto-refresh not implemented, setting will not take effect',
    'rememberLastChannelEnabled': 'Remember last channel enabled',
    'rememberLastChannelDisabled': 'Remember last channel disabled',
    'epgEnabledAndLoaded': 'EPG enabled and loaded successfully',
    'epgEnabledButFailed': 'EPG enabled but failed to load',
    'epgEnabledPleaseConfigure': 'EPG enabled, please configure EPG URL',
    'epgDisabled': 'EPG disabled',
    'weak': 'Weak',
    'medium': 'Medium',
    'strong': 'Strong',
    // More settings messages
    'dlnaCasting': 'DLNA Casting',
    'enableDlnaService': 'Enable DLNA Service',
    'dlnaServiceStarted': 'Started: {deviceName}',
    'allowOtherDevicesToCast': 'Allow other devices to cast to this device',
    'dlnaServiceStartedMsg': 'DLNA service started',
    'dlnaServiceStoppedMsg': 'DLNA service stopped',
    'dlnaServiceStartFailed':
        'Failed to start DLNA service, please check network connection',
    'parentalControlNotImplemented':
        'Parental control not implemented, setting will not take effect',
    'changePinNotImplemented': '(Not implemented)',
    'decodingModeSet': 'Decoding mode set to: {mode}',
    'videoOutput': 'Video Output',
    'videoOutputAuto': 'Auto (Embedded)',
    'videoOutputLibmpv': 'libmpv (Embedded)',
    'videoOutputGpu': 'GPU (External Window)',
    'videoOutputAutoDesc': 'Default embedded output (recommended)',
    'videoOutputLibmpvDesc': 'Use libmpv embedded renderer (recommended)',
    'videoOutputGpuDesc': 'Use GPU output; may open a separate window',
    'videoOutputSet': 'Video output set to: {mode}',
    'windowsHwdecMode': 'Windows HW Decoder',
    'windowsHwdecModeSet': 'Windows HW decode set to: {mode}',
    'windowsHwdecAutoSafe': 'Auto (Safe)',
    'windowsHwdecAutoCopy': 'Auto (Copy)',
    'windowsHwdecD3d11va': 'D3D11VA',
    'windowsHwdecDxva2': 'DXVA2',
    'windowsHwdecAutoSafeDesc':
        'Recommended. Only use safe hardware decoders.',
    'windowsHwdecAutoCopyDesc':
        'More compatible, but slower due to copy-back.',
    'windowsHwdecD3d11vaDesc': 'Prefer D3D11VA. Can fail on some GPUs.',
    'windowsHwdecDxva2Desc': 'Prefer DXVA2. Legacy path for older GPUs.',
    'allowSoftwareFallback': 'Allow Software Fallback',
    'allowSoftwareFallbackDesc':
        'If hardware decode fails, automatically switch to software decoding.',
    'allowSoftwareFallbackEnabled': 'Software fallback enabled',
    'allowSoftwareFallbackDisabled': 'Software fallback disabled',
    'fastBuffer': 'Fast (Quick switching, may stutter)',
    'balancedBuffer': 'Balanced',
    'stableBuffer': 'Stable (Slow switching, less stuttering)',
    'bufferSizeNotImplemented':
        'Buffer size setting not implemented, setting will not take effect',
    'volumeBoostSet': 'Volume boost set to {value}',
    'noBoostValue': 'No boost',
    'epgUrlSavedAndLoaded': 'EPG URL saved and loaded successfully',
    'epgUrlSavedButFailed': 'EPG URL saved but failed to load',
    'epgUrlCleared': 'EPG URL cleared',
    'epgUrlSaved': 'EPG URL saved',
    'pinNotImplemented':
        'Parental control not implemented, PIN setting will not take effect',
    'enter4DigitPin': 'Please enter 4-digit PIN',
    'allSettingsReset': 'All settings have been reset to default values',
    'languageSwitchedToChinese': 'Language switched to Chinese',
    'languageSwitchedToEnglish': 'Language switched to English',
    'themeChangedMessage': 'Theme changed: {theme}',
    'defaultVersion': 'Default version',
    // Color scheme strings
    'colorScheme': 'Color Scheme',
    'selectColorScheme': 'Select Color Scheme',
    'colorSchemeLotus': 'Lotus',
    'colorSchemeOcean': 'Ocean',
    'colorSchemeForest': 'Forest',
    'colorSchemeSunset': 'Sunset',
    'colorSchemeLavender': 'Lavender',
    'colorSchemeMidnight': 'Midnight',
    'colorSchemeLotusLight': 'Lotus Light',
    'colorSchemeSky': 'Sky',
    'colorSchemeSpring': 'Spring',
    'colorSchemeCoral': 'Coral',
    'colorSchemeViolet': 'Violet',
    'colorSchemeClassic': 'Classic',
    'colorSchemeDescLotus': 'Elegant, modern, brand color',
    'colorSchemeDescOcean': 'Calm, professional, eye-friendly',
    'colorSchemeDescForest': 'Natural, comfortable, eye-friendly',
    'colorSchemeDescSunset': 'Warm, energetic, eye-catching',
    'colorSchemeDescLavender': 'Mysterious, noble, soft',
    'colorSchemeDescMidnight': 'Deep, focused, low-key',
    'colorSchemeDescLotusLight': 'Elegant, modern, brand color',
    'colorSchemeDescSky': 'Fresh, bright, comfortable',
    'colorSchemeDescSpring': 'Vibrant, energetic, eye-friendly',
    'colorSchemeDescCoral': 'Warm, friendly, eye-catching',
    'colorSchemeDescViolet': 'Elegant, soft, noble',
    'colorSchemeDescClassic': 'Simple, professional, universal',
    'colorSchemeChanged': 'Color scheme changed to: {scheme}',
    'customColorPicker': 'Custom Color Picker',
    'selectedColor': 'Selected Color',
    'apply': 'Apply',
    'customColorApplied': 'Custom color applied',
    'colorSchemeCustom': 'Custom',
    // Local server web page strings
    'importPlaylistTitle': 'Import Playlist',
    'importPlaylistSubtitle': 'Import playlist to your TV',
    'importFromUrlTitle': 'Import from URL',
    'importFromFileTitle': 'Import from File',
    'playlistNameOptional': 'Playlist name (optional)',
    'enterPlaylistUrl': 'Please enter M3U/M3U8/TXT URL',
    'importUrlButton': 'Import URL',
    'selectFile': 'Select File',
    'fileNameOptional': 'Playlist name (optional)',
    'fileUploadButton': 'Upload File',
    'or': 'or',
    'pleaseEnterUrl': 'Please enter URL',
    'sentToTV': 'Sent to TV, please check on your TV',
    'sendFailed': 'Send failed',
    'networkError':
        'Network error, please ensure devices are on the same network',
    'uploading': 'Uploading...',
    // Simple menu
    'simpleMenu': 'Simple Menu',
    'simpleMenuSubtitle': 'Keep menu collapsed (no auto-expand)',
    'simpleMenuEnabled': 'Simple menu enabled',
    'simpleMenuDisabled': 'Simple menu disabled',
    // Progress bar mode
    'progressBarMode': 'Progress Bar Display',
    'progressBarModeSubtitle':
        'Control how the playback progress bar is displayed',
    'progressBarModeAuto': 'Auto Detect',
    'progressBarModeAlways': 'Always Show',
    'progressBarModeNever': 'Never Show',
    'progressBarModeAutoDesc':
        'Auto show based on content type (VOD/replay show, live hide)',
    'progressBarModeAlwaysDesc': 'Show progress bar for all content',
    'progressBarModeNeverDesc': 'Never show progress bar',
    'progressBarModeSet': 'Progress bar display set to: {mode}',

    // Home display settings
    'showWatchHistoryOnHome': 'Show Watch History on Home',
    'showWatchHistoryOnHomeSubtitle': 'Display recently watched channels on home screen',
    'showFavoritesOnHome': 'Show Favorites on Home',
    'showFavoritesOnHomeSubtitle': 'Display favorite channels on home screen',
    'watchHistoryOnHomeEnabled': 'Watch history on home enabled',
    'watchHistoryOnHomeDisabled': 'Watch history on home disabled',
    'favoritesOnHomeEnabled': 'Favorites on home enabled',
    'favoritesOnHomeDisabled': 'Favorites on home disabled',

    // Developer and debug settings
    'developerAndDebug': 'Developer & Debug',
    'logLevel': 'Log Level',
    'logLevelSubtitle': 'Select logging level',
    'logLevelDebug': 'Debug',
    'logLevelRelease': 'Release',
    'logLevelOff': 'Off',
    'logLevelDebugDesc': 'Log everything for development and debugging',
    'logLevelReleaseDesc': 'Only log warnings and errors (recommended)',
    'logLevelOffDesc': 'Do not log anything',
    'exportLogs': 'Export Logs',
    'exportLogsSubtitle': 'Scan QR to view or export log files',
    'clearLogs': 'Clear Logs',
    'clearLogsSubtitle': 'Delete all log files',
    'logFileLocation': 'Log File Location',
    'logsCleared': 'Logs cleared',
    'clearLogsConfirm': 'Clear Logs',
    'clearLogsConfirmMessage': 'Are you sure you want to delete all log files?',
    'errorTimeout': 'Connection timeout, please check network or URL',
    'errorNetwork': 'Network connection failed, please check network',
    'usingCachedSource': 'Remote source unavailable, using cached source',
    // Audio/Subtitle tracks
    'audioTracks': 'Audio Tracks',
    'noAudioTracks': 'No audio tracks available',
    'subtitles': 'Subtitles',
    'noSubtitleTracks': 'No subtitles available',
    'disableSubtitles': 'Disable subtitles',
    'subtitlesDisabled': 'Subtitles disabled',
    // Offline downloads
    'offlineDownloads': 'Offline Downloads',
    'downloadChannel': 'Download channel',
    'downloadStarted': 'Download started',
    'downloading': 'Downloading...',
    'noOfflineRecordings': 'No offline recordings yet',
    'offlineHint': 'Long-press any channel and tap "Download"',
    'clearCompleted': 'Clear completed',
    'recordLive': 'Record live stream',
    'recordDuration': 'Recording duration',
    'record30min': '30 minutes',
    'record1hour': '1 hour',
    'record2hours': '2 hours',
    'recordUnlimited': 'Until stopped',
    'play': 'Play',
  };
}
