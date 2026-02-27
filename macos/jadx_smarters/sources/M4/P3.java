package M4;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class P3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4425c;

    public P3(C0760i4 c0760i4, f5 f5Var) {
        this.f4425c = c0760i4;
        this.f4424a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4425c;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            com.google.android.gms.common.internal.r.m(this.f4424a);
            interfaceC0799p1.r(this.f4424a);
            this.f4425c.f4245a.C().t();
            this.f4425c.r(interfaceC0799p1, null, this.f4424a);
            this.f4425c.E();
        } catch (RemoteException e9) {
            this.f4425c.f4245a.d().r().b("Failed to send app launch to the service", e9);
        }
    }
}
