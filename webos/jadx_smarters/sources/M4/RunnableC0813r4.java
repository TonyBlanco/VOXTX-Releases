package M4;

/* JADX INFO: renamed from: M4.r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0813r4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5047a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0861z4 f5048c;

    public RunnableC0813r4(C0861z4 c0861z4, long j9) {
        this.f5048c = c0861z4;
        this.f5047a = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0861z4.r(this.f5048c, this.f5047a);
    }
}
