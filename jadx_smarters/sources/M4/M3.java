package M4;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class M3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4371a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4372c;

    public M3(C0760i4 c0760i4, f5 f5Var) {
        this.f4372c = c0760i4;
        this.f4371a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4372c;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.r.m(this.f4371a);
            interfaceC0799p1.T0(this.f4371a);
        } catch (RemoteException e9) {
            this.f4372c.f4245a.d().r().b("Failed to reset data on the service: remote exception", e9);
        }
        this.f4372c.E();
    }
}
