package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0765j3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4757a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4758c;

    public RunnableC0765j3(C0824t3 c0824t3, AtomicReference atomicReference) {
        this.f4758c = c0824t3;
        this.f4757a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4757a) {
            try {
                try {
                    this.f4757a.set(this.f4758c.f4245a.z().x(this.f4758c.f4245a.B().s(), AbstractC0781m1.f4871N));
                } finally {
                    this.f4757a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
