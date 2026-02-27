package org.apache.http.util;

/* JADX INFO: loaded from: classes4.dex */
public final class TextUtils {
    public static boolean containsBlanks(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (Character.isWhitespace(charSequence.charAt(i9))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBlank(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (!Character.isWhitespace(charSequence.charAt(i9))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
