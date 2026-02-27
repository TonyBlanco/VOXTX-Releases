package D6;

import x6.AbstractC2961b;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractC2961b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f1477d = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1479c;

    public h(x6.i iVar) {
        super(iVar);
        this.f1478b = f1477d;
        this.f1479c = new int[32];
    }

    public static int g(int[] iArr) throws x6.k {
        int length = iArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > i9) {
                i11 = i12;
                i9 = i13;
            }
            if (i13 > i10) {
                i10 = i13;
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i11;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i11 <= i14) {
            int i19 = i11;
            i11 = i14;
            i14 = i19;
        }
        if (i11 - i14 <= length / 16) {
            throw x6.k.a();
        }
        int i20 = i11 - 1;
        int i21 = i20;
        int i22 = -1;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = i23 * i23 * (i11 - i20) * (i10 - iArr[i20]);
            if (i24 > i22) {
                i21 = i20;
                i22 = i24;
            }
            i20--;
        }
        return i21 << 3;
    }

    @Override // x6.AbstractC2961b
    public b b() {
        x6.i iVarE = e();
        int iD = iVarE.d();
        int iA = iVarE.a();
        b bVar = new b(iD, iA);
        h(iD);
        int[] iArr = this.f1479c;
        for (int i9 = 1; i9 < 5; i9++) {
            byte[] bArrC = iVarE.c((iA * i9) / 5, this.f1478b);
            int i10 = (iD << 2) / 5;
            for (int i11 = iD / 5; i11 < i10; i11++) {
                int i12 = (bArrC[i11] & 255) >> 3;
                iArr[i12] = iArr[i12] + 1;
            }
        }
        int iG = g(iArr);
        byte[] bArrB = iVarE.b();
        for (int i13 = 0; i13 < iA; i13++) {
            int i14 = i13 * iD;
            for (int i15 = 0; i15 < iD; i15++) {
                if ((bArrB[i14 + i15] & 255) < iG) {
                    bVar.n(i15, i13);
                }
            }
        }
        return bVar;
    }

    @Override // x6.AbstractC2961b
    public a c(int i9, a aVar) throws x6.k {
        x6.i iVarE = e();
        int iD = iVarE.d();
        if (aVar == null || aVar.l() < iD) {
            aVar = new a(iD);
        } else {
            aVar.e();
        }
        h(iD);
        byte[] bArrC = iVarE.c(i9, this.f1478b);
        int[] iArr = this.f1479c;
        for (int i10 = 0; i10 < iD; i10++) {
            int i11 = (bArrC[i10] & 255) >> 3;
            iArr[i11] = iArr[i11] + 1;
        }
        int iG = g(iArr);
        if (iD < 3) {
            for (int i12 = 0; i12 < iD; i12++) {
                if ((bArrC[i12] & 255) < iG) {
                    aVar.q(i12);
                }
            }
        } else {
            int i13 = 1;
            int i14 = bArrC[0] & 255;
            int i15 = bArrC[1] & 255;
            while (i13 < iD - 1) {
                int i16 = i13 + 1;
                int i17 = bArrC[i16] & 255;
                if ((((i15 << 2) - i14) - i17) / 2 < iG) {
                    aVar.q(i13);
                }
                i14 = i15;
                i13 = i16;
                i15 = i17;
            }
        }
        return aVar;
    }

    public final void h(int i9) {
        if (this.f1478b.length < i9) {
            this.f1478b = new byte[i9];
        }
        for (int i10 = 0; i10 < 32; i10++) {
            this.f1479c[i10] = 0;
        }
    }
}
