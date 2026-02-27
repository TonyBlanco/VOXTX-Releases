package E8;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.E;
import l8.x;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends m {
    public static /* synthetic */ boolean A(String str, String str2, int i9, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return y(str, str2, i9, z9);
    }

    public static /* synthetic */ boolean B(String str, String str2, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return z(str, str2, z9);
    }

    public static final boolean m(String str, String suffix, boolean z9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(suffix, "suffix");
        return !z9 ? str.endsWith(suffix) : r(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean n(String str, String str2, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return m(str, str2, z9);
    }

    public static boolean o(String str, String str2, boolean z9) {
        return str == null ? str2 == null : !z9 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator p(E e9) {
        kotlin.jvm.internal.l.e(e9, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.l.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static final boolean q(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable iterableK = o.K(charSequence);
            if (!(iterableK instanceof Collection) || !((Collection) iterableK).isEmpty()) {
                Iterator it = iterableK.iterator();
                while (it.hasNext()) {
                    if (!a.c(charSequence.charAt(((x) it).b()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean r(String str, int i9, String other, int i10, int i11, boolean z9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(other, "other");
        return !z9 ? str.regionMatches(i9, other, i10, i11) : str.regionMatches(z9, i9, other, i10, i11);
    }

    public static String t(CharSequence charSequence, int i9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i9 + '.').toString());
        }
        if (i9 == 0) {
            return "";
        }
        if (i9 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                cArr[i10] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i9);
        x xVarI = new B8.c(1, i9).iterator();
        while (xVarI.hasNext()) {
            xVarI.b();
            sb.append(charSequence);
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.d(string, "{\n                    va…tring()\n                }");
        return string;
    }

    public static final String u(String str, char c9, char c10, boolean z9) {
        String string;
        String str2;
        kotlin.jvm.internal.l.e(str, "<this>");
        if (z9) {
            StringBuilder sb = new StringBuilder(str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                char cCharAt = str.charAt(i9);
                if (b.d(cCharAt, c9, z9)) {
                    cCharAt = c10;
                }
                sb.append(cCharAt);
            }
            string = sb.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            string = str.replace(c9, c10);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        kotlin.jvm.internal.l.d(string, str2);
        return string;
    }

    public static final String v(String str, String oldValue, String newValue, boolean z9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(oldValue, "oldValue");
        kotlin.jvm.internal.l.e(newValue, "newValue");
        int i9 = 0;
        int iN = o.N(str, oldValue, 0, z9);
        if (iN < 0) {
            return str;
        }
        int length = oldValue.length();
        int iC = B8.h.c(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i9, iN);
            sb.append(newValue);
            i9 = iN + length;
            if (iN >= str.length()) {
                break;
            }
            iN = o.N(str, oldValue, iN + iC, z9);
        } while (iN > 0);
        sb.append((CharSequence) str, i9, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.l.d(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static /* synthetic */ String w(String str, char c9, char c10, boolean z9, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z9 = false;
        }
        return u(str, c9, c10, z9);
    }

    public static /* synthetic */ String x(String str, String str2, String str3, boolean z9, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z9 = false;
        }
        return v(str, str2, str3, z9);
    }

    public static boolean y(String str, String prefix, int i9, boolean z9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        return !z9 ? str.startsWith(prefix, i9) : r(str, i9, prefix, 0, prefix.length(), z9);
    }

    public static boolean z(String str, String prefix, boolean z9) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        return !z9 ? str.startsWith(prefix) : r(str, 0, prefix, 0, prefix.length(), z9);
    }
}
