package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYValueSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class BubbleChart extends XYChart {
    private static final int MAX_BUBBLE_SIZE = 20;
    private static final int MIN_BUBBLE_SIZE = 2;
    private static final int SHAPE_WIDTH = 10;
    public static final String TYPE = "Bubble";

    public BubbleChart() {
    }

    public BubbleChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    private void drawCircle(Canvas canvas, Paint paint, float f9, float f10, float f11) {
        canvas.drawCircle(f9, f10, f11, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f9, int i9, int i10) {
        int size = list.size();
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i9);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        for (int i11 = 0; i11 < size; i11 += 2) {
            int i12 = i11 / 2;
            float value = (float) ((xYValueSeries.getValue(i10 + i12) * maxValue) + 2.0d);
            int i13 = i11 + 1;
            clickableAreaArr[i12] = new ClickableArea(new RectF(list.get(i11).floatValue() - value, list.get(i13).floatValue() - value, list.get(i11).floatValue() + value, list.get(i13).floatValue() + value), list2.get(i11).doubleValue(), list2.get(i13).doubleValue());
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        drawCircle(canvas, paint, f9 + 10.0f, f10, 3.0f);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        int size = list.size();
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i9);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        for (int i11 = 0; i11 < size; i11 += 2) {
            drawCircle(canvas, paint, list.get(i11).floatValue(), list.get(i11 + 1).floatValue(), (float) ((xYValueSeries.getValue(i10 + (i11 / 2)) * maxValue) + 2.0d));
        }
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return 10;
    }
}
