package org.apache.http.util;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class Args {
    public static void check(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void check(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException(String.format(str, obj));
        }
    }

    public static void check(boolean z9, String str, Object... objArr) {
        if (!z9) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T extends CharSequence> T containsNoBlanks(T t9, String str) {
        if (t9 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (t9.length() == 0) {
            throw new IllegalArgumentException(str + " may not be empty");
        }
        if (!TextUtils.containsBlanks(t9)) {
            return t9;
        }
        throw new IllegalArgumentException(str + " may not contain blanks");
    }

    public static <T extends CharSequence> T notBlank(T t9, String str) {
        if (t9 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!TextUtils.isBlank(t9)) {
            return t9;
        }
        throw new IllegalArgumentException(str + " may not be blank");
    }

    public static <T extends CharSequence> T notEmpty(T t9, String str) {
        if (t9 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!TextUtils.isEmpty(t9)) {
            return t9;
        }
        throw new IllegalArgumentException(str + " may not be empty");
    }

    public static <E, T extends Collection<E>> T notEmpty(T t9, String str) {
        if (t9 == null) {
            throw new IllegalArgumentException(str + " may not be null");
        }
        if (!t9.isEmpty()) {
            return t9;
        }
        throw new IllegalArgumentException(str + " may not be empty");
    }

    public static int notNegative(int i9, String str) {
        if (i9 >= 0) {
            return i9;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static long notNegative(long j9, String str) {
        if (j9 >= 0) {
            return j9;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    public static <T> T notNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    public static int positive(int i9, String str) {
        if (i9 > 0) {
            return i9;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }

    public static long positive(long j9, String str) {
        if (j9 > 0) {
            return j9;
        }
        throw new IllegalArgumentException(str + " may not be negative or zero");
    }
}
