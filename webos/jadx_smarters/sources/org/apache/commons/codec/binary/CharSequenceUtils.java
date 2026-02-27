package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes4.dex */
public class CharSequenceUtils {
    public static boolean regionMatches(CharSequence charSequence, boolean z9, int i9, CharSequence charSequence2, int i10, int i11) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z9, i9, (String) charSequence2, i10, i11);
        }
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                return true;
            }
            int i13 = i9 + 1;
            char cCharAt = charSequence.charAt(i9);
            int i14 = i10 + 1;
            char cCharAt2 = charSequence2.charAt(i10);
            if (cCharAt != cCharAt2) {
                if (!z9) {
                    return false;
                }
                if (Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                    return false;
                }
            }
            i9 = i13;
            i11 = i12;
            i10 = i14;
        }
    }
}
