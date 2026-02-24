package M4;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;

/* JADX INFO: loaded from: classes3.dex */
public final class O3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4396a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzcf f4397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4398d;

    public O3(C0760i4 c0760i4, f5 f5Var, zzcf zzcfVar) {
        this.f4398d = c0760i4;
        this.f4396a = f5Var;
        this.f4397c = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strI = null;
        try {
            try {
                if (this.f4398d.f4245a.F().q().j(J2.ANALYTICS_STORAGE)) {
                    C0760i4 c0760i4 = this.f4398d;
                    InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
                    if (interfaceC0799p1 == null) {
                        c0760i4.f4245a.d().r().a("Failed to get app instance id");
                    } else {
                        com.google.android.gms.common.internal.r.m(this.f4396a);
                        strI = interfaceC0799p1.I(this.f4396a);
                        if (strI != null) {
                            this.f4398d.f4245a.I().C(strI);
                            this.f4398d.f4245a.F().f4406g.b(strI);
                        }
                        this.f4398d.E();
                    }
                } else {
                    this.f4398d.f4245a.d().x().a("Analytics storage consent denied; will not get app instance id");
                    this.f4398d.f4245a.I().C(null);
                    this.f4398d.f4245a.F().f4406g.b(null);
                }
            } catch (RemoteException e9) {
                this.f4398d.f4245a.d().r().b("Failed to get app instance id", e9);
            }
            this.f4398d.f4245a.N().K(this.f4397c, strI);
        } catch (Throwable th) {
            this.f4398d.f4245a.N().K(this.f4397c, null);
            throw th;
        }
    }
}
