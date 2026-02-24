package de.blinkt.openvpn.core;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import de.blinkt.openvpn.core.C1721d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: renamed from: de.blinkt.openvpn.core.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1720c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f40032a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f40036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashSet f40037f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f40040i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f40033b = {"config", "tls-server"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f40034c = {"tls-client", "allow-recursive-routing", "askpass", "auth-nocache", "up", "down", "route-up", "ipchange", "route-pre-down", "auth-user-pass-verify", "block-outside-dns", "client-cert-not-required", "dhcp-release", "dhcp-renew", "dh", "group", "ip-win32", "ifconfig-nowarn", "management-hold", "management", "management-client", "management-query-remote", "management-query-passwords", "management-query-proxy", "management-external-key", "management-forget-disconnect", "management-signal", "management-log-cache", "management-up-down", "management-client-user", "management-client-group", "pause-exit", "preresolve", "plugin", "machine-readable-output", "persist-key", "push", "register-dns", "route-delay", "route-gateway", "route-metric", "route-method", "status", "script-security", "show-net-up", "suppress-timestamps", "tap-sleep", "tmp-dir", "tun-ipv6", "topology", "user", "win-sys"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[][] f40035d = {new String[]{"setenv", "IV_GUI_VER"}, new String[]{"setenv", "IV_SSO"}, new String[]{"setenv", "IV_PLAT_VER"}, new String[]{"setenv", "IV_OPENVPN_GUI_VERSION"}, new String[]{"engine", "dynamic"}, new String[]{"setenv", "CLIENT_CERT"}, new String[]{"resolv-retry", "60"}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f40038g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f40039h = new HashMap();

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: de.blinkt.openvpn.core.c$b */
    public enum b {
        initial,
        readin_single_quote,
        reading_quoted,
        reading_unquoted,
        done
    }

    public C1720c() {
        String[] strArr = {"local", "remote", "float", "port", "connect-retry", "connect-timeout", "connect-retry-max", "link-mtu", "tun-mtu", "tun-mtu-extra", "fragment", "mtu-disc", "local-port", "remote-port", "bind", "nobind", "proto", "http-proxy", "http-proxy-retry", "http-proxy-timeout", "http-proxy-option", "socks-proxy", "socks-proxy-retry", "http-proxy-user-pass", "explicit-exit-notify"};
        this.f40036e = strArr;
        this.f40037f = new HashSet(Arrays.asList(strArr));
    }

    public static void u(C1721d c1721d, String str) {
        String[] strArrSplit = f8.l.l(str).split("\n");
        if (strArrSplit.length >= 2) {
            c1721d.f40052m = strArrSplit[0];
            c1721d.f40053n = strArrSplit[1];
            c1721d.f40051l = true;
        }
    }

    public static void v(f8.l lVar, String str) {
        String[] strArrSplit = f8.l.l(str).split("\n");
        if (strArrSplit.length >= 2) {
            lVar.f40864B = strArrSplit[0];
            lVar.f40863A = strArrSplit[1];
        }
    }

    public final void a(String str, Vector vector) {
        String strTrim = ((String) vector.get(0)).trim();
        String strTrim2 = ((String) vector.get(1)).trim();
        File file = new File(str);
        try {
            if (file.exists()) {
                strTrim.substring(1, strTrim.length() - 1);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String strSubstring = "";
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    strSubstring = (strSubstring + line) + "\n";
                }
                if (strSubstring.endsWith("\n")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                }
                vector.clear();
                vector.add("ca");
                vector.add("[[NAME]]" + strTrim2 + "[[INLINE]]" + strSubstring);
            }
        } catch (Exception e9) {
            Log.d("", "" + e9);
        }
    }

    public final void b(f8.l lVar) throws a {
        boolean z9 = false;
        for (String str : this.f40033b) {
            if (this.f40038g.containsKey(str)) {
                throw new a(String.format("Unsupported Option %s encountered in config file. Aborting", str));
            }
        }
        for (String str2 : this.f40034c) {
            this.f40038g.remove(str2);
        }
        Iterator it = this.f40038g.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Vector) it.next()).iterator();
            while (it2.hasNext()) {
                if (!k((Vector) it2.next())) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            lVar.f40869G = "# These options found in the config file do not map to config settings:\n" + lVar.f40869G;
            Iterator it3 = this.f40038g.values().iterator();
            while (it3.hasNext()) {
                lVar.f40869G += j((Vector) it3.next());
            }
            lVar.f40868F = true;
        }
    }

    public final void c(f8.l lVar, Vector vector, boolean z9) {
        boolean z10 = false;
        if (z9) {
            Iterator it = vector.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Vector vector2 = (Vector) it.next();
                for (int i9 = 1; i9 < vector2.size(); i9++) {
                    if (((String) vector2.get(i9)).equals("block-local")) {
                        lVar.f40884V = false;
                    } else if (((String) vector2.get(i9)).equals("unblock-local")) {
                        lVar.f40884V = true;
                    } else if (((String) vector2.get(i9)).equals("!ipv4")) {
                        z11 = true;
                    } else if (((String) vector2.get(i9)).equals("ipv6")) {
                        lVar.f40873K = true;
                    }
                }
            }
            z10 = z11;
        }
        if (!z9 || z10) {
            return;
        }
        lVar.f40924u = true;
    }

    public final void d(Vector vector, BufferedReader bufferedReader) throws a, IOException {
        String strTrim = ((String) vector.get(0)).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String str = String.format("</%s>", strSubstring);
        String strSubstring2 = "[[INLINE]]";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new a(String.format("No endtag </%s> for starttag <%s> found", strSubstring, strSubstring));
            }
            if (line.trim().equals(str)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = (strSubstring2 + line) + "\n";
        }
    }

    public final void e(Vector vector, BufferedReader bufferedReader, String str, String str2) throws a, IOException {
        String strTrim = ((String) vector.get(0)).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            if (strTrim.equals("ca")) {
                String strTrim2 = ((String) vector.get(1)).trim();
                a(strTrim2 != null ? str.replaceAll(str2, strTrim2) : "", vector);
                return;
            }
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String str3 = String.format("</%s>", strSubstring);
        String strSubstring2 = "[[INLINE]]";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new a(String.format("No endtag </%s> for starttag <%s> found", strSubstring, strSubstring));
            }
            if (line.trim().equals(str3)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = (strSubstring2 + line) + "\n";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x049d A[PHI: r13
      0x049d: PHI (r13v9 int) = (r13v8 int), (r13v10 int) binds: [B:202:0x049b, B:199:0x0497] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f8.l f() throws de.blinkt.openvpn.core.C1720c.a {
        /*
            Method dump skipped, instruction units count: 1911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.C1720c.f():f8.l");
    }

    public final void g(f8.l lVar) {
        if (lVar.f40934z.equals(lVar.f40915p0)) {
            lVar.f40934z = "";
        }
    }

    public final Vector h(String str, int i9, int i10) throws a {
        Vector<Vector> vector = (Vector) this.f40038g.get(str);
        if (vector == null) {
            return null;
        }
        for (Vector vector2 : vector) {
            if (vector2.size() < i9 + 1 || vector2.size() > i10 + 1) {
                throw new a(String.format(Locale.getDefault(), "Option %s has %d parameters, expected between %d and %d", str, Integer.valueOf(vector2.size() - 1), Integer.valueOf(i9), Integer.valueOf(i10)));
            }
        }
        this.f40038g.remove(str);
        return vector;
    }

    public final Vector i(String str, int i9, int i10) throws a {
        Vector vectorH = h(str, i9, i10);
        if (vectorH == null) {
            return null;
        }
        return (Vector) vectorH.lastElement();
    }

    public final String j(Vector vector) {
        Iterator it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Vector vector2 = (Vector) it.next();
            if (!k(vector2)) {
                if (vector2.size() == 2 && "extra-certs".equals(vector2.get(0))) {
                    str = str + f8.l.D((String) vector2.get(0), (String) vector2.get(1));
                } else {
                    Iterator it2 = vector2.iterator();
                    while (it2.hasNext()) {
                        str = str + f8.l.I((String) it2.next()) + " ";
                    }
                    str = str + "\n";
                }
            }
        }
        return str;
    }

    public boolean k(Vector vector) {
        for (String[] strArr : this.f40035d) {
            if (vector.size() >= strArr.length) {
                boolean z9 = true;
                for (int i9 = 0; i9 < strArr.length; i9++) {
                    if (!strArr[i9].equals(vector.get(i9))) {
                        z9 = false;
                    }
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l(String str) throws a {
        if (str.equals("udp") || str.equals("udp4") || str.equals("udp6")) {
            return true;
        }
        if (str.equals("tcp-client") || str.equals("tcp") || str.equals("tcp4") || str.endsWith("tcp4-client") || str.equals("tcp6") || str.endsWith("tcp6-client")) {
            return false;
        }
        throw new a("Unsupported option to --proto " + str);
    }

    public final String m(String str, Vector vector) {
        return Build.VERSION.SDK_INT > 26 ? AbstractC1719b.a(str, vector) : TextUtils.join(str, vector);
    }

    public void n(Reader reader) throws a, IOException {
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i9 = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i9++;
                if (line == null) {
                    return;
                }
                if (i9 == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    Vector vectorS = s(line);
                    this.f40039h.put((String) vectorS.get(0), vectorS);
                } else {
                    Vector vectorR = r(line);
                    if (vectorR.size() != 0) {
                        if (((String) vectorR.get(0)).startsWith("--")) {
                            vectorR.set(0, ((String) vectorR.get(0)).substring(2));
                        }
                        d(vectorR, bufferedReader);
                        String str = (String) vectorR.get(0);
                        if (map.get(str) != null) {
                            str = (String) map.get(str);
                        }
                        if (!this.f40038g.containsKey(str)) {
                            this.f40038g.put(str, new Vector());
                        }
                        ((Vector) this.f40038g.get(str)).add(vectorR);
                    }
                }
            } catch (OutOfMemoryError e9) {
                throw new a("File too large to parse: " + e9.getLocalizedMessage());
            }
        }
        throw new a("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    public void o(Reader reader, String str, String str2, Context context) throws a, IOException {
        this.f40032a = context;
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i9 = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i9++;
                if (line == null) {
                    return;
                }
                if (i9 == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    Vector vectorS = s(line);
                    this.f40039h.put((String) vectorS.get(0), vectorS);
                } else {
                    Vector vectorR = r(line);
                    if (vectorR.size() != 0) {
                        if (((String) vectorR.get(0)).startsWith("--")) {
                            vectorR.set(0, ((String) vectorR.get(0)).substring(2));
                        }
                        e(vectorR, bufferedReader, str, str2);
                        String str3 = (String) vectorR.get(0);
                        if (map.get(str3) != null) {
                            str3 = (String) map.get(str3);
                        }
                        if (!this.f40038g.containsKey(str3)) {
                            this.f40038g.put(str3, new Vector());
                        }
                        ((Vector) this.f40038g.get(str3)).add(vectorR);
                    }
                }
            } catch (OutOfMemoryError e9) {
                throw new a("File too large to parse: " + e9.getLocalizedMessage());
            }
        }
        throw new a("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    public final O.d p(String str, C1721d c1721d) throws a, IOException {
        C1720c c1720c = new C1720c();
        c1720c.n(new StringReader(str.substring(10)));
        return c1720c.q(c1721d);
    }

    public final O.d q(C1721d c1721d) throws a {
        C1721d c1721dClone;
        int i9 = 0;
        if (c1721d != null) {
            try {
                c1721dClone = c1721d.clone();
            } catch (CloneNotSupportedException e9) {
                e9.printStackTrace();
                return null;
            }
        } else {
            c1721dClone = new C1721d();
        }
        Vector vectorI = i("port", 1, 1);
        if (vectorI != null) {
            c1721dClone.f40042c = (String) vectorI.get(1);
        }
        Vector vectorI2 = i("rport", 1, 1);
        if (vectorI2 != null) {
            c1721dClone.f40042c = (String) vectorI2.get(1);
        }
        Vector vectorI3 = i("proto", 1, 1);
        if (vectorI3 != null) {
            c1721dClone.f40043d = l((String) vectorI3.get(1));
        }
        Vector vectorI4 = i("connect-timeout", 1, 1);
        if (vectorI4 != null) {
            try {
                c1721dClone.f40047h = Integer.parseInt((String) vectorI4.get(1));
            } catch (NumberFormatException e10) {
                throw new a(String.format("Argument to connect-timeout (%s) must to be an integer: %s", vectorI4.get(1), e10.getLocalizedMessage()));
            }
        }
        Vector vectorI5 = i("socks-proxy", 1, 2);
        if (vectorI5 == null) {
            vectorI5 = i("http-proxy", 2, 2);
        }
        if (vectorI5 != null) {
            if (((String) vectorI5.get(0)).equals("socks-proxy")) {
                c1721dClone.f40048i = C1721d.a.SOCKS5;
                c1721dClone.f40050k = "1080";
            } else {
                c1721dClone.f40048i = C1721d.a.HTTP;
            }
            c1721dClone.f40049j = (String) vectorI5.get(1);
            if (vectorI5.size() >= 3) {
                c1721dClone.f40050k = (String) vectorI5.get(2);
            }
        }
        Vector vectorI6 = i("http-proxy-user-pass", 1, 1);
        if (vectorI6 != null) {
            u(c1721dClone, (String) vectorI6.get(1));
        }
        Vector<Vector> vectorH = h("remote", 1, 3);
        Vector vector = new Vector();
        for (Map.Entry entry : this.f40038g.entrySet()) {
            if (c1721d != null || this.f40037f.contains(entry.getKey())) {
                c1721dClone.f40044e += j((Vector) entry.getValue());
                vector.add((String) entry.getKey());
            }
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            this.f40038g.remove((String) it.next());
        }
        String str = c1721dClone.f40044e;
        if (str != null && !"".equals(str.trim())) {
            c1721dClone.f40045f = true;
        }
        if (vectorH == null) {
            vectorH = new Vector();
        }
        C1721d[] c1721dArr = new C1721d[vectorH.size()];
        for (Vector vector2 : vectorH) {
            try {
                c1721dArr[i9] = c1721dClone.clone();
            } catch (CloneNotSupportedException e11) {
                e11.printStackTrace();
            }
            int size = vector2.size();
            if (size == 2) {
                c1721dArr[i9].f40041a = (String) vector2.get(1);
            } else {
                if (size != 3) {
                    if (size == 4) {
                        c1721dArr[i9].f40043d = l((String) vector2.get(3));
                    }
                }
                c1721dArr[i9].f40042c = (String) vector2.get(2);
                c1721dArr[i9].f40041a = (String) vector2.get(1);
            }
            i9++;
        }
        return O.d.a(c1721dClone, c1721dArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0056 A[PHI: r1
      0x0056: PHI (r1v7 de.blinkt.openvpn.core.c$b) = 
      (r1v2 de.blinkt.openvpn.core.c$b)
      (r1v2 de.blinkt.openvpn.core.c$b)
      (r1v2 de.blinkt.openvpn.core.c$b)
      (r1v2 de.blinkt.openvpn.core.c$b)
      (r1v2 de.blinkt.openvpn.core.c$b)
      (r1v10 de.blinkt.openvpn.core.c$b)
     binds: [B:46:0x0074, B:41:0x006b, B:42:0x006d, B:35:0x005c, B:37:0x0062, B:31:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Vector r(java.lang.String r15) throws de.blinkt.openvpn.core.C1720c.a {
        /*
            r14 = this;
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r15.length()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            de.blinkt.openvpn.core.c$b r1 = de.blinkt.openvpn.core.C1720c.b.initial
            java.lang.String r2 = ""
            r3 = 0
            r7 = r2
            r4 = 0
            r5 = 0
            r6 = 0
        L15:
            int r8 = r15.length()
            if (r4 >= r8) goto L20
            char r8 = r15.charAt(r4)
            goto L21
        L20:
            r8 = 0
        L21:
            r9 = 92
            if (r5 != 0) goto L2e
            if (r8 != r9) goto L2e
            de.blinkt.openvpn.core.c$b r10 = de.blinkt.openvpn.core.C1720c.b.readin_single_quote
            if (r1 == r10) goto L2e
            r5 = 1
            goto L9b
        L2e:
            de.blinkt.openvpn.core.c$b r10 = de.blinkt.openvpn.core.C1720c.b.initial
            r11 = 39
            r12 = 34
            if (r1 != r10) goto L58
            boolean r13 = r14.t(r8)
            if (r13 != 0) goto L77
            r1 = 59
            if (r8 == r1) goto Lb4
            r1 = 35
            if (r8 != r1) goto L46
            goto Lb4
        L46:
            if (r5 != 0) goto L4d
            if (r8 != r12) goto L4d
            de.blinkt.openvpn.core.c$b r1 = de.blinkt.openvpn.core.C1720c.b.reading_quoted
            goto L77
        L4d:
            if (r5 != 0) goto L54
            if (r8 != r11) goto L54
            de.blinkt.openvpn.core.c$b r1 = de.blinkt.openvpn.core.C1720c.b.readin_single_quote
            goto L77
        L54:
            de.blinkt.openvpn.core.c$b r1 = de.blinkt.openvpn.core.C1720c.b.reading_unquoted
        L56:
            r6 = r8
            goto L77
        L58:
            de.blinkt.openvpn.core.c$b r13 = de.blinkt.openvpn.core.C1720c.b.reading_unquoted
            if (r1 != r13) goto L67
            if (r5 != 0) goto L56
            boolean r11 = r14.t(r8)
            if (r11 == 0) goto L56
        L64:
            de.blinkt.openvpn.core.c$b r1 = de.blinkt.openvpn.core.C1720c.b.done
            goto L77
        L67:
            de.blinkt.openvpn.core.c$b r13 = de.blinkt.openvpn.core.C1720c.b.reading_quoted
            if (r1 != r13) goto L70
            if (r5 != 0) goto L56
            if (r8 != r12) goto L56
            goto L64
        L70:
            de.blinkt.openvpn.core.c$b r13 = de.blinkt.openvpn.core.C1720c.b.readin_single_quote
            if (r1 != r13) goto L77
            if (r8 != r11) goto L56
            goto L64
        L77:
            de.blinkt.openvpn.core.c$b r8 = de.blinkt.openvpn.core.C1720c.b.done
            if (r1 != r8) goto L81
            r0.add(r7)
            r7 = r2
            r6 = 0
            goto L82
        L81:
            r10 = r1
        L82:
            if (r5 == 0) goto L99
            if (r6 == 0) goto L99
            if (r6 == r9) goto L99
            if (r6 == r12) goto L99
            boolean r1 = r14.t(r6)
            if (r1 == 0) goto L91
            goto L99
        L91:
            de.blinkt.openvpn.core.c$a r15 = new de.blinkt.openvpn.core.c$a
            java.lang.String r0 = "Options warning: Bad backslash ('\\') usage"
            r15.<init>(r0)
            throw r15
        L99:
            r1 = r10
            r5 = 0
        L9b:
            if (r6 == 0) goto Lac
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
        Lac:
            int r8 = r4 + 1
            int r9 = r15.length()
            if (r4 < r9) goto Lb5
        Lb4:
            return r0
        Lb5:
            r4 = r8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.C1720c.r(java.lang.String):java.util.Vector");
    }

    public final Vector s(String str) {
        String[] strArrSplit = str.split("#\\sOVPN_ACCESS_SERVER_", 2)[1].split("=", 2);
        Vector vector = new Vector();
        Collections.addAll(vector, strArrSplit);
        return vector;
    }

    public final boolean t(char c9) {
        return Character.isWhitespace(c9) || c9 == 0;
    }
}
