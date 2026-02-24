package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import de.blinkt.openvpn.core.E;
import de.blinkt.openvpn.core.n;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f39971e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f39972f = "NOPROCESS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f39975i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f39973g = a7.j.f13454z7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Intent f39974h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f39976j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f39977k = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f39979m = {-58, -42, -44, -106, 90, -88, -87, -88, -52, -124, 84, 117, 66, 79, -112, -111, -46, 86, -37, 109};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f39980n = {-99, -69, 45, 71, 114, -116, 82, 66, -99, -122, 50, -70, -56, -111, 98, -35, -65, 105, 82, 43};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f39981o = {-116, -115, -118, -89, -116, -112, 120, 55, 79, -8, -119, -23, 106, -114, -85, -56, -4, 105, 26, -57};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f39982p = {-92, 111, -42, -46, 123, -96, -60, 79, -27, -31, 49, 103, 11, -54, -68, -27, 17, 2, 121, 104};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static EnumC1722e f39983q = EnumC1722e.LEVEL_NOTCONNECTED;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedList f39967a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Vector f39968b = new Vector();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Vector f39969c = new Vector();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Vector f39970d = new Vector();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static E f39978l = new E();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39985b;

        static {
            int[] iArr = new int[n.b.values().length];
            f39985b = iArr;
            try {
                iArr[n.b.noNetwork.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39985b[n.b.screenOff.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39985b[n.b.userPause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC1722e.values().length];
            f39984a = iArr2;
            try {
                iArr2[EnumC1722e.LEVEL_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void E(long j9, long j10, long j11, long j12);
    }

    public enum c {
        INFO(2),
        ERROR(-2),
        WARNING(1),
        VERBOSE(3),
        DEBUG(4);

        protected int mValue;

        c(int i9) {
            this.mValue = i9;
        }

        public static c getEnumByValue(int i9) {
            if (i9 == -2) {
                return ERROR;
            }
            if (i9 == 1) {
                return WARNING;
            }
            if (i9 == 2) {
                return INFO;
            }
            if (i9 == 3) {
                return VERBOSE;
            }
            if (i9 != 4) {
                return null;
            }
            return DEBUG;
        }

        public int getInt() {
            return this.mValue;
        }
    }

    public interface d {
        void a(k kVar);
    }

    public interface e {
        void Z(String str);

        void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent);
    }

    static {
        v();
    }

    public static void A(k kVar) {
        B(kVar, false);
    }

    public static synchronized void B(k kVar, boolean z9) {
        try {
            if (z9) {
                f39967a.addFirst(kVar);
            } else {
                f39967a.addLast(kVar);
            }
            if (f39967a.size() > 1500) {
                while (true) {
                    LinkedList linkedList = f39967a;
                    if (linkedList.size() <= 1000) {
                        break;
                    } else {
                        linkedList.removeFirst();
                    }
                }
            }
            Iterator it = f39968b.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void C(b bVar) {
        f39970d.remove(bVar);
    }

    public static synchronized void D(d dVar) {
        f39968b.remove(dVar);
    }

    public static synchronized void E(e eVar) {
        f39969c.remove(eVar);
    }

    public static void F(String str) {
        f39975i = str;
        Iterator it = f39969c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).Z(str);
        }
    }

    public static synchronized void G(long j9, long j10) {
        E.b bVarA = f39978l.a(j9, j10);
        Iterator it = f39970d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).E(j9, j10, bVarA.a(), bVarA.b());
        }
    }

    public static void H(n.b bVar) {
        int i9;
        EnumC1722e enumC1722e;
        String str;
        int i10 = a.f39985b[bVar.ordinal()];
        if (i10 == 1) {
            i9 = a7.j.f13444y7;
            enumC1722e = EnumC1722e.LEVEL_NONETWORK;
            str = "NONETWORK";
        } else if (i10 == 2) {
            i9 = a7.j.f12971C7;
            enumC1722e = EnumC1722e.LEVEL_VPNPAUSED;
            str = "SCREENOFF";
        } else {
            if (i10 != 3) {
                return;
            }
            i9 = a7.j.f13031I7;
            enumC1722e = EnumC1722e.LEVEL_VPNPAUSED;
            str = "USERPAUSE";
        }
        J(str, "", i9, enumC1722e);
    }

    public static void I(String str, String str2) {
        if (f39983q == EnumC1722e.LEVEL_WAITING_FOR_USER_INPUT && str.equals("GET_CONFIG")) {
            return;
        }
        J(str, str2, i(str), h(str));
    }

    public static synchronized void J(String str, String str2, int i9, EnumC1722e enumC1722e) {
        K(str, str2, i9, enumC1722e, null);
    }

    public static synchronized void K(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        try {
            if (f39983q != EnumC1722e.LEVEL_CONNECTED || (!str.equals("WAIT") && !str.equals("AUTH"))) {
                if (str.equals("AUTH_FAILED") && str2.equals("Private Key")) {
                    str = "AUTH_FAILED_PRIVATE_KEY";
                }
                f39972f = str;
                f39971e = str2;
                f39973g = i9;
                f39983q = enumC1722e;
                f39974h = intent;
                Iterator it = f39969c.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c0(str, str2, i9, enumC1722e, intent);
                }
                return;
            }
            A(new k(c.DEBUG, String.format("Ignoring OpenVPN Status in CONNECTED state (%s->%s): %s", str, enumC1722e.toString(), str2)));
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void a(b bVar) {
        E.b bVarD = f39978l.d(null);
        bVar.E(bVarD.c(), bVarD.d(), bVarD.a(), bVarD.b());
        f39970d.add(bVar);
    }

    public static synchronized void b(d dVar) {
        f39968b.add(dVar);
    }

    public static synchronized void c(e eVar) {
        if (!f39969c.contains(eVar)) {
            f39969c.add(eVar);
            String str = f39972f;
            if (str != null) {
                eVar.c0(str, f39971e, f39973g, f39983q, f39974h);
            }
        }
    }

    public static synchronized void d() {
        f39967a.clear();
        v();
    }

    public static void e() {
    }

    public static String f(Context context) {
        String strSubstring = f39971e;
        if (a.f39984a[f39983q.ordinal()] == 1) {
            String[] strArrSplit = f39971e.split(",");
            if (strArrSplit.length >= 7) {
                strSubstring = String.format(Locale.US, "%s %s", strArrSplit[1], strArrSplit[6]);
            }
        }
        while (strSubstring.endsWith(",")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        String str = f39972f;
        if (str.equals("NOPROCESS")) {
            return strSubstring;
        }
        int i9 = f39973g;
        int i10 = a7.j.f13051K7;
        if (i9 == i10) {
            return context.getString(i10, f39971e);
        }
        String string = context.getString(i9);
        if (f39973g == a7.j.f13255f8) {
            strSubstring = str + strSubstring;
        }
        if (strSubstring.length() > 0) {
            string = string + ": ";
        }
        return string + strSubstring;
    }

    public static String g() {
        return f39975i;
    }

    public static EnumC1722e h(String str) {
        String[] strArr = {"CONNECTING", "WAIT", "RECONNECTING", "RESOLVE", "TCP_CONNECT"};
        String[] strArr2 = {"AUTH", "GET_CONFIG", "ASSIGN_IP", "ADD_ROUTES", "AUTH_PENDING"};
        String[] strArr3 = {"CONNECTED"};
        String[] strArr4 = {"DISCONNECTED", "EXITING"};
        for (int i9 = 0; i9 < 5; i9++) {
            if (str.equals(strArr[i9])) {
                return EnumC1722e.LEVEL_CONNECTING_NO_SERVER_REPLY_YET;
            }
        }
        for (int i10 = 0; i10 < 5; i10++) {
            if (str.equals(strArr2[i10])) {
                return EnumC1722e.LEVEL_CONNECTING_SERVER_REPLIED;
            }
        }
        if (str.equals(strArr3[0])) {
            return EnumC1722e.LEVEL_CONNECTED;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (str.equals(strArr4[i11])) {
                return EnumC1722e.LEVEL_NOTCONNECTED;
            }
        }
        return EnumC1722e.UNKNOWN_LEVEL;
    }

    public static int i(String str) {
        str.hashCode();
        switch (str) {
            case "CONNECTED":
                return a7.j.f13394t7;
            case "RECONNECTING":
                return a7.j.f12951A7;
            case "AUTH_PENDING":
                return a7.j.f13384s7;
            case "EXITING":
                return a7.j.f13424w7;
            case "GET_CONFIG":
                return a7.j.f13434x7;
            case "CONNECTING":
                return a7.j.f13404u7;
            case "ASSIGN_IP":
                return a7.j.f13354p7;
            case "AUTH":
                return a7.j.f13364q7;
            case "WAIT":
                return a7.j.f13041J7;
            case "TCP_CONNECT":
                return a7.j.f12981D7;
            case "ADD_ROUTES":
                return a7.j.f13344o7;
            case "DISCONNECTED":
                return a7.j.f13414v7;
            case "RESOLVE":
                return a7.j.f12961B7;
            default:
                return a7.j.f13255f8;
        }
    }

    public static synchronized k[] j() {
        LinkedList linkedList;
        linkedList = f39967a;
        return (k[]) linkedList.toArray(new k[linkedList.size()]);
    }

    public static boolean k() {
        return (f39983q == EnumC1722e.LEVEL_AUTH_FAILED || f39983q == EnumC1722e.LEVEL_NOTCONNECTED) ? false : true;
    }

    public static void l(int i9, Object... objArr) {
        A(new k(c.DEBUG, i9, objArr));
    }

    public static void m(String str) {
        A(new k(c.DEBUG, str));
    }

    public static void n(int i9) {
        A(new k(c.ERROR, i9));
    }

    public static void o(int i9, Object... objArr) {
        A(new k(c.ERROR, i9, objArr));
    }

    public static void p(String str) {
        A(new k(c.ERROR, str));
    }

    public static void q(c cVar, String str, Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        A(str != null ? new k(cVar, a7.j.f13245e8, exc.getMessage(), stringWriter.toString(), str) : new k(cVar, a7.j.f13235d8, exc.getMessage(), stringWriter.toString()));
    }

    public static void r(Exception exc) {
        q(c.ERROR, null, exc);
    }

    public static void s(String str, Exception exc) {
        q(c.ERROR, str, exc);
    }

    public static void t(int i9, Object... objArr) {
        A(new k(c.INFO, i9, objArr));
    }

    public static void u(String str) {
        A(new k(c.INFO, str));
    }

    public static void v() {
        String strA;
        try {
            strA = NativeUtils.a();
        } catch (UnsatisfiedLinkError unused) {
            strA = "error";
        }
        t(a7.j.f13027I3, Build.MODEL, Build.BOARD, Build.BRAND, Integer.valueOf(Build.VERSION.SDK_INT), strA, Build.VERSION.RELEASE, Build.ID, Build.FINGERPRINT, "", "");
    }

    public static synchronized void w(c cVar, String str, String str2) {
        A(new k(cVar, str + str2));
    }

    public static void x(c cVar, int i9, String str) {
        A(new k(cVar, i9, str));
    }

    public static void y(int i9, Object... objArr) {
        A(new k(c.WARNING, i9, objArr));
    }

    public static void z(String str) {
        A(new k(c.WARNING, str));
    }
}
