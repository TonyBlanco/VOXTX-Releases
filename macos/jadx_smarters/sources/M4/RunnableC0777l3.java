package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0777l3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4834a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4835c;

    public RunnableC0777l3(C0824t3 c0824t3, AtomicReference atomicReference) {
        this.f4835c = c0824t3;
        this.f4834a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4834a) {
            try {
                try {
                    this.f4834a.set(Integer.valueOf(this.f4835c.f4245a.z().o(this.f4835c.f4245a.B().s(), AbstractC0781m1.f4873P)));
                } finally {
                    this.f4834a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
