package androidx.work.impl.workers;

import Q0.k;
import R0.j;
import V0.c;
import V0.d;
import Z0.p;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import b1.C1199c;
import c1.InterfaceC1247a;
import java.util.Collections;
import java.util.List;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f17408l = k.f("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WorkerParameters f17409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f17411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1199c f17412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ListenableWorker f17413k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.u();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceFutureC2987b f17415a;

        public b(InterfaceFutureC2987b interfaceFutureC2987b) {
            this.f17415a = interfaceFutureC2987b;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f17410h) {
                try {
                    if (ConstraintTrackingWorker.this.f17411i) {
                        ConstraintTrackingWorker.this.t();
                    } else {
                        ConstraintTrackingWorker.this.f17412j.r(this.f17415a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f17409g = workerParameters;
        this.f17410h = new Object();
        this.f17411i = false;
        this.f17412j = C1199c.t();
    }

    @Override // V0.c
    public void b(List list) {
        k.c().a(f17408l, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f17410h) {
            this.f17411i = true;
        }
    }

    @Override // V0.c
    public void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceC1247a h() {
        return j.m(a()).r();
    }

    @Override // androidx.work.ListenableWorker
    public boolean j() {
        ListenableWorker listenableWorker = this.f17413k;
        return listenableWorker != null && listenableWorker.j();
    }

    @Override // androidx.work.ListenableWorker
    public void m() {
        super.m();
        ListenableWorker listenableWorker = this.f17413k;
        if (listenableWorker == null || listenableWorker.k()) {
            return;
        }
        this.f17413k.q();
    }

    @Override // androidx.work.ListenableWorker
    public InterfaceFutureC2987b p() {
        c().execute(new a());
        return this.f17412j;
    }

    public WorkDatabase r() {
        return j.m(a()).q();
    }

    public void s() {
        this.f17412j.p(ListenableWorker.a.a());
    }

    public void t() {
        this.f17412j.p(ListenableWorker.a.b());
    }

    public void u() {
        String strL = g().l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strL)) {
            k.c().b(f17408l, "No worker to delegate to.", new Throwable[0]);
        } else {
            ListenableWorker listenableWorkerB = i().b(a(), strL, this.f17409g);
            this.f17413k = listenableWorkerB;
            if (listenableWorkerB != null) {
                p pVarH = r().B().h(e().toString());
                if (pVarH == null) {
                    s();
                    return;
                }
                d dVar = new d(a(), h(), this);
                dVar.d(Collections.singletonList(pVarH));
                if (!dVar.c(e().toString())) {
                    k.c().a(f17408l, String.format("Constraints not met for delegate %s. Requesting retry.", strL), new Throwable[0]);
                    t();
                    return;
                }
                k.c().a(f17408l, String.format("Constraints met for delegate %s", strL), new Throwable[0]);
                try {
                    InterfaceFutureC2987b interfaceFutureC2987bP = this.f17413k.p();
                    interfaceFutureC2987bP.addListener(new b(interfaceFutureC2987bP), c());
                    return;
                } catch (Throwable th) {
                    k kVarC = k.c();
                    String str = f17408l;
                    kVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strL), th);
                    synchronized (this.f17410h) {
                        try {
                            if (this.f17411i) {
                                k.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                                t();
                            } else {
                                s();
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            k.c().a(f17408l, "No worker to delegate to.", new Throwable[0]);
        }
        s();
    }
}
