package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes4.dex */
final class SoundexUtils {
    public static String clean(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (Character.isLetter(str.charAt(i10))) {
                cArr[i9] = str.charAt(i10);
                i9++;
            }
        }
        if (i9 != length) {
            str = new String(cArr, 0, i9);
        }
        return str.toUpperCase(Locale.ENGLISH);
    }

    public static int difference(StringEncoder stringEncoder, String str, String str2) throws EncoderException {
        return differenceEncoded(stringEncoder.encode(str), stringEncoder.encode(str2));
    }

    public static int differenceEncoded(String str, String str2) {
        if (str == null || str2 == null) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        int i9 = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            if (str.charAt(i10) == str2.charAt(i10)) {
                i9++;
            }
        }
        return i9;
    }
}
