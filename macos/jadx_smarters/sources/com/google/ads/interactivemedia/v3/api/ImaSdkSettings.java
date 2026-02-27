package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.common.internal.Hide;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ImaSdkSettings {
    public static final int DEFAULT_MAX_REDIRECTS = 4;

    @Hide
    boolean doesRestrictToCustomPlayer();

    boolean getAutoPlayAdBreaks();

    Map<String, String> getFeatureFlags();

    String getLanguage();

    int getMaxRedirects();

    String getPlayerType();

    String getPlayerVersion();

    String getPpid();

    String getSessionId();

    @Hide
    TestingConfiguration getTestingConfig();

    boolean isDebugMode();

    void setAutoPlayAdBreaks(boolean z9);

    void setDebugMode(boolean z9);

    void setFeatureFlags(Map<String, String> map);

    void setLanguage(String str);

    void setMaxRedirects(int i9);

    void setPlayerType(String str);

    void setPlayerVersion(String str);

    void setPpid(String str);

    @Hide
    void setRestrictToCustomPlayer(boolean z9);

    void setSessionId(String str);

    @Hide
    void setTestingConfig(TestingConfiguration testingConfiguration);

    String toString();
}
