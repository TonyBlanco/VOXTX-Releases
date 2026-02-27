package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public enum CodecUtils {
    ;

    public static int sanitize(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char c9 = charArray[i10];
            if (c9 != '\r' && c9 != '\n' && c9 != ' ') {
                if (c9 > 127) {
                    throw new IllegalArgumentException("Invalid character found at position " + i10 + " for " + str);
                }
                bArr[i9] = (byte) c9;
                i9++;
            }
        }
        return i9;
    }

    public static void sanityCheckLastPos(int i9, int i10) {
        if ((i9 & i10) != 0) {
            throw new IllegalArgumentException("Invalid last non-pad character detected");
        }
    }

    public static byte[] toBytesDirect(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            char c9 = charArray[i9];
            if (c9 > 127) {
                throw new IllegalArgumentException("Invalid character found at position " + i9 + " for " + str);
            }
            bArr[i9] = (byte) c9;
        }
        return bArr;
    }

    public static String toStringDirect(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            cArr[i10] = (char) bArr[i9];
            i9++;
            i10++;
        }
        return new String(cArr);
    }
}
