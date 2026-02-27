package F;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1749i;

    public a(float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f1741a = f9;
        this.f1742b = f10;
        this.f1743c = f11;
        this.f1744d = f12;
        this.f1745e = f13;
        this.f1746f = f14;
        this.f1747g = f15;
        this.f1748h = f16;
        this.f1749i = f17;
    }

    public static a b(float f9, float f10, float f11) {
        float f12 = 100.0f;
        float f13 = 1000.0f;
        a aVar = null;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        while (Math.abs(f15 - f12) > 0.01f) {
            float f16 = ((f12 - f15) / 2.0f) + f15;
            int iP = e(f16, f10, f9).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f11 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f9));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f13 = fAbs;
                    f14 = fA;
                }
            }
            if (f13 == 0.0f && f14 == 0.0f) {
                break;
            }
            if (fB < f11) {
                f15 = f16;
            } else {
                f12 = f16;
            }
        }
        return aVar;
    }

    public static a c(int i9) {
        return d(i9, l.f1786k);
    }

    public static a d(int i9, l lVar) {
        float[] fArrF = b.f(i9);
        float[][] fArr = b.f1750a;
        float f9 = fArrF[0];
        float[] fArr2 = fArr[0];
        float f10 = fArr2[0] * f9;
        float f11 = fArrF[1];
        float f12 = f10 + (fArr2[1] * f11);
        float f13 = fArrF[2];
        float f14 = f12 + (fArr2[2] * f13);
        float[] fArr3 = fArr[1];
        float f15 = (fArr3[0] * f9) + (fArr3[1] * f11) + (fArr3[2] * f13);
        float[] fArr4 = fArr[2];
        float f16 = (f9 * fArr4[0]) + (f11 * fArr4[1]) + (f13 * fArr4[2]);
        float f17 = lVar.i()[0] * f14;
        float f18 = lVar.i()[1] * f15;
        float f19 = lVar.i()[2] * f16;
        float fPow = (float) Math.pow(((double) (lVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f18))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f19))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f17) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f18) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f19) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d9 = fSignum3;
        float f20 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d9)) / 11.0f;
        float f21 = ((float) (((double) (fSignum + fSignum2)) - (d9 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = (((fSignum * 20.0f) + f22) + (21.0f * fSignum3)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float fPow4 = ((float) Math.pow((f24 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fD = lVar.d() * (4.0f / lVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f25) < 20.14d ? 360.0f + f25 : f25)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f20 * f20) + (f21 * f21)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fD2 = fPow5 * lVar.d();
        float fSqrt = ((float) Math.sqrt((r3 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f27 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD2) + 1.0f)) * 43.85965f;
        double d10 = f26;
        return new a(f25, fPow5, fPow4, fD, fD2, fSqrt, f27, fLog * ((float) Math.cos(d10)), fLog * ((float) Math.sin(d10)));
    }

    public static a e(float f9, float f10, float f11) {
        return f(f9, f10, f11, l.f1786k);
    }

    public static a f(float f9, float f10, float f11, l lVar) {
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(((double) f9) / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = f10 * lVar.d();
        float fSqrt = ((float) Math.sqrt(((f10 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f12 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, fB, fD, fSqrt, f12, fLog * ((float) Math.cos(d9)), fLog * ((float) Math.sin(d9)));
    }

    public static int m(float f9, float f10, float f11) {
        return n(f9, f10, f11, l.f1786k);
    }

    public static int n(float f9, float f10, float f11, l lVar) {
        if (f10 < 1.0d || Math.round(f11) <= 0.0d || Math.round(f11) >= 100.0d) {
            return b.a(f11);
        }
        float fMin = f9 < 0.0f ? 0.0f : Math.min(360.0f, f9);
        float f12 = f10;
        a aVar = null;
        float f13 = 0.0f;
        boolean z9 = true;
        while (Math.abs(f13 - f10) >= 0.4f) {
            a aVarB = b(fMin, f12, f11);
            if (!z9) {
                if (aVarB == null) {
                    f10 = f12;
                } else {
                    f13 = f12;
                    aVar = aVarB;
                }
                f12 = ((f10 - f13) / 2.0f) + f13;
            } else {
                if (aVarB != null) {
                    return aVarB.o(lVar);
                }
                f12 = ((f10 - f13) / 2.0f) + f13;
                z9 = false;
            }
        }
        return aVar == null ? b.a(f11) : aVar.o(lVar);
    }

    public float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.f1748h;
    }

    public float h() {
        return this.f1749i;
    }

    public float i() {
        return this.f1742b;
    }

    public float j() {
        return this.f1741a;
    }

    public float k() {
        return this.f1743c;
    }

    public float l() {
        return this.f1747g;
    }

    public int o(l lVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f9 = fA / lVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f10 = (((0.305f + f9) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = f9 * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float fSignum = Math.signum(f14) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f14)) * 27.13d) / (400.0d - ((double) Math.abs(f14)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f15) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f16 = fSignum / lVar.i()[0];
        float f17 = fSignum2 / lVar.i()[1];
        float f18 = fSignum3 / lVar.i()[2];
        float[][] fArr = b.f1751b;
        float[] fArr2 = fArr[0];
        float f19 = (fArr2[0] * f16) + (fArr2[1] * f17) + (fArr2[2] * f18);
        float[] fArr3 = fArr[1];
        float f20 = (fArr3[0] * f16) + (fArr3[1] * f17) + (fArr3[2] * f18);
        float[] fArr4 = fArr[2];
        return G.a.c(f19, f20, (f16 * fArr4[0]) + (f17 * fArr4[1]) + (f18 * fArr4[2]));
    }

    public int p() {
        return o(l.f1786k);
    }
}
