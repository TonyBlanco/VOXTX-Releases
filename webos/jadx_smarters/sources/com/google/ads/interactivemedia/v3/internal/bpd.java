package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class bpd {
    public static bpb a(bpk bpkVar, byte[] bArr) {
        bpkVar.Y();
        return new boz(bArr);
    }

    public static bpk b(bpk bpkVar) {
        return bpkVar;
    }

    public static double c(byte[] bArr, int i9) {
        return Double.longBitsToDouble(u(bArr, i9));
    }

    public static float d(byte[] bArr, int i9) {
        return Float.intBitsToFloat(f(bArr, i9));
    }

    public static int e(byte[] bArr, int i9, boq boqVar) throws bqw {
        int iN = n(bArr, i9, boqVar);
        int i10 = boqVar.f21856a;
        if (i10 < 0) {
            throw bqw.f();
        }
        if (i10 > bArr.length - iN) {
            throw bqw.i();
        }
        if (i10 == 0) {
            boqVar.f21858c = bpb.f21870b;
            return iN;
        }
        boqVar.f21858c = bpb.u(bArr, iN, i10);
        return iN + i10;
    }

    public static int f(byte[] bArr, int i9) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static int g(bsi bsiVar, byte[] bArr, int i9, int i10, int i11, boq boqVar) throws IOException {
        Object objE = bsiVar.e();
        int iR = r(objE, bsiVar, bArr, i9, i10, i11, boqVar);
        bsiVar.f(objE);
        boqVar.f21858c = objE;
        return iR;
    }

    public static int h(bsi bsiVar, byte[] bArr, int i9, int i10, boq boqVar) throws IOException {
        Object objE = bsiVar.e();
        int iS = s(objE, bsiVar, bArr, i9, i10, boqVar);
        bsiVar.f(objE);
        boqVar.f21858c = objE;
        return iS;
    }

    public static int i(bsi bsiVar, int i9, byte[] bArr, int i10, int i11, bqt bqtVar, boq boqVar) throws IOException {
        int iH = h(bsiVar, bArr, i10, i11, boqVar);
        while (true) {
            bqtVar.add(boqVar.f21858c);
            if (iH >= i11) {
                break;
            }
            int iN = n(bArr, iH, boqVar);
            if (i9 != boqVar.f21856a) {
                break;
            }
            iH = h(bsiVar, bArr, iN, i11, boqVar);
        }
        return iH;
    }

    public static int j(byte[] bArr, int i9, bqt bqtVar, boq boqVar) throws IOException {
        bqo bqoVar = (bqo) bqtVar;
        int iN = n(bArr, i9, boqVar);
        int i10 = boqVar.f21856a + iN;
        while (iN < i10) {
            iN = n(bArr, iN, boqVar);
            bqoVar.g(boqVar.f21856a);
        }
        if (iN == i10) {
            return iN;
        }
        throw bqw.i();
    }

    public static int k(byte[] bArr, int i9, boq boqVar) throws bqw {
        int iN = n(bArr, i9, boqVar);
        int i10 = boqVar.f21856a;
        if (i10 < 0) {
            throw bqw.f();
        }
        if (i10 == 0) {
            boqVar.f21858c = "";
            return iN;
        }
        boqVar.f21858c = new String(bArr, iN, i10, bqu.f22114a);
        return iN + i10;
    }

    public static int l(byte[] bArr, int i9, boq boqVar) throws bqw {
        int iN = n(bArr, i9, boqVar);
        int i10 = boqVar.f21856a;
        if (i10 < 0) {
            throw bqw.f();
        }
        if (i10 == 0) {
            boqVar.f21858c = "";
            return iN;
        }
        boqVar.f21858c = btj.h(bArr, iN, i10);
        return iN + i10;
    }

    public static int m(int i9, byte[] bArr, int i10, int i11, bsx bsxVar, boq boqVar) throws bqw {
        if (btm.a(i9) == 0) {
            throw bqw.c();
        }
        int iB = btm.b(i9);
        if (iB == 0) {
            int iQ = q(bArr, i10, boqVar);
            bsxVar.i(i9, Long.valueOf(boqVar.f21857b));
            return iQ;
        }
        if (iB == 1) {
            bsxVar.i(i9, Long.valueOf(u(bArr, i10)));
            return i10 + 8;
        }
        if (iB == 2) {
            int iN = n(bArr, i10, boqVar);
            int i12 = boqVar.f21856a;
            if (i12 < 0) {
                throw bqw.f();
            }
            if (i12 > bArr.length - iN) {
                throw bqw.i();
            }
            bsxVar.i(i9, i12 == 0 ? bpb.f21870b : bpb.u(bArr, iN, i12));
            return iN + i12;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw bqw.c();
            }
            bsxVar.i(i9, Integer.valueOf(f(bArr, i10)));
            return i10 + 4;
        }
        int i13 = (i9 & (-8)) | 4;
        bsx bsxVarE = bsx.e();
        int i14 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iN2 = n(bArr, i10, boqVar);
            int i15 = boqVar.f21856a;
            i14 = i15;
            if (i15 == i13) {
                i10 = iN2;
                break;
            }
            int iM = m(i14, bArr, iN2, i11, bsxVarE, boqVar);
            i14 = i15;
            i10 = iM;
        }
        if (i10 > i11 || i14 != i13) {
            throw bqw.g();
        }
        bsxVar.i(i9, bsxVarE);
        return i10;
    }

    public static int n(byte[] bArr, int i9, boq boqVar) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 < 0) {
            return o(b9, bArr, i10, boqVar);
        }
        boqVar.f21856a = b9;
        return i10;
    }

    public static int o(int i9, byte[] bArr, int i10, boq boqVar) {
        int i11;
        int i12 = i9 & 127;
        int i13 = i10 + 1;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            i11 = b9 << 7;
        } else {
            int i14 = i12 | ((b9 & 127) << 7);
            int i15 = i10 + 2;
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                boqVar.f21856a = i14 | (b10 << 14);
                return i15;
            }
            i12 = i14 | ((b10 & 127) << 14);
            i13 = i10 + 3;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i11 = b11 << 21;
            } else {
                int i16 = i12 | ((b11 & 127) << 21);
                int i17 = i10 + 4;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    boqVar.f21856a = i16 | (b12 << 28);
                    return i17;
                }
                int i18 = i16 | ((b12 & 127) << 28);
                while (true) {
                    int i19 = i17 + 1;
                    if (bArr[i17] >= 0) {
                        boqVar.f21856a = i18;
                        return i19;
                    }
                    i17 = i19;
                }
            }
        }
        boqVar.f21856a = i12 | i11;
        return i13;
    }

    public static int p(int i9, byte[] bArr, int i10, int i11, bqt bqtVar, boq boqVar) {
        bqo bqoVar = (bqo) bqtVar;
        int iN = n(bArr, i10, boqVar);
        while (true) {
            bqoVar.g(boqVar.f21856a);
            if (iN >= i11) {
                break;
            }
            int iN2 = n(bArr, iN, boqVar);
            if (i9 != boqVar.f21856a) {
                break;
            }
            iN = n(bArr, iN2, boqVar);
        }
        return iN;
    }

    public static int q(byte[] bArr, int i9, boq boqVar) {
        int i10 = i9 + 1;
        long j9 = bArr[i9];
        if (j9 >= 0) {
            boqVar.f21857b = j9;
            return i10;
        }
        int i11 = i9 + 2;
        byte b9 = bArr[i10];
        long j10 = (j9 & 127) | (((long) (b9 & 127)) << 7);
        int i12 = 7;
        while (b9 < 0) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b10 & 127)) << i12;
            b9 = b10;
            i11 = i13;
        }
        boqVar.f21857b = j10;
        return i11;
    }

    public static int r(Object obj, bsi bsiVar, byte[] bArr, int i9, int i10, int i11, boq boqVar) throws IOException {
        int iC = ((brv) bsiVar).c(obj, bArr, i9, i10, i11, boqVar);
        boqVar.f21858c = obj;
        return iC;
    }

    public static int s(Object obj, bsi bsiVar, byte[] bArr, int i9, int i10, boq boqVar) throws IOException {
        int iO = i9 + 1;
        int i11 = bArr[i9];
        if (i11 < 0) {
            iO = o(i11, bArr, iO, boqVar);
            i11 = boqVar.f21856a;
        }
        int i12 = iO;
        if (i11 < 0 || i11 > i10 - i12) {
            throw bqw.i();
        }
        int i13 = i11 + i12;
        bsiVar.i(obj, bArr, i12, i13, boqVar);
        boqVar.f21858c = obj;
        return i13;
    }

    public static int t(int i9, byte[] bArr, int i10, int i11, boq boqVar) throws bqw {
        if (btm.a(i9) == 0) {
            throw bqw.c();
        }
        int iB = btm.b(i9);
        if (iB == 0) {
            return q(bArr, i10, boqVar);
        }
        if (iB == 1) {
            return i10 + 8;
        }
        if (iB == 2) {
            return n(bArr, i10, boqVar) + boqVar.f21856a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i10 + 4;
            }
            throw bqw.c();
        }
        int i12 = (i9 & (-8)) | 4;
        int i13 = 0;
        while (i10 < i11) {
            i10 = n(bArr, i10, boqVar);
            i13 = boqVar.f21856a;
            if (i13 == i12) {
                break;
            }
            i10 = t(i13, bArr, i10, i11, boqVar);
        }
        if (i10 > i11 || i13 != i12) {
            throw bqw.g();
        }
        return i10;
    }

    public static long u(byte[] bArr, int i9) {
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
