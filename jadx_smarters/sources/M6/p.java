package M6;

import java.util.Arrays;
import java.util.Map;
import x6.C2963d;
import x6.EnumC2960a;
import x6.EnumC2964e;
import x6.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f5207d = {1, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5208e = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5209f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f5210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[][] f5211h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f5212a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f5213b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f5214c = new g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f5210g = iArr;
        int[][] iArr2 = new int[20][];
        f5211h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i9 = 10; i9 < 20; i9++) {
            int[] iArr3 = f5210g[i9 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            f5211h[i9] = iArr4;
        }
    }

    public static boolean i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i9 = length - 1;
        return r(charSequence.subSequence(0, i9)) == Character.digit(charSequence.charAt(i9), 10);
    }

    public static int j(D6.a aVar, int[] iArr, int i9, int[][] iArr2) throws x6.k {
        k.f(aVar, i9, iArr);
        int length = iArr2.length;
        float f9 = 0.48f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fE = k.e(iArr, iArr2[i11], 0.7f);
            if (fE < f9) {
                i10 = i11;
                f9 = fE;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw x6.k.a();
    }

    public static int[] n(D6.a aVar, int i9, boolean z9, int[] iArr) {
        return o(aVar, i9, z9, iArr, new int[iArr.length]);
    }

    public static int[] o(D6.a aVar, int i9, boolean z9, int[] iArr, int[] iArr2) throws x6.k {
        int iL = aVar.l();
        int iK = z9 ? aVar.k(i9) : aVar.j(i9);
        int length = iArr.length;
        boolean z10 = z9;
        int i10 = 0;
        int i11 = iK;
        while (iK < iL) {
            if (aVar.h(iK) != z10) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (k.e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i11, iK};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i10] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z10 = !z10;
            }
            iK++;
        }
        throw x6.k.a();
    }

    public static int[] p(D6.a aVar) throws x6.k {
        int[] iArr = new int[f5207d.length];
        int[] iArrO = null;
        boolean zN = false;
        int i9 = 0;
        while (!zN) {
            int[] iArr2 = f5207d;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrO = o(aVar, i9, false, iArr2, iArr);
            int i10 = iArrO[0];
            int i11 = iArrO[1];
            int i12 = i10 - (i11 - i10);
            if (i12 >= 0) {
                zN = aVar.n(i12, i10, false);
            }
            i9 = i11;
        }
        return iArrO;
    }

    public static int r(CharSequence charSequence) throws x6.g {
        int length = charSequence.length();
        int i9 = 0;
        for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
            int iCharAt = charSequence.charAt(i10) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw x6.g.a();
            }
            i9 += iCharAt;
        }
        int i11 = i9 * 3;
        for (int i12 = length - 2; i12 >= 0; i12 -= 2) {
            int iCharAt2 = charSequence.charAt(i12) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw x6.g.a();
            }
            i11 += iCharAt2;
        }
        return (1000 - i11) % 10;
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) {
        return m(i9, aVar, p(aVar), map);
    }

    public boolean h(String str) {
        return i(str);
    }

    public int[] k(D6.a aVar, int i9) {
        return n(aVar, i9, false, f5207d);
    }

    public abstract int l(D6.a aVar, int[] iArr, StringBuilder sb);

    public x6.o m(int i9, D6.a aVar, int[] iArr, Map map) throws x6.g, C2963d, x6.k {
        int length;
        String strC;
        r rVar = map == null ? null : (r) map.get(EnumC2964e.NEED_RESULT_POINT_CALLBACK);
        if (rVar != null) {
            rVar.a(new x6.q((iArr[0] + iArr[1]) / 2.0f, i9));
        }
        StringBuilder sb = this.f5212a;
        sb.setLength(0);
        int iL = l(aVar, iArr, sb);
        if (rVar != null) {
            rVar.a(new x6.q(iL, i9));
        }
        int[] iArrK = k(aVar, iL);
        if (rVar != null) {
            rVar.a(new x6.q((iArrK[0] + iArrK[1]) / 2.0f, i9));
        }
        int i10 = iArrK[1];
        int i11 = (i10 - iArrK[0]) + i10;
        if (i11 >= aVar.l() || !aVar.n(i10, i11, false)) {
            throw x6.k.a();
        }
        String string = sb.toString();
        if (string.length() < 8) {
            throw x6.g.a();
        }
        if (!h(string)) {
            throw C2963d.a();
        }
        EnumC2960a enumC2960aQ = q();
        float f9 = i9;
        x6.o oVar = new x6.o(string, null, new x6.q[]{new x6.q((iArr[1] + iArr[0]) / 2.0f, f9), new x6.q((iArrK[1] + iArrK[0]) / 2.0f, f9)}, enumC2960aQ);
        try {
            x6.o oVarA = this.f5213b.a(i9, aVar, iArrK[1]);
            oVar.h(x6.p.UPC_EAN_EXTENSION, oVarA.f());
            oVar.g(oVarA.d());
            oVar.a(oVarA.e());
            length = oVarA.f().length();
        } catch (x6.n unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(EnumC2964e.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                if (length != i12) {
                }
            }
            throw x6.k.a();
        }
        if ((enumC2960aQ == EnumC2960a.EAN_13 || enumC2960aQ == EnumC2960a.UPC_A) && (strC = this.f5214c.c(string)) != null) {
            oVar.h(x6.p.POSSIBLE_COUNTRY, strC);
        }
        return oVar;
    }

    public abstract EnumC2960a q();
}
