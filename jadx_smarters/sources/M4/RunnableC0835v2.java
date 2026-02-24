package M4;

/* JADX INFO: renamed from: M4.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0835v2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f5093a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D2 f5094c;

    public RunnableC0835v2(D2 d22, f5 f5Var) {
        this.f5094c = d22;
        this.f5093a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5094c.f4226a.e();
        S4 s42 = this.f5094c.f4226a;
        f5 f5Var = this.f5093a;
        s42.f().h();
        s42.g();
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        K2 k2C = K2.c(f5Var.f4681A, 100);
        K2 k2C0 = s42.c0(f5Var.f4686f);
        s42.d().v().c("Setting consent, package, consent", f5Var.f4686f, k2C);
        s42.A(f5Var.f4686f, k2C);
        if (k2C.m(k2C0)) {
            s42.v(f5Var);
        }
    }
}
