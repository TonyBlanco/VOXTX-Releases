package B8;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends B8.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f764f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f765g = new c(1, 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final c a() {
            return c.f765g;
        }
    }

    public c(int i9, int i10) {
        super(i9, i10, 1);
    }

    @Override // B8.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (d() != cVar.d() || f() != cVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // B8.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + f();
    }

    @Override // B8.a
    public boolean isEmpty() {
        return d() > f();
    }

    public boolean l(int i9) {
        return d() <= i9 && i9 <= f();
    }

    public Integer n() {
        return Integer.valueOf(f());
    }

    public Integer o() {
        return Integer.valueOf(d());
    }

    @Override // B8.a
    public String toString() {
        return d() + ".." + f();
    }
}
