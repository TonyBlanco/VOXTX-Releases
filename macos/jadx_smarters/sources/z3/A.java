package Z3;

import B3.g0;
import B3.i0;
import O2.V1;
import Z3.u;
import android.os.SystemClock;
import b4.F;
import java.util.Arrays;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {
    public static V1 a(u.a aVar, v[] vVarArr) {
        List[] listArr = new List[vVarArr.length];
        for (int i9 = 0; i9 < vVarArr.length; i9++) {
            v vVar = vVarArr[i9];
            listArr[i9] = vVar != null ? AbstractC2743y.A(vVar) : AbstractC2743y.z();
        }
        return b(aVar, listArr);
    }

    public static V1 b(u.a aVar, List[] listArr) {
        boolean z9;
        AbstractC2743y.a aVar2 = new AbstractC2743y.a();
        for (int i9 = 0; i9 < aVar.d(); i9++) {
            i0 i0VarF = aVar.f(i9);
            List list = listArr[i9];
            for (int i10 = 0; i10 < i0VarF.f590a; i10++) {
                g0 g0VarB = i0VarF.b(i10);
                boolean z10 = aVar.a(i9, i10, false) != 0;
                int i11 = g0VarB.f581a;
                int[] iArr = new int[i11];
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 < g0VarB.f581a; i12++) {
                    iArr[i12] = aVar.g(i9, i10, i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            z9 = false;
                            break;
                        }
                        v vVar = (v) list.get(i13);
                        if (vVar.k().equals(g0VarB) && vVar.i(i12) != -1) {
                            z9 = true;
                            break;
                        }
                        i13++;
                    }
                    zArr[i12] = z9;
                }
                aVar2.a(new V1.a(g0VarB, z10, iArr, zArr));
            }
        }
        i0 i0VarH = aVar.h();
        for (int i14 = 0; i14 < i0VarH.f590a; i14++) {
            g0 g0VarB2 = i0VarH.b(i14);
            int[] iArr2 = new int[g0VarB2.f581a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new V1.a(g0VarB2, false, iArr2, new boolean[g0VarB2.f581a]));
        }
        return new V1(aVar2.k());
    }

    public static F.a c(s sVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.a(i10, jElapsedRealtime)) {
                i9++;
            }
        }
        return new F.a(1, 0, length, i9);
    }
}
