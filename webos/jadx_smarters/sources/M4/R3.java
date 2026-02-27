package M4;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class R3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4452a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f4453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4454d;

    public R3(C0760i4 c0760i4, f5 f5Var, Bundle bundle) {
        this.f4454d = c0760i4;
        this.f4452a = f5Var;
        this.f4453c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4454d;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Failed to send default event parameters to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.r.m(this.f4452a);
            interfaceC0799p1.z0(this.f4453c, this.f4452a);
        } catch (RemoteException e9) {
            this.f4454d.f4245a.d().r().b("Failed to send default event parameters to service", e9);
        }
    }
}
