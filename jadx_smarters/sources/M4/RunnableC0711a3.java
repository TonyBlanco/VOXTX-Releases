package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0711a3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4584a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4585c;

    public RunnableC0711a3(C0824t3 c0824t3, long j9) {
        this.f4585c = c0824t3;
        this.f4584a = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4585c.z(this.f4584a, true);
        this.f4585c.f4245a.L().S(new AtomicReference());
    }
}
