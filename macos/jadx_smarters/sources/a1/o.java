package a1;

import android.content.Context;
import androidx.work.ListenableWorker;
import b1.C1199c;
import c1.InterfaceC1247a;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public class o implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f11472h = Q0.k.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1199c f11473a = C1199c.t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0.p f11475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ListenableWorker f11476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q0.f f11477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1247a f11478g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1199c f11479a;

        public a(C1199c c1199c) {
            this.f11479a = c1199c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11479a.r(o.this.f11476e.d());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1199c f11481a;

        public b(C1199c c1199c) {
            this.f11481a = c1199c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Q0.e eVar = (Q0.e) this.f11481a.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o.this.f11475d.f10813c));
                }
                Q0.k.c().a(o.f11472h, String.format("Updating notification for %s", o.this.f11475d.f10813c), new Throwable[0]);
                o.this.f11476e.n(true);
                o oVar = o.this;
                oVar.f11473a.r(oVar.f11477f.a(oVar.f11474c, oVar.f11476e.e(), eVar));
            } catch (Throwable th) {
                o.this.f11473a.q(th);
            }
        }
    }

    public o(Context context, Z0.p pVar, ListenableWorker listenableWorker, Q0.f fVar, InterfaceC1247a interfaceC1247a) {
        this.f11474c = context;
        this.f11475d = pVar;
        this.f11476e = listenableWorker;
        this.f11477f = fVar;
        this.f11478g = interfaceC1247a;
    }

    public InterfaceFutureC2987b a() {
        return this.f11473a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f11475d.f10827q || L.a.c()) {
            this.f11473a.p(null);
            return;
        }
        C1199c c1199cT = C1199c.t();
        this.f11478g.a().execute(new a(c1199cT));
        c1199cT.addListener(new b(c1199cT), this.f11478g.a());
    }
}
