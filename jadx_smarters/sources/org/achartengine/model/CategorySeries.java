package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<Double> mValues = new ArrayList();

    public CategorySeries(String str) {
        this.mTitle = str;
    }

    public synchronized void add(double d9) {
        add(this.mCategories.size() + "", d9);
    }

    public synchronized void add(String str, double d9) {
        this.mCategories.add(str);
        this.mValues.add(Double.valueOf(d9));
    }

    public synchronized void clear() {
        this.mCategories.clear();
        this.mValues.clear();
    }

    public synchronized String getCategory(int i9) {
        return this.mCategories.get(i9);
    }

    public synchronized int getItemCount() {
        return this.mCategories.size();
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getValue(int i9) {
        return this.mValues.get(i9).doubleValue();
    }

    public synchronized void remove(int i9) {
        this.mCategories.remove(i9);
        this.mValues.remove(i9);
    }

    public synchronized void set(int i9, String str, double d9) {
        this.mCategories.set(i9, str);
        this.mValues.set(i9, Double.valueOf(d9));
    }

    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(this.mTitle);
        Iterator<Double> it = this.mValues.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9++;
            xYSeries.add(i9, it.next().doubleValue());
        }
        return xYSeries;
    }
}
