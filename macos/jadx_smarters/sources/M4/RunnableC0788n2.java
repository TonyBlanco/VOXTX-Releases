package M4;

/* JADX INFO: renamed from: M4.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0788n2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0725d f4949a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5 f4950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f4951d;

    public RunnableC0788n2(D2 d22, C0725d c0725d, f5 f5Var) {
        this.f4951d = d22;
        this.f4949a = c0725d;
        this.f4950c = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4951d.f4226a.e();
        if (this.f4949a.f4639h.H() == null) {
            this.f4951d.f4226a.t(this.f4949a, this.f4950c);
        } else {
            this.f4951d.f4226a.z(this.f4949a, this.f4950c);
        }
    }
}
