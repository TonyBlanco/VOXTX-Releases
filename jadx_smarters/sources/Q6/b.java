package Q6;

import D6.e;
import R6.j;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Map;
import x6.C2962c;
import x6.EnumC2960a;
import x6.k;
import x6.m;
import x6.o;
import x6.p;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o[] f8396a = new o[0];

    public static o[] c(C2962c c2962c, Map map, boolean z9) {
        ArrayList arrayList = new ArrayList();
        T6.b bVarB = T6.a.b(c2962c, map, z9);
        for (q[] qVarArr : bVarB.b()) {
            e eVarI = j.i(bVarB.a(), qVarArr[4], qVarArr[5], qVarArr[6], qVarArr[7], f(qVarArr), d(qVarArr));
            o oVar = new o(eVarI.h(), eVarI.e(), qVarArr, EnumC2960a.PDF_417);
            oVar.h(p.ERROR_CORRECTION_LEVEL, eVarI.b());
            c cVar = (c) eVarI.d();
            if (cVar != null) {
                oVar.h(p.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(oVar);
        }
        return (o[]) arrayList.toArray(f8396a);
    }

    public static int d(q[] qVarArr) {
        return Math.max(Math.max(e(qVarArr[0], qVarArr[4]), (e(qVarArr[6], qVarArr[2]) * 17) / 18), Math.max(e(qVarArr[1], qVarArr[5]), (e(qVarArr[7], qVarArr[3]) * 17) / 18));
    }

    public static int e(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return 0;
        }
        return (int) Math.abs(qVar.c() - qVar2.c());
    }

    public static int f(q[] qVarArr) {
        return Math.min(Math.min(g(qVarArr[0], qVarArr[4]), (g(qVarArr[6], qVarArr[2]) * 17) / 18), Math.min(g(qVarArr[1], qVarArr[5]), (g(qVarArr[7], qVarArr[3]) * 17) / 18));
    }

    public static int g(q qVar, q qVar2) {
        return (qVar == null || qVar2 == null) ? a.e.API_PRIORITY_OTHER : (int) Math.abs(qVar.c() - qVar2.c());
    }

    @Override // x6.m
    public o a(C2962c c2962c) {
        return b(c2962c, null);
    }

    @Override // x6.m
    public o b(C2962c c2962c, Map map) throws k {
        o oVar;
        o[] oVarArrC = c(c2962c, map, false);
        if (oVarArrC.length == 0 || (oVar = oVarArrC[0]) == null) {
            throw k.a();
        }
        return oVar;
    }

    @Override // x6.m
    public void reset() {
    }
}
