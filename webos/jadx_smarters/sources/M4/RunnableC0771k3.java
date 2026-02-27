package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0771k3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4776a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4777c;

    public RunnableC0771k3(C0824t3 c0824t3, AtomicReference atomicReference) {
        this.f4777c = c0824t3;
        this.f4776a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4776a) {
            try {
                try {
                    this.f4776a.set(Long.valueOf(this.f4777c.f4245a.z().r(this.f4777c.f4245a.B().s(), AbstractC0781m1.f4872O)));
                } finally {
                    this.f4776a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
