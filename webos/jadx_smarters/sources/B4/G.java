package b4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.a0;
import d4.k0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f17498d = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f17499e = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f17500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f17501g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f17502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f17503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f17504c;

    public interface b {
        void W(e eVar, long j9, long j10);

        c j(e eVar, long j9, long j10, IOException iOException, int i9);

        void t(e eVar, long j9, long j10, boolean z9);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17506b;

        public c(int i9, long j9) {
            this.f17505a = i9;
            this.f17506b = j9;
        }

        public boolean c() {
            int i9 = this.f17505a;
            return i9 == 0 || i9 == 1;
        }
    }

    public final class d extends Handler implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17507a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f17508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f17509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f17510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IOException f17511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Thread f17513h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f17514i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f17515j;

        public d(Looper looper, e eVar, b bVar, int i9, long j9) {
            super(looper);
            this.f17508c = eVar;
            this.f17510e = bVar;
            this.f17507a = i9;
            this.f17509d = j9;
        }

        public void a(boolean z9) {
            this.f17515j = z9;
            this.f17511f = null;
            if (hasMessages(0)) {
                this.f17514i = true;
                removeMessages(0);
                if (!z9) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f17514i = true;
                        this.f17508c.c();
                        Thread thread = this.f17513h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z9) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) AbstractC1684a.e(this.f17510e)).t(this.f17508c, jElapsedRealtime, jElapsedRealtime - this.f17509d, true);
                this.f17510e = null;
            }
        }

        public final void b() {
            this.f17511f = null;
            G.this.f17502a.execute((Runnable) AbstractC1684a.e(G.this.f17503b));
        }

        public final void c() {
            G.this.f17503b = null;
        }

        public final long d() {
            return Math.min((this.f17512g - 1) * 1000, 5000);
        }

        public void e(int i9) throws IOException {
            IOException iOException = this.f17511f;
            if (iOException != null && this.f17512g > i9) {
                throw iOException;
            }
        }

        public void f(long j9) {
            AbstractC1684a.g(G.this.f17503b == null);
            G.this.f17503b = this;
            if (j9 > 0) {
                sendEmptyMessageDelayed(0, j9);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f17515j) {
                return;
            }
            int i9 = message.what;
            if (i9 == 0) {
                b();
                return;
            }
            if (i9 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j9 = jElapsedRealtime - this.f17509d;
            b bVar = (b) AbstractC1684a.e(this.f17510e);
            if (this.f17514i) {
                bVar.t(this.f17508c, jElapsedRealtime, j9, false);
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                try {
                    bVar.W(this.f17508c, jElapsedRealtime, j9);
                    return;
                } catch (RuntimeException e9) {
                    AbstractC1681B.e("LoadTask", "Unexpected exception handling load completed", e9);
                    G.this.f17504c = new h(e9);
                    return;
                }
            }
            if (i10 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f17511f = iOException;
            int i11 = this.f17512g + 1;
            this.f17512g = i11;
            c cVarJ = bVar.j(this.f17508c, jElapsedRealtime, j9, iOException, i11);
            if (cVarJ.f17505a == 3) {
                G.this.f17504c = this.f17511f;
            } else if (cVarJ.f17505a != 2) {
                if (cVarJ.f17505a == 1) {
                    this.f17512g = 1;
                }
                f(cVarJ.f17506b != -9223372036854775807L ? cVarJ.f17506b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object hVar;
            Message messageObtainMessage;
            boolean z9;
            try {
                synchronized (this) {
                    z9 = !this.f17514i;
                    this.f17513h = Thread.currentThread();
                }
                if (z9) {
                    a0.a("load:" + this.f17508c.getClass().getSimpleName());
                    try {
                        this.f17508c.a();
                        a0.c();
                    } catch (Throwable th) {
                        a0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f17513h = null;
                    Thread.interrupted();
                }
                if (this.f17515j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e9) {
                if (this.f17515j) {
                    return;
                }
                messageObtainMessage = obtainMessage(2, e9);
                messageObtainMessage.sendToTarget();
            } catch (Error e10) {
                if (!this.f17515j) {
                    AbstractC1681B.e("LoadTask", "Unexpected error loading stream", e10);
                    obtainMessage(3, e10).sendToTarget();
                }
                throw e10;
            } catch (Exception e11) {
                if (this.f17515j) {
                    return;
                }
                AbstractC1681B.e("LoadTask", "Unexpected exception loading stream", e11);
                hVar = new h(e11);
                messageObtainMessage = obtainMessage(2, hVar);
                messageObtainMessage.sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f17515j) {
                    return;
                }
                AbstractC1681B.e("LoadTask", "OutOfMemory error loading stream", e12);
                hVar = new h(e12);
                messageObtainMessage = obtainMessage(2, hVar);
                messageObtainMessage.sendToTarget();
            }
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void o();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f17517a;

        public g(f fVar) {
            this.f17517a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17517a.o();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j9 = -9223372036854775807L;
        f17500f = new c(2, j9);
        f17501g = new c(3, j9);
    }

    public G(String str) {
        this.f17502a = k0.Q0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z9, long j9) {
        return new c(z9 ? 1 : 0, j9);
    }

    @Override // b4.H
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) AbstractC1684a.i(this.f17503b)).a(false);
    }

    public void g() {
        this.f17504c = null;
    }

    public boolean i() {
        return this.f17504c != null;
    }

    public boolean j() {
        return this.f17503b != null;
    }

    public void k(int i9) throws IOException {
        IOException iOException = this.f17504c;
        if (iOException != null) {
            throw iOException;
        }
        d dVar = this.f17503b;
        if (dVar != null) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = dVar.f17507a;
            }
            dVar.e(i9);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d dVar = this.f17503b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f17502a.execute(new g(fVar));
        }
        this.f17502a.shutdown();
    }

    public long n(e eVar, b bVar, int i9) {
        Looper looper = (Looper) AbstractC1684a.i(Looper.myLooper());
        this.f17504c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, eVar, bVar, i9, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
