package H6;

import x6.C2963d;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F6.c f2732a = new F6.c(F6.a.f2031m);

    public final void a(byte[] bArr, int i9) throws C2963d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = bArr[i10] & 255;
        }
        try {
            this.f2732a.a(iArr, bArr.length - i9);
            for (int i11 = 0; i11 < i9; i11++) {
                bArr[i11] = (byte) iArr[i11];
            }
        } catch (F6.e unused) {
            throw C2963d.a();
        }
    }

    public D6.e b(D6.b bVar) throws C2963d {
        a aVar = new a(bVar);
        b[] bVarArrB = b.b(aVar.c(), aVar.b());
        int iC = 0;
        for (b bVar2 : bVarArrB) {
            iC += bVar2.c();
        }
        byte[] bArr = new byte[iC];
        int length = bVarArrB.length;
        for (int i9 = 0; i9 < length; i9++) {
            b bVar3 = bVarArrB[i9];
            byte[] bArrA = bVar3.a();
            int iC2 = bVar3.c();
            a(bArrA, iC2);
            for (int i10 = 0; i10 < iC2; i10++) {
                bArr[(i10 * length) + i9] = bArrA[i10];
            }
        }
        return c.a(bArr);
    }
}
