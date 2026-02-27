package org.achartengine.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class Point implements Serializable {
    private float mX;
    private float mY;

    public Point() {
    }

    public Point(float f9, float f10) {
        this.mX = f9;
        this.mY = f10;
    }

    public float getX() {
        return this.mX;
    }

    public float getY() {
        return this.mY;
    }

    public void setX(float f9) {
        this.mX = f9;
    }

    public void setY(float f9) {
        this.mY = f9;
    }
}
