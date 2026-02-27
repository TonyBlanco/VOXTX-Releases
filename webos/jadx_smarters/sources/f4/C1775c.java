package f4;

import android.opengl.Matrix;
import d4.AbstractC1704v;
import d4.Y;

/* JADX INFO: renamed from: f4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1775c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f40612a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f40613b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y f40614c = new Y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40615d;

    public static void a(float[] fArr, float[] fArr2) {
        AbstractC1704v.j(fArr);
        float f9 = fArr2[10];
        float f10 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f9 * f9) + (f10 * f10));
        float f11 = fArr2[10];
        fArr[0] = f11 / fSqrt;
        float f12 = fArr2[8];
        fArr[2] = f12 / fSqrt;
        fArr[8] = (-f12) / fSqrt;
        fArr[10] = f11 / fSqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f9 = fArr2[0];
        float f10 = -fArr2[1];
        float f11 = -fArr2[2];
        float length = Matrix.length(f9, f10, f11);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f9 / length, f10 / length, f11 / length);
        } else {
            AbstractC1704v.j(fArr);
        }
    }

    public boolean c(float[] fArr, long j9) {
        float[] fArr2 = (float[]) this.f40614c.j(j9);
        if (fArr2 == null) {
            return false;
        }
        b(this.f40613b, fArr2);
        if (!this.f40615d) {
            a(this.f40612a, this.f40613b);
            this.f40615d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f40612a, 0, this.f40613b, 0);
        return true;
    }

    public void d() {
        this.f40614c.c();
        this.f40615d = false;
    }

    public void e(long j9, float[] fArr) {
        this.f40614c.a(j9, fArr);
    }
}
