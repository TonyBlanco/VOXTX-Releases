package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
final class xs extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private br f25117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f25118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Error f25119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RuntimeException f25120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private xt f25121e;

    public xs() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final xt a(int i9) {
        boolean z9;
        start();
        this.f25118b = new Handler(getLooper(), this);
        this.f25117a = new br(this.f25118b);
        synchronized (this) {
            z9 = false;
            this.f25118b.obtainMessage(1, i9, 0).sendToTarget();
            while (this.f25121e == null && this.f25120d == null && this.f25119c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f25120d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f25119c;
        if (error != null) {
            throw error;
        }
        xt xtVar = this.f25121e;
        af.s(xtVar);
        return xtVar;
    }

    public final void b() {
        af.s(this.f25118b);
        this.f25118b.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        try {
            if (i9 != 1) {
                if (i9 != 2) {
                    return true;
                }
                try {
                    af.s(this.f25117a);
                    this.f25117a.c();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i10 = message.arg1;
                af.s(this.f25117a);
                this.f25117a.b(i10);
                this.f25121e = new xt(this, this.f25117a.a(), i10 != 0);
                synchronized (this) {
                    notify();
                }
            } catch (bs e9) {
                cd.c("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                this.f25120d = new IllegalStateException(e9);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                cd.c("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f25119c = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                cd.c("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f25120d = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
