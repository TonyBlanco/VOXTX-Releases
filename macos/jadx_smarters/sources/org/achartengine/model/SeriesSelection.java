package org.achartengine.model;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesSelection {
    private int mPointIndex;
    private int mSeriesIndex;
    private double mValue;
    private double mXValue;

    public SeriesSelection(int i9, int i10, double d9, double d10) {
        this.mSeriesIndex = i9;
        this.mPointIndex = i10;
        this.mXValue = d9;
        this.mValue = d10;
    }

    public int getPointIndex() {
        return this.mPointIndex;
    }

    public int getSeriesIndex() {
        return this.mSeriesIndex;
    }

    public double getValue() {
        return this.mValue;
    }

    public double getXValue() {
        return this.mXValue;
    }
}
