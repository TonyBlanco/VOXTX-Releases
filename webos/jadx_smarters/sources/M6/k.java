package M6;

import java.util.Arrays;
import java.util.Map;
import x6.C2962c;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements x6.m {
    public static float e(int[] iArr, int[] iArr2, float f9) {
        int length = iArr.length;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i9 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i9 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i9;
        float f11 = f10 / i10;
        float f12 = f9 * f11;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float f14 = iArr2[i12] * f11;
            float f15 = iArr[i12];
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }

    public static void f(D6.a aVar, int i9, int[] iArr) throws x6.k {
        int length = iArr.length;
        int i10 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iL = aVar.l();
        if (i9 >= iL) {
            throw x6.k.a();
        }
        boolean z9 = !aVar.h(i9);
        while (i9 < iL) {
            if (aVar.h(i9) == z9) {
                i10++;
                if (i10 == length) {
                    break;
                }
                iArr[i10] = 1;
                z9 = !z9;
            } else {
                iArr[i10] = iArr[i10] + 1;
            }
            i9++;
        }
        if (i10 != length) {
            if (i10 != length - 1 || i9 != iL) {
                throw x6.k.a();
            }
        }
    }

    public static void g(D6.a aVar, int i9, int[] iArr) throws x6.k {
        int length = iArr.length;
        boolean zH = aVar.h(i9);
        while (i9 > 0 && length >= 0) {
            i9--;
            if (aVar.h(i9) != zH) {
                length--;
                zH = !zH;
            }
        }
        if (length >= 0) {
            throw x6.k.a();
        }
        f(aVar, i9 + 1, iArr);
    }

    @Override // x6.m
    public x6.o a(C2962c c2962c) {
        return b(c2962c, null);
    }

    @Override // x6.m
    public x6.o b(C2962c c2962c, Map map) throws x6.k {
        try {
            return d(c2962c, map);
        } catch (x6.k e9) {
            if (map == null || !map.containsKey(EnumC2964e.TRY_HARDER) || !c2962c.e()) {
                throw e9;
            }
            C2962c c2962cF = c2962c.f();
            x6.o oVarD = d(c2962cF, map);
            Map mapD = oVarD.d();
            int iIntValue = 270;
            if (mapD != null) {
                x6.p pVar = x6.p.ORIENTATION;
                if (mapD.containsKey(pVar)) {
                    iIntValue = (((Integer) mapD.get(pVar)).intValue() + 270) % 360;
                }
            }
            oVarD.h(x6.p.ORIENTATION, Integer.valueOf(iIntValue));
            x6.q[] qVarArrE = oVarD.e();
            if (qVarArrE != null) {
                int iC = c2962cF.c();
                for (int i9 = 0; i9 < qVarArrE.length; i9++) {
                    qVarArrE[i9] = new x6.q((iC - qVarArrE[i9].d()) - 1.0f, qVarArrE[i9].c());
                }
            }
            return oVarD;
        }
    }

    public abstract x6.o c(int i9, D6.a aVar, Map map);

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = r22.b(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e0, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x6.o d(x6.C2962c r22, java.util.Map r23) throws x6.k {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.k.d(x6.c, java.util.Map):x6.o");
    }

    @Override // x6.m
    public void reset() {
    }
}
