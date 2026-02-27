package f4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f40616a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f40617b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f40618c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f40619d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f40620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a[] f40621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f40622g;

    public interface a {
        void a(float[] fArr, float f9);
    }

    public d(Display display, a... aVarArr) {
        this.f40620e = display;
        this.f40621f = aVarArr;
    }

    public static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f40617b);
        SensorManager.getOrientation(this.f40617b, this.f40619d);
        return this.f40619d[2];
    }

    public final void b(float[] fArr, float f9) {
        for (a aVar : this.f40621f) {
            aVar.a(fArr, f9);
        }
    }

    public final void c(float[] fArr) {
        if (!this.f40622g) {
            C1775c.a(this.f40618c, fArr);
            this.f40622g = true;
        }
        float[] fArr2 = this.f40617b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f40617b, 0, this.f40618c, 0);
    }

    public final void d(float[] fArr, int i9) {
        if (i9 != 0) {
            int i10 = 129;
            int i11 = 1;
            if (i9 == 1) {
                i10 = 2;
                i11 = 129;
            } else if (i9 == 2) {
                i11 = 130;
            } else {
                if (i9 != 3) {
                    throw new IllegalStateException();
                }
                i10 = 130;
            }
            float[] fArr2 = this.f40617b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f40617b, i10, i11, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f40616a, sensorEvent.values);
        d(this.f40616a, this.f40620e.getRotation());
        float fA = a(this.f40616a);
        e(this.f40616a);
        c(this.f40616a);
        b(this.f40616a, fA);
    }
}
