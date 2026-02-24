package S0;

import Q0.k;
import Q0.r;
import Z0.p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9370d = k.f("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f9372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9373c = new HashMap();

    /* JADX INFO: renamed from: S0.a$a, reason: collision with other inner class name */
    public class RunnableC0116a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9374a;

        public RunnableC0116a(p pVar) {
            this.f9374a = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.c().a(a.f9370d, String.format("Scheduling work %s", this.f9374a.f10811a), new Throwable[0]);
            a.this.f9371a.e(this.f9374a);
        }
    }

    public a(b bVar, r rVar) {
        this.f9371a = bVar;
        this.f9372b = rVar;
    }

    public void a(p pVar) {
        Runnable runnable = (Runnable) this.f9373c.remove(pVar.f10811a);
        if (runnable != null) {
            this.f9372b.a(runnable);
        }
        RunnableC0116a runnableC0116a = new RunnableC0116a(pVar);
        this.f9373c.put(pVar.f10811a, runnableC0116a);
        this.f9372b.b(pVar.a() - System.currentTimeMillis(), runnableC0116a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f9373c.remove(str);
        if (runnable != null) {
            this.f9372b.a(runnable);
        }
    }
}
