package com.nytimes.android.external.cache;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {
    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void c(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }

    public static void d(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
