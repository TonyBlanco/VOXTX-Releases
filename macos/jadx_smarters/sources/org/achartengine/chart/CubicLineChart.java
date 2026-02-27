package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import org.achartengine.model.Point;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class CubicLineChart extends LineChart {
    public static final String TYPE = "Cubic";
    private float mFirstMultiplier;
    private PathMeasure mPathMeasure;
    private float mSecondMultiplier;

    public CubicLineChart() {
        this.mFirstMultiplier = 0.33f;
        this.mSecondMultiplier = 1.0f - 0.33f;
    }

    public CubicLineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, float f9) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.mFirstMultiplier = f9;
        this.mSecondMultiplier = 1.0f - f9;
    }

    private void calc(List<Float> list, Point point, int i9, int i10, float f9) {
        float fFloatValue = list.get(i9).floatValue();
        float fFloatValue2 = list.get(i9 + 1).floatValue();
        float fFloatValue3 = list.get(i10).floatValue();
        float fFloatValue4 = list.get(i10 + 1).floatValue() - fFloatValue2;
        point.setX(fFloatValue + ((fFloatValue3 - fFloatValue) * f9));
        point.setY(fFloatValue2 + (fFloatValue4 * f9));
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawPath(Canvas canvas, List<Float> list, Paint paint, boolean z9) {
        Path path = new Path();
        path.moveTo(list.get(0).floatValue(), list.get(1).floatValue());
        int size = list.size();
        if (z9) {
            size -= 4;
        }
        int i9 = size;
        Point point = new Point();
        Point point2 = new Point();
        Point point3 = new Point();
        int i10 = 0;
        while (i10 < i9) {
            int i11 = i10 + 2;
            int i12 = i11 < i9 ? i11 : i10;
            int i13 = i10 + 4;
            int i14 = i13 < i9 ? i13 : i12;
            calc(list, point, i10, i12, this.mSecondMultiplier);
            point2.setX(list.get(i12).floatValue());
            point2.setY(list.get(i12 + 1).floatValue());
            calc(list, point3, i12, i14, this.mFirstMultiplier);
            path.cubicTo(point.getX(), point.getY(), point2.getX(), point2.getY(), point3.getX(), point3.getY());
            point2 = point2;
            i9 = i9;
            i10 = i11;
        }
        int i15 = i9;
        this.mPathMeasure = new PathMeasure(path, false);
        if (z9) {
            for (int i16 = i15; i16 < i15 + 4; i16 += 2) {
                path.lineTo(list.get(i16).floatValue(), list.get(i16 + 1).floatValue());
            }
            path.lineTo(list.get(0).floatValue(), list.get(1).floatValue());
        }
        canvas.drawPath(path, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawPoints(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        ScatterChart pointsChart;
        if (!isRenderPoints(xYSeriesRenderer) || (pointsChart = getPointsChart()) == null) {
            return;
        }
        int length = (int) this.mPathMeasure.getLength();
        int size = list.size();
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < length; i11++) {
            this.mPathMeasure.getPosTan(i11, fArr, null);
            double d9 = Double.MAX_VALUE;
            boolean z9 = true;
            for (int i12 = 0; i12 < size && z9; i12 += 2) {
                double dAbs = Math.abs(list.get(i12).floatValue() - fArr[0]);
                if (dAbs < 1.0d) {
                    list.set(i12 + 1, Float.valueOf(fArr[1]));
                    d9 = dAbs;
                }
                z9 = d9 > dAbs;
            }
        }
        pointsChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f9, i9, i10);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }
}
