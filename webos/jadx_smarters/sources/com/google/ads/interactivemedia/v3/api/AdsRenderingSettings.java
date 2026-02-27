package com.google.ads.interactivemedia.v3.api;

import com.google.android.gms.common.internal.Hide;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface AdsRenderingSettings {
    int getBitrateKbps();

    @Hide
    boolean getDisableUi();

    boolean getEnableCustomTabs();

    boolean getEnablePreloading();

    boolean getFocusSkipButtonWhenAvailable();

    List<String> getMimeTypes();

    void setBitrateKbps(int i9);

    @Hide
    void setDisableUi(boolean z9);

    void setEnableCustomTabs(boolean z9);

    void setEnablePreloading(boolean z9);

    void setFocusSkipButtonWhenAvailable(boolean z9);

    void setLoadVideoTimeout(int i9);

    void setMimeTypes(List<String> list);

    void setPlayAdsAfterTime(double d9);

    void setUiElements(Set<UiElement> set);
}
