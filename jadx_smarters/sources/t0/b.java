package T0;

import Q0.k;
import R0.e;
import Z0.p;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class b implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9498c = k.f("SystemAlarmScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9499a;

    public b(Context context) {
        this.f9499a = context.getApplicationContext();
    }

    @Override // R0.e
    public void a(String str) {
        this.f9499a.startService(androidx.work.impl.background.systemalarm.a.g(this.f9499a, str));
    }

    public final void b(p pVar) {
        k.c().a(f9498c, String.format("Scheduling work with workSpecId %s", pVar.f10811a), new Throwable[0]);
        this.f9499a.startService(androidx.work.impl.background.systemalarm.a.f(this.f9499a, pVar.f10811a));
    }

    @Override // R0.e
    public boolean c() {
        return true;
    }

    @Override // R0.e
    public void e(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }
}
