package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bpc extends bpg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f21872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21878l = a.e.API_PRIORITY_OTHER;

    public /* synthetic */ bpc(byte[] bArr, int i9, int i10) {
        this.f21872f = bArr;
        this.f21873g = i10 + i9;
        this.f21875i = i9;
        this.f21876j = i9;
    }

    private final void I() {
        int i9 = this.f21873g + this.f21874h;
        this.f21873g = i9;
        int i10 = i9 - this.f21876j;
        int i11 = this.f21878l;
        if (i10 <= i11) {
            this.f21874h = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f21874h = i12;
        this.f21873g = i9 - i12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final void A(int i9) {
        this.f21878l = i9;
        I();
    }

    public final void B(int i9) throws IOException {
        if (i9 >= 0) {
            int i10 = this.f21873g;
            int i11 = this.f21875i;
            if (i9 <= i10 - i11) {
                this.f21875i = i11 + i9;
                return;
            }
        }
        if (i9 >= 0) {
            throw bqw.i();
        }
        throw bqw.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean C() throws IOException {
        return this.f21875i == this.f21873g;
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
            if (this.f21873g - this.f21875i < 10) {
                while (i10 < 10) {
                    if (a() < 0) {
                        i10++;
                    }
                }
                throw bqw.e();
            }
            while (i10 < 10) {
                byte[] bArr = this.f21872f;
                int i11 = this.f21875i;
                this.f21875i = i11 + 1;
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
        int i9 = this.f21875i;
        if (i9 == this.f21873g) {
            throw bqw.i();
        }
        byte[] bArr = this.f21872f;
        this.f21875i = i9 + 1;
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
        return this.f21875i - this.f21876j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int e(int i9) throws bqw {
        if (i9 < 0) {
            throw bqw.f();
        }
        int iD = i9 + d();
        if (iD < 0) {
            throw bqw.g();
        }
        int i10 = this.f21878l;
        if (iD > i10) {
            throw bqw.i();
        }
        this.f21878l = iD;
        I();
        return i10;
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
        int i9 = this.f21875i;
        if (this.f21873g - i9 < 4) {
            throw bqw.i();
        }
        byte[] bArr = this.f21872f;
        this.f21875i = i9 + 4;
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public final int j() throws IOException {
        int i9;
        int i10 = this.f21875i;
        int i11 = this.f21873g;
        if (i11 != i10) {
            byte[] bArr = this.f21872f;
            int i12 = i10 + 1;
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                this.f21875i = i12;
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
                this.f21875i = i13;
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
            this.f21877k = 0;
            return 0;
        }
        int iJ = j();
        this.f21877k = iJ;
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
        int i9 = this.f21875i;
        if (this.f21873g - i9 < 8) {
            throw bqw.i();
        }
        byte[] bArr = this.f21872f;
        this.f21875i = i9 + 8;
        return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
    }

    public final long r() throws IOException {
        long j9;
        long j10;
        int i9 = this.f21875i;
        int i10 = this.f21873g;
        if (i10 != i9) {
            byte[] bArr = this.f21872f;
            int i11 = i9 + 1;
            byte b9 = bArr[i9];
            if (b9 >= 0) {
                this.f21875i = i11;
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
                this.f21875i = i12;
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
        if (iJ > 0) {
            int i9 = this.f21873g;
            int i10 = this.f21875i;
            if (iJ <= i9 - i10) {
                bpb bpbVarU = bpb.u(this.f21872f, i10, iJ);
                this.f21875i += iJ;
                return bpbVarU;
            }
        }
        if (iJ == 0) {
            return bpb.f21870b;
        }
        if (iJ > 0) {
            int i11 = this.f21873g;
            int i12 = this.f21875i;
            if (iJ <= i11 - i12) {
                int i13 = iJ + i12;
                this.f21875i = i13;
                return bpb.x(Arrays.copyOfRange(this.f21872f, i12, i13));
            }
        }
        if (iJ <= 0) {
            throw bqw.f();
        }
        throw bqw.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final String x() throws IOException {
        int iJ = j();
        if (iJ > 0) {
            int i9 = this.f21873g;
            int i10 = this.f21875i;
            if (iJ <= i9 - i10) {
                String str = new String(this.f21872f, i10, iJ, bqu.f22114a);
                this.f21875i += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw bqw.f();
        }
        throw bqw.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final String y() throws IOException {
        int iJ = j();
        if (iJ > 0) {
            int i9 = this.f21873g;
            int i10 = this.f21875i;
            if (iJ <= i9 - i10) {
                String strH = btj.h(this.f21872f, i10, iJ);
                this.f21875i += iJ;
                return strH;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw bqw.f();
        }
        throw bqw.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final void z(int i9) throws bqw {
        if (this.f21877k != i9) {
            throw bqw.b();
        }
    }
}
