package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0735e3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4664c;

    public RunnableC0735e3(C0824t3 c0824t3, AtomicReference atomicReference) {
        this.f4664c = c0824t3;
        this.f4663a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4663a) {
            try {
                try {
                    this.f4663a.set(Boolean.valueOf(this.f4664c.f4245a.z().B(this.f4664c.f4245a.B().s(), AbstractC0781m1.f4870M)));
                } finally {
                    this.f4663a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
