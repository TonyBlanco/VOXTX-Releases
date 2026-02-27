package com.amplifyframework.predictions.models;

/* JADX INFO: loaded from: classes.dex */
public final class Pose {
    private final double pitch;
    private final double roll;
    private final double yaw;

    public Pose(double d9, double d10, double d11) {
        this.pitch = d9;
        this.roll = d10;
        this.yaw = d11;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getRoll() {
        return this.roll;
    }

    public double getYaw() {
        return this.yaw;
    }
}
