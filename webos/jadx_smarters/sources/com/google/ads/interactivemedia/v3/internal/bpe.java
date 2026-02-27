package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class bpe extends bpg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Iterable f21879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Iterator f21880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteBuffer f21881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21883j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21885l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f21887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f21888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f21889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f21890q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21884k = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21886m = 0;

    public /* synthetic */ bpe(Iterable iterable, int i9) {
        this.f21882i = i9;
        this.f21879f = iterable;
        this.f21880g = iterable.iterator();
        if (i9 != 0) {
            M();
            return;
        }
        this.f21881h = bqu.f22116c;
        this.f21887n = 0L;
        this.f21888o = 0L;
        this.f21890q = 0L;
        this.f21889p = 0L;
    }

    private final int I() {
        return (int) ((((long) (this.f21882i - this.f21886m)) - this.f21887n) + this.f21888o);
    }

    private final long J() {
        return this.f21890q - this.f21887n;
    }

    private final void K() throws bqw {
        if (!this.f21880g.hasNext()) {
            throw bqw.i();
        }
        M();
    }

    private final void L() {
        int i9 = this.f21882i + this.f21883j;
        this.f21882i = i9;
        int i10 = this.f21884k;
        if (i9 <= i10) {
            this.f21883j = 0;
            return;
        }
        int i11 = i9 - i10;
        this.f21883j = i11;
        this.f21882i = i9 - i11;
    }

    private final void M() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f21880g.next();
        this.f21881h = byteBuffer;
        this.f21886m += (int) (this.f21887n - this.f21888o);
        long jPosition = byteBuffer.position();
        this.f21887n = jPosition;
        this.f21888o = jPosition;
        this.f21890q = this.f21881h.limit();
        long jE = btf.e(this.f21881h);
        this.f21889p = jE;
        this.f21887n += jE;
        this.f21888o += jE;
        this.f21890q += jE;
    }

    private final void N(byte[] bArr, int i9) throws IOException {
        if (i9 > I()) {
            if (i9 > 0) {
                throw bqw.i();
            }
            return;
        }
        int i10 = i9;
        while (i10 > 0) {
            if (J() == 0) {
                K();
            }
            int iMin = Math.min(i10, (int) J());
            long j9 = iMin;
            btf.p(this.f21887n, bArr, i9 - i10, j9);
            i10 -= iMin;
            this.f21887n += j9;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final void A(int i9) {
        this.f21884k = i9;
        L();
    }

    public final void B(int i9) throws IOException {
        if (i9 < 0 || i9 > (((long) (this.f21882i - this.f21886m)) - this.f21887n) + this.f21888o) {
            if (i9 >= 0) {
                throw bqw.i();
            }
            throw bqw.f();
        }
        while (i9 > 0) {
            if (J() == 0) {
                K();
            }
            int iMin = Math.min(i9, (int) J());
            i9 -= iMin;
            this.f21887n += (long) iMin;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean C() throws IOException {
        return (((long) this.f21886m) + this.f21887n) - this.f21888o == ((long) this.f21882i);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean D() throws IOException {
        return r() != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final boolean E(int i9) throws IOException {
        int iM;
        int iB = btm.b(i9);
        if (iB == 0) {
            for (int i10 = 0; i10 < 10; i10++) {
                if (a() >= 0) {
                    return true;
                }
            }
            throw bqw.e();
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
        if (J() == 0) {
            K();
        }
        long j9 = this.f21887n;
        this.f21887n = 1 + j9;
        return btf.a(j9);
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
        return (int) ((((long) this.f21886m) + this.f21887n) - this.f21888o);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final int e(int i9) throws bqw {
        if (i9 < 0) {
            throw bqw.f();
        }
        int iD = i9 + d();
        int i10 = this.f21884k;
        if (iD > i10) {
            throw bqw.i();
        }
        this.f21884k = iD;
        L();
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
        if (J() < 4) {
            return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
        }
        long j9 = this.f21887n;
        this.f21887n = 4 + j9;
        return ((btf.a(j9 + 3) & 255) << 24) | (btf.a(j9) & 255) | ((btf.a(1 + j9) & 255) << 8) | ((btf.a(2 + j9) & 255) << 16);
    }

    public final int j() throws IOException {
        int i9;
        long j9 = this.f21887n;
        if (this.f21890q != j9) {
            long j10 = j9 + 1;
            byte bA = btf.a(j9);
            if (bA >= 0) {
                this.f21887n++;
                return bA;
            }
            if (this.f21890q - this.f21887n >= 10) {
                long j11 = 2 + j9;
                int iA = (btf.a(j10) << 7) ^ bA;
                if (iA < 0) {
                    i9 = iA ^ (-128);
                } else {
                    long j12 = 3 + j9;
                    int iA2 = (btf.a(j11) << 14) ^ iA;
                    if (iA2 >= 0) {
                        i9 = iA2 ^ 16256;
                    } else {
                        long j13 = 4 + j9;
                        int iA3 = iA2 ^ (btf.a(j12) << 21);
                        if (iA3 < 0) {
                            i9 = (-2080896) ^ iA3;
                        } else {
                            j12 = 5 + j9;
                            byte bA2 = btf.a(j13);
                            int i10 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                            if (bA2 < 0) {
                                j13 = 6 + j9;
                                if (btf.a(j12) < 0) {
                                    j12 = 7 + j9;
                                    if (btf.a(j13) < 0) {
                                        j13 = 8 + j9;
                                        if (btf.a(j12) < 0) {
                                            j12 = 9 + j9;
                                            if (btf.a(j13) < 0) {
                                                long j14 = j9 + 10;
                                                if (btf.a(j12) >= 0) {
                                                    i9 = i10;
                                                    j11 = j14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i9 = i10;
                            }
                            i9 = i10;
                        }
                        j11 = j13;
                    }
                    j11 = j12;
                }
                this.f21887n = j11;
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
            this.f21885l = 0;
            return 0;
        }
        int iJ = j();
        this.f21885l = iJ;
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
        if (J() < 8) {
            return (((long) a()) & 255) | ((((long) a()) & 255) << 8) | ((((long) a()) & 255) << 16) | ((((long) a()) & 255) << 24) | ((((long) a()) & 255) << 32) | ((((long) a()) & 255) << 40) | ((((long) a()) & 255) << 48) | ((((long) a()) & 255) << 56);
        }
        long j9 = this.f21887n;
        this.f21887n = 8 + j9;
        return ((((long) btf.a(j9 + 7)) & 255) << 56) | ((((long) btf.a(2 + j9)) & 255) << 16) | (((long) btf.a(j9)) & 255) | ((((long) btf.a(1 + j9)) & 255) << 8) | ((((long) btf.a(3 + j9)) & 255) << 24) | ((((long) btf.a(4 + j9)) & 255) << 32) | ((((long) btf.a(5 + j9)) & 255) << 40) | ((((long) btf.a(6 + j9)) & 255) << 48);
    }

    public final long r() throws IOException {
        long j9;
        long j10;
        long j11 = this.f21887n;
        if (this.f21890q != j11) {
            long j12 = j11 + 1;
            byte bA = btf.a(j11);
            if (bA >= 0) {
                this.f21887n++;
                return bA;
            }
            if (this.f21890q - this.f21887n >= 10) {
                long j13 = 2 + j11;
                int iA = (btf.a(j12) << 7) ^ bA;
                if (iA < 0) {
                    j9 = iA ^ (-128);
                } else {
                    long j14 = 3 + j11;
                    int iA2 = (btf.a(j13) << 14) ^ iA;
                    if (iA2 >= 0) {
                        j9 = iA2 ^ 16256;
                    } else {
                        long j15 = 4 + j11;
                        int iA3 = iA2 ^ (btf.a(j14) << 21);
                        if (iA3 < 0) {
                            j9 = (-2080896) ^ iA3;
                            j13 = j15;
                        } else {
                            j14 = 5 + j11;
                            long jA = (((long) btf.a(j15)) << 28) ^ ((long) iA3);
                            if (jA >= 0) {
                                j9 = 266354560 ^ jA;
                            } else {
                                long j16 = 6 + j11;
                                long jA2 = jA ^ (((long) btf.a(j14)) << 35);
                                if (jA2 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    long j17 = 7 + j11;
                                    long jA3 = jA2 ^ (((long) btf.a(j16)) << 42);
                                    if (jA3 >= 0) {
                                        j9 = 4363953127296L ^ jA3;
                                    } else {
                                        j16 = 8 + j11;
                                        jA2 = jA3 ^ (((long) btf.a(j17)) << 49);
                                        if (jA2 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j17 = 9 + j11;
                                            long jA4 = (jA2 ^ (((long) btf.a(j16)) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j18 = j11 + 10;
                                                if (btf.a(j17) >= 0) {
                                                    j9 = jA4;
                                                    j13 = j18;
                                                }
                                            } else {
                                                j9 = jA4;
                                            }
                                        }
                                    }
                                    j13 = j17;
                                }
                                j9 = j10 ^ jA2;
                                j13 = j16;
                            }
                        }
                    }
                    j13 = j14;
                }
                this.f21887n = j13;
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
            long j9 = iJ;
            long j10 = this.f21890q;
            long j11 = this.f21887n;
            if (j9 <= j10 - j11) {
                byte[] bArr = new byte[iJ];
                btf.p(j11, bArr, 0L, j9);
                this.f21887n += j9;
                return bpb.x(bArr);
            }
        }
        if (iJ > 0 && iJ <= I()) {
            byte[] bArr2 = new byte[iJ];
            N(bArr2, iJ);
            return bpb.x(bArr2);
        }
        if (iJ == 0) {
            return bpb.f21870b;
        }
        if (iJ < 0) {
            throw bqw.f();
        }
        throw bqw.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpg
    public final String x() throws IOException {
        int iJ = j();
        if (iJ > 0) {
            long j9 = iJ;
            long j10 = this.f21890q;
            long j11 = this.f21887n;
            if (j9 <= j10 - j11) {
                byte[] bArr = new byte[iJ];
                btf.p(j11, bArr, 0L, j9);
                String str = new String(bArr, bqu.f22114a);
                this.f21887n += j9;
                return str;
            }
        }
        if (iJ > 0 && iJ <= I()) {
            byte[] bArr2 = new byte[iJ];
            N(bArr2, iJ);
            return new String(bArr2, bqu.f22114a);
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
            long j9 = iJ;
            long j10 = this.f21890q;
            long j11 = this.f21887n;
            if (j9 <= j10 - j11) {
                String strG = btj.g(this.f21881h, (int) (j11 - this.f21888o), iJ);
                this.f21887n += j9;
                return strG;
            }
        }
        if (iJ >= 0 && iJ <= I()) {
            byte[] bArr = new byte[iJ];
            N(bArr, iJ);
            return btj.h(bArr, 0, iJ);
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
        if (this.f21885l != i9) {
            throw bqw.b();
        }
    }
}
