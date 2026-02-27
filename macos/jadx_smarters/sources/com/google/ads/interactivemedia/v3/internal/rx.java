package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class rx implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f24445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f24446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f24447c;

    public /* synthetic */ rx(MediaCodec mediaCodec) {
        this.f24445a = mediaCodec;
        if (cq.f22640a < 21) {
            this.f24446b = mediaCodec.getInputBuffers();
            this.f24447c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final int a() {
        return this.f24445a.dequeueInputBuffer(0L);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f24445a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3) {
                if (cq.f22640a < 21) {
                    this.f24447c = this.f24445a.getOutputBuffers();
                }
                iDequeueOutputBuffer = -3;
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final MediaFormat c() {
        return this.f24445a.getOutputFormat();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final ByteBuffer f(int i9) {
        return cq.f22640a >= 21 ? this.f24445a.getInputBuffer(i9) : ((ByteBuffer[]) cq.G(this.f24446b))[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final ByteBuffer g(int i9) {
        return cq.f22640a >= 21 ? this.f24445a.getOutputBuffer(i9) : ((ByteBuffer[]) cq.G(this.f24447c))[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void h() {
        this.f24445a.flush();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void i() {
        this.f24446b = null;
        this.f24447c = null;
        this.f24445a.release();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void j(int i9, long j9) {
        this.f24445a.releaseOutputBuffer(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void k(int i9, boolean z9) {
        this.f24445a.releaseOutputBuffer(i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void l(Surface surface) {
        this.f24445a.setOutputSurface(surface);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void m(Bundle bundle) {
        this.f24445a.setParameters(bundle);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void n(int i9) {
        this.f24445a.setVideoScalingMode(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void p() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void q(int i9, int i10, long j9, int i11) {
        this.f24445a.queueInputBuffer(i9, 0, i10, j9, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rf
    public final void r(int i9, ec ecVar, long j9) {
        this.f24445a.queueSecureInputBuffer(i9, 0, ecVar.a(), j9, 0);
    }
}
