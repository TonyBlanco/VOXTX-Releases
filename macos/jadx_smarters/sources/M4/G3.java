package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class G3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A3 f4258a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I3 f4260d;

    public G3(I3 i32, A3 a32, long j9) {
        this.f4260d = i32;
        this.f4258a = a32;
        this.f4259c = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4260d.p(this.f4258a, false, this.f4259c);
        I3 i32 = this.f4260d;
        i32.f4309e = null;
        i32.f4245a.L().u(null);
    }
}
