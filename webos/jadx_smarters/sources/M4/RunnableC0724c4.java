package M4;

/* JADX INFO: renamed from: M4.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0724c4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0799p1 f4633a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0754h4 f4634c;

    public RunnableC0724c4(ServiceConnectionC0754h4 serviceConnectionC0754h4, InterfaceC0799p1 interfaceC0799p1) {
        this.f4634c = serviceConnectionC0754h4;
        this.f4633a = interfaceC0799p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4634c) {
            try {
                this.f4634c.f4722a = false;
                if (!this.f4634c.f4724d.z()) {
                    this.f4634c.f4724d.f4245a.d().v().a("Connected to service");
                    this.f4634c.f4724d.x(this.f4633a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
