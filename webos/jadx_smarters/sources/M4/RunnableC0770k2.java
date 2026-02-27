package M4;

/* JADX INFO: renamed from: M4.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0770k2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f4774a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0776l2 f4775c;

    public RunnableC0770k2(C0776l2 c0776l2, R2 r22) {
        this.f4775c = c0776l2;
        this.f4774a = r22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0776l2.e(this.f4775c, this.f4774a);
        this.f4775c.m(this.f4774a.f4448g);
    }
}
