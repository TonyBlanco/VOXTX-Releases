package M4;

/* JADX INFO: renamed from: M4.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0819s4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5059a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0861z4 f5060c;

    public RunnableC0819s4(C0861z4 c0861z4, long j9) {
        this.f5060c = c0861z4;
        this.f5059a = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0861z4.q(this.f5060c, this.f5059a);
    }
}
