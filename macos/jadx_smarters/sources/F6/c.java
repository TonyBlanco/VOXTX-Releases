package F6;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2043a;

    public c(a aVar) {
        this.f2043a = aVar;
    }

    public void a(int[] iArr, int i9) throws e {
        b bVar = new b(this.f2043a, iArr);
        int[] iArr2 = new int[i9];
        boolean z9 = true;
        for (int i10 = 0; i10 < i9; i10++) {
            a aVar = this.f2043a;
            int iC = bVar.c(aVar.c(aVar.d() + i10));
            iArr2[(i9 - 1) - i10] = iC;
            if (iC != 0) {
                z9 = false;
            }
        }
        if (z9) {
            return;
        }
        b[] bVarArrD = d(this.f2043a.b(i9, 1), new b(this.f2043a, iArr2), i9);
        b bVar2 = bVarArrD[0];
        b bVar3 = bVarArrD[1];
        int[] iArrB = b(bVar2);
        int[] iArrC = c(bVar3, iArrB);
        for (int i11 = 0; i11 < iArrB.length; i11++) {
            int length = (iArr.length - 1) - this.f2043a.i(iArrB[i11]);
            if (length < 0) {
                throw new e("Bad error location");
            }
            iArr[length] = a.a(iArr[length], iArrC[i11]);
        }
    }

    public final int[] b(b bVar) throws e {
        int iF = bVar.f();
        if (iF == 1) {
            return new int[]{bVar.d(1)};
        }
        int[] iArr = new int[iF];
        int i9 = 0;
        for (int i10 = 1; i10 < this.f2043a.f() && i9 < iF; i10++) {
            if (bVar.c(i10) == 0) {
                iArr[i9] = this.f2043a.h(i10);
                i9++;
            }
        }
        if (i9 == iF) {
            return iArr;
        }
        throw new e("Error locator degree does not match number of roots");
    }

    public final int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            int iH = this.f2043a.h(iArr[i9]);
            int iJ = 1;
            for (int i10 = 0; i10 < length; i10++) {
                if (i9 != i10) {
                    int iJ2 = this.f2043a.j(iArr[i10], iH);
                    iJ = this.f2043a.j(iJ, (iJ2 & 1) == 0 ? iJ2 | 1 : iJ2 & (-2));
                }
            }
            iArr2[i9] = this.f2043a.j(bVar.c(iH), this.f2043a.h(iJ));
            if (this.f2043a.d() != 0) {
                iArr2[i9] = this.f2043a.j(iArr2[i9], iH);
            }
        }
        return iArr2;
    }

    public final b[] d(b bVar, b bVar2, int i9) throws e {
        if (bVar.f() < bVar2.f()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        b bVarG = this.f2043a.g();
        b bVarE = this.f2043a.e();
        do {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            b bVar4 = bVarE;
            b bVar5 = bVarG;
            bVarG = bVar4;
            if (bVar.f() < i9 / 2) {
                int iD = bVarG.d(0);
                if (iD == 0) {
                    throw new e("sigmaTilde(0) was zero");
                }
                int iH = this.f2043a.h(iD);
                return new b[]{bVarG.h(iH), bVar.h(iH)};
            }
            if (bVar.g()) {
                throw new e("r_{i-1} was zero");
            }
            b bVarG2 = this.f2043a.g();
            int iH2 = this.f2043a.h(bVar.d(bVar.f()));
            while (bVar2.f() >= bVar.f() && !bVar2.g()) {
                int iF = bVar2.f() - bVar.f();
                int iJ = this.f2043a.j(bVar2.d(bVar2.f()), iH2);
                bVarG2 = bVarG2.a(this.f2043a.b(iF, iJ));
                bVar2 = bVar2.a(bVar.j(iF, iJ));
            }
            bVarE = bVarG2.i(bVarG).a(bVar5);
        } while (bVar2.f() < bVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
