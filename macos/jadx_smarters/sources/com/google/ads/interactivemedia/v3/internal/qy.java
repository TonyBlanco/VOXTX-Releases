package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class qy extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f24305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f24306c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f24311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f24312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f24313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f24315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IllegalStateException f24316m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24304a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rc f24307d = new rc();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rc f24308e = new rc();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f24309f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f24310g = new ArrayDeque();

    public qy(HandlerThread handlerThread) {
        this.f24305b = handlerThread;
    }

    public static /* synthetic */ void d(qy qyVar) {
        synchronized (qyVar.f24304a) {
            try {
                if (qyVar.f24315l) {
                    return;
                }
                long j9 = qyVar.f24314k - 1;
                qyVar.f24314k = j9;
                if (j9 > 0) {
                    return;
                }
                if (j9 >= 0) {
                    qyVar.i();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (qyVar.f24304a) {
                    qyVar.f24316m = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void h(MediaFormat mediaFormat) {
        this.f24308e.b(-2);
        this.f24310g.add(mediaFormat);
    }

    private final void i() {
        if (!this.f24310g.isEmpty()) {
            this.f24312i = (MediaFormat) this.f24310g.getLast();
        }
        this.f24307d.c();
        this.f24308e.c();
        this.f24309f.clear();
        this.f24310g.clear();
        this.f24313j = null;
    }

    private final void j() {
        IllegalStateException illegalStateException = this.f24316m;
        if (illegalStateException != null) {
            this.f24316m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f24313j;
        if (codecException == null) {
            return;
        }
        this.f24313j = null;
        throw codecException;
    }

    private final boolean k() {
        return this.f24314k > 0 || this.f24315l;
    }

    public final int a() {
        synchronized (this.f24304a) {
            try {
                int iA = -1;
                if (k()) {
                    return -1;
                }
                j();
                if (!this.f24307d.d()) {
                    iA = this.f24307d.a();
                }
                return iA;
            } finally {
            }
        }
    }

    public final int b(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24304a) {
            try {
                if (k()) {
                    return -1;
                }
                j();
                if (this.f24308e.d()) {
                    return -1;
                }
                int iA = this.f24308e.a();
                if (iA >= 0) {
                    af.t(this.f24311h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f24309f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iA == -2) {
                    this.f24311h = (MediaFormat) this.f24310g.remove();
                    iA = -2;
                }
                return iA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f24304a) {
            try {
                mediaFormat = this.f24311h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f24304a) {
            this.f24314k++;
            Handler handler = this.f24306c;
            int i9 = cq.f22640a;
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.qx
                @Override // java.lang.Runnable
                public final void run() {
                    qy.d(this.f24303a);
                }
            });
        }
    }

    public final void f(MediaCodec mediaCodec) {
        af.w(this.f24306c == null);
        this.f24305b.start();
        Handler handler = new Handler(this.f24305b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f24306c = handler;
    }

    public final void g() {
        synchronized (this.f24304a) {
            this.f24315l = true;
            this.f24305b.quit();
            i();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f24304a) {
            this.f24313j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.f24304a) {
            this.f24307d.b(i9);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f24304a) {
            try {
                MediaFormat mediaFormat = this.f24312i;
                if (mediaFormat != null) {
                    h(mediaFormat);
                    this.f24312i = null;
                }
                this.f24308e.b(i9);
                this.f24309f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f24304a) {
            h(mediaFormat);
            this.f24312i = null;
        }
    }
}
