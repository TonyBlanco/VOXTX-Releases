package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractChart implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[PHI: r6
      0x0054: PHI (r6v4 float) = (r6v1 float), (r6v5 float) binds: [B:33:0x0073, B:24:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 float) = (r3v0 float), (r3v5 float) binds: [B:14:0x0036, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r1 r3 r4
      0x001e: PHI (r1v6 float) = (r1v4 float), (r1v13 float) binds: [B:17:0x003c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r3v1 float) = (r3v0 float), (r3v5 float) binds: [B:17:0x003c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r4v2 float) = (r4v1 float), (r4v4 float) binds: [B:17:0x003c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float[] calculateDrawPoints(float r6, float r7, float r8, float r9, int r10, int r11) {
        /*
            float r10 = (float) r10
            r0 = 0
            int r1 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r1 <= 0) goto L26
            float r1 = r9 - r7
            float r2 = r8 - r6
            float r1 = r1 / r2
            float r2 = r10 - r7
            float r3 = r1 * r6
            float r2 = r2 + r3
            float r2 = r2 / r1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
        L15:
            float r1 = r7 - r3
            r2 = 0
            goto L43
        L19:
            float r4 = (float) r11
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L24
        L1e:
            float r1 = r1 * r4
            float r1 = r1 + r7
            float r1 = r1 - r3
            r2 = r4
            goto L43
        L24:
            r1 = r10
            goto L43
        L26:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 >= 0) goto L41
            float r1 = r9 - r7
            float r2 = r8 - r6
            float r1 = r1 / r2
            float r2 = -r7
            float r3 = r1 * r6
            float r2 = r2 + r3
            float r2 = r2 / r1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L39
            goto L15
        L39:
            float r4 = (float) r11
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L3f
            goto L1e
        L3f:
            r1 = 0
            goto L43
        L41:
            r2 = r6
            r1 = r7
        L43:
            int r3 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r3 <= 0) goto L65
            float r9 = r9 - r7
            float r8 = r8 - r6
            float r9 = r9 / r8
            float r8 = r10 - r7
            float r6 = r6 * r9
            float r8 = r8 + r6
            float r8 = r8 / r9
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 >= 0) goto L58
        L54:
            float r7 = r7 - r6
            r9 = r7
            r8 = 0
            goto L82
        L58:
            float r11 = (float) r11
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 <= 0) goto L63
            float r9 = r9 * r11
            float r9 = r9 + r7
            float r9 = r9 - r6
            r8 = r11
            goto L82
        L63:
            r9 = r10
            goto L82
        L65:
            int r10 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r10 >= 0) goto L82
            float r9 = r9 - r7
            float r8 = r8 - r6
            float r9 = r9 / r8
            float r8 = -r7
            float r6 = r6 * r9
            float r8 = r8 + r6
            float r8 = r8 / r9
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 >= 0) goto L76
            goto L54
        L76:
            float r10 = (float) r11
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L81
            float r9 = r9 * r10
            float r9 = r9 + r7
            float r9 = r9 - r6
            r8 = r10
            goto L82
        L81:
            r9 = 0
        L82:
            r6 = 4
            float[] r6 = new float[r6]
            r7 = 0
            r6[r7] = r2
            r7 = 1
            r6[r7] = r1
            r7 = 2
            r6[r7] = r8
            r7 = 3
            r6[r7] = r9
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.AbstractChart.calculateDrawPoints(float, float, float, float, int, int):float[]");
    }

    private String getFitText(String str, float f9, Paint paint) {
        int length = str.length();
        String str2 = str;
        int i9 = 0;
        while (paint.measureText(str2) > f9 && i9 < length) {
            i9++;
            str2 = str.substring(0, length - i9) + "...";
        }
        return i9 == length ? "..." : str2;
    }

    public abstract void draw(Canvas canvas, int i9, int i10, int i11, int i12, Paint paint);

    public void drawBackground(DefaultRenderer defaultRenderer, Canvas canvas, int i9, int i10, int i11, int i12, Paint paint, boolean z9, int i13) {
        if (defaultRenderer.isApplyBackgroundColor() || z9) {
            if (z9) {
                paint.setColor(i13);
            } else {
                paint.setColor(defaultRenderer.getBackgroundColor());
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i9, i10, i9 + i11, i10 + i12, paint);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void drawLabel(android.graphics.Canvas r18, java.lang.String r19, org.achartengine.renderer.DefaultRenderer r20, java.util.List<android.graphics.RectF> r21, int r22, int r23, float r24, float r25, float r26, float r27, int r28, int r29, int r30, android.graphics.Paint r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.AbstractChart.drawLabel(android.graphics.Canvas, java.lang.String, org.achartengine.renderer.DefaultRenderer, java.util.List, int, int, float, float, float, float, int, int, int, android.graphics.Paint, boolean, boolean):void");
    }

    public int drawLegend(Canvas canvas, DefaultRenderer defaultRenderer, String[] strArr, int i9, int i10, int i11, int i12, int i13, int i14, Paint paint, boolean z9) {
        int i15;
        int i16;
        float legendTextSize;
        float f9;
        String str;
        String[] strArr2 = strArr;
        float f10 = 32.0f;
        if (defaultRenderer.isShowLegend()) {
            float f11 = i9;
            float legendTextSize2 = ((i11 + i13) - i14) + 32.0f;
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(defaultRenderer.getLegendTextSize());
            int iMin = Math.min(strArr2.length, defaultRenderer.getSeriesRendererCount());
            float f12 = f11;
            int i17 = 0;
            while (i17 < iMin) {
                SimpleSeriesRenderer seriesRendererAt = defaultRenderer.getSeriesRendererAt(i17);
                float legendShapeWidth = getLegendShapeWidth(i17);
                if (seriesRendererAt.isShowLegendItem()) {
                    String str2 = strArr2[i17];
                    paint.setColor(strArr2.length == defaultRenderer.getSeriesRendererCount() ? seriesRendererAt.getColor() : DefaultRenderer.TEXT_COLOR);
                    int length = str2.length();
                    float[] fArr = new float[length];
                    paint.getTextWidths(str2, fArr);
                    float f13 = 0.0f;
                    i16 = iMin;
                    for (int i18 = 0; i18 < length; i18++) {
                        f13 += fArr[i18];
                    }
                    float f14 = legendShapeWidth + 10.0f + f13;
                    float f15 = f12 + f14;
                    if (i17 <= 0 || !getExceed(f15, defaultRenderer, i10, i12)) {
                        legendTextSize = f10;
                        f9 = f12;
                    } else {
                        legendTextSize2 += defaultRenderer.getLegendTextSize();
                        f15 = f11 + f14;
                        legendTextSize = f10 + defaultRenderer.getLegendTextSize();
                        f9 = f11;
                    }
                    float f16 = f15;
                    float f17 = legendTextSize2;
                    if (getExceed(f16, defaultRenderer, i10, i12)) {
                        float f18 = ((i10 - f9) - legendShapeWidth) - 10.0f;
                        if (isVertical(defaultRenderer)) {
                            f18 = ((i12 - f9) - legendShapeWidth) - 10.0f;
                        }
                        str = str2.substring(0, paint.breakText(str2, true, f18, fArr)) + "...";
                    } else {
                        str = str2;
                    }
                    if (z9) {
                        i15 = i17;
                    } else {
                        i15 = i17;
                        drawLegendShape(canvas, seriesRendererAt, f9, f17, i17, paint);
                        drawString(canvas, str, f9 + legendShapeWidth + 5.0f, f17 + 5.0f, paint);
                    }
                    f12 = f9 + f14;
                    legendTextSize2 = f17;
                    f10 = legendTextSize;
                } else {
                    i15 = i17;
                    i16 = iMin;
                }
                i17 = i15 + 1;
                strArr2 = strArr;
                iMin = i16;
            }
        }
        return Math.round(f10 + defaultRenderer.getLegendTextSize());
    }

    public abstract void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint);

    public void drawPath(Canvas canvas, List<Float> list, Paint paint, boolean z9) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (list.size() < 4) {
            return;
        }
        float[] fArrCalculateDrawPoints = calculateDrawPoints(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue(), list.get(3).floatValue(), height, width);
        path.moveTo(fArrCalculateDrawPoints[0], fArrCalculateDrawPoints[1]);
        path.lineTo(fArrCalculateDrawPoints[2], fArrCalculateDrawPoints[3]);
        int size = list.size();
        for (int i9 = 4; i9 < size; i9 += 2) {
            int i10 = i9 - 1;
            if (list.get(i10).floatValue() >= 0.0f || list.get(i9 + 1).floatValue() >= 0.0f) {
                float f9 = height;
                if (list.get(i10).floatValue() <= f9 || list.get(i9 + 1).floatValue() <= f9) {
                    float[] fArrCalculateDrawPoints2 = calculateDrawPoints(list.get(i9 - 2).floatValue(), list.get(i10).floatValue(), list.get(i9).floatValue(), list.get(i9 + 1).floatValue(), height, width);
                    if (!z9) {
                        path.moveTo(fArrCalculateDrawPoints2[0], fArrCalculateDrawPoints2[1]);
                    }
                    path.lineTo(fArrCalculateDrawPoints2[2], fArrCalculateDrawPoints2[3]);
                }
            }
        }
        if (z9) {
            path.lineTo(list.get(0).floatValue(), list.get(1).floatValue());
        }
        canvas.drawPath(path, paint);
    }

    public void drawPath(Canvas canvas, float[] fArr, Paint paint, boolean z9) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (fArr.length < 4) {
            return;
        }
        float[] fArrCalculateDrawPoints = calculateDrawPoints(fArr[0], fArr[1], fArr[2], fArr[3], height, width);
        path.moveTo(fArrCalculateDrawPoints[0], fArrCalculateDrawPoints[1]);
        path.lineTo(fArrCalculateDrawPoints[2], fArrCalculateDrawPoints[3]);
        int length = fArr.length;
        for (int i9 = 4; i9 < length; i9 += 2) {
            float f9 = fArr[i9 - 1];
            if (f9 >= 0.0f || fArr[i9 + 1] >= 0.0f) {
                float f10 = height;
                if (f9 <= f10 || fArr[i9 + 1] <= f10) {
                    float[] fArrCalculateDrawPoints2 = calculateDrawPoints(fArr[i9 - 2], f9, fArr[i9], fArr[i9 + 1], height, width);
                    if (!z9) {
                        path.moveTo(fArrCalculateDrawPoints2[0], fArrCalculateDrawPoints2[1]);
                    }
                    path.lineTo(fArrCalculateDrawPoints2[2], fArrCalculateDrawPoints2[3]);
                }
            }
        }
        if (z9) {
            path.lineTo(fArr[0], fArr[1]);
        }
        canvas.drawPath(path, paint);
    }

    public void drawString(Canvas canvas, String str, float f9, float f10, Paint paint) {
        if (str != null) {
            String[] strArrSplit = str.split("\n");
            Rect rect = new Rect();
            int iHeight = 0;
            for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                canvas.drawText(strArrSplit[i9], f9, iHeight + f10, paint);
                String str2 = strArrSplit[i9];
                paint.getTextBounds(str2, 0, str2.length(), rect);
                iHeight = iHeight + rect.height() + 5;
            }
        }
    }

    public boolean getExceed(float f9, DefaultRenderer defaultRenderer, int i9, int i10) {
        boolean z9 = f9 > ((float) i9);
        if (isVertical(defaultRenderer)) {
            return f9 > ((float) i10);
        }
        return z9;
    }

    public String getLabel(NumberFormat numberFormat, double d9) {
        StringBuilder sb;
        if (numberFormat != null) {
            return numberFormat.format(d9);
        }
        if (d9 == Math.round(d9)) {
            sb = new StringBuilder();
            sb.append(Math.round(d9));
        } else {
            sb = new StringBuilder();
            sb.append(d9);
        }
        sb.append("");
        return sb.toString();
    }

    public abstract int getLegendShapeWidth(int i9);

    public int getLegendSize(DefaultRenderer defaultRenderer, int i9, float f9) {
        int legendHeight = defaultRenderer.getLegendHeight();
        if (!defaultRenderer.isShowLegend() || legendHeight != 0) {
            i9 = legendHeight;
        }
        return (defaultRenderer.isShowLegend() || !defaultRenderer.isShowXLabels()) ? i9 : (int) (((defaultRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f9);
    }

    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return null;
    }

    public boolean isNullValue(double d9) {
        return Double.isNaN(d9) || Double.isInfinite(d9) || d9 == Double.MAX_VALUE;
    }

    public boolean isVertical(DefaultRenderer defaultRenderer) {
        return (defaultRenderer instanceof XYMultipleSeriesRenderer) && ((XYMultipleSeriesRenderer) defaultRenderer).getOrientation() == XYMultipleSeriesRenderer.Orientation.VERTICAL;
    }
}
