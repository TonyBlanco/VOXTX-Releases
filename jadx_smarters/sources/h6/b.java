package H6;

import H6.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2725b;

    public b(int i9, byte[] bArr) {
        this.f2724a = i9;
        this.f2725b = bArr;
    }

    public static b[] b(byte[] bArr, e eVar) {
        e.c cVarD = eVar.d();
        e.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (e.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        b[] bVarArr = new b[iA];
        int i9 = 0;
        for (e.b bVar2 : bVarArrA) {
            int i10 = 0;
            while (i10 < bVar2.a()) {
                int iB = bVar2.b();
                bVarArr[i9] = new b(iB, new byte[cVarD.b() + iB]);
                i10++;
                i9++;
            }
        }
        int length = bVarArr[0].f2725b.length - cVarD.b();
        int i11 = length - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (i14 < i9) {
                bVarArr[i14].f2725b[i13] = bArr[i12];
                i14++;
                i12++;
            }
        }
        boolean z9 = eVar.i() == 24;
        int i15 = z9 ? 8 : i9;
        int i16 = 0;
        while (i16 < i15) {
            bVarArr[i16].f2725b[i11] = bArr[i12];
            i16++;
            i12++;
        }
        int length2 = bVarArr[0].f2725b.length;
        while (length < length2) {
            int i17 = 0;
            while (i17 < i9) {
                int i18 = z9 ? (i17 + 8) % i9 : i17;
                bVarArr[i18].f2725b[(!z9 || i18 <= 7) ? length : length - 1] = bArr[i12];
                i17++;
                i12++;
            }
            length++;
        }
        if (i12 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.f2725b;
    }

    public int c() {
        return this.f2724a;
    }
}
