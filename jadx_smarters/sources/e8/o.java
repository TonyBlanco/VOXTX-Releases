package E8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC2212g;
import l8.x;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends n {

    public static final class a extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ char[] f1736a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1737c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(char[] cArr, boolean z9) {
            super(2);
            this.f1736a = cArr;
            this.f1737c = z9;
        }

        public final k8.i a(CharSequence $receiver, int i9) {
            kotlin.jvm.internal.l.e($receiver, "$this$$receiver");
            int iS = o.S($receiver, this.f1736a, i9, this.f1737c);
            if (iS < 0) {
                return null;
            }
            return k8.m.a(Integer.valueOf(iS), 1);
        }

        @Override // w8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f1738a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list, boolean z9) {
            super(2);
            this.f1738a = list;
            this.f1739c = z9;
        }

        public final k8.i a(CharSequence $receiver, int i9) {
            kotlin.jvm.internal.l.e($receiver, "$this$$receiver");
            k8.i iVarJ = o.J($receiver, this.f1738a, i9, this.f1739c, false);
            if (iVarJ != null) {
                return k8.m.a(iVarJ.c(), Integer.valueOf(((String) iVarJ.d()).length()));
            }
            return null;
        }

        @Override // w8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements w8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f1740a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence) {
            super(1);
            this.f1740a = charSequence;
        }

        @Override // w8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(B8.c it) {
            kotlin.jvm.internal.l.e(it, "it");
            return o.w0(this.f1740a, it);
        }
    }

    public static /* synthetic */ String A0(String str, String str2, String str3, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str3 = str;
        }
        return y0(str, str2, str3);
    }

    public static String B0(String str, char c9, String missingDelimiterValue) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        int iV = V(str, c9, 0, false, 6, null);
        if (iV == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iV + 1, str.length());
        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String C0(String str, char c9, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = str;
        }
        return B0(str, c9, str2);
    }

    public static final boolean D(CharSequence charSequence, char c9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return Q(charSequence, c9, 0, z9, 2, null) >= 0;
    }

    public static CharSequence D0(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i9 = 0;
        boolean z9 = false;
        while (i9 <= length) {
            boolean zC = E8.a.c(charSequence.charAt(!z9 ? i9 : length));
            if (z9) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i9++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i9, length + 1);
    }

    public static final boolean E(CharSequence charSequence, CharSequence other, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        if (other instanceof String) {
            if (R(charSequence, (String) other, 0, z9, 2, null) < 0) {
                return false;
            }
        } else if (P(charSequence, other, 0, charSequence.length(), z9, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, char c9, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return D(charSequence, c9, z9);
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return E(charSequence, charSequence2, z9);
    }

    public static final boolean H(CharSequence charSequence, CharSequence suffix, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(suffix, "suffix");
        return (!z9 && (charSequence instanceof String) && (suffix instanceof String)) ? n.n((String) charSequence, (String) suffix, false, 2, null) : j0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z9);
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return H(charSequence, charSequence2, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        return k8.m.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final k8.i J(java.lang.CharSequence r10, java.util.Collection r11, int r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E8.o.J(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):k8.i");
    }

    public static final B8.c K(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return new B8.c(0, charSequence.length() - 1);
    }

    public static final int L(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int M(CharSequence charSequence, char c9, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return (z9 || !(charSequence instanceof String)) ? S(charSequence, new char[]{c9}, i9, z9) : ((String) charSequence).indexOf(c9, i9);
    }

    public static final int N(CharSequence charSequence, String string, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(string, "string");
        return (z9 || !(charSequence instanceof String)) ? P(charSequence, string, i9, charSequence.length(), z9, false, 16, null) : ((String) charSequence).indexOf(string, i9);
    }

    public static final int O(CharSequence charSequence, CharSequence charSequence2, int i9, int i10, boolean z9, boolean z10) {
        B8.a cVar = !z10 ? new B8.c(B8.h.c(i9, 0), B8.h.e(i10, charSequence.length())) : B8.h.j(B8.h.e(i9, L(charSequence)), B8.h.c(i10, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iD = cVar.d();
            int iF = cVar.f();
            int iG = cVar.g();
            if ((iG <= 0 || iD > iF) && (iG >= 0 || iF > iD)) {
                return -1;
            }
            while (!n.r((String) charSequence2, 0, (String) charSequence, iD, charSequence2.length(), z9)) {
                if (iD == iF) {
                    return -1;
                }
                iD += iG;
            }
            return iD;
        }
        int iD2 = cVar.d();
        int iF2 = cVar.f();
        int iG2 = cVar.g();
        if ((iG2 <= 0 || iD2 > iF2) && (iG2 >= 0 || iF2 > iD2)) {
            return -1;
        }
        while (!j0(charSequence2, 0, charSequence, iD2, charSequence2.length(), z9)) {
            if (iD2 == iF2) {
                return -1;
            }
            iD2 += iG2;
        }
        return iD2;
    }

    public static /* synthetic */ int P(CharSequence charSequence, CharSequence charSequence2, int i9, int i10, boolean z9, boolean z10, int i11, Object obj) {
        return O(charSequence, charSequence2, i9, i10, z9, (i11 & 16) != 0 ? false : z10);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, char c9, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return M(charSequence, c9, i9, z9);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return N(charSequence, str, i9, z9);
    }

    public static final int S(CharSequence charSequence, char[] chars, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(chars, "chars");
        if (!z9 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(l8.h.L(chars), i9);
        }
        x xVarI = new B8.c(B8.h.c(i9, 0), L(charSequence)).iterator();
        while (xVarI.hasNext()) {
            int iB = xVarI.b();
            char cCharAt = charSequence.charAt(iB);
            for (char c9 : chars) {
                if (E8.b.d(c9, cCharAt, z9)) {
                    return iB;
                }
            }
        }
        return -1;
    }

    public static final int T(CharSequence charSequence, char c9, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return (z9 || !(charSequence instanceof String)) ? X(charSequence, new char[]{c9}, i9, z9) : ((String) charSequence).lastIndexOf(c9, i9);
    }

    public static final int U(CharSequence charSequence, String string, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(string, "string");
        return (z9 || !(charSequence instanceof String)) ? O(charSequence, string, i9, 0, z9, true) : ((String) charSequence).lastIndexOf(string, i9);
    }

    public static /* synthetic */ int V(CharSequence charSequence, char c9, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = L(charSequence);
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return T(charSequence, c9, i9, z9);
    }

    public static /* synthetic */ int W(CharSequence charSequence, String str, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = L(charSequence);
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return U(charSequence, str, i9, z9);
    }

    public static final int X(CharSequence charSequence, char[] chars, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(chars, "chars");
        if (!z9 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(l8.h.L(chars), i9);
        }
        for (int iE = B8.h.e(i9, L(charSequence)); -1 < iE; iE--) {
            char cCharAt = charSequence.charAt(iE);
            for (char c9 : chars) {
                if (E8.b.d(c9, cCharAt, z9)) {
                    return iE;
                }
            }
        }
        return -1;
    }

    public static final D8.d Y(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return t0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List Z(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return D8.k.l(Y(charSequence));
    }

    public static final CharSequence a0(CharSequence charSequence, int i9, char c9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException("Desired length " + i9 + " is less than zero.");
        }
        if (i9 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i9);
        sb.append(charSequence);
        x xVarI = new B8.c(1, i9 - charSequence.length()).iterator();
        while (xVarI.hasNext()) {
            xVarI.b();
            sb.append(c9);
        }
        return sb;
    }

    public static final String b0(String str, int i9, char c9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return a0(str, i9, c9).toString();
    }

    public static /* synthetic */ String c0(String str, int i9, char c9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c9 = TokenParser.SP;
        }
        return b0(str, i9, c9);
    }

    public static final CharSequence d0(CharSequence charSequence, int i9, char c9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException("Desired length " + i9 + " is less than zero.");
        }
        if (i9 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i9);
        x xVarI = new B8.c(1, i9 - charSequence.length()).iterator();
        while (xVarI.hasNext()) {
            xVarI.b();
            sb.append(c9);
        }
        sb.append(charSequence);
        return sb;
    }

    public static String e0(String str, int i9, char c9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return d0(str, i9, c9).toString();
    }

    public static final D8.d f0(CharSequence charSequence, char[] cArr, int i9, boolean z9, int i10) {
        o0(i10);
        return new d(charSequence, i9, i10, new a(cArr, z9));
    }

    public static final D8.d g0(CharSequence charSequence, String[] strArr, int i9, boolean z9, int i10) {
        o0(i10);
        return new d(charSequence, i9, i10, new b(AbstractC2212g.b(strArr), z9));
    }

    public static /* synthetic */ D8.d h0(CharSequence charSequence, char[] cArr, int i9, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return f0(charSequence, cArr, i9, z9, i10);
    }

    public static /* synthetic */ D8.d i0(CharSequence charSequence, String[] strArr, int i9, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i9 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return g0(charSequence, strArr, i9, z9, i10);
    }

    public static final boolean j0(CharSequence charSequence, int i9, CharSequence other, int i10, int i11, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        if (i10 < 0 || i9 < 0 || i9 > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!E8.b.d(charSequence.charAt(i9 + i12), other.charAt(i10 + i12), z9)) {
                return false;
            }
        }
        return true;
    }

    public static String k0(String str, CharSequence prefix) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        if (!v0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static String l0(String str, CharSequence suffix) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(suffix, "suffix");
        if (!I(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static String m0(String str, CharSequence delimiter) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(delimiter, "delimiter");
        return n0(str, delimiter, delimiter);
    }

    public static final String n0(String str, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !v0(str, prefix, false, 2, null) || !I(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final void o0(int i9) {
        if (i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i9).toString());
    }

    public static final List p0(CharSequence charSequence, char[] delimiters, boolean z9, int i9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return q0(charSequence, String.valueOf(delimiters[0]), z9, i9);
        }
        Iterable iterableE = D8.k.e(h0(charSequence, delimiters, 0, z9, i9, 2, null));
        ArrayList arrayList = new ArrayList(l8.l.o(iterableE, 10));
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            arrayList.add(w0(charSequence, (B8.c) it.next()));
        }
        return arrayList;
    }

    public static final List q0(CharSequence charSequence, String str, boolean z9, int i9) {
        o0(i9);
        int length = 0;
        int iN = N(charSequence, str, 0, z9);
        if (iN == -1 || i9 == 1) {
            return l8.j.b(charSequence.toString());
        }
        boolean z10 = i9 > 0;
        ArrayList arrayList = new ArrayList(z10 ? B8.h.e(i9, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iN).toString());
            length = str.length() + iN;
            if (z10 && arrayList.size() == i9 - 1) {
                break;
            }
            iN = N(charSequence, str, length, z9);
        } while (iN != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List r0(CharSequence charSequence, char[] cArr, boolean z9, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        return p0(charSequence, cArr, z9, i9);
    }

    public static final D8.d s0(CharSequence charSequence, String[] delimiters, boolean z9, int i9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(delimiters, "delimiters");
        return D8.k.j(i0(charSequence, delimiters, 0, z9, i9, 2, null), new c(charSequence));
    }

    public static /* synthetic */ D8.d t0(CharSequence charSequence, String[] strArr, boolean z9, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        return s0(charSequence, strArr, z9, i9);
    }

    public static final boolean u0(CharSequence charSequence, CharSequence prefix, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        return (!z9 && (charSequence instanceof String) && (prefix instanceof String)) ? n.B((String) charSequence, (String) prefix, false, 2, null) : j0(charSequence, 0, prefix, 0, prefix.length(), z9);
    }

    public static /* synthetic */ boolean v0(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return u0(charSequence, charSequence2, z9);
    }

    public static final String w0(CharSequence charSequence, B8.c range) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(range, "range");
        return charSequence.subSequence(range.o().intValue(), range.n().intValue() + 1).toString();
    }

    public static final String x0(String str, char c9, String missingDelimiterValue) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        int iQ = Q(str, c9, 0, false, 6, null);
        if (iQ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iQ + 1, str.length());
        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String y0(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(delimiter, "delimiter");
        kotlin.jvm.internal.l.e(missingDelimiterValue, "missingDelimiterValue");
        int iR = R(str, delimiter, 0, false, 6, null);
        if (iR == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iR + delimiter.length(), str.length());
        kotlin.jvm.internal.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String z0(String str, char c9, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = str;
        }
        return x0(str, c9, str2);
    }
}
