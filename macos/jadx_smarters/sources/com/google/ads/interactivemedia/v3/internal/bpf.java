package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class bpf extends bpg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InputStream f21891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f21892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21898m = a.e.API_PRIORITY_OTHER;

    public /* synthetic */ bpf(InputStream inputStream) {
        bqu.j(inputStream, "input");
        this.f21891f = inputStream;
        this.f21892g = new byte[4096];
        this.f21893h = 0;
        this.f21895j = 0;
        this.f21897l = 0;
    }

    private static int I(InputStream inputStream, byte[] bArr, int i9, int i10) throws IOException {
        try {
            return inputStream.read(bArr, i9, i10);
        } catch (bqw e9) {
            e9.j();
            throw e9;
        }
    }

    private final List J(int i9) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f21891f.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw bqw.i();
                }
                this.f21897l += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void K() {
        int i9 = this.f21893h + this.f21894i;
        this.f21893h = i9;
        int i10 = this.f21897l + i9;
        int i11 = this.f21898m;
        if (i10 <= i11) {
            this.f21894i = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f21894i = i12;
        this.f21893h = i9 - i12;
    }

    private final void L(int i9) throws IOException {
        if (M(i9)) {
            return;
        }
        if (i9 <= (a.e.API_PRIORITY_OTHER - this.f21897l) - this.f21895j) {
            throw bqw.i();
        }
        throw bqw.h();
    }

    private final boolean M(int i9) throws IOException {
        int i10 = this.f21895j;
        int i11 = this.f21893h;
        if (i10 + i9 <= i11) {
            throw new IllegalStateException("refillBuffer() called when " + i9 + " bytes were already available in buffer");
        }
        int i12 = this.f21897l;
        if (i9 > (a.e.API_PRIORITY_OTHER - i12) - i10 || i12 + i10 + i9 > this.f21898m) {
            return false;
        }
        if (i10 > 0) {
            if (i11 > i10) {
                byte[] bArr = this.f21892g;
                System.arraycopy(bArr, i10, bArr, 0, i11 - i10);
            }
            i12 = this.f21897l + i10;
            this.f21897l = i12;
            i11 = this.f21893h - i10;
            this.f21893h = i11;
            this.f21895j = 0;
        }
        int I9 = I(this.f21891f, this.f21892g, i11, Math.min(4096 - i11, (a.e.API_PRIORITY_OTHER - i12) - i11));
        if (I9 == 0 || I9 < -1 || I9 > 4096) {
            throw new IllegalStateException(String.valueOf(this.f21891f.getClass()) + "#read(byte[]) returned invalid result: " + I9 + "\nThe InputStream implementation is buggy.");
        }
        if (I9 <= 0) {
            return false;
        }
        this.f21893h += I9;
        K();
        if (this.f21893h >= i9) {
            return true;
        }
        return M(i9);
    }

    private final byte[] N(int i9) throws IOException {
        if (i9 == 0) {
            return bqu.f22115b;
        }
        if (i9 < 0) {
            throw bqw.f();
        }
        int i10 = this.f21897l;
        int i11 = this.f21895j;
        int i12 = i10 + i11 + i9;
        if ((-2147483647) + i12 > 0) {
            throw bqw.h();
        }
        int i13 = this.f21898m;
        if (i12 > i13) {
            B((i13 - i10) - i11);
            throw bqw.i();
        }
        int i14 = this.f21893h - i11;
        int i15 = i9 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.f21891f.available()) {
                    return null;
                }
            } catch (bqw e9) {
                e9.j();
                throw e9;
            }
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(this.f21892g, this.f21895j, bArr, 0, i14);
        this.f21897l += this.f21893h;
        this.f21895j = 0;
        this.f21893h = 0;
        while (i14 < i9) {
            int I9 = I(this.f21891f, bArr, i14, i9 - i14);
            if (I9 == -1) {
                throw bqw.i();
            }
            this.f21897l += I9;
            i14 += I9;
        }
        return bArr;
    }

    private final byte[] O(int i9) throws IOException {
        byte[] bArrN = N(i9);
        if (bArrN != null) {
            return bArrN;
        }
        int i10 = this.f21895j;
        int i11 = this.f21893h;
        int i12 = i11 - i10;
        this.f21897l += i11;
        this.f21895j = 0;
        this.f21893h = 0;
        List<byte[]> listJ = J(i9 - i12);
        byte[] bArr = new byte[i9];
        System.arraycopy(this.f21892g, i10, bArr, 0, i12);
        for (byte[] bArr2 : listJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final void A(int i9) {
        this.f21898m = i9;
        K();
    }

    public final void B(int i9) throws IOException {
        int i10 = this.f21893h;
        int i11 = this.f21895j;
        int i12 = i10 - i11;
        if (i9 <= i12 && i9 >= 0) {
            this.f21895j = i11 + i9;
            return;
        }
        if (i9 < 0) {
            throw bqw.f();
        }
        int i13 = this.f21897l;
        int i14 = i13 + i11;
        int i15 = this.f21898m;
        if (i14 + i9 > i15) {
            B((i15 - i13) - i11);
            throw bqw.i();
        }
        this.f21897l = i14;
        this.f21893h = 0;
        this.f21895j = 0;
        while (i12 < i9) {
            try {
                long j9 = i9 - i12;
                try {
                    long jSkip = this.f21891f.skip(j9);
                    if (jSkip < 0 || jSkip > j9) {
                        throw new IllegalStateException(String.valueOf(this.f21891f.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } catch (bqw e9) {
                    e9.j();
                    throw e9;
                }
            } catch (Throwable th) {
                this.f21897l += i12;
                K();
                throw th;
            }
        }
        this.f21897l += i12;
        K();
        if (i12 >= i9) {
            return;
        }
        int i16 = this.f21893h;
        int i17 = i16 - this.f21895j;
        this.f21895j = i16;
        while (true) {
            L(1);
            int i18 = i9 - i17;
            int i19 = this.f21893h;
            if (i18 <= i19) {
                this.f21895j = i18;
                return;
            } else {
                i17 += i19;
                this.f21895j = i19;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean C() throws IOException {
        return this.f21895j == this.f21893h && !M(1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean D() throws IOException {
        return r() != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean E(int i9) throws IOException {
        int iM;
        int iB = btm.b(i9);
        int i10 = 0;
        if (iB == 0) {
            if (this.f21893h - this.f21895j < 10) {
                while (i10 < 10) {
                    if (a() < 0) {
                        i10++;
                    }
                }
                throw bqw.e();
            }
            while (i10 < 10) {
                byte[] bArr = this.f21892g;
                int i11 = this.f21895j;
                this.f21895j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                }
            }
            throw bqw.e();
            return true;
        }
        if (iB == 1) {
            B(8);
            return true;
        }
        if (iB == 2) {
            B(j());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw bqw.a();
            }
            B(4);
            return true;
        }
        do {
            iM = m();
            if (iM == 0) {
                break;
            }
        } while (E(iM));
        z(btm.c(btm.a(i9), 4));
        return true;
    }

    public final byte a() throws IOException {
        if (this.f21895j == this.f21893h) {
            L(1);
        }
        byte[] bArr = this.f21892g;
        int i9 = this.f21895j;
        this.f21895j = i9 + 1;
        return bArr[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final double b() throws IOException {
        return Double.longBitsToDouble(q());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final float c() throws IOException {
        return Float.intBitsToFloat(i());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int d() {
        return this.f21897l + this.f21895j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int e(int i9) throws bqw {
        if (i9 < 0) {
            throw bqw.f();
        }
        int i10 = i9 + this.f21897l + this.f21895j;
        int i11 = this.f21898m;
        if (i10 > i11) {
            throw bqw.i();
        }
        this.f21898m = i10;
        K();
        return i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int f() throws IOException {
        return j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int g() throws IOException {
        return i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int h() throws IOException {
        return j();
    }

    public final int i() throws IOException {
        int i9 = this.f21895j;
        if (this.f21893h - i9 < 4) {
            L(4);
            i9 = this.f21895j;
        }
        byte[] bArr = this.f21892g;
        this.f21895j = i9 + 4;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public final int j() throws IOException {
        int i9;
        int i10 = this.f21895j;
        int i11 = this.f21893h;
        if (i11 != i10) {
            byte[] bArr = this.f21892g;
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f21895j = i12;
                return b9;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b9;
                if (i14 < 0) {
                    i9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i9 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i9 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i9 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i19;
                            }
                            i9 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f21895j = i13;
                return i9;
            }
        }
        return (int) s();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int k() throws IOException {
        return i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int l() throws IOException {
        return bpg.F(j());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int m() throws IOException {
        if (C()) {
            this.f21896k = 0;
            return 0;
        }
        int iJ = j();
        this.f21896k = iJ;
        if (btm.a(iJ) != 0) {
            return iJ;
        }
        throw bqw.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int n() throws IOException {
        return j();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final long o() throws IOException {
        return q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final long p() throws IOException {
        return r();
    }

    public final long q() throws IOException {
        int i9 = this.f21895j;
        if (this.f21893h - i9 < 8) {
            L(8);
            i9 = this.f21895j;
        }
        byte[] bArr = this.f21892g;
        this.f21895j = i9 + 8;
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
    }

    public final long r() throws IOException {
        long j9;
        long j10;
        int i9 = this.f21895j;
        int i10 = this.f21893h;
        if (i10 != i9) {
            byte[] bArr = this.f21892g;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f21895j = i11;
                return b9;
            }
            if (i10 - i11 >= 9) {
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    j9 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j9 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j9 = j11;
                        } else {
                            i14 = i9 + 5;
                            long j12 = ((long) i17) ^ (((long) bArr[i16]) << 28);
                            if (j12 >= 0) {
                                j9 = j12 ^ 266354560;
                            } else {
                                i12 = i9 + 6;
                                long j13 = (((long) bArr[i14]) << 35) ^ j12;
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    int i18 = i9 + 7;
                                    long j14 = j13 ^ (((long) bArr[i12]) << 42);
                                    if (j14 >= 0) {
                                        j9 = j14 ^ 4363953127296L;
                                    } else {
                                        i12 = i9 + 8;
                                        j13 = j14 ^ (((long) bArr[i18]) << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i18 = i9 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i12 = i9 + 10;
                                                if (bArr[i18] >= 0) {
                                                    j9 = j15;
                                                }
                                            } else {
                                                j9 = j15;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j9 = j13 ^ j10;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.f21895j = i12;
                return j9;
            }
        }
        return s();
    }

    public final long s() throws IOException {
        long j9 = 0;
        for (int i9 = 0; i9 < 64; i9 += 7) {
            byte bA = a();
            j9 |= ((long) (bA & 127)) << i9;
            if ((bA & 128) == 0) {
                return j9;
            }
        }
        throw bqw.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final long t() throws IOException {
        return q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final long u() throws IOException {
        return bpg.G(r());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final long v() throws IOException {
        return r();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final bpb w() throws IOException {
        int iJ = j();
        int i9 = this.f21893h;
        int i10 = this.f21895j;
        if (iJ <= i9 - i10 && iJ > 0) {
            bpb bpbVarU = bpb.u(this.f21892g, i10, iJ);
            this.f21895j += iJ;
            return bpbVarU;
        }
        if (iJ == 0) {
            return bpb.f21870b;
        }
        byte[] bArrN = N(iJ);
        if (bArrN != null) {
            return bpb.t(bArrN);
        }
        int i11 = this.f21895j;
        int i12 = this.f21893h;
        int i13 = i12 - i11;
        this.f21897l += i12;
        this.f21895j = 0;
        this.f21893h = 0;
        List<byte[]> listJ = J(iJ - i13);
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.f21892g, i11, bArr, 0, i13);
        for (byte[] bArr2 : listJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bpb.x(bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final String x() throws IOException {
        int iJ = j();
        if (iJ > 0) {
            int i9 = this.f21893h;
            int i10 = this.f21895j;
            if (iJ <= i9 - i10) {
                String str = new String(this.f21892g, i10, iJ, bqu.f22114a);
                this.f21895j += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ > this.f21893h) {
            return new String(O(iJ), bqu.f22114a);
        }
        L(iJ);
        String str2 = new String(this.f21892g, this.f21895j, iJ, bqu.f22114a);
        this.f21895j += iJ;
        return str2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final String y() throws IOException {
        byte[] bArrO;
        int iJ = j();
        int i9 = this.f21895j;
        int i10 = this.f21893h;
        if (iJ <= i10 - i9 && iJ > 0) {
            bArrO = this.f21892g;
            this.f21895j = i9 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            i9 = 0;
            if (iJ <= i10) {
                L(iJ);
                bArrO = this.f21892g;
                this.f21895j = iJ;
            } else {
                bArrO = O(iJ);
            }
        }
        return btj.h(bArrO, i9, iJ);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final void z(int i9) throws bqw {
        if (this.f21896k != i9) {
            throw bqw.b();
        }
    }
}
