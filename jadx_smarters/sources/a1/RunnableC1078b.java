package a1;

import Q0.n;
import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: a1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1078b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11450d = Q0.k.f("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.g f11451a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R0.c f11452c = new R0.c();

    public RunnableC1078b(R0.g gVar) {
        this.f11451a = gVar;
    }

    public static boolean b(R0.g gVar) {
        boolean zC = c(gVar.g(), gVar.f(), (String[]) R0.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d2 A[LOOP:5: B:120:0x01cc->B:122:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0142 A[PHI: r1 r9 r12 r13 r14
      0x0142: PHI (r1v1 java.lang.String[]) = 
      (r1v0 java.lang.String[])
      (r1v0 java.lang.String[])
      (r1v0 java.lang.String[])
      (r1v4 java.lang.String[])
      (r1v4 java.lang.String[])
     binds: [B:28:0x0064, B:29:0x0066, B:31:0x0074, B:82:0x0141, B:81:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r9v2 boolean) = (r9v1 boolean), (r9v1 boolean), (r9v1 boolean), (r9v6 boolean), (r9v7 boolean) binds: [B:28:0x0064, B:29:0x0066, B:31:0x0074, B:82:0x0141, B:81:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v4 boolean), (r12v4 boolean) binds: [B:28:0x0064, B:29:0x0066, B:31:0x0074, B:82:0x0141, B:81:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0064, B:29:0x0066, B:31:0x0074, B:82:0x0141, B:81:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0142: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v1 boolean), (r14v5 boolean), (r14v5 boolean) binds: [B:28:0x0064, B:29:0x0066, B:31:0x0074, B:82:0x0141, B:81:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(R0.j r19, java.util.List r20, java.lang.String[] r21, java.lang.String r22, Q0.d r23) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.RunnableC1078b.c(R0.j, java.util.List, java.lang.String[], java.lang.String, Q0.d):boolean");
    }

    public static boolean e(R0.g gVar) {
        List<R0.g> listE = gVar.e();
        boolean z9 = false;
        if (listE != null) {
            boolean zE = false;
            for (R0.g gVar2 : listE) {
                if (gVar2.j()) {
                    Q0.k.c().h(f11450d, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    zE |= e(gVar2);
                }
            }
            z9 = zE;
        }
        return b(gVar) | z9;
    }

    public static void g(Z0.p pVar) {
        Q0.b bVar = pVar.f10820j;
        String str = pVar.f10813c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f10815e).h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f10813c = ConstraintTrackingWorker.class.getName();
            pVar.f10815e = aVar.a();
        }
    }

    public static boolean h(R0.j jVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator it = jVar.p().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((R0.e) it.next()).getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase workDatabaseQ = this.f11451a.g().q();
        workDatabaseQ.c();
        try {
            boolean zE = e(this.f11451a);
            workDatabaseQ.r();
            return zE;
        } finally {
            workDatabaseQ.g();
        }
    }

    public Q0.n d() {
        return this.f11452c;
    }

    public void f() {
        R0.j jVarG = this.f11451a.g();
        R0.f.b(jVarG.k(), jVarG.q(), jVarG.p());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f11451a.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f11451a));
            }
            if (a()) {
                g.a(this.f11451a.g().j(), RescheduleReceiver.class, true);
                f();
            }
            this.f11452c.a(Q0.n.f7464a);
        } catch (Throwable th) {
            this.f11452c.a(new n.b.a(th));
        }
    }
}
