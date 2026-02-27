package p3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import d4.AbstractC1684a;
import d4.a0;
import d4.k0;
import java.io.IOException;
import java.nio.ByteBuffer;
import p3.InterfaceC2407m;

/* JADX INFO: renamed from: p3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2394D implements InterfaceC2407m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f46233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f46234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f46235c;

    /* JADX INFO: renamed from: p3.D$b */
    public static class b implements InterfaceC2407m.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [p3.D$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p3.InterfaceC2407m.b
        public InterfaceC2407m a(InterfaceC2407m.a aVar) throws Throwable {
            MediaCodec mediaCodecB;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                mediaCodecB = b(aVar);
            } catch (IOException e9) {
                e = e9;
            } catch (RuntimeException e10) {
                e = e10;
            }
            try {
                a0.a("configureCodec");
                mediaCodecB.configure(aVar.f46292b, aVar.f46294d, aVar.f46295e, aVar.f46296f);
                a0.c();
                a0.a("startCodec");
                mediaCodecB.start();
                a0.c();
                return new C2394D(mediaCodecB);
            } catch (IOException | RuntimeException e11) {
                e = e11;
                mediaCodec = mediaCodecB;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        public MediaCodec b(InterfaceC2407m.a aVar) throws IOException {
            AbstractC1684a.e(aVar.f46291a);
            String str = aVar.f46291a.f46299a;
            a0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            a0.c();
            return mediaCodecCreateByCodecName;
        }
    }

    public C2394D(MediaCodec mediaCodec) {
        this.f46233a = mediaCodec;
        if (k0.f39777a < 21) {
            this.f46234b = mediaCodec.getInputBuffers();
            this.f46235c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(InterfaceC2407m.c cVar, MediaCodec mediaCodec, long j9, long j10) {
        cVar.a(this, j9, j10);
    }

    @Override // p3.InterfaceC2407m
    public void a(final InterfaceC2407m.c cVar, Handler handler) {
        this.f46233a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: p3.C
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j9, long j10) {
                this.f46231a.p(cVar, mediaCodec, j9, j10);
            }
        }, handler);
    }

    @Override // p3.InterfaceC2407m
    public MediaFormat b() {
        return this.f46233a.getOutputFormat();
    }

    @Override // p3.InterfaceC2407m
    public void c(int i9, int i10, U2.c cVar, long j9, int i11) {
        this.f46233a.queueSecureInputBuffer(i9, i10, cVar.a(), j9, i11);
    }

    @Override // p3.InterfaceC2407m
    public void d(int i9) {
        this.f46233a.setVideoScalingMode(i9);
    }

    @Override // p3.InterfaceC2407m
    public ByteBuffer e(int i9) {
        return k0.f39777a >= 21 ? this.f46233a.getInputBuffer(i9) : ((ByteBuffer[]) k0.j(this.f46234b))[i9];
    }

    @Override // p3.InterfaceC2407m
    public void f(Surface surface) {
        this.f46233a.setOutputSurface(surface);
    }

    @Override // p3.InterfaceC2407m
    public void flush() {
        this.f46233a.flush();
    }

    @Override // p3.InterfaceC2407m
    public void g(int i9, int i10, int i11, long j9, int i12) {
        this.f46233a.queueInputBuffer(i9, i10, i11, j9, i12);
    }

    @Override // p3.InterfaceC2407m
    public boolean h() {
        return false;
    }

    @Override // p3.InterfaceC2407m
    public void i(Bundle bundle) {
        this.f46233a.setParameters(bundle);
    }

    @Override // p3.InterfaceC2407m
    public void j(int i9, long j9) {
        this.f46233a.releaseOutputBuffer(i9, j9);
    }

    @Override // p3.InterfaceC2407m
    public int k() {
        return this.f46233a.dequeueInputBuffer(0L);
    }

    @Override // p3.InterfaceC2407m
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f46233a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && k0.f39777a < 21) {
                this.f46235c = this.f46233a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p3.InterfaceC2407m
    public void m(int i9, boolean z9) {
        this.f46233a.releaseOutputBuffer(i9, z9);
    }

    @Override // p3.InterfaceC2407m
    public ByteBuffer n(int i9) {
        return k0.f39777a >= 21 ? this.f46233a.getOutputBuffer(i9) : ((ByteBuffer[]) k0.j(this.f46235c))[i9];
    }

    @Override // p3.InterfaceC2407m
    public void release() {
        this.f46234b = null;
        this.f46235c = null;
        this.f46233a.release();
    }
}
