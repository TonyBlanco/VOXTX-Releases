package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.android.gms.common.internal.Hide;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface AdsRequest {
    String getAdTagUrl();

    @Hide
    String getAdsResponse();

    ContentProgressProvider getContentProgressProvider();

    String getExtraParameter(String str);

    Map<String, String> getExtraParameters();

    @Hide
    SecureSignals getSecureSignals();

    Object getUserRequestContext();

    void setAdTagUrl(String str);

    void setAdWillAutoPlay(boolean z9);

    void setAdWillPlayMuted(boolean z9);

    void setAdsResponse(String str);

    void setContentDuration(float f9);

    void setContentKeywords(List<String> list);

    void setContentProgressProvider(ContentProgressProvider contentProgressProvider);

    void setContentTitle(String str);

    void setContentUrl(String str);

    void setContinuousPlayback(boolean z9);

    void setExtraParameter(String str, String str2);

    void setLiveStreamPrefetchSeconds(float f9);

    @Hide
    void setSecureSignals(SecureSignals secureSignals);

    void setUserRequestContext(Object obj);

    void setVastLoadTimeout(float f9);
}
