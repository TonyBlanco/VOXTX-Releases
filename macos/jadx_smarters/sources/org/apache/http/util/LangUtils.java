package org.apache.http.util;

/* JADX INFO: loaded from: classes4.dex */
public final class LangUtils {
    public static final int HASH_OFFSET = 37;
    public static final int HASH_SEED = 17;

    private LangUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        if (objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < objArr.length; i9++) {
            if (!equals(objArr[i9], objArr2[i9])) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(int i9, int i10) {
        return (i9 * 37) + i10;
    }

    public static int hashCode(int i9, Object obj) {
        return hashCode(i9, obj != null ? obj.hashCode() : 0);
    }

    public static int hashCode(int i9, boolean z9) {
        return hashCode(i9, z9 ? 1 : 0);
    }
}
