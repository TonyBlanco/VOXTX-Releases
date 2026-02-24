package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class PieChart extends RoundChart {
    private PieMapper mPieMapper;

    public PieChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        super(categorySeries, defaultRenderer);
        this.mPieMapper = new PieMapper();
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i9, int i10, int i11, int i12, Paint paint) {
        int i13;
        float f9;
        float f10;
        int i14;
        float f11;
        float f12;
        int i15;
        PieChart pieChart = this;
        Paint paint2 = paint;
        paint2.setAntiAlias(pieChart.mRenderer.isAntialiasing());
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextSize(pieChart.mRenderer.getLabelsTextSize());
        int legendSize = pieChart.getLegendSize(pieChart.mRenderer, i12 / 5, 0.0f);
        int i16 = i9 + i11;
        int itemCount = pieChart.mDataset.getItemCount();
        String[] strArr = new String[itemCount];
        double value = 0.0d;
        for (int i17 = 0; i17 < itemCount; i17++) {
            value += pieChart.mDataset.getValue(i17);
            strArr[i17] = pieChart.mDataset.getCategory(i17);
        }
        int iDrawLegend = pieChart.mRenderer.isFitLegend() ? drawLegend(canvas, pieChart.mRenderer, strArr, i9, i16, i10, i11, i12, legendSize, paint, true) : legendSize;
        int i18 = (i10 + i12) - iDrawLegend;
        drawBackground(pieChart.mRenderer, canvas, i9, i10, i11, i12, paint, false, 0);
        float startAngle = pieChart.mRenderer.getStartAngle();
        int iMin = (int) (((double) Math.min(Math.abs(i16 - i9), Math.abs(i18 - i10))) * 0.35d * ((double) pieChart.mRenderer.getScale()));
        if (pieChart.mCenterX == Integer.MAX_VALUE) {
            pieChart.mCenterX = (i9 + i16) / 2;
        }
        if (pieChart.mCenterY == Integer.MAX_VALUE) {
            pieChart.mCenterY = (i18 + i10) / 2;
        }
        pieChart.mPieMapper.setDimensions(iMin, pieChart.mCenterX, pieChart.mCenterY);
        boolean z9 = !pieChart.mPieMapper.areAllSegmentPresent(itemCount);
        if (z9) {
            pieChart.mPieMapper.clearPieSegments();
        }
        float f13 = iMin;
        float f14 = f13 * 0.9f;
        float f15 = f13 * 1.1f;
        int i19 = pieChart.mCenterX;
        int i20 = pieChart.mCenterY;
        RectF rectF = new RectF(i19 - iMin, i20 - iMin, i19 + iMin, i20 + iMin);
        ArrayList arrayList = new ArrayList();
        float f16 = startAngle;
        int i21 = 0;
        while (i21 < itemCount) {
            SimpleSeriesRenderer seriesRendererAt = pieChart.mRenderer.getSeriesRendererAt(i21);
            if (seriesRendererAt.isGradientEnabled()) {
                paint2.setShader(new RadialGradient(pieChart.mCenterX, pieChart.mCenterY, f15, seriesRendererAt.getGradientStartColor(), seriesRendererAt.getGradientStopColor(), Shader.TileMode.MIRROR));
            } else {
                paint2.setColor(seriesRendererAt.getColor());
            }
            float value2 = (float) pieChart.mDataset.getValue(i21);
            float f17 = (float) ((((double) value2) / value) * 360.0d);
            if (seriesRendererAt.isHighlighted()) {
                double radians = Math.toRadians(90.0f - ((f17 / 2.0f) + f16));
                double d9 = ((double) iMin) * 0.1d;
                i13 = i21;
                float fSin = (float) (d9 * Math.sin(radians));
                float fCos = (float) (d9 * Math.cos(radians));
                rectF.offset(fSin, fCos);
                f9 = f16;
                f10 = value2;
                canvas.drawArc(rectF, f16, f17, true, paint);
                rectF.offset(-fSin, -fCos);
            } else {
                i13 = i21;
                f9 = f16;
                f10 = value2;
                canvas.drawArc(rectF, f16, f17, true, paint);
            }
            paint2.setColor(seriesRendererAt.getColor());
            paint2.setShader(null);
            String category = pieChart.mDataset.getCategory(i13);
            DefaultRenderer defaultRenderer = pieChart.mRenderer;
            String[] strArr2 = strArr;
            int i22 = itemCount;
            int i23 = i13;
            float f18 = f10;
            RectF rectF2 = rectF;
            int i24 = iMin;
            drawLabel(canvas, category, defaultRenderer, arrayList, pieChart.mCenterX, pieChart.mCenterY, f14, f15, f9, f17, i9, i16, defaultRenderer.getLabelsColor(), paint, true, false);
            if (this.mRenderer.isDisplayValues()) {
                String label = getLabel(this.mRenderer.getSeriesRendererAt(i23).getChartValuesFormat(), this.mDataset.getValue(i23));
                DefaultRenderer defaultRenderer2 = this.mRenderer;
                i14 = i23;
                drawLabel(canvas, label, defaultRenderer2, arrayList, this.mCenterX, this.mCenterY, f14 / 2.0f, f15 / 2.0f, f9, f17, i9, i16, defaultRenderer2.getLabelsColor(), paint, false, true);
            } else {
                i14 = i23;
            }
            if (z9) {
                f11 = f9;
                f12 = f17;
                i15 = i14;
                this.mPieMapper.addPieSegment(i15, f18, f11, f12);
            } else {
                f11 = f9;
                f12 = f17;
                i15 = i14;
            }
            f16 = f11 + f12;
            i21 = i15 + 1;
            pieChart = this;
            rectF = rectF2;
            strArr = strArr2;
            itemCount = i22;
            iMin = i24;
            paint2 = paint;
        }
        arrayList.clear();
        drawLegend(canvas, pieChart.mRenderer, strArr, i9, i16, i10, i11, i12, iDrawLegend, paint, false);
        drawTitle(canvas, i9, i10, i11, paint);
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return this.mPieMapper.getSeriesAndPointForScreenCoordinate(point);
    }
}
