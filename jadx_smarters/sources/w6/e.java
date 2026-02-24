package W6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.EnumC2964e;
import x6.k;
import x6.q;
import x6.r;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f10327f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f10328a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10330c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f10332e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10329b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10331d = new int[5];

    public static final class b implements Serializable, Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return Float.compare(dVar.i(), dVar2.i());
        }
    }

    public e(D6.b bVar, r rVar) {
        this.f10328a = bVar;
        this.f10332e = rVar;
    }

    public static float a(int[] iArr, int i9) {
        return ((i9 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static void e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    public static void f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public static boolean i(int[] iArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i9 += i11;
        }
        if (i9 < 7) {
            return false;
        }
        float f9 = i9 / 7.0f;
        float f10 = f9 / 2.0f;
        return Math.abs(f9 - ((float) iArr[0])) < f10 && Math.abs(f9 - ((float) iArr[1])) < f10 && Math.abs((f9 * 3.0f) - ((float) iArr[2])) < 3.0f * f10 && Math.abs(f9 - ((float) iArr[3])) < f10 && Math.abs(f9 - ((float) iArr[4])) < f10;
    }

    public static boolean j(int[] iArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            int i11 = iArr[i10];
            if (i11 == 0) {
                return false;
            }
            i9 += i11;
        }
        if (i9 < 7) {
            return false;
        }
        float f9 = i9 / 7.0f;
        float f10 = f9 / 1.333f;
        return Math.abs(f9 - ((float) iArr[0])) < f10 && Math.abs(f9 - ((float) iArr[1])) < f10 && Math.abs((f9 * 3.0f) - ((float) iArr[2])) < 3.0f * f10 && Math.abs(f9 - ((float) iArr[3])) < f10 && Math.abs(f9 - ((float) iArr[4])) < f10;
    }

    public static double o(d dVar, d dVar2) {
        double dC = dVar.c() - dVar2.c();
        double d9 = dVar.d() - dVar2.d();
        return (dC * dC) + (d9 * d9);
    }

    public final boolean b(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int[] iArrK = k();
        int i14 = 0;
        while (i9 >= i14 && i10 >= i14 && this.f10328a.f(i10 - i14, i9 - i14)) {
            iArrK[2] = iArrK[2] + 1;
            i14++;
        }
        if (iArrK[2] == 0) {
            return false;
        }
        while (i9 >= i14 && i10 >= i14 && !this.f10328a.f(i10 - i14, i9 - i14)) {
            iArrK[1] = iArrK[1] + 1;
            i14++;
        }
        if (iArrK[1] == 0) {
            return false;
        }
        while (i9 >= i14 && i10 >= i14 && this.f10328a.f(i10 - i14, i9 - i14)) {
            iArrK[0] = iArrK[0] + 1;
            i14++;
        }
        if (iArrK[0] == 0) {
            return false;
        }
        int i15 = this.f10328a.i();
        int iL = this.f10328a.l();
        int i16 = 1;
        while (true) {
            int i17 = i9 + i16;
            if (i17 >= i15 || (i13 = i10 + i16) >= iL || !this.f10328a.f(i13, i17)) {
                break;
            }
            iArrK[2] = iArrK[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i9 + i16;
            if (i18 >= i15 || (i12 = i10 + i16) >= iL || this.f10328a.f(i12, i18)) {
                break;
            }
            iArrK[3] = iArrK[3] + 1;
            i16++;
        }
        if (iArrK[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i9 + i16;
            if (i19 >= i15 || (i11 = i10 + i16) >= iL || !this.f10328a.f(i11, i19)) {
                break;
            }
            iArrK[4] = iArrK[4] + 1;
            i16++;
        }
        if (iArrK[4] == 0) {
            return false;
        }
        return j(iArrK);
    }

    public final float c(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        D6.b bVar = this.f10328a;
        int iL = bVar.l();
        int[] iArrK = k();
        int i16 = i9;
        while (i16 >= 0 && bVar.f(i16, i10)) {
            iArrK[2] = iArrK[2] + 1;
            i16--;
        }
        if (i16 < 0) {
            return Float.NaN;
        }
        while (i16 >= 0 && !bVar.f(i16, i10)) {
            int i17 = iArrK[1];
            if (i17 > i11) {
                break;
            }
            iArrK[1] = i17 + 1;
            i16--;
        }
        if (i16 >= 0 && iArrK[1] <= i11) {
            while (i16 >= 0 && bVar.f(i16, i10) && (i15 = iArrK[0]) <= i11) {
                iArrK[0] = i15 + 1;
                i16--;
            }
            if (iArrK[0] > i11) {
                return Float.NaN;
            }
            int i18 = i9 + 1;
            while (i18 < iL && bVar.f(i18, i10)) {
                iArrK[2] = iArrK[2] + 1;
                i18++;
            }
            if (i18 == iL) {
                return Float.NaN;
            }
            while (i18 < iL && !bVar.f(i18, i10) && (i14 = iArrK[3]) < i11) {
                iArrK[3] = i14 + 1;
                i18++;
            }
            if (i18 != iL && iArrK[3] < i11) {
                while (i18 < iL && bVar.f(i18, i10) && (i13 = iArrK[4]) < i11) {
                    iArrK[4] = i13 + 1;
                    i18++;
                }
                int i19 = iArrK[4];
                if (i19 < i11 && Math.abs(((((iArrK[0] + iArrK[1]) + iArrK[2]) + iArrK[3]) + i19) - i12) * 5 < i12 && i(iArrK)) {
                    return a(iArrK, i18);
                }
            }
        }
        return Float.NaN;
    }

    public final float d(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        D6.b bVar = this.f10328a;
        int i16 = bVar.i();
        int[] iArrK = k();
        int i17 = i9;
        while (i17 >= 0 && bVar.f(i10, i17)) {
            iArrK[2] = iArrK[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bVar.f(i10, i17)) {
            int i18 = iArrK[1];
            if (i18 > i11) {
                break;
            }
            iArrK[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && iArrK[1] <= i11) {
            while (i17 >= 0 && bVar.f(i10, i17) && (i15 = iArrK[0]) <= i11) {
                iArrK[0] = i15 + 1;
                i17--;
            }
            if (iArrK[0] > i11) {
                return Float.NaN;
            }
            int i19 = i9 + 1;
            while (i19 < i16 && bVar.f(i10, i19)) {
                iArrK[2] = iArrK[2] + 1;
                i19++;
            }
            if (i19 == i16) {
                return Float.NaN;
            }
            while (i19 < i16 && !bVar.f(i10, i19) && (i14 = iArrK[3]) < i11) {
                iArrK[3] = i14 + 1;
                i19++;
            }
            if (i19 != i16 && iArrK[3] < i11) {
                while (i19 < i16 && bVar.f(i10, i19) && (i13 = iArrK[4]) < i11) {
                    iArrK[4] = i13 + 1;
                    i19++;
                }
                int i20 = iArrK[4];
                if (i20 < i11 && Math.abs(((((iArrK[0] + iArrK[1]) + iArrK[2]) + iArrK[3]) + i20) - i12) * 5 < i12 * 2 && i(iArrK)) {
                    return a(iArrK, i19);
                }
            }
        }
        return Float.NaN;
    }

    public final f g(Map map) throws k {
        boolean z9 = map != null && map.containsKey(EnumC2964e.TRY_HARDER);
        int i9 = this.f10328a.i();
        int iL = this.f10328a.l();
        int i10 = (i9 * 3) / 388;
        if (i10 < 3 || z9) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean zM = false;
        while (i11 < i9 && !zM) {
            e(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < iL) {
                if (this.f10328a.f(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (i(iArr) && l(iArr, i11, i12)) {
                    if (this.f10330c) {
                        zM = m();
                    } else {
                        int iH = h();
                        int i14 = iArr[2];
                        if (iH > i14) {
                            i11 += (iH - i14) - 2;
                            i12 = iL - 1;
                        }
                    }
                    e(iArr);
                    i10 = 2;
                    i13 = 0;
                } else {
                    f(iArr);
                    i13 = 3;
                }
                i12++;
            }
            if (i(iArr) && l(iArr, i11, iL)) {
                i10 = iArr[0];
                if (this.f10330c) {
                    zM = m();
                }
            }
            i11 += i10;
        }
        d[] dVarArrN = n();
        q.e(dVarArrN);
        return new f(dVarArrN);
    }

    public final int h() {
        if (this.f10329b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f10329b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f10330c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    public final int[] k() {
        e(this.f10331d);
        return this.f10331d;
    }

    public final boolean l(int[] iArr, int i9, int i10) {
        int i11 = 0;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i10);
        float fD = d(i9, iA, iArr[2], i12);
        if (!Float.isNaN(fD)) {
            int i13 = (int) fD;
            float fC = c(iA, i13, iArr[2], i12);
            if (!Float.isNaN(fC) && b(i13, (int) fC)) {
                float f9 = i12 / 7.0f;
                while (true) {
                    if (i11 < this.f10329b.size()) {
                        d dVar = (d) this.f10329b.get(i11);
                        if (dVar.f(f9, fD, fC)) {
                            this.f10329b.set(i11, dVar.g(fD, fC, f9));
                            break;
                        }
                        i11++;
                    } else {
                        d dVar2 = new d(fC, fD, f9);
                        this.f10329b.add(dVar2);
                        r rVar = this.f10332e;
                        if (rVar != null) {
                            rVar.a(dVar2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        int size = this.f10329b.size();
        float fAbs = 0.0f;
        int i9 = 0;
        float fI = 0.0f;
        for (d dVar : this.f10329b) {
            if (dVar.h() >= 2) {
                i9++;
                fI += dVar.i();
            }
        }
        if (i9 < 3) {
            return false;
        }
        float f9 = fI / size;
        Iterator it = this.f10329b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(((d) it.next()).i() - f9);
        }
        return fAbs <= fI * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W6.d[] n() throws x6.k {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.e.n():W6.d[]");
    }
}
