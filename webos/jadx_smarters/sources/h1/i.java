package h1;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f41535a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f41536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1847b f41537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f41538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f41539f = false;

    public i(BlockingQueue blockingQueue, h hVar, InterfaceC1847b interfaceC1847b, q qVar) {
        this.f41535a = blockingQueue;
        this.f41536c = hVar;
        this.f41537d = interfaceC1847b;
        this.f41538e = qVar;
    }

    private void c() throws InterruptedException {
        d((n) this.f41535a.take());
    }

    public final void a(n nVar) {
        TrafficStats.setThreadStatsTag(nVar.E());
    }

    public final void b(n nVar, u uVar) {
        this.f41538e.a(nVar, nVar.L(uVar));
    }

    public void d(n nVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nVar.N(3);
        try {
            try {
                try {
                    nVar.b("network-queue-take");
                } catch (u e9) {
                    e9.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    b(nVar, e9);
                    nVar.J();
                }
            } catch (Exception e10) {
                v.d(e10, "Unhandled exception %s", e10.toString());
                u uVar = new u(e10);
                uVar.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f41538e.a(nVar, uVar);
                nVar.J();
            }
            if (nVar.H()) {
                nVar.p("network-discard-cancelled");
                nVar.J();
                return;
            }
            a(nVar);
            k kVarA = this.f41536c.a(nVar);
            nVar.b("network-http-complete");
            if (kVarA.f41544e && nVar.G()) {
                nVar.p("not-modified");
                nVar.J();
                return;
            }
            p pVarM = nVar.M(kVarA);
            nVar.b("network-parse-complete");
            if (nVar.T() && pVarM.f41577b != null) {
                this.f41537d.b(nVar.t(), pVarM.f41577b);
                nVar.b("network-cache-written");
            }
            nVar.I();
            this.f41538e.b(nVar, pVarM);
            nVar.K(pVarM);
        } finally {
            nVar.N(4);
        }
    }

    public void e() {
        this.f41539f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f41539f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                v.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
