package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class X2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4536a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4537c;

    public X2(C0824t3 c0824t3, long j9) {
        this.f4537c = c0824t3;
        this.f4536a = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4537c.f4245a.F().f4410k.b(this.f4536a);
        this.f4537c.f4245a.d().q().b("Session timeout duration set", Long.valueOf(this.f4536a));
    }
}
