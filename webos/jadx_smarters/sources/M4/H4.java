package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class H4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T4 f4266a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S4 f4267c;

    public H4(S4 s42, T4 t42) {
        this.f4267c = s42;
        this.f4266a = t42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S4.k0(this.f4267c, this.f4266a);
        this.f4267c.x();
    }
}
