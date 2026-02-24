package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.achartengine.model.MultipleCategorySeries;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class DoughnutChart extends RoundChart {
    private MultipleCategorySeries mDataset;
    private int mStep;

    public DoughnutChart(MultipleCategorySeries multipleCategorySeries, DefaultRenderer defaultRenderer) {
        super(null, defaultRenderer);
        this.mDataset = multipleCategorySeries;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i9, int i10, int i11, int i12, Paint paint) {
        Paint paint2;
        DoughnutChart doughnutChart = this;
        Paint paint3 = paint;
        paint3.setAntiAlias(doughnutChart.mRenderer.isAntialiasing());
        paint3.setStyle(Paint.Style.FILL);
        paint3.setTextSize(doughnutChart.mRenderer.getLabelsTextSize());
        int legendSize = doughnutChart.getLegendSize(doughnutChart.mRenderer, i12 / 5, 0.0f);
        int i13 = i9 + i11;
        int categoriesCount = doughnutChart.mDataset.getCategoriesCount();
        String[] strArr = new String[categoriesCount];
        for (int i14 = 0; i14 < categoriesCount; i14++) {
            strArr[i14] = doughnutChart.mDataset.getCategory(i14);
        }
        int iDrawLegend = doughnutChart.mRenderer.isFitLegend() ? drawLegend(canvas, doughnutChart.mRenderer, strArr, i9, i13, i10, i11, i12, legendSize, paint, true) : legendSize;
        int i15 = (i10 + i12) - iDrawLegend;
        drawBackground(doughnutChart.mRenderer, canvas, i9, i10, i11, i12, paint, false, 0);
        doughnutChart.mStep = 7;
        double d9 = 0.2d / ((double) categoriesCount);
        double dMin = Math.min(Math.abs(i13 - i9), Math.abs(i15 - i10));
        int scale = (int) (((double) doughnutChart.mRenderer.getScale()) * 0.35d * dMin);
        if (doughnutChart.mCenterX == Integer.MAX_VALUE) {
            doughnutChart.mCenterX = (i9 + i13) / 2;
        }
        if (doughnutChart.mCenterY == Integer.MAX_VALUE) {
            doughnutChart.mCenterY = (i15 + i10) / 2;
        }
        float f9 = scale;
        float f10 = f9 * 1.1f;
        ArrayList arrayList = new ArrayList();
        int i16 = scale;
        float f11 = 0.9f * f9;
        int i17 = 0;
        while (i17 < categoriesCount) {
            int itemCount = doughnutChart.mDataset.getItemCount(i17);
            String[] strArr2 = new String[itemCount];
            double d10 = 0.0d;
            for (int i18 = 0; i18 < itemCount; i18++) {
                d10 += doughnutChart.mDataset.getValues(i17)[i18];
                strArr2[i18] = doughnutChart.mDataset.getTitles(i17)[i18];
            }
            float startAngle = doughnutChart.mRenderer.getStartAngle();
            int i19 = doughnutChart.mCenterX;
            int i20 = doughnutChart.mCenterY;
            RectF rectF = new RectF(i19 - i16, i20 - i16, i19 + i16, i20 + i16);
            float f12 = startAngle;
            int i21 = 0;
            while (i21 < itemCount) {
                paint3.setColor(doughnutChart.mRenderer.getSeriesRendererAt(i21).getColor());
                float f13 = (float) ((((double) ((float) doughnutChart.mDataset.getValues(i17)[i21])) / d10) * 360.0d);
                int i22 = i21;
                RectF rectF2 = rectF;
                canvas.drawArc(rectF, f12, f13, true, paint);
                String str = doughnutChart.mDataset.getTitles(i17)[i22];
                DefaultRenderer defaultRenderer = doughnutChart.mRenderer;
                float f14 = f11;
                drawLabel(canvas, str, defaultRenderer, arrayList, doughnutChart.mCenterX, doughnutChart.mCenterY, f14, f10, f12, f13, i9, i13, defaultRenderer.getLabelsColor(), paint, true, false);
                f12 += f13;
                i21 = i22 + 1;
                doughnutChart = this;
                paint3 = paint;
                rectF = rectF2;
                itemCount = itemCount;
                strArr = strArr;
                categoriesCount = categoriesCount;
                f11 = f14;
                i17 = i17;
                dMin = dMin;
                i16 = i16;
            }
            float f15 = f11;
            int i23 = i17;
            double d11 = dMin;
            String[] strArr3 = strArr;
            int i24 = categoriesCount;
            double d12 = d11 * d9;
            int i25 = (int) (((double) i16) - d12);
            float f16 = (float) (((double) f15) - (d12 - 2.0d));
            if (this.mRenderer.getBackgroundColor() != 0) {
                paint2 = paint;
                paint2.setColor(this.mRenderer.getBackgroundColor());
            } else {
                paint2 = paint;
                paint2.setColor(-1);
            }
            paint2.setStyle(Paint.Style.FILL);
            int i26 = this.mCenterX;
            int i27 = this.mCenterY;
            canvas.drawArc(new RectF(i26 - i25, i27 - i25, i26 + i25, i27 + i25), 0.0f, 360.0f, true, paint);
            i16 = i25 - 1;
            f11 = f16;
            doughnutChart = this;
            paint3 = paint2;
            strArr = strArr3;
            categoriesCount = i24;
            dMin = d11;
            i17 = i23 + 1;
        }
        arrayList.clear();
        drawLegend(canvas, doughnutChart.mRenderer, strArr, i9, i13, i10, i11, i12, iDrawLegend, paint, false);
        drawTitle(canvas, i9, i10, i11, paint);
    }

    @Override // org.achartengine.chart.RoundChart, org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint) {
        int i10 = this.mStep - 1;
        this.mStep = i10;
        canvas.drawCircle((f9 + 10.0f) - i10, f10, i10, paint);
    }

    @Override // org.achartengine.chart.RoundChart, org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return 10;
    }
}
