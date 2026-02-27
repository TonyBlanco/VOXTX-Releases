package I6;

import D6.b;
import D6.g;
import D6.i;
import x6.k;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E6.b f2922b;

    public a(b bVar) {
        this.f2921a = bVar;
        this.f2922b = new E6.b(bVar);
    }

    public static q f(q qVar, float f9, float f10) {
        float fC = qVar.c();
        float fD = qVar.d();
        return new q(fC < f9 ? fC - 1.0f : fC + 1.0f, fD < f10 ? fD - 1.0f : fD + 1.0f);
    }

    public static b g(b bVar, q qVar, q qVar2, q qVar3, q qVar4, int i9, int i10) {
        float f9 = i9 - 0.5f;
        float f10 = i10 - 0.5f;
        return i.b().c(bVar, i9, i10, 0.5f, 0.5f, f9, 0.5f, f9, f10, 0.5f, f10, qVar.c(), qVar.d(), qVar4.c(), qVar4.d(), qVar3.c(), qVar3.d(), qVar2.c(), qVar2.d());
    }

    public static q h(q qVar, q qVar2, int i9) {
        float f9 = i9 + 1;
        return new q(qVar.c() + ((qVar2.c() - qVar.c()) / f9), qVar.d() + ((qVar2.d() - qVar.d()) / f9));
    }

    public final q a(q[] qVarArr) {
        q qVar = qVarArr[0];
        q qVar2 = qVarArr[1];
        q qVar3 = qVarArr[2];
        q qVar4 = qVarArr[3];
        int iJ = j(qVar, qVar4);
        q qVarH = h(qVar, qVar2, (j(qVar2, qVar4) + 1) << 2);
        q qVarH2 = h(qVar3, qVar2, (iJ + 1) << 2);
        int iJ2 = j(qVarH, qVar4);
        int iJ3 = j(qVarH2, qVar4);
        float f9 = iJ2 + 1;
        q qVar5 = new q(qVar4.c() + ((qVar3.c() - qVar2.c()) / f9), qVar4.d() + ((qVar3.d() - qVar2.d()) / f9));
        float f10 = iJ3 + 1;
        q qVar6 = new q(qVar4.c() + ((qVar.c() - qVar2.c()) / f10), qVar4.d() + ((qVar.d() - qVar2.d()) / f10));
        if (e(qVar5)) {
            return (e(qVar6) && j(qVarH, qVar5) + j(qVarH2, qVar5) <= j(qVarH, qVar6) + j(qVarH2, qVar6)) ? qVar6 : qVar5;
        }
        if (e(qVar6)) {
            return qVar6;
        }
        return null;
    }

    public g b() throws k {
        int iMax;
        int i9;
        q[] qVarArrD = d(c(this.f2922b.c()));
        q qVarA = a(qVarArrD);
        qVarArrD[3] = qVarA;
        if (qVarA == null) {
            throw k.a();
        }
        q[] qVarArrI = i(qVarArrD);
        q qVar = qVarArrI[0];
        q qVar2 = qVarArrI[1];
        q qVar3 = qVarArrI[2];
        q qVar4 = qVarArrI[3];
        int iJ = j(qVar, qVar4);
        int i10 = iJ + 1;
        int iJ2 = j(qVar3, qVar4);
        int i11 = iJ2 + 1;
        if ((i10 & 1) == 1) {
            i10 = iJ + 2;
        }
        if ((i11 & 1) == 1) {
            i11 = iJ2 + 2;
        }
        if (i10 * 4 >= i11 * 7 || i11 * 4 >= i10 * 7) {
            iMax = i10;
            i9 = i11;
        } else {
            iMax = Math.max(i10, i11);
            i9 = iMax;
        }
        return new g(g(this.f2921a, qVar, qVar2, qVar3, qVar4, iMax, i9), new q[]{qVar, qVar2, qVar3, qVar4});
    }

    public final q[] c(q[] qVarArr) {
        q qVar = qVarArr[0];
        q qVar2 = qVarArr[1];
        q qVar3 = qVarArr[3];
        q qVar4 = qVarArr[2];
        int iJ = j(qVar, qVar2);
        int iJ2 = j(qVar2, qVar3);
        int iJ3 = j(qVar3, qVar4);
        int iJ4 = j(qVar4, qVar);
        q[] qVarArr2 = {qVar4, qVar, qVar2, qVar3};
        if (iJ > iJ2) {
            qVarArr2[0] = qVar;
            qVarArr2[1] = qVar2;
            qVarArr2[2] = qVar3;
            qVarArr2[3] = qVar4;
            iJ = iJ2;
        }
        if (iJ > iJ3) {
            qVarArr2[0] = qVar2;
            qVarArr2[1] = qVar3;
            qVarArr2[2] = qVar4;
            qVarArr2[3] = qVar;
        } else {
            iJ3 = iJ;
        }
        if (iJ3 > iJ4) {
            qVarArr2[0] = qVar3;
            qVarArr2[1] = qVar4;
            qVarArr2[2] = qVar;
            qVarArr2[3] = qVar2;
        }
        return qVarArr2;
    }

    public final q[] d(q[] qVarArr) {
        q qVar = qVarArr[0];
        q qVar2 = qVarArr[1];
        q qVar3 = qVarArr[2];
        q qVar4 = qVarArr[3];
        int iJ = (j(qVar, qVar4) + 1) << 2;
        if (j(h(qVar2, qVar3, iJ), qVar) < j(h(qVar3, qVar2, iJ), qVar4)) {
            qVarArr[0] = qVar;
            qVarArr[1] = qVar2;
            qVarArr[2] = qVar3;
            qVarArr[3] = qVar4;
        } else {
            qVarArr[0] = qVar2;
            qVarArr[1] = qVar3;
            qVarArr[2] = qVar4;
            qVarArr[3] = qVar;
        }
        return qVarArr;
    }

    public final boolean e(q qVar) {
        return qVar.c() >= 0.0f && qVar.c() < ((float) this.f2921a.l()) && qVar.d() > 0.0f && qVar.d() < ((float) this.f2921a.i());
    }

    public final q[] i(q[] qVarArr) {
        q qVar = qVarArr[0];
        q qVar2 = qVarArr[1];
        q qVar3 = qVarArr[2];
        q qVar4 = qVarArr[3];
        int iJ = j(qVar, qVar4) + 1;
        q qVarH = h(qVar, qVar2, (j(qVar3, qVar4) + 1) << 2);
        q qVarH2 = h(qVar3, qVar2, iJ << 2);
        int iJ2 = j(qVarH, qVar4);
        int i9 = iJ2 + 1;
        int iJ3 = j(qVarH2, qVar4);
        int i10 = iJ3 + 1;
        if ((i9 & 1) == 1) {
            i9 = iJ2 + 2;
        }
        if ((i10 & 1) == 1) {
            i10 = iJ3 + 2;
        }
        float fC = (((qVar.c() + qVar2.c()) + qVar3.c()) + qVar4.c()) / 4.0f;
        float fD = (((qVar.d() + qVar2.d()) + qVar3.d()) + qVar4.d()) / 4.0f;
        q qVarF = f(qVar, fC, fD);
        q qVarF2 = f(qVar2, fC, fD);
        q qVarF3 = f(qVar3, fC, fD);
        q qVarF4 = f(qVar4, fC, fD);
        int i11 = i10 << 2;
        int i12 = i9 << 2;
        return new q[]{h(h(qVarF, qVarF2, i11), qVarF4, i12), h(h(qVarF2, qVarF, i11), qVarF3, i12), h(h(qVarF3, qVarF4, i11), qVarF2, i12), h(h(qVarF4, qVarF3, i11), qVarF, i12)};
    }

    public final int j(q qVar, q qVar2) {
        int iC = (int) qVar.c();
        int iD = (int) qVar.d();
        int iC2 = (int) qVar2.c();
        int iD2 = (int) qVar2.d();
        int i9 = 0;
        boolean z9 = Math.abs(iD2 - iD) > Math.abs(iC2 - iC);
        if (z9) {
            iD = iC;
            iC = iD;
            iD2 = iC2;
            iC2 = iD2;
        }
        int iAbs = Math.abs(iC2 - iC);
        int iAbs2 = Math.abs(iD2 - iD);
        int i10 = (-iAbs) / 2;
        int i11 = iD < iD2 ? 1 : -1;
        int i12 = iC >= iC2 ? -1 : 1;
        boolean zF = this.f2921a.f(z9 ? iD : iC, z9 ? iC : iD);
        while (iC != iC2) {
            boolean zF2 = this.f2921a.f(z9 ? iD : iC, z9 ? iC : iD);
            if (zF2 != zF) {
                i9++;
                zF = zF2;
            }
            i10 += iAbs2;
            if (i10 > 0) {
                if (iD == iD2) {
                    break;
                }
                iD += i11;
                i10 -= iAbs;
            }
            iC += i12;
        }
        return i9;
    }
}
