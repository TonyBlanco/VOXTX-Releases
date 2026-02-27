package org.achartengine.chart;

/* JADX INFO: loaded from: classes4.dex */
public enum PointStyle {
    X("x"),
    CIRCLE("circle"),
    TRIANGLE("triangle"),
    SQUARE("square"),
    DIAMOND("diamond"),
    POINT("point");

    private String mName;

    PointStyle(String str) {
        this.mName = str;
    }

    public static int getIndexForName(String str) {
        PointStyle[] pointStyleArrValues = values();
        int length = pointStyleArrValues.length;
        int i9 = -1;
        for (int i10 = 0; i10 < length && i9 < 0; i10++) {
            if (pointStyleArrValues[i10].mName.equals(str)) {
                i9 = i10;
            }
        }
        return Math.max(0, i9);
    }

    public static PointStyle getPointStyleForName(String str) {
        PointStyle[] pointStyleArrValues = values();
        int length = pointStyleArrValues.length;
        PointStyle pointStyle = null;
        for (int i9 = 0; i9 < length && pointStyle == null; i9++) {
            if (pointStyleArrValues[i9].mName.equals(str)) {
                pointStyle = pointStyleArrValues[i9];
            }
        }
        return pointStyle;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}
