package M6;

import java.util.Collection;
import java.util.Map;
import x6.EnumC2960a;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p[] f5196b = new p[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p[] f5197a;

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.util.Map r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            x6.e r0 = x6.EnumC2964e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            x6.a r1 = x6.EnumC2960a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            M6.e r1 = new M6.e
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            x6.a r1 = x6.EnumC2960a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            M6.l r1 = new M6.l
            r1.<init>()
            goto L23
        L35:
            x6.a r1 = x6.EnumC2960a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            M6.f r1 = new M6.f
            r1.<init>()
            r0.add(r1)
        L45:
            x6.a r1 = x6.EnumC2960a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            M6.q r3 = new M6.q
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            M6.e r3 = new M6.e
            r3.<init>()
            r0.add(r3)
            M6.f r3 = new M6.f
            r3.<init>()
            r0.add(r3)
            M6.q r3 = new M6.q
            r3.<init>()
            r0.add(r3)
        L73:
            M6.p[] r3 = M6.j.f5196b
            java.lang.Object[] r3 = r0.toArray(r3)
            M6.p[] r3 = (M6.p[]) r3
            r2.f5197a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.j.<init>(java.util.Map):void");
    }

    @Override // M6.k
    public x6.o c(int i9, D6.a aVar, Map map) throws x6.k {
        int[] iArrP = p.p(aVar);
        for (p pVar : this.f5197a) {
            try {
                x6.o oVarM = pVar.m(i9, aVar, iArrP, map);
                boolean z9 = oVarM.b() == EnumC2960a.EAN_13 && oVarM.f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC2964e.POSSIBLE_FORMATS);
                boolean z10 = collection == null || collection.contains(EnumC2960a.UPC_A);
                if (!z9 || !z10) {
                    return oVarM;
                }
                x6.o oVar = new x6.o(oVarM.f().substring(1), oVarM.c(), oVarM.e(), EnumC2960a.UPC_A);
                oVar.g(oVarM.d());
                return oVar;
            } catch (x6.n unused) {
            }
        }
        throw x6.k.a();
    }

    @Override // M6.k, x6.m
    public void reset() {
        for (p pVar : this.f5197a) {
            pVar.reset();
        }
    }
}
