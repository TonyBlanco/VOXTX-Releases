package e4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.AbstractC1704v;
import d4.RunnableC1697n;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f40335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f40336f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40337a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f40338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40339d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RunnableC1697n f40340a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f40341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Error f40342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public RuntimeException f40343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public j f40344f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public j a(int i9) {
            boolean z9;
            start();
            this.f40341c = new Handler(getLooper(), this);
            this.f40340a = new RunnableC1697n(this.f40341c);
            synchronized (this) {
                z9 = false;
                this.f40341c.obtainMessage(1, i9, 0).sendToTarget();
                while (this.f40344f == null && this.f40343e == null && this.f40342d == null) {
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
            RuntimeException runtimeException = this.f40343e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f40342d;
            if (error == null) {
                return (j) AbstractC1684a.e(this.f40344f);
            }
            throw error;
        }

        public final void b(int i9) throws AbstractC1704v.a {
            AbstractC1684a.e(this.f40340a);
            this.f40340a.h(i9);
            this.f40344f = new j(this, this.f40340a.g(), i9 != 0);
        }

        public void c() {
            AbstractC1684a.e(this.f40341c);
            this.f40341c.sendEmptyMessage(2);
        }

        public final void d() {
            AbstractC1684a.e(this.f40340a);
            this.f40340a.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            try {
                if (i9 != 1) {
                    if (i9 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (AbstractC1704v.a e9) {
                    AbstractC1681B.e("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.f40343e = new IllegalStateException(e9);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    AbstractC1681B.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f40342d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    AbstractC1681B.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f40343e = e11;
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

    public j(b bVar, SurfaceTexture surfaceTexture, boolean z9) {
        super(surfaceTexture);
        this.f40338c = bVar;
        this.f40337a = z9;
    }

    public static int a(Context context) {
        if (AbstractC1704v.h(context)) {
            return AbstractC1704v.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        try {
            if (!f40336f) {
                f40335e = a(context);
                f40336f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40335e != 0;
    }

    public static j d(Context context, boolean z9) {
        AbstractC1684a.g(!z9 || c(context));
        return new b().a(z9 ? f40335e : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f40338c) {
            try {
                if (!this.f40339d) {
                    this.f40338c.c();
                    this.f40339d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
