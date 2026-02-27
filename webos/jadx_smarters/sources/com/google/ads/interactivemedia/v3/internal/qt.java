package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class qt implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f24283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qy f24284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qw f24285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24287e = 0;

    public /* synthetic */ qt(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f24283a = mediaCodec;
        this.f24284b = new qy(handlerThread);
        this.f24285c = new qw(mediaCodec, handlerThread2);
    }

    public static /* bridge */ /* synthetic */ void o(qt qtVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        qtVar.f24284b.f(qtVar.f24283a);
        af.o("configureCodec");
        qtVar.f24283a.configure(mediaFormat, surface, mediaCrypto, 0);
        af.p();
        qtVar.f24285c.d();
        af.o("startCodec");
        qtVar.f24283a.start();
        af.p();
        qtVar.f24287e = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i9, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(str);
        if (i9 == 1) {
            str2 = "Audio";
        } else if (i9 == 2) {
            str2 = "Video";
        } else {
            sb.append("Unknown(");
            sb.append(i9);
            str2 = ")";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final int a() {
        return this.f24284b.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        return this.f24284b.b(bufferInfo);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final MediaFormat c() {
        return this.f24284b.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final ByteBuffer f(int i9) {
        return this.f24283a.getInputBuffer(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final ByteBuffer g(int i9) {
        return this.f24283a.getOutputBuffer(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void h() {
        this.f24285c.b();
        this.f24283a.flush();
        this.f24284b.e();
        this.f24283a.start();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void i() {
        try {
            if (this.f24287e == 1) {
                this.f24285c.c();
                this.f24284b.g();
            }
            this.f24287e = 2;
            if (this.f24286d) {
                return;
            }
            this.f24283a.release();
            this.f24286d = true;
        } catch (Throwable th) {
            if (!this.f24286d) {
                this.f24283a.release();
                this.f24286d = true;
            }
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void j(int i9, long j9) {
        this.f24283a.releaseOutputBuffer(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void k(int i9, boolean z9) {
        this.f24283a.releaseOutputBuffer(i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void l(Surface surface) {
        this.f24283a.setOutputSurface(surface);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void m(Bundle bundle) {
        this.f24283a.setParameters(bundle);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void n(int i9) {
        this.f24283a.setVideoScalingMode(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void p() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void q(int i9, int i10, long j9, int i11) {
        this.f24285c.e(i9, i10, j9, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void r(int i9, ec ecVar, long j9) {
        this.f24285c.f(i9, ecVar, j9);
    }
}
