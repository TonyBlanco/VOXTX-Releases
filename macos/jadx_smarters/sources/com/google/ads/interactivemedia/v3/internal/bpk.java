package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class bpk extends bpd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f21911b = Logger.getLogger(bpk.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f21912c = btf.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    bpl f21913a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21916f;

    private bpk() {
    }

    public /* synthetic */ bpk(byte[] bArr) {
    }

    public bpk(byte[] bArr, int i9) {
        this(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.f21914d = bArr;
        this.f21916f = 0;
        this.f21915e = i9;
    }

    @Deprecated
    public static int A(int i9, brs brsVar, bsi bsiVar) {
        int iQ = Q(i9);
        return iQ + iQ + ((bon) brsVar).at(bsiVar);
    }

    @Deprecated
    public static int B(brs brsVar) {
        return brsVar.ax();
    }

    public static int C(int i9, int i10) {
        return Q(i9) + D(i10);
    }

    public static int D(int i9) {
        if (i9 >= 0) {
            return S(i9);
        }
        return 10;
    }

    public static int E(int i9, long j9) {
        return Q(i9) + U(j9);
    }

    public static int F(int i9, brc brcVar) {
        return Q(i9) + G(brcVar);
    }

    public static int G(brc brcVar) {
        return H(brcVar.a());
    }

    public static int H(int i9) {
        return S(i9) + i9;
    }

    public static int I(brs brsVar) {
        return H(brsVar.ax());
    }

    public static int J(brs brsVar, bsi bsiVar) {
        return H(((bon) brsVar).at(bsiVar));
    }

    public static int K(int i9, int i10) {
        return Q(i9) + L(i10);
    }

    public static int L(int i9) {
        return S(V(i9));
    }

    public static int M(int i9, long j9) {
        return Q(i9) + N(j9);
    }

    public static int N(long j9) {
        return U(W(j9));
    }

    public static int O(int i9, String str) {
        return Q(i9) + P(str);
    }

    public static int P(String str) {
        int length;
        try {
            length = btj.e(str);
        } catch (bti unused) {
            length = str.getBytes(bqu.f22114a).length;
        }
        return H(length);
    }

    public static int Q(int i9) {
        return S(btm.c(i9, 0));
    }

    public static int R(int i9, int i10) {
        return Q(i9) + S(i10);
    }

    public static int S(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        return (i9 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int T(int i9, long j9) {
        return Q(i9) + U(j9);
    }

    public static int U(long j9) {
        int i9;
        if (((-128) & j9) == 0) {
            return 1;
        }
        if (j9 < 0) {
            return 10;
        }
        if (((-34359738368L) & j9) != 0) {
            j9 >>>= 28;
            i9 = 6;
        } else {
            i9 = 2;
        }
        if (((-2097152) & j9) != 0) {
            i9 += 2;
            j9 >>>= 14;
        }
        return (j9 & (-16384)) != 0 ? i9 + 1 : i9;
    }

    public static int V(int i9) {
        return (i9 >> 31) ^ (i9 + i9);
    }

    public static long W(long j9) {
        return (j9 >> 63) ^ (j9 + j9);
    }

    public static bpk X(byte[] bArr) {
        return new bpk(bArr, bArr.length);
    }

    public static int aC(int i9) {
        return Q(i9) + 1;
    }

    public static int aD(int i9) {
        return Q(i9) + 8;
    }

    public static int aE(int i9) {
        return Q(i9) + 4;
    }

    public static int aF(int i9) {
        return Q(i9) + 8;
    }

    public static int aG(int i9) {
        return Q(i9) + 4;
    }

    public static int aH(int i9) {
        return Q(i9) + 4;
    }

    public static int aI(int i9) {
        return Q(i9) + 8;
    }

    public static int w(byte[] bArr) {
        return H(bArr.length);
    }

    public static int x(int i9, bpb bpbVar) {
        return Q(i9) + y(bpbVar);
    }

    public static int y(bpb bpbVar) {
        return H(bpbVar.d());
    }

    public static int z(int i9, int i10) {
        return Q(i9) + D(i10);
    }

    public final void Y() {
        if (ag() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void Z(String str, bti btiVar) throws IOException {
        f21911b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) btiVar);
        byte[] bytes = str.getBytes(bqu.f22114a);
        try {
            int length = bytes.length;
            az(length);
            ar(bytes, 0, length);
        } catch (IndexOutOfBoundsException e9) {
            throw new bpj(e9);
        }
    }

    public final void aA(int i9, long j9) throws IOException {
        ax(i9, 0);
        aB(j9);
    }

    public final void aB(long j9) throws IOException {
        if (f21912c && ag() >= 10) {
            while ((j9 & (-128)) != 0) {
                byte[] bArr = this.f21914d;
                int i9 = this.f21916f;
                this.f21916f = i9 + 1;
                btf.r(bArr, i9, (byte) ((((int) j9) & 127) | 128));
                j9 >>>= 7;
            }
            byte[] bArr2 = this.f21914d;
            int i10 = this.f21916f;
            this.f21916f = 1 + i10;
            btf.r(bArr2, i10, (byte) j9);
            return;
        }
        while ((j9 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f21914d;
                int i11 = this.f21916f;
                this.f21916f = i11 + 1;
                bArr3[i11] = (byte) ((((int) j9) & 127) | 128);
                j9 >>>= 7;
            } catch (IndexOutOfBoundsException e9) {
                throw new bpj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21916f), Integer.valueOf(this.f21915e), 1), e9);
            }
        }
        byte[] bArr4 = this.f21914d;
        int i12 = this.f21916f;
        this.f21916f = i12 + 1;
        bArr4[i12] = (byte) j9;
    }

    public final void aa(int i9, double d9) throws IOException {
        an(i9, Double.doubleToRawLongBits(d9));
    }

    public final void ab(int i9, float f9) throws IOException {
        al(i9, Float.floatToRawIntBits(f9));
    }

    @Deprecated
    public final void ac(brs brsVar) throws IOException {
        brsVar.br(this);
    }

    public final void ad(int i9, int i10) throws IOException {
        ay(i9, V(i10));
    }

    public final void ae(int i9, long j9) throws IOException {
        aA(i9, W(j9));
    }

    public final int ag() {
        return this.f21915e - this.f21916f;
    }

    public final void ah(byte b9) throws IOException {
        try {
            byte[] bArr = this.f21914d;
            int i9 = this.f21916f;
            this.f21916f = i9 + 1;
            bArr[i9] = b9;
        } catch (IndexOutOfBoundsException e9) {
            throw new bpj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21916f), Integer.valueOf(this.f21915e), 1), e9);
        }
    }

    public final void ai(byte[] bArr, int i9, int i10) throws IOException {
        try {
            System.arraycopy(bArr, i9, this.f21914d, this.f21916f, i10);
            this.f21916f += i10;
        } catch (IndexOutOfBoundsException e9) {
            throw new bpj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21916f), Integer.valueOf(this.f21915e), Integer.valueOf(i10)), e9);
        }
    }

    public final void aj(int i9, boolean z9) throws IOException {
        ax(i9, 0);
        ah(z9 ? (byte) 1 : (byte) 0);
    }

    public final void ak(int i9, bpb bpbVar) throws IOException {
        ax(i9, 2);
        az(bpbVar.d());
        bpbVar.p(this);
    }

    public final void al(int i9, int i10) throws IOException {
        ax(i9, 5);
        am(i10);
    }

    public final void am(int i9) throws IOException {
        try {
            byte[] bArr = this.f21914d;
            int i10 = this.f21916f;
            bArr[i10] = (byte) (i9 & 255);
            bArr[i10 + 1] = (byte) ((i9 >> 8) & 255);
            bArr[i10 + 2] = (byte) ((i9 >> 16) & 255);
            this.f21916f = i10 + 4;
            bArr[i10 + 3] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e9) {
            throw new bpj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21916f), Integer.valueOf(this.f21915e), 1), e9);
        }
    }

    public final void an(int i9, long j9) throws IOException {
        ax(i9, 1);
        ao(j9);
    }

    public final void ao(long j9) throws IOException {
        try {
            byte[] bArr = this.f21914d;
            int i9 = this.f21916f;
            bArr[i9] = (byte) (((int) j9) & 255);
            bArr[i9 + 1] = (byte) (((int) (j9 >> 8)) & 255);
            bArr[i9 + 2] = (byte) (((int) (j9 >> 16)) & 255);
            bArr[i9 + 3] = (byte) (((int) (j9 >> 24)) & 255);
            bArr[i9 + 4] = (byte) (((int) (j9 >> 32)) & 255);
            bArr[i9 + 5] = (byte) (((int) (j9 >> 40)) & 255);
            bArr[i9 + 6] = (byte) (((int) (j9 >> 48)) & 255);
            this.f21916f = i9 + 8;
            bArr[i9 + 7] = (byte) (((int) (j9 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e9) {
            throw new bpj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21916f), Integer.valueOf(this.f21915e), 1), e9);
        }
    }

    public final void ap(int i9, int i10) throws IOException {
        ax(i9, 0);
        aq(i10);
    }

    public final void aq(int i9) throws IOException {
        if (i9 >= 0) {
            az(i9);
        } else {
            aB(i9);
        }
    }

    public final void ar(byte[] bArr, int i9, int i10) throws IOException {
        ai(bArr, 0, i10);
    }

    public final void as(int i9, brs brsVar, bsi bsiVar) throws IOException {
        ax(i9, 2);
        az(((bon) brsVar).at(bsiVar));
        bsiVar.j(brsVar, this.f21913a);
    }

    public final void at(int i9, brs brsVar) throws IOException {
        ax(1, 3);
        ay(2, i9);
        ax(3, 2);
        az(brsVar.ax());
        brsVar.br(this);
        ax(1, 4);
    }

    public final void au(int i9, bpb bpbVar) throws IOException {
        ax(1, 3);
        ay(2, i9);
        ak(3, bpbVar);
        ax(1, 4);
    }

    public final void av(int i9, String str) throws IOException {
        ax(i9, 2);
        aw(str);
    }

    public final void aw(String str) throws IOException {
        int i9 = this.f21916f;
        try {
            int iS = S(str.length() * 3);
            int iS2 = S(str.length());
            if (iS2 != iS) {
                az(btj.e(str));
                this.f21916f = btj.d(str, this.f21914d, this.f21916f, ag());
                return;
            }
            int i10 = i9 + iS2;
            this.f21916f = i10;
            int iD = btj.d(str, this.f21914d, i10, ag());
            this.f21916f = i9;
            az((iD - i9) - iS2);
            this.f21916f = iD;
        } catch (bti e9) {
            this.f21916f = i9;
            Z(str, e9);
        } catch (IndexOutOfBoundsException e10) {
            throw new bpj(e10);
        }
    }

    public final void ax(int i9, int i10) throws IOException {
        az(btm.c(i9, i10));
    }

    public final void ay(int i9, int i10) throws IOException {
        ax(i9, 0);
        az(i10);
    }

    public final void az(int i9) throws IOException {
        while ((i9 & (-128)) != 0) {
            try {
                byte[] bArr = this.f21914d;
                int i10 = this.f21916f;
                this.f21916f = i10 + 1;
                bArr[i10] = (byte) ((i9 & 127) | 128);
                i9 >>>= 7;
            } catch (IndexOutOfBoundsException e9) {
                throw new bpj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21916f), Integer.valueOf(this.f21915e), 1), e9);
            }
        }
        byte[] bArr2 = this.f21914d;
        int i11 = this.f21916f;
        this.f21916f = i11 + 1;
        bArr2[i11] = (byte) i9;
    }
}
