package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MultipleCategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<String[]> mTitles = new ArrayList();
    private List<double[]> mValues = new ArrayList();

    public MultipleCategorySeries(String str) {
        this.mTitle = str;
    }

    public void add(String str, String[] strArr, double[] dArr) {
        this.mCategories.add(str);
        this.mTitles.add(strArr);
        this.mValues.add(dArr);
    }

    public void add(String[] strArr, double[] dArr) {
        add(this.mCategories.size() + "", strArr, dArr);
    }

    public void clear() {
        this.mCategories.clear();
        this.mTitles.clear();
        this.mValues.clear();
    }

    public int getCategoriesCount() {
        return this.mCategories.size();
    }

    public String getCategory(int i9) {
        return this.mCategories.get(i9);
    }

    public int getItemCount(int i9) {
        return this.mValues.get(i9).length;
    }

    public String[] getTitles(int i9) {
        return this.mTitles.get(i9);
    }

    public double[] getValues(int i9) {
        return this.mValues.get(i9);
    }

    public void remove(int i9) {
        this.mCategories.remove(i9);
        this.mTitles.remove(i9);
        this.mValues.remove(i9);
    }

    public XYSeries toXYSeries() {
        return new XYSeries(this.mTitle);
    }
}
