package r5;

import org.apache.http.message.TokenParser;

/* JADX INFO: renamed from: r5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2673b {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int iB;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = charSequence.charAt(i9);
            char cCharAt2 = charSequence2.charAt(i9);
            if (cCharAt != cCharAt2 && ((iB = b(cCharAt)) >= 26 || iB != b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static int b(char c9) {
        return (char) ((c9 | TokenParser.SP) - 97);
    }

    public static boolean c(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }

    public static boolean d(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static String e(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (d(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (d(c9)) {
                        charArray[i9] = (char) (c9 ^ TokenParser.SP);
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String f(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (c(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (c(c9)) {
                        charArray[i9] = (char) (c9 ^ TokenParser.SP);
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }
}
