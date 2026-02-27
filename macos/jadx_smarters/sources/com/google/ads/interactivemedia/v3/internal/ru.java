package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
final class ru implements rs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f24440b;

    public ru(boolean z9, boolean z10) {
        int i9 = 1;
        if (!z9 && !z10) {
            i9 = 0;
        }
        this.f24439a = i9;
    }

    private final void f() {
        if (this.f24440b == null) {
            this.f24440b = new MediaCodecList(this.f24439a).getCodecInfos();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final int a() {
        f();
        return this.f24440b.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final MediaCodecInfo b(int i9) {
        f();
        return this.f24440b[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final boolean d() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
