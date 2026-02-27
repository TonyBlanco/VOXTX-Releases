package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f22738a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f22739b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) {
        long j9 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j9 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                cd.b("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j9;
        }
        Matcher matcher = f22738a.matcher(str2);
        if (!matcher.matches()) {
            return j9;
        }
        try {
            String strGroup = matcher.group(2);
            af.s(strGroup);
            long j10 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            af.s(strGroup2);
            long j11 = (j10 - Long.parseLong(strGroup2)) + 1;
            if (j9 < 0) {
                return j11;
            }
            if (j9 == j11) {
                return j9;
            }
            cd.e("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j9, j11);
        } catch (NumberFormatException unused2) {
            cd.b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j9;
        }
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f22739b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        af.s(strGroup);
        return Long.parseLong(strGroup);
    }

    public static String c(long j9, long j10) {
        if (j9 == 0) {
            if (j10 == -1) {
                return null;
            }
            j9 = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j9);
        sb.append("-");
        if (j10 != -1) {
            sb.append((j9 + j10) - 1);
        }
        return sb.toString();
    }
}
