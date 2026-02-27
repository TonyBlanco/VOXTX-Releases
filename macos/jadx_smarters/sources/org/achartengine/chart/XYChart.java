package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.BasicStroke;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;
import org.achartengine.util.MathHelper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class XYChart extends AbstractChart {
    private Point mCenter;
    protected XYMultipleSeriesDataset mDataset;
    protected transient Paint mGridPaint;
    protected XYMultipleSeriesRenderer mRenderer;
    private float mScale;
    private Rect mScreenR;
    private float mTranslate;
    private final Map<Integer, double[]> mCalcRange = new HashMap();
    private Map<Integer, List<ClickableArea>> clickableAreas = new HashMap();

    public XYChart() {
    }

    public XYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    private int getLabelLinePos(Paint.Align align) {
        return align == Paint.Align.LEFT ? -4 : 4;
    }

    private List<Double> getValidLabels(List<Double> list) {
        ArrayList arrayList = new ArrayList(list);
        for (Double d9 : list) {
            if (d9.isNaN()) {
                arrayList.remove(d9);
            }
        }
        return arrayList;
    }

    private void setStroke(Paint.Cap cap, Paint.Join join, float f9, Paint.Style style, PathEffect pathEffect, Paint paint) {
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f9);
        paint.setPathEffect(pathEffect);
        paint.setStyle(style);
    }

    private void transform(Canvas canvas, float f9, boolean z9) {
        if (z9) {
            float f10 = this.mScale;
            canvas.scale(1.0f / f10, f10);
            float f11 = this.mTranslate;
            canvas.translate(f11, -f11);
            canvas.rotate(-f9, this.mCenter.getX(), this.mCenter.getY());
            return;
        }
        canvas.rotate(f9, this.mCenter.getX(), this.mCenter.getY());
        float f12 = this.mTranslate;
        canvas.translate(-f12, f12);
        float f13 = this.mScale;
        canvas.scale(f13, 1.0f / f13);
    }

    public abstract ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f9, int i9, int i10);

    /* JADX WARN: Removed duplicated region for block: B:178:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    @Override // org.achartengine.chart.AbstractChart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r55, int r56, int r57, int r58, int r59, android.graphics.Paint r60) {
        /*
            Method dump skipped, instruction units count: 3080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.draw(android.graphics.Canvas, int, int, int, int, android.graphics.Paint):void");
    }

    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, XYSeriesRenderer xYSeriesRenderer, Paint paint, List<Float> list, int i9, int i10) {
        int i11;
        Float f9;
        if (list.size() <= 2) {
            for (int i12 = 0; i12 < list.size(); i12 += 2) {
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY((i12 / 2) + i10)), list.get(i12).floatValue(), list.get(i12 + 1).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            return;
        }
        float fFloatValue = list.get(0).floatValue();
        float fFloatValue2 = list.get(1).floatValue();
        for (int i13 = 0; i13 < list.size(); i13 += 2) {
            if (i13 == 2) {
                i11 = 3;
                if (Math.abs(list.get(2).floatValue() - list.get(0).floatValue()) > xYSeriesRenderer.getDisplayChartValuesDistance() || Math.abs(list.get(3).floatValue() - list.get(1).floatValue()) > xYSeriesRenderer.getDisplayChartValuesDistance()) {
                    drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i10)), list.get(0).floatValue(), list.get(1).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY(i10 + 1)), list.get(2).floatValue(), list.get(3).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    f9 = list.get(2);
                    fFloatValue = f9.floatValue();
                    fFloatValue2 = list.get(i11).floatValue();
                }
            } else if (i13 > 2 && (Math.abs(list.get(i13).floatValue() - fFloatValue) > xYSeriesRenderer.getDisplayChartValuesDistance() || Math.abs(list.get(i13 + 1).floatValue() - fFloatValue2) > xYSeriesRenderer.getDisplayChartValuesDistance())) {
                i11 = i13 + 1;
                drawText(canvas, getLabel(xYSeriesRenderer.getChartValuesFormat(), xYSeries.getY((i13 / 2) + i10)), list.get(i13).floatValue(), list.get(i11).floatValue() - xYSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                f9 = list.get(i13);
                fFloatValue = f9.floatValue();
                fFloatValue2 = list.get(i11).floatValue();
            }
        }
    }

    public void drawPoints(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        ScatterChart pointsChart;
        if (!isRenderPoints(xYSeriesRenderer) || (pointsChart = getPointsChart()) == null) {
            return;
        }
        pointsChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f9, i9, i10);
    }

    public abstract void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10);

    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, XYMultipleSeriesRenderer.Orientation orientation, int i10) {
        BasicStroke stroke = xYSeriesRenderer.getStroke();
        Paint.Cap strokeCap = paint.getStrokeCap();
        Paint.Join strokeJoin = paint.getStrokeJoin();
        float strokeMiter = paint.getStrokeMiter();
        PathEffect pathEffect = paint.getPathEffect();
        Paint.Style style = paint.getStyle();
        if (stroke != null) {
            setStroke(stroke.getCap(), stroke.getJoin(), stroke.getMiter(), Paint.Style.FILL_AND_STROKE, stroke.getIntervals() != null ? new DashPathEffect(stroke.getIntervals(), stroke.getPhase()) : null, paint);
        }
        drawSeries(canvas, paint, list, xYSeriesRenderer, f9, i9, i10);
        drawPoints(canvas, paint, list, xYSeriesRenderer, f9, i9, i10);
        paint.setTextSize(xYSeriesRenderer.getChartValuesTextSize());
        paint.setTextAlign(orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL ? Paint.Align.CENTER : Paint.Align.LEFT);
        if (xYSeriesRenderer.isDisplayChartValues()) {
            paint.setTextAlign(xYSeriesRenderer.getChartValuesTextAlign());
            drawChartValuesText(canvas, xYSeries, xYSeriesRenderer, paint, list, i9, i10);
        }
        if (stroke != null) {
            setStroke(strokeCap, strokeJoin, strokeMiter, style, pathEffect, paint);
        }
    }

    public void drawText(Canvas canvas, String str, float f9, float f10, Paint paint, float f11) {
        float f12 = (-this.mRenderer.getOrientation().getAngle()) + f11;
        if (f12 != 0.0f) {
            canvas.rotate(f12, f9, f10);
        }
        drawString(canvas, str, f9, f10, paint);
        if (f12 != 0.0f) {
            canvas.rotate(-f12, f9, f10);
        }
    }

    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i9, int i10, int i11, double d9, double d10, double d11) {
        float f9;
        int size = list.size();
        boolean zIsShowXLabels = this.mRenderer.isShowXLabels();
        boolean zIsShowGridY = this.mRenderer.isShowGridY();
        if (zIsShowGridY) {
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
        }
        boolean zIsShowTickMarks = this.mRenderer.isShowTickMarks();
        for (int i12 = 0; i12 < size; i12++) {
            double dDoubleValue = list.get(i12).doubleValue();
            float f10 = (float) (((double) i9) + ((dDoubleValue - d10) * d9));
            if (zIsShowXLabels) {
                paint.setColor(this.mRenderer.getXLabelsColor());
                if (zIsShowTickMarks) {
                    float f11 = i11;
                    canvas.drawLine(f10, f11, f10, f11 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                }
                f9 = f10;
                drawText(canvas, getLabel(this.mRenderer.getXLabelFormat(), dDoubleValue), f10, i11 + ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
            } else {
                f9 = f10;
            }
            if (zIsShowGridY) {
                this.mGridPaint.setColor(this.mRenderer.getGridColor(0));
                canvas.drawLine(f9, i11, f9, i10, this.mGridPaint);
            }
        }
        drawXTextLabels(dArr, canvas, paint, zIsShowXLabels, i9, i10, i11, d9, d10, d11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drawXTextLabels(java.lang.Double[] r20, android.graphics.Canvas r21, android.graphics.Paint r22, boolean r23, int r24, int r25, int r26, double r27, double r29, double r31) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r22
            r10 = r26
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            boolean r11 = r0.isShowCustomTextGridX()
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            boolean r12 = r0.isShowTickMarks()
            if (r23 == 0) goto Lbe
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            int r0 = r0.getXLabelsColor()
            r9.setColor(r0)
            int r13 = r8.length
            r14 = 0
            r15 = 0
        L22:
            if (r15 >= r13) goto Lbe
            r6 = r8[r15]
            double r0 = r6.doubleValue()
            int r2 = (r29 > r0 ? 1 : (r29 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb8
            double r0 = r6.doubleValue()
            int r2 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r2 > 0) goto Lb8
            r5 = r24
            double r0 = (double) r5
            double r2 = r6.doubleValue()
            double r2 = r2 - r29
            double r2 = r2 * r27
            double r0 = r0 + r2
            float r4 = (float) r0
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            int r0 = r0.getXLabelsColor()
            r9.setColor(r0)
            r16 = 1077936128(0x40400000, float:3.0)
            if (r12 == 0) goto L69
            float r2 = (float) r10
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            float r0 = r0.getLabelsTextSize()
            float r0 = r0 / r16
            float r17 = r2 + r0
            r0 = r21
            r1 = r4
            r3 = r4
            r18 = r4
            r4 = r17
            r5 = r22
            r0.drawLine(r1, r2, r3, r4, r5)
            goto L6b
        L69:
            r18 = r4
        L6b:
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            java.lang.String r2 = r0.getXTextLabel(r6)
            float r6 = (float) r10
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            float r0 = r0.getLabelsTextSize()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r0 * r1
            float r0 = r0 / r16
            float r0 = r0 + r6
            org.achartengine.renderer.XYMultipleSeriesRenderer r1 = r7.mRenderer
            float r1 = r1.getXLabelsPadding()
            float r4 = r0 + r1
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            float r16 = r0.getXLabelsAngle()
            r0 = r19
            r1 = r21
            r3 = r18
            r5 = r22
            r17 = r6
            r6 = r16
            r0.drawText(r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto Lb8
            org.achartengine.renderer.XYMultipleSeriesRenderer r0 = r7.mRenderer
            int r0 = r0.getGridColor(r14)
            r9.setColor(r0)
            r6 = r25
            float r4 = (float) r6
            r0 = r21
            r1 = r18
            r2 = r17
            r3 = r18
            r5 = r22
            r0.drawLine(r1, r2, r3, r4, r5)
            goto Lba
        Lb8:
            r6 = r25
        Lba:
            int r15 = r15 + 1
            goto L22
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.drawXTextLabels(java.lang.Double[], android.graphics.Canvas, android.graphics.Paint, boolean, int, int, int, double, double, double):void");
    }

    public void drawYLabels(Map<Integer, List<Double>> map, Canvas canvas, Paint paint, int i9, int i10, int i11, int i12, double[] dArr, double[] dArr2) {
        int i13;
        boolean z9;
        int i14;
        int i15;
        boolean z10;
        XYMultipleSeriesRenderer.Orientation orientation;
        int i16;
        int i17;
        int i18;
        XYMultipleSeriesRenderer.Orientation orientation2;
        int i19;
        int i20;
        double d9;
        Paint paint2 = paint;
        int i21 = i10;
        int i22 = i11;
        XYMultipleSeriesRenderer.Orientation orientation3 = this.mRenderer.getOrientation();
        boolean zIsShowGridX = this.mRenderer.isShowGridX();
        if (zIsShowGridX) {
            this.mGridPaint.setStyle(Paint.Style.STROKE);
            this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
        }
        boolean zIsShowYLabels = this.mRenderer.isShowYLabels();
        boolean zIsShowTickMarks = this.mRenderer.isShowTickMarks();
        int i23 = i9;
        int i24 = 0;
        while (i24 < i23) {
            paint2.setTextAlign(this.mRenderer.getYLabelsAlign(i24));
            List<Double> list = map.get(Integer.valueOf(i24));
            int size = list.size();
            int i25 = 0;
            while (i25 < size) {
                Double d10 = list.get(i25);
                List<Double> list2 = list;
                double dDoubleValue = d10.doubleValue();
                Paint.Align yAxisAlign = this.mRenderer.getYAxisAlign(i24);
                int i26 = i25;
                if (this.mRenderer.getYTextLabel(d10, i24) != null) {
                    z9 = true;
                    i13 = i12;
                } else {
                    i13 = i12;
                    z9 = false;
                }
                float f9 = (float) (((double) i13) - (dArr[i24] * (dDoubleValue - dArr2[i24])));
                if (orientation3 == XYMultipleSeriesRenderer.Orientation.HORIZONTAL) {
                    if (!zIsShowYLabels || z9) {
                        i14 = i10;
                        i18 = i11;
                        i15 = size;
                        orientation2 = orientation3;
                        z10 = zIsShowGridX;
                        i19 = i24;
                    } else {
                        paint2.setColor(this.mRenderer.getYLabelsColor(i24));
                        if (yAxisAlign == Paint.Align.LEFT) {
                            if (zIsShowTickMarks) {
                                i14 = i10;
                                i15 = size;
                                orientation2 = orientation3;
                                z10 = zIsShowGridX;
                                d9 = dDoubleValue;
                                i20 = i24;
                                canvas.drawLine(getLabelLinePos(yAxisAlign) + i14, f9, i14, f9, paint);
                            } else {
                                i14 = i10;
                                i15 = size;
                                i20 = i24;
                                orientation2 = orientation3;
                                z10 = zIsShowGridX;
                                d9 = dDoubleValue;
                            }
                            drawText(canvas, getLabel(this.mRenderer.getYLabelFormat(i20), d9), i14 - this.mRenderer.getYLabelsPadding(), f9 - this.mRenderer.getYLabelsVerticalPadding(), paint, this.mRenderer.getYLabelsAngle());
                            i19 = i20;
                            i18 = i11;
                        } else {
                            i14 = i10;
                            i15 = size;
                            int i27 = i24;
                            orientation2 = orientation3;
                            z10 = zIsShowGridX;
                            if (zIsShowTickMarks) {
                                float labelLinePos = getLabelLinePos(yAxisAlign) + i11;
                                i18 = i11;
                                canvas.drawLine(i11, f9, labelLinePos, f9, paint);
                            } else {
                                i18 = i11;
                            }
                            i19 = i27;
                            drawText(canvas, getLabel(this.mRenderer.getYLabelFormat(i27), dDoubleValue), i18 + this.mRenderer.getYLabelsPadding(), f9 - this.mRenderer.getYLabelsVerticalPadding(), paint, this.mRenderer.getYLabelsAngle());
                        }
                    }
                    if (z10) {
                        this.mGridPaint.setColor(this.mRenderer.getGridColor(i19));
                        canvas.drawLine(i14, f9, i18, f9, this.mGridPaint);
                    }
                    i16 = i19;
                    i17 = i18;
                    orientation = orientation2;
                } else {
                    i14 = i10;
                    i15 = size;
                    XYMultipleSeriesRenderer.Orientation orientation4 = orientation3;
                    z10 = zIsShowGridX;
                    if (orientation4 == XYMultipleSeriesRenderer.Orientation.VERTICAL) {
                        if (!zIsShowYLabels || z9) {
                            orientation = orientation4;
                            i16 = i24;
                            i17 = i11;
                        } else {
                            paint2.setColor(this.mRenderer.getYLabelsColor(i24));
                            if (zIsShowTickMarks) {
                                orientation = orientation4;
                                i16 = i24;
                                canvas.drawLine(i11 - getLabelLinePos(yAxisAlign), f9, i11, f9, paint);
                            } else {
                                orientation = orientation4;
                                i16 = i24;
                            }
                            i17 = i11;
                            drawText(canvas, getLabel(this.mRenderer.getLabelFormat(), dDoubleValue), i11 + 10 + this.mRenderer.getYLabelsPadding(), f9 - this.mRenderer.getYLabelsVerticalPadding(), paint, this.mRenderer.getYLabelsAngle());
                        }
                        if (z10) {
                            this.mGridPaint.setColor(this.mRenderer.getGridColor(i16));
                            if (zIsShowTickMarks) {
                                canvas.drawLine(i17, f9, i14, f9, this.mGridPaint);
                            }
                        }
                    } else {
                        orientation = orientation4;
                        i16 = i24;
                        i17 = i11;
                    }
                }
                i25 = i26 + 1;
                i24 = i16;
                i21 = i14;
                i22 = i17;
                orientation3 = orientation;
                list = list2;
                size = i15;
                zIsShowGridX = z10;
                paint2 = paint;
            }
            i24++;
            paint2 = paint;
            i23 = i9;
            i22 = i22;
            zIsShowGridX = zIsShowGridX;
        }
    }

    public double[] getCalcRange(int i9) {
        return this.mCalcRange.get(Integer.valueOf(i9));
    }

    public abstract String getChartType();

    public XYMultipleSeriesDataset getDataset() {
        return this.mDataset;
    }

    public double getDefaultMinimum() {
        return Double.MAX_VALUE;
    }

    public ScatterChart getPointsChart() {
        return null;
    }

    public XYMultipleSeriesRenderer getRenderer() {
        return this.mRenderer;
    }

    public Rect getScreenR() {
        return this.mScreenR;
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        RectF rect;
        Map<Integer, List<ClickableArea>> map = this.clickableAreas;
        if (map != null) {
            for (int size = map.size() - 1; size >= 0; size--) {
                if (this.clickableAreas.get(Integer.valueOf(size)) != null) {
                    int i9 = 0;
                    for (ClickableArea clickableArea : this.clickableAreas.get(Integer.valueOf(size))) {
                        if (clickableArea != null && (rect = clickableArea.getRect()) != null && rect.contains(point.getX(), point.getY())) {
                            return new SeriesSelection(size, i9, clickableArea.getX(), clickableArea.getY());
                        }
                        i9++;
                    }
                }
            }
        }
        return super.getSeriesAndPointForScreenCoordinate(point);
    }

    public List<Double> getXLabels(double d9, double d10, int i9) {
        return MathHelper.getLabels(d9, d10, i9);
    }

    public Map<Integer, List<Double>> getYLabels(double[] dArr, double[] dArr2, int i9) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < i9; i10++) {
            map.put(Integer.valueOf(i10), getValidLabels(MathHelper.getLabels(dArr[i10], dArr2[i10], this.mRenderer.getYLabels())));
        }
        return map;
    }

    public boolean isRenderNullValues() {
        return false;
    }

    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return false;
    }

    public void setCalcRange(double[] dArr, int i9) {
        this.mCalcRange.put(Integer.valueOf(i9), dArr);
    }

    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    public void setScreenR(Rect rect) {
        this.mScreenR = rect;
    }

    public double[] toRealPoint(float f9, float f10) {
        return toRealPoint(f9, f10, 0);
    }

    public double[] toRealPoint(float f9, float f10, int i9) {
        double[] calcRange;
        double xAxisMin = this.mRenderer.getXAxisMin(i9);
        double xAxisMax = this.mRenderer.getXAxisMax(i9);
        double yAxisMin = this.mRenderer.getYAxisMin(i9);
        double yAxisMax = this.mRenderer.getYAxisMax(i9);
        if ((!this.mRenderer.isMinXSet(i9) || !this.mRenderer.isMaxXSet(i9) || !this.mRenderer.isMinYSet(i9) || !this.mRenderer.isMaxYSet(i9)) && (calcRange = getCalcRange(i9)) != null) {
            xAxisMin = calcRange[0];
            xAxisMax = calcRange[1];
            yAxisMin = calcRange[2];
            yAxisMax = calcRange[3];
        }
        Rect rect = this.mScreenR;
        if (rect == null) {
            return new double[]{f9, f10};
        }
        double dWidth = ((((double) (f9 - rect.left)) * (xAxisMax - xAxisMin)) / ((double) rect.width())) + xAxisMin;
        Rect rect2 = this.mScreenR;
        return new double[]{dWidth, ((((double) ((rect2.top + rect2.height()) - f10)) * (yAxisMax - yAxisMin)) / ((double) this.mScreenR.height())) + yAxisMin};
    }

    public double[] toScreenPoint(double[] dArr) {
        return toScreenPoint(dArr, 0);
    }

    public double[] toScreenPoint(double[] dArr, int i9) {
        double xAxisMin = this.mRenderer.getXAxisMin(i9);
        double xAxisMax = this.mRenderer.getXAxisMax(i9);
        double yAxisMin = this.mRenderer.getYAxisMin(i9);
        double yAxisMax = this.mRenderer.getYAxisMax(i9);
        if (!this.mRenderer.isMinXSet(i9) || !this.mRenderer.isMaxXSet(i9) || !this.mRenderer.isMinYSet(i9) || !this.mRenderer.isMaxYSet(i9)) {
            double[] calcRange = getCalcRange(i9);
            xAxisMin = calcRange[0];
            xAxisMax = calcRange[1];
            yAxisMin = calcRange[2];
            yAxisMax = calcRange[3];
        }
        Rect rect = this.mScreenR;
        if (rect == null) {
            return dArr;
        }
        double dWidth = ((dArr[0] - xAxisMin) * ((double) rect.width())) / (xAxisMax - xAxisMin);
        Rect rect2 = this.mScreenR;
        return new double[]{dWidth + ((double) rect2.left), (((yAxisMax - dArr[1]) * ((double) rect2.height())) / (yAxisMax - yAxisMin)) + ((double) this.mScreenR.top)};
    }
}
