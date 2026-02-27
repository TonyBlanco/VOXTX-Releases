package M4;

/* JADX INFO: renamed from: M4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0726d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4648a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E0 f4649c;

    public RunnableC0726d0(E0 e02, long j9) {
        this.f4649c = e02;
        this.f4648a = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4649c.q(this.f4648a);
    }
}
