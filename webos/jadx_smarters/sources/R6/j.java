package R6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import x6.C2963d;
import x6.k;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S6.a f9346a = new S6.a();

    public static c a(h hVar) {
        int[] iArrJ;
        if (hVar == null || (iArrJ = hVar.j()) == null) {
            return null;
        }
        int iP = p(iArrJ);
        int i9 = 0;
        int i10 = 0;
        for (int i11 : iArrJ) {
            i10 += iP - i11;
            if (i11 > 0) {
                break;
            }
        }
        d[] dVarArrD = hVar.d();
        for (int i12 = 0; i10 > 0 && dVarArrD[i12] == null; i12++) {
            i10--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            int i13 = iArrJ[length];
            i9 += iP - i13;
            if (i13 > 0) {
                break;
            }
        }
        for (int length2 = dVarArrD.length - 1; i9 > 0 && dVarArrD[length2] == null; length2--) {
            i9--;
        }
        return hVar.a().a(i10, i9, hVar.k());
    }

    public static void b(f fVar, b[][] bVarArr) throws k {
        b bVar = bVarArr[0][1];
        int[] iArrA = bVar.a();
        int iJ = (fVar.j() * fVar.l()) - r(fVar.k());
        if (iArrA.length == 0) {
            if (iJ <= 0 || iJ > 928) {
                throw k.a();
            }
            bVar.b(iJ);
            return;
        }
        if (iArrA[0] == iJ || iJ <= 0 || iJ > 928) {
            return;
        }
        bVar.b(iJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r0 = -r0;
        r8 = !r8;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(D6.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.f(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R6.j.c(D6.b, int, int, boolean, int, int):int");
    }

    public static boolean d(int i9, int i10, int i11) {
        return i10 + (-2) <= i9 && i9 <= i11 + 2;
    }

    public static int e(int[] iArr, int[] iArr2, int i9) throws C2963d {
        if ((iArr2 == null || iArr2.length <= (i9 / 2) + 3) && i9 >= 0 && i9 <= 512) {
            return f9346a.a(iArr, i9, iArr2);
        }
        throw C2963d.a();
    }

    public static b[][] f(f fVar) {
        int iC;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, fVar.l(), fVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i9 = 0;
            while (true) {
                if (i9 < bVarArr2.length) {
                    bVarArr2[i9] = new b();
                    i9++;
                }
            }
        }
        int i10 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < bVarArr.length) {
                        bVarArr[iC][i10].b(dVar.e());
                    }
                }
            }
            i10++;
        }
        return bVarArr;
    }

    public static D6.e g(f fVar) throws k {
        b[][] bVarArrF = f(fVar);
        b(fVar, bVarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i9 = 0; i9 < fVar.l(); i9++) {
            int i10 = 0;
            while (i10 < fVar.j()) {
                int i11 = i10 + 1;
                int[] iArrA = bVarArrF[i9][i11].a();
                int iJ = (fVar.j() * i9) + i10;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrA.length == 1) {
                    iArr[iJ] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrA);
                }
                i10 = i11;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i12 = 0; i12 < size; i12++) {
            iArr2[i12] = (int[]) arrayList2.get(i12);
        }
        return h(fVar.k(), iArr, Q6.a.b(arrayList), Q6.a.b(arrayList3), iArr2);
    }

    public static D6.e h(int i9, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws C2963d {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i10 = 100;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                throw C2963d.a();
            }
            for (int i12 = 0; i12 < length; i12++) {
                iArr[iArr3[i12]] = iArr4[i12][iArr5[i12]];
            }
            try {
                return j(iArr, i9, iArr2);
            } catch (C2963d unused) {
                if (length == 0) {
                    throw C2963d.a();
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    int i14 = iArr5[i13];
                    if (i14 < iArr4[i13].length - 1) {
                        iArr5[i13] = i14 + 1;
                        break;
                    }
                    iArr5[i13] = 0;
                    if (i13 == length - 1) {
                        throw C2963d.a();
                    }
                    i13++;
                }
                i10 = i11;
            }
        }
    }

    public static D6.e i(D6.b bVar, q qVar, q qVar2, q qVar3, q qVar4, int i9, int i10) {
        f fVarV;
        int i11;
        int i12;
        g gVar;
        int i13;
        h hVarS = null;
        h hVarS2 = null;
        c cVar = new c(bVar, qVar, qVar2, qVar3, qVar4);
        boolean z9 = true;
        while (true) {
            if (qVar != null) {
                hVarS = s(bVar, cVar, qVar, true, i9, i10);
            }
            if (qVar3 != null) {
                hVarS2 = s(bVar, cVar, qVar3, false, i9, i10);
            }
            fVarV = v(hVarS, hVarS2);
            if (fVarV == null) {
                throw k.a();
            }
            c cVarM = fVarV.m();
            if (!z9 || cVarM == null || (cVarM.g() >= cVar.g() && cVarM.e() <= cVar.e())) {
                break;
            }
            cVar = cVarM;
            z9 = false;
        }
        fVarV.p(cVar);
        int iJ = fVarV.j() + 1;
        fVarV.q(0, hVarS);
        fVarV.q(iJ, hVarS2);
        boolean z10 = hVarS != null;
        int iMin = i9;
        int iMax = i10;
        for (int i14 = 1; i14 <= iJ; i14++) {
            int i15 = z10 ? i14 : iJ - i14;
            if (fVarV.n(i15) == null) {
                g hVar = (i15 == 0 || i15 == iJ) ? new h(cVar, i15 == 0) : new g(cVar);
                fVarV.q(i15, hVar);
                int i16 = -1;
                int iG = cVar.g();
                int i17 = -1;
                while (iG <= cVar.e()) {
                    int iT = t(fVarV, i15, iG, z10);
                    if (iT >= 0 && iT <= cVar.d()) {
                        i13 = iT;
                    } else if (i17 != i16) {
                        i13 = i17;
                    } else {
                        i11 = i17;
                        i12 = iG;
                        gVar = hVar;
                        i17 = i11;
                        iG = i12 + 1;
                        hVar = gVar;
                        i16 = -1;
                    }
                    i11 = i17;
                    int i18 = iG;
                    gVar = hVar;
                    d dVarK = k(bVar, cVar.f(), cVar.d(), z10, i13, i18, iMin, iMax);
                    i12 = i18;
                    if (dVarK != null) {
                        gVar.f(i12, dVarK);
                        iMin = Math.min(iMin, dVarK.f());
                        iMax = Math.max(iMax, dVarK.f());
                        i17 = i13;
                    } else {
                        i17 = i11;
                    }
                    iG = i12 + 1;
                    hVar = gVar;
                    i16 = -1;
                }
            }
        }
        return g(fVarV);
    }

    public static D6.e j(int[] iArr, int i9, int[] iArr2) throws x6.g, C2963d {
        if (iArr.length == 0) {
            throw x6.g.a();
        }
        int i10 = 1 << (i9 + 1);
        int iE = e(iArr, iArr2, i10);
        w(iArr, i10);
        D6.e eVarB = e.b(iArr, String.valueOf(i9));
        eVarB.k(Integer.valueOf(iE));
        eVarB.j(Integer.valueOf(iArr2.length));
        return eVarB;
    }

    public static d k(D6.b bVar, int i9, int i10, boolean z9, int i11, int i12, int i13, int i14) {
        int i15;
        int iD;
        int iA;
        int iC = c(bVar, i9, i10, z9, i11, i12);
        int[] iArrQ = q(bVar, i9, i10, z9, iC, i12);
        if (iArrQ == null) {
            return null;
        }
        int iD2 = E6.a.d(iArrQ);
        if (z9) {
            i15 = iC + iD2;
        } else {
            for (int i16 = 0; i16 < iArrQ.length / 2; i16++) {
                int i17 = iArrQ[i16];
                iArrQ[i16] = iArrQ[(iArrQ.length - 1) - i16];
                iArrQ[(iArrQ.length - 1) - i16] = i17;
            }
            iC -= iD2;
            i15 = iC;
        }
        if (d(iD2, i13, i14) && (iA = Q6.a.a((iD = i.d(iArrQ)))) != -1) {
            return new d(iC, i15, n(iD), iA);
        }
        return null;
    }

    public static a l(h hVar, h hVar2) {
        a aVarI;
        a aVarI2;
        if (hVar == null || (aVarI = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (aVarI2 = hVar2.i()) == null || aVarI.a() == aVarI2.a() || aVarI.b() == aVarI2.b() || aVarI.c() == aVarI2.c()) {
            return aVarI;
        }
        return null;
    }

    public static int[] m(int i9) {
        int[] iArr = new int[8];
        int i10 = 0;
        int i11 = 7;
        while (true) {
            int i12 = i9 & 1;
            if (i12 != i10) {
                i11--;
                if (i11 < 0) {
                    return iArr;
                }
                i10 = i12;
            }
            iArr[i11] = iArr[i11] + 1;
            i9 >>= 1;
        }
    }

    public static int n(int i9) {
        return o(m(i9));
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int iMax = -1;
        for (int i9 : iArr) {
            iMax = Math.max(iMax, i9);
        }
        return iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] q(D6.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = 1
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.f(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R6.j.q(D6.b, int, int, boolean, int, int):int[]");
    }

    public static int r(int i9) {
        return 2 << i9;
    }

    public static h s(D6.b bVar, c cVar, q qVar, boolean z9, int i9, int i10) {
        h hVar = new h(cVar, z9);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 1 : -1;
            int iC = (int) qVar.c();
            for (int iD = (int) qVar.d(); iD <= cVar.e() && iD >= cVar.g(); iD += i12) {
                d dVarK = k(bVar, 0, bVar.l(), z9, iC, iD, i9, i10);
                if (dVarK != null) {
                    hVar.f(iD, dVarK);
                    iC = z9 ? dVarK.d() : dVarK.b();
                }
            }
            i11++;
        }
        return hVar;
    }

    public static int t(f fVar, int i9, int i10, boolean z9) {
        int i11 = z9 ? 1 : -1;
        int i12 = i9 - i11;
        d dVarB = u(fVar, i12) ? fVar.n(i12).b(i10) : null;
        if (dVarB != null) {
            return z9 ? dVarB.b() : dVarB.d();
        }
        d dVarC = fVar.n(i9).c(i10);
        if (dVarC != null) {
            return z9 ? dVarC.d() : dVarC.b();
        }
        if (u(fVar, i12)) {
            dVarC = fVar.n(i12).c(i10);
        }
        if (dVarC != null) {
            return z9 ? dVarC.b() : dVarC.d();
        }
        int i13 = 0;
        while (true) {
            i9 -= i11;
            if (!u(fVar, i9)) {
                c cVarM = fVar.m();
                return z9 ? cVarM.f() : cVarM.d();
            }
            for (d dVar : fVar.n(i9).d()) {
                if (dVar != null) {
                    return (z9 ? dVar.b() : dVar.d()) + (i11 * i13 * (dVar.b() - dVar.d()));
                }
            }
            i13++;
        }
    }

    public static boolean u(f fVar, int i9) {
        return i9 >= 0 && i9 <= fVar.j() + 1;
    }

    public static f v(h hVar, h hVar2) {
        a aVarL;
        if ((hVar == null && hVar2 == null) || (aVarL = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(aVarL, c.j(a(hVar), a(hVar2)));
    }

    public static void w(int[] iArr, int i9) throws x6.g {
        if (iArr.length < 4) {
            throw x6.g.a();
        }
        int i10 = iArr[0];
        if (i10 > iArr.length) {
            throw x6.g.a();
        }
        if (i10 == 0) {
            if (i9 >= iArr.length) {
                throw x6.g.a();
            }
            iArr[0] = iArr.length - i9;
        }
    }
}
