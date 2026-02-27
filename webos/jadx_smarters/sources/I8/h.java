package I8;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f2985b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f2986c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2987a;

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f2988a;

        public a(Throwable th) {
            this.f2988a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && kotlin.jvm.internal.l.a(this.f2988a, ((a) obj).f2988a);
        }

        public int hashCode() {
            Throwable th = this.f2988a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // I8.h.c
        public String toString() {
            return "Closed(" + this.f2988a + ')';
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final Object b() {
            return h.c(h.f2986c);
        }

        public final Object c(Object obj) {
            return h.c(obj);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ h(Object obj) {
        this.f2987a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && kotlin.jvm.internal.l.a(obj, ((h) obj2).j());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f2988a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof c);
    }

    public static String i(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f2987a, obj);
    }

    public int hashCode() {
        return g(this.f2987a);
    }

    public final /* synthetic */ Object j() {
        return this.f2987a;
    }

    public String toString() {
        return i(this.f2987a);
    }
}
