package com.amazonaws.mobileconnectors.appsync.utils;

import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {
    public static String toHumanReadableAscii(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt <= 31 || iCodePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (iCodePointAt2 > 31 && iCodePointAt2 < 127) {
                        buffer.writeUtf8CodePoint(iCodePointAt2);
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }
}
