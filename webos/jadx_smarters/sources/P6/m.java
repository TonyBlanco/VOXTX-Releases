package P6;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7339a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f7340b = a.NUMERIC;

    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.f7339a;
    }

    public void b(int i9) {
        this.f7339a += i9;
    }

    public boolean c() {
        return this.f7340b == a.ALPHA;
    }

    public boolean d() {
        return this.f7340b == a.ISO_IEC_646;
    }

    public void e() {
        this.f7340b = a.ALPHA;
    }

    public void f() {
        this.f7340b = a.ISO_IEC_646;
    }

    public void g() {
        this.f7340b = a.NUMERIC;
    }

    public void h(int i9) {
        this.f7339a = i9;
    }
}
