package f8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.util.Base64;
import com.amplifyframework.core.model.ModelIdentifier;
import de.blinkt.openvpn.core.A;
import de.blinkt.openvpn.core.AbstractC1724g;
import de.blinkt.openvpn.core.B;
import de.blinkt.openvpn.core.C1721d;
import de.blinkt.openvpn.core.F;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.H;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import de.blinkt.openvpn.core.z;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.http.message.TokenParser;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemWriter;

/* JADX INFO: loaded from: classes4.dex */
public class l implements Serializable, Cloneable {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static String f40861A0 = "8.8.8.8";

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static String f40862B0 = "8.8.4.4";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f40884V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f40885W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C1721d[] f40887Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f40891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f40894f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f40898h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f40899h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f40900i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f40901i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f40902j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f40903j0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f40906l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f40907l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f40908m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f40916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f40918r;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public transient PrivateKey f40923t0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f40928w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient boolean f40889a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40890c = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f40896g = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40904k = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f40910n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f40912o = f40861A0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f40914p = f40862B0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f40920s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f40922t = "blinkt.de";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f40924u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f40926v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f40930x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f40932y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f40934z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f40863A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f40864B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f40865C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f40866D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f40867E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f40868F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f40869G = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f40870H = "1";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f40871I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f40872J = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f40873K = true;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f40874L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f40875M = "";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f40876N = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f40877O = "-1";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f40878P = "2";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f40879Q = "300";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f40880R = true;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f40881S = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f40882T = 3;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f40883U = null;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f40886X = 0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f40888Z = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public HashSet f40893e0 = new HashSet();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f40895f0 = true;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f40897g0 = false;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f40905k0 = 0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f40909m0 = false;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f40911n0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f40915p0 = "openvpn.example.com";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f40917q0 = "1194";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f40919r0 = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f40921s0 = false;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f40929w0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f40931x0 = true;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f40933y0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f40935z0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public UUID f40925u0 = UUID.randomUUID();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f40927v0 = 9;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f40913o0 = System.currentTimeMillis();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f40936a;

        public a(Context context) {
            this.f40936a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.o(this.f40936a);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public enum c {
        NO_PADDING,
        PKCS1_PADDING
    }

    public l(String str) {
        this.f40887Y = new C1721d[0];
        this.f40891d = str;
        this.f40887Y = new C1721d[]{new C1721d()};
    }

    public static String C(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e9) {
            G.r(e9);
            str = "unknown";
        }
        return String.format(Locale.US, "%s %s", context.getPackageName(), str);
    }

    public static String D(String str, String str2) {
        if (str2 == null) {
            return String.format("%s %s\n", str, "file missing in config profile");
        }
        if (!E(str2)) {
            return String.format(Locale.ENGLISH, "%s %s\n", str, I(str2));
        }
        return String.format(Locale.ENGLISH, "<%s>\n%s\n</%s>\n", str, l(str2), str);
    }

    public static boolean E(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("[[INLINE]]") || str.startsWith("[[NAME]]");
    }

    public static String I(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace("\\", "\\\\").replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"").replace("\n", "\\n");
        if (strReplace.equals(str) && !strReplace.contains(" ") && !strReplace.contains(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER) && !strReplace.contains(";") && !strReplace.equals("")) {
            return str;
        }
        return TokenParser.DQUOTE + strReplace + TokenParser.DQUOTE;
    }

    public static boolean h(Context context) {
        return B.a(context).getBoolean("ovpn3", false);
    }

    public static String l(String str) {
        return !str.contains("[[INLINE]]") ? str : str.substring(str.indexOf("[[INLINE]]") + 10);
    }

    public UUID A() {
        return this.f40925u0;
    }

    public String B() {
        return this.f40925u0.toString().toLowerCase(Locale.ENGLISH);
    }

    public boolean F() {
        int i9 = this.f40890c;
        return i9 == 3 || i9 == 5 || i9 == 6 || i9 == 7;
    }

    public final void G() {
        this.f40887Y = new C1721d[1];
        C1721d c1721d = new C1721d();
        c1721d.f40041a = this.f40915p0;
        c1721d.f40042c = this.f40917q0;
        c1721d.f40043d = this.f40919r0;
        c1721d.f40044e = "";
        this.f40887Y[0] = c1721d;
    }

    public int H(String str, String str2) {
        String str3;
        int i9 = this.f40890c;
        if ((i9 == 1 || i9 == 6) && (((str3 = this.f40908m) == null || str3.equals("")) && str == null)) {
            return a7.j.f13252f5;
        }
        int i10 = this.f40890c;
        if ((i10 == 0 || i10 == 5) && K() && TextUtils.isEmpty(this.f40875M) && str == null) {
            return a7.j.f13009G5;
        }
        if (!F()) {
            return 0;
        }
        if (TextUtils.isEmpty(this.f40864B) || (TextUtils.isEmpty(this.f40863A) && str2 == null)) {
            return a7.j.f13174X4;
        }
        return 0;
    }

    public Intent J(Context context) {
        return z(context);
    }

    public boolean K() {
        String str;
        if (TextUtils.isEmpty(this.f40900i)) {
            return false;
        }
        if (E(this.f40900i)) {
            str = this.f40900i;
        } else {
            char[] cArr = new char[2048];
            try {
                FileReader fileReader = new FileReader(this.f40900i);
                String str2 = "";
                for (int i9 = fileReader.read(cArr); i9 > 0; i9 = fileReader.read(cArr)) {
                    str2 = str2 + new String(cArr, 0, i9);
                }
                fileReader.close();
                str = str2;
            } catch (FileNotFoundException | IOException unused) {
            }
        }
        return str.contains("Proc-Type: 4,ENCRYPTED") || str.contains("-----BEGIN ENCRYPTED PRIVATE KEY-----");
    }

    public void L() {
        switch (this.f40927v0) {
            case 0:
            case 1:
                this.f40884V = false;
            case 2:
            case 3:
                G();
                this.f40895f0 = true;
                if (this.f40893e0 == null) {
                    this.f40893e0 = new HashSet();
                }
                if (this.f40887Y == null) {
                    this.f40887Y = new C1721d[0];
                    break;
                }
            case 4:
            case 5:
                if (TextUtils.isEmpty(this.f40901i0)) {
                    this.f40880R = true;
                    break;
                }
            case 6:
                for (C1721d c1721d : this.f40887Y) {
                    if (c1721d.f40048i == null) {
                        c1721d.f40048i = C1721d.a.NONE;
                    }
                }
            case 7:
                boolean z9 = this.f40897g0;
                if (z9) {
                    this.f40931x0 = !z9;
                    break;
                }
            case 8:
                if (!TextUtils.isEmpty(this.f40871I) && !this.f40871I.equals("AES-256-GCM") && !this.f40871I.equals("AES-128-GCM")) {
                    this.f40929w0 = "AES-256-GCM:AES-128-GCM:" + this.f40871I;
                }
                break;
        }
        this.f40927v0 = 9;
    }

    public final boolean M() {
        String str;
        if (this.f40868F && (str = this.f40869G) != null && str.contains("http-proxy-option ")) {
            return true;
        }
        for (C1721d c1721d : this.f40887Y) {
            if (c1721d.e()) {
                return true;
            }
        }
        return false;
    }

    public void N(Context context) {
        FileWriter fileWriter = new FileWriter(F.b(context));
        fileWriter.write(i(context, false));
        fileWriter.flush();
        fileWriter.close();
    }

    public void b(Context context) {
        int i9 = this.f40890c;
        if ((i9 == 2 || i9 == 7) && this.f40923t0 == null) {
            new Thread(new a(context)).start();
        }
    }

    public int c(Context context) {
        return d(context, h(context));
    }

    public int d(Context context, boolean z9) {
        String str;
        int i9 = this.f40890c;
        if (i9 == 2 || i9 == 7 || i9 == 8) {
            if (this.f40892e == null) {
                return a7.j.f13361q4;
            }
        } else if ((i9 == 0 || i9 == 5) && TextUtils.isEmpty(this.f40902j) && !this.f40933y0) {
            return a7.j.f13241e4;
        }
        if (this.f40930x && this.f40882T == 0) {
            return a7.j.f13074N0;
        }
        if ((!this.f40926v || this.f40890c == 4) && ((str = this.f40916q) == null || e(str) == null)) {
            return a7.j.f13056L2;
        }
        if (!this.f40924u) {
            if (!TextUtils.isEmpty(this.f40928w) && j(this.f40928w).size() == 0) {
                return a7.j.f12974D0;
            }
            if (!TextUtils.isEmpty(this.f40885W) && j(this.f40885W).size() == 0) {
                return a7.j.f12974D0;
            }
        }
        if (this.f40910n && TextUtils.isEmpty(this.f40898h)) {
            return a7.j.f13017H3;
        }
        int i10 = this.f40890c;
        if ((i10 == 5 || i10 == 0) && (TextUtils.isEmpty(this.f40894f) || TextUtils.isEmpty(this.f40900i))) {
            return a7.j.f13007G3;
        }
        int i11 = this.f40890c;
        if ((i11 == 0 || i11 == 5) && TextUtils.isEmpty(this.f40902j)) {
            return a7.j.f12997F3;
        }
        boolean z10 = true;
        for (C1721d c1721d : this.f40887Y) {
            if (c1721d.f40046g) {
                z10 = false;
            }
        }
        if (z10) {
            return a7.j.f13233d6;
        }
        if (z9) {
            int i12 = this.f40890c;
            if (i12 == 4) {
                return a7.j.f13108Q4;
            }
            if (i12 == 1 || i12 == 6) {
                return a7.j.f13118R4;
            }
            for (C1721d c1721d2 : this.f40887Y) {
                C1721d.a aVar = c1721d2.f40048i;
                if (aVar == C1721d.a.ORBOT || aVar == C1721d.a.SOCKS5) {
                    return a7.j.f13128S4;
                }
            }
        }
        for (C1721d c1721d3 : this.f40887Y) {
            if (c1721d3.f40048i == C1721d.a.ORBOT) {
                if (M()) {
                    return a7.j.f13105Q1;
                }
                if (!z.c(context)) {
                    return a7.j.f13401u4;
                }
            }
        }
        return a7.j.f13291j4;
    }

    public final String e(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 1) {
            strArrSplit = (str + "/32").split("/");
        }
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            int i9 = Integer.parseInt(strArrSplit[1]);
            if (i9 >= 0 && i9 <= 32) {
                long j9 = 4294967295 << (32 - i9);
                return strArrSplit[0] + "  " + String.format(Locale.ENGLISH, "%d.%d.%d.%d", Long.valueOf((4278190080L & j9) >> 24), Long.valueOf((16711680 & j9) >> 16), Long.valueOf((65280 & j9) >> 8), Long.valueOf(j9 & 255));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f40925u0.equals(((l) obj).f40925u0);
        }
        return false;
    }

    public void f() {
        this.f40915p0 = "unknown";
        this.f40926v = false;
        this.f40904k = false;
        this.f40924u = false;
        this.f40873K = false;
        this.f40932y = false;
        this.f40930x = false;
        this.f40876N = false;
        this.f40884V = true;
        this.f40909m0 = false;
        this.f40886X = 0;
        this.f40872J = false;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l clone() {
        l lVar = (l) super.clone();
        lVar.f40925u0 = UUID.randomUUID();
        lVar.f40887Y = new C1721d[this.f40887Y.length];
        C1721d[] c1721dArr = this.f40887Y;
        int length = c1721dArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            lVar.f40887Y[i10] = c1721dArr[i9].clone();
            i9++;
            i10++;
        }
        lVar.f40893e0 = (HashSet) this.f40893e0.clone();
        return lVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String i(android.content.Context r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.l.i(android.content.Context, boolean):java.lang.String");
    }

    public final Collection j(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals("")) {
                String strE = e(str2);
                if (strE == null) {
                    return vector;
                }
                vector.add(strE);
            }
        }
        return vector;
    }

    public final Collection k(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals("")) {
                vector.add(str2);
            }
        }
        return vector;
    }

    public final X509Certificate[] m(Context context) throws KeyChainException {
        String str;
        String str2 = this.f40903j0;
        if (str2 == null || (str = this.f40892e) == null) {
            throw new KeyChainException("Alias or external auth provider name not set");
        }
        return AbstractC1724g.c(context, str2, str);
    }

    public final byte[] n(Context context, byte[] bArr, Bundle bundle) {
        if (TextUtils.isEmpty(this.f40903j0)) {
            return null;
        }
        try {
            return AbstractC1724g.d(context, this.f40903j0, this.f40892e, bArr, bundle);
        } catch (KeyChainException | InterruptedException e9) {
            G.o(a7.j.f13055L1, this.f40903j0, e9.getClass().toString(), e9.getLocalizedMessage());
            return null;
        }
    }

    public String[] o(Context context) {
        return p(context, 5);
    }

    public synchronized String[] p(Context context, int i9) {
        String string;
        String string2;
        String str;
        try {
            Context applicationContext = context.getApplicationContext();
            try {
                try {
                    X509Certificate[] x509CertificateArrM = this.f40890c == 8 ? m(applicationContext) : s(applicationContext);
                    if (x509CertificateArrM == null) {
                        throw new b("No certificate returned from Keystore");
                    }
                    if (x509CertificateArrM.length > 1 || !TextUtils.isEmpty(this.f40902j)) {
                        StringWriter stringWriter = new StringWriter();
                        PemWriter pemWriter = new PemWriter(stringWriter);
                        for (int i10 = 1; i10 < x509CertificateArrM.length; i10++) {
                            pemWriter.writeObject(new PemObject("CERTIFICATE", x509CertificateArrM[i10].getEncoded()));
                        }
                        pemWriter.close();
                        string = stringWriter.toString();
                    } else {
                        G.w(G.c.ERROR, "", applicationContext.getString(a7.j.f13106Q2));
                        string = null;
                    }
                    if (TextUtils.isEmpty(this.f40902j)) {
                        string2 = null;
                    } else {
                        try {
                            Certificate[] certificateArrA = H.a(this.f40902j);
                            StringWriter stringWriter2 = new StringWriter();
                            PemWriter pemWriter2 = new PemWriter(stringWriter2);
                            for (Certificate certificate : certificateArrA) {
                                pemWriter2.writeObject(new PemObject("CERTIFICATE", certificate.getEncoded()));
                            }
                            pemWriter2.close();
                            string2 = stringWriter2.toString();
                        } catch (Exception e9) {
                            G.p("Could not read CA certificate" + e9.getLocalizedMessage());
                            string2 = null;
                        }
                    }
                    StringWriter stringWriter3 = new StringWriter();
                    if (x509CertificateArrM.length >= 1) {
                        X509Certificate x509Certificate = x509CertificateArrM[0];
                        PemWriter pemWriter3 = new PemWriter(stringWriter3);
                        pemWriter3.writeObject(new PemObject("CERTIFICATE", x509Certificate.getEncoded()));
                        pemWriter3.close();
                    }
                    String string3 = stringWriter3.toString();
                    if (string2 == null) {
                        str = null;
                    } else {
                        String str2 = string;
                        string = string2;
                        str = str2;
                    }
                    return new String[]{string, str, string3};
                } catch (AssertionError e10) {
                    if (i9 == 0) {
                        return null;
                    }
                    G.p(String.format("Failure getting Keystore Keys (%s), retrying", e10.getLocalizedMessage()));
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException e11) {
                        G.r(e11);
                    }
                    return p(applicationContext, i9 - 1);
                }
            } catch (KeyChainException e12) {
                e = e12;
                e.printStackTrace();
                G.o(a7.j.f13086O2, e.getLocalizedMessage());
                G.n(a7.j.f13096P2);
                return null;
            } catch (b e13) {
                e = e13;
                e.printStackTrace();
                G.o(a7.j.f13086O2, e.getLocalizedMessage());
                G.n(a7.j.f13096P2);
                return null;
            } catch (IOException e14) {
                e = e14;
                e.printStackTrace();
                G.o(a7.j.f13086O2, e.getLocalizedMessage());
                G.n(a7.j.f13096P2);
                return null;
            } catch (IllegalArgumentException e15) {
                e = e15;
                e.printStackTrace();
                G.o(a7.j.f13086O2, e.getLocalizedMessage());
                G.n(a7.j.f13096P2);
                return null;
            } catch (InterruptedException e16) {
                e = e16;
                e.printStackTrace();
                G.o(a7.j.f13086O2, e.getLocalizedMessage());
                G.n(a7.j.f13096P2);
                return null;
            } catch (CertificateException e17) {
                e = e17;
                e.printStackTrace();
                G.o(a7.j.f13086O2, e.getLocalizedMessage());
                G.n(a7.j.f13096P2);
                return null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final byte[] q(byte[] bArr, boolean z9) {
        PrivateKey privateKeyT = t();
        try {
            if (!privateKeyT.getAlgorithm().equals("EC")) {
                Cipher cipher = Cipher.getInstance(z9 ? "RSA/ECB/PKCS1PADDING" : "RSA/ECB/NoPadding");
                cipher.init(1, privateKeyT);
                return cipher.doFinal(bArr);
            }
            Signature signature = Signature.getInstance("NONEwithECDSA");
            signature.initSign(privateKeyT);
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidKeyException e9) {
            e = e9;
            G.o(a7.j.f13125S1, e.getClass().toString(), e.getLocalizedMessage());
            return null;
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            G.o(a7.j.f13125S1, e.getClass().toString(), e.getLocalizedMessage());
            return null;
        } catch (SignatureException e11) {
            e = e11;
            G.o(a7.j.f13125S1, e.getClass().toString(), e.getLocalizedMessage());
            return null;
        } catch (BadPaddingException e12) {
            e = e12;
            G.o(a7.j.f13125S1, e.getClass().toString(), e.getLocalizedMessage());
            return null;
        } catch (IllegalBlockSizeException e13) {
            e = e13;
            G.o(a7.j.f13125S1, e.getClass().toString(), e.getLocalizedMessage());
            return null;
        } catch (NoSuchPaddingException e14) {
            e = e14;
            G.o(a7.j.f13125S1, e.getClass().toString(), e.getLocalizedMessage());
            return null;
        }
    }

    public final X509Certificate[] s(Context context) {
        this.f40923t0 = KeyChain.getPrivateKey(context, this.f40892e);
        return KeyChain.getCertificateChain(context, this.f40892e);
    }

    public PrivateKey t() {
        return this.f40923t0;
    }

    public String toString() {
        return this.f40891d;
    }

    public String u() {
        return TextUtils.isEmpty(this.f40891d) ? "No profile name" : this.f40891d;
    }

    public String v() {
        String strA = A.a(this.f40925u0, true);
        return strA != null ? strA : this.f40863A;
    }

    public String w() {
        String strC = A.c(this.f40925u0, true);
        if (strC != null) {
            return strC;
        }
        int i9 = this.f40890c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 5) {
                    if (i9 != 6) {
                        return null;
                    }
                }
            }
            return this.f40908m;
        }
        return this.f40875M;
    }

    public String x() {
        return String.format(Locale.US, "%d %s %s %s %s %s", Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE, NativeUtils.a(), Build.BRAND, Build.BOARD, Build.MODEL);
    }

    public String y(Context context, String str, boolean z9) {
        byte[] bArrQ;
        byte[] bArrDecode = Base64.decode(str, 0);
        if (this.f40890c == 8) {
            c cVar = z9 ? c.PKCS1_PADDING : c.NO_PADDING;
            Bundle bundle = new Bundle();
            bundle.putInt("de.blinkt.openvpn.api.RSA_PADDING_TYPE", cVar.ordinal());
            bArrQ = n(context, bArrDecode, bundle);
        } else {
            bArrQ = q(bArrDecode, z9);
        }
        if (bArrQ != null) {
            return Base64.encodeToString(bArrQ, 2);
        }
        return null;
    }

    public Intent z(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent(context, (Class<?>) OpenVPNService.class);
        intent.putExtra(packageName + ".profileUUID", this.f40925u0.toString());
        intent.putExtra(packageName + ".profileVersion", this.f40911n0);
        return intent;
    }
}
