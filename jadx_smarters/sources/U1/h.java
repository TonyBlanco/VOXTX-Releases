package U1;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f9657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f9659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S1.c f9660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9662f;

    public interface a {
        void c(S1.c cVar, h hVar);
    }

    public h(l lVar, boolean z9) {
        if (lVar == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.f9657a = lVar;
        this.f9658b = z9;
    }

    public void a() {
        if (this.f9662f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.f9661e++;
    }

    @Override // U1.l
    public void b() {
        if (this.f9661e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f9662f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f9662f = true;
        this.f9657a.b();
    }

    public boolean c() {
        return this.f9658b;
    }

    public void d() {
        if (this.f9661e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i9 = this.f9661e - 1;
        this.f9661e = i9;
        if (i9 == 0) {
            this.f9659c.c(this.f9660d, this);
        }
    }

    public void e(S1.c cVar, a aVar) {
        this.f9660d = cVar;
        this.f9659c = aVar;
    }

    @Override // U1.l
    public Object get() {
        return this.f9657a.get();
    }

    @Override // U1.l
    public int getSize() {
        return this.f9657a.getSize();
    }
}
