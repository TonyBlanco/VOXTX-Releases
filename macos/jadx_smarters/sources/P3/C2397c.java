package p3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import d4.a0;
import java.nio.ByteBuffer;
import p3.C2397c;
import p3.InterfaceC2407m;

/* JADX INFO: renamed from: p3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2397c implements InterfaceC2407m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f46238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2402h f46239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2400f f46240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46243f;

    /* JADX INFO: renamed from: p3.c$b */
    public static final class b implements InterfaceC2407m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r5.r f46244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r5.r f46245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46246c;

        public b(final int i9, boolean z9) {
            this(new r5.r() { // from class: p3.d
                @Override // r5.r
                public final Object get() {
                    return C2397c.b.e(i9);
                }
            }, new r5.r() { // from class: p3.e
                @Override // r5.r
                public final Object get() {
                    return C2397c.b.f(i9);
                }
            }, z9);
        }

        public b(r5.r rVar, r5.r rVar2, boolean z9) {
            this.f46244a = rVar;
            this.f46245b = rVar2;
            this.f46246c = z9;
        }

        public static /* synthetic */ HandlerThread e(int i9) {
            return new HandlerThread(C2397c.s(i9));
        }

        public static /* synthetic */ HandlerThread f(int i9) {
            return new HandlerThread(C2397c.t(i9));
        }

        @Override // p3.InterfaceC2407m.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C2397c a(InterfaceC2407m.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            C2397c c2397c;
            String str = aVar.f46291a.f46299a;
            C2397c c2397c2 = null;
            try {
                a0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    c2397c = new C2397c(mediaCodecCreateByCodecName, (HandlerThread) this.f46244a.get(), (HandlerThread) this.f46245b.get(), this.f46246c);
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Exception e10) {
                e = e10;
                mediaCodecCreateByCodecName = null;
            }
            try {
                a0.c();
                c2397c.v(aVar.f46292b, aVar.f46294d, aVar.f46295e, aVar.f46296f);
                return c2397c;
            } catch (Exception e11) {
                e = e11;
                c2397c2 = c2397c;
                if (c2397c2 != null) {
                    c2397c2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    public C2397c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z9) {
        this.f46238a = mediaCodec;
        this.f46239b = new C2402h(handlerThread);
        this.f46240c = new C2400f(mediaCodec, handlerThread2);
        this.f46241d = z9;
        this.f46243f = 0;
    }

    public static String s(int i9) {
        return u(i9, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String t(int i9) {
        return u(i9, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String u(int i9, String str) {
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

    @Override // p3.InterfaceC2407m
    public void a(final InterfaceC2407m.c cVar, Handler handler) {
        x();
        this.f46238a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: p3.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j9, long j10) {
                this.f46236a.w(cVar, mediaCodec, j9, j10);
            }
        }, handler);
    }

    @Override // p3.InterfaceC2407m
    public MediaFormat b() {
        return this.f46239b.g();
    }

    @Override // p3.InterfaceC2407m
    public void c(int i9, int i10, U2.c cVar, long j9, int i11) {
        this.f46240c.n(i9, i10, cVar, j9, i11);
    }

    @Override // p3.InterfaceC2407m
    public void d(int i9) {
        x();
        this.f46238a.setVideoScalingMode(i9);
    }

    @Override // p3.InterfaceC2407m
    public ByteBuffer e(int i9) {
        return this.f46238a.getInputBuffer(i9);
    }

    @Override // p3.InterfaceC2407m
    public void f(Surface surface) {
        x();
        this.f46238a.setOutputSurface(surface);
    }

    @Override // p3.InterfaceC2407m
    public void flush() {
        this.f46240c.i();
        this.f46238a.flush();
        this.f46239b.e();
        this.f46238a.start();
    }

    @Override // p3.InterfaceC2407m
    public void g(int i9, int i10, int i11, long j9, int i12) {
        this.f46240c.m(i9, i10, i11, j9, i12);
    }

    @Override // p3.InterfaceC2407m
    public boolean h() {
        return false;
    }

    @Override // p3.InterfaceC2407m
    public void i(Bundle bundle) {
        x();
        this.f46238a.setParameters(bundle);
    }

    @Override // p3.InterfaceC2407m
    public void j(int i9, long j9) {
        this.f46238a.releaseOutputBuffer(i9, j9);
    }

    @Override // p3.InterfaceC2407m
    public int k() {
        this.f46240c.l();
        return this.f46239b.c();
    }

    @Override // p3.InterfaceC2407m
    public int l(MediaCodec.BufferInfo bufferInfo) {
        this.f46240c.l();
        return this.f46239b.d(bufferInfo);
    }

    @Override // p3.InterfaceC2407m
    public void m(int i9, boolean z9) {
        this.f46238a.releaseOutputBuffer(i9, z9);
    }

    @Override // p3.InterfaceC2407m
    public ByteBuffer n(int i9) {
        return this.f46238a.getOutputBuffer(i9);
    }

    @Override // p3.InterfaceC2407m
    public void release() {
        try {
            if (this.f46243f == 1) {
                this.f46240c.p();
                this.f46239b.o();
            }
            this.f46243f = 2;
            if (this.f46242e) {
                return;
            }
            this.f46238a.release();
            this.f46242e = true;
        } catch (Throwable th) {
            if (!this.f46242e) {
                this.f46238a.release();
                this.f46242e = true;
            }
            throw th;
        }
    }

    public final void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i9) {
        this.f46239b.h(this.f46238a);
        a0.a("configureCodec");
        this.f46238a.configure(mediaFormat, surface, mediaCrypto, i9);
        a0.c();
        this.f46240c.q();
        a0.a("startCodec");
        this.f46238a.start();
        a0.c();
        this.f46243f = 1;
    }

    public final /* synthetic */ void w(InterfaceC2407m.c cVar, MediaCodec mediaCodec, long j9, long j10) {
        cVar.a(this, j9, j10);
    }

    public final void x() {
        if (this.f46241d) {
            try {
                this.f46240c.r();
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e9);
            }
        }
    }
}
