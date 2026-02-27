package M4;

/* JADX INFO: renamed from: M4.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0847x2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0832v f5123a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f5125d;

    public RunnableC0847x2(D2 d22, C0832v c0832v, String str) {
        this.f5125d = d22;
        this.f5123a = c0832v;
        this.f5124c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5125d.f4226a.e();
        this.f5125d.f4226a.k(this.f5123a, this.f5124c);
    }
}
