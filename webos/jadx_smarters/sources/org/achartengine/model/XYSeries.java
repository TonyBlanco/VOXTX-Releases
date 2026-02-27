package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.achartengine.util.IndexXYMap;
import org.achartengine.util.XYEntry;

/* JADX INFO: loaded from: classes4.dex */
public class XYSeries implements Serializable {
    private List<String> mAnnotations;
    private double mMaxX;
    private double mMaxY;
    private double mMinX;
    private double mMinY;
    private final int mScaleNumber;
    private final IndexXYMap<Double, Double> mStringXY;
    private String mTitle;
    private final IndexXYMap<Double, Double> mXY;

    public XYSeries(String str) {
        this(str, 0);
    }

    public XYSeries(String str, int i9) {
        this.mXY = new IndexXYMap<>();
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        this.mAnnotations = new ArrayList();
        this.mStringXY = new IndexXYMap<>();
        this.mTitle = str;
        this.mScaleNumber = i9;
        initRange();
    }

    private void initRange() {
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i9 = 0; i9 < itemCount; i9++) {
            updateRange(getX(i9), getY(i9));
        }
    }

    private void updateRange(double d9, double d10) {
        this.mMinX = Math.min(this.mMinX, d9);
        this.mMaxX = Math.max(this.mMaxX, d9);
        this.mMinY = Math.min(this.mMinY, d10);
        this.mMaxY = Math.max(this.mMaxY, d10);
    }

    public synchronized void add(double d9, double d10) {
        while (this.mXY.get(Double.valueOf(d9)) != null) {
            try {
                d9 += getPadding(d9);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mXY.put(Double.valueOf(d9), Double.valueOf(d10));
        updateRange(d9, d10);
    }

    public synchronized void add(int i9, double d9, double d10) {
        while (this.mXY.get(Double.valueOf(d9)) != null) {
            try {
                d9 += getPadding(d9);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mXY.put(i9, Double.valueOf(d9), Double.valueOf(d10));
        updateRange(d9, d10);
    }

    public void addAnnotation(String str, double d9, double d10) {
        this.mAnnotations.add(str);
        while (this.mStringXY.get(Double.valueOf(d9)) != null) {
            d9 += getPadding(d9);
        }
        this.mStringXY.put(Double.valueOf(d9), Double.valueOf(d10));
    }

    public synchronized void clear() {
        clearAnnotations();
        clearSeriesValues();
    }

    public synchronized void clearAnnotations() {
        this.mAnnotations.clear();
        this.mStringXY.clear();
    }

    public synchronized void clearSeriesValues() {
        this.mXY.clear();
        initRange();
    }

    public String getAnnotationAt(int i9) {
        return this.mAnnotations.get(i9);
    }

    public int getAnnotationCount() {
        return this.mAnnotations.size();
    }

    public double getAnnotationX(int i9) {
        return this.mStringXY.getXByIndex(i9).doubleValue();
    }

    public double getAnnotationY(int i9) {
        return this.mStringXY.getYByIndex(i9).doubleValue();
    }

    public int getIndexForKey(double d9) {
        return this.mXY.getIndexForKey(Double.valueOf(d9));
    }

    public synchronized int getItemCount() {
        return this.mXY.size();
    }

    public double getMaxX() {
        return this.mMaxX;
    }

    public double getMaxY() {
        return this.mMaxY;
    }

    public double getMinX() {
        return this.mMinX;
    }

    public double getMinY() {
        return this.mMinY;
    }

    public double getPadding(double d9) {
        return Math.ulp(d9);
    }

    public synchronized SortedMap<Double, Double> getRange(double d9, double d10, boolean z9) {
        if (z9) {
            try {
                SortedMap<Double, Double> sortedMapHeadMap = this.mXY.headMap(Double.valueOf(d9));
                if (!sortedMapHeadMap.isEmpty()) {
                    d9 = sortedMapHeadMap.lastKey().doubleValue();
                }
                SortedMap<Double, Double> sortedMapTailMap = this.mXY.tailMap(Double.valueOf(d10));
                if (!sortedMapTailMap.isEmpty()) {
                    Iterator<Double> it = sortedMapTailMap.keySet().iterator();
                    d10 = it.hasNext() ? it.next().doubleValue() : d10 + it.next().doubleValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d9 <= d10) {
            return this.mXY.subMap(Double.valueOf(d9), Double.valueOf(d10));
        }
        return new TreeMap();
    }

    public int getScaleNumber() {
        return this.mScaleNumber;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getX(int i9) {
        return this.mXY.getXByIndex(i9).doubleValue();
    }

    public synchronized IndexXYMap<Double, Double> getXYMap() {
        return this.mXY;
    }

    public synchronized double getY(int i9) {
        return this.mXY.getYByIndex(i9).doubleValue();
    }

    public synchronized void remove(int i9) {
        try {
            XYEntry<Double, Double> xYEntryRemoveByIndex = this.mXY.removeByIndex(i9);
            double dDoubleValue = xYEntryRemoveByIndex.getKey().doubleValue();
            double dDoubleValue2 = xYEntryRemoveByIndex.getValue().doubleValue();
            if (dDoubleValue == this.mMinX || dDoubleValue == this.mMaxX || dDoubleValue2 == this.mMinY || dDoubleValue2 == this.mMaxY) {
                initRange();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void removeAnnotation(int i9) {
        this.mAnnotations.remove(i9);
        this.mStringXY.removeByIndex(i9);
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
