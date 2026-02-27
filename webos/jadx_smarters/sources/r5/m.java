package r5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static String a(int i9, int i10, String str) {
        if (i9 < 0) {
            return q.b("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return q.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String b(int i9, int i10, String str) {
        if (i9 < 0) {
            return q.b("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return q.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i9, int i10, int i11) {
        return (i9 < 0 || i9 > i11) ? b(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? b(i10, i11, "end index") : q.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
    }

    public static void d(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z9, String str, int i9, int i10) {
        if (!z9) {
            throw new IllegalArgumentException(q.b(str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
    }

    public static void g(boolean z9, String str, long j9) {
        if (!z9) {
            throw new IllegalArgumentException(q.b(str, Long.valueOf(j9)));
        }
    }

    public static void h(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(q.b(str, obj));
        }
    }

    public static int i(int i9, int i10) {
        return j(i9, i10, "index");
    }

    public static int j(int i9, int i10, String str) {
        if (i9 < 0 || i9 >= i10) {
            throw new IndexOutOfBoundsException(a(i9, i10, str));
        }
        return i9;
    }

    public static Object k(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object l(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int m(int i9, int i10) {
        return n(i9, i10, "index");
    }

    public static int n(int i9, int i10, String str) {
        if (i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException(b(i9, i10, str));
        }
        return i9;
    }

    public static void o(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException(c(i9, i10, i11));
        }
    }

    public static void p(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }

    public static void q(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void r(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalStateException(q.b(str, obj));
        }
    }
}
