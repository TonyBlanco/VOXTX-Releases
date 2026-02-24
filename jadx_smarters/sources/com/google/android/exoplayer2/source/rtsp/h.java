package com.google.android.exoplayer2.source.rtsp;

import K3.u;
import K3.v;
import O2.C0897l1;
import android.net.Uri;
import com.google.android.exoplayer2.source.rtsp.e;
import d4.AbstractC1684a;
import d4.k0;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpOptions;
import r5.C2678g;
import r5.q;
import s5.AbstractC2743y;
import s5.C2744z;
import s5.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f25722a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f25723b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f25724c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f25725d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f25726e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f25727f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f25728g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25729h = new String(new byte[]{13, 10});

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25731b;

        public a(String str, String str2) {
            this.f25730a = str;
            this.f25731b = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25733b;

        public b(String str, long j9) {
            this.f25732a = str;
            this.f25733b = j9;
        }
    }

    public static void a(boolean z9, String str) throws C0897l1 {
        if (!z9) {
            throw C0897l1.c(str, null);
        }
    }

    public static byte[] b(List list) {
        return C2678g.g(f25729h).d(list).getBytes(g.f25703h);
    }

    public static String c(int i9) {
        if (i9 == 200) {
            return "OK";
        }
        if (i9 == 461) {
            return "Unsupported Transport";
        }
        if (i9 == 500) {
            return "Internal Server Error";
        }
        if (i9 == 505) {
            return "RTSP Version Not Supported";
        }
        if (i9 == 301) {
            return "Move Permanently";
        }
        if (i9 == 302) {
            return "Move Temporarily";
        }
        if (i9 == 400) {
            return "Bad Request";
        }
        if (i9 == 401) {
            return "Unauthorized";
        }
        if (i9 == 404) {
            return "Not Found";
        }
        if (i9 == 405) {
            return "Method Not Allowed";
        }
        switch (i9) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(g.f25703h);
    }

    public static boolean e(List list) {
        return f25723b.matcher((CharSequence) list.get(0)).matches();
    }

    public static boolean f(String str) {
        return f25722a.matcher(str).matches() || f25723b.matcher(str).matches();
    }

    public static long g(String str) {
        try {
            Matcher matcher = f25724c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) AbstractC1684a.e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e9) {
            throw C0897l1.c(str, e9);
        }
    }

    public static int h(String str) throws C0897l1 {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e9) {
            throw C0897l1.c(str, e9);
        }
    }

    public static int i(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static AbstractC2743y j(String str) {
        if (str == null) {
            return AbstractC2743y.z();
        }
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        for (String str2 : k0.i1(str, ",\\s?")) {
            aVar.a(Integer.valueOf(i(str2)));
        }
        return aVar.k();
    }

    public static u k(List list) {
        Matcher matcher = f25722a.matcher((CharSequence) list.get(0));
        AbstractC1684a.a(matcher.matches());
        int i9 = i((String) AbstractC1684a.e(matcher.group(1)));
        Uri uri = Uri.parse((String) AbstractC1684a.e(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        AbstractC1684a.a(iIndexOf > 0);
        return new u(uri, i9, new e.b().c(list.subList(1, iIndexOf)).e(), C2678g.g(f25729h).d(list.subList(iIndexOf + 1, list.size())));
    }

    public static v l(List list) {
        Matcher matcher = f25723b.matcher((CharSequence) list.get(0));
        AbstractC1684a.a(matcher.matches());
        int i9 = Integer.parseInt((String) AbstractC1684a.e(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        AbstractC1684a.a(iIndexOf > 0);
        return new v(i9, new e.b().c(list.subList(1, iIndexOf)).e(), C2678g.g(f25729h).d(list.subList(iIndexOf + 1, list.size())));
    }

    public static b m(String str) throws C0897l1 {
        long j9;
        Matcher matcher = f25725d.matcher(str);
        if (!matcher.matches()) {
            throw C0897l1.c(str, null);
        }
        String str2 = (String) AbstractC1684a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j9 = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e9) {
                throw C0897l1.c(str, e9);
            }
        } else {
            j9 = 60000;
        }
        return new b(str2, j9);
    }

    public static a n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrJ1 = k0.j1(userInfo, ":");
        return new a(strArrJ1[0], strArrJ1[1]);
    }

    public static c o(String str) throws C0897l1 {
        Matcher matcher = f25726e.matcher(str);
        if (matcher.find()) {
            return new c(2, (String) AbstractC1684a.e(matcher.group(1)), (String) AbstractC1684a.e(matcher.group(3)), q.d(matcher.group(4)));
        }
        Matcher matcher2 = f25727f.matcher(str);
        if (matcher2.matches()) {
            return new c(1, (String) AbstractC1684a.e(matcher2.group(1)), "", "");
        }
        throw C0897l1.c("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) AbstractC1684a.e(uri.getAuthority());
        AbstractC1684a.a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(k0.i1(str, "@")[1]).build();
    }

    public static AbstractC2743y q(u uVar) {
        AbstractC1684a.a(uVar.f3766c.d("CSeq") != null);
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        aVar.a(k0.D("%s %s %s", t(uVar.f3765b), uVar.f3764a, "RTSP/1.0"));
        C2744z c2744zB = uVar.f3766c.b();
        c0 it = c2744zB.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC2743y abstractC2743y = c2744zB.get(str);
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                aVar.a(k0.D("%s: %s", str, abstractC2743y.get(i9)));
            }
        }
        aVar.a("");
        aVar.a(uVar.f3767d);
        return aVar.k();
    }

    public static AbstractC2743y r(v vVar) {
        AbstractC1684a.a(vVar.f3769b.d("CSeq") != null);
        AbstractC2743y.a aVar = new AbstractC2743y.a();
        aVar.a(k0.D("%s %s %s", "RTSP/1.0", Integer.valueOf(vVar.f3768a), c(vVar.f3768a)));
        C2744z c2744zB = vVar.f3769b.b();
        c0 it = c2744zB.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC2743y abstractC2743y = c2744zB.get(str);
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                aVar.a(k0.D("%s: %s", str, abstractC2743y.get(i9)));
            }
        }
        aVar.a("");
        aVar.a(vVar.f3770c);
        return aVar.k();
    }

    public static String[] s(String str) {
        String str2 = f25729h;
        if (!str.contains(str2)) {
            str2 = f25728g;
        }
        return k0.i1(str, str2);
    }

    public static String t(int i9) {
        switch (i9) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return HttpOptions.METHOD_NAME;
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
