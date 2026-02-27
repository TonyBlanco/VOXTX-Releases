package O5;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f6532a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6533b = new AtomicInteger();

    public void a() {
        this.f6533b.getAndIncrement();
    }

    public void b() {
        this.f6532a.getAndIncrement();
    }

    public void c() {
        this.f6533b.set(0);
    }
}
