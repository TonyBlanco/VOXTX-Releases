package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.model.CategorySeries;
import org.achartengine.renderer.DialRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class DialChart extends RoundChart {
    private static final int NEEDLE_RADIUS = 10;
    private DialRenderer mRenderer;

    public DialChart(CategorySeries categorySeries, DialRenderer dialRenderer) {
        super(categorySeries, dialRenderer);
        this.mRenderer = dialRenderer;
    }

    private void drawNeedle(Canvas canvas, double d9, int i9, int i10, double d10, boolean z9, Paint paint) {
        float[] fArr;
        double radians = d9 - Math.toRadians(90.0d);
        int iSin = (int) (Math.sin(radians) * 10.0d);
        int iCos = (int) (Math.cos(radians) * 10.0d);
        int iSin2 = ((int) (Math.sin(d9) * d10)) + i9;
        int iCos2 = ((int) (Math.cos(d9) * d10)) + i10;
        if (z9) {
            double d11 = 0.85d * d10;
            int iSin3 = ((int) (d11 * Math.sin(d9))) + i9;
            int iCos3 = ((int) (d11 * Math.cos(d9))) + i10;
            float f9 = iSin2;
            float f10 = iCos2;
            fArr = new float[]{iSin3 - iSin, iCos3 - iCos, f9, f10, iSin3 + iSin, iCos3 + iCos};
            float strokeWidth = paint.getStrokeWidth();
            paint.setStrokeWidth(5.0f);
            canvas.drawLine(i9, i10, f9, f10, paint);
            paint.setStrokeWidth(strokeWidth);
        } else {
            fArr = new float[]{i9 - iSin, i10 - iCos, iSin2, iCos2, i9 + iSin, i10 + iCos};
        }
        drawPath(canvas, fArr, paint, true);
    }

    private void drawTicks(Canvas canvas, double d9, double d10, double d11, double d12, int i9, int i10, double d13, double d14, double d15, Paint paint, boolean z9) {
        double d16 = d9;
        while (d16 <= d10) {
            double angleForValue = getAngleForValue(d16, d11, d12, d9, d10);
            double dSin = Math.sin(angleForValue);
            double dCos = Math.cos(angleForValue);
            float f9 = i9;
            int iRound = Math.round(((float) (d14 * dSin)) + f9);
            float f10 = i10;
            int iRound2 = Math.round(((float) (d14 * dCos)) + f10);
            int iRound3 = Math.round(f9 + ((float) (dSin * d13)));
            int iRound4 = Math.round(f10 + ((float) (dCos * d13)));
            float f11 = iRound;
            float f12 = iRound2;
            double d17 = d16;
            canvas.drawLine(f11, f12, iRound3, iRound4, paint);
            if (z9) {
                paint.setTextAlign(Paint.Align.LEFT);
                if (iRound <= iRound3) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                }
                String str = d17 + "";
                long j9 = (long) d17;
                if (Math.round(d17) == j9) {
                    str = j9 + "";
                }
                canvas.drawText(str, f11, f12, paint);
            }
            d16 = d17 + d15;
        }
    }

    private double getAngleForValue(double d9, double d10, double d11, double d12, double d13) {
        return Math.toRadians(d10 + (((d9 - d12) * (d11 - d10)) / (d13 - d12)));
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i9, int i10, int i11, int i12, Paint paint) {
        paint.setAntiAlias(this.mRenderer.isAntialiasing());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(this.mRenderer.getLabelsTextSize());
        int legendSize = getLegendSize(this.mRenderer, i12 / 5, 0.0f);
        int i13 = i9 + i11;
        int itemCount = this.mDataset.getItemCount();
        String[] strArr = new String[itemCount];
        for (int i14 = 0; i14 < itemCount; i14++) {
            strArr[i14] = this.mDataset.getCategory(i14);
        }
        int iDrawLegend = this.mRenderer.isFitLegend() ? drawLegend(canvas, this.mRenderer, strArr, i9, i13, i10, i11, i12, legendSize, paint, true) : legendSize;
        int i15 = (i10 + i12) - iDrawLegend;
        drawBackground(this.mRenderer, canvas, i9, i10, i11, i12, paint, false, 0);
        int iMin = (int) (((double) Math.min(Math.abs(i13 - i9), Math.abs(i15 - i10))) * 0.35d * ((double) this.mRenderer.getScale()));
        if (this.mCenterX == Integer.MAX_VALUE) {
            this.mCenterX = (i9 + i13) / 2;
        }
        if (this.mCenterY == Integer.MAX_VALUE) {
            this.mCenterY = (i15 + i10) / 2;
        }
        float f9 = iMin;
        float f10 = f9 * 0.9f;
        float f11 = f9 * 1.1f;
        double minValue = this.mRenderer.getMinValue();
        double maxValue = this.mRenderer.getMaxValue();
        double angleMin = this.mRenderer.getAngleMin();
        double angleMax = this.mRenderer.getAngleMax();
        if (!this.mRenderer.isMinValueSet() || !this.mRenderer.isMaxValueSet()) {
            int seriesRendererCount = this.mRenderer.getSeriesRendererCount();
            for (int i16 = 0; i16 < seriesRendererCount; i16++) {
                double value = this.mDataset.getValue(i16);
                if (!this.mRenderer.isMinValueSet()) {
                    minValue = Math.min(minValue, value);
                }
                if (!this.mRenderer.isMaxValueSet()) {
                    maxValue = Math.max(maxValue, value);
                }
            }
        }
        if (minValue == maxValue) {
            minValue *= 0.5d;
            maxValue *= 1.5d;
        }
        double d9 = minValue;
        double d10 = maxValue;
        paint.setColor(this.mRenderer.getLabelsColor());
        double minorTicksSpacing = this.mRenderer.getMinorTicksSpacing();
        double majorTicksSpacing = this.mRenderer.getMajorTicksSpacing();
        if (minorTicksSpacing == Double.MAX_VALUE) {
            minorTicksSpacing = (d10 - d9) / 30.0d;
        }
        double d11 = minorTicksSpacing;
        double d12 = majorTicksSpacing == Double.MAX_VALUE ? (d10 - d9) / 10.0d : majorTicksSpacing;
        double d13 = f11;
        drawTicks(canvas, d9, d10, angleMin, angleMax, this.mCenterX, this.mCenterY, d13, iMin, d11, paint, false);
        double d14 = f10;
        drawTicks(canvas, d9, d10, angleMin, angleMax, this.mCenterX, this.mCenterY, d13, d14, d12, paint, true);
        int seriesRendererCount2 = this.mRenderer.getSeriesRendererCount();
        for (int i17 = 0; i17 < seriesRendererCount2; i17++) {
            double angleForValue = getAngleForValue(this.mDataset.getValue(i17), angleMin, angleMax, d9, d10);
            paint.setColor(this.mRenderer.getSeriesRendererAt(i17).getColor());
            drawNeedle(canvas, angleForValue, this.mCenterX, this.mCenterY, d14, this.mRenderer.getVisualTypeForIndex(i17) == DialRenderer.Type.ARROW, paint);
        }
        drawLegend(canvas, this.mRenderer, strArr, i9, i13, i10, i11, i12, iDrawLegend, paint, false);
        drawTitle(canvas, i9, i10, i11, paint);
    }
}
