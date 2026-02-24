package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RoundChart extends AbstractChart {
    protected static final int NO_VALUE = Integer.MAX_VALUE;
    protected static final int SHAPE_WIDTH = 10;
    protected int mCenterX = Integer.MAX_VALUE;
    protected int mCenterY = Integer.MAX_VALUE;
    protected CategorySeries mDataset;
    protected DefaultRenderer mRenderer;

    public RoundChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        this.mDataset = categorySeries;
        this.mRenderer = defaultRenderer;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint) {
        canvas.drawRect(f9, f10 - 5.0f, f9 + 10.0f, f10 + 5.0f, paint);
    }

    public void drawTitle(Canvas canvas, int i9, int i10, int i11, Paint paint) {
        if (this.mRenderer.isShowLabels()) {
            paint.setColor(this.mRenderer.getLabelsColor());
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTextSize(this.mRenderer.getChartTitleTextSize());
            drawString(canvas, this.mRenderer.getChartTitle(), i9 + (i11 / 2), i10 + this.mRenderer.getChartTitleTextSize(), paint);
        }
    }

    public int getCenterX() {
        return this.mCenterX;
    }

    public int getCenterY() {
        return this.mCenterY;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return 10;
    }

    public DefaultRenderer getRenderer() {
        return this.mRenderer;
    }

    public void setCenterX(int i9) {
        this.mCenterX = i9;
    }

    public void setCenterY(int i9) {
        this.mCenterY = i9;
    }
}
