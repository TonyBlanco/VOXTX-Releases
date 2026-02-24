package M6;

import java.util.EnumMap;
import java.util.Map;
import x6.EnumC2960a;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5199a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f5200b = new StringBuilder();

    public static Map c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(x6.p.class);
        enumMap.put(x6.p.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    public final int a(D6.a aVar, int[] iArr, StringBuilder sb) throws x6.k {
        int[] iArr2 = this.f5199a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i9 = 0;
        for (int i10 = 0; i10 < 2 && iK < iL; i10++) {
            int iJ = p.j(aVar, iArr2, iK, p.f5211h);
            sb.append((char) ((iJ % 10) + 48));
            for (int i11 : iArr2) {
                iK += i11;
            }
            if (iJ >= 10) {
                i9 |= 1 << (1 - i10);
            }
            if (i10 != 1) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb.length() != 2) {
            throw x6.k.a();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i9) {
            return iK;
        }
        throw x6.k.a();
    }

    public x6.o b(int i9, D6.a aVar, int[] iArr) throws x6.k {
        StringBuilder sb = this.f5200b;
        sb.setLength(0);
        int iA = a(aVar, iArr, sb);
        String string = sb.toString();
        Map mapC = c(string);
        float f9 = i9;
        x6.o oVar = new x6.o(string, null, new x6.q[]{new x6.q((iArr[0] + iArr[1]) / 2.0f, f9), new x6.q(iA, f9)}, EnumC2960a.UPC_EAN_EXTENSION);
        if (mapC != null) {
            oVar.g(mapC);
        }
        return oVar;
    }
}
