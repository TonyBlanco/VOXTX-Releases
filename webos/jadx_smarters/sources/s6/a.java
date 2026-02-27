package S6;

import x6.C2963d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9434a = b.f9435f;

    public int a(int[] iArr, int i9, int[] iArr2) throws C2963d {
        c cVar = new c(this.f9434a, iArr);
        int[] iArr3 = new int[i9];
        boolean z9 = false;
        for (int i10 = i9; i10 > 0; i10--) {
            int iB = cVar.b(this.f9434a.c(i10));
            iArr3[i9 - i10] = iB;
            if (iB != 0) {
                z9 = true;
            }
        }
        if (!z9) {
            return 0;
        }
        c cVarD = this.f9434a.d();
        if (iArr2 != null) {
            for (int i11 : iArr2) {
                int iC = this.f9434a.c((iArr.length - 1) - i11);
                b bVar = this.f9434a;
                cVarD = cVarD.g(new c(bVar, new int[]{bVar.j(0, iC), 1}));
            }
        }
        c[] cVarArrD = d(this.f9434a.b(i9, 1), new c(this.f9434a, iArr3), i9);
        c cVar2 = cVarArrD[0];
        c cVar3 = cVarArrD[1];
        int[] iArrB = b(cVar2);
        int[] iArrC = c(cVar3, cVar2, iArrB);
        for (int i12 = 0; i12 < iArrB.length; i12++) {
            int length = (iArr.length - 1) - this.f9434a.h(iArrB[i12]);
            if (length < 0) {
                throw C2963d.a();
            }
            iArr[length] = this.f9434a.j(iArr[length], iArrC[i12]);
        }
        return iArrB.length;
    }

    public final int[] b(c cVar) throws C2963d {
        int iD = cVar.d();
        int[] iArr = new int[iD];
        int i9 = 0;
        for (int i10 = 1; i10 < this.f9434a.e() && i9 < iD; i10++) {
            if (cVar.b(i10) == 0) {
                iArr[i9] = this.f9434a.g(i10);
                i9++;
            }
        }
        if (i9 == iD) {
            return iArr;
        }
        throw C2963d.a();
    }

    public final int[] c(c cVar, c cVar2, int[] iArr) {
        int iD = cVar2.d();
        int[] iArr2 = new int[iD];
        for (int i9 = 1; i9 <= iD; i9++) {
            iArr2[iD - i9] = this.f9434a.i(i9, cVar2.c(i9));
        }
        c cVar3 = new c(this.f9434a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iG = this.f9434a.g(iArr[i10]);
            iArr3[i10] = this.f9434a.i(this.f9434a.j(0, cVar.b(iG)), this.f9434a.g(cVar3.b(iG)));
        }
        return iArr3;
    }

    public final c[] d(c cVar, c cVar2, int i9) throws C2963d {
        if (cVar.d() < cVar2.d()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        c cVarF = this.f9434a.f();
        c cVarD = this.f9434a.d();
        while (true) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
            c cVar4 = cVarD;
            c cVar5 = cVarF;
            cVarF = cVar4;
            if (cVar.d() < i9 / 2) {
                int iC = cVarF.c(0);
                if (iC == 0) {
                    throw C2963d.a();
                }
                int iG = this.f9434a.g(iC);
                return new c[]{cVarF.f(iG), cVar.f(iG)};
            }
            if (cVar.e()) {
                throw C2963d.a();
            }
            c cVarF2 = this.f9434a.f();
            int iG2 = this.f9434a.g(cVar.c(cVar.d()));
            while (cVar2.d() >= cVar.d() && !cVar2.e()) {
                int iD = cVar2.d() - cVar.d();
                int i10 = this.f9434a.i(cVar2.c(cVar2.d()), iG2);
                cVarF2 = cVarF2.a(this.f9434a.b(iD, i10));
                cVar2 = cVar2.j(cVar.h(iD, i10));
            }
            cVarD = cVarF2.g(cVarF).j(cVar5).i();
        }
    }
}
