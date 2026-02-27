package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class adg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f19078a = Pattern.compile("^NOTE([ \t].*)?$");

    public static long a(String str) throws NumberFormatException {
        String[] strArrAl = cq.al(str, "\\.");
        long j9 = 0;
        for (String str2 : cq.ak(strArrAl[0], ":")) {
            j9 = (j9 * 60) + Long.parseLong(str2);
        }
        long j10 = j9 * 1000;
        if (strArrAl.length == 2) {
            j10 += Long.parseLong(strArrAl[1]);
        }
        return j10 * 1000;
    }

    public static Matcher b(cj cjVar) {
        String strR;
        while (true) {
            String strR2 = cjVar.r();
            if (strR2 == null) {
                return null;
            }
            if (f19078a.matcher(strR2).matches()) {
                do {
                    strR = cjVar.r();
                    if (strR != null) {
                    }
                } while (!strR.isEmpty());
            } else {
                Matcher matcher = adf.f19077a.matcher(strR2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static void c(cj cjVar) throws as {
        int iC = cjVar.c();
        if (d(cjVar)) {
            return;
        }
        cjVar.F(iC);
        throw as.a("Expected WEBVTT. Got ".concat(String.valueOf(cjVar.r())), null);
    }

    public static boolean d(cj cjVar) {
        String strR = cjVar.r();
        return strR != null && strR.startsWith("WEBVTT");
    }
}
