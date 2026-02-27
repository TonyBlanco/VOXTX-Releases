package M4;

/* JADX INFO: renamed from: M4.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0736e4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0799p1 f4665a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0754h4 f4666c;

    public RunnableC0736e4(ServiceConnectionC0754h4 serviceConnectionC0754h4, InterfaceC0799p1 interfaceC0799p1) {
        this.f4666c = serviceConnectionC0754h4;
        this.f4665a = interfaceC0799p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4666c) {
            try {
                this.f4666c.f4722a = false;
                if (!this.f4666c.f4724d.z()) {
                    this.f4666c.f4724d.f4245a.d().q().a("Connected to remote service");
                    this.f4666c.f4724d.x(this.f4665a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
