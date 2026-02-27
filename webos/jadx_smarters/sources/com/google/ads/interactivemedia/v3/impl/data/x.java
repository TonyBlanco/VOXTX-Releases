package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.aip;
import com.google.ads.interactivemedia.v3.internal.ait;
import com.google.ads.interactivemedia.v3.internal.aiu;
import com.google.ads.interactivemedia.v3.internal.aiv;
import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avs;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class x implements be {
    private avs<String, String> adTagParameters;
    private String adTagUrl;
    private String adsResponse;
    private String apiKey;
    private String assetKey;
    private String authToken;
    private avs<String, String> companionSlots;
    private ba consentSettings;
    private Float contentDuration;
    private avo<String> contentKeywords;
    private String contentSourceId;
    private String contentTitle;
    private String contentUrl;
    private String customAssetKey;
    private Boolean enableNonce;
    private String env;
    private avs<String, String> extraParameters;
    private String format;
    private bg identifierInfo;
    private Boolean isTv;
    private Integer linearAdSlotHeight;
    private Integer linearAdSlotWidth;
    private String liveStreamEventId;
    private Float liveStreamPrefetchSeconds;
    private aip marketAppInfo;
    private String msParameter;
    private String network;
    private String networkCode;
    private String oAuthToken;
    private Boolean omidAdSessionsOnStartedOnly;
    private avs<String, String> platformSignals;
    private String projectNumber;
    private String region;
    private avo<bw> secureSignals;
    private ImaSdkSettings settings;
    private String streamActivityMonitorId;
    private Boolean supportsExternalNavigation;
    private Boolean supportsIconClickFallback;
    private Boolean supportsNativeNetworking;
    private Boolean supportsResizing;
    private Boolean useQAStreamBaseUrl;
    private Boolean usesCustomVideoPlayback;
    private Float vastLoadTimeout;
    private aiu videoContinuousPlay;
    private cd videoEnvironment;
    private String videoId;
    private ait videoPlayActivation;
    private aiv videoPlayMuted;

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be adTagParameters(Map<String, String> map) {
        this.adTagParameters = map == null ? null : avs.c(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be adTagUrl(String str) {
        this.adTagUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be adsResponse(String str) {
        this.adsResponse = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be apiKey(String str) {
        this.apiKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be assetKey(String str) {
        this.assetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be authToken(String str) {
        this.authToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public bf build() {
        return new z(this.adTagUrl, this.adTagParameters, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.enableNonce, this.env, this.secureSignals, this.extraParameters, this.format, this.identifierInfo, this.isTv, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamEventId, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.videoEnvironment, this.networkCode, this.oAuthToken, this.omidAdSessionsOnStartedOnly, this.platformSignals, this.projectNumber, this.region, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeNetworking, this.streamActivityMonitorId, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted, null);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be companionSlots(Map<String, String> map) {
        this.companionSlots = map == null ? null : avs.c(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be consentSettings(ba baVar) {
        this.consentSettings = baVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be contentDuration(Float f9) {
        this.contentDuration = f9;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be contentKeywords(List<String> list) {
        this.contentKeywords = list == null ? null : avo.m(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be contentSourceId(String str) {
        this.contentSourceId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be contentTitle(String str) {
        this.contentTitle = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be contentUrl(String str) {
        this.contentUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be customAssetKey(String str) {
        this.customAssetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be enableNonce(Boolean bool) {
        this.enableNonce = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be env(String str) {
        this.env = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be extraParameters(Map<String, String> map) {
        this.extraParameters = map == null ? null : avs.c(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be format(String str) {
        this.format = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be identifierInfo(bg bgVar) {
        this.identifierInfo = bgVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be isTv(Boolean bool) {
        this.isTv = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be linearAdSlotHeight(Integer num) {
        this.linearAdSlotHeight = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be linearAdSlotWidth(Integer num) {
        this.linearAdSlotWidth = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be liveStreamEventId(String str) {
        this.liveStreamEventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be liveStreamPrefetchSeconds(Float f9) {
        this.liveStreamPrefetchSeconds = f9;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be marketAppInfo(aip aipVar) {
        this.marketAppInfo = aipVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be msParameter(String str) {
        this.msParameter = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be network(String str) {
        this.network = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be networkCode(String str) {
        this.networkCode = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be oAuthToken(String str) {
        this.oAuthToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be omidAdSessionsOnStartedOnly(Boolean bool) {
        this.omidAdSessionsOnStartedOnly = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be platformSignals(Map<String, String> map) {
        this.platformSignals = map == null ? null : avs.c(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be projectNumber(String str) {
        this.projectNumber = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be region(String str) {
        this.region = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be secureSignals(List<bw> list) {
        this.secureSignals = list == null ? null : avo.m(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be settings(ImaSdkSettings imaSdkSettings) {
        this.settings = imaSdkSettings;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be streamActivityMonitorId(String str) {
        this.streamActivityMonitorId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be supportsExternalNavigation(Boolean bool) {
        this.supportsExternalNavigation = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be supportsIconClickFallback(Boolean bool) {
        this.supportsIconClickFallback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be supportsNativeNetworking(Boolean bool) {
        this.supportsNativeNetworking = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be supportsResizing(Boolean bool) {
        this.supportsResizing = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be useQAStreamBaseUrl(Boolean bool) {
        this.useQAStreamBaseUrl = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be usesCustomVideoPlayback(Boolean bool) {
        this.usesCustomVideoPlayback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be vastLoadTimeout(Float f9) {
        this.vastLoadTimeout = f9;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be videoContinuousPlay(aiu aiuVar) {
        this.videoContinuousPlay = aiuVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be videoEnvironment(cd cdVar) {
        this.videoEnvironment = cdVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be videoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be videoPlayActivation(ait aitVar) {
        this.videoPlayActivation = aitVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.be
    public be videoPlayMuted(aiv aivVar) {
        this.videoPlayMuted = aivVar;
        return this;
    }
}
