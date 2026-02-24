package V6;

import java.util.Map;
import x6.C2963d;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F6.c f10110a = new F6.c(F6.a.f2030l);

    public final void a(byte[] bArr, int i9) throws C2963d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = bArr[i10] & 255;
        }
        try {
            this.f10110a.a(iArr, bArr.length - i9);
            for (int i11 = 0; i11 < i9; i11++) {
                bArr[i11] = (byte) iArr[i11];
            }
        } catch (F6.e unused) {
            throw C2963d.a();
        }
    }

    public D6.e b(D6.b bVar, Map map) throws x6.g, C2963d {
        C2963d e9;
        a aVar = new a(bVar);
        x6.g gVar = null;
        try {
            return c(aVar, map);
        } catch (C2963d e10) {
            e9 = e10;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                D6.e eVarC = c(aVar, map);
                eVarC.m(new i(true));
                return eVarC;
            } catch (C2963d | x6.g unused) {
                if (gVar != null) {
                    throw gVar;
                }
                throw e9;
            }
        } catch (x6.g e11) {
            e9 = null;
            gVar = e11;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            D6.e eVarC2 = c(aVar, map);
            eVarC2.m(new i(true));
            return eVarC2;
        }
    }

    public final D6.e c(a aVar, Map map) throws x6.g, C2963d {
        j jVarE = aVar.e();
        f fVarD = aVar.d().d();
        b[] bVarArrB = b.b(aVar.c(), jVarE, fVarD);
        int iC = 0;
        for (b bVar : bVarArrB) {
            iC += bVar.c();
        }
        byte[] bArr = new byte[iC];
        int i9 = 0;
        for (b bVar2 : bVarArrB) {
            byte[] bArrA = bVar2.a();
            int iC2 = bVar2.c();
            a(bArrA, iC2);
            int i10 = 0;
            while (i10 < iC2) {
                bArr[i9] = bArrA[i10];
                i10++;
                i9++;
            }
        }
        return d.a(bArr, jVarE, fVarD, map);
    }
}
