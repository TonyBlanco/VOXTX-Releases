package h4;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: h4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1860c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f41658a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f41659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f41660d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41661e = false;

    public C1860c(C1858a c1858a, long j9) {
        this.f41658a = new WeakReference(c1858a);
        this.f41659c = j9;
        start();
    }

    public final void a() {
        C1858a c1858a = (C1858a) this.f41658a.get();
        if (c1858a != null) {
            c1858a.e();
            this.f41661e = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f41660d.await(this.f41659c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
