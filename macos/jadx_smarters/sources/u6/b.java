package U6;

import X6.c;
import X6.f;
import java.util.Map;
import x6.EnumC2960a;
import x6.EnumC2965f;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static D6.b c(f fVar, int i9, int i10, int i11) {
        X6.b bVarA = fVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i12 = i11 << 1;
        int i13 = iE + i12;
        int i14 = i12 + iD;
        int iMax = Math.max(i9, i13);
        int iMax2 = Math.max(i10, i14);
        int iMin = Math.min(iMax / i13, iMax2 / i14);
        int i15 = (iMax - (iE * iMin)) / 2;
        int i16 = (iMax2 - (iD * iMin)) / 2;
        D6.b bVar = new D6.b(iMax, iMax2);
        int i17 = 0;
        while (i17 < iD) {
            int i18 = i15;
            int i19 = 0;
            while (i19 < iE) {
                if (bVarA.b(i19, i17) == 1) {
                    bVar.o(i18, i16, iMin, iMin);
                }
                i19++;
                i18 += iMin;
            }
            i17++;
            i16 += iMin;
        }
        return bVar;
    }

    public D6.b a(String str, EnumC2960a enumC2960a, int i9, int i10) {
        return b(str, enumC2960a, i9, i10, null);
    }

    public D6.b b(String str, EnumC2960a enumC2960a, int i9, int i10, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC2960a != EnumC2960a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC2960a)));
        }
        if (i9 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i9 + 'x' + i10);
        }
        V6.f fVarValueOf = V6.f.L;
        int i11 = 4;
        if (map != null) {
            EnumC2965f enumC2965f = EnumC2965f.ERROR_CORRECTION;
            if (map.containsKey(enumC2965f)) {
                fVarValueOf = V6.f.valueOf(map.get(enumC2965f).toString());
            }
            EnumC2965f enumC2965f2 = EnumC2965f.MARGIN;
            if (map.containsKey(enumC2965f2)) {
                i11 = Integer.parseInt(map.get(enumC2965f2).toString());
            }
        }
        return c(c.n(str, fVarValueOf, map), i9, i10, i11);
    }
}
