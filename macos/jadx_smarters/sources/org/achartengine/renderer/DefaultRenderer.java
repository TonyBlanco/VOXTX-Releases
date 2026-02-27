package org.achartengine.renderer;

import android.graphics.Typeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultRenderer implements Serializable {
    public static final int BACKGROUND_COLOR = -16777216;
    public static final int NO_COLOR = 0;
    private static final Typeface REGULAR_TEXT_FONT = Typeface.create(Typeface.SERIF, 0);
    public static final int TEXT_COLOR = -3355444;
    private boolean mApplyBackgroundColor;
    private int mBackgroundColor;
    private boolean mDisplayValues;
    private float mGridLineWidth;
    private boolean mInScroll;
    private Typeface mTextTypeface;
    private String mChartTitle = "";
    private float mChartTitleTextSize = 15.0f;
    private String mTextTypefaceName = REGULAR_TEXT_FONT.toString();
    private int mTextTypefaceStyle = 0;
    private boolean mShowAxes = true;
    private int mYAxisColor = TEXT_COLOR;
    private int mXAxisColor = TEXT_COLOR;
    private boolean mShowXLabels = true;
    private boolean mShowYLabels = true;
    private boolean mShowTickMarks = true;
    private int mLabelsColor = TEXT_COLOR;
    private float mLabelsTextSize = 10.0f;
    private boolean mShowLegend = true;
    private float mLegendTextSize = 12.0f;
    private boolean mFitLegend = false;
    private boolean mShowGridX = false;
    private boolean mShowGridY = false;
    private boolean mShowCustomTextGridX = false;
    private boolean mShowCustomTextGridY = false;
    private List<SimpleSeriesRenderer> mRenderers = new ArrayList();
    private boolean mAntialiasing = true;
    private int mLegendHeight = 0;
    private int[] mMargins = {20, 30, 10, 20};
    private float mScale = 1.0f;
    private boolean mPanEnabled = true;
    private boolean mZoomEnabled = true;
    private boolean mZoomButtonsVisible = false;
    private float mZoomRate = 1.5f;
    private boolean mExternalZoomEnabled = false;
    private float mOriginalScale = 1.0f;
    private boolean mClickEnabled = false;
    private int selectableBuffer = 15;
    private float mStartAngle = 0.0f;

    public void addSeriesRenderer(int i9, SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(i9, simpleSeriesRenderer);
    }

    public void addSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(simpleSeriesRenderer);
    }

    public int getAxesColor() {
        int i9 = this.mXAxisColor;
        return i9 != -3355444 ? i9 : this.mYAxisColor;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getChartTitle() {
        return this.mChartTitle;
    }

    public float getChartTitleTextSize() {
        return this.mChartTitleTextSize;
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public int getLabelsColor() {
        return this.mLabelsColor;
    }

    public float getLabelsTextSize() {
        return this.mLabelsTextSize;
    }

    public int getLegendHeight() {
        return this.mLegendHeight;
    }

    public float getLegendTextSize() {
        return this.mLegendTextSize;
    }

    public int[] getMargins() {
        return this.mMargins;
    }

    public float getOriginalScale() {
        return this.mOriginalScale;
    }

    public float getScale() {
        return this.mScale;
    }

    public int getSelectableBuffer() {
        return this.selectableBuffer;
    }

    public SimpleSeriesRenderer getSeriesRendererAt(int i9) {
        return this.mRenderers.get(i9);
    }

    public int getSeriesRendererCount() {
        return this.mRenderers.size();
    }

    public SimpleSeriesRenderer[] getSeriesRenderers() {
        return (SimpleSeriesRenderer[]) this.mRenderers.toArray(new SimpleSeriesRenderer[0]);
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public Typeface getTextTypeface() {
        return this.mTextTypeface;
    }

    public String getTextTypefaceName() {
        return this.mTextTypefaceName;
    }

    public int getTextTypefaceStyle() {
        return this.mTextTypefaceStyle;
    }

    public int getXAxisColor() {
        return this.mXAxisColor;
    }

    public int getYAxisColor() {
        return this.mYAxisColor;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isAntialiasing() {
        return this.mAntialiasing;
    }

    public boolean isApplyBackgroundColor() {
        return this.mApplyBackgroundColor;
    }

    public boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public boolean isDisplayValues() {
        return this.mDisplayValues;
    }

    public boolean isExternalZoomEnabled() {
        return this.mExternalZoomEnabled;
    }

    public boolean isFitLegend() {
        return this.mFitLegend;
    }

    public boolean isInScroll() {
        return this.mInScroll;
    }

    public boolean isPanEnabled() {
        return this.mPanEnabled;
    }

    public boolean isShowAxes() {
        return this.mShowAxes;
    }

    public boolean isShowCustomTextGridX() {
        return this.mShowCustomTextGridX;
    }

    public boolean isShowCustomTextGridY() {
        return this.mShowCustomTextGridY;
    }

    public boolean isShowGridX() {
        return this.mShowGridX;
    }

    public boolean isShowGridY() {
        return this.mShowGridY;
    }

    public boolean isShowLabels() {
        return this.mShowXLabels || this.mShowYLabels;
    }

    public boolean isShowLegend() {
        return this.mShowLegend;
    }

    public boolean isShowTickMarks() {
        return this.mShowTickMarks;
    }

    public boolean isShowXLabels() {
        return this.mShowXLabels;
    }

    public boolean isShowYLabels() {
        return this.mShowYLabels;
    }

    public boolean isZoomButtonsVisible() {
        return this.mZoomButtonsVisible;
    }

    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public void removeAllRenderers() {
        this.mRenderers.clear();
    }

    public void removeSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.remove(simpleSeriesRenderer);
    }

    public void setAntialiasing(boolean z9) {
        this.mAntialiasing = z9;
    }

    public void setApplyBackgroundColor(boolean z9) {
        this.mApplyBackgroundColor = z9;
    }

    public void setAxesColor(int i9) {
        setXAxisColor(i9);
        setYAxisColor(i9);
    }

    public void setBackgroundColor(int i9) {
        this.mBackgroundColor = i9;
    }

    public void setChartTitle(String str) {
        this.mChartTitle = str;
    }

    public void setChartTitleTextSize(float f9) {
        this.mChartTitleTextSize = f9;
    }

    public void setClickEnabled(boolean z9) {
        this.mClickEnabled = z9;
    }

    public void setDisplayValues(boolean z9) {
        this.mDisplayValues = z9;
    }

    public void setExternalZoomEnabled(boolean z9) {
        this.mExternalZoomEnabled = z9;
    }

    public void setFitLegend(boolean z9) {
        this.mFitLegend = z9;
    }

    public void setGridLineWidth(float f9) {
        this.mGridLineWidth = f9;
    }

    public void setInScroll(boolean z9) {
        this.mInScroll = z9;
    }

    public void setLabelsColor(int i9) {
        this.mLabelsColor = i9;
    }

    public void setLabelsTextSize(float f9) {
        this.mLabelsTextSize = f9;
    }

    public void setLegendHeight(int i9) {
        this.mLegendHeight = i9;
    }

    public void setLegendTextSize(float f9) {
        this.mLegendTextSize = f9;
    }

    public void setMargins(int[] iArr) {
        this.mMargins = iArr;
    }

    public void setPanEnabled(boolean z9) {
        this.mPanEnabled = z9;
    }

    public void setScale(float f9) {
        this.mScale = f9;
    }

    public void setSelectableBuffer(int i9) {
        this.selectableBuffer = i9;
    }

    public void setShowAxes(boolean z9) {
        this.mShowAxes = z9;
    }

    public void setShowCustomTextGrid(boolean z9) {
        setShowCustomTextGridX(z9);
        setShowCustomTextGridY(z9);
    }

    public void setShowCustomTextGridX(boolean z9) {
        this.mShowCustomTextGridX = z9;
    }

    public void setShowCustomTextGridY(boolean z9) {
        this.mShowCustomTextGridY = z9;
    }

    public void setShowGrid(boolean z9) {
        setShowGridX(z9);
        setShowGridY(z9);
    }

    public void setShowGridX(boolean z9) {
        this.mShowGridX = z9;
    }

    public void setShowGridY(boolean z9) {
        this.mShowGridY = z9;
    }

    public void setShowLabels(boolean z9) {
        this.mShowXLabels = z9;
        this.mShowYLabels = z9;
    }

    public void setShowLabels(boolean z9, boolean z10) {
        this.mShowXLabels = z9;
        this.mShowYLabels = z10;
    }

    public void setShowLegend(boolean z9) {
        this.mShowLegend = z9;
    }

    public void setShowTickMarks(boolean z9) {
        this.mShowTickMarks = z9;
    }

    public void setStartAngle(float f9) {
        while (f9 < 0.0f) {
            f9 += 360.0f;
        }
        this.mStartAngle = f9;
    }

    public void setTextTypeface(Typeface typeface) {
        this.mTextTypeface = typeface;
    }

    public void setTextTypeface(String str, int i9) {
        this.mTextTypefaceName = str;
        this.mTextTypefaceStyle = i9;
    }

    public void setXAxisColor(int i9) {
        this.mXAxisColor = i9;
    }

    public void setYAxisColor(int i9) {
        this.mYAxisColor = i9;
    }

    public void setZoomButtonsVisible(boolean z9) {
        this.mZoomButtonsVisible = z9;
    }

    public void setZoomEnabled(boolean z9) {
        this.mZoomEnabled = z9;
    }

    public void setZoomRate(float f9) {
        this.mZoomRate = f9;
    }
}
