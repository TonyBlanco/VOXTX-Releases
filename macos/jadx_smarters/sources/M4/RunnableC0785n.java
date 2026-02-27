package M4;

/* JADX INFO: renamed from: M4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0785n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G2 f4946a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0791o f4947c;

    public RunnableC0785n(AbstractC0791o abstractC0791o, G2 g22) {
        this.f4947c = abstractC0791o;
        this.f4946a = g22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4946a.b();
        if (C0719c.a()) {
            this.f4946a.f().z(this);
            return;
        }
        boolean zE = this.f4947c.e();
        this.f4947c.f4967c = 0L;
        if (zE) {
            this.f4947c.c();
        }
    }
}
