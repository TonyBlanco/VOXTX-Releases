package U6;

import V6.e;
import V6.i;
import W6.c;
import java.util.List;
import java.util.Map;
import x6.C2962c;
import x6.C2963d;
import x6.EnumC2960a;
import x6.EnumC2964e;
import x6.g;
import x6.k;
import x6.m;
import x6.o;
import x6.p;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q[] f9834b = new q[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9835a = new e();

    private static D6.b c(D6.b bVar) throws k {
        int[] iArrK = bVar.k();
        int[] iArrG = bVar.g();
        if (iArrK == null || iArrG == null) {
            throw k.a();
        }
        float fD = d(iArrK, bVar);
        int i9 = iArrK[1];
        int i10 = iArrG[1];
        int i11 = iArrK[0];
        int i12 = iArrG[0];
        if (i11 >= i12 || i9 >= i10) {
            throw k.a();
        }
        int i13 = i10 - i9;
        if (i13 != i12 - i11 && (i12 = i11 + i13) >= bVar.l()) {
            throw k.a();
        }
        int iRound = Math.round(((i12 - i11) + 1) / fD);
        int iRound2 = Math.round((i13 + 1) / fD);
        if (iRound <= 0 || iRound2 <= 0) {
            throw k.a();
        }
        if (iRound2 != iRound) {
            throw k.a();
        }
        int i14 = (int) (fD / 2.0f);
        int i15 = i9 + i14;
        int i16 = i11 + i14;
        int i17 = (((int) ((iRound - 1) * fD)) + i16) - i12;
        if (i17 > 0) {
            if (i17 > i14) {
                throw k.a();
            }
            i16 -= i17;
        }
        int i18 = (((int) ((iRound2 - 1) * fD)) + i15) - i10;
        if (i18 > 0) {
            if (i18 > i14) {
                throw k.a();
            }
            i15 -= i18;
        }
        D6.b bVar2 = new D6.b(iRound, iRound2);
        for (int i19 = 0; i19 < iRound2; i19++) {
            int i20 = ((int) (i19 * fD)) + i15;
            for (int i21 = 0; i21 < iRound; i21++) {
                if (bVar.f(((int) (i21 * fD)) + i16, i20)) {
                    bVar2.n(i21, i19);
                }
            }
        }
        return bVar2;
    }

    public static float d(int[] iArr, D6.b bVar) throws k {
        int i9 = bVar.i();
        int iL = bVar.l();
        int i10 = iArr[0];
        boolean z9 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < iL && i11 < i9) {
            if (z9 != bVar.f(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z9 = !z9;
            }
            i10++;
            i11++;
        }
        if (i10 == iL || i11 == i9) {
            throw k.a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // x6.m
    public o a(C2962c c2962c) {
        return b(c2962c, null);
    }

    @Override // x6.m
    public final o b(C2962c c2962c, Map map) throws g, C2963d, k {
        q[] qVarArrB;
        D6.e eVarB;
        if (map == null || !map.containsKey(EnumC2964e.PURE_BARCODE)) {
            D6.g gVarE = new c(c2962c.a()).e(map);
            D6.e eVarB2 = this.f9835a.b(gVarE.a(), map);
            qVarArrB = gVarE.b();
            eVarB = eVarB2;
        } else {
            eVarB = this.f9835a.b(c(c2962c.a()), map);
            qVarArrB = f9834b;
        }
        if (eVarB.d() instanceof i) {
            ((i) eVarB.d()).a(qVarArrB);
        }
        o oVar = new o(eVarB.h(), eVarB.e(), qVarArrB, EnumC2960a.QR_CODE);
        List listA = eVarB.a();
        if (listA != null) {
            oVar.h(p.BYTE_SEGMENTS, listA);
        }
        String strB = eVarB.b();
        if (strB != null) {
            oVar.h(p.ERROR_CORRECTION_LEVEL, strB);
        }
        if (eVarB.i()) {
            oVar.h(p.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVarB.g()));
            oVar.h(p.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVarB.f()));
        }
        return oVar;
    }

    @Override // x6.m
    public void reset() {
    }
}
