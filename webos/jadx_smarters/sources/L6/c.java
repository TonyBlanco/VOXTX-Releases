package L6;

import F6.e;
import java.util.Map;
import x6.C2963d;
import x6.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F6.c f4094a = new F6.c(F6.a.f2033o);

    public final void a(byte[] bArr, int i9, int i10, int i11, int i12) throws C2963d {
        int i13 = i10 + i11;
        int i14 = i12 == 0 ? 1 : 2;
        int[] iArr = new int[i13 / i14];
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 == 0 || i15 % 2 == i12 - 1) {
                iArr[i15 / i14] = bArr[i15 + i9] & 255;
            }
        }
        try {
            this.f4094a.a(iArr, i11 / i14);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i12 == 0 || i16 % 2 == i12 - 1) {
                    bArr[i16 + i9] = (byte) iArr[i16 / i14];
                }
            }
        } catch (e unused) {
            throw C2963d.a();
        }
    }

    public D6.e b(D6.b bVar, Map map) throws g, C2963d {
        int i9;
        byte[] bArrA = new a(bVar).a();
        a(bArrA, 0, 10, 10, 0);
        int i10 = bArrA[0] & 15;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            a(bArrA, 20, 84, 40, 1);
            a(bArrA, 20, 84, 40, 2);
            i9 = 94;
        } else {
            if (i10 != 5) {
                throw g.a();
            }
            a(bArrA, 20, 68, 56, 1);
            a(bArrA, 20, 68, 56, 2);
            i9 = 78;
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(bArrA, 0, bArr, 0, 10);
        System.arraycopy(bArrA, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, i10);
    }
}
