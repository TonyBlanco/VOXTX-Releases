package a1;

import Q0.t;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f11466e = Q0.k.f("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.j f11467a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11469d;

    public m(R0.j jVar, String str, boolean z9) {
        this.f11467a = jVar;
        this.f11468c = str;
        this.f11469d = z9;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        WorkDatabase workDatabaseQ = this.f11467a.q();
        R0.d dVarO = this.f11467a.o();
        Z0.q qVarB = workDatabaseQ.B();
        workDatabaseQ.c();
        try {
            boolean zH = dVarO.h(this.f11468c);
            if (this.f11469d) {
                zO = this.f11467a.o().n(this.f11468c);
            } else {
                if (!zH && qVarB.g(this.f11468c) == t.RUNNING) {
                    qVarB.d(t.ENQUEUED, this.f11468c);
                }
                zO = this.f11467a.o().o(this.f11468c);
            }
            Q0.k.c().a(f11466e, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f11468c, Boolean.valueOf(zO)), new Throwable[0]);
            workDatabaseQ.r();
            workDatabaseQ.g();
        } catch (Throwable th) {
            workDatabaseQ.g();
            throw th;
        }
    }
}
