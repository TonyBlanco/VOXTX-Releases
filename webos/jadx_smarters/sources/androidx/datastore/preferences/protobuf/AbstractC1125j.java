package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1125j extends AbstractC1121f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f14690c = Logger.getLogger(AbstractC1125j.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f14691d = p0.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1126k f14692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14693b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$b */
    public static abstract class b extends AbstractC1125j {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f14694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f14695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14697h;

        public b(int i9) {
            super();
            if (i9 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i9, 20)];
            this.f14694e = bArr;
            this.f14695f = bArr.length;
        }

        public final void S0(byte b9) {
            byte[] bArr = this.f14694e;
            int i9 = this.f14696g;
            this.f14696g = i9 + 1;
            bArr[i9] = b9;
            this.f14697h++;
        }

        public final void T0(int i9) {
            byte[] bArr = this.f14694e;
            int i10 = this.f14696g;
            bArr[i10] = (byte) (i9 & 255);
            bArr[i10 + 1] = (byte) ((i9 >> 8) & 255);
            bArr[i10 + 2] = (byte) ((i9 >> 16) & 255);
            this.f14696g = i10 + 4;
            bArr[i10 + 3] = (byte) ((i9 >> 24) & 255);
            this.f14697h += 4;
        }

        public final void U0(long j9) {
            byte[] bArr = this.f14694e;
            int i9 = this.f14696g;
            bArr[i9] = (byte) (j9 & 255);
            bArr[i9 + 1] = (byte) ((j9 >> 8) & 255);
            bArr[i9 + 2] = (byte) ((j9 >> 16) & 255);
            bArr[i9 + 3] = (byte) (255 & (j9 >> 24));
            bArr[i9 + 4] = (byte) (((int) (j9 >> 32)) & 255);
            bArr[i9 + 5] = (byte) (((int) (j9 >> 40)) & 255);
            bArr[i9 + 6] = (byte) (((int) (j9 >> 48)) & 255);
            this.f14696g = i9 + 8;
            bArr[i9 + 7] = (byte) (((int) (j9 >> 56)) & 255);
            this.f14697h += 8;
        }

        public final void V0(int i9) {
            if (i9 >= 0) {
                X0(i9);
            } else {
                Y0(i9);
            }
        }

        public final void W0(int i9, int i10) {
            X0(r0.c(i9, i10));
        }

        public final void X0(int i9) {
            if (!AbstractC1125j.f14691d) {
                while ((i9 & (-128)) != 0) {
                    byte[] bArr = this.f14694e;
                    int i10 = this.f14696g;
                    this.f14696g = i10 + 1;
                    bArr[i10] = (byte) ((i9 & 127) | 128);
                    this.f14697h++;
                    i9 >>>= 7;
                }
                byte[] bArr2 = this.f14694e;
                int i11 = this.f14696g;
                this.f14696g = i11 + 1;
                bArr2[i11] = (byte) i9;
                this.f14697h++;
                return;
            }
            long j9 = this.f14696g;
            while ((i9 & (-128)) != 0) {
                byte[] bArr3 = this.f14694e;
                int i12 = this.f14696g;
                this.f14696g = i12 + 1;
                p0.H(bArr3, i12, (byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            }
            byte[] bArr4 = this.f14694e;
            int i13 = this.f14696g;
            this.f14696g = i13 + 1;
            p0.H(bArr4, i13, (byte) i9);
            this.f14697h += (int) (((long) this.f14696g) - j9);
        }

        public final void Y0(long j9) {
            if (!AbstractC1125j.f14691d) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.f14694e;
                    int i9 = this.f14696g;
                    this.f14696g = i9 + 1;
                    bArr[i9] = (byte) ((((int) j9) & 127) | 128);
                    this.f14697h++;
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.f14694e;
                int i10 = this.f14696g;
                this.f14696g = i10 + 1;
                bArr2[i10] = (byte) j9;
                this.f14697h++;
                return;
            }
            long j10 = this.f14696g;
            while ((j9 & (-128)) != 0) {
                byte[] bArr3 = this.f14694e;
                int i11 = this.f14696g;
                this.f14696g = i11 + 1;
                p0.H(bArr3, i11, (byte) ((((int) j9) & 127) | 128));
                j9 >>>= 7;
            }
            byte[] bArr4 = this.f14694e;
            int i12 = this.f14696g;
            this.f14696g = i12 + 1;
            p0.H(bArr4, i12, (byte) j9);
            this.f14697h += (int) (((long) this.f14696g) - j10);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$c */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$d */
    public static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OutputStream f14698i;

        public d(OutputStream outputStream, int i9) {
            super(i9);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f14698i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void A0(O o9) throws IOException {
            P0(o9.d());
            o9.g(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void B0(int i9, O o9) throws IOException {
            N0(1, 3);
            O0(2, i9);
            c1(3, o9);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void C0(int i9, AbstractC1122g abstractC1122g) throws IOException {
            N0(1, 3);
            O0(2, i9);
            f0(3, abstractC1122g);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void L0(int i9, String str) throws IOException {
            N0(i9, 2);
            M0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void M0(String str) throws IOException {
            int iG;
            try {
                int length = str.length() * 3;
                int iR = AbstractC1125j.R(length);
                int i9 = iR + length;
                int i10 = this.f14695f;
                if (i9 > i10) {
                    byte[] bArr = new byte[length];
                    int iF = q0.f(str, bArr, 0, length);
                    P0(iF);
                    a(bArr, 0, iF);
                    return;
                }
                if (i9 > i10 - this.f14696g) {
                    Z0();
                }
                int iR2 = AbstractC1125j.R(str.length());
                int i11 = this.f14696g;
                try {
                    if (iR2 == iR) {
                        int i12 = i11 + iR2;
                        this.f14696g = i12;
                        int iF2 = q0.f(str, this.f14694e, i12, this.f14695f - i12);
                        this.f14696g = i11;
                        iG = (iF2 - i11) - iR2;
                        X0(iG);
                        this.f14696g = iF2;
                    } else {
                        iG = q0.g(str);
                        X0(iG);
                        this.f14696g = q0.f(str, this.f14694e, this.f14696g, iG);
                    }
                    this.f14697h += iG;
                } catch (q0.d e9) {
                    this.f14697h -= this.f14696g - i11;
                    this.f14696g = i11;
                    throw e9;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new c(e10);
                }
            } catch (q0.d e11) {
                X(str, e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void N0(int i9, int i10) throws IOException {
            P0(r0.c(i9, i10));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void O0(int i9, int i10) throws IOException {
            a1(20);
            W0(i9, 0);
            X0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void P0(int i9) throws IOException {
            a1(5);
            X0(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void Q0(int i9, long j9) throws IOException {
            a1(20);
            W0(i9, 0);
            Y0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void R0(long j9) throws IOException {
            a1(10);
            Y0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void W() throws IOException {
            if (this.f14696g > 0) {
                Z0();
            }
        }

        public final void Z0() throws IOException {
            this.f14698i.write(this.f14694e, 0, this.f14696g);
            this.f14696g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j, androidx.datastore.preferences.protobuf.AbstractC1121f
        public void a(byte[] bArr, int i9, int i10) throws IOException {
            b1(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void a0(byte b9) throws IOException {
            if (this.f14696g == this.f14695f) {
                Z0();
            }
            S0(b9);
        }

        public final void a1(int i9) throws IOException {
            if (this.f14695f - this.f14696g < i9) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void b0(int i9, boolean z9) throws IOException {
            a1(11);
            W0(i9, 0);
            S0(z9 ? (byte) 1 : (byte) 0);
        }

        public void b1(byte[] bArr, int i9, int i10) throws IOException {
            int i11 = this.f14695f;
            int i12 = this.f14696g;
            if (i11 - i12 >= i10) {
                System.arraycopy(bArr, i9, this.f14694e, i12, i10);
                this.f14696g += i10;
            } else {
                int i13 = i11 - i12;
                System.arraycopy(bArr, i9, this.f14694e, i12, i13);
                int i14 = i9 + i13;
                i10 -= i13;
                this.f14696g = this.f14695f;
                this.f14697h += i13;
                Z0();
                if (i10 <= this.f14695f) {
                    System.arraycopy(bArr, i14, this.f14694e, 0, i10);
                    this.f14696g = i10;
                } else {
                    this.f14698i.write(bArr, i14, i10);
                }
            }
            this.f14697h += i10;
        }

        public void c1(int i9, O o9) throws IOException {
            N0(i9, 2);
            A0(o9);
        }

        public void d1(O o9, e0 e0Var) throws IOException {
            P0(((AbstractC1116a) o9).i(e0Var));
            e0Var.h(o9, this.f14692a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void e0(byte[] bArr, int i9, int i10) throws IOException {
            P0(i10);
            b1(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void f0(int i9, AbstractC1122g abstractC1122g) throws IOException {
            N0(i9, 2);
            g0(abstractC1122g);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void g0(AbstractC1122g abstractC1122g) throws IOException {
            P0(abstractC1122g.size());
            abstractC1122g.z(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void l0(int i9, int i10) throws IOException {
            a1(14);
            W0(i9, 5);
            T0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void m0(int i9) throws IOException {
            a1(4);
            T0(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void n0(int i9, long j9) throws IOException {
            a1(18);
            W0(i9, 1);
            U0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void o0(long j9) throws IOException {
            a1(8);
            U0(j9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void v0(int i9, int i10) throws IOException {
            a1(20);
            W0(i9, 0);
            V0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void w0(int i9) throws IOException {
            if (i9 >= 0) {
                P0(i9);
            } else {
                R0(i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1125j
        public void z0(int i9, O o9, e0 e0Var) throws IOException {
            N0(i9, 2);
            d1(o9, e0Var);
        }
    }

    public AbstractC1125j() {
    }

    public static int A(O o9) {
        return y(o9.d());
    }

    public static int B(O o9, e0 e0Var) {
        return y(((AbstractC1116a) o9).i(e0Var));
    }

    public static int C(int i9) {
        if (i9 > 4096) {
            return 4096;
        }
        return i9;
    }

    public static int D(int i9, AbstractC1122g abstractC1122g) {
        return (P(1) * 2) + Q(2, i9) + f(3, abstractC1122g);
    }

    public static int E(int i9) {
        return R(i9);
    }

    public static int F(int i9, int i10) {
        return P(i9) + G(i10);
    }

    public static int G(int i9) {
        return 4;
    }

    public static int H(int i9, long j9) {
        return P(i9) + I(j9);
    }

    public static int I(long j9) {
        return 8;
    }

    public static int J(int i9, int i10) {
        return P(i9) + K(i10);
    }

    public static int K(int i9) {
        return R(U(i9));
    }

    public static int L(int i9, long j9) {
        return P(i9) + M(j9);
    }

    public static int M(long j9) {
        return T(V(j9));
    }

    public static int N(int i9, String str) {
        return P(i9) + O(str);
    }

    public static int O(String str) {
        int length;
        try {
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(AbstractC1139y.f14768a).length;
        }
        return y(length);
    }

    public static int P(int i9) {
        return R(r0.c(i9, 0));
    }

    public static int Q(int i9, int i10) {
        return P(i9) + R(i10);
    }

    public static int R(int i9) {
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

    public static int S(int i9, long j9) {
        return P(i9) + T(j9);
    }

    public static int T(long j9) {
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

    public static int U(int i9) {
        return (i9 >> 31) ^ (i9 << 1);
    }

    public static long V(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
    }

    public static AbstractC1125j Z(OutputStream outputStream, int i9) {
        return new d(outputStream, i9);
    }

    public static int c(int i9, boolean z9) {
        return P(i9) + d(z9);
    }

    public static int d(boolean z9) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i9, AbstractC1122g abstractC1122g) {
        return P(i9) + g(abstractC1122g);
    }

    public static int g(AbstractC1122g abstractC1122g) {
        return y(abstractC1122g.size());
    }

    public static int h(int i9, double d9) {
        return P(i9) + i(d9);
    }

    public static int i(double d9) {
        return 8;
    }

    public static int j(int i9, int i10) {
        return P(i9) + k(i10);
    }

    public static int k(int i9) {
        return v(i9);
    }

    public static int l(int i9, int i10) {
        return P(i9) + m(i10);
    }

    public static int m(int i9) {
        return 4;
    }

    public static int n(int i9, long j9) {
        return P(i9) + o(j9);
    }

    public static int o(long j9) {
        return 8;
    }

    public static int p(int i9, float f9) {
        return P(i9) + q(f9);
    }

    public static int q(float f9) {
        return 4;
    }

    public static int r(int i9, O o9, e0 e0Var) {
        return (P(i9) * 2) + t(o9, e0Var);
    }

    public static int s(O o9) {
        return o9.d();
    }

    public static int t(O o9, e0 e0Var) {
        return ((AbstractC1116a) o9).i(e0Var);
    }

    public static int u(int i9, int i10) {
        return P(i9) + v(i10);
    }

    public static int v(int i9) {
        if (i9 >= 0) {
            return R(i9);
        }
        return 10;
    }

    public static int w(int i9, long j9) {
        return P(i9) + x(j9);
    }

    public static int x(long j9) {
        return T(j9);
    }

    public static int y(int i9) {
        return R(i9) + i9;
    }

    public static int z(int i9, O o9, e0 e0Var) {
        return P(i9) + B(o9, e0Var);
    }

    public abstract void A0(O o9);

    public abstract void B0(int i9, O o9);

    public abstract void C0(int i9, AbstractC1122g abstractC1122g);

    public final void D0(int i9, int i10) {
        l0(i9, i10);
    }

    public final void E0(int i9) {
        m0(i9);
    }

    public final void F0(int i9, long j9) {
        n0(i9, j9);
    }

    public final void G0(long j9) {
        o0(j9);
    }

    public final void H0(int i9, int i10) {
        O0(i9, U(i10));
    }

    public final void I0(int i9) {
        P0(U(i9));
    }

    public final void J0(int i9, long j9) {
        Q0(i9, V(j9));
    }

    public final void K0(long j9) {
        R0(V(j9));
    }

    public abstract void L0(int i9, String str);

    public abstract void M0(String str);

    public abstract void N0(int i9, int i10);

    public abstract void O0(int i9, int i10);

    public abstract void P0(int i9);

    public abstract void Q0(int i9, long j9);

    public abstract void R0(long j9);

    public abstract void W();

    public final void X(String str, q0.d dVar) throws c {
        f14690c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC1139y.f14768a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e9) {
            throw e9;
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public boolean Y() {
        return this.f14693b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1121f
    public abstract void a(byte[] bArr, int i9, int i10);

    public abstract void a0(byte b9);

    public abstract void b0(int i9, boolean z9);

    public final void c0(boolean z9) {
        a0(z9 ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    public abstract void e0(byte[] bArr, int i9, int i10);

    public abstract void f0(int i9, AbstractC1122g abstractC1122g);

    public abstract void g0(AbstractC1122g abstractC1122g);

    public final void h0(int i9, double d9) {
        n0(i9, Double.doubleToRawLongBits(d9));
    }

    public final void i0(double d9) {
        o0(Double.doubleToRawLongBits(d9));
    }

    public final void j0(int i9, int i10) {
        v0(i9, i10);
    }

    public final void k0(int i9) {
        w0(i9);
    }

    public abstract void l0(int i9, int i10);

    public abstract void m0(int i9);

    public abstract void n0(int i9, long j9);

    public abstract void o0(long j9);

    public final void p0(int i9, float f9) {
        l0(i9, Float.floatToRawIntBits(f9));
    }

    public final void q0(float f9) {
        m0(Float.floatToRawIntBits(f9));
    }

    public final void r0(int i9, O o9) {
        N0(i9, 3);
        t0(o9);
        N0(i9, 4);
    }

    public final void s0(int i9, O o9, e0 e0Var) {
        N0(i9, 3);
        u0(o9, e0Var);
        N0(i9, 4);
    }

    public final void t0(O o9) {
        o9.g(this);
    }

    public final void u0(O o9, e0 e0Var) {
        e0Var.h(o9, this.f14692a);
    }

    public abstract void v0(int i9, int i10);

    public abstract void w0(int i9);

    public final void x0(int i9, long j9) {
        Q0(i9, j9);
    }

    public final void y0(long j9) {
        R0(j9);
    }

    public abstract void z0(int i9, O o9, e0 e0Var);
}
