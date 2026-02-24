package org.apache.http.util;

/* JADX INFO: loaded from: classes4.dex */
public class Asserts {
    public static void check(boolean z9, String str) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }

    public static void check(boolean z9, String str, Object obj) {
        if (!z9) {
            throw new IllegalStateException(String.format(str, obj));
        }
    }

    public static void check(boolean z9, String str, Object... objArr) {
        if (!z9) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void notBlank(CharSequence charSequence, String str) {
        if (TextUtils.isBlank(charSequence)) {
            throw new IllegalStateException(str + " is blank");
        }
    }

    public static void notEmpty(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalStateException(str + " is empty");
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(str + " is null");
    }
}
