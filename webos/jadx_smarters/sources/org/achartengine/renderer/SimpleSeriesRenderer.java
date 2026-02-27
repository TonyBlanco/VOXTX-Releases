package org.achartengine.renderer;

import java.io.Serializable;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleSeriesRenderer implements Serializable {
    private NumberFormat mChartValuesFormat;
    private int mGradientStartColor;
    private double mGradientStartValue;
    private int mGradientStopColor;
    private double mGradientStopValue;
    private boolean mHighlighted;
    private BasicStroke mStroke;
    private int mColor = -16776961;
    private boolean mGradientEnabled = false;
    private boolean mShowLegendItem = true;
    private boolean mDisplayBoundingPoints = true;

    public NumberFormat getChartValuesFormat() {
        return this.mChartValuesFormat;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getGradientStartColor() {
        return this.mGradientStartColor;
    }

    public double getGradientStartValue() {
        return this.mGradientStartValue;
    }

    public int getGradientStopColor() {
        return this.mGradientStopColor;
    }

    public double getGradientStopValue() {
        return this.mGradientStopValue;
    }

    public BasicStroke getStroke() {
        return this.mStroke;
    }

    public boolean isDisplayBoundingPoints() {
        return this.mDisplayBoundingPoints;
    }

    public boolean isGradientEnabled() {
        return this.mGradientEnabled;
    }

    public boolean isHighlighted() {
        return this.mHighlighted;
    }

    public boolean isShowLegendItem() {
        return this.mShowLegendItem;
    }

    public void setChartValuesFormat(NumberFormat numberFormat) {
        this.mChartValuesFormat = numberFormat;
    }

    public void setColor(int i9) {
        this.mColor = i9;
    }

    public void setDisplayBoundingPoints(boolean z9) {
        this.mDisplayBoundingPoints = z9;
    }

    public void setGradientEnabled(boolean z9) {
        this.mGradientEnabled = z9;
    }

    public void setGradientStart(double d9, int i9) {
        this.mGradientStartValue = d9;
        this.mGradientStartColor = i9;
    }

    public void setGradientStop(double d9, int i9) {
        this.mGradientStopValue = d9;
        this.mGradientStopColor = i9;
    }

    public void setHighlighted(boolean z9) {
        this.mHighlighted = z9;
    }

    public void setShowLegendItem(boolean z9) {
        this.mShowLegendItem = z9;
    }

    public void setStroke(BasicStroke basicStroke) {
        this.mStroke = basicStroke;
    }
}
