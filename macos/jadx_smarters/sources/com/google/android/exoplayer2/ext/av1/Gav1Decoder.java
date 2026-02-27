package com.google.android.exoplayer2.ext.av1;

import U2.g;
import U2.i;
import W2.b;
import W2.c;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.decoder.a;
import d4.k0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Gav1Decoder extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f25323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile int f25324o;

    public Gav1Decoder(int i9, int i10, int i11, int i12) throws b {
        super(new g[i9], new VideoDecoderOutputBuffer[i10]);
        if (!c.a()) {
            throw new b("Failed to load decoder native library.");
        }
        if (i12 == 0 && (i12 = gav1GetThreads()) <= 0) {
            i12 = Runtime.getRuntime().availableProcessors();
        }
        long jGav1Init = gav1Init(i12);
        this.f25323n = jGav1Init;
        if (jGav1Init != 0 && gav1CheckError(jGav1Init) != 0) {
            u(i11);
            return;
        }
        throw new b("Failed to initialize decoder. Error: " + gav1GetErrorMessage(jGav1Init));
    }

    private native int gav1CheckError(long j9);

    private native void gav1Close(long j9);

    private native int gav1Decode(long j9, ByteBuffer byteBuffer, int i9);

    private native String gav1GetErrorMessage(long j9);

    private native int gav1GetFrame(long j9, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z9);

    private native int gav1GetThreads();

    private native long gav1Init(int i9);

    private native void gav1ReleaseFrame(long j9, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    private native int gav1RenderFrame(long j9, Surface surface, VideoDecoderOutputBuffer videoDecoderOutputBuffer);

    public void A(int i9) {
        this.f25324o = i9;
    }

    @Override // U2.i
    public g g() {
        return new g(2);
    }

    @Override // U2.d
    public String getName() {
        return "libgav1";
    }

    @Override // U2.i, U2.d
    public void release() {
        super.release();
        gav1Close(this.f25323n);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public VideoDecoderOutputBuffer h() {
        return new VideoDecoderOutputBuffer(new a.InterfaceC0238a() { // from class: W2.a
            @Override // com.google.android.exoplayer2.decoder.a.InterfaceC0238a
            public final void a(com.google.android.exoplayer2.decoder.a aVar) {
                this.f10225a.y((VideoDecoderOutputBuffer) aVar);
            }
        });
    }

    @Override // U2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public b i(Throwable th) {
        return new b("Unexpected decode error", th);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b j(g gVar, VideoDecoderOutputBuffer videoDecoderOutputBuffer, boolean z9) {
        ByteBuffer byteBuffer = (ByteBuffer) k0.j(gVar.f9699d);
        if (gav1Decode(this.f25323n, byteBuffer, byteBuffer.limit()) == 0) {
            return new b("gav1Decode error: " + gav1GetErrorMessage(this.f25323n));
        }
        boolean zIsDecodeOnly = gVar.isDecodeOnly();
        if (!zIsDecodeOnly) {
            videoDecoderOutputBuffer.init(gVar.f9701f, this.f25324o, null);
        }
        int iGav1GetFrame = gav1GetFrame(this.f25323n, videoDecoderOutputBuffer, zIsDecodeOnly);
        if (iGav1GetFrame == 0) {
            return new b("gav1GetFrame error: " + gav1GetErrorMessage(this.f25323n));
        }
        if (iGav1GetFrame == 2) {
            videoDecoderOutputBuffer.addFlag(Integer.MIN_VALUE);
        }
        if (!zIsDecodeOnly) {
            videoDecoderOutputBuffer.format = gVar.f9697a;
        }
        return null;
    }

    public void y(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        if (videoDecoderOutputBuffer.mode == 1 && !videoDecoderOutputBuffer.isDecodeOnly()) {
            gav1ReleaseFrame(this.f25323n, videoDecoderOutputBuffer);
        }
        super.r(videoDecoderOutputBuffer);
    }

    public void z(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws b {
        if (videoDecoderOutputBuffer.mode != 1) {
            throw new b("Invalid output mode.");
        }
        if (gav1RenderFrame(this.f25323n, surface, videoDecoderOutputBuffer) != 0) {
            return;
        }
        throw new b("Buffer render error: " + gav1GetErrorMessage(this.f25323n));
    }
}
