package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public abstract f build();

    public abstract e setBitrate(int i9);

    public abstract e setDisableUi(boolean z9);

    public abstract e setEnableFocusSkipButton(boolean z9);

    public abstract e setEnablePreloading(boolean z9);

    public abstract e setLoadVideoTimeout(int i9);

    public abstract e setMimeTypes(List<String> list);

    public abstract e setPlayAdsAfterTime(double d9);

    public abstract e setUiElements(Set<UiElement> set);
}
