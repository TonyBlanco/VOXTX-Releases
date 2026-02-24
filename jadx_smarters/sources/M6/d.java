package M6;

import java.util.Arrays;
import java.util.Map;
import org.apache.http.HttpStatus;
import x6.C2963d;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f5179c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f5181e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5182a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5183b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, HttpStatus.SC_FAILED_DEPENDENCY, HttpStatus.SC_METHOD_FAILURE, 418, 404, HttpStatus.SC_PAYMENT_REQUIRED, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, HttpStatus.SC_UNPROCESSABLE_ENTITY, HttpStatus.SC_NOT_ACCEPTABLE, HttpStatus.SC_GONE, 364, 358, 310, 314, HttpStatus.SC_MOVED_TEMPORARILY, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f5180d = iArr;
        f5181e = iArr[47];
    }

    public static void h(CharSequence charSequence) throws C2963d {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    public static void i(CharSequence charSequence, int i9, int i10) throws C2963d {
        int iIndexOf = 0;
        int i11 = 1;
        for (int i12 = i9 - 1; i12 >= 0; i12--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i12)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        if (charSequence.charAt(i9) != f5179c[iIndexOf % 47]) {
            throw C2963d.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String j(java.lang.CharSequence r9) throws x6.g {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r0) goto Lb0
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L9e
            r5 = 100
            if (r4 > r5) goto L9e
            int r5 = r0 + (-1)
            if (r3 >= r5) goto La7
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L97;
                case 98: goto L4e;
                case 99: goto L3d;
                case 100: goto L2f;
                default: goto L2c;
            }
        L2c:
            r4 = 0
            goto L9e
        L2f:
            if (r5 < r8) goto L38
            if (r5 > r7) goto L38
            int r5 = r5 + 32
        L35:
            char r4 = (char) r5
            goto L9e
        L38:
            x6.g r9 = x6.g.a()
            throw r9
        L3d:
            if (r5 < r8) goto L44
            if (r5 > r6) goto L44
            int r5 = r5 + (-32)
            goto L35
        L44:
            if (r5 != r7) goto L49
            r4 = 58
            goto L9e
        L49:
            x6.g r9 = x6.g.a()
            throw r9
        L4e:
            if (r5 < r8) goto L57
            r4 = 69
            if (r5 > r4) goto L57
            int r5 = r5 + (-38)
            goto L35
        L57:
            r4 = 70
            if (r5 < r4) goto L62
            r4 = 74
            if (r5 > r4) goto L62
            int r5 = r5 + (-11)
            goto L35
        L62:
            r4 = 75
            if (r5 < r4) goto L6b
            if (r5 > r6) goto L6b
            int r5 = r5 + 16
            goto L35
        L6b:
            r4 = 80
            if (r5 < r4) goto L76
            r4 = 84
            if (r5 > r4) goto L76
            int r5 = r5 + 43
            goto L35
        L76:
            r4 = 85
            if (r5 != r4) goto L7b
            goto L2c
        L7b:
            r4 = 86
            if (r5 != r4) goto L82
            r4 = 64
            goto L9e
        L82:
            r4 = 87
            if (r5 != r4) goto L89
            r4 = 96
            goto L9e
        L89:
            r4 = 88
            if (r5 < r4) goto L92
            if (r5 > r7) goto L92
            r4 = 127(0x7f, float:1.78E-43)
            goto L9e
        L92:
            x6.g r9 = x6.g.a()
            throw r9
        L97:
            if (r5 < r8) goto La2
            if (r5 > r7) goto La2
            int r5 = r5 + (-64)
            goto L35
        L9e:
            r1.append(r4)
            goto Lac
        La2:
            x6.g r9 = x6.g.a()
            throw r9
        La7:
            x6.g r9 = x6.g.a()
            throw r9
        Lac:
            int r3 = r3 + 1
            goto Lb
        Lb0:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.d.j(java.lang.CharSequence):java.lang.String");
    }

    private static char l(int i9) throws x6.k {
        int i10 = 0;
        while (true) {
            int[] iArr = f5180d;
            if (i10 >= iArr.length) {
                throw x6.k.a();
            }
            if (iArr[i10] == i9) {
                return f5179c[i10];
            }
            i10++;
        }
    }

    public static int m(int[] iArr) {
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int iRound = Math.round((iArr[i12] * 9.0f) / i9);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i12 & 1) == 0) {
                for (int i13 = 0; i13 < iRound; i13++) {
                    i11 = (i11 << 1) | 1;
                }
            } else {
                i11 <<= iRound;
            }
        }
        return i11;
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) throws C2963d, x6.k {
        int iJ = aVar.j(k(aVar)[1]);
        int iL = aVar.l();
        int[] iArr = this.f5183b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f5182a;
        sb.setLength(0);
        while (true) {
            k.f(aVar, iJ, iArr);
            int iM = m(iArr);
            if (iM < 0) {
                throw x6.k.a();
            }
            char cL = l(iM);
            sb.append(cL);
            int i10 = iJ;
            for (int i11 : iArr) {
                i10 += i11;
            }
            int iJ2 = aVar.j(i10);
            if (cL == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i12 = 0;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                if (iJ2 == iL || !aVar.h(iJ2)) {
                    throw x6.k.a();
                }
                if (sb.length() < 2) {
                    throw x6.k.a();
                }
                h(sb);
                sb.setLength(sb.length() - 2);
                float f9 = i9;
                return new x6.o(j(sb), null, new x6.q[]{new x6.q((r0[1] + r0[0]) / 2.0f, f9), new x6.q(iJ + (i12 / 2.0f), f9)}, EnumC2960a.CODE_93);
            }
            iJ = iJ2;
        }
    }

    public final int[] k(D6.a aVar) throws x6.k {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        Arrays.fill(this.f5183b, 0);
        int[] iArr = this.f5183b;
        int length = iArr.length;
        int i9 = iJ;
        boolean z9 = false;
        int i10 = 0;
        while (iJ < iL) {
            if (aVar.h(iJ) != z9) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (m(iArr) == f5181e) {
                        return new int[]{i9, iJ};
                    }
                    i9 += iArr[0] + iArr[1];
                    int i11 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i11);
                    iArr[i11] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z9 = !z9;
            }
            iJ++;
        }
        throw x6.k.a();
    }
}
