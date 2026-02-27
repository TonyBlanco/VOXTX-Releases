package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class B2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f5 f4200a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D2 f4201c;

    public B2(D2 d22, f5 f5Var) {
        this.f4201c = d22;
        this.f4200a = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4201c.f4226a.e();
        this.f4201c.f4226a.q(this.f4200a);
    }
}
