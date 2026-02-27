package org.achartengine.renderer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DialRenderer extends DefaultRenderer {
    private double mAngleMin = 330.0d;
    private double mAngleMax = 30.0d;
    private double mMinValue = Double.MAX_VALUE;
    private double mMaxValue = -1.7976931348623157E308d;
    private double mMinorTickSpacing = Double.MAX_VALUE;
    private double mMajorTickSpacing = Double.MAX_VALUE;
    private List<Type> mVisualTypes = new ArrayList();

    public enum Type {
        NEEDLE,
        ARROW
    }

    public double getAngleMax() {
        return this.mAngleMax;
    }

    public double getAngleMin() {
        return this.mAngleMin;
    }

    public double getMajorTicksSpacing() {
        return this.mMajorTickSpacing;
    }

    public double getMaxValue() {
        return this.mMaxValue;
    }

    public double getMinValue() {
        return this.mMinValue;
    }

    public double getMinorTicksSpacing() {
        return this.mMinorTickSpacing;
    }

    public Type getVisualTypeForIndex(int i9) {
        return i9 < this.mVisualTypes.size() ? this.mVisualTypes.get(i9) : Type.NEEDLE;
    }

    public boolean isMaxValueSet() {
        return this.mMaxValue != -1.7976931348623157E308d;
    }

    public boolean isMinValueSet() {
        return this.mMinValue != Double.MAX_VALUE;
    }

    public void setAngleMax(double d9) {
        this.mAngleMax = d9;
    }

    public void setAngleMin(double d9) {
        this.mAngleMin = d9;
    }

    public void setMajorTicksSpacing(double d9) {
        this.mMajorTickSpacing = d9;
    }

    public void setMaxValue(double d9) {
        this.mMaxValue = d9;
    }

    public void setMinValue(double d9) {
        this.mMinValue = d9;
    }

    public void setMinorTicksSpacing(double d9) {
        this.mMinorTickSpacing = d9;
    }

    public void setVisualTypes(Type[] typeArr) {
        this.mVisualTypes.clear();
        this.mVisualTypes.addAll(Arrays.asList(typeArr));
    }
}
