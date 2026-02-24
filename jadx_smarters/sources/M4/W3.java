package M4;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class W3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4530a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4531c;

    public W3(C0760i4 c0760i4, f5 f5Var) {
        this.f4531c = c0760i4;
        this.f4530a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4531c;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Failed to send consent settings to service");
            return;
        }
        try {
            com.google.android.gms.common.internal.r.m(this.f4530a);
            interfaceC0799p1.j0(this.f4530a);
            this.f4531c.E();
        } catch (RemoteException e9) {
            this.f4531c.f4245a.d().r().b("Failed to send consent settings to the service", e9);
        }
    }
}
