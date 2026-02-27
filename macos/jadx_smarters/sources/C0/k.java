package C0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f940a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile G0.f f942c;

    public k(e eVar) {
        this.f941b = eVar;
    }

    public G0.f a() {
        b();
        return e(this.f940a.compareAndSet(false, true));
    }

    public void b() {
        this.f941b.a();
    }

    public final G0.f c() {
        return this.f941b.d(d());
    }

    public abstract String d();

    public final G0.f e(boolean z9) {
        if (!z9) {
            return c();
        }
        if (this.f942c == null) {
            this.f942c = c();
        }
        return this.f942c;
    }

    public void f(G0.f fVar) {
        if (fVar == this.f942c) {
            this.f940a.set(false);
        }
    }
}
