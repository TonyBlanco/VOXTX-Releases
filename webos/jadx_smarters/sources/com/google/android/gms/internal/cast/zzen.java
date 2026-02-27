package com.google.android.gms.internal.cast;

import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
public final class zzen {
    public static String zza(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            if (zzb(str.charAt(i9))) {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c9 = charArray[i9];
                    if (zzb(c9)) {
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

    public static boolean zzb(char c9) {
        return c9 >= 'a' && c9 <= 'z';
    }
}
