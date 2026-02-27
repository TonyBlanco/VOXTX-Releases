package M4;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class Q3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A3 f4437a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4438c;

    public Q3(C0760i4 c0760i4, A3 a32) {
        this.f4438c = c0760i4;
        this.f4437a = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0760i4 c0760i4 = this.f4438c;
        InterfaceC0799p1 interfaceC0799p1 = c0760i4.f4743d;
        if (interfaceC0799p1 == null) {
            c0760i4.f4245a.d().r().a("Failed to send current screen to service");
            return;
        }
        try {
            A3 a32 = this.f4437a;
            if (a32 == null) {
                interfaceC0799p1.C(0L, null, null, c0760i4.f4245a.c().getPackageName());
            } else {
                interfaceC0799p1.C(a32.f4190c, a32.f4188a, a32.f4189b, c0760i4.f4245a.c().getPackageName());
            }
            this.f4438c.E();
        } catch (RemoteException e9) {
            this.f4438c.f4245a.d().r().b("Failed to send current screen to the service", e9);
        }
    }
}
