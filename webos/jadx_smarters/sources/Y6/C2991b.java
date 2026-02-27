package y6;

import D6.e;
import java.util.List;
import java.util.Map;
import x6.C2962c;
import x6.EnumC2960a;
import x6.EnumC2964e;
import x6.g;
import x6.k;
import x6.m;
import x6.o;
import x6.p;
import x6.q;
import x6.r;
import z6.C3058a;

/* JADX INFO: renamed from: y6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2991b implements m {
    @Override // x6.m
    public o a(C2962c c2962c) {
        return b(c2962c, null);
    }

    @Override // x6.m
    public o b(C2962c c2962c, Map map) throws g, k {
        q[] qVarArrB;
        q[] qVarArrB2;
        g gVar;
        r rVar;
        C2990a c2990aA;
        A6.a aVar = new A6.a(c2962c.a());
        e eVarC = null;
        try {
            c2990aA = aVar.a(false);
            qVarArrB = c2990aA.b();
        } catch (g e9) {
            e = e9;
            qVarArrB = null;
        } catch (k e10) {
            e = e10;
            qVarArrB = null;
        }
        try {
            qVarArrB2 = qVarArrB;
            gVar = null;
            eVarC = new C3058a().c(c2990aA);
            e = null;
        } catch (g e11) {
            e = e11;
            qVarArrB2 = qVarArrB;
            gVar = e;
            e = null;
        } catch (k e12) {
            e = e12;
            qVarArrB2 = qVarArrB;
            gVar = null;
        }
        if (eVarC == null) {
            try {
                C2990a c2990aA2 = aVar.a(true);
                qVarArrB2 = c2990aA2.b();
                eVarC = new C3058a().c(c2990aA2);
            } catch (g | k e13) {
                if (e != null) {
                    throw e;
                }
                if (gVar != null) {
                    throw gVar;
                }
                throw e13;
            }
        }
        q[] qVarArr = qVarArrB2;
        if (map != null && (rVar = (r) map.get(EnumC2964e.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (q qVar : qVarArr) {
                rVar.a(qVar);
            }
        }
        o oVar = new o(eVarC.h(), eVarC.e(), eVarC.c(), qVarArr, EnumC2960a.AZTEC, System.currentTimeMillis());
        List listA = eVarC.a();
        if (listA != null) {
            oVar.h(p.BYTE_SEGMENTS, listA);
        }
        String strB = eVarC.b();
        if (strB != null) {
            oVar.h(p.ERROR_CORRECTION_LEVEL, strB);
        }
        return oVar;
    }

    @Override // x6.m
    public void reset() {
    }
}
