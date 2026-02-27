package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.android.gms.common.internal.Hide;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface StreamRequest {

    public enum StreamFormat {
        DASH,
        HLS
    }

    Map<String, String> getAdTagParameters();

    String getApiKey();

    String getAssetKey();

    String getAuthToken();

    String getContentSourceId();

    String getContentUrl();

    String getCustomAssetKey();

    @Hide
    boolean getEnableNonce();

    StreamFormat getFormat();

    @Hide
    String getLiveStreamEventId();

    String getManifestSuffix();

    String getNetworkCode();

    @Hide
    String getOAuthToken();

    @Hide
    String getProjectNumber();

    @Hide
    String getRegion();

    @Hide
    SecureSignals getSecureSignals();

    @Hide
    String getStreamActivityMonitorId();

    @Hide
    Boolean getUseQAStreamBaseUrl();

    Object getUserRequestContext();

    String getVideoId();

    void setAdTagParameters(Map<String, String> map);

    void setAuthToken(String str);

    void setContentUrl(String str);

    @Hide
    void setEnableNonce(boolean z9);

    void setFormat(StreamFormat streamFormat);

    void setManifestSuffix(String str);

    @Hide
    void setSecureSignals(SecureSignals secureSignals);

    void setStreamActivityMonitorId(String str);

    @Hide
    void setUseQAStreamBaseUrl(Boolean bool);

    void setUserRequestContext(Object obj);
}
