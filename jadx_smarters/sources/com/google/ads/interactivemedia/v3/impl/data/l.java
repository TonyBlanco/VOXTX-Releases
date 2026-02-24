package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avx;
import java.util.List;
import java.util.Set;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
final class l extends e {
    private int bitrate;
    private boolean disableUi;
    private boolean enableFocusSkipButton;
    private boolean enablePreloading;
    private int loadVideoTimeout;
    private avo<String> mimeTypes;
    private double playAdsAfterTime;
    private byte set$0;
    private avx<UiElement> uiElements;

    public l() {
    }

    private l(f fVar) {
        this.bitrate = fVar.bitrate();
        this.mimeTypes = fVar.mimeTypes();
        this.uiElements = fVar.uiElements();
        this.enablePreloading = false;
        this.enableFocusSkipButton = fVar.enableFocusSkipButton();
        this.playAdsAfterTime = fVar.playAdsAfterTime();
        this.disableUi = fVar.disableUi();
        this.loadVideoTimeout = fVar.loadVideoTimeout();
        this.set$0 = Utf8.REPLACEMENT_BYTE;
    }

    public /* synthetic */ l(f fVar, k kVar) {
        this(fVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public f build() {
        if (this.set$0 == 63) {
            return new n(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb.append(" bitrate");
        }
        if ((this.set$0 & 2) == 0) {
            sb.append(" enablePreloading");
        }
        if ((this.set$0 & 4) == 0) {
            sb.append(" enableFocusSkipButton");
        }
        if ((this.set$0 & 8) == 0) {
            sb.append(" playAdsAfterTime");
        }
        if ((this.set$0 & 16) == 0) {
            sb.append(" disableUi");
        }
        if ((this.set$0 & 32) == 0) {
            sb.append(" loadVideoTimeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setBitrate(int i9) {
        this.bitrate = i9;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setDisableUi(boolean z9) {
        this.disableUi = z9;
        this.set$0 = (byte) (this.set$0 | 16);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setEnableFocusSkipButton(boolean z9) {
        this.enableFocusSkipButton = z9;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setEnablePreloading(boolean z9) {
        this.enablePreloading = z9;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setLoadVideoTimeout(int i9) {
        this.loadVideoTimeout = i9;
        this.set$0 = (byte) (this.set$0 | 32);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setMimeTypes(List<String> list) {
        this.mimeTypes = list == null ? null : avo.m(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setPlayAdsAfterTime(double d9) {
        this.playAdsAfterTime = d9;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.e
    public e setUiElements(Set<UiElement> set) {
        this.uiElements = set == null ? null : avx.l(set);
        return this;
    }
}
