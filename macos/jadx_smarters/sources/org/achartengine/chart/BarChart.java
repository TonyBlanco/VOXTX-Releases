package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class BarChart extends XYChart {
    private static final int SHAPE_WIDTH = 12;
    public static final String TYPE = "Bar";
    private List<Float> mPreviousSeriesPoints;
    protected Type mType;

    public enum Type {
        DEFAULT,
        STACKED,
        HEAPED
    }

    public BarChart() {
        this.mType = Type.DEFAULT;
    }

    public BarChart(Type type) {
        Type type2 = Type.DEFAULT;
        this.mType = type;
    }

    public BarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        Type type2 = Type.DEFAULT;
        this.mType = type;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f9, int i9, int i10) {
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        ClickableArea[] clickableAreaArr = new ClickableArea[size / 2];
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i11 = 0; i11 < size; i11 += 2) {
            float fFloatValue = list.get(i11).floatValue();
            int i12 = i11 + 1;
            float fFloatValue2 = list.get(i12).floatValue();
            Type type = this.mType;
            if (type == Type.STACKED || type == Type.HEAPED) {
                clickableAreaArr[i11 / 2] = new ClickableArea(new RectF(fFloatValue - halfDiffX, Math.min(fFloatValue2, f9), fFloatValue + halfDiffX, Math.max(fFloatValue2, f9)), list2.get(i11).doubleValue(), list2.get(i12).doubleValue());
            } else {
                float f10 = (fFloatValue - (seriesCount * halfDiffX)) + (i9 * 2 * halfDiffX);
                clickableAreaArr[i11 / 2] = new ClickableArea(new RectF(f10, Math.min(fFloatValue2, f9), (2.0f * halfDiffX) + f10, Math.max(fFloatValue2, f9)), list2.get(i11).doubleValue(), list2.get(i12).doubleValue());
            }
        }
        return clickableAreaArr;
    }

    public void drawBar(Canvas canvas, float f9, float f10, float f11, float f12, float f13, int i9, int i10, Paint paint) {
        float f14;
        float f15;
        int scaleNumber = this.mDataset.getSeriesAt(i10).getScaleNumber();
        Type type = this.mType;
        if (type == Type.STACKED || type == Type.HEAPED) {
            f14 = f9 - f13;
            f15 = f11 + f13;
        } else {
            f14 = (f9 - (i9 * f13)) + (i10 * 2 * f13);
            f15 = f14 + (2.0f * f13);
        }
        drawBar(canvas, f14, f12, f15, f10, scaleNumber, i10, paint);
    }

    public void drawBar(Canvas canvas, float f9, float f10, float f11, float f12, int i9, int i10, Paint paint) {
        float f13;
        float f14;
        float f15;
        float f16;
        int gradientPartialColor;
        if (f9 > f11) {
            f14 = f9;
            f13 = f11;
        } else {
            f13 = f9;
            f14 = f11;
        }
        if (f10 > f12) {
            f16 = f10;
            f15 = f12;
        } else {
            f15 = f10;
            f16 = f12;
        }
        SimpleSeriesRenderer seriesRendererAt = this.mRenderer.getSeriesRendererAt(i10);
        if (!seriesRendererAt.isGradientEnabled()) {
            if (Math.abs(f15 - f16) < 1.0f) {
                f16 = f15 < f16 ? f15 + 1.0f : f15 - 1.0f;
            }
            canvas.drawRect(Math.round(f13), Math.round(f15), Math.round(f14), Math.round(f16), paint);
            return;
        }
        float f17 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStopValue()}, i9)[1];
        float f18 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStartValue()}, i9)[1];
        float fMax = Math.max(f17, Math.min(f15, f16));
        float fMin = Math.min(f18, Math.max(f15, f16));
        int gradientStopColor = seriesRendererAt.getGradientStopColor();
        int gradientStartColor = seriesRendererAt.getGradientStartColor();
        if (f15 < f17) {
            paint.setColor(gradientStopColor);
            canvas.drawRect(Math.round(f13), Math.round(f15), Math.round(f14), Math.round(fMax), paint);
            gradientPartialColor = gradientStopColor;
        } else {
            gradientPartialColor = getGradientPartialColor(gradientStopColor, gradientStartColor, (f18 - fMax) / (f18 - f17));
        }
        if (f16 > f18) {
            paint.setColor(gradientStartColor);
            canvas.drawRect(Math.round(f13), Math.round(fMin), Math.round(f14), Math.round(f16), paint);
        } else {
            gradientStartColor = getGradientPartialColor(gradientStartColor, gradientStopColor, (fMin - f17) / (f18 - f17));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{gradientStartColor, gradientPartialColor});
        gradientDrawable.setBounds(Math.round(f13), Math.round(fMax), Math.round(f14), Math.round(fMin));
        gradientDrawable.draw(canvas);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i9, int i10) {
        String label;
        float fFloatValue;
        float chartValuesSpacing;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        for (int i11 = 0; i11 < size; i11 += 2) {
            double y9 = xYSeries.getY(i10 + (i11 / 2));
            if (!isNullValue(y9)) {
                float fFloatValue2 = list.get(i11).floatValue();
                if (this.mType == Type.DEFAULT) {
                    fFloatValue2 += ((i9 * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX);
                }
                float f9 = fFloatValue2;
                if (y9 >= 0.0d) {
                    label = getLabel(xYSeriesRenderer.getChartValuesFormat(), y9);
                    fFloatValue = list.get(i11 + 1).floatValue();
                    chartValuesSpacing = xYSeriesRenderer.getChartValuesSpacing();
                } else {
                    label = getLabel(xYSeriesRenderer.getChartValuesFormat(), y9);
                    fFloatValue = list.get(i11 + 1).floatValue() + xYSeriesRenderer.getChartValuesTextSize() + xYSeriesRenderer.getChartValuesSpacing();
                    chartValuesSpacing = 3.0f;
                }
                drawText(canvas, label, f9, fFloatValue - chartValuesSpacing, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint) {
        canvas.drawRect(f9, f10 - 6.0f, f9 + 12.0f, f10 + 6.0f, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        int i11;
        BarChart barChart;
        Canvas canvas2;
        float f10;
        float fFloatValue;
        float f11;
        int i12;
        int i13;
        int seriesCount = this.mDataset.getSeriesCount();
        int size = list.size();
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(list, size, seriesCount);
        int i14 = 0;
        while (i14 < size) {
            float fFloatValue2 = list.get(i14).floatValue();
            int i15 = i14 + 1;
            float fFloatValue3 = list.get(i15).floatValue();
            if (this.mType != Type.HEAPED || i9 <= 0) {
                i11 = i14;
                barChart = this;
                canvas2 = canvas;
                f10 = fFloatValue2;
                fFloatValue = f9;
                f11 = halfDiffX;
                i12 = seriesCount;
                i13 = i9;
            } else {
                fFloatValue = this.mPreviousSeriesPoints.get(i15).floatValue();
                fFloatValue3 += fFloatValue - f9;
                list.set(i15, Float.valueOf(fFloatValue3));
                barChart = this;
                canvas2 = canvas;
                f10 = fFloatValue2;
                f11 = halfDiffX;
                i12 = seriesCount;
                i13 = i9;
                i11 = i14;
            }
            barChart.drawBar(canvas2, f10, fFloatValue, fFloatValue2, fFloatValue3, f11, i12, i13, paint);
            i14 = i11 + 2;
        }
        paint.setColor(xYSeriesRenderer.getColor());
        this.mPreviousSeriesPoints = list;
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public float getCoeficient() {
        return 1.0f;
    }

    @Override // org.achartengine.chart.XYChart
    public double getDefaultMinimum() {
        return 0.0d;
    }

    public int getGradientPartialColor(int i9, int i10, float f9) {
        float f10 = 1.0f - f9;
        return Color.argb(Math.round((Color.alpha(i9) * f9) + (Color.alpha(i10) * f10)), Math.round((Color.red(i9) * f9) + (Color.red(i10) * f10)), Math.round((Color.green(i9) * f9) + (Color.green(i10) * f10)), Math.round((f9 * Color.blue(i9)) + (f10 * Color.blue(i10))));
    }

    public float getHalfDiffX(List<Float> list, int i9, int i10) {
        float barWidth = this.mRenderer.getBarWidth();
        if (barWidth > 0.0f) {
            return barWidth / 2.0f;
        }
        float fFloatValue = (list.get(i9 - 2).floatValue() - list.get(0).floatValue()) / (i9 > 2 ? i9 - 2 : i9);
        if (fFloatValue == 0.0f) {
            fFloatValue = 10.0f;
        }
        Type type = this.mType;
        if (type != Type.STACKED && type != Type.HEAPED) {
            fFloatValue /= i10;
        }
        return (float) (((double) fFloatValue) / (((double) getCoeficient()) * (this.mRenderer.getBarSpacing() + 1.0d)));
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return 12;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderNullValues() {
        return true;
    }
}
