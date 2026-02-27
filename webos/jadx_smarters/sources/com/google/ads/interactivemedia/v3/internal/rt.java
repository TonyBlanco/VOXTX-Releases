package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes3.dex */
final class rt implements rs {
    private rt() {
    }

    public /* synthetic */ rt(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final MediaCodecInfo b(int i9) {
        return MediaCodecList.getCodecInfoAt(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final boolean d() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rs
    public final boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
