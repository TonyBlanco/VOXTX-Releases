package com.nytimes.android.external.cache;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static boolean a(char c9) {
        return c9 >= 'A' && c9 <= 'Z';
    }

    public static String b(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (a(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (a(c9)) {
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
