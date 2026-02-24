package Y3;

import android.text.TextUtils;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.AbstractC1690g;
import d4.M;
import d4.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.AbstractC2673b;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f10624c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f10625d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f10626a = new M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f10627b = new StringBuilder();

    public static boolean b(M m9) {
        int iF = m9.f();
        int iG = m9.g();
        byte[] bArrE = m9.e();
        if (iF + 2 > iG) {
            return false;
        }
        int i9 = iF + 1;
        if (bArrE[iF] != 47) {
            return false;
        }
        int i10 = iF + 2;
        if (bArrE[i9] != 42) {
            return false;
        }
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iG) {
                m9.V(iG - m9.f());
                return true;
            }
            if (((char) bArrE[i10]) == '*' && ((char) bArrE[i11]) == '/') {
                i10 += 2;
                iG = i10;
            } else {
                i10 = i11;
            }
        }
    }

    public static boolean c(M m9) {
        char cK = k(m9, m9.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        m9.V(1);
        return true;
    }

    public static void e(String str, d dVar) {
        Matcher matcher = f10625d.matcher(AbstractC2673b.e(str));
        if (!matcher.matches()) {
            AbstractC1681B.j("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) AbstractC1684a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                dVar.t(3);
                break;
            case "em":
                dVar.t(2);
                break;
            case "px":
                dVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        dVar.s(Float.parseFloat((String) AbstractC1684a.e(matcher.group(1))));
    }

    public static String f(M m9, StringBuilder sb) {
        boolean z9 = false;
        sb.setLength(0);
        int iF = m9.f();
        int iG = m9.g();
        while (iF < iG && !z9) {
            char c9 = (char) m9.e()[iF];
            if ((c9 < 'A' || c9 > 'Z') && ((c9 < 'a' || c9 > 'z') && !((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                z9 = true;
            } else {
                iF++;
                sb.append(c9);
            }
        }
        m9.V(iF - m9.f());
        return sb.toString();
    }

    public static String g(M m9, StringBuilder sb) {
        n(m9);
        if (m9.a() == 0) {
            return null;
        }
        String strF = f(m9, sb);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) m9.H());
    }

    public static String h(M m9, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z9 = false;
        while (!z9) {
            int iF = m9.f();
            String strG = g(m9, sb);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                m9.U(iF);
                z9 = true;
            } else {
                sb2.append(strG);
            }
        }
        return sb2.toString();
    }

    public static String i(M m9, StringBuilder sb) {
        n(m9);
        if (m9.a() < 5 || !"::cue".equals(m9.E(5))) {
            return null;
        }
        int iF = m9.f();
        String strG = g(m9, sb);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            m9.U(iF);
            return "";
        }
        String strL = "(".equals(strG) ? l(m9) : null;
        if (")".equals(g(m9, sb))) {
            return strL;
        }
        return null;
    }

    public static void j(M m9, d dVar, StringBuilder sb) {
        n(m9);
        String strF = f(m9, sb);
        if (!"".equals(strF) && ":".equals(g(m9, sb))) {
            n(m9);
            String strH = h(m9, sb);
            if (strH == null || "".equals(strH)) {
                return;
            }
            int iF = m9.f();
            String strG = g(m9, sb);
            if (!";".equals(strG)) {
                if (!"}".equals(strG)) {
                    return;
                } else {
                    m9.U(iF);
                }
            }
            if ("color".equals(strF)) {
                dVar.q(AbstractC1690g.b(strH));
                return;
            }
            if ("background-color".equals(strF)) {
                dVar.n(AbstractC1690g.b(strH));
                return;
            }
            boolean z9 = true;
            if ("ruby-position".equals(strF)) {
                if ("over".equals(strH)) {
                    dVar.v(1);
                    return;
                } else {
                    if ("under".equals(strH)) {
                        dVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strF)) {
                if (!"all".equals(strH) && !strH.startsWith("digits")) {
                    z9 = false;
                }
                dVar.p(z9);
                return;
            }
            if ("text-decoration".equals(strF)) {
                if ("underline".equals(strH)) {
                    dVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strF)) {
                dVar.r(strH);
                return;
            }
            if ("font-weight".equals(strF)) {
                if ("bold".equals(strH)) {
                    dVar.o(true);
                }
            } else if ("font-style".equals(strF)) {
                if ("italic".equals(strH)) {
                    dVar.u(true);
                }
            } else if ("font-size".equals(strF)) {
                e(strH, dVar);
            }
        }
    }

    public static char k(M m9, int i9) {
        return (char) m9.e()[i9];
    }

    public static String l(M m9) {
        int iF = m9.f();
        int iG = m9.g();
        boolean z9 = false;
        while (iF < iG && !z9) {
            int i9 = iF + 1;
            z9 = ((char) m9.e()[iF]) == ')';
            iF = i9;
        }
        return m9.E((iF - 1) - m9.f()).trim();
    }

    public static void m(M m9) {
        while (!TextUtils.isEmpty(m9.s())) {
        }
    }

    public static void n(M m9) {
        while (true) {
            for (boolean z9 = true; m9.a() > 0 && z9; z9 = false) {
                if (c(m9) || b(m9)) {
                    break;
                }
            }
            return;
        }
    }

    public final void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f10624c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                dVar.z((String) AbstractC1684a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrI1 = k0.i1(str, "\\.");
        String str2 = strArrI1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            dVar.y(str2.substring(0, iIndexOf2));
            dVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (strArrI1.length > 1) {
            dVar.w((String[]) k0.V0(strArrI1, 1, strArrI1.length));
        }
    }

    public List d(M m9) {
        this.f10627b.setLength(0);
        int iF = m9.f();
        m(m9);
        this.f10626a.S(m9.e(), m9.f());
        this.f10626a.U(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f10626a, this.f10627b);
            if (strI == null || !"{".equals(g(this.f10626a, this.f10627b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, strI);
            String str = null;
            boolean z9 = false;
            while (!z9) {
                int iF2 = this.f10626a.f();
                String strG = g(this.f10626a, this.f10627b);
                boolean z10 = strG == null || "}".equals(strG);
                if (!z10) {
                    this.f10626a.U(iF2);
                    j(this.f10626a, dVar, this.f10627b);
                }
                str = strG;
                z9 = z10;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
