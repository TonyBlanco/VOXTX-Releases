package org.achartengine.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class XYValueSeries extends XYSeries {
    private double mMaxValue;
    private double mMinValue;
    private List<Double> mValue;

    public XYValueSeries(String str) {
        super(str);
        this.mValue = new ArrayList();
        this.mMinValue = Double.MAX_VALUE;
        this.mMaxValue = -1.7976931348623157E308d;
    }

    private void initRange() {
        this.mMinValue = Double.MAX_VALUE;
        this.mMaxValue = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i9 = 0; i9 < itemCount; i9++) {
            updateRange(getValue(i9));
        }
    }

    private void updateRange(double d9) {
        this.mMinValue = Math.min(this.mMinValue, d9);
        this.mMaxValue = Math.max(this.mMaxValue, d9);
    }

    @Override // org.achartengine.model.XYSeries
    public synchronized void add(double d9, double d10) {
        add(d9, d10, 0.0d);
    }

    public synchronized void add(double d9, double d10, double d11) {
        super.add(d9, d10);
        this.mValue.add(Double.valueOf(d11));
        updateRange(d11);
    }

    @Override // org.achartengine.model.XYSeries
    public synchronized void clear() {
        super.clear();
        this.mValue.clear();
        initRange();
    }

    public double getMaxValue() {
        return this.mMaxValue;
    }

    public double getMinValue() {
        return this.mMinValue;
    }

    public synchronized double getValue(int i9) {
        return this.mValue.get(i9).doubleValue();
    }

    @Override // org.achartengine.model.XYSeries
    public synchronized void remove(int i9) {
        try {
            super.remove(i9);
            double dDoubleValue = this.mValue.remove(i9).doubleValue();
            if (dDoubleValue == this.mMinValue || dDoubleValue == this.mMaxValue) {
                initRange();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
