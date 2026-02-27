package D6;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1490i;

    public k(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f1482a = f9;
        this.f1483b = f12;
        this.f1484c = f15;
        this.f1485d = f10;
        this.f1486e = f13;
        this.f1487f = f16;
        this.f1488g = f11;
        this.f1489h = f14;
        this.f1490i = f17;
    }

    public static k b(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        return d(f17, f18, f19, f20, f21, f22, f23, f24).e(c(f9, f10, f11, f12, f13, f14, f15, f16));
    }

    public static k c(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return d(f9, f10, f11, f12, f13, f14, f15, f16).a();
    }

    public static k d(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f9 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new k(f11 - f9, f13 - f11, f9, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float f24 = ((f22 * f17) - (f20 * f18)) / f23;
        float f25 = ((f19 * f18) - (f17 * f21)) / f23;
        return new k((f24 * f11) + (f11 - f9), (f25 * f15) + (f15 - f9), f9, (f12 - f10) + (f24 * f12), (f16 - f10) + (f25 * f16), f10, f24, f25, 1.0f);
    }

    public k a() {
        float f9 = this.f1486e;
        float f10 = this.f1490i;
        float f11 = this.f1487f;
        float f12 = this.f1489h;
        float f13 = (f9 * f10) - (f11 * f12);
        float f14 = this.f1488g;
        float f15 = this.f1485d;
        float f16 = (f11 * f14) - (f15 * f10);
        float f17 = (f15 * f12) - (f9 * f14);
        float f18 = this.f1484c;
        float f19 = this.f1483b;
        float f20 = (f18 * f12) - (f19 * f10);
        float f21 = this.f1482a;
        return new k(f13, f16, f17, f20, (f10 * f21) - (f18 * f14), (f14 * f19) - (f12 * f21), (f19 * f11) - (f18 * f9), (f18 * f15) - (f11 * f21), (f21 * f9) - (f19 * f15));
    }

    public k e(k kVar) {
        float f9 = this.f1482a;
        float f10 = kVar.f1482a;
        float f11 = this.f1485d;
        float f12 = kVar.f1483b;
        float f13 = this.f1488g;
        float f14 = kVar.f1484c;
        float f15 = (f9 * f10) + (f11 * f12) + (f13 * f14);
        float f16 = kVar.f1485d;
        float f17 = kVar.f1486e;
        float f18 = kVar.f1487f;
        float f19 = (f9 * f16) + (f11 * f17) + (f13 * f18);
        float f20 = kVar.f1488g;
        float f21 = kVar.f1489h;
        float f22 = kVar.f1490i;
        float f23 = (f9 * f20) + (f11 * f21) + (f13 * f22);
        float f24 = this.f1483b;
        float f25 = this.f1486e;
        float f26 = this.f1489h;
        float f27 = (f24 * f10) + (f25 * f12) + (f26 * f14);
        float f28 = (f24 * f16) + (f25 * f17) + (f26 * f18);
        float f29 = (f26 * f22) + (f24 * f20) + (f25 * f21);
        float f30 = this.f1484c;
        float f31 = this.f1487f;
        float f32 = (f10 * f30) + (f12 * f31);
        float f33 = this.f1490i;
        return new k(f15, f19, f23, f27, f28, f29, (f14 * f33) + f32, (f16 * f30) + (f17 * f31) + (f18 * f33), (f30 * f20) + (f31 * f21) + (f33 * f22));
    }

    public void f(float[] fArr) {
        float f9 = this.f1482a;
        float f10 = this.f1483b;
        float f11 = this.f1484c;
        float f12 = this.f1485d;
        float f13 = this.f1486e;
        float f14 = this.f1487f;
        float f15 = this.f1488g;
        float f16 = this.f1489h;
        float f17 = this.f1490i;
        int length = fArr.length - 1;
        for (int i9 = 0; i9 < length; i9 += 2) {
            float f18 = fArr[i9];
            int i10 = i9 + 1;
            float f19 = fArr[i10];
            float f20 = (f11 * f18) + (f14 * f19) + f17;
            fArr[i9] = (((f9 * f18) + (f12 * f19)) + f15) / f20;
            fArr[i10] = (((f18 * f10) + (f19 * f13)) + f16) / f20;
        }
    }
}
