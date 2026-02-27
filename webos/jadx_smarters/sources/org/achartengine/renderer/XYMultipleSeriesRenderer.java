package org.achartengine.renderer;

import android.graphics.Color;
import android.graphics.Paint;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class XYMultipleSeriesRenderer extends DefaultRenderer {
    private Map<Integer, double[]> initialRange;
    private float mAxisTitleTextSize;
    private double mBarSpacing;
    private float mBarWidth;
    private int[] mGridColors;
    private int mMarginsColor;
    private double[] mMaxX;
    private double[] mMaxY;
    private double[] mMinX;
    private double[] mMinY;
    private Orientation mOrientation;
    private double[] mPanLimits;
    private boolean mPanXEnabled;
    private boolean mPanYEnabled;
    private float mPointSize;
    private NumberFormat mXLabelFormat;
    private int mXLabels;
    private float mXLabelsAngle;
    private int mXLabelsColor;
    private float mXLabelsPadding;
    private boolean mXRoundedLabels;
    private Map<Double, String> mXTextLabels;
    private String mXTitle;
    private NumberFormat[] mYLabelFormat;
    private int mYLabels;
    private float mYLabelsAngle;
    private int[] mYLabelsColor;
    private float mYLabelsPadding;
    private float mYLabelsVerticalPadding;
    private Map<Integer, Map<Double, String>> mYTextLabels;
    private String[] mYTitle;
    private double mZoomInLimitX;
    private double mZoomInLimitY;
    private double[] mZoomLimits;
    private boolean mZoomXEnabled;
    private boolean mZoomYEnabled;
    private int scalesCount;
    private Paint.Align xLabelsAlign;
    private Paint.Align[] yAxisAlign;
    private Paint.Align[] yLabelsAlign;

    public enum Orientation {
        HORIZONTAL(0),
        VERTICAL(90);

        private int mAngle;

        Orientation(int i9) {
            this.mAngle = i9;
        }

        public int getAngle() {
            return this.mAngle;
        }
    }

    public XYMultipleSeriesRenderer() {
        this(1);
    }

    public XYMultipleSeriesRenderer(int i9) {
        this.mXTitle = "";
        this.mAxisTitleTextSize = 12.0f;
        this.mXLabels = 5;
        this.mYLabels = 5;
        this.mOrientation = Orientation.HORIZONTAL;
        this.mXTextLabels = new HashMap();
        this.mYTextLabels = new LinkedHashMap();
        this.mPanXEnabled = true;
        this.mPanYEnabled = true;
        this.mZoomXEnabled = true;
        this.mZoomYEnabled = true;
        this.mBarSpacing = 0.0d;
        this.mMarginsColor = 0;
        this.initialRange = new LinkedHashMap();
        this.mPointSize = 3.0f;
        this.xLabelsAlign = Paint.Align.CENTER;
        this.mXLabelsPadding = 0.0f;
        this.mYLabelsPadding = 0.0f;
        this.mYLabelsVerticalPadding = 2.0f;
        this.mXLabelsColor = DefaultRenderer.TEXT_COLOR;
        this.mYLabelsColor = new int[]{DefaultRenderer.TEXT_COLOR};
        this.mXRoundedLabels = true;
        this.mBarWidth = -1.0f;
        this.mZoomInLimitX = 0.0d;
        this.mZoomInLimitY = 0.0d;
        this.scalesCount = i9;
        initAxesRange(i9);
    }

    public void addTextLabel(double d9, String str) {
        addXTextLabel(d9, str);
    }

    public synchronized void addXTextLabel(double d9, String str) {
        this.mXTextLabels.put(Double.valueOf(d9), str);
    }

    public void addYTextLabel(double d9, String str) {
        addYTextLabel(d9, str, 0);
    }

    public synchronized void addYTextLabel(double d9, String str, int i9) {
        this.mYTextLabels.get(Integer.valueOf(i9)).put(Double.valueOf(d9), str);
    }

    public void clearTextLabels() {
        clearXTextLabels();
    }

    public synchronized void clearXTextLabels() {
        this.mXTextLabels.clear();
    }

    public void clearYTextLabels() {
        clearYTextLabels(0);
    }

    public synchronized void clearYTextLabels(int i9) {
        this.mYTextLabels.get(Integer.valueOf(i9)).clear();
    }

    public float getAxisTitleTextSize() {
        return this.mAxisTitleTextSize;
    }

    public double getBarSpacing() {
        return this.mBarSpacing;
    }

    public float getBarWidth() {
        return this.mBarWidth;
    }

    public double getBarsSpacing() {
        return getBarSpacing();
    }

    public int getGridColor(int i9) {
        return this.mGridColors[i9];
    }

    public double[] getInitialRange() {
        return getInitialRange(0);
    }

    public double[] getInitialRange(int i9) {
        return this.initialRange.get(Integer.valueOf(i9));
    }

    public NumberFormat getLabelFormat() {
        return getXLabelFormat();
    }

    public int getMarginsColor() {
        return this.mMarginsColor;
    }

    public Orientation getOrientation() {
        return this.mOrientation;
    }

    public double[] getPanLimits() {
        return this.mPanLimits;
    }

    public float getPointSize() {
        return this.mPointSize;
    }

    public int getScalesCount() {
        return this.scalesCount;
    }

    public double getXAxisMax() {
        return getXAxisMax(0);
    }

    public double getXAxisMax(int i9) {
        return this.mMaxX[i9];
    }

    public double getXAxisMin() {
        return getXAxisMin(0);
    }

    public double getXAxisMin(int i9) {
        return this.mMinX[i9];
    }

    public NumberFormat getXLabelFormat() {
        return this.mXLabelFormat;
    }

    public int getXLabels() {
        return this.mXLabels;
    }

    public Paint.Align getXLabelsAlign() {
        return this.xLabelsAlign;
    }

    public float getXLabelsAngle() {
        return this.mXLabelsAngle;
    }

    public int getXLabelsColor() {
        return this.mXLabelsColor;
    }

    public float getXLabelsPadding() {
        return this.mXLabelsPadding;
    }

    public synchronized String getXTextLabel(Double d9) {
        return this.mXTextLabels.get(d9);
    }

    public synchronized Double[] getXTextLabelLocations() {
        return (Double[]) this.mXTextLabels.keySet().toArray(new Double[0]);
    }

    public String getXTitle() {
        return this.mXTitle;
    }

    public Paint.Align getYAxisAlign(int i9) {
        return this.yAxisAlign[i9];
    }

    public double getYAxisMax() {
        return getYAxisMax(0);
    }

    public double getYAxisMax(int i9) {
        return this.mMaxY[i9];
    }

    public double getYAxisMin() {
        return getYAxisMin(0);
    }

    public double getYAxisMin(int i9) {
        return this.mMinY[i9];
    }

    public NumberFormat getYLabelFormat(int i9) {
        return this.mYLabelFormat[i9];
    }

    public int getYLabels() {
        return this.mYLabels;
    }

    public Paint.Align getYLabelsAlign(int i9) {
        return this.yLabelsAlign[i9];
    }

    public float getYLabelsAngle() {
        return this.mYLabelsAngle;
    }

    public int getYLabelsColor(int i9) {
        return this.mYLabelsColor[i9];
    }

    public float getYLabelsPadding() {
        return this.mYLabelsPadding;
    }

    public float getYLabelsVerticalPadding() {
        return this.mYLabelsVerticalPadding;
    }

    public String getYTextLabel(Double d9) {
        return getYTextLabel(d9, 0);
    }

    public synchronized String getYTextLabel(Double d9, int i9) {
        return this.mYTextLabels.get(Integer.valueOf(i9)).get(d9);
    }

    public Double[] getYTextLabelLocations() {
        return getYTextLabelLocations(0);
    }

    public synchronized Double[] getYTextLabelLocations(int i9) {
        return (Double[]) this.mYTextLabels.get(Integer.valueOf(i9)).keySet().toArray(new Double[0]);
    }

    public String getYTitle() {
        return getYTitle(0);
    }

    public String getYTitle(int i9) {
        return this.mYTitle[i9];
    }

    public double getZoomInLimitX() {
        return this.mZoomInLimitX;
    }

    public double getZoomInLimitY() {
        return this.mZoomInLimitY;
    }

    public double[] getZoomLimits() {
        return this.mZoomLimits;
    }

    public void initAxesRange(int i9) {
        this.mYTitle = new String[i9];
        this.yLabelsAlign = new Paint.Align[i9];
        this.yAxisAlign = new Paint.Align[i9];
        this.mYLabelsColor = new int[i9];
        this.mYLabelFormat = new NumberFormat[i9];
        this.mMinX = new double[i9];
        this.mMaxX = new double[i9];
        this.mMinY = new double[i9];
        this.mMaxY = new double[i9];
        this.mGridColors = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            this.mYLabelsColor[i10] = -3355444;
            this.mYLabelFormat[i10] = NumberFormat.getNumberInstance();
            this.mGridColors[i10] = Color.argb(75, 200, 200, 200);
            initAxesRangeForScale(i10);
        }
    }

    public void initAxesRangeForScale(int i9) {
        double[] dArr = this.mMinX;
        dArr[i9] = Double.MAX_VALUE;
        double[] dArr2 = this.mMaxX;
        dArr2[i9] = -1.7976931348623157E308d;
        double[] dArr3 = this.mMinY;
        dArr3[i9] = Double.MAX_VALUE;
        this.mMaxY[i9] = -1.7976931348623157E308d;
        this.initialRange.put(Integer.valueOf(i9), new double[]{dArr[i9], dArr2[i9], dArr3[i9], -1.7976931348623157E308d});
        this.mYTitle[i9] = "";
        this.mYTextLabels.put(Integer.valueOf(i9), new HashMap());
        this.yLabelsAlign[i9] = Paint.Align.CENTER;
        this.yAxisAlign[i9] = Paint.Align.LEFT;
    }

    public boolean isInitialRangeSet() {
        return isInitialRangeSet(0);
    }

    public boolean isInitialRangeSet(int i9) {
        return this.initialRange.get(Integer.valueOf(i9)) != null;
    }

    public boolean isMaxXSet() {
        return isMaxXSet(0);
    }

    public boolean isMaxXSet(int i9) {
        return this.mMaxX[i9] != -1.7976931348623157E308d;
    }

    public boolean isMaxYSet() {
        return isMaxYSet(0);
    }

    public boolean isMaxYSet(int i9) {
        return this.mMaxY[i9] != -1.7976931348623157E308d;
    }

    public boolean isMinXSet() {
        return isMinXSet(0);
    }

    public boolean isMinXSet(int i9) {
        return this.mMinX[i9] != Double.MAX_VALUE;
    }

    public boolean isMinYSet() {
        return isMinYSet(0);
    }

    public boolean isMinYSet(int i9) {
        return this.mMinY[i9] != Double.MAX_VALUE;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public boolean isPanEnabled() {
        return isPanXEnabled() || isPanYEnabled();
    }

    public boolean isPanXEnabled() {
        return this.mPanXEnabled;
    }

    public boolean isPanYEnabled() {
        return this.mPanYEnabled;
    }

    public boolean isXRoundedLabels() {
        return this.mXRoundedLabels;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public boolean isZoomEnabled() {
        return isZoomXEnabled() || isZoomYEnabled();
    }

    public boolean isZoomXEnabled() {
        return this.mZoomXEnabled;
    }

    public boolean isZoomYEnabled() {
        return this.mZoomYEnabled;
    }

    public synchronized void removeXTextLabel(double d9) {
        this.mXTextLabels.remove(Double.valueOf(d9));
    }

    public void removeYTextLabel(double d9) {
        removeYTextLabel(d9, 0);
    }

    public synchronized void removeYTextLabel(double d9, int i9) {
        this.mYTextLabels.get(Integer.valueOf(i9)).remove(Double.valueOf(d9));
    }

    public void setAxisTitleTextSize(float f9) {
        this.mAxisTitleTextSize = f9;
    }

    public void setBarSpacing(double d9) {
        this.mBarSpacing = d9;
    }

    public void setBarWidth(float f9) {
        this.mBarWidth = f9;
    }

    public void setGridColor(int i9) {
        setGridColor(i9, 0);
    }

    public void setGridColor(int i9, int i10) {
        this.mGridColors[i10] = i9;
    }

    public void setInitialRange(double[] dArr) {
        setInitialRange(dArr, 0);
    }

    public void setInitialRange(double[] dArr, int i9) {
        this.initialRange.put(Integer.valueOf(i9), dArr);
    }

    public void setLabelFormat(NumberFormat numberFormat) {
        setXLabelFormat(numberFormat);
    }

    public void setMarginsColor(int i9) {
        this.mMarginsColor = i9;
    }

    public void setOrientation(Orientation orientation) {
        this.mOrientation = orientation;
    }

    @Override // org.achartengine.renderer.DefaultRenderer
    public void setPanEnabled(boolean z9) {
        setPanEnabled(z9, z9);
    }

    public void setPanEnabled(boolean z9, boolean z10) {
        this.mPanXEnabled = z9;
        this.mPanYEnabled = z10;
    }

    public void setPanLimits(double[] dArr) {
        this.mPanLimits = dArr;
    }

    public void setPointSize(float f9) {
        this.mPointSize = f9;
    }

    public void setRange(double[] dArr) {
        setRange(dArr, 0);
    }

    public void setRange(double[] dArr, int i9) {
        setXAxisMin(dArr[0], i9);
        setXAxisMax(dArr[1], i9);
        setYAxisMin(dArr[2], i9);
        setYAxisMax(dArr[3], i9);
    }

    public void setXAxisMax(double d9) {
        setXAxisMax(d9, 0);
    }

    public void setXAxisMax(double d9, int i9) {
        if (!isMaxXSet(i9)) {
            this.initialRange.get(Integer.valueOf(i9))[1] = d9;
        }
        this.mMaxX[i9] = d9;
    }

    public void setXAxisMin(double d9) {
        setXAxisMin(d9, 0);
    }

    public void setXAxisMin(double d9, int i9) {
        if (!isMinXSet(i9)) {
            this.initialRange.get(Integer.valueOf(i9))[0] = d9;
        }
        this.mMinX[i9] = d9;
    }

    public void setXLabelFormat(NumberFormat numberFormat) {
        this.mXLabelFormat = numberFormat;
    }

    public void setXLabels(int i9) {
        this.mXLabels = i9;
    }

    public void setXLabelsAlign(Paint.Align align) {
        this.xLabelsAlign = align;
    }

    public void setXLabelsAngle(float f9) {
        this.mXLabelsAngle = f9;
    }

    public void setXLabelsColor(int i9) {
        this.mXLabelsColor = i9;
    }

    public void setXLabelsPadding(float f9) {
        this.mXLabelsPadding = f9;
    }

    public void setXRoundedLabels(boolean z9) {
        this.mXRoundedLabels = z9;
    }

    public void setXTitle(String str) {
        this.mXTitle = str;
    }

    public void setYAxisAlign(Paint.Align align, int i9) {
        this.yAxisAlign[i9] = align;
    }

    public void setYAxisMax(double d9) {
        setYAxisMax(d9, 0);
    }

    public void setYAxisMax(double d9, int i9) {
        if (!isMaxYSet(i9)) {
            this.initialRange.get(Integer.valueOf(i9))[3] = d9;
        }
        this.mMaxY[i9] = d9;
    }

    public void setYAxisMin(double d9) {
        setYAxisMin(d9, 0);
    }

    public void setYAxisMin(double d9, int i9) {
        if (!isMinYSet(i9)) {
            this.initialRange.get(Integer.valueOf(i9))[2] = d9;
        }
        this.mMinY[i9] = d9;
    }

    public void setYLabelFormat(NumberFormat numberFormat, int i9) {
        this.mYLabelFormat[i9] = numberFormat;
    }

    public void setYLabels(int i9) {
        this.mYLabels = i9;
    }

    public void setYLabelsAlign(Paint.Align align) {
        setYLabelsAlign(align, 0);
    }

    public void setYLabelsAlign(Paint.Align align, int i9) {
        this.yLabelsAlign[i9] = align;
    }

    public void setYLabelsAngle(float f9) {
        this.mYLabelsAngle = f9;
    }

    public void setYLabelsColor(int i9, int i10) {
        this.mYLabelsColor[i9] = i10;
    }

    public void setYLabelsPadding(float f9) {
        this.mYLabelsPadding = f9;
    }

    public void setYLabelsVerticalPadding(float f9) {
        this.mYLabelsVerticalPadding = f9;
    }

    public void setYTitle(String str) {
        setYTitle(str, 0);
    }

    public void setYTitle(String str, int i9) {
        this.mYTitle[i9] = str;
    }

    public void setZoomEnabled(boolean z9, boolean z10) {
        this.mZoomXEnabled = z9;
        this.mZoomYEnabled = z10;
    }

    public void setZoomInLimitX(double d9) {
        this.mZoomInLimitX = d9;
    }

    public void setZoomInLimitY(double d9) {
        this.mZoomInLimitY = d9;
    }

    public void setZoomLimits(double[] dArr) {
        this.mZoomLimits = dArr;
    }
}
