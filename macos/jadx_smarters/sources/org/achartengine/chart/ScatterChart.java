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
public class ScatterChart extends XYChart {
    private static final int SHAPE_WIDTH = 10;
    private static final float SIZE = 3.0f;
    public static final String TYPE = "Scatter";
    private float size;

    /* JADX INFO: renamed from: org.achartengine.chart.ScatterChart$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$achartengine$chart$PointStyle;

        static {
            int[] iArr = new int[PointStyle.values().length];
            $SwitchMap$org$achartengine$chart$PointStyle = iArr;
            try {
                iArr[PointStyle.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.SQUARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.POINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ScatterChart() {
        this.size = SIZE;
    }

    public ScatterChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.size = SIZE;
        this.size = xYMultipleSeriesRenderer.getPointSize();
    }

    private void drawCircle(Canvas canvas, Paint paint, float f9, float f10) {
        canvas.drawCircle(f9, f10, this.size, paint);
    }

    private void drawDiamond(Canvas canvas, Paint paint, float[] fArr, float f9, float f10) {
        fArr[0] = f9;
        float f11 = this.size;
        fArr[1] = f10 - f11;
        fArr[2] = f9 - f11;
        fArr[3] = f10;
        fArr[4] = f9;
        fArr[5] = f10 + f11;
        fArr[6] = f9 + f11;
        fArr[7] = f10;
        drawPath(canvas, fArr, paint, true);
    }

    private void drawSquare(Canvas canvas, Paint paint, float f9, float f10) {
        float f11 = this.size;
        canvas.drawRect(f9 - f11, f10 - f11, f9 + f11, f10 + f11, paint);
    }

    private void drawTriangle(Canvas canvas, Paint paint, float[] fArr, float f9, float f10) {
        fArr[0] = f9;
        float f11 = this.size;
        fArr[1] = (f10 - f11) - (f11 / 2.0f);
        fArr[2] = f9 - f11;
        float f12 = f10 + f11;
        fArr[3] = f12;
        fArr[4] = f9 + f11;
        fArr[5] = f12;
        drawPath(canvas, fArr, paint, true);
    }

    private void drawX(Canvas canvas, Paint paint, float f9, float f10) {
        float f11 = this.size;
        canvas.drawLine(f9 - f11, f10 - f11, f9 + f11, f10 + f11, paint);
        float f12 = this.size;
        canvas.drawLine(f9 + f12, f10 - f12, f9 - f12, f10 + f12, paint);
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
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        paint.setStyle(xYSeriesRenderer.isFillPoints() ? Paint.Style.FILL : Paint.Style.STROKE);
        switch (AnonymousClass1.$SwitchMap$org$achartengine$chart$PointStyle[xYSeriesRenderer.getPointStyle().ordinal()]) {
            case 1:
                drawX(canvas, paint, f9 + 10.0f, f10);
                break;
            case 2:
                drawCircle(canvas, paint, f9 + 10.0f, f10);
                break;
            case 3:
                drawTriangle(canvas, paint, new float[6], f9 + 10.0f, f10);
                break;
            case 4:
                drawSquare(canvas, paint, f9 + 10.0f, f10);
                break;
            case 5:
                drawDiamond(canvas, paint, new float[8], f9 + 10.0f, f10);
                break;
            case 6:
                canvas.drawPoint(f9 + 10.0f, f10, paint);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        Paint.Style style;
        paint.setColor(xYSeriesRenderer.getColor());
        float strokeWidth = paint.getStrokeWidth();
        if (xYSeriesRenderer.isFillPoints()) {
            style = Paint.Style.FILL;
        } else {
            paint.setStrokeWidth(xYSeriesRenderer.getPointStrokeWidth());
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
        int size = list.size();
        int i11 = 0;
        switch (AnonymousClass1.$SwitchMap$org$achartengine$chart$PointStyle[xYSeriesRenderer.getPointStyle().ordinal()]) {
            case 1:
                paint.setStrokeWidth(xYSeriesRenderer.getPointStrokeWidth());
                while (i11 < size) {
                    drawX(canvas, paint, list.get(i11).floatValue(), list.get(i11 + 1).floatValue());
                    i11 += 2;
                }
                break;
            case 2:
                while (i11 < size) {
                    drawCircle(canvas, paint, list.get(i11).floatValue(), list.get(i11 + 1).floatValue());
                    i11 += 2;
                }
                break;
            case 3:
                float[] fArr = new float[6];
                while (i11 < size) {
                    drawTriangle(canvas, paint, fArr, list.get(i11).floatValue(), list.get(i11 + 1).floatValue());
                    i11 += 2;
                }
                break;
            case 4:
                while (i11 < size) {
                    drawSquare(canvas, paint, list.get(i11).floatValue(), list.get(i11 + 1).floatValue());
                    i11 += 2;
                }
                break;
            case 5:
                float[] fArr2 = new float[8];
                while (i11 < size) {
                    drawDiamond(canvas, paint, fArr2, list.get(i11).floatValue(), list.get(i11 + 1).floatValue());
                    i11 += 2;
                }
                break;
            case 6:
                while (i11 < size) {
                    canvas.drawPoint(list.get(i11).floatValue(), list.get(i11 + 1).floatValue(), paint);
                    i11 += 2;
                }
                break;
        }
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return 10;
    }

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.size = xYMultipleSeriesRenderer.getPointSize();
    }
}
