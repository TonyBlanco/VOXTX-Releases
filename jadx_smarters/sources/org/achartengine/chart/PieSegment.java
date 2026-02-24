package org.achartengine.chart;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class PieSegment implements Serializable {
    private int mDataIndex;
    private float mEndAngle;
    private float mStartAngle;
    private float mValue;

    public PieSegment(int i9, float f9, float f10, float f11) {
        this.mStartAngle = f10;
        this.mEndAngle = f11 + f10;
        this.mDataIndex = i9;
        this.mValue = f9;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public float getEndAngle() {
        return this.mEndAngle;
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public float getValue() {
        return this.mValue;
    }

    public boolean isInSegment(double d9) {
        float f9 = this.mStartAngle;
        if (d9 >= f9 && d9 <= this.mEndAngle) {
            return true;
        }
        double d10 = d9 % 360.0d;
        double d11 = f9;
        double d12 = this.mEndAngle;
        while (d12 > 360.0d) {
            d11 -= 360.0d;
            d12 -= 360.0d;
        }
        return d10 >= d11 && d10 <= d12;
    }

    public String toString() {
        return "mDataIndex=" + this.mDataIndex + ",mValue=" + this.mValue + ",mStartAngle=" + this.mStartAngle + ",mEndAngle=" + this.mEndAngle;
    }
}
