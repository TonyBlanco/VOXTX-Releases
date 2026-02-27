package I5;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f2908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2910c;

    public r(F f9, int i9, int i10) {
        this.f2908a = (F) E.c(f9, "Null dependency anInterface.");
        this.f2909b = i9;
        this.f2910c = i10;
    }

    public r(Class cls, int i9, int i10) {
        this(F.b(cls), i9, i10);
    }

    public static r a(Class cls) {
        return new r(cls, 0, 2);
    }

    public static String b(int i9) {
        if (i9 == 0) {
            return "direct";
        }
        if (i9 == 1) {
            return "provider";
        }
        if (i9 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i9);
    }

    public static r h(Class cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class cls) {
        return new r(cls, 0, 1);
    }

    public static r j(F f9) {
        return new r(f9, 1, 0);
    }

    public static r k(Class cls) {
        return new r(cls, 1, 0);
    }

    public static r l(F f9) {
        return new r(f9, 1, 1);
    }

    public static r m(Class cls) {
        return new r(cls, 1, 1);
    }

    public static r n(Class cls) {
        return new r(cls, 2, 0);
    }

    public F c() {
        return this.f2908a;
    }

    public boolean d() {
        return this.f2910c == 2;
    }

    public boolean e() {
        return this.f2910c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f2908a.equals(rVar.f2908a) && this.f2909b == rVar.f2909b && this.f2910c == rVar.f2910c;
    }

    public boolean f() {
        return this.f2909b == 1;
    }

    public boolean g() {
        return this.f2909b == 2;
    }

    public int hashCode() {
        return ((((this.f2908a.hashCode() ^ 1000003) * 1000003) ^ this.f2909b) * 1000003) ^ this.f2910c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2908a);
        sb.append(", type=");
        int i9 = this.f2909b;
        sb.append(i9 == 1 ? "required" : i9 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f2910c));
        sb.append("}");
        return sb.toString();
    }
}
