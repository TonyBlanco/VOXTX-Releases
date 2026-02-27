package k8;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f43666c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43667a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f43668a;

        public b(Throwable exception) {
            kotlin.jvm.internal.l.e(exception, "exception");
            this.f43668a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.l.a(this.f43668a, ((b) obj).f43668a);
        }

        public int hashCode() {
            return this.f43668a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f43668a + ')';
        }
    }

    public /* synthetic */ j(Object obj) {
        this.f43667a = obj;
    }

    public static final /* synthetic */ j a(Object obj) {
        return new j(obj);
    }

    public static Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof j) && kotlin.jvm.internal.l.a(obj, ((j) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f43668a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f43667a, obj);
    }

    public int hashCode() {
        return e(this.f43667a);
    }

    public final /* synthetic */ Object i() {
        return this.f43667a;
    }

    public String toString() {
        return h(this.f43667a);
    }
}
