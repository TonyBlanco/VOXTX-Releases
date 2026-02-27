package G6;

import D6.b;
import D6.e;
import D6.g;
import H6.d;
import java.util.List;
import java.util.Map;
import x6.C2962c;
import x6.C2963d;
import x6.EnumC2960a;
import x6.EnumC2964e;
import x6.k;
import x6.m;
import x6.o;
import x6.p;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q[] f2252b = new q[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2253a = new d();

    public static b c(b bVar) throws k {
        int[] iArrK = bVar.k();
        int[] iArrG = bVar.g();
        if (iArrK == null || iArrG == null) {
            throw k.a();
        }
        int iD = d(iArrK, bVar);
        int i9 = iArrK[1];
        int i10 = iArrG[1];
        int i11 = iArrK[0];
        int i12 = ((iArrG[0] - i11) + 1) / iD;
        int i13 = ((i10 - i9) + 1) / iD;
        if (i12 <= 0 || i13 <= 0) {
            throw k.a();
        }
        int i14 = iD / 2;
        int i15 = i9 + i14;
        int i16 = i11 + i14;
        b bVar2 = new b(i12, i13);
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = (i17 * iD) + i15;
            for (int i19 = 0; i19 < i12; i19++) {
                if (bVar.f((i19 * iD) + i16, i18)) {
                    bVar2.n(i19, i17);
                }
            }
        }
        return bVar2;
    }

    public static int d(int[] iArr, b bVar) throws k {
        int iL = bVar.l();
        int i9 = iArr[0];
        int i10 = iArr[1];
        while (i9 < iL && bVar.f(i9, i10)) {
            i9++;
        }
        if (i9 == iL) {
            throw k.a();
        }
        int i11 = i9 - iArr[0];
        if (i11 != 0) {
            return i11;
        }
        throw k.a();
    }

    @Override // x6.m
    public o a(C2962c c2962c) {
        return b(c2962c, null);
    }

    @Override // x6.m
    public o b(C2962c c2962c, Map map) throws C2963d, k {
        q[] qVarArrB;
        e eVarB;
        if (map == null || !map.containsKey(EnumC2964e.PURE_BARCODE)) {
            g gVarB = new I6.a(c2962c.a()).b();
            e eVarB2 = this.f2253a.b(gVarB.a());
            qVarArrB = gVarB.b();
            eVarB = eVarB2;
        } else {
            eVarB = this.f2253a.b(c(c2962c.a()));
            qVarArrB = f2252b;
        }
        o oVar = new o(eVarB.h(), eVarB.e(), qVarArrB, EnumC2960a.DATA_MATRIX);
        List listA = eVarB.a();
        if (listA != null) {
            oVar.h(p.BYTE_SEGMENTS, listA);
        }
        String strB = eVarB.b();
        if (strB != null) {
            oVar.h(p.ERROR_CORRECTION_LEVEL, strB);
        }
        return oVar;
    }

    @Override // x6.m
    public void reset() {
    }
}
