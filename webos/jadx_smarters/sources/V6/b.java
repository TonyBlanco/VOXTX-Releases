package V6;

import V6.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10107b;

    public b(int i9, byte[] bArr) {
        this.f10106a = i9;
        this.f10107b = bArr;
    }

    public static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.h()) {
            throw new IllegalArgumentException();
        }
        j.b bVarF = jVar.f(fVar);
        j.a[] aVarArrA = bVarF.a();
        int iA = 0;
        for (j.a aVar : aVarArrA) {
            iA += aVar.a();
        }
        b[] bVarArr = new b[iA];
        int i9 = 0;
        for (j.a aVar2 : aVarArrA) {
            int i10 = 0;
            while (i10 < aVar2.a()) {
                int iB = aVar2.b();
                bVarArr[i9] = new b(iB, new byte[bVarF.b() + iB]);
                i10++;
                i9++;
            }
        }
        int length = bVarArr[0].f10107b.length;
        int i11 = iA - 1;
        while (i11 >= 0 && bVarArr[i11].f10107b.length != length) {
            i11--;
        }
        int i12 = i11 + 1;
        int iB2 = length - bVarF.b();
        int i13 = 0;
        for (int i14 = 0; i14 < iB2; i14++) {
            int i15 = 0;
            while (i15 < i9) {
                bVarArr[i15].f10107b[i14] = bArr[i13];
                i15++;
                i13++;
            }
        }
        int i16 = i12;
        while (i16 < i9) {
            bVarArr[i16].f10107b[iB2] = bArr[i13];
            i16++;
            i13++;
        }
        int length2 = bVarArr[0].f10107b.length;
        while (iB2 < length2) {
            int i17 = 0;
            while (i17 < i9) {
                bVarArr[i17].f10107b[i17 < i12 ? iB2 : iB2 + 1] = bArr[i13];
                i17++;
                i13++;
            }
            iB2++;
        }
        return bVarArr;
    }

    public byte[] a() {
        return this.f10107b;
    }

    public int c() {
        return this.f10106a;
    }
}
