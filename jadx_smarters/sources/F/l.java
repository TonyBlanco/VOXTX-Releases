package F;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f1786k = k(b.f1752c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f1793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1796j;

    public l(float f9, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f1792f = f9;
        this.f1787a = f10;
        this.f1788b = f11;
        this.f1789c = f12;
        this.f1790d = f13;
        this.f1791e = f14;
        this.f1793g = fArr;
        this.f1794h = f15;
        this.f1795i = f16;
        this.f1796j = f17;
    }

    public static l k(float[] fArr, float f9, float f10, float f11, boolean z9) {
        float[][] fArr2 = b.f1750a;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = f13 + (fArr3[1] * f14);
        float f16 = fArr[2];
        float f17 = f15 + (fArr3[2] * f16);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[0] * f12) + (fArr4[1] * f14) + (fArr4[2] * f16);
        float[] fArr5 = fArr2[2];
        float f19 = (f12 * fArr5[0]) + (f14 * fArr5[1]) + (f16 * fArr5[2]);
        float f20 = (f11 / 10.0f) + 0.8f;
        float fD = ((double) f20) >= 0.9d ? b.d(0.59f, 0.69f, (f20 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f20 - 0.8f) * 10.0f);
        float fExp = z9 ? 1.0f : (1.0f - (((float) Math.exp(((-f9) - 42.0f) / 92.0f)) * 0.2777778f)) * f20;
        double d9 = fExp;
        if (d9 > 1.0d) {
            fExp = 1.0f;
        } else if (d9 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp};
        float f21 = 1.0f / ((5.0f * f9) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float fCbrt = (f22 * f9) + (0.1f * f23 * f23 * ((float) Math.cbrt(((double) f9) * 5.0d)));
        float fH = b.h(f10) / fArr[1];
        double d10 = fH;
        float fSqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f17)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f19)) / 100.0d, 0.42d)};
        float f24 = fArr7[0];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[1];
        float f27 = (f26 * 400.0f) / (f26 + 27.13f);
        float f28 = fArr7[2];
        float[] fArr8 = {f25, f27, (400.0f * f28) / (f28 + 27.13f)};
        return new l(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f20, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float a() {
        return this.f1787a;
    }

    public float b() {
        return this.f1790d;
    }

    public float c() {
        return this.f1794h;
    }

    public float d() {
        return this.f1795i;
    }

    public float e() {
        return this.f1792f;
    }

    public float f() {
        return this.f1788b;
    }

    public float g() {
        return this.f1791e;
    }

    public float h() {
        return this.f1789c;
    }

    public float[] i() {
        return this.f1793g;
    }

    public float j() {
        return this.f1796j;
    }
}
