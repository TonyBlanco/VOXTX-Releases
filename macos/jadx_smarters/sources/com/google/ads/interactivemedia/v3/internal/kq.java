package com.google.ads.interactivemedia.v3.internal;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class kq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f23532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f23533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f23534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f23536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f23538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private short[] f23539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private short[] f23541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private short[] f23543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f23549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f23550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f23551v;

    public kq(int i9, int i10, float f9, float f10, int i11) {
        this.f23530a = i9;
        this.f23531b = i10;
        this.f23532c = f9;
        this.f23533d = f10;
        this.f23534e = i9 / i11;
        this.f23535f = i9 / 400;
        int i12 = i9 / 65;
        this.f23536g = i12;
        int i13 = i12 + i12;
        this.f23537h = i13;
        this.f23538i = new short[i13];
        int i14 = i13 * i10;
        this.f23539j = new short[i14];
        this.f23541l = new short[i14];
        this.f23543n = new short[i14];
    }

    private final int g(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.f23531b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            int i18 = iAbs * i15;
            int i19 = i14 * i10;
            if (i18 < i19) {
                i14 = iAbs;
            }
            if (i18 < i19) {
                i15 = i10;
            }
            int i20 = iAbs * i13;
            int i21 = i16 * i10;
            if (i20 > i21) {
                i16 = iAbs;
            }
            if (i20 > i21) {
                i13 = i10;
            }
            i10++;
        }
        this.f23550u = i14 / i15;
        this.f23551v = i16 / i13;
        return i15;
    }

    private final void h(short[] sArr, int i9, int i10) {
        short[] sArrL = l(this.f23541l, this.f23542m, i10);
        this.f23541l = sArrL;
        int i11 = this.f23531b;
        System.arraycopy(sArr, i9 * i11, sArrL, this.f23542m * i11, i11 * i10);
        this.f23542m += i10;
    }

    private final void i(short[] sArr, int i9, int i10) {
        int i11 = this.f23537h / i10;
        int i12 = this.f23531b;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f23538i[i15] = (short) (i16 / i13);
        }
    }

    private static void j(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
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

    private final void k() {
        int iG;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f23542m;
        float f9 = this.f23532c;
        float f10 = this.f23533d;
        float f11 = f9 / f10;
        float f12 = this.f23534e * f10;
        double d9 = f11;
        float f13 = 1.0f;
        int i17 = 1;
        if (d9 > 1.00001d || d9 < 0.99999d) {
            int i18 = this.f23540k;
            if (i18 >= this.f23537h) {
                int i19 = 0;
                while (true) {
                    int i20 = this.f23547r;
                    if (i20 > 0) {
                        int iMin = Math.min(this.f23537h, i20);
                        h(this.f23539j, i19, iMin);
                        this.f23547r -= iMin;
                        i19 += iMin;
                    } else {
                        short[] sArr = this.f23539j;
                        int i21 = this.f23530a;
                        int i22 = i21 > 4000 ? i21 / 4000 : 1;
                        if (this.f23531b == i17 && i22 == i17) {
                            iG = g(sArr, i19, this.f23535f, this.f23536g);
                        } else {
                            i(sArr, i19, i22);
                            int iG2 = g(this.f23538i, 0, this.f23535f / i22, this.f23536g / i22);
                            if (i22 != i17) {
                                int i23 = iG2 * i22;
                                int i24 = i22 * 4;
                                int i25 = i23 - i24;
                                int i26 = i23 + i24;
                                int i27 = this.f23535f;
                                if (i25 < i27) {
                                    i25 = i27;
                                }
                                int i28 = this.f23536g;
                                if (i26 > i28) {
                                    i26 = i28;
                                }
                                if (this.f23531b == i17) {
                                    iG = g(sArr, i19, i25, i26);
                                } else {
                                    i(sArr, i19, i17);
                                    iG = g(this.f23538i, 0, i25, i26);
                                }
                            } else {
                                iG = iG2;
                            }
                        }
                        int i29 = this.f23550u;
                        int i30 = (i29 == 0 || (i11 = this.f23548s) == 0 || this.f23551v > i29 * 3 || i29 + i29 <= this.f23549t * 3) ? iG : i11;
                        this.f23549t = i29;
                        this.f23548s = iG;
                        if (d9 > 1.0d) {
                            short[] sArr2 = this.f23539j;
                            if (f11 >= 2.0f) {
                                i10 = (int) (i30 / ((-1.0f) + f11));
                            } else {
                                this.f23547r = (int) ((i30 * (2.0f - f11)) / ((-1.0f) + f11));
                                i10 = i30;
                            }
                            short[] sArrL = l(this.f23541l, this.f23542m, i10);
                            this.f23541l = sArrL;
                            int i31 = i10;
                            j(i10, this.f23531b, sArrL, this.f23542m, sArr2, i19, sArr2, i19 + i30);
                            this.f23542m += i31;
                            i19 += i30 + i31;
                        } else {
                            int i32 = i30;
                            short[] sArr3 = this.f23539j;
                            if (f11 < 0.5f) {
                                i9 = (int) ((i32 * f11) / (f13 - f11));
                            } else {
                                this.f23547r = (int) ((i32 * ((f11 + f11) - 1.0f)) / (f13 - f11));
                                i9 = i32;
                            }
                            int i33 = i32 + i9;
                            short[] sArrL2 = l(this.f23541l, this.f23542m, i33);
                            this.f23541l = sArrL2;
                            int i34 = this.f23531b;
                            System.arraycopy(sArr3, i19 * i34, sArrL2, this.f23542m * i34, i34 * i32);
                            j(i9, this.f23531b, this.f23541l, this.f23542m + i32, sArr3, i19 + i32, sArr3, i19);
                            this.f23542m += i33;
                            i19 += i9;
                        }
                    }
                    if (this.f23537h + i19 > i18) {
                        break;
                    }
                    f13 = 1.0f;
                    i17 = 1;
                }
                int i35 = this.f23540k - i19;
                short[] sArr4 = this.f23539j;
                int i36 = this.f23531b;
                System.arraycopy(sArr4, i19 * i36, sArr4, 0, i36 * i35);
                this.f23540k = i35;
                f13 = 1.0f;
            }
        } else {
            h(this.f23539j, 0, this.f23540k);
            this.f23540k = 0;
        }
        if (f12 == f13 || this.f23542m == i16) {
            return;
        }
        int i37 = this.f23530a;
        int i38 = (int) (i37 / f12);
        while (true) {
            if (i38 <= 16384 && i37 <= 16384) {
                break;
            }
            i38 /= 2;
            i37 /= 2;
        }
        int i39 = this.f23542m - i16;
        short[] sArrL3 = l(this.f23543n, this.f23544o, i39);
        this.f23543n = sArrL3;
        short[] sArr5 = this.f23541l;
        int i40 = this.f23531b;
        System.arraycopy(sArr5, i16 * i40, sArrL3, this.f23544o * i40, i40 * i39);
        this.f23542m = i16;
        this.f23544o += i39;
        int i41 = 0;
        while (true) {
            i12 = this.f23544o;
            i13 = i12 - 1;
            if (i41 >= i13) {
                break;
            }
            while (true) {
                i14 = this.f23545p + 1;
                i15 = this.f23546q;
                if (i14 * i38 <= i15 * i37) {
                    break;
                }
                this.f23541l = l(this.f23541l, this.f23542m, 1);
                int i42 = 0;
                while (true) {
                    int i43 = this.f23531b;
                    if (i42 < i43) {
                        short[] sArr6 = this.f23541l;
                        int i44 = this.f23542m;
                        short[] sArr7 = this.f23543n;
                        int i45 = (i41 * i43) + i42;
                        short s9 = sArr7[i45];
                        short s10 = sArr7[i45 + i43];
                        int i46 = this.f23546q;
                        int i47 = this.f23545p;
                        int i48 = (i47 + 1) * i38;
                        int i49 = i48 - (i46 * i37);
                        int i50 = i48 - (i47 * i38);
                        sArr6[(i44 * i43) + i42] = (short) (((s9 * i49) + ((i50 - i49) * s10)) / i50);
                        i42++;
                    }
                }
                this.f23546q++;
                this.f23542m++;
            }
            this.f23545p = i14;
            if (i14 == i37) {
                this.f23545p = 0;
                af.w(i15 == i38);
                this.f23546q = 0;
            }
            i41++;
        }
        if (i13 != 0) {
            short[] sArr8 = this.f23543n;
            int i51 = this.f23531b;
            System.arraycopy(sArr8, i13 * i51, sArr8, 0, (i12 - i13) * i51);
            this.f23544o -= i13;
        }
    }

    private final short[] l(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.f23531b;
        int i12 = length / i11;
        return i9 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int a() {
        int i9 = this.f23542m * this.f23531b;
        return i9 + i9;
    }

    public final int b() {
        int i9 = this.f23540k * this.f23531b;
        return i9 + i9;
    }

    public final void c() {
        this.f23540k = 0;
        this.f23542m = 0;
        this.f23544o = 0;
        this.f23545p = 0;
        this.f23546q = 0;
        this.f23547r = 0;
        this.f23548s = 0;
        this.f23549t = 0;
        this.f23550u = 0;
        this.f23551v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f23531b, this.f23542m);
        shortBuffer.put(this.f23541l, 0, this.f23531b * iMin);
        int i9 = this.f23542m - iMin;
        this.f23542m = i9;
        short[] sArr = this.f23541l;
        int i10 = this.f23531b;
        System.arraycopy(sArr, iMin * i10, sArr, 0, i9 * i10);
    }

    public final void e() {
        int i9;
        int i10 = this.f23540k;
        float f9 = this.f23532c;
        float f10 = this.f23533d;
        int i11 = this.f23542m + ((int) ((((i10 / (f9 / f10)) + this.f23544o) / (this.f23534e * f10)) + 0.5f));
        short[] sArr = this.f23539j;
        int i12 = this.f23537h;
        this.f23539j = l(sArr, i10, i12 + i12 + i10);
        int i13 = 0;
        while (true) {
            int i14 = this.f23537h;
            i9 = i14 + i14;
            int i15 = this.f23531b;
            if (i13 >= i9 * i15) {
                break;
            }
            this.f23539j[(i15 * i10) + i13] = 0;
            i13++;
        }
        this.f23540k += i9;
        k();
        if (this.f23542m > i11) {
            this.f23542m = i11;
        }
        this.f23540k = 0;
        this.f23547r = 0;
        this.f23544o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i9 = this.f23531b;
        int i10 = iRemaining / i9;
        int i11 = i9 * i10;
        short[] sArrL = l(this.f23539j, this.f23540k, i10);
        this.f23539j = sArrL;
        shortBuffer.get(sArrL, this.f23540k * this.f23531b, (i11 + i11) / 2);
        this.f23540k += i10;
        k();
    }
}
