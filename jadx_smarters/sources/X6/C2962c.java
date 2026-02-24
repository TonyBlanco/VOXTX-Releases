package x6;

/* JADX INFO: renamed from: x6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2962c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2961b f51959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D6.b f51960b;

    public C2962c(AbstractC2961b abstractC2961b) {
        if (abstractC2961b == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f51959a = abstractC2961b;
    }

    public D6.b a() {
        if (this.f51960b == null) {
            this.f51960b = this.f51959a.b();
        }
        return this.f51960b;
    }

    public D6.a b(int i9, D6.a aVar) {
        return this.f51959a.c(i9, aVar);
    }

    public int c() {
        return this.f51959a.d();
    }

    public int d() {
        return this.f51959a.f();
    }

    public boolean e() {
        return this.f51959a.e().f();
    }

    public C2962c f() {
        return new C2962c(this.f51959a.a(this.f51959a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (k unused) {
            return "";
        }
    }
}
