package com.amplifyframework.geo.models;

import O.c;

/* JADX INFO: loaded from: classes.dex */
public final class Coordinates implements Geometry {
    private double latitude;
    private double longitude;

    public Coordinates() {
        this(0.0d, 0.0d);
    }

    public Coordinates(double d9, double d10) {
        this.latitude = d9;
        this.longitude = d10;
    }

    public double centralAngle(Coordinates coordinates) {
        double radians = Math.toRadians(this.latitude - coordinates.latitude);
        double d9 = radians / 2.0d;
        double radians2 = Math.toRadians(this.longitude - coordinates.longitude) / 2.0d;
        double dSin = (Math.sin(d9) * Math.sin(d9)) + (Math.sin(radians2) * Math.sin(radians2) * Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(coordinates.latitude)));
        return Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Coordinates.class != obj.getClass()) {
            return false;
        }
        Coordinates coordinates = (Coordinates) obj;
        return c.a(Double.valueOf(this.latitude), Double.valueOf(coordinates.latitude)) && c.a(Double.valueOf(this.longitude), Double.valueOf(coordinates.longitude));
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return c.b(Double.valueOf(this.latitude), Double.valueOf(this.longitude));
    }

    public void setLatitude(double d9) {
        this.latitude = d9;
    }

    public void setLongitude(double d9) {
        this.longitude = d9;
    }

    public String toString() {
        return "Coordinates{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
    }
}
