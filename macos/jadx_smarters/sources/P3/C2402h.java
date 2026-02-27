package p3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: p3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2402h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f46266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f46267c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f46272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f46273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f46274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f46277m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46265a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2406l f46268d = new C2406l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2406l f46269e = new C2406l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f46270f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f46271g = new ArrayDeque();

    public C2402h(HandlerThread handlerThread) {
        this.f46266b = handlerThread;
    }

    public final void b(MediaFormat mediaFormat) {
        this.f46269e.a(-2);
        this.f46271g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f46265a) {
            try {
                int iE = -1;
                if (i()) {
                    return -1;
                }
                j();
                if (!this.f46268d.d()) {
                    iE = this.f46268d.e();
                }
                return iE;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f46265a) {
            try {
                if (i()) {
                    return -1;
                }
                j();
                if (this.f46269e.d()) {
                    return -1;
                }
                int iE = this.f46269e.e();
                if (iE >= 0) {
                    AbstractC1684a.i(this.f46272h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f46270f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    this.f46272h = (MediaFormat) this.f46271g.remove();
                }
                return iE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f46265a) {
            this.f46275k++;
            ((Handler) k0.j(this.f46267c)).post(new Runnable() { // from class: p3.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46264a.m();
                }
            });
        }
    }

    public final void f() {
        if (!this.f46271g.isEmpty()) {
            this.f46273i = (MediaFormat) this.f46271g.getLast();
        }
        this.f46268d.b();
        this.f46269e.b();
        this.f46270f.clear();
        this.f46271g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f46265a) {
            try {
                mediaFormat = this.f46272h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        AbstractC1684a.g(this.f46267c == null);
        this.f46266b.start();
        Handler handler = new Handler(this.f46266b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f46267c = handler;
    }

    public final boolean i() {
        return this.f46275k > 0 || this.f46276l;
    }

    public final void j() {
        k();
        l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.f46277m;
        if (illegalStateException == null) {
            return;
        }
        this.f46277m = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CodecException codecException = this.f46274j;
        if (codecException == null) {
            return;
        }
        this.f46274j = null;
        throw codecException;
    }

    public final void m() {
        synchronized (this.f46265a) {
            try {
                if (this.f46276l) {
                    return;
                }
                long j9 = this.f46275k - 1;
                this.f46275k = j9;
                if (j9 > 0) {
                    return;
                }
                if (j9 < 0) {
                    n(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(IllegalStateException illegalStateException) {
        synchronized (this.f46265a) {
            this.f46277m = illegalStateException;
        }
    }

    public void o() {
        synchronized (this.f46265a) {
            this.f46276l = true;
            this.f46266b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f46265a) {
            this.f46274j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.f46265a) {
            this.f46268d.a(i9);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f46265a) {
            try {
                MediaFormat mediaFormat = this.f46273i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f46273i = null;
                }
                this.f46269e.a(i9);
                this.f46270f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f46265a) {
            b(mediaFormat);
            this.f46273i = null;
        }
    }
}
