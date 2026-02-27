package f4;

import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f40623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f40624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40626d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b[] f40627a;

        public a(b... bVarArr) {
            this.f40627a = bVarArr;
        }

        public b a(int i9) {
            return this.f40627a[i9];
        }

        public int b() {
            return this.f40627a.length;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f40630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f40631d;

        public b(int i9, float[] fArr, float[] fArr2, int i10) {
            this.f40628a = i9;
            AbstractC1684a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f40630c = fArr;
            this.f40631d = fArr2;
            this.f40629b = i10;
        }

        public int a() {
            return this.f40630c.length / 3;
        }
    }

    public e(a aVar, int i9) {
        this(aVar, aVar, i9);
    }

    public e(a aVar, a aVar2, int i9) {
        this.f40623a = aVar;
        this.f40624b = aVar2;
        this.f40625c = i9;
        this.f40626d = aVar == aVar2;
    }

    public static e a(float f9, int i9, int i10, float f10, float f11, int i11) {
        int i12;
        float f12;
        float f13;
        int i13;
        int i14;
        int i15 = i9;
        AbstractC1684a.a(f9 > 0.0f);
        AbstractC1684a.a(i15 >= 1);
        AbstractC1684a.a(i10 >= 1);
        AbstractC1684a.a(f10 > 0.0f && f10 <= 180.0f);
        AbstractC1684a.a(f11 > 0.0f && f11 <= 360.0f);
        float radians = (float) Math.toRadians(f10);
        float radians2 = (float) Math.toRadians(f11);
        float f14 = radians / i15;
        float f15 = radians2 / i10;
        int i16 = i10 + 1;
        int i17 = ((i16 * 2) + 2) * i15;
        float[] fArr = new float[i17 * 3];
        float[] fArr2 = new float[i17 * 2];
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i18 < i15) {
            float f16 = radians / 2.0f;
            float f17 = (i18 * f14) - f16;
            int i21 = i18 + 1;
            float f18 = (i21 * f14) - f16;
            int i22 = 0;
            while (true) {
                i12 = i21;
                if (i22 < i16) {
                    float f19 = f17;
                    int i23 = i20;
                    int i24 = 0;
                    while (i24 < 2) {
                        if (i24 == 0) {
                            f12 = f19;
                            f13 = f18;
                        } else {
                            f12 = f18;
                            f13 = f12;
                        }
                        float f20 = i22 * f15;
                        float f21 = f15;
                        float f22 = radians;
                        double d9 = f9;
                        int i25 = i16;
                        double d10 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                        int i26 = i22;
                        double d11 = f12;
                        float f23 = radians2;
                        int i27 = i24;
                        fArr[i19] = -((float) (Math.sin(d10) * d9 * Math.cos(d11)));
                        float f24 = f14;
                        fArr[i19 + 1] = (float) (d9 * Math.sin(d11));
                        int i28 = i19 + 3;
                        fArr[i19 + 2] = (float) (d9 * Math.cos(d10) * Math.cos(d11));
                        fArr2[i23] = f20 / f23;
                        int i29 = i23 + 2;
                        fArr2[i23 + 1] = ((i18 + i27) * f24) / f22;
                        if (i26 == 0 && i27 == 0) {
                            i14 = i27;
                            i13 = i26;
                        } else {
                            i13 = i26;
                            i14 = i27;
                            if (i13 != i10 || i14 != 1) {
                                i23 = i29;
                                i19 = i28;
                            }
                            i22 = i13;
                            f14 = f24;
                            i24 = i14 + 1;
                            f18 = f13;
                            f15 = f21;
                            radians = f22;
                            i16 = i25;
                            radians2 = f23;
                        }
                        System.arraycopy(fArr, i19, fArr, i28, 3);
                        i19 += 6;
                        System.arraycopy(fArr2, i23, fArr2, i29, 2);
                        i23 += 4;
                        i22 = i13;
                        f14 = f24;
                        i24 = i14 + 1;
                        f18 = f13;
                        f15 = f21;
                        radians = f22;
                        i16 = i25;
                        radians2 = f23;
                    }
                    i21 = i12;
                    f17 = f19;
                    i20 = i23;
                    i22++;
                    f18 = f18;
                    radians = radians;
                    radians2 = radians2;
                }
            }
            i15 = i9;
            i18 = i12;
        }
        return new e(new a(new b(0, fArr, fArr2, 1)), i11);
    }

    public static e b(int i9) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i9);
    }
}
