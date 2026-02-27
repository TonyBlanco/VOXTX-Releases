package N6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import x6.EnumC2960a;
import x6.EnumC2964e;
import x6.k;
import x6.o;
import x6.q;
import x6.r;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f5368i = {1, 10, 34, 70, WebSocketProtocol.PAYLOAD_SHORT};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f5369j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f5370k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f5371l = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f5372m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5373n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f5374o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f5375g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f5376h = new ArrayList();

    public static void r(Collection collection, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                return;
            }
        }
        collection.add(dVar);
    }

    public static boolean t(d dVar, d dVar2) {
        int iA = (dVar.a() + (dVar2.a() * 16)) % 79;
        int iC = (dVar.d().c() * 9) + dVar2.d().c();
        if (iC > 72) {
            iC--;
        }
        if (iC > 8) {
            iC--;
        }
        return iA == iC;
    }

    public static o u(d dVar, d dVar2) {
        String strValueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(strValueOf);
        int i9 = 0;
        for (int i10 = 0; i10 < 13; i10++) {
            int iCharAt = sb.charAt(i10) - '0';
            if ((i10 & 1) == 0) {
                iCharAt *= 3;
            }
            i9 += iCharAt;
        }
        int i11 = 10 - (i9 % 10);
        if (i11 == 10) {
            i11 = 0;
        }
        sb.append(i11);
        q[] qVarArrA = dVar.d().a();
        q[] qVarArrA2 = dVar2.d().a();
        return new o(sb.toString(), null, new q[]{qVarArrA[0], qVarArrA[1], qVarArrA2[0], qVarArrA2[1]}, EnumC2960a.RSS_14);
    }

    @Override // M6.k
    public o c(int i9, D6.a aVar, Map map) throws k {
        r(this.f5375g, w(aVar, false, i9, map));
        aVar.p();
        r(this.f5376h, w(aVar, true, i9, map));
        aVar.p();
        for (d dVar : this.f5375g) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f5376h) {
                    if (dVar2.c() > 1 && t(dVar, dVar2)) {
                        return u(dVar, dVar2);
                    }
                }
            }
        }
        throw k.a();
    }

    @Override // M6.k, x6.m
    public void reset() {
        this.f5375g.clear();
        this.f5376h.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r6 r7
      0x002a: PHI (r6v7 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:28:0x0043, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v5 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:28:0x0043, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[PHI: r6 r7
      0x002d: PHI (r6v5 boolean) = (r6v3 boolean), (r6v13 boolean) binds: [B:28:0x0043, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r7v3 boolean) = (r7v1 boolean), (r7v11 boolean) binds: [B:28:0x0043, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r10, int r11) throws x6.k {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.e.s(boolean, int):void");
    }

    public final b v(D6.a aVar, c cVar, boolean z9) throws k {
        int[] iArrI = i();
        Arrays.fill(iArrI, 0);
        int[] iArrB = cVar.b();
        if (z9) {
            M6.k.g(aVar, iArrB[0], iArrI);
        } else {
            M6.k.f(aVar, iArrB[1], iArrI);
            int i9 = 0;
            for (int length = iArrI.length - 1; i9 < length; length--) {
                int i10 = iArrI[i9];
                iArrI[i9] = iArrI[length];
                iArrI[length] = i10;
                i9++;
            }
        }
        int i11 = z9 ? 16 : 15;
        float fD = E6.a.d(iArrI) / i11;
        int[] iArrM = m();
        int[] iArrK = k();
        float[] fArrN = n();
        float[] fArrL = l();
        for (int i12 = 0; i12 < iArrI.length; i12++) {
            float f9 = iArrI[i12] / fD;
            int i13 = (int) (0.5f + f9);
            if (i13 <= 0) {
                i13 = 1;
            } else if (i13 > 8) {
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                iArrM[i14] = i13;
                fArrN[i14] = f9 - i13;
            } else {
                iArrK[i14] = i13;
                fArrL[i14] = f9 - i13;
            }
        }
        s(z9, i11);
        int i15 = 0;
        int i16 = 0;
        for (int length2 = iArrM.length - 1; length2 >= 0; length2--) {
            int i17 = iArrM[length2];
            i15 = (i15 * 9) + i17;
            i16 += i17;
        }
        int i18 = 0;
        int i19 = 0;
        for (int length3 = iArrK.length - 1; length3 >= 0; length3--) {
            int i20 = iArrK[length3];
            i18 = (i18 * 9) + i20;
            i19 += i20;
        }
        int i21 = i15 + (i18 * 3);
        if (!z9) {
            if ((i19 & 1) != 0 || i19 > 10 || i19 < 4) {
                throw k.a();
            }
            int i22 = (10 - i19) / 2;
            int i23 = f5373n[i22];
            return new b((f.b(iArrK, 9 - i23, false) * f5369j[i22]) + f.b(iArrM, i23, true) + f5371l[i22], i21);
        }
        if ((i16 & 1) != 0 || i16 > 12 || i16 < 4) {
            throw k.a();
        }
        int i24 = (12 - i16) / 2;
        int i25 = f5372m[i24];
        return new b((f.b(iArrM, i25, false) * f5368i[i24]) + f.b(iArrK, 9 - i25, true) + f5370k[i24], i21);
    }

    public final d w(D6.a aVar, boolean z9, int i9, Map map) {
        try {
            c cVarY = y(aVar, i9, z9, x(aVar, z9));
            r rVar = map == null ? null : (r) map.get(EnumC2964e.NEED_RESULT_POINT_CALLBACK);
            if (rVar != null) {
                int[] iArrB = cVarY.b();
                float fL = ((iArrB[0] + iArrB[1]) - 1) / 2.0f;
                if (z9) {
                    fL = (aVar.l() - 1) - fL;
                }
                rVar.a(new q(fL, i9));
            }
            b bVarV = v(aVar, cVarY, true);
            b bVarV2 = v(aVar, cVarY, false);
            return new d((bVarV.b() * 1597) + bVarV2.b(), bVarV.a() + (bVarV2.a() * 4), cVarY);
        } catch (k unused) {
            return null;
        }
    }

    public final int[] x(D6.a aVar, boolean z9) throws k {
        int[] iArrJ = j();
        iArrJ[0] = 0;
        iArrJ[1] = 0;
        iArrJ[2] = 0;
        iArrJ[3] = 0;
        int iL = aVar.l();
        int i9 = 0;
        boolean z10 = false;
        while (i9 < iL) {
            z10 = !aVar.h(i9);
            if (z9 == z10) {
                break;
            }
            i9++;
        }
        int i10 = i9;
        int i11 = 0;
        while (i9 < iL) {
            if (aVar.h(i9) != z10) {
                iArrJ[i11] = iArrJ[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (a.p(iArrJ)) {
                        return new int[]{i10, i9};
                    }
                    i10 += iArrJ[0] + iArrJ[1];
                    iArrJ[0] = iArrJ[2];
                    iArrJ[1] = iArrJ[3];
                    iArrJ[2] = 0;
                    iArrJ[3] = 0;
                    i11--;
                }
                iArrJ[i11] = 1;
                z10 = !z10;
            }
            i9++;
        }
        throw k.a();
    }

    public final c y(D6.a aVar, int i9, boolean z9, int[] iArr) throws k {
        int iL;
        int i10;
        boolean zH = aVar.h(iArr[0]);
        int i11 = iArr[0] - 1;
        while (i11 >= 0 && zH != aVar.h(i11)) {
            i11--;
        }
        int i12 = i11 + 1;
        int i13 = iArr[0] - i12;
        int[] iArrJ = j();
        System.arraycopy(iArrJ, 0, iArrJ, 1, iArrJ.length - 1);
        iArrJ[0] = i13;
        int iQ = a.q(iArrJ, f5374o);
        int i14 = iArr[1];
        if (z9) {
            int iL2 = (aVar.l() - 1) - i12;
            iL = (aVar.l() - 1) - i14;
            i10 = iL2;
        } else {
            iL = i14;
            i10 = i12;
        }
        return new c(iQ, new int[]{i12, iArr[1]}, i10, iL, i9);
    }
}
