package O;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static void a(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i9, int i10, int i11, String str) {
        if (i9 < i10) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i9 <= i11) {
            return i9;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static int c(int i9) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException();
    }

    public static int d(int i9, String str) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException(str);
    }

    public static int e(int i9, int i10) {
        if ((i9 & i10) == i9) {
            return i9;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i9) + ", but only 0x" + Integer.toHexString(i10) + " are allowed");
    }

    public static Object f(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void h(boolean z9, String str) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }
}
