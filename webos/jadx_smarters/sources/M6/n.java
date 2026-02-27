package M6;

import java.util.EnumMap;
import java.util.Map;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5201c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5202a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f5203b = new StringBuilder();

    public static int c(int i9) throws x6.k {
        for (int i10 = 0; i10 < 10; i10++) {
            if (i9 == f5201c[i10]) {
                return i10;
            }
        }
        throw x6.k.a();
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i9 = length - 2; i9 >= 0; i9 -= 2) {
            iCharAt += charSequence.charAt(i9) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
            iCharAt2 += charSequence.charAt(i10) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            char r2 = r5.charAt(r1)
            r3 = 48
            if (r2 == r3) goto L4d
            r3 = 53
            if (r2 == r3) goto L4a
            r3 = 57
            java.lang.String r4 = ""
            if (r2 == r3) goto L15
            goto L4f
        L15:
            r2 = -1
            int r3 = r5.hashCode()
            switch(r3) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r1 = -1
            goto L3e
        L1f:
            java.lang.String r1 = "99991"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L28
            goto L1d
        L28:
            r1 = 2
            goto L3e
        L2a:
            java.lang.String r1 = "99990"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L33
            goto L1d
        L33:
            r1 = 1
            goto L3e
        L35:
            java.lang.String r3 = "90000"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L3e
            goto L1d
        L3e:
            switch(r1) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r4 = "$"
            goto L4f
        L4d:
            java.lang.String r4 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r0)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r1 = "0"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.n.e(java.lang.String):java.lang.String");
    }

    public static Map f(String str) {
        String strE;
        if (str.length() != 5 || (strE = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(x6.p.class);
        enumMap.put(x6.p.SUGGESTED_PRICE, strE);
        return enumMap;
    }

    public final int a(D6.a aVar, int[] iArr, StringBuilder sb) throws x6.k {
        int[] iArr2 = this.f5202a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i9 = 0;
        for (int i10 = 0; i10 < 5 && iK < iL; i10++) {
            int iJ = p.j(aVar, iArr2, iK, p.f5211h);
            sb.append((char) ((iJ % 10) + 48));
            for (int i11 : iArr2) {
                iK += i11;
            }
            if (iJ >= 10) {
                i9 |= 1 << (4 - i10);
            }
            if (i10 != 4) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb.length() != 5) {
            throw x6.k.a();
        }
        if (d(sb.toString()) == c(i9)) {
            return iK;
        }
        throw x6.k.a();
    }

    public x6.o b(int i9, D6.a aVar, int[] iArr) throws x6.k {
        StringBuilder sb = this.f5203b;
        sb.setLength(0);
        int iA = a(aVar, iArr, sb);
        String string = sb.toString();
        Map mapF = f(string);
        float f9 = i9;
        x6.o oVar = new x6.o(string, null, new x6.q[]{new x6.q((iArr[0] + iArr[1]) / 2.0f, f9), new x6.q(iA, f9)}, EnumC2960a.UPC_EAN_EXTENSION);
        if (mapF != null) {
            oVar.g(mapF);
        }
        return oVar;
    }
}
