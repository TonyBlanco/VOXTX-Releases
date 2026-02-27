package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avx;

/* JADX INFO: loaded from: classes3.dex */
final class n extends f {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final avo<String> mimeTypes;
    private final double playAdsAfterTime;
    private final avx<UiElement> uiElements;

    private n(int i9, avo<String> avoVar, avx<UiElement> avxVar, boolean z9, boolean z10, double d9, boolean z11, int i10) {
        this.bitrate = i9;
        this.mimeTypes = avoVar;
        this.uiElements = avxVar;
        this.enablePreloading = z9;
        this.enableFocusSkipButton = z10;
        this.playAdsAfterTime = d9;
        this.disableUi = z11;
        this.loadVideoTimeout = i10;
    }

    public /* synthetic */ n(int i9, avo avoVar, avx avxVar, boolean z9, boolean z10, double d9, boolean z11, int i10, m mVar) {
        this(i9, avoVar, avxVar, z9, z10, d9, z11, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        avo<String> avoVar;
        avx<UiElement> avxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.bitrate == fVar.bitrate() && ((avoVar = this.mimeTypes) != null ? avoVar.equals(fVar.mimeTypes()) : fVar.mimeTypes() == null) && ((avxVar = this.uiElements) != null ? avxVar.equals(fVar.uiElements()) : fVar.uiElements() == null) && !this.enablePreloading && this.enableFocusSkipButton == fVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(fVar.playAdsAfterTime()) && this.disableUi == fVar.disableUi() && this.loadVideoTimeout == fVar.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i9 = (this.bitrate ^ 1000003) * 1000003;
        avo<String> avoVar = this.mimeTypes;
        int iHashCode = (i9 ^ (avoVar == null ? 0 : avoVar.hashCode())) * 1000003;
        avx<UiElement> avxVar = this.uiElements;
        return ((((((((((iHashCode ^ (avxVar != null ? avxVar.hashCode() : 0)) * 1000003) ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true != this.disableUi ? 1237 : 1231)) * 1000003) ^ this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public avo<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public e toBuilder() {
        return new l(this, null);
    }

    public String toString() {
        return "AdsRenderingSettingsData{bitrate=" + this.bitrate + ", mimeTypes=" + String.valueOf(this.mimeTypes) + ", uiElements=" + String.valueOf(this.uiElements) + ", enablePreloading=" + this.enablePreloading + ", enableFocusSkipButton=" + this.enableFocusSkipButton + ", playAdsAfterTime=" + this.playAdsAfterTime + ", disableUi=" + this.disableUi + ", loadVideoTimeout=" + this.loadVideoTimeout + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.f
    public avx<UiElement> uiElements() {
        return this.uiElements;
    }
}
