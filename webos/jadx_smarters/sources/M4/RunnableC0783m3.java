package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0783m3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4939a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4940c;

    public RunnableC0783m3(C0824t3 c0824t3, AtomicReference atomicReference) {
        this.f4940c = c0824t3;
        this.f4939a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4939a) {
            try {
                try {
                    this.f4939a.set(Double.valueOf(this.f4940c.f4245a.z().k(this.f4940c.f4245a.B().s(), AbstractC0781m1.f4874Q)));
                } finally {
                    this.f4939a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
