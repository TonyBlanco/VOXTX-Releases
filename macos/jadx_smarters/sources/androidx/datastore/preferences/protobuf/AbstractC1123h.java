package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1123h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1124i f14645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14646e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    public static final class b extends AbstractC1123h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f14647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f14648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14649h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14650i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14651j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f14652k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f14653l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f14654m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f14655n;

        public b(byte[] bArr, int i9, int i10, boolean z9) {
            super();
            this.f14655n = a.e.API_PRIORITY_OTHER;
            this.f14647f = bArr;
            this.f14649h = i10 + i9;
            this.f14651j = i9;
            this.f14652k = i9;
            this.f14648g = z9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public String A() throws C1140z {
            int iJ = J();
            if (iJ > 0) {
                int i9 = this.f14649h;
                int i10 = this.f14651j;
                if (iJ <= i9 - i10) {
                    String strE = q0.e(this.f14647f, i10, iJ);
                    this.f14651j += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw C1140z.f();
            }
            throw C1140z.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int B() throws C1140z {
            if (e()) {
                this.f14653l = 0;
                return 0;
            }
            int iJ = J();
            this.f14653l = iJ;
            if (r0.a(iJ) != 0) {
                return this.f14653l;
            }
            throw C1140z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public boolean E(int i9) throws C1140z {
            int iB = r0.b(i9);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(r0.c(r0.a(i9), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1140z.d();
            }
            O(4);
            return true;
        }

        public byte F() throws C1140z {
            int i9 = this.f14651j;
            if (i9 == this.f14649h) {
                throw C1140z.k();
            }
            byte[] bArr = this.f14647f;
            this.f14651j = i9 + 1;
            return bArr[i9];
        }

        public byte[] G(int i9) throws C1140z {
            if (i9 > 0) {
                int i10 = this.f14649h;
                int i11 = this.f14651j;
                if (i9 <= i10 - i11) {
                    int i12 = i9 + i11;
                    this.f14651j = i12;
                    return Arrays.copyOfRange(this.f14647f, i11, i12);
                }
            }
            if (i9 > 0) {
                throw C1140z.k();
            }
            if (i9 == 0) {
                return AbstractC1139y.f14770c;
            }
            throw C1140z.f();
        }

        public int H() throws C1140z {
            int i9 = this.f14651j;
            if (this.f14649h - i9 < 4) {
                throw C1140z.k();
            }
            byte[] bArr = this.f14647f;
            this.f14651j = i9 + 4;
            return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        }

        public long I() throws C1140z {
            int i9 = this.f14651j;
            if (this.f14649h - i9 < 8) {
                throw C1140z.k();
            }
            byte[] bArr = this.f14647f;
            this.f14651j = i9 + 8;
            return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
        }

        public int J() {
            int i9;
            int i10 = this.f14651j;
            int i11 = this.f14649h;
            if (i11 != i10) {
                byte[] bArr = this.f14647f;
                int i12 = i10 + 1;
                byte b9 = bArr[i10];
                if (b9 >= 0) {
                    this.f14651j = i12;
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
                    this.f14651j = i13;
                    return i9;
                }
            }
            return (int) L();
        }

        public long K() {
            long j9;
            long j10;
            long j11;
            int i9 = this.f14651j;
            int i10 = this.f14649h;
            if (i10 != i9) {
                byte[] bArr = this.f14647f;
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.f14651j = i11;
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
                            i12 = i14;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                long j12 = (-2080896) ^ i17;
                                i12 = i16;
                                j9 = j12;
                            } else {
                                long j13 = i17;
                                i12 = i9 + 5;
                                long j14 = j13 ^ (((long) bArr[i16]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i18 = i9 + 6;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i9 + 7;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i18 = i9 + 8;
                                            j15 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i9 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i19;
                                                    }
                                                }
                                                j9 = j16;
                                            }
                                        }
                                    }
                                    j9 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j9 = j14 ^ j11;
                            }
                        }
                    }
                    this.f14651j = i12;
                    return j9;
                }
            }
            return L();
        }

        public long L() throws C1140z {
            long j9 = 0;
            for (int i9 = 0; i9 < 64; i9 += 7) {
                byte bF = F();
                j9 |= ((long) (bF & 127)) << i9;
                if ((bF & 128) == 0) {
                    return j9;
                }
            }
            throw C1140z.e();
        }

        public final void M() {
            int i9 = this.f14649h + this.f14650i;
            this.f14649h = i9;
            int i10 = i9 - this.f14652k;
            int i11 = this.f14655n;
            if (i10 <= i11) {
                this.f14650i = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f14650i = i12;
            this.f14649h = i9 - i12;
        }

        public void N() throws C1140z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i9) throws C1140z {
            if (i9 >= 0) {
                int i10 = this.f14649h;
                int i11 = this.f14651j;
                if (i9 <= i10 - i11) {
                    this.f14651j = i11 + i9;
                    return;
                }
            }
            if (i9 >= 0) {
                throw C1140z.k();
            }
            throw C1140z.f();
        }

        public final void P() throws C1140z {
            if (this.f14649h - this.f14651j >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() throws C1140z {
            for (int i9 = 0; i9 < 10; i9++) {
                byte[] bArr = this.f14647f;
                int i10 = this.f14651j;
                this.f14651j = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw C1140z.e();
        }

        public final void R() throws C1140z {
            for (int i9 = 0; i9 < 10; i9++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw C1140z.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public void a(int i9) throws C1140z {
            if (this.f14653l != i9) {
                throw C1140z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int d() {
            return this.f14651j - this.f14652k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public boolean e() {
            return this.f14651j == this.f14649h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public void k(int i9) {
            this.f14655n = i9;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int l(int i9) throws C1140z {
            if (i9 < 0) {
                throw C1140z.f();
            }
            int iD = i9 + d();
            int i10 = this.f14655n;
            if (iD > i10) {
                throw C1140z.k();
            }
            this.f14655n = iD;
            M();
            return i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public AbstractC1122g n() {
            int iJ = J();
            if (iJ > 0) {
                int i9 = this.f14649h;
                int i10 = this.f14651j;
                if (iJ <= i9 - i10) {
                    AbstractC1122g abstractC1122gY = (this.f14648g && this.f14654m) ? AbstractC1122g.y(this.f14647f, i10, iJ) : AbstractC1122g.f(this.f14647f, i10, iJ);
                    this.f14651j += iJ;
                    return abstractC1122gY;
                }
            }
            return iJ == 0 ? AbstractC1122g.f14628c : AbstractC1122g.u(G(iJ));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int x() {
            return AbstractC1123h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long y() {
            return AbstractC1123h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public String z() throws C1140z {
            int iJ = J();
            if (iJ > 0) {
                int i9 = this.f14649h;
                int i10 = this.f14651j;
                if (iJ <= i9 - i10) {
                    String str = new String(this.f14647f, i10, iJ, AbstractC1139y.f14768a);
                    this.f14651j += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw C1140z.f();
            }
            throw C1140z.k();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$c */
    public static final class c extends AbstractC1123h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InputStream f14656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f14657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14658h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14659i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14660j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f14661k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f14662l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f14663m;

        public c(InputStream inputStream, int i9) {
            super();
            this.f14663m = a.e.API_PRIORITY_OTHER;
            AbstractC1139y.b(inputStream, "input");
            this.f14656f = inputStream;
            this.f14657g = new byte[i9];
            this.f14658h = 0;
            this.f14660j = 0;
            this.f14662l = 0;
        }

        private void P() {
            int i9 = this.f14658h + this.f14659i;
            this.f14658h = i9;
            int i10 = this.f14662l + i9;
            int i11 = this.f14663m;
            if (i10 <= i11) {
                this.f14659i = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f14659i = i12;
            this.f14658h = i9 - i12;
        }

        private void U() throws C1140z {
            if (this.f14658h - this.f14660j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws C1140z {
            for (int i9 = 0; i9 < 10; i9++) {
                byte[] bArr = this.f14657g;
                int i10 = this.f14660j;
                this.f14660j = i10 + 1;
                if (bArr[i10] >= 0) {
                    return;
                }
            }
            throw C1140z.e();
        }

        private void W() throws C1140z {
            for (int i9 = 0; i9 < 10; i9++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw C1140z.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public String A() throws IOException {
            byte[] bArrH;
            int iM = M();
            int i9 = this.f14660j;
            int i10 = this.f14658h;
            if (iM <= i10 - i9 && iM > 0) {
                bArrH = this.f14657g;
                this.f14660j = i9 + iM;
            } else {
                if (iM == 0) {
                    return "";
                }
                i9 = 0;
                if (iM <= i10) {
                    Q(iM);
                    bArrH = this.f14657g;
                    this.f14660j = iM;
                } else {
                    bArrH = H(iM, false);
                }
            }
            return q0.e(bArrH, i9, iM);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int B() throws C1140z {
            if (e()) {
                this.f14661k = 0;
                return 0;
            }
            int iM = M();
            this.f14661k = iM;
            if (r0.a(iM) != 0) {
                return this.f14661k;
            }
            throw C1140z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public boolean E(int i9) throws C1140z {
            int iB = r0.b(i9);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                S(8);
                return true;
            }
            if (iB == 2) {
                S(M());
                return true;
            }
            if (iB == 3) {
                R();
                a(r0.c(r0.a(i9), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1140z.d();
            }
            S(4);
            return true;
        }

        public final AbstractC1122g F(int i9) throws IOException {
            byte[] bArrI = I(i9);
            if (bArrI != null) {
                return AbstractC1122g.e(bArrI);
            }
            int i10 = this.f14660j;
            int i11 = this.f14658h;
            int length = i11 - i10;
            this.f14662l += i11;
            this.f14660j = 0;
            this.f14658h = 0;
            List<byte[]> listJ = J(i9 - length);
            byte[] bArr = new byte[i9];
            System.arraycopy(this.f14657g, i10, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC1122g.u(bArr);
        }

        public byte G() throws C1140z {
            if (this.f14660j == this.f14658h) {
                Q(1);
            }
            byte[] bArr = this.f14657g;
            int i9 = this.f14660j;
            this.f14660j = i9 + 1;
            return bArr[i9];
        }

        public final byte[] H(int i9, boolean z9) throws IOException {
            byte[] bArrI = I(i9);
            if (bArrI != null) {
                return z9 ? (byte[]) bArrI.clone() : bArrI;
            }
            int i10 = this.f14660j;
            int i11 = this.f14658h;
            int length = i11 - i10;
            this.f14662l += i11;
            this.f14660j = 0;
            this.f14658h = 0;
            List<byte[]> listJ = J(i9 - length);
            byte[] bArr = new byte[i9];
            System.arraycopy(this.f14657g, i10, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] I(int i9) throws IOException {
            if (i9 == 0) {
                return AbstractC1139y.f14770c;
            }
            if (i9 < 0) {
                throw C1140z.f();
            }
            int i10 = this.f14662l;
            int i11 = this.f14660j;
            int i12 = i10 + i11 + i9;
            if (i12 - this.f14644c > 0) {
                throw C1140z.j();
            }
            int i13 = this.f14663m;
            if (i12 > i13) {
                S((i13 - i10) - i11);
                throw C1140z.k();
            }
            int i14 = this.f14658h - i11;
            int i15 = i9 - i14;
            if (i15 >= 4096 && i15 > this.f14656f.available()) {
                return null;
            }
            byte[] bArr = new byte[i9];
            System.arraycopy(this.f14657g, this.f14660j, bArr, 0, i14);
            this.f14662l += this.f14658h;
            this.f14660j = 0;
            this.f14658h = 0;
            while (i14 < i9) {
                int i16 = this.f14656f.read(bArr, i14, i9 - i14);
                if (i16 == -1) {
                    throw C1140z.k();
                }
                this.f14662l += i16;
                i14 += i16;
            }
            return bArr;
        }

        public final List J(int i9) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i9 > 0) {
                int iMin = Math.min(i9, 4096);
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = this.f14656f.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw C1140z.k();
                    }
                    this.f14662l += i11;
                    i10 += i11;
                }
                i9 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int K() throws C1140z {
            int i9 = this.f14660j;
            if (this.f14658h - i9 < 4) {
                Q(4);
                i9 = this.f14660j;
            }
            byte[] bArr = this.f14657g;
            this.f14660j = i9 + 4;
            return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
        }

        public long L() throws C1140z {
            int i9 = this.f14660j;
            if (this.f14658h - i9 < 8) {
                Q(8);
                i9 = this.f14660j;
            }
            byte[] bArr = this.f14657g;
            this.f14660j = i9 + 8;
            return ((((long) bArr[i9 + 7]) & 255) << 56) | (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
        }

        public int M() {
            int i9;
            int i10 = this.f14660j;
            int i11 = this.f14658h;
            if (i11 != i10) {
                byte[] bArr = this.f14657g;
                int i12 = i10 + 1;
                byte b9 = bArr[i10];
                if (b9 >= 0) {
                    this.f14660j = i12;
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
                    this.f14660j = i13;
                    return i9;
                }
            }
            return (int) O();
        }

        public long N() {
            long j9;
            long j10;
            long j11;
            int i9 = this.f14660j;
            int i10 = this.f14658h;
            if (i10 != i9) {
                byte[] bArr = this.f14657g;
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.f14660j = i11;
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
                            i12 = i14;
                        } else {
                            int i16 = i9 + 4;
                            int i17 = i15 ^ (bArr[i14] << 21);
                            if (i17 < 0) {
                                long j12 = (-2080896) ^ i17;
                                i12 = i16;
                                j9 = j12;
                            } else {
                                long j13 = i17;
                                i12 = i9 + 5;
                                long j14 = j13 ^ (((long) bArr[i16]) << 28);
                                if (j14 >= 0) {
                                    j11 = 266354560;
                                } else {
                                    int i18 = i9 + 6;
                                    long j15 = j14 ^ (((long) bArr[i12]) << 35);
                                    if (j15 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i9 + 7;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j11 = 4363953127296L;
                                        } else {
                                            i18 = i9 + 8;
                                            j15 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j15 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i9 + 9;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    int i19 = i9 + 10;
                                                    if (bArr[i12] >= 0) {
                                                        i12 = i19;
                                                    }
                                                }
                                                j9 = j16;
                                            }
                                        }
                                    }
                                    j9 = j15 ^ j10;
                                    i12 = i18;
                                }
                                j9 = j14 ^ j11;
                            }
                        }
                    }
                    this.f14660j = i12;
                    return j9;
                }
            }
            return O();
        }

        public long O() throws C1140z {
            long j9 = 0;
            for (int i9 = 0; i9 < 64; i9 += 7) {
                byte bG = G();
                j9 |= ((long) (bG & 127)) << i9;
                if ((bG & 128) == 0) {
                    return j9;
                }
            }
            throw C1140z.e();
        }

        public final void Q(int i9) throws C1140z {
            if (X(i9)) {
                return;
            }
            if (i9 <= (this.f14644c - this.f14662l) - this.f14660j) {
                throw C1140z.k();
            }
            throw C1140z.j();
        }

        public void R() throws C1140z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void S(int i9) throws C1140z {
            int i10 = this.f14658h;
            int i11 = this.f14660j;
            if (i9 > i10 - i11 || i9 < 0) {
                T(i9);
            } else {
                this.f14660j = i11 + i9;
            }
        }

        public final void T(int i9) throws C1140z {
            if (i9 < 0) {
                throw C1140z.f();
            }
            int i10 = this.f14662l;
            int i11 = this.f14660j;
            int i12 = i10 + i11 + i9;
            int i13 = this.f14663m;
            if (i12 > i13) {
                S((i13 - i10) - i11);
                throw C1140z.k();
            }
            this.f14662l = i10 + i11;
            int i14 = this.f14658h - i11;
            this.f14658h = 0;
            this.f14660j = 0;
            while (i14 < i9) {
                try {
                    long j9 = i9 - i14;
                    long jSkip = this.f14656f.skip(j9);
                    if (jSkip < 0 || jSkip > j9) {
                        throw new IllegalStateException(this.f14656f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } finally {
                    this.f14662l += i14;
                    P();
                }
            }
            if (i14 >= i9) {
                return;
            }
            int i15 = this.f14658h;
            int i16 = i15 - this.f14660j;
            this.f14660j = i15;
            while (true) {
                Q(1);
                int i17 = i9 - i16;
                int i18 = this.f14658h;
                if (i17 <= i18) {
                    this.f14660j = i17;
                    return;
                } else {
                    i16 += i18;
                    this.f14660j = i18;
                }
            }
        }

        public final boolean X(int i9) throws IOException {
            int i10 = this.f14660j;
            int i11 = i10 + i9;
            int i12 = this.f14658h;
            if (i11 <= i12) {
                throw new IllegalStateException("refillBuffer() called when " + i9 + " bytes were already available in buffer");
            }
            int i13 = this.f14644c;
            int i14 = this.f14662l;
            if (i9 > (i13 - i14) - i10 || i14 + i10 + i9 > this.f14663m) {
                return false;
            }
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.f14657g;
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f14662l += i10;
                this.f14658h -= i10;
                this.f14660j = 0;
            }
            InputStream inputStream = this.f14656f;
            byte[] bArr2 = this.f14657g;
            int i15 = this.f14658h;
            int i16 = inputStream.read(bArr2, i15, Math.min(bArr2.length - i15, (this.f14644c - this.f14662l) - i15));
            if (i16 == 0 || i16 < -1 || i16 > this.f14657g.length) {
                throw new IllegalStateException(this.f14656f.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
            }
            if (i16 <= 0) {
                return false;
            }
            this.f14658h += i16;
            P();
            if (this.f14658h >= i9) {
                return true;
            }
            return X(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public void a(int i9) throws C1140z {
            if (this.f14661k != i9) {
                throw C1140z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int d() {
            return this.f14662l + this.f14660j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public boolean e() {
            return this.f14660j == this.f14658h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public void k(int i9) {
            this.f14663m = i9;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int l(int i9) throws C1140z {
            if (i9 < 0) {
                throw C1140z.f();
            }
            int i10 = i9 + this.f14662l + this.f14660j;
            int i11 = this.f14663m;
            if (i10 > i11) {
                throw C1140z.k();
            }
            this.f14663m = i10;
            P();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public AbstractC1122g n() {
            int iM = M();
            int i9 = this.f14658h;
            int i10 = this.f14660j;
            if (iM > i9 - i10 || iM <= 0) {
                return iM == 0 ? AbstractC1122g.f14628c : F(iM);
            }
            AbstractC1122g abstractC1122gF = AbstractC1122g.f(this.f14657g, i10, iM);
            this.f14660j += iM;
            return abstractC1122gF;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public int x() {
            return AbstractC1123h.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public long y() {
            return AbstractC1123h.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1123h
        public String z() throws C1140z {
            int iM = M();
            if (iM > 0) {
                int i9 = this.f14658h;
                int i10 = this.f14660j;
                if (iM <= i9 - i10) {
                    String str = new String(this.f14657g, i10, iM, AbstractC1139y.f14768a);
                    this.f14660j += iM;
                    return str;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM > this.f14658h) {
                return new String(H(iM, false), AbstractC1139y.f14768a);
            }
            Q(iM);
            String str2 = new String(this.f14657g, this.f14660j, iM, AbstractC1139y.f14768a);
            this.f14660j += iM;
            return str2;
        }
    }

    public AbstractC1123h() {
        this.f14643b = 100;
        this.f14644c = a.e.API_PRIORITY_OTHER;
        this.f14646e = false;
    }

    public static int b(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public static long c(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    public static AbstractC1123h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC1123h g(InputStream inputStream, int i9) {
        if (i9 > 0) {
            return inputStream == null ? h(AbstractC1139y.f14770c) : new c(inputStream, i9);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC1123h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC1123h i(byte[] bArr, int i9, int i10) {
        return j(bArr, i9, i10, false);
    }

    public static AbstractC1123h j(byte[] bArr, int i9, int i10, boolean z9) {
        b bVar = new b(bArr, i9, i10, z9);
        try {
            bVar.l(i10);
            return bVar;
        } catch (C1140z e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i9);

    public abstract void a(int i9);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i9);

    public abstract int l(int i9);

    public abstract boolean m();

    public abstract AbstractC1122g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
