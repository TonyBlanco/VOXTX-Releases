package K6;

import D6.b;
import D6.e;
import L6.c;
import java.util.Map;
import x6.C2962c;
import x6.C2963d;
import x6.EnumC2960a;
import x6.g;
import x6.k;
import x6.m;
import x6.o;
import x6.p;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q[] f3822b = new q[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3823a = new c();

    private static b c(b bVar) throws k {
        int[] iArrH = bVar.h();
        if (iArrH == null) {
            throw k.a();
        }
        int i9 = iArrH[0];
        int i10 = iArrH[1];
        int i11 = iArrH[2];
        int i12 = iArrH[3];
        b bVar2 = new b(30, 33);
        for (int i13 = 0; i13 < 33; i13++) {
            int i14 = (((i13 * i12) + (i12 / 2)) / 33) + i10;
            for (int i15 = 0; i15 < 30; i15++) {
                if (bVar.f(((((i15 * i11) + (i11 / 2)) + (((i13 & 1) * i11) / 2)) / 30) + i9, i14)) {
                    bVar2.n(i15, i13);
                }
            }
        }
        return bVar2;
    }

    @Override // x6.m
    public o a(C2962c c2962c) {
        return b(c2962c, null);
    }

    @Override // x6.m
    public o b(C2962c c2962c, Map map) throws g, C2963d, k {
        e eVarB = this.f3823a.b(c(c2962c.a()), map);
        o oVar = new o(eVarB.h(), eVarB.e(), f3822b, EnumC2960a.MAXICODE);
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
