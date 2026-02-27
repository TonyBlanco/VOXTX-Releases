package M4;

/* JADX INFO: renamed from: M4.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0841w2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0832v f5109a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f5 f5110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f5111d;

    public RunnableC0841w2(D2 d22, C0832v c0832v, f5 f5Var) {
        this.f5111d = d22;
        this.f5109a = c0832v;
        this.f5110c = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5111d.c0(this.f5111d.E(this.f5109a, this.f5110c), this.f5110c);
    }
}
