package B6;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z6.h f674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z6.i f675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Sensor f676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f678e = new Handler();

    public b(Context context, Z6.h hVar, Z6.i iVar) {
        this.f677d = context;
        this.f674a = hVar;
        this.f675b = iVar;
    }

    public final /* synthetic */ void b(boolean z9) {
        this.f674a.t(z9);
    }

    public final void c(final boolean z9) {
        this.f678e.post(new Runnable() { // from class: B6.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f672a.b(z9);
            }
        });
    }

    public void d() {
        if (this.f675b.d()) {
            SensorManager sensorManager = (SensorManager) this.f677d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f676c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void e() {
        if (this.f676c != null) {
            ((SensorManager) this.f677d.getSystemService("sensor")).unregisterListener(this);
            this.f676c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i9) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f9 = sensorEvent.values[0];
        if (this.f674a != null) {
            if (f9 <= 45.0f) {
                c(true);
            } else if (f9 >= 450.0f) {
                c(false);
            }
        }
    }
}
