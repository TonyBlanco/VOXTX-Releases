package M4;

/* JADX INFO: renamed from: M4.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0859z2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V4 f5151a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5 f5152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f5153d;

    public RunnableC0859z2(D2 d22, V4 v42, f5 f5Var) {
        this.f5153d = d22;
        this.f5151a = v42;
        this.f5152c = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5153d.f4226a.e();
        if (this.f5151a.H() == null) {
            this.f5153d.f4226a.u(this.f5151a.f4519g, this.f5152c);
        } else {
            this.f5153d.f4226a.B(this.f5151a, this.f5152c);
        }
    }
}
