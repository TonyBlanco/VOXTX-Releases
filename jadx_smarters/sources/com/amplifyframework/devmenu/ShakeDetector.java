package com.amplifyframework.devmenu;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.amplifyframework.util.Time;

/* JADX INFO: loaded from: classes.dex */
public final class ShakeDetector {
    private static final double SHAKE_THRESHOLD = 13.042844772338867d;
    private static final int SHAKE_TIME = 1000;
    private Sensor accelerometer;
    private final Listener listener;
    private final SensorEventListener sensorEventListener = new SensorEventListener() { // from class: com.amplifyframework.devmenu.ShakeDetector.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i9) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            if (Math.sqrt((f9 * f9) + (f10 * f10) + (f11 * f11)) > ShakeDetector.SHAKE_THRESHOLD) {
                long jNow = Time.now();
                if (ShakeDetector.this.shakeStart == 0) {
                    ShakeDetector.this.shakeStart = jNow;
                } else if (jNow - ShakeDetector.this.shakeStart > 1000) {
                    ShakeDetector.this.listener.onShakeDetected();
                    ShakeDetector.this.shakeStart = 0L;
                }
            }
        }
    };
    private SensorManager sensorManager;
    private long shakeStart;

    public interface Listener {
        void onShakeDetected();
    }

    public ShakeDetector(Context context, Listener listener) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        if (sensorManager != null) {
            this.accelerometer = sensorManager.getDefaultSensor(1);
        }
        this.listener = listener;
        this.shakeStart = 0L;
    }

    public void startDetecting() {
        Sensor sensor = this.accelerometer;
        if (sensor != null) {
            this.sensorManager.registerListener(this.sensorEventListener, sensor, 3);
        }
    }

    public void stopDetecting() {
        if (this.accelerometer != null) {
            this.sensorManager.unregisterListener(this.sensorEventListener);
        }
    }
}
