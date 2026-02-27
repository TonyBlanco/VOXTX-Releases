package f4;

import d4.L;
import d4.M;
import d4.k0;
import f4.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static e a(byte[] bArr, int i9) {
        ArrayList arrayListF;
        M m9 = new M(bArr);
        try {
            arrayListF = c(m9) ? f(m9) : e(m9);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e((e.a) arrayListF.get(0), i9);
        }
        if (size != 2) {
            return null;
        }
        return new e((e.a) arrayListF.get(0), (e.a) arrayListF.get(1), i9);
    }

    public static int b(int i9) {
        return (-(i9 & 1)) ^ (i9 >> 1);
    }

    public static boolean c(M m9) {
        m9.V(4);
        int iQ = m9.q();
        m9.U(0);
        return iQ == 1886547818;
    }

    public static e.a d(M m9) {
        int iQ = m9.q();
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i9 = 0; i9 < iQ; i9++) {
            fArr[i9] = m9.p();
        }
        int iQ2 = m9.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d9 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iQ) * 2.0d) / dLog);
        L l9 = new L(m9.e());
        int i10 = 8;
        l9.p(m9.f() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int i11 = 5;
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iQ2) {
            int i14 = 0;
            while (i14 < i11) {
                int iB = iArr[i14] + b(l9.h(iCeil));
                if (iB >= iQ || iB < 0) {
                    return null;
                }
                fArr2[i13] = fArr[iB];
                iArr[i14] = iB;
                i14++;
                i13++;
                i11 = 5;
            }
            i12++;
            i11 = 5;
        }
        l9.p((l9.e() + 7) & (-8));
        int i15 = 32;
        int iH = l9.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i16 = 0;
        while (i16 < iH) {
            int iH2 = l9.h(i10);
            int iH3 = l9.h(i10);
            int iH4 = l9.h(i15);
            if (iH4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iQ2) * d9) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i17 = 0; i17 < iH4; i17++) {
                iB2 += b(l9.h(iCeil2));
                if (iB2 < 0 || iB2 >= iQ2) {
                    return null;
                }
                int i18 = i17 * 3;
                int i19 = iB2 * 5;
                fArr3[i18] = fArr2[i19];
                fArr3[i18 + 1] = fArr2[i19 + 1];
                fArr3[i18 + 2] = fArr2[i19 + 2];
                int i20 = i17 * 2;
                fArr4[i20] = fArr2[i19 + 3];
                fArr4[i20 + 1] = fArr2[i19 + 4];
            }
            bVarArr[i16] = new e.b(iH2, fArr3, fArr4, iH3);
            i16++;
            i15 = 32;
            d9 = 2.0d;
            i10 = 8;
        }
        return new e.a(bVarArr);
    }

    public static ArrayList e(M m9) {
        if (m9.H() != 0) {
            return null;
        }
        m9.V(7);
        int iQ = m9.q();
        if (iQ == 1684433976) {
            M m10 = new M();
            Inflater inflater = new Inflater(true);
            try {
                if (!k0.z0(m9, m10, inflater)) {
                    return null;
                }
                m9 = m10;
            } finally {
                inflater.end();
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return g(m9);
    }

    public static ArrayList f(M m9) {
        int iQ;
        m9.V(8);
        int iF = m9.f();
        int iG = m9.g();
        while (iF < iG && (iQ = m9.q() + iF) > iF && iQ <= iG) {
            int iQ2 = m9.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                m9.T(iQ);
                return e(m9);
            }
            m9.U(iQ);
            iF = iQ;
        }
        return null;
    }

    public static ArrayList g(M m9) {
        ArrayList arrayList = new ArrayList();
        int iF = m9.f();
        int iG = m9.g();
        while (iF < iG) {
            int iQ = m9.q() + iF;
            if (iQ <= iF || iQ > iG) {
                return null;
            }
            if (m9.q() == 1835365224) {
                e.a aVarD = d(m9);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            m9.U(iQ);
            iF = iQ;
        }
        return arrayList;
    }
}
