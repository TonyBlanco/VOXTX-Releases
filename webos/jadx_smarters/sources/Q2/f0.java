package Q2;

import d4.AbstractC1684a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f7823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f7824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f7826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f7828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7836v;

    public f0(int i9, int i10, float f9, float f10, int i11) {
        this.f7815a = i9;
        this.f7816b = i10;
        this.f7817c = f9;
        this.f7818d = f10;
        this.f7819e = i9 / i11;
        this.f7820f = i9 / 400;
        int i12 = i9 / 65;
        this.f7821g = i12;
        int i13 = i12 * 2;
        this.f7822h = i13;
        this.f7823i = new short[i13];
        this.f7824j = new short[i13 * i10];
        this.f7826l = new short[i13 * i10];
        this.f7828n = new short[i13 * i10];
    }

    public static void p(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i15] = (short) (((sArr2[i17] * (i9 - i18)) + (sArr3[i16] * i18)) / i9);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(float f9, int i9) {
        int i10;
        int i11;
        if (this.f7827m == i9) {
            return;
        }
        int i12 = this.f7815a;
        int i13 = (int) (i12 / f9);
        while (true) {
            if (i13 <= 16384 && i12 <= 16384) {
                break;
            }
            i13 /= 2;
            i12 /= 2;
        }
        o(i9);
        int i14 = 0;
        while (true) {
            int i15 = this.f7829o;
            if (i14 >= i15 - 1) {
                u(i15 - 1);
                return;
            }
            while (true) {
                i10 = this.f7830p;
                int i16 = (i10 + 1) * i13;
                i11 = this.f7831q;
                if (i16 <= i11 * i12) {
                    break;
                }
                this.f7826l = f(this.f7826l, this.f7827m, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f7816b;
                    if (i17 < i18) {
                        this.f7826l[(this.f7827m * i18) + i17] = n(this.f7828n, (i18 * i14) + i17, i12, i13);
                        i17++;
                    }
                }
                this.f7831q++;
                this.f7827m++;
            }
            int i19 = i10 + 1;
            this.f7830p = i19;
            if (i19 == i12) {
                this.f7830p = 0;
                AbstractC1684a.g(i11 == i13);
                this.f7831q = 0;
            }
            i14++;
        }
    }

    public final void b(float f9) {
        int iW;
        int i9 = this.f7825k;
        if (i9 < this.f7822h) {
            return;
        }
        int i10 = 0;
        do {
            if (this.f7832r > 0) {
                iW = c(i10);
            } else {
                int iG = g(this.f7824j, i10);
                double d9 = f9;
                short[] sArr = this.f7824j;
                iW = d9 > 1.0d ? iG + w(sArr, i10, f9, iG) : m(sArr, i10, f9, iG);
            }
            i10 += iW;
        } while (this.f7822h + i10 <= i9);
        v(i10);
    }

    public final int c(int i9) {
        int iMin = Math.min(this.f7822h, this.f7832r);
        d(this.f7824j, i9, iMin);
        this.f7832r -= iMin;
        return iMin;
    }

    public final void d(short[] sArr, int i9, int i10) {
        short[] sArrF = f(this.f7826l, this.f7827m, i10);
        this.f7826l = sArrF;
        int i11 = this.f7816b;
        System.arraycopy(sArr, i9 * i11, sArrF, this.f7827m * i11, i11 * i10);
        this.f7827m += i10;
    }

    public final void e(short[] sArr, int i9, int i10) {
        int i11 = this.f7822h / i10;
        int i12 = this.f7816b;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f7823i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] f(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.f7816b;
        int i12 = length / i11;
        return i9 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int g(short[] sArr, int i9) {
        int iH;
        int i10 = this.f7815a;
        int i11 = i10 > 4000 ? i10 / 4000 : 1;
        if (this.f7816b == 1 && i11 == 1) {
            iH = h(sArr, i9, this.f7820f, this.f7821g);
        } else {
            e(sArr, i9, i11);
            int iH2 = h(this.f7823i, 0, this.f7820f / i11, this.f7821g / i11);
            if (i11 != 1) {
                int i12 = iH2 * i11;
                int i13 = i11 * 4;
                int i14 = i12 - i13;
                int i15 = i12 + i13;
                int i16 = this.f7820f;
                if (i14 < i16) {
                    i14 = i16;
                }
                int i17 = this.f7821g;
                if (i15 > i17) {
                    i15 = i17;
                }
                if (this.f7816b == 1) {
                    iH = h(sArr, i9, i14, i15);
                } else {
                    e(sArr, i9, 1);
                    iH = h(this.f7823i, 0, i14, i15);
                }
            } else {
                iH = iH2;
            }
        }
        int i18 = q(this.f7835u, this.f7836v) ? this.f7833s : iH;
        this.f7834t = this.f7835u;
        this.f7833s = iH;
        return i18;
    }

    public final int h(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.f7816b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            if (iAbs * i15 < i14 * i10) {
                i15 = i10;
                i14 = iAbs;
            }
            if (iAbs * i13 > i16 * i10) {
                i13 = i10;
                i16 = iAbs;
            }
            i10++;
        }
        this.f7835u = i14 / i15;
        this.f7836v = i16 / i13;
        return i15;
    }

    public void i() {
        this.f7825k = 0;
        this.f7827m = 0;
        this.f7829o = 0;
        this.f7830p = 0;
        this.f7831q = 0;
        this.f7832r = 0;
        this.f7833s = 0;
        this.f7834t = 0;
        this.f7835u = 0;
        this.f7836v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f7816b, this.f7827m);
        shortBuffer.put(this.f7826l, 0, this.f7816b * iMin);
        int i9 = this.f7827m - iMin;
        this.f7827m = i9;
        short[] sArr = this.f7826l;
        int i10 = this.f7816b;
        System.arraycopy(sArr, iMin * i10, sArr, 0, i9 * i10);
    }

    public int k() {
        return this.f7827m * this.f7816b * 2;
    }

    public int l() {
        return this.f7825k * this.f7816b * 2;
    }

    public final int m(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 < 0.5f) {
            i11 = (int) ((i10 * f9) / (1.0f - f9));
        } else {
            this.f7832r = (int) ((i10 * ((2.0f * f9) - 1.0f)) / (1.0f - f9));
            i11 = i10;
        }
        int i12 = i10 + i11;
        short[] sArrF = f(this.f7826l, this.f7827m, i12);
        this.f7826l = sArrF;
        int i13 = this.f7816b;
        System.arraycopy(sArr, i9 * i13, sArrF, this.f7827m * i13, i13 * i10);
        p(i11, this.f7816b, this.f7826l, this.f7827m + i10, sArr, i9 + i10, sArr, i9);
        this.f7827m += i12;
        return i11;
    }

    public final short n(short[] sArr, int i9, int i10, int i11) {
        short s9 = sArr[i9];
        short s10 = sArr[i9 + this.f7816b];
        int i12 = this.f7831q * i10;
        int i13 = this.f7830p;
        int i14 = i13 * i11;
        int i15 = (i13 + 1) * i11;
        int i16 = i15 - i12;
        int i17 = i15 - i14;
        return (short) (((s9 * i16) + ((i17 - i16) * s10)) / i17);
    }

    public final void o(int i9) {
        int i10 = this.f7827m - i9;
        short[] sArrF = f(this.f7828n, this.f7829o, i10);
        this.f7828n = sArrF;
        short[] sArr = this.f7826l;
        int i11 = this.f7816b;
        System.arraycopy(sArr, i9 * i11, sArrF, this.f7829o * i11, i11 * i10);
        this.f7827m = i9;
        this.f7829o += i10;
    }

    public final boolean q(int i9, int i10) {
        return i9 != 0 && this.f7833s != 0 && i10 <= i9 * 3 && i9 * 2 > this.f7834t * 3;
    }

    public final void r() {
        int i9 = this.f7827m;
        float f9 = this.f7817c;
        float f10 = this.f7818d;
        float f11 = f9 / f10;
        float f12 = this.f7819e * f10;
        double d9 = f11;
        if (d9 > 1.00001d || d9 < 0.99999d) {
            b(f11);
        } else {
            d(this.f7824j, 0, this.f7825k);
            this.f7825k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i9);
        }
    }

    public void s() {
        int i9;
        int i10 = this.f7825k;
        float f9 = this.f7817c;
        float f10 = this.f7818d;
        int i11 = this.f7827m + ((int) ((((i10 / (f9 / f10)) + this.f7829o) / (this.f7819e * f10)) + 0.5f));
        this.f7824j = f(this.f7824j, i10, (this.f7822h * 2) + i10);
        int i12 = 0;
        while (true) {
            i9 = this.f7822h;
            int i13 = this.f7816b;
            if (i12 >= i9 * 2 * i13) {
                break;
            }
            this.f7824j[(i13 * i10) + i12] = 0;
            i12++;
        }
        this.f7825k += i9 * 2;
        r();
        if (this.f7827m > i11) {
            this.f7827m = i11;
        }
        this.f7825k = 0;
        this.f7832r = 0;
        this.f7829o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i9 = this.f7816b;
        int i10 = iRemaining / i9;
        short[] sArrF = f(this.f7824j, this.f7825k, i10);
        this.f7824j = sArrF;
        shortBuffer.get(sArrF, this.f7825k * this.f7816b, ((i9 * i10) * 2) / 2);
        this.f7825k += i10;
        r();
    }

    public final void u(int i9) {
        if (i9 == 0) {
            return;
        }
        short[] sArr = this.f7828n;
        int i10 = this.f7816b;
        System.arraycopy(sArr, i9 * i10, sArr, 0, (this.f7829o - i9) * i10);
        this.f7829o -= i9;
    }

    public final void v(int i9) {
        int i10 = this.f7825k - i9;
        short[] sArr = this.f7824j;
        int i11 = this.f7816b;
        System.arraycopy(sArr, i9 * i11, sArr, 0, i11 * i10);
        this.f7825k = i10;
    }

    public final int w(short[] sArr, int i9, float f9, int i10) {
        int i11;
        if (f9 >= 2.0f) {
            i11 = (int) (i10 / (f9 - 1.0f));
        } else {
            this.f7832r = (int) ((i10 * (2.0f - f9)) / (f9 - 1.0f));
            i11 = i10;
        }
        short[] sArrF = f(this.f7826l, this.f7827m, i11);
        this.f7826l = sArrF;
        p(i11, this.f7816b, sArrF, this.f7827m, sArr, i9, sArr, i9 + i10);
        this.f7827m += i11;
        return i11;
    }
}
