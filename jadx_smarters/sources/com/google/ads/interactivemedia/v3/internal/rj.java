package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final class rj extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rh f24375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24376d;

    /* JADX WARN: Illegal instructions before constructor call */
    public rj(C1333s c1333s, Throwable th, boolean z9, int i9) {
        String strValueOf = String.valueOf(c1333s);
        this("Decoder init failed: [" + i9 + "], " + strValueOf, th, c1333s.f24467l, z9, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i9));
    }

    public rj(C1333s c1333s, Throwable th, boolean z9, rh rhVar) {
        this("Decoder init failed: " + rhVar.f24365a + ", " + String.valueOf(c1333s), th, c1333s.f24467l, z9, rhVar, (cq.f22640a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo());
    }

    private rj(String str, Throwable th, String str2, boolean z9, rh rhVar, String str3) {
        super(str, th);
        this.f24373a = str2;
        this.f24374b = z9;
        this.f24375c = rhVar;
        this.f24376d = str3;
    }

    public static /* bridge */ /* synthetic */ rj a(rj rjVar, rj rjVar2) {
        return new rj(rjVar.getMessage(), rjVar.getCause(), rjVar.f24373a, rjVar.f24374b, rjVar.f24375c, rjVar.f24376d);
    }
}
