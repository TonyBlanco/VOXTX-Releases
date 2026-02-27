package h1;

import android.os.Process;
import h1.InterfaceC1847b;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: h1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1848c extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f41514h = v.f41583b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f41515a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f41516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1847b f41517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f41518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f41519f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f41520g;

    /* JADX INFO: renamed from: h1.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f41521a;

        public a(n nVar) {
            this.f41521a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C1848c.this.f41516c.put(this.f41521a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public C1848c(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, InterfaceC1847b interfaceC1847b, q qVar) {
        this.f41515a = blockingQueue;
        this.f41516c = blockingQueue2;
        this.f41517d = interfaceC1847b;
        this.f41518e = qVar;
        this.f41520g = new w(this, blockingQueue2, qVar);
    }

    private void b() throws InterruptedException {
        c((n) this.f41515a.take());
    }

    public void c(n nVar) {
        q qVar;
        nVar.b("cache-queue-take");
        nVar.N(1);
        try {
            if (nVar.H()) {
                nVar.p("cache-discard-canceled");
                return;
            }
            InterfaceC1847b.a aVar = this.f41517d.get(nVar.t());
            if (aVar == null) {
                nVar.b("cache-miss");
                if (!this.f41520g.c(nVar)) {
                    this.f41516c.put(nVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.b(jCurrentTimeMillis)) {
                nVar.b("cache-hit-expired");
                nVar.O(aVar);
                if (!this.f41520g.c(nVar)) {
                    this.f41516c.put(nVar);
                }
                return;
            }
            nVar.b("cache-hit");
            p pVarM = nVar.M(new k(aVar.f41506a, aVar.f41512g));
            nVar.b("cache-hit-parsed");
            if (!pVarM.b()) {
                nVar.b("cache-parsing-failed");
                this.f41517d.a(nVar.t(), true);
                nVar.O(null);
                if (!this.f41520g.c(nVar)) {
                    this.f41516c.put(nVar);
                }
                return;
            }
            if (aVar.c(jCurrentTimeMillis)) {
                nVar.b("cache-hit-refresh-needed");
                nVar.O(aVar);
                pVarM.f41579d = true;
                if (!this.f41520g.c(nVar)) {
                    this.f41518e.c(nVar, pVarM, new a(nVar));
                }
                qVar = this.f41518e;
            } else {
                qVar = this.f41518e;
            }
            qVar.b(nVar, pVarM);
        } finally {
            nVar.N(2);
        }
    }

    public void d() {
        this.f41519f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f41514h) {
            v.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f41517d.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f41519f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
