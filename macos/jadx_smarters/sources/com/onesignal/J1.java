package com.onesignal;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes4.dex */
public class J1 implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f38336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f38337b;

    public J1(double d9, double d10) {
        this.f38336a = d9;
        this.f38337b = d10;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f9) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f9)) / this.f38336a) * (-1.0d) * Math.cos(this.f38337b * ((double) f9))) + 1.0d);
    }
}
