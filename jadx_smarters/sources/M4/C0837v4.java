package M4;

/* JADX INFO: renamed from: M4.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0837v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC0831u4 f5100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0861z4 f5101b;

    public C0837v4(C0861z4 c0861z4) {
        this.f5101b = c0861z4;
    }

    public final void a(long j9) {
        this.f5100a = new RunnableC0831u4(this, this.f5101b.f4245a.a().a(), j9);
        this.f5101b.f5154c.postDelayed(this.f5100a, 2000L);
    }

    public final void b() {
        this.f5101b.h();
        RunnableC0831u4 runnableC0831u4 = this.f5100a;
        if (runnableC0831u4 != null) {
            this.f5101b.f5154c.removeCallbacks(runnableC0831u4);
        }
        this.f5101b.f4245a.F().f4417r.a(false);
        this.f5101b.s(false);
    }
}
