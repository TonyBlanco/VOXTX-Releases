package M4;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class V3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4516a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4517c;

    public V3(C0760i4 c0760i4, f5 f5Var) {
        this.f4517c = c0760i4;
        this.f4516a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4517c;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.r.m(this.f4516a);
            interfaceC0799p1.u0(this.f4516a);
            this.f4517c.E();
        } catch (RemoteException e9) {
            this.f4517c.f4245a.d().r().b("Failed to send measurementEnabled to the service", e9);
        }
    }
}
