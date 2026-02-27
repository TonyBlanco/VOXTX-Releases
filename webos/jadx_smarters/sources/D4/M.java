package d4;

import java.nio.charset.Charset;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;
import okio.Utf8;
import org.apache.http.message.TokenParser;
import r5.AbstractC2675d;
import s5.AbstractC2719C;
import w5.AbstractC2931c;

/* JADX INFO: loaded from: classes3.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f39704d = {TokenParser.CR, '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f39705e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2719C f39706f = AbstractC2719C.E(AbstractC2675d.f49722a, AbstractC2675d.f49724c, AbstractC2675d.f49727f, AbstractC2675d.f49725d, AbstractC2675d.f49726e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f39707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39709c;

    public M() {
        this.f39707a = k0.f39782f;
    }

    public M(int i9) {
        this.f39707a = new byte[i9];
        this.f39709c = i9;
    }

    public M(byte[] bArr) {
        this.f39707a = bArr;
        this.f39709c = bArr.length;
    }

    public M(byte[] bArr, int i9) {
        this.f39707a = bArr;
        this.f39709c = i9;
    }

    public long A() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 7;
        long j9 = ((((long) bArr[i9]) & 255) << 56) | ((((long) bArr[i9 + 1]) & 255) << 48) | ((((long) bArr[i9 + 2]) & 255) << 40) | ((((long) bArr[i9 + 3]) & 255) << 32) | ((((long) bArr[i9 + 4]) & 255) << 24) | ((((long) bArr[i9 + 5]) & 255) << 16) | ((((long) bArr[i9 + 6]) & 255) << 8);
        this.f39708b = i9 + 8;
        return (((long) bArr[i10]) & 255) | j9;
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i9) {
        if (i9 == 0) {
            return "";
        }
        int i10 = this.f39708b;
        int i11 = (i10 + i9) - 1;
        String strF = k0.F(this.f39707a, i10, (i11 >= this.f39709c || this.f39707a[i11] != 0) ? i9 : i9 - 1);
        this.f39708b += i9;
        return strF;
    }

    public short D() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 1;
        int i11 = (bArr[i9] & 255) << 8;
        this.f39708b = i9 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public String E(int i9) {
        return F(i9, AbstractC2675d.f49724c);
    }

    public String F(int i9, Charset charset) {
        String str = new String(this.f39707a, this.f39708b, i9, charset);
        this.f39708b += i9;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        this.f39708b = i9 + 1;
        return bArr[i9] & 255;
    }

    public int I() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = (bArr[i9 + 1] & 255) | ((bArr[i9] & 255) << 8);
        this.f39708b = i9 + 4;
        return i10;
    }

    public long J() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 3;
        long j9 = ((((long) bArr[i9]) & 255) << 24) | ((((long) bArr[i9 + 1]) & 255) << 16) | ((((long) bArr[i9 + 2]) & 255) << 8);
        this.f39708b = i9 + 4;
        return (((long) bArr[i10]) & 255) | j9;
    }

    public int K() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 2;
        int i11 = ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9] & 255) << 16);
        this.f39708b = i9 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public int L() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public long M() {
        long jA = A();
        if (jA >= 0) {
            return jA;
        }
        throw new IllegalStateException("Top bit not zero: " + jA);
    }

    public int N() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 1;
        int i11 = (bArr[i9] & 255) << 8;
        this.f39708b = i9 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public long O() {
        int i9;
        int i10;
        long j9 = this.f39707a[this.f39708b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            int i12 = 1 << i11;
            if ((((long) i12) & j9) != 0) {
                i11--;
            } else if (i11 < 6) {
                j9 &= (long) (i12 - 1);
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j9);
        }
        for (i9 = 1; i9 < i10; i9++) {
            byte b9 = this.f39707a[this.f39708b + i9];
            if ((b9 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j9);
            }
            j9 = (j9 << 6) | ((long) (b9 & Utf8.REPLACEMENT_BYTE));
        }
        this.f39708b += i10;
        return j9;
    }

    public Charset P() {
        if (a() >= 3) {
            byte[] bArr = this.f39707a;
            int i9 = this.f39708b;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.f39708b = i9 + 3;
                return AbstractC2675d.f49724c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f39707a;
        int i10 = this.f39708b;
        byte b9 = bArr2[i10];
        if (b9 == -2 && bArr2[i10 + 1] == -1) {
            this.f39708b = i10 + 2;
            return AbstractC2675d.f49725d;
        }
        if (b9 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f39708b = i10 + 2;
        return AbstractC2675d.f49726e;
    }

    public void Q(int i9) {
        S(b() < i9 ? new byte[i9] : this.f39707a, i9);
    }

    public void R(byte[] bArr) {
        S(bArr, bArr.length);
    }

    public void S(byte[] bArr, int i9) {
        this.f39707a = bArr;
        this.f39709c = i9;
        this.f39708b = 0;
    }

    public void T(int i9) {
        AbstractC1684a.a(i9 >= 0 && i9 <= this.f39707a.length);
        this.f39709c = i9;
    }

    public void U(int i9) {
        AbstractC1684a.a(i9 >= 0 && i9 <= this.f39709c);
        this.f39708b = i9;
    }

    public void V(int i9) {
        U(this.f39708b + i9);
    }

    public final void W(Charset charset) {
        if (m(charset, f39704d) == '\r') {
            m(charset, f39705e);
        }
    }

    public int a() {
        return this.f39709c - this.f39708b;
    }

    public int b() {
        return this.f39707a.length;
    }

    public void c(int i9) {
        if (i9 > b()) {
            this.f39707a = Arrays.copyOf(this.f39707a, i9);
        }
    }

    public final int d(Charset charset) {
        int i9;
        if (charset.equals(AbstractC2675d.f49724c) || charset.equals(AbstractC2675d.f49722a)) {
            i9 = 1;
        } else {
            if (!charset.equals(AbstractC2675d.f49727f) && !charset.equals(AbstractC2675d.f49726e) && !charset.equals(AbstractC2675d.f49725d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i9 = 2;
        }
        int i10 = this.f39708b;
        while (true) {
            int i11 = this.f39709c;
            if (i10 >= i11 - (i9 - 1)) {
                return i11;
            }
            if ((charset.equals(AbstractC2675d.f49724c) || charset.equals(AbstractC2675d.f49722a)) && k0.E0(this.f39707a[i10])) {
                return i10;
            }
            if (charset.equals(AbstractC2675d.f49727f) || charset.equals(AbstractC2675d.f49725d)) {
                byte[] bArr = this.f39707a;
                if (bArr[i10] == 0 && k0.E0(bArr[i10 + 1])) {
                    return i10;
                }
            }
            if (charset.equals(AbstractC2675d.f49726e)) {
                byte[] bArr2 = this.f39707a;
                if (bArr2[i10 + 1] == 0 && k0.E0(bArr2[i10])) {
                    return i10;
                }
            }
            i10 += i9;
        }
    }

    public byte[] e() {
        return this.f39707a;
    }

    public int f() {
        return this.f39708b;
    }

    public int g() {
        return this.f39709c;
    }

    public char h(Charset charset) {
        AbstractC1684a.b(f39706f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public final int i(Charset charset) {
        byte bA;
        char c9;
        int i9 = 1;
        if ((charset.equals(AbstractC2675d.f49724c) || charset.equals(AbstractC2675d.f49722a)) && a() >= 1) {
            bA = (byte) AbstractC2931c.a(w5.i.a(this.f39707a[this.f39708b]));
        } else {
            if ((charset.equals(AbstractC2675d.f49727f) || charset.equals(AbstractC2675d.f49725d)) && a() >= 2) {
                byte[] bArr = this.f39707a;
                int i10 = this.f39708b;
                c9 = AbstractC2931c.c(bArr[i10], bArr[i10 + 1]);
            } else {
                if (!charset.equals(AbstractC2675d.f49726e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f39707a;
                int i11 = this.f39708b;
                c9 = AbstractC2931c.c(bArr2[i11 + 1], bArr2[i11]);
            }
            bA = (byte) c9;
            i9 = 2;
        }
        return (AbstractC2931c.a(bA) << 16) + i9;
    }

    public int j() {
        return this.f39707a[this.f39708b] & 255;
    }

    public void k(L l9, int i9) {
        l(l9.f39700a, 0, i9);
        l9.p(0);
    }

    public void l(byte[] bArr, int i9, int i10) {
        System.arraycopy(this.f39707a, this.f39708b, bArr, i9, i10);
        this.f39708b += i10;
    }

    public final char m(Charset charset, char[] cArr) {
        int i9 = i(charset);
        if (i9 == 0) {
            return (char) 0;
        }
        char c9 = (char) (i9 >> 16);
        if (!AbstractC2931c.b(cArr, c9)) {
            return (char) 0;
        }
        this.f39708b += i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return c9;
    }

    public String n(char c9) {
        if (a() == 0) {
            return null;
        }
        int i9 = this.f39708b;
        while (i9 < this.f39709c && this.f39707a[i9] != c9) {
            i9++;
        }
        byte[] bArr = this.f39707a;
        int i10 = this.f39708b;
        String strF = k0.F(bArr, i10, i9 - i10);
        this.f39708b = i9;
        if (i9 < this.f39709c) {
            this.f39708b = i9 + 1;
        }
        return strF;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24);
        int i11 = i9 + 3;
        int i12 = i10 | ((bArr[i9 + 2] & 255) << 8);
        this.f39708b = i9 + 4;
        return (bArr[i11] & 255) | i12;
    }

    public int r() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 2;
        int i11 = ((bArr[i9 + 1] & 255) << 8) | (((bArr[i9] & 255) << 24) >> 8);
        this.f39708b = i9 + 3;
        return (bArr[i10] & 255) | i11;
    }

    public String s() {
        return t(AbstractC2675d.f49724c);
    }

    public String t(Charset charset) {
        AbstractC1684a.b(f39706f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2675d.f49722a)) {
            P();
        }
        String strF = F(d(charset) - this.f39708b, charset);
        if (this.f39708b == this.f39709c) {
            return strF;
        }
        W(charset);
        return strF;
    }

    public int u() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = ((bArr[i9 + 1] & 255) << 8) | (bArr[i9] & 255);
        int i11 = i9 + 3;
        int i12 = i10 | ((bArr[i9 + 2] & 255) << 16);
        this.f39708b = i9 + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    public long v() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 7;
        long j9 = (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16) | ((((long) bArr[i9 + 3]) & 255) << 24) | ((((long) bArr[i9 + 4]) & 255) << 32) | ((((long) bArr[i9 + 5]) & 255) << 40) | ((((long) bArr[i9 + 6]) & 255) << 48);
        this.f39708b = i9 + 8;
        return ((((long) bArr[i10]) & 255) << 56) | j9;
    }

    public short w() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 1;
        int i11 = bArr[i9] & 255;
        this.f39708b = i9 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public long x() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 3;
        long j9 = (((long) bArr[i9]) & 255) | ((((long) bArr[i9 + 1]) & 255) << 8) | ((((long) bArr[i9 + 2]) & 255) << 16);
        this.f39708b = i9 + 4;
        return ((((long) bArr[i10]) & 255) << 24) | j9;
    }

    public int y() {
        int iU = u();
        if (iU >= 0) {
            return iU;
        }
        throw new IllegalStateException("Top bit not zero: " + iU);
    }

    public int z() {
        byte[] bArr = this.f39707a;
        int i9 = this.f39708b;
        int i10 = i9 + 1;
        int i11 = bArr[i9] & 255;
        this.f39708b = i9 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }
}
