package R0;

import Z0.p;
import Z0.q;
import Z0.t;
import a1.o;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import b1.C1199c;
import c1.InterfaceC1247a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f8502u = Q0.k.f("WorkerWrapper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8503a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f8505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkerParameters.a f8506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f8507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListenableWorker f8508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1247a f8509h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.work.a f8511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Y0.a f8512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WorkDatabase f8513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q f8514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Z0.b f8515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f8516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f8517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f8518q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f8521t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ListenableWorker.a f8510i = ListenableWorker.a.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1199c f8519r = C1199c.t();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceFutureC2987b f8520s = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceFutureC2987b f8522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C1199c f8523c;

        public a(InterfaceFutureC2987b interfaceFutureC2987b, C1199c c1199c) {
            this.f8522a = interfaceFutureC2987b;
            this.f8523c = c1199c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8522a.get();
                Q0.k.c().a(k.f8502u, String.format("Starting work for %s", k.this.f8507f.f10813c), new Throwable[0]);
                k kVar = k.this;
                kVar.f8520s = kVar.f8508g.p();
                this.f8523c.r(k.this.f8520s);
            } catch (Throwable th) {
                this.f8523c.q(th);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1199c f8525a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f8526c;

        public b(C1199c c1199c, String str) {
            this.f8525a = c1199c;
            this.f8526c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f8525a.get();
                    if (aVar == null) {
                        Q0.k.c().b(k.f8502u, String.format("%s returned a null result. Treating it as a failure.", k.this.f8507f.f10813c), new Throwable[0]);
                    } else {
                        Q0.k.c().a(k.f8502u, String.format("%s returned a %s result.", k.this.f8507f.f10813c, aVar), new Throwable[0]);
                        k.this.f8510i = aVar;
                    }
                } catch (InterruptedException e9) {
                    e = e9;
                    Q0.k.c().b(k.f8502u, String.format("%s failed because it threw an exception/error", this.f8526c), e);
                } catch (CancellationException e10) {
                    Q0.k.c().d(k.f8502u, String.format("%s was cancelled", this.f8526c), e10);
                } catch (ExecutionException e11) {
                    e = e11;
                    Q0.k.c().b(k.f8502u, String.format("%s failed because it threw an exception/error", this.f8526c), e);
                }
                k.this.f();
            } catch (Throwable th) {
                k.this.f();
                throw th;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f8528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ListenableWorker f8529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Y0.a f8530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC1247a f8531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.work.a f8532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WorkDatabase f8533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f8534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public List f8535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public WorkerParameters.a f8536i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, InterfaceC1247a interfaceC1247a, Y0.a aVar2, WorkDatabase workDatabase, String str) {
            this.f8528a = context.getApplicationContext();
            this.f8531d = interfaceC1247a;
            this.f8530c = aVar2;
            this.f8532e = aVar;
            this.f8533f = workDatabase;
            this.f8534g = str;
        }

        public k a() {
            return new k(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f8536i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.f8535h = list;
            return this;
        }
    }

    public k(c cVar) {
        this.f8503a = cVar.f8528a;
        this.f8509h = cVar.f8531d;
        this.f8512k = cVar.f8530c;
        this.f8504c = cVar.f8534g;
        this.f8505d = cVar.f8535h;
        this.f8506e = cVar.f8536i;
        this.f8508g = cVar.f8529b;
        this.f8511j = cVar.f8532e;
        WorkDatabase workDatabase = cVar.f8533f;
        this.f8513l = workDatabase;
        this.f8514m = workDatabase.B();
        this.f8515n = this.f8513l.t();
        this.f8516o = this.f8513l.C();
    }

    public final String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f8504c);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z9) {
                z9 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    public InterfaceFutureC2987b b() {
        return this.f8519r;
    }

    public final void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            Q0.k.c().d(f8502u, String.format("Worker result SUCCESS for %s", this.f8518q), new Throwable[0]);
            if (!this.f8507f.d()) {
                m();
                return;
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            Q0.k.c().d(f8502u, String.format("Worker result RETRY for %s", this.f8518q), new Throwable[0]);
            g();
            return;
        } else {
            Q0.k.c().d(f8502u, String.format("Worker result FAILURE for %s", this.f8518q), new Throwable[0]);
            if (!this.f8507f.d()) {
                l();
                return;
            }
        }
        h();
    }

    public void d() {
        boolean zIsDone;
        this.f8521t = true;
        n();
        InterfaceFutureC2987b interfaceFutureC2987b = this.f8520s;
        if (interfaceFutureC2987b != null) {
            zIsDone = interfaceFutureC2987b.isDone();
            this.f8520s.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f8508g;
        if (listenableWorker == null || zIsDone) {
            Q0.k.c().a(f8502u, String.format("WorkSpec %s is already done. Not interrupting.", this.f8507f), new Throwable[0]);
        } else {
            listenableWorker.q();
        }
    }

    public final void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f8514m.g(str2) != Q0.t.CANCELLED) {
                this.f8514m.d(Q0.t.FAILED, str2);
            }
            linkedList.addAll(this.f8515n.a(str2));
        }
    }

    public void f() {
        if (!n()) {
            this.f8513l.c();
            try {
                Q0.t tVarG = this.f8514m.g(this.f8504c);
                this.f8513l.A().a(this.f8504c);
                if (tVarG == null) {
                    i(false);
                } else if (tVarG == Q0.t.RUNNING) {
                    c(this.f8510i);
                } else if (!tVarG.isFinished()) {
                    g();
                }
                this.f8513l.r();
                this.f8513l.g();
            } catch (Throwable th) {
                this.f8513l.g();
                throw th;
            }
        }
        List list = this.f8505d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(this.f8504c);
            }
            f.b(this.f8511j, this.f8513l, this.f8505d);
        }
    }

    public final void g() {
        this.f8513l.c();
        try {
            this.f8514m.d(Q0.t.ENQUEUED, this.f8504c);
            this.f8514m.u(this.f8504c, System.currentTimeMillis());
            this.f8514m.m(this.f8504c, -1L);
            this.f8513l.r();
        } finally {
            this.f8513l.g();
            i(true);
        }
    }

    public final void h() {
        this.f8513l.c();
        try {
            this.f8514m.u(this.f8504c, System.currentTimeMillis());
            this.f8514m.d(Q0.t.ENQUEUED, this.f8504c);
            this.f8514m.s(this.f8504c);
            this.f8514m.m(this.f8504c, -1L);
            this.f8513l.r();
        } finally {
            this.f8513l.g();
            i(false);
        }
    }

    public final void i(boolean z9) {
        ListenableWorker listenableWorker;
        this.f8513l.c();
        try {
            if (!this.f8513l.B().r()) {
                a1.g.a(this.f8503a, RescheduleReceiver.class, false);
            }
            if (z9) {
                this.f8514m.d(Q0.t.ENQUEUED, this.f8504c);
                this.f8514m.m(this.f8504c, -1L);
            }
            if (this.f8507f != null && (listenableWorker = this.f8508g) != null && listenableWorker.j()) {
                this.f8512k.a(this.f8504c);
            }
            this.f8513l.r();
            this.f8513l.g();
            this.f8519r.p(Boolean.valueOf(z9));
        } catch (Throwable th) {
            this.f8513l.g();
            throw th;
        }
    }

    public final void j() {
        Q0.t tVarG = this.f8514m.g(this.f8504c);
        if (tVarG == Q0.t.RUNNING) {
            Q0.k.c().a(f8502u, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f8504c), new Throwable[0]);
            i(true);
        } else {
            Q0.k.c().a(f8502u, String.format("Status for %s is %s; not doing any work", this.f8504c, tVarG), new Throwable[0]);
            i(false);
        }
    }

    public final void k() {
        androidx.work.b bVarB;
        if (n()) {
            return;
        }
        this.f8513l.c();
        try {
            p pVarH = this.f8514m.h(this.f8504c);
            this.f8507f = pVarH;
            if (pVarH == null) {
                Q0.k.c().b(f8502u, String.format("Didn't find WorkSpec for id %s", this.f8504c), new Throwable[0]);
                i(false);
                this.f8513l.r();
                return;
            }
            if (pVarH.f10812b != Q0.t.ENQUEUED) {
                j();
                this.f8513l.r();
                Q0.k.c().a(f8502u, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f8507f.f10813c), new Throwable[0]);
                return;
            }
            if (pVarH.d() || this.f8507f.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                p pVar = this.f8507f;
                if (pVar.f10824n != 0 && jCurrentTimeMillis < pVar.a()) {
                    Q0.k.c().a(f8502u, String.format("Delaying execution for %s because it is being executed before schedule.", this.f8507f.f10813c), new Throwable[0]);
                    i(true);
                    this.f8513l.r();
                    return;
                }
            }
            this.f8513l.r();
            this.f8513l.g();
            if (this.f8507f.d()) {
                bVarB = this.f8507f.f10815e;
            } else {
                Q0.h hVarB = this.f8511j.f().b(this.f8507f.f10814d);
                if (hVarB == null) {
                    Q0.k.c().b(f8502u, String.format("Could not create Input Merger %s", this.f8507f.f10814d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f8507f.f10815e);
                    arrayList.addAll(this.f8514m.j(this.f8504c));
                    bVarB = hVarB.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f8504c), bVarB, this.f8517p, this.f8506e, this.f8507f.f10821k, this.f8511j.e(), this.f8509h, this.f8511j.m(), new a1.q(this.f8513l, this.f8509h), new a1.p(this.f8513l, this.f8512k, this.f8509h));
            if (this.f8508g == null) {
                this.f8508g = this.f8511j.m().b(this.f8503a, this.f8507f.f10813c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f8508g;
            if (listenableWorker == null) {
                Q0.k.c().b(f8502u, String.format("Could not create Worker %s", this.f8507f.f10813c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.l()) {
                Q0.k.c().b(f8502u, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f8507f.f10813c), new Throwable[0]);
                l();
                return;
            }
            this.f8508g.o();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            C1199c c1199cT = C1199c.t();
            o oVar = new o(this.f8503a, this.f8507f, this.f8508g, workerParameters.b(), this.f8509h);
            this.f8509h.a().execute(oVar);
            InterfaceFutureC2987b interfaceFutureC2987bA = oVar.a();
            interfaceFutureC2987bA.addListener(new a(interfaceFutureC2987bA, c1199cT), this.f8509h.a());
            c1199cT.addListener(new b(c1199cT, this.f8518q), this.f8509h.c());
        } finally {
            this.f8513l.g();
        }
    }

    public void l() {
        this.f8513l.c();
        try {
            e(this.f8504c);
            this.f8514m.p(this.f8504c, ((ListenableWorker.a.C0201a) this.f8510i).e());
            this.f8513l.r();
        } finally {
            this.f8513l.g();
            i(false);
        }
    }

    public final void m() {
        this.f8513l.c();
        try {
            this.f8514m.d(Q0.t.SUCCEEDED, this.f8504c);
            this.f8514m.p(this.f8504c, ((ListenableWorker.a.c) this.f8510i).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f8515n.a(this.f8504c)) {
                if (this.f8514m.g(str) == Q0.t.BLOCKED && this.f8515n.b(str)) {
                    Q0.k.c().d(f8502u, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f8514m.d(Q0.t.ENQUEUED, str);
                    this.f8514m.u(str, jCurrentTimeMillis);
                }
            }
            this.f8513l.r();
            this.f8513l.g();
            i(false);
        } catch (Throwable th) {
            this.f8513l.g();
            i(false);
            throw th;
        }
    }

    public final boolean n() {
        if (!this.f8521t) {
            return false;
        }
        Q0.k.c().a(f8502u, String.format("Work interrupted for %s", this.f8518q), new Throwable[0]);
        if (this.f8514m.g(this.f8504c) == null) {
            i(false);
        } else {
            i(!r1.isFinished());
        }
        return true;
    }

    public final boolean o() {
        boolean z9;
        this.f8513l.c();
        try {
            if (this.f8514m.g(this.f8504c) == Q0.t.ENQUEUED) {
                this.f8514m.d(Q0.t.RUNNING, this.f8504c);
                this.f8514m.t(this.f8504c);
                z9 = true;
            } else {
                z9 = false;
            }
            this.f8513l.r();
            this.f8513l.g();
            return z9;
        } catch (Throwable th) {
            this.f8513l.g();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List listA = this.f8516o.a(this.f8504c);
        this.f8517p = listA;
        this.f8518q = a(listA);
        k();
    }
}
