package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"HandlerLeak"})
final class wx extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ xc f25021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wy f25022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ww f25024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f25025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread f25027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f25029j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(xc xcVar, Looper looper, wy wyVar, ww wwVar, int i9, long j9) {
        super(looper);
        this.f25021b = xcVar;
        this.f25022c = wyVar;
        this.f25024e = wwVar;
        this.f25020a = i9;
        this.f25023d = j9;
    }

    private final void d() {
        this.f25025f = null;
        xc xcVar = this.f25021b;
        ExecutorService executorService = xcVar.f25039d;
        wx wxVar = xcVar.f25040e;
        af.s(wxVar);
        executorService.execute(wxVar);
    }

    private final void e() {
        this.f25021b.f25040e = null;
    }

    public final void a(boolean z9) {
        this.f25029j = z9;
        this.f25025f = null;
        if (hasMessages(0)) {
            this.f25028i = true;
            removeMessages(0);
            if (!z9) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f25028i = true;
                    this.f25022c.r();
                    Thread thread = this.f25027h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z9) {
            e();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ww wwVar = this.f25024e;
            af.s(wwVar);
            wwVar.bn(this.f25022c, jElapsedRealtime, jElapsedRealtime - this.f25023d, true);
            this.f25024e = null;
        }
    }

    public final void b(int i9) throws IOException {
        IOException iOException = this.f25025f;
        if (iOException != null && this.f25026g > i9) {
            throw iOException;
        }
    }

    public final void c(long j9) {
        af.w(this.f25021b.f25040e == null);
        this.f25021b.f25040e = this;
        if (j9 > 0) {
            sendEmptyMessageDelayed(0, j9);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f25029j) {
            return;
        }
        int i9 = message.what;
        if (i9 == 0) {
            d();
            return;
        }
        if (i9 == 3) {
            throw ((Error) message.obj);
        }
        e();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = jElapsedRealtime - this.f25023d;
        ww wwVar = this.f25024e;
        af.s(wwVar);
        if (this.f25028i) {
            wwVar.bn(this.f25022c, jElapsedRealtime, j9, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            try {
                wwVar.bj(this.f25022c, jElapsedRealtime, j9);
                return;
            } catch (RuntimeException e9) {
                cd.c("LoadTask", "Unexpected exception handling load completed", e9);
                this.f25021b.f25041f = new xb(e9);
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f25025f = iOException;
        int i11 = this.f25026g + 1;
        this.f25026g = i11;
        wv wvVarBk = wwVar.bk(this.f25022c, jElapsedRealtime, j9, iOException, i11);
        if (wvVarBk.f25018a == 3) {
            this.f25021b.f25041f = this.f25025f;
        } else if (wvVarBk.f25018a != 2) {
            if (wvVarBk.f25018a == 1) {
                this.f25026g = 1;
            }
            c(wvVarBk.f25019b != -9223372036854775807L ? wvVarBk.f25019b : Math.min((this.f25026g - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object xbVar;
        Message messageObtainMessage;
        boolean z9;
        try {
            synchronized (this) {
                z9 = !this.f25028i;
                this.f25027h = Thread.currentThread();
            }
            if (z9) {
                af.o("load:" + this.f25022c.getClass().getSimpleName());
                try {
                    this.f25022c.e();
                    af.p();
                } catch (Throwable th) {
                    af.p();
                    throw th;
                }
            }
            synchronized (this) {
                this.f25027h = null;
                Thread.interrupted();
            }
            if (this.f25029j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e9) {
            if (this.f25029j) {
                return;
            }
            messageObtainMessage = obtainMessage(2, e9);
            messageObtainMessage.sendToTarget();
        } catch (Error e10) {
            if (!this.f25029j) {
                cd.c("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(3, e10).sendToTarget();
            }
            throw e10;
        } catch (Exception e11) {
            if (this.f25029j) {
                return;
            }
            cd.c("LoadTask", "Unexpected exception loading stream", e11);
            xbVar = new xb(e11);
            messageObtainMessage = obtainMessage(2, xbVar);
            messageObtainMessage.sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f25029j) {
                return;
            }
            cd.c("LoadTask", "OutOfMemory error loading stream", e12);
            xbVar = new xb(e12);
            messageObtainMessage = obtainMessage(2, xbVar);
            messageObtainMessage.sendToTarget();
        }
    }
}
