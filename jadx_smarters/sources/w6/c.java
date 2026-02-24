package W6;

import D6.g;
import D6.i;
import V6.j;
import java.util.Map;
import x6.EnumC2964e;
import x6.k;
import x6.q;
import x6.r;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6.b f10323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f10324b;

    public c(D6.b bVar) {
        this.f10323a = bVar;
    }

    public static int c(q qVar, q qVar2, q qVar3, float f9) throws k {
        int iC = (E6.a.c(q.b(qVar, qVar2) / f9) + E6.a.c(q.b(qVar, qVar3) / f9)) / 2;
        int i9 = iC + 7;
        int i10 = i9 & 3;
        if (i10 == 0) {
            return iC + 8;
        }
        if (i10 == 2) {
            return iC + 6;
        }
        if (i10 != 3) {
            return i9;
        }
        throw k.a();
    }

    public static D6.k d(q qVar, q qVar2, q qVar3, q qVar4, int i9) {
        float fC;
        float fD;
        float f9;
        float f10 = i9 - 3.5f;
        if (qVar4 != null) {
            fC = qVar4.c();
            fD = qVar4.d();
            f9 = f10 - 3.0f;
        } else {
            fC = (qVar2.c() - qVar.c()) + qVar3.c();
            fD = (qVar2.d() - qVar.d()) + qVar3.d();
            f9 = f10;
        }
        return D6.k.b(3.5f, 3.5f, f10, 3.5f, f9, f9, 3.5f, f10, qVar.c(), qVar.d(), qVar2.c(), qVar2.d(), fC, fD, qVar3.c(), qVar3.d());
    }

    public static D6.b h(D6.b bVar, D6.k kVar, int i9) {
        return i.b().d(bVar, i9, i9, kVar);
    }

    public final float a(q qVar, q qVar2, q qVar3) {
        return (b(qVar, qVar2) + b(qVar, qVar3)) / 2.0f;
    }

    public final float b(q qVar, q qVar2) {
        float fJ = j((int) qVar.c(), (int) qVar.d(), (int) qVar2.c(), (int) qVar2.d());
        float fJ2 = j((int) qVar2.c(), (int) qVar2.d(), (int) qVar.c(), (int) qVar.d());
        return Float.isNaN(fJ) ? fJ2 / 7.0f : Float.isNaN(fJ2) ? fJ / 7.0f : (fJ + fJ2) / 14.0f;
    }

    public final g e(Map map) {
        this.f10324b = map == null ? null : (r) map.get(EnumC2964e.NEED_RESULT_POINT_CALLBACK);
        return g(new e(this.f10323a, this.f10324b).g(map));
    }

    public final a f(float f9, int i9, int i10, float f10) throws k {
        int i11 = (int) (f10 * f9);
        int iMax = Math.max(0, i9 - i11);
        int iMin = Math.min(this.f10323a.l() - 1, i9 + i11) - iMax;
        float f11 = 3.0f * f9;
        if (iMin < f11) {
            throw k.a();
        }
        int iMax2 = Math.max(0, i10 - i11);
        int iMin2 = Math.min(this.f10323a.i() - 1, i10 + i11) - iMax2;
        if (iMin2 >= f11) {
            return new b(this.f10323a, iMax, iMax2, iMin, iMin2, f9, this.f10324b).c();
        }
        throw k.a();
    }

    public final g g(f fVar) throws x6.g, k {
        a aVarF;
        d dVarB = fVar.b();
        d dVarC = fVar.c();
        d dVarA = fVar.a();
        float fA = a(dVarB, dVarC, dVarA);
        if (fA < 1.0f) {
            throw k.a();
        }
        int iC = c(dVarB, dVarC, dVarA, fA);
        j jVarG = j.g(iC);
        int iE = jVarG.e() - 7;
        if (jVarG.d().length > 0) {
            float fC = (dVarC.c() - dVarB.c()) + dVarA.c();
            float fD = (dVarC.d() - dVarB.d()) + dVarA.d();
            float f9 = 1.0f - (3.0f / iE);
            int iC2 = (int) (dVarB.c() + ((fC - dVarB.c()) * f9));
            int iD = (int) (dVarB.d() + (f9 * (fD - dVarB.d())));
            for (int i9 = 4; i9 <= 16; i9 <<= 1) {
                try {
                    aVarF = f(fA, iC2, iD, i9);
                    break;
                } catch (k unused) {
                }
            }
            aVarF = null;
        } else {
            aVarF = null;
        }
        return new g(h(this.f10323a, d(dVarB, dVarC, dVarA, aVarF, iC), iC), aVarF == null ? new q[]{dVarA, dVarB, dVarC} : new q[]{dVarA, dVarB, dVarC, aVarF});
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r15 != 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        return E6.a.b(r19, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float i(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = 1
            goto L3a
        L39:
            r12 = -1
        L3a:
            if (r4 >= r6) goto L3d
            r11 = 1
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L82
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            if (r15 != r3) goto L57
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 1
            goto L5e
        L57:
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 0
        L5e:
            D6.b r5 = r3.f10323a
            boolean r2 = r5.f(r2, r10)
            if (r0 != r2) goto L70
            r0 = 2
            if (r15 != r0) goto L6e
            float r0 = E6.a.b(r13, r14, r1, r4)
            return r0
        L6e:
            int r15 = r15 + 1
        L70:
            int r9 = r9 + r8
            if (r9 <= 0) goto L7a
            if (r14 == r6) goto L78
            int r14 = r14 + r11
            int r9 = r9 - r7
            goto L7a
        L78:
            r0 = 2
            goto L87
        L7a:
            int r13 = r13 + r12
            r5 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L82:
            r3 = r17
            r19 = r5
            goto L78
        L87:
            if (r15 != r0) goto L90
            r5 = r19
            float r0 = E6.a.b(r5, r6, r1, r4)
            return r0
        L90:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.c.i(int, int, int, int):float");
    }

    public final float j(int i9, int i10, int i11, int i12) {
        float fL;
        float fI;
        float fI2 = i(i9, i10, i11, i12);
        int iL = i9 - (i11 - i9);
        int i13 = 0;
        if (iL < 0) {
            fL = i9 / (i9 - iL);
            iL = 0;
        } else if (iL >= this.f10323a.l()) {
            fL = ((this.f10323a.l() - 1) - i9) / (iL - i9);
            iL = this.f10323a.l() - 1;
        } else {
            fL = 1.0f;
        }
        float f9 = i10;
        int i14 = (int) (f9 - ((i12 - i10) * fL));
        if (i14 < 0) {
            fI = f9 / (i10 - i14);
        } else if (i14 >= this.f10323a.i()) {
            fI = ((this.f10323a.i() - 1) - i10) / (i14 - i10);
            i13 = this.f10323a.i() - 1;
        } else {
            i13 = i14;
            fI = 1.0f;
        }
        return (fI2 + i(i9, i10, (int) (i9 + ((iL - i9) * fI)), i13)) - 1.0f;
    }
}
