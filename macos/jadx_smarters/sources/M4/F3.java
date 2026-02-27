package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class F3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4251a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I3 f4252c;

    public F3(I3 i32, long j9) {
        this.f4252c = i32;
        this.f4251a = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4252c.f4245a.y().n(this.f4251a);
        this.f4252c.f4309e = null;
    }
}
