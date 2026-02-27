package Y3;

import O2.C0897l1;
import d4.M;
import d4.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10674a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(M m9) {
        String strS;
        while (true) {
            String strS2 = m9.s();
            if (strS2 == null) {
                return null;
            }
            if (f10674a.matcher(strS2).matches()) {
                do {
                    strS = m9.s();
                    if (strS != null) {
                    }
                } while (!strS.isEmpty());
            } else {
                Matcher matcher = f.f10648a.matcher(strS2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(M m9) {
        String strS = m9.s();
        return strS != null && strS.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] strArrJ1 = k0.j1(str, "\\.");
        long j9 = 0;
        for (String str2 : k0.i1(strArrJ1[0], ":")) {
            j9 = (j9 * 60) + Long.parseLong(str2);
        }
        long j10 = j9 * 1000;
        if (strArrJ1.length == 2) {
            j10 += Long.parseLong(strArrJ1[1]);
        }
        return j10 * 1000;
    }

    public static void e(M m9) throws C0897l1 {
        int iF = m9.f();
        if (b(m9)) {
            return;
        }
        m9.U(iF);
        throw C0897l1.a("Expected WEBVTT. Got " + m9.s(), null);
    }
}
