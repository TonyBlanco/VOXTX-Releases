package M6;

import java.util.Map;
import x6.EnumC2960a;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f5189b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5190c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f5191d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f5192e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5193a = -1;

    public static int h(int[] iArr) throws x6.k {
        int length = f5192e.length;
        float f9 = 0.38f;
        int i9 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            float fE = k.e(iArr, f5192e[i10], 0.5f);
            if (fE < f9) {
                i9 = i10;
                f9 = fE;
            } else if (fE == f9) {
                i9 = -1;
            }
        }
        if (i9 >= 0) {
            return i9 % 10;
        }
        throw x6.k.a();
    }

    public static void j(D6.a aVar, int i9, int i10, StringBuilder sb) throws x6.k {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i9 < i10) {
            k.f(aVar, i9, iArr);
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                iArr2[i11] = iArr[i12];
                iArr3[i11] = iArr[i12 + 1];
            }
            sb.append((char) (h(iArr2) + 48));
            sb.append((char) (h(iArr3) + 48));
            for (int i13 = 0; i13 < 10; i13++) {
                i9 += iArr[i13];
            }
        }
    }

    public static int[] l(D6.a aVar, int i9, int[] iArr) throws x6.k {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iL = aVar.l();
        int i10 = i9;
        boolean z9 = false;
        int i11 = 0;
        while (i9 < iL) {
            if (aVar.h(i9) != z9) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (k.e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i10, i9};
                    }
                    i10 += iArr2[0] + iArr2[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z9 = !z9;
            }
            i9++;
        }
        throw x6.k.a();
    }

    public static int m(D6.a aVar) throws x6.k {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        if (iJ != iL) {
            return iJ;
        }
        throw x6.k.a();
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) throws x6.g, x6.k {
        boolean z9;
        int[] iArrK = k(aVar);
        int[] iArrI = i(aVar);
        StringBuilder sb = new StringBuilder(20);
        j(aVar, iArrK[1], iArrI[0], sb);
        String string = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC2964e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f5189b;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length2) {
                z9 = false;
                break;
            }
            int i12 = iArr[i10];
            if (length == i12) {
                z9 = true;
                break;
            }
            if (i12 > i11) {
                i11 = i12;
            }
            i10++;
        }
        if (!z9 && length > i11) {
            z9 = true;
        }
        if (!z9) {
            throw x6.g.a();
        }
        float f9 = i9;
        return new x6.o(string, null, new x6.q[]{new x6.q(iArrK[1], f9), new x6.q(iArrI[0], f9)}, EnumC2960a.ITF);
    }

    public final int[] i(D6.a aVar) {
        int[] iArrL;
        aVar.p();
        try {
            int iM = m(aVar);
            try {
                iArrL = l(aVar, iM, f5191d[0]);
            } catch (x6.k unused) {
                iArrL = l(aVar, iM, f5191d[1]);
            }
            n(aVar, iArrL[0]);
            int i9 = iArrL[0];
            iArrL[0] = aVar.l() - iArrL[1];
            iArrL[1] = aVar.l() - i9;
            return iArrL;
        } finally {
            aVar.p();
        }
    }

    public final int[] k(D6.a aVar) throws x6.k {
        int[] iArrL = l(aVar, m(aVar), f5190c);
        int i9 = iArrL[1];
        int i10 = iArrL[0];
        this.f5193a = (i9 - i10) / 4;
        n(aVar, i10);
        return iArrL;
    }

    public final void n(D6.a aVar, int i9) throws x6.k {
        int iMin = Math.min(this.f5193a * 10, i9);
        for (int i10 = i9 - 1; iMin > 0 && i10 >= 0 && !aVar.h(i10); i10--) {
            iMin--;
        }
        if (iMin != 0) {
            throw x6.k.a();
        }
    }
}
