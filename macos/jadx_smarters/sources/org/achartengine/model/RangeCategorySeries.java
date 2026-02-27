package org.achartengine.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RangeCategorySeries extends CategorySeries {
    private List<Double> mMaxValues;

    public RangeCategorySeries(String str) {
        super(str);
        this.mMaxValues = new ArrayList();
    }

    public synchronized void add(double d9, double d10) {
        super.add(d9);
        this.mMaxValues.add(Double.valueOf(d10));
    }

    public synchronized void add(String str, double d9, double d10) {
        super.add(str, d9);
        this.mMaxValues.add(Double.valueOf(d10));
    }

    @Override // org.achartengine.model.CategorySeries
    public synchronized void clear() {
        super.clear();
        this.mMaxValues.clear();
    }

    public double getMaximumValue(int i9) {
        return this.mMaxValues.get(i9).doubleValue();
    }

    public double getMinimumValue(int i9) {
        return getValue(i9);
    }

    @Override // org.achartengine.model.CategorySeries
    public synchronized void remove(int i9) {
        super.remove(i9);
        this.mMaxValues.remove(i9);
    }

    @Override // org.achartengine.model.CategorySeries
    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(getTitle());
        int itemCount = getItemCount();
        int i9 = 0;
        while (i9 < itemCount) {
            int i10 = i9 + 1;
            xYSeries.add(i10, getMinimumValue(i9));
            xYSeries.add(((double) i9) + 1.000001d, getMaximumValue(i9));
            i9 = i10;
        }
        return xYSeries;
    }
}
