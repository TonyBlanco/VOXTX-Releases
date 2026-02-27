package com.squareup.okhttp.internal.http;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes4.dex */
public final class HeaderParser {
    private HeaderParser() {
    }

    public static int parseSeconds(String str, int i9) {
        try {
            long j9 = Long.parseLong(str);
            if (j9 > 2147483647L) {
                return a.e.API_PRIORITY_OTHER;
            }
            if (j9 < 0) {
                return 0;
            }
            return (int) j9;
        } catch (NumberFormatException unused) {
            return i9;
        }
    }

    public static int skipUntil(String str, int i9, String str2) {
        while (i9 < str.length() && str2.indexOf(str.charAt(i9)) == -1) {
            i9++;
        }
        return i9;
    }

    public static int skipWhitespace(String str, int i9) {
        char cCharAt;
        while (i9 < str.length() && ((cCharAt = str.charAt(i9)) == ' ' || cCharAt == '\t')) {
            i9++;
        }
        return i9;
    }
}
