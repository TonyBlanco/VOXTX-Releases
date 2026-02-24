package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
final class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f22761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f22762b = S.a(0, 0);

    public static /* bridge */ /* synthetic */ void a(eb ebVar, int i9, int i10) {
        ebVar.f22762b.set(i9, i10);
        ebVar.f22761a.setPattern(ebVar.f22762b);
    }
}
