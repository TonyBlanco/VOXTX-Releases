package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import org.achartengine.chart.BarChart;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class RangeBarChart extends BarChart {
    public static final String TYPE = "RangeBar";

    public RangeBarChart() {
    }

    public RangeBarChart(BarChart.Type type) {
        super(type);
    }

    public RangeBarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, BarChart.Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer, type);
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i9, int i10) {
        int i11;
        int i12;
        int seriesCount = this.mDataset.getSeriesCount();
        float halfDiffX = getHalfDiffX(list, list.size(), seriesCount);
        for (int i13 = i10 > 0 ? 2 : 0; i13 < list.size(); i13 += 4) {
            int i14 = i10 + (i13 / 2);
            float fFloatValue = list.get(i13).floatValue();
            if (this.mType == BarChart.Type.DEFAULT) {
                fFloatValue += ((i9 * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX);
            }
            float f9 = fFloatValue;
            int i15 = i14 + 1;
            if (!isNullValue(xYSeries.getY(i15)) && list.size() > (i12 = i13 + 3)) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i15)), f9, list.get(i12).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            if (!isNullValue(xYSeries.getY(i14)) && list.size() > (i11 = i13 + 1)) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i14)), f9, ((list.get(i11).floatValue() + xYSeriesRenderer.getChartValuesTextSize()) + xYSeriesRenderer.getChartValuesSpacing()) - 3.0f, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        int i11;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        int i12 = i10 > 0 ? 2 : 0;
        while (i12 < size) {
            int i13 = i12 + 3;
            if (list.size() > i13) {
                i11 = i12;
                drawBar(canvas, list.get(i12).floatValue(), list.get(i12 + 1).floatValue(), list.get(i12 + 2).floatValue(), list.get(i13).floatValue(), halfDiffX, seriesCount, i9, paint);
            } else {
                i11 = i12;
            }
            i12 = i11 + 4;
        }
        paint.setColor(xYSeriesRenderer.getColor());
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.BarChart
    public float getCoeficient() {
        return 0.5f;
    }
}
