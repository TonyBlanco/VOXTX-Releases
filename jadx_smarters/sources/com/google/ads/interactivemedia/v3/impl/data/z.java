package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.aip;
import com.google.ads.interactivemedia.v3.internal.ait;
import com.google.ads.interactivemedia.v3.internal.aiu;
import com.google.ads.interactivemedia.v3.internal.aiv;
import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avs;

/* JADX INFO: loaded from: classes3.dex */
final class z extends bf {
    private final avs<String, String> adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final avs<String, String> companionSlots;
    private final ba consentSettings;
    private final Float contentDuration;
    private final avo<String> contentKeywords;
    private final String contentSourceId;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final Boolean enableNonce;
    private final String env;
    private final avs<String, String> extraParameters;
    private final String format;
    private final bg identifierInfo;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final String liveStreamEventId;
    private final Float liveStreamPrefetchSeconds;
    private final aip marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final String oAuthToken;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final avs<String, String> platformSignals;
    private final String projectNumber;
    private final String region;
    private final avo<bw> secureSignals;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final aiu videoContinuousPlay;
    private final cd videoEnvironment;
    private final String videoId;
    private final ait videoPlayActivation;
    private final aiv videoPlayMuted;

    private z(String str, avs<String, String> avsVar, String str2, String str3, String str4, String str5, avs<String, String> avsVar2, Float f9, avo<String> avoVar, String str6, String str7, String str8, ba baVar, String str9, Boolean bool, String str10, avo<bw> avoVar2, avs<String, String> avsVar3, String str11, bg bgVar, Boolean bool2, Integer num, Integer num2, String str12, Float f10, aip aipVar, String str13, String str14, cd cdVar, String str15, String str16, Boolean bool3, avs<String, String> avsVar4, String str17, String str18, ImaSdkSettings imaSdkSettings, Boolean bool4, Boolean bool5, Boolean bool6, String str19, Boolean bool7, Boolean bool8, Boolean bool9, Float f11, String str20, ait aitVar, aiu aiuVar, aiv aivVar) {
        this.adTagUrl = str;
        this.adTagParameters = avsVar;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = avsVar2;
        this.contentDuration = f9;
        this.contentKeywords = avoVar;
        this.contentTitle = str6;
        this.contentUrl = str7;
        this.contentSourceId = str8;
        this.consentSettings = baVar;
        this.customAssetKey = str9;
        this.enableNonce = bool;
        this.env = str10;
        this.secureSignals = avoVar2;
        this.extraParameters = avsVar3;
        this.format = str11;
        this.identifierInfo = bgVar;
        this.isTv = bool2;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamEventId = str12;
        this.liveStreamPrefetchSeconds = f10;
        this.marketAppInfo = aipVar;
        this.msParameter = str13;
        this.network = str14;
        this.videoEnvironment = cdVar;
        this.networkCode = str15;
        this.oAuthToken = str16;
        this.omidAdSessionsOnStartedOnly = bool3;
        this.platformSignals = avsVar4;
        this.projectNumber = str17;
        this.region = str18;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool4;
        this.supportsIconClickFallback = bool5;
        this.supportsNativeNetworking = bool6;
        this.streamActivityMonitorId = str19;
        this.supportsResizing = bool7;
        this.useQAStreamBaseUrl = bool8;
        this.usesCustomVideoPlayback = bool9;
        this.vastLoadTimeout = f11;
        this.videoId = str20;
        this.videoPlayActivation = aitVar;
        this.videoContinuousPlay = aiuVar;
        this.videoPlayMuted = aivVar;
    }

    public /* synthetic */ z(String str, avs avsVar, String str2, String str3, String str4, String str5, avs avsVar2, Float f9, avo avoVar, String str6, String str7, String str8, ba baVar, String str9, Boolean bool, String str10, avo avoVar2, avs avsVar3, String str11, bg bgVar, Boolean bool2, Integer num, Integer num2, String str12, Float f10, aip aipVar, String str13, String str14, cd cdVar, String str15, String str16, Boolean bool3, avs avsVar4, String str17, String str18, ImaSdkSettings imaSdkSettings, Boolean bool4, Boolean bool5, Boolean bool6, String str19, Boolean bool7, Boolean bool8, Boolean bool9, Float f11, String str20, ait aitVar, aiu aiuVar, aiv aivVar, y yVar) {
        this(str, avsVar, str2, str3, str4, str5, avsVar2, f9, avoVar, str6, str7, str8, baVar, str9, bool, str10, avoVar2, avsVar3, str11, bgVar, bool2, num, num2, str12, f10, aipVar, str13, str14, cdVar, str15, str16, bool3, avsVar4, str17, str18, imaSdkSettings, bool4, bool5, bool6, str19, bool7, bool8, bool9, f11, str20, aitVar, aiuVar, aivVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public avs<String, String> adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public avs<String, String> companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public ba consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public avo<String> contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean enableNonce() {
        return this.enableNonce;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bf) {
            bf bfVar = (bf) obj;
            String str = this.adTagUrl;
            if (str != null ? str.equals(bfVar.adTagUrl()) : bfVar.adTagUrl() == null) {
                avs<String, String> avsVar = this.adTagParameters;
                if (avsVar != null ? avsVar.equals(bfVar.adTagParameters()) : bfVar.adTagParameters() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(bfVar.adsResponse()) : bfVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(bfVar.apiKey()) : bfVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(bfVar.assetKey()) : bfVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(bfVar.authToken()) : bfVar.authToken() == null) {
                                    avs<String, String> avsVar2 = this.companionSlots;
                                    if (avsVar2 != null ? avsVar2.equals(bfVar.companionSlots()) : bfVar.companionSlots() == null) {
                                        Float f9 = this.contentDuration;
                                        if (f9 != null ? f9.equals(bfVar.contentDuration()) : bfVar.contentDuration() == null) {
                                            avo<String> avoVar = this.contentKeywords;
                                            if (avoVar != null ? avoVar.equals(bfVar.contentKeywords()) : bfVar.contentKeywords() == null) {
                                                String str6 = this.contentTitle;
                                                if (str6 != null ? str6.equals(bfVar.contentTitle()) : bfVar.contentTitle() == null) {
                                                    String str7 = this.contentUrl;
                                                    if (str7 != null ? str7.equals(bfVar.contentUrl()) : bfVar.contentUrl() == null) {
                                                        String str8 = this.contentSourceId;
                                                        if (str8 != null ? str8.equals(bfVar.contentSourceId()) : bfVar.contentSourceId() == null) {
                                                            ba baVar = this.consentSettings;
                                                            if (baVar != null ? baVar.equals(bfVar.consentSettings()) : bfVar.consentSettings() == null) {
                                                                String str9 = this.customAssetKey;
                                                                if (str9 != null ? str9.equals(bfVar.customAssetKey()) : bfVar.customAssetKey() == null) {
                                                                    Boolean bool = this.enableNonce;
                                                                    if (bool != null ? bool.equals(bfVar.enableNonce()) : bfVar.enableNonce() == null) {
                                                                        String str10 = this.env;
                                                                        if (str10 != null ? str10.equals(bfVar.env()) : bfVar.env() == null) {
                                                                            avo<bw> avoVar2 = this.secureSignals;
                                                                            if (avoVar2 != null ? avoVar2.equals(bfVar.secureSignals()) : bfVar.secureSignals() == null) {
                                                                                avs<String, String> avsVar3 = this.extraParameters;
                                                                                if (avsVar3 != null ? avsVar3.equals(bfVar.extraParameters()) : bfVar.extraParameters() == null) {
                                                                                    String str11 = this.format;
                                                                                    if (str11 != null ? str11.equals(bfVar.format()) : bfVar.format() == null) {
                                                                                        bg bgVar = this.identifierInfo;
                                                                                        if (bgVar != null ? bgVar.equals(bfVar.identifierInfo()) : bfVar.identifierInfo() == null) {
                                                                                            Boolean bool2 = this.isTv;
                                                                                            if (bool2 != null ? bool2.equals(bfVar.isTv()) : bfVar.isTv() == null) {
                                                                                                Integer num = this.linearAdSlotWidth;
                                                                                                if (num != null ? num.equals(bfVar.linearAdSlotWidth()) : bfVar.linearAdSlotWidth() == null) {
                                                                                                    Integer num2 = this.linearAdSlotHeight;
                                                                                                    if (num2 != null ? num2.equals(bfVar.linearAdSlotHeight()) : bfVar.linearAdSlotHeight() == null) {
                                                                                                        String str12 = this.liveStreamEventId;
                                                                                                        if (str12 != null ? str12.equals(bfVar.liveStreamEventId()) : bfVar.liveStreamEventId() == null) {
                                                                                                            Float f10 = this.liveStreamPrefetchSeconds;
                                                                                                            if (f10 != null ? f10.equals(bfVar.liveStreamPrefetchSeconds()) : bfVar.liveStreamPrefetchSeconds() == null) {
                                                                                                                aip aipVar = this.marketAppInfo;
                                                                                                                if (aipVar != null ? aipVar.equals(bfVar.marketAppInfo()) : bfVar.marketAppInfo() == null) {
                                                                                                                    String str13 = this.msParameter;
                                                                                                                    if (str13 != null ? str13.equals(bfVar.msParameter()) : bfVar.msParameter() == null) {
                                                                                                                        String str14 = this.network;
                                                                                                                        if (str14 != null ? str14.equals(bfVar.network()) : bfVar.network() == null) {
                                                                                                                            cd cdVar = this.videoEnvironment;
                                                                                                                            if (cdVar != null ? cdVar.equals(bfVar.videoEnvironment()) : bfVar.videoEnvironment() == null) {
                                                                                                                                String str15 = this.networkCode;
                                                                                                                                if (str15 != null ? str15.equals(bfVar.networkCode()) : bfVar.networkCode() == null) {
                                                                                                                                    String str16 = this.oAuthToken;
                                                                                                                                    if (str16 != null ? str16.equals(bfVar.oAuthToken()) : bfVar.oAuthToken() == null) {
                                                                                                                                        Boolean bool3 = this.omidAdSessionsOnStartedOnly;
                                                                                                                                        if (bool3 != null ? bool3.equals(bfVar.omidAdSessionsOnStartedOnly()) : bfVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                            avs<String, String> avsVar4 = this.platformSignals;
                                                                                                                                            if (avsVar4 != null ? avsVar4.equals(bfVar.platformSignals()) : bfVar.platformSignals() == null) {
                                                                                                                                                String str17 = this.projectNumber;
                                                                                                                                                if (str17 != null ? str17.equals(bfVar.projectNumber()) : bfVar.projectNumber() == null) {
                                                                                                                                                    String str18 = this.region;
                                                                                                                                                    if (str18 != null ? str18.equals(bfVar.region()) : bfVar.region() == null) {
                                                                                                                                                        ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                                                        if (imaSdkSettings != null ? imaSdkSettings.equals(bfVar.settings()) : bfVar.settings() == null) {
                                                                                                                                                            Boolean bool4 = this.supportsExternalNavigation;
                                                                                                                                                            if (bool4 != null ? bool4.equals(bfVar.supportsExternalNavigation()) : bfVar.supportsExternalNavigation() == null) {
                                                                                                                                                                Boolean bool5 = this.supportsIconClickFallback;
                                                                                                                                                                if (bool5 != null ? bool5.equals(bfVar.supportsIconClickFallback()) : bfVar.supportsIconClickFallback() == null) {
                                                                                                                                                                    Boolean bool6 = this.supportsNativeNetworking;
                                                                                                                                                                    if (bool6 != null ? bool6.equals(bfVar.supportsNativeNetworking()) : bfVar.supportsNativeNetworking() == null) {
                                                                                                                                                                        String str19 = this.streamActivityMonitorId;
                                                                                                                                                                        if (str19 != null ? str19.equals(bfVar.streamActivityMonitorId()) : bfVar.streamActivityMonitorId() == null) {
                                                                                                                                                                            Boolean bool7 = this.supportsResizing;
                                                                                                                                                                            if (bool7 != null ? bool7.equals(bfVar.supportsResizing()) : bfVar.supportsResizing() == null) {
                                                                                                                                                                                Boolean bool8 = this.useQAStreamBaseUrl;
                                                                                                                                                                                if (bool8 != null ? bool8.equals(bfVar.useQAStreamBaseUrl()) : bfVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                                                    Boolean bool9 = this.usesCustomVideoPlayback;
                                                                                                                                                                                    if (bool9 != null ? bool9.equals(bfVar.usesCustomVideoPlayback()) : bfVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                                                        Float f11 = this.vastLoadTimeout;
                                                                                                                                                                                        if (f11 != null ? f11.equals(bfVar.vastLoadTimeout()) : bfVar.vastLoadTimeout() == null) {
                                                                                                                                                                                            String str20 = this.videoId;
                                                                                                                                                                                            if (str20 != null ? str20.equals(bfVar.videoId()) : bfVar.videoId() == null) {
                                                                                                                                                                                                ait aitVar = this.videoPlayActivation;
                                                                                                                                                                                                if (aitVar != null ? aitVar.equals(bfVar.videoPlayActivation()) : bfVar.videoPlayActivation() == null) {
                                                                                                                                                                                                    aiu aiuVar = this.videoContinuousPlay;
                                                                                                                                                                                                    if (aiuVar != null ? aiuVar.equals(bfVar.videoContinuousPlay()) : bfVar.videoContinuousPlay() == null) {
                                                                                                                                                                                                        aiv aivVar = this.videoPlayMuted;
                                                                                                                                                                                                        aiv aivVarVideoPlayMuted = bfVar.videoPlayMuted();
                                                                                                                                                                                                        if (aivVar != null ? aivVar.equals(aivVarVideoPlayMuted) : aivVarVideoPlayMuted == null) {
                                                                                                                                                                                                            return true;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public avs<String, String> extraParameters() {
        return this.extraParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String format() {
        return this.format;
    }

    public int hashCode() {
        String str = this.adTagUrl;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        avs<String, String> avsVar = this.adTagParameters;
        int iHashCode2 = (iHashCode ^ (avsVar == null ? 0 : avsVar.hashCode())) * 1000003;
        String str2 = this.adsResponse;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.apiKey;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.assetKey;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.authToken;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        avs<String, String> avsVar2 = this.companionSlots;
        int iHashCode7 = (iHashCode6 ^ (avsVar2 == null ? 0 : avsVar2.hashCode())) * 1000003;
        Float f9 = this.contentDuration;
        int iHashCode8 = (iHashCode7 ^ (f9 == null ? 0 : f9.hashCode())) * 1000003;
        avo<String> avoVar = this.contentKeywords;
        int iHashCode9 = (iHashCode8 ^ (avoVar == null ? 0 : avoVar.hashCode())) * 1000003;
        String str6 = this.contentTitle;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentUrl;
        int iHashCode11 = (iHashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.contentSourceId;
        int iHashCode12 = (iHashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        ba baVar = this.consentSettings;
        int iHashCode13 = (iHashCode12 ^ (baVar == null ? 0 : baVar.hashCode())) * 1000003;
        String str9 = this.customAssetKey;
        int iHashCode14 = (iHashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        Boolean bool = this.enableNonce;
        int iHashCode15 = (iHashCode14 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str10 = this.env;
        int iHashCode16 = (iHashCode15 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        avo<bw> avoVar2 = this.secureSignals;
        int iHashCode17 = (iHashCode16 ^ (avoVar2 == null ? 0 : avoVar2.hashCode())) * 1000003;
        avs<String, String> avsVar3 = this.extraParameters;
        int iHashCode18 = (iHashCode17 ^ (avsVar3 == null ? 0 : avsVar3.hashCode())) * 1000003;
        String str11 = this.format;
        int iHashCode19 = (iHashCode18 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        bg bgVar = this.identifierInfo;
        int iHashCode20 = (iHashCode19 ^ (bgVar == null ? 0 : bgVar.hashCode())) * 1000003;
        Boolean bool2 = this.isTv;
        int iHashCode21 = (iHashCode20 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Integer num = this.linearAdSlotWidth;
        int iHashCode22 = (iHashCode21 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        int iHashCode23 = (iHashCode22 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str12 = this.liveStreamEventId;
        int iHashCode24 = (iHashCode23 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        Float f10 = this.liveStreamPrefetchSeconds;
        int iHashCode25 = (iHashCode24 ^ (f10 == null ? 0 : f10.hashCode())) * 1000003;
        aip aipVar = this.marketAppInfo;
        int iHashCode26 = (iHashCode25 ^ (aipVar == null ? 0 : aipVar.hashCode())) * 1000003;
        String str13 = this.msParameter;
        int iHashCode27 = (iHashCode26 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.network;
        int iHashCode28 = (iHashCode27 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        cd cdVar = this.videoEnvironment;
        int iHashCode29 = (iHashCode28 ^ (cdVar == null ? 0 : cdVar.hashCode())) * 1000003;
        String str15 = this.networkCode;
        int iHashCode30 = (iHashCode29 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.oAuthToken;
        int iHashCode31 = (iHashCode30 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        Boolean bool3 = this.omidAdSessionsOnStartedOnly;
        int iHashCode32 = (iHashCode31 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        avs<String, String> avsVar4 = this.platformSignals;
        int iHashCode33 = (iHashCode32 ^ (avsVar4 == null ? 0 : avsVar4.hashCode())) * 1000003;
        String str17 = this.projectNumber;
        int iHashCode34 = (iHashCode33 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        String str18 = this.region;
        int iHashCode35 = (iHashCode34 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        int iHashCode36 = (iHashCode35 ^ (imaSdkSettings == null ? 0 : imaSdkSettings.hashCode())) * 1000003;
        Boolean bool4 = this.supportsExternalNavigation;
        int iHashCode37 = (iHashCode36 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.supportsIconClickFallback;
        int iHashCode38 = (iHashCode37 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.supportsNativeNetworking;
        int iHashCode39 = (iHashCode38 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        String str19 = this.streamActivityMonitorId;
        int iHashCode40 = (iHashCode39 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        Boolean bool7 = this.supportsResizing;
        int iHashCode41 = (iHashCode40 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        Boolean bool8 = this.useQAStreamBaseUrl;
        int iHashCode42 = (iHashCode41 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.usesCustomVideoPlayback;
        int iHashCode43 = (iHashCode42 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Float f11 = this.vastLoadTimeout;
        int iHashCode44 = (iHashCode43 ^ (f11 == null ? 0 : f11.hashCode())) * 1000003;
        String str20 = this.videoId;
        int iHashCode45 = (iHashCode44 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        ait aitVar = this.videoPlayActivation;
        int iHashCode46 = (iHashCode45 ^ (aitVar == null ? 0 : aitVar.hashCode())) * 1000003;
        aiu aiuVar = this.videoContinuousPlay;
        int iHashCode47 = (iHashCode46 ^ (aiuVar == null ? 0 : aiuVar.hashCode())) * 1000003;
        aiv aivVar = this.videoPlayMuted;
        return iHashCode47 ^ (aivVar != null ? aivVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public bg identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public aip marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public avs<String, String> platformSignals() {
        return this.platformSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public avo<bw> secureSignals() {
        return this.secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public ImaSdkSettings settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        return "GsonAdsRequest{adTagUrl=" + this.adTagUrl + ", adTagParameters=" + String.valueOf(this.adTagParameters) + ", adsResponse=" + this.adsResponse + ", apiKey=" + this.apiKey + ", assetKey=" + this.assetKey + ", authToken=" + this.authToken + ", companionSlots=" + String.valueOf(this.companionSlots) + ", contentDuration=" + this.contentDuration + ", contentKeywords=" + String.valueOf(this.contentKeywords) + ", contentTitle=" + this.contentTitle + ", contentUrl=" + this.contentUrl + ", contentSourceId=" + this.contentSourceId + ", consentSettings=" + String.valueOf(this.consentSettings) + ", customAssetKey=" + this.customAssetKey + ", enableNonce=" + this.enableNonce + ", env=" + this.env + ", secureSignals=" + String.valueOf(this.secureSignals) + ", extraParameters=" + String.valueOf(this.extraParameters) + ", format=" + this.format + ", identifierInfo=" + String.valueOf(this.identifierInfo) + ", isTv=" + this.isTv + ", linearAdSlotWidth=" + this.linearAdSlotWidth + ", linearAdSlotHeight=" + this.linearAdSlotHeight + ", liveStreamEventId=" + this.liveStreamEventId + ", liveStreamPrefetchSeconds=" + this.liveStreamPrefetchSeconds + ", marketAppInfo=" + String.valueOf(this.marketAppInfo) + ", msParameter=" + this.msParameter + ", network=" + this.network + ", videoEnvironment=" + String.valueOf(this.videoEnvironment) + ", networkCode=" + this.networkCode + ", oAuthToken=" + this.oAuthToken + ", omidAdSessionsOnStartedOnly=" + this.omidAdSessionsOnStartedOnly + ", platformSignals=" + String.valueOf(this.platformSignals) + ", projectNumber=" + this.projectNumber + ", region=" + this.region + ", settings=" + String.valueOf(this.settings) + ", supportsExternalNavigation=" + this.supportsExternalNavigation + ", supportsIconClickFallback=" + this.supportsIconClickFallback + ", supportsNativeNetworking=" + this.supportsNativeNetworking + ", streamActivityMonitorId=" + this.streamActivityMonitorId + ", supportsResizing=" + this.supportsResizing + ", useQAStreamBaseUrl=" + this.useQAStreamBaseUrl + ", usesCustomVideoPlayback=" + this.usesCustomVideoPlayback + ", vastLoadTimeout=" + this.vastLoadTimeout + ", videoId=" + this.videoId + ", videoPlayActivation=" + String.valueOf(this.videoPlayActivation) + ", videoContinuousPlay=" + String.valueOf(this.videoContinuousPlay) + ", videoPlayMuted=" + String.valueOf(this.videoPlayMuted) + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public aiu videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public cd videoEnvironment() {
        return this.videoEnvironment;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public ait videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bf
    public aiv videoPlayMuted() {
        return this.videoPlayMuted;
    }
}
