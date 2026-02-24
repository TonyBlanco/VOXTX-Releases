package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class LineChart extends XYChart {
    private static final int SHAPE_WIDTH = 30;
    public static final String TYPE = "Line";
    private ScatterChart pointsChart;

    /* JADX INFO: renamed from: org.achartengine.chart.LineChart$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type;

        static {
            int[] iArr = new int[XYSeriesRenderer.FillOutsideLine.Type.values().length];
            $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type = iArr;
            try {
                iArr[XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.BOUNDS_ABOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.BELOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$achartengine$renderer$XYSeriesRenderer$FillOutsideLine$Type[XYSeriesRenderer.FillOutsideLine.Type.ABOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LineChart() {
    }

    public LineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f9, int i9, int i10) {
        int size = list.size();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        for (int i11 = 0; i11 < size; i11 += 2) {
            float selectableBuffer = this.mRenderer.getSelectableBuffer();
            int i12 = i11 + 1;
            clickableAreaArr[i11 / 2] = new ClickableArea(new RectF(list.get(i11).floatValue() - selectableBuffer, list.get(i12).floatValue() - selectableBuffer, list.get(i11).floatValue() + selectableBuffer, list.get(i12).floatValue() + selectableBuffer), list2.get(i11).doubleValue(), list2.get(i12).doubleValue());
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint) {
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(((XYSeriesRenderer) simpleSeriesRenderer).getLineWidth());
        canvas.drawLine(f9, f10, f9 + 30.0f, f10, paint);
        paint.setStrokeWidth(strokeWidth);
        if (isRenderPoints(simpleSeriesRenderer)) {
            this.pointsChart.drawLegendShape(canvas, simpleSeriesRenderer, f9 + 5.0f, f10, i9, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    @Override // org.achartengine.chart.XYChart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawSeries(android.graphics.Canvas r22, android.graphics.Paint r23, java.util.List<java.lang.Float> r24, org.achartengine.renderer.XYSeriesRenderer r25, float r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.LineChart.drawSeries(android.graphics.Canvas, android.graphics.Paint, java.util.List, org.achartengine.renderer.XYSeriesRenderer, float, int, int):void");
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return SHAPE_WIDTH;
    }

    @Override // org.achartengine.chart.XYChart
    public ScatterChart getPointsChart() {
        return this.pointsChart;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return ((XYSeriesRenderer) simpleSeriesRenderer).getPointStyle() != PointStyle.POINT;
    }

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }
}
