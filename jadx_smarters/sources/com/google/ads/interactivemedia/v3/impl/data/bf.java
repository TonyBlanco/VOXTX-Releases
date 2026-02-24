package com.google.ads.interactivemedia.v3.impl.data;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.internal.aie;
import com.google.ads.interactivemedia.v3.internal.aip;
import com.google.ads.interactivemedia.v3.internal.ait;
import com.google.ads.interactivemedia.v3.internal.aiu;
import com.google.ads.interactivemedia.v3.internal.aiv;
import com.google.ads.interactivemedia.v3.internal.aiw;
import com.google.ads.interactivemedia.v3.internal.ajb;
import com.google.ads.interactivemedia.v3.internal.akr;
import com.google.ads.interactivemedia.v3.internal.ald;
import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avq;
import com.google.ads.interactivemedia.v3.internal.avs;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bf {
    public static be builder() {
        return new x();
    }

    public static bf create(AdsRequest adsRequest, String str, ba baVar, List<bw> list, Map<String, String> map, String str2, cd cdVar, ImaSdkSettings imaSdkSettings, aip aipVar, boolean z9, bg bgVar, AdDisplayContainer adDisplayContainer) {
        String adTagUrl = adsRequest.getAdTagUrl();
        String adsResponse = adsRequest.getAdsResponse();
        Map<String, String> extraParameters = adsRequest.getExtraParameters();
        aiw aiwVar = (aiw) adsRequest;
        ait aitVarA = aiwVar.a();
        aiv aivVarC = aiwVar.c();
        aiu aiuVarB = aiwVar.b();
        Float fD = aiwVar.d();
        List<String> listI = aiwVar.i();
        String strG = aiwVar.g();
        String strH = aiwVar.h();
        Float f9 = aiwVar.f();
        Float fE = aiwVar.e();
        Map<String, String> companionSlots = getCompanionSlots((aie) adDisplayContainer);
        ViewGroup adContainer = adDisplayContainer.getAdContainer();
        be beVarBuilder = builder();
        beVarBuilder.adTagUrl(adTagUrl);
        beVarBuilder.adsResponse(adsResponse);
        beVarBuilder.companionSlots(companionSlots);
        beVarBuilder.consentSettings(baVar);
        beVarBuilder.contentDuration(fD);
        beVarBuilder.contentKeywords(listI);
        beVarBuilder.contentTitle(strG);
        beVarBuilder.contentUrl(strH);
        beVarBuilder.env(str);
        beVarBuilder.secureSignals(list);
        beVarBuilder.extraParameters(extraParameters);
        beVarBuilder.identifierInfo(bgVar);
        Boolean boolValueOf = Boolean.valueOf(z9);
        beVarBuilder.isTv(boolValueOf);
        beVarBuilder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        beVarBuilder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        beVarBuilder.liveStreamPrefetchSeconds(fE);
        beVarBuilder.marketAppInfo(aipVar);
        beVarBuilder.network(str2);
        beVarBuilder.videoEnvironment(cdVar);
        beVarBuilder.omidAdSessionsOnStartedOnly(Boolean.TRUE);
        beVarBuilder.platformSignals(map);
        beVarBuilder.settings(imaSdkSettings);
        beVarBuilder.supportsExternalNavigation(Boolean.valueOf(!z9));
        beVarBuilder.supportsIconClickFallback(boolValueOf);
        beVarBuilder.supportsNativeNetworking(false);
        beVarBuilder.supportsResizing(Boolean.valueOf(adDisplayContainer.getPlayer() instanceof ResizablePlayer));
        beVarBuilder.usesCustomVideoPlayback(Boolean.valueOf(!(adDisplayContainer.getPlayer() instanceof ald)));
        beVarBuilder.vastLoadTimeout(f9);
        beVarBuilder.videoContinuousPlay(aiuVarB);
        beVarBuilder.videoPlayActivation(aitVarA);
        beVarBuilder.videoPlayMuted(aivVarC);
        return beVarBuilder.build();
    }

    public static bf createFromStreamRequest(StreamRequest streamRequest, String str, ba baVar, List<bw> list, Map<String, String> map, String str2, cd cdVar, ImaSdkSettings imaSdkSettings, aip aipVar, boolean z9, String str3, bg bgVar, StreamDisplayContainer streamDisplayContainer) {
        Map<String, String> companionSlots = getCompanionSlots((akr) streamDisplayContainer);
        ViewGroup adContainer = streamDisplayContainer.getAdContainer();
        String str4 = streamRequest.getFormat() == StreamRequest.StreamFormat.DASH ? "dash" : "hls";
        be beVarBuilder = builder();
        beVarBuilder.adTagParameters(streamRequest.getAdTagParameters());
        beVarBuilder.apiKey(streamRequest.getApiKey());
        beVarBuilder.assetKey(streamRequest.getAssetKey());
        beVarBuilder.authToken(streamRequest.getAuthToken());
        beVarBuilder.companionSlots(companionSlots);
        beVarBuilder.consentSettings(baVar);
        beVarBuilder.contentSourceId(streamRequest.getContentSourceId());
        beVarBuilder.contentUrl(streamRequest.getContentUrl());
        beVarBuilder.customAssetKey(streamRequest.getCustomAssetKey());
        beVarBuilder.enableNonce(Boolean.valueOf(streamRequest.getEnableNonce()));
        beVarBuilder.env(str);
        beVarBuilder.secureSignals(list);
        beVarBuilder.format(str4);
        beVarBuilder.identifierInfo(bgVar);
        Boolean boolValueOf = Boolean.valueOf(z9);
        beVarBuilder.isTv(boolValueOf);
        beVarBuilder.linearAdSlotWidth(Integer.valueOf(adContainer.getWidth()));
        beVarBuilder.linearAdSlotHeight(Integer.valueOf(adContainer.getHeight()));
        beVarBuilder.liveStreamEventId(streamRequest.getLiveStreamEventId());
        beVarBuilder.marketAppInfo(aipVar);
        beVarBuilder.msParameter(str3);
        beVarBuilder.network(str2);
        beVarBuilder.videoEnvironment(cdVar);
        beVarBuilder.networkCode(streamRequest.getNetworkCode());
        beVarBuilder.oAuthToken(streamRequest.getOAuthToken());
        beVarBuilder.omidAdSessionsOnStartedOnly(Boolean.TRUE);
        beVarBuilder.platformSignals(map);
        beVarBuilder.projectNumber(streamRequest.getProjectNumber());
        beVarBuilder.region(streamRequest.getRegion());
        beVarBuilder.settings(imaSdkSettings);
        beVarBuilder.streamActivityMonitorId(streamRequest.getStreamActivityMonitorId());
        beVarBuilder.supportsExternalNavigation(Boolean.valueOf(!z9));
        beVarBuilder.supportsIconClickFallback(boolValueOf);
        beVarBuilder.supportsNativeNetworking(false);
        beVarBuilder.supportsResizing(Boolean.valueOf(streamDisplayContainer.getVideoStreamPlayer() instanceof ResizablePlayer));
        beVarBuilder.useQAStreamBaseUrl(streamRequest.getUseQAStreamBaseUrl());
        beVarBuilder.videoId(streamRequest.getVideoId());
        return beVarBuilder.build();
    }

    private static Map<String, String> getCompanionSlots(ajb ajbVar) {
        Map mapA = ajbVar.a();
        if (mapA == null || mapA.isEmpty()) {
            return null;
        }
        avq avqVar = new avq();
        for (String str : mapA.keySet()) {
            CompanionAdSlot companionAdSlot = (CompanionAdSlot) mapA.get(str);
            avqVar.a(str, companionAdSlot.getWidth() + "x" + companionAdSlot.getHeight());
        }
        return avqVar.b();
    }

    private static boolean supportsNativeNetworkRequests() {
        return true;
    }

    public abstract avs<String, String> adTagParameters();

    public abstract String adTagUrl();

    public abstract String adsResponse();

    public abstract String apiKey();

    public abstract String assetKey();

    public abstract String authToken();

    public abstract avs<String, String> companionSlots();

    public abstract ba consentSettings();

    public abstract Float contentDuration();

    public abstract avo<String> contentKeywords();

    public abstract String contentSourceId();

    public abstract String contentTitle();

    public abstract String contentUrl();

    public abstract String customAssetKey();

    public abstract Boolean enableNonce();

    public abstract String env();

    public abstract avs<String, String> extraParameters();

    public abstract String format();

    public abstract bg identifierInfo();

    public abstract Boolean isTv();

    public abstract Integer linearAdSlotHeight();

    public abstract Integer linearAdSlotWidth();

    public abstract String liveStreamEventId();

    public abstract Float liveStreamPrefetchSeconds();

    public abstract aip marketAppInfo();

    public abstract String msParameter();

    public abstract String network();

    public abstract String networkCode();

    public abstract String oAuthToken();

    public abstract Boolean omidAdSessionsOnStartedOnly();

    public abstract avs<String, String> platformSignals();

    public abstract String projectNumber();

    public abstract String region();

    public abstract avo<bw> secureSignals();

    public abstract ImaSdkSettings settings();

    public abstract String streamActivityMonitorId();

    public abstract Boolean supportsExternalNavigation();

    public abstract Boolean supportsIconClickFallback();

    public abstract Boolean supportsNativeNetworking();

    public abstract Boolean supportsResizing();

    public abstract Boolean useQAStreamBaseUrl();

    public abstract Boolean usesCustomVideoPlayback();

    public abstract Float vastLoadTimeout();

    public abstract aiu videoContinuousPlay();

    public abstract cd videoEnvironment();

    public abstract String videoId();

    public abstract ait videoPlayActivation();

    public abstract aiv videoPlayMuted();
}
