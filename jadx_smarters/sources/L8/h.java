package l8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends AbstractC2212g {
    public static final String A(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) u(fArr, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final String B(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) v(iArr, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final String C(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) w(jArr, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final String D(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) x(objArr, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final String E(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) y(sArr, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String F(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return z(dArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ String G(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return A(fArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ String H(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return B(iArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ String I(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return C(jArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ String J(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return D(objArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static /* synthetic */ String K(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i9, CharSequence charSequence4, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        int i11 = (i10 & 8) != 0 ? -1 : i9;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return E(sArr, charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public static char L(char[] cArr) {
        kotlin.jvm.internal.l.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object M(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final List N(Object[] objArr, int i9) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        if (i9 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i9 + " is less than zero.").toString());
        }
        if (i9 == 0) {
            return k.f();
        }
        int length = objArr.length;
        if (i9 >= length) {
            return T(objArr);
        }
        if (i9 == 1) {
            return j.b(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i9);
        for (int i10 = length - i9; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
        }
        return arrayList;
    }

    public static List O(byte[] bArr) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? V(bArr) : j.b(Byte.valueOf(bArr[0])) : k.f();
    }

    public static List P(double[] dArr) {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? W(dArr) : j.b(Double.valueOf(dArr[0])) : k.f();
    }

    public static List Q(float[] fArr) {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? X(fArr) : j.b(Float.valueOf(fArr[0])) : k.f();
    }

    public static List R(int[] iArr) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? Y(iArr) : j.b(Integer.valueOf(iArr[0])) : k.f();
    }

    public static List S(long[] jArr) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? Z(jArr) : j.b(Long.valueOf(jArr[0])) : k.f();
    }

    public static List T(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? a0(objArr) : j.b(objArr[0]) : k.f();
    }

    public static List U(short[] sArr) {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? b0(sArr) : j.b(Short.valueOf(sArr[0])) : k.f();
    }

    public static final List V(byte[] bArr) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b9 : bArr) {
            arrayList.add(Byte.valueOf(b9));
        }
        return arrayList;
    }

    public static final List W(double[] dArr) {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d9 : dArr) {
            arrayList.add(Double.valueOf(d9));
        }
        return arrayList;
    }

    public static final List X(float[] fArr) {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f9 : fArr) {
            arrayList.add(Float.valueOf(f9));
        }
        return arrayList;
    }

    public static final List Y(int[] iArr) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i9 : iArr) {
            arrayList.add(Integer.valueOf(i9));
        }
        return arrayList;
    }

    public static final List Z(long[] jArr) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j9 : jArr) {
            arrayList.add(Long.valueOf(j9));
        }
        return arrayList;
    }

    public static List a0(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return new ArrayList(k.c(objArr));
    }

    public static final List b0(short[] sArr) {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s9 : sArr) {
            arrayList.add(Short.valueOf(s9));
        }
        return arrayList;
    }

    public static final boolean m(Object[] objArr, Object obj) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return s(objArr, obj) >= 0;
    }

    public static List n(Object[] objArr, int i9) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        if (i9 >= 0) {
            return N(objArr, B8.h.c(objArr.length - i9, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i9 + " is less than zero.").toString());
    }

    public static List o(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return (List) p(objArr, new ArrayList());
    }

    public static final Collection p(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static B8.c q(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return new B8.c(0, r(objArr));
    }

    public static int r(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final int s(Object[] objArr, Object obj) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        int i9 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i9 < length) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i9 < length2) {
            if (kotlin.jvm.internal.l.a(obj, objArr[i9])) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static final Appendable t(double[] dArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (double d9 : dArr) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Double.valueOf(d9)) : String.valueOf(d9));
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable u(float[] fArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(fArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (float f9 : fArr) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Float.valueOf(f9)) : String.valueOf(f9));
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable v(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (int i11 : iArr) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Integer.valueOf(i11)) : String.valueOf(i11));
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable w(long[] jArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (long j9 : jArr) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Long.valueOf(j9)) : String.valueOf(j9));
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable x(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            E8.f.a(buffer, obj, lVar);
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable y(short[] sArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) throws IOException {
        kotlin.jvm.internal.l.e(sArr, "<this>");
        kotlin.jvm.internal.l.e(buffer, "buffer");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        buffer.append(prefix);
        int i10 = 0;
        for (short s9 : sArr) {
            i10++;
            if (i10 > 1) {
                buffer.append(separator);
            }
            if (i9 >= 0 && i10 > i9) {
                break;
            }
            buffer.append(lVar != null ? (CharSequence) lVar.invoke(Short.valueOf(s9)) : String.valueOf((int) s9));
        }
        if (i9 >= 0 && i10 > i9) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String z(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i9, CharSequence truncated, w8.l lVar) {
        kotlin.jvm.internal.l.e(dArr, "<this>");
        kotlin.jvm.internal.l.e(separator, "separator");
        kotlin.jvm.internal.l.e(prefix, "prefix");
        kotlin.jvm.internal.l.e(postfix, "postfix");
        kotlin.jvm.internal.l.e(truncated, "truncated");
        String string = ((StringBuilder) t(dArr, new StringBuilder(), separator, prefix, postfix, i9, truncated, lVar)).toString();
        kotlin.jvm.internal.l.d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }
}
