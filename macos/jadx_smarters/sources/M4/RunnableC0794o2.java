package M4;

/* JADX INFO: renamed from: M4.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0794o2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0725d f4969a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D2 f4970c;

    public RunnableC0794o2(D2 d22, C0725d c0725d) {
        this.f4970c = d22;
        this.f4969a = c0725d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4970c.f4226a.e();
        if (this.f4969a.f4639h.H() == null) {
            this.f4970c.f4226a.s(this.f4969a);
        } else {
            this.f4970c.f4226a.y(this.f4969a);
        }
    }
}
