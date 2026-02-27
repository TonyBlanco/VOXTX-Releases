package M4;

/* JADX INFO: renamed from: M4.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0829u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f5083a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D2 f5084c;

    public RunnableC0829u2(D2 d22, f5 f5Var) {
        this.f5084c = d22;
        this.f5083a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5084c.f4226a.e();
        S4 s42 = this.f5084c.f4226a;
        f5 f5Var = this.f5083a;
        s42.f().h();
        s42.g();
        com.google.android.gms.common.internal.r.g(f5Var.f4686f);
        s42.S(f5Var);
    }
}
