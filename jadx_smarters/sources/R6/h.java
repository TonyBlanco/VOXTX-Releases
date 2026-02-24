package R6;

import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9344c;

    public h(c cVar, boolean z9) {
        super(cVar);
        this.f9344c = z9;
    }

    public void g(a aVar) {
        d[] dVarArrD = d();
        m();
        l(dVarArrD, aVar);
        c cVarA = a();
        q qVarH = this.f9344c ? cVarA.h() : cVarA.i();
        q qVarB = this.f9344c ? cVarA.b() : cVarA.c();
        int iE = e((int) qVarH.d());
        int iE2 = e((int) qVarB.d());
        int iC = -1;
        int i9 = 0;
        int iMax = 1;
        while (iE < iE2) {
            d dVar = dVarArrD[iE];
            if (dVar != null) {
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i9++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i9);
                    } else if (iC2 < 0 || dVar.c() >= aVar.c() || iC2 > iE) {
                        dVarArrD[iE] = null;
                    } else {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        boolean z9 = iC2 >= iE;
                        for (int i10 = 1; i10 <= iC2 && !z9; i10++) {
                            z9 = dVarArrD[iE - i10] != null;
                        }
                        if (z9) {
                            dVarArrD[iE] = null;
                        }
                    }
                    iC = dVar.c();
                    i9 = 1;
                }
            }
            iE++;
        }
    }

    public final void h(a aVar) {
        c cVarA = a();
        q qVarH = this.f9344c ? cVarA.h() : cVarA.i();
        q qVarB = this.f9344c ? cVarA.b() : cVarA.c();
        int iE = e((int) qVarB.d());
        d[] dVarArrD = d();
        int iC = -1;
        int i9 = 0;
        int iMax = 1;
        for (int iE2 = e((int) qVarH.d()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                dVar.j();
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i9++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i9);
                    } else if (dVar.c() >= aVar.c()) {
                        dVarArrD[iE2] = null;
                    }
                    iC = dVar.c();
                    i9 = 1;
                }
            }
        }
    }

    public a i() {
        d[] dVarArrD = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArrD) {
            if (dVar != null) {
                dVar.j();
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (!this.f9344c) {
                    iC += 2;
                }
                int i9 = iC % 3;
                if (i9 == 0) {
                    bVar2.b((iE * 3) + 1);
                } else if (i9 == 1) {
                    bVar4.b(iE / 3);
                    bVar3.b(iE % 3);
                } else if (i9 == 2) {
                    bVar.b(iE + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        l(dVarArrD, aVar);
        return aVar;
    }

    public int[] j() {
        int iC;
        a aVarI = i();
        if (aVarI == null) {
            return null;
        }
        h(aVarI);
        int iC2 = aVarI.c();
        int[] iArr = new int[iC2];
        for (d dVar : d()) {
            if (dVar != null && (iC = dVar.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }

    public boolean k() {
        return this.f9344c;
    }

    public final void l(d[] dVarArr, a aVar) {
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            d dVar = dVarArr[i9];
            if (dVar != null) {
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (iC > aVar.c()) {
                    dVarArr[i9] = null;
                } else {
                    if (!this.f9344c) {
                        iC += 2;
                    }
                    int i10 = iC % 3;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2 && iE + 1 != aVar.a()) {
                                dVarArr[i9] = null;
                            }
                        } else if (iE / 3 != aVar.b() || iE % 3 != aVar.d()) {
                            dVarArr[i9] = null;
                        }
                    } else if ((iE * 3) + 1 != aVar.e()) {
                        dVarArr[i9] = null;
                    }
                }
            }
        }
    }

    public final void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    @Override // R6.g
    public String toString() {
        return "IsLeft: " + this.f9344c + '\n' + super.toString();
    }
}
