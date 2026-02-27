package b4;

import android.text.TextUtils;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17486a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f17487b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j9, long j10) {
        if (j9 == 0 && j10 == -1) {
            return null;
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

    public static long b(String str, String str2) {
        long j9;
        if (TextUtils.isEmpty(str)) {
            j9 = -1;
        } else {
            try {
                j9 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                AbstractC1681B.d("HttpUtil", "Unexpected Content-Length [" + str + "]");
                j9 = -1;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j9;
        }
        Matcher matcher = f17486a.matcher(str2);
        if (!matcher.matches()) {
            return j9;
        }
        try {
            long j10 = (Long.parseLong((String) AbstractC1684a.e(matcher.group(2))) - Long.parseLong((String) AbstractC1684a.e(matcher.group(1)))) + 1;
            if (j9 < 0) {
                return j10;
            }
            if (j9 == j10) {
                return j9;
            }
            AbstractC1681B.j("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j9, j10);
        } catch (NumberFormatException unused2) {
            AbstractC1681B.d("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j9;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f17487b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) AbstractC1684a.e(matcher.group(1)));
        }
        return -1L;
    }
}
