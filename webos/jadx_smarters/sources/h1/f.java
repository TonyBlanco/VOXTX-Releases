package h1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f41527a;

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f41528a;

        public a(Handler handler) {
            this.f41528a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f41528a.post(runnable);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f41530a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p f41531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f41532d;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f41530a = nVar;
            this.f41531c = pVar;
            this.f41532d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f41530a.H()) {
                this.f41530a.p("canceled-at-delivery");
                return;
            }
            if (this.f41531c.b()) {
                this.f41530a.l(this.f41531c.f41576a);
            } else {
                this.f41530a.j(this.f41531c.f41578c);
            }
            if (this.f41531c.f41579d) {
                this.f41530a.b("intermediate-response");
            } else {
                this.f41530a.p("done");
            }
            Runnable runnable = this.f41532d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f41527a = new a(handler);
    }

    @Override // h1.q
    public void a(n nVar, u uVar) {
        nVar.b("post-error");
        this.f41527a.execute(new b(nVar, p.a(uVar), null));
    }

    @Override // h1.q
    public void b(n nVar, p pVar) {
        c(nVar, pVar, null);
    }

    @Override // h1.q
    public void c(n nVar, p pVar, Runnable runnable) {
        nVar.I();
        nVar.b("post-response");
        this.f41527a.execute(new b(nVar, pVar, runnable));
    }
}
