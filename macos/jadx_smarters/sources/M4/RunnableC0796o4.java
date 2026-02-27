package M4;

/* JADX INFO: renamed from: M4.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0796o4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S4 f4977a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f4978c;

    public RunnableC0796o4(C0808q4 c0808q4, S4 s42, Runnable runnable) {
        this.f4977a = s42;
        this.f4978c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4977a.e();
        this.f4977a.l0(this.f4978c);
        this.f4977a.C();
    }
}
