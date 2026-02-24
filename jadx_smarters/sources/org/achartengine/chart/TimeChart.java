package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes4.dex */
public class TimeChart extends LineChart {
    public static final long DAY = 86400000;
    public static final String TYPE = "Time";
    private String mDateFormat;
    private Double mStartPoint;

    public TimeChart() {
    }

    public TimeChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    private DateFormat getDateFormat(double d9, double d10) {
        if (this.mDateFormat != null) {
            try {
                return new SimpleDateFormat(this.mDateFormat);
            } catch (Exception unused) {
            }
        }
        double d11 = d10 - d9;
        return (d11 <= 8.64E7d || d11 >= 4.32E8d) ? d11 < 8.64E7d ? DateFormat.getTimeInstance(2) : DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(3, 3);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i9, int i10, int i11, double d9, double d10, double d11) {
        int i12;
        int size = list.size();
        if (size > 0) {
            boolean zIsShowXLabels = this.mRenderer.isShowXLabels();
            boolean zIsShowGridY = this.mRenderer.isShowGridY();
            if (zIsShowGridY) {
                this.mGridPaint.setStyle(Paint.Style.STROKE);
                this.mGridPaint.setStrokeWidth(this.mRenderer.getGridLineWidth());
            }
            boolean zIsShowTickMarks = this.mRenderer.isShowTickMarks();
            DateFormat dateFormat = getDateFormat(list.get(0).doubleValue(), list.get(size - 1).doubleValue());
            int i13 = 0;
            while (i13 < size) {
                long jRound = Math.round(list.get(i13).doubleValue());
                float f9 = (float) (((double) i9) + ((jRound - d10) * d9));
                if (zIsShowXLabels) {
                    paint.setColor(this.mRenderer.getXLabelsColor());
                    if (zIsShowTickMarks) {
                        float f10 = i11;
                        canvas.drawLine(f9, f10, f9, f10 + (this.mRenderer.getLabelsTextSize() / 3.0f), paint);
                    }
                    i12 = i13;
                    drawText(canvas, dateFormat.format(new Date(jRound)), f9, i11 + ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + this.mRenderer.getXLabelsPadding(), paint, this.mRenderer.getXLabelsAngle());
                } else {
                    i12 = i13;
                }
                if (zIsShowGridY) {
                    this.mGridPaint.setColor(this.mRenderer.getGridColor(0));
                    canvas.drawLine(f9, i11, f9, i10, this.mGridPaint);
                }
                i13 = i12 + 1;
            }
        }
        drawXTextLabels(dArr, canvas, paint, true, i9, i10, i11, d9, d10, d11);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public String getDateFormat() {
        return this.mDateFormat;
    }

    @Override // org.achartengine.chart.XYChart
    public List<Double> getXLabels(double d9, double d10, int i9) {
        int i10 = i9;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (this.mRenderer.isXRoundedLabels()) {
            double d11 = 8.64E7d;
            if (this.mStartPoint == null) {
                this.mStartPoint = Double.valueOf((d9 - (d9 % 8.64E7d)) + 8.64E7d + ((double) (new Date(Math.round(d9)).getTimezoneOffset() * DateTimeConstants.MILLIS_PER_MINUTE)));
            }
            if (i10 > 25) {
                i10 = 25;
            }
            double d12 = (d10 - d9) / ((double) i10);
            if (d12 <= 0.0d) {
                return arrayList;
            }
            if (d12 <= 8.64E7d) {
                while (true) {
                    double d13 = d11 / 2.0d;
                    if (d12 >= d13) {
                        break;
                    }
                    d11 = d13;
                }
            } else {
                while (d12 > d11) {
                    d11 *= 2.0d;
                }
            }
            double dDoubleValue = this.mStartPoint.doubleValue() - (Math.floor((this.mStartPoint.doubleValue() - d9) / d11) * d11);
            while (dDoubleValue < d10) {
                int i12 = i11 + 1;
                if (i11 > i10) {
                    break;
                }
                arrayList.add(Double.valueOf(dDoubleValue));
                dDoubleValue += d11;
                i11 = i12;
            }
            return arrayList;
        }
        if (this.mDataset.getSeriesCount() <= 0) {
            return super.getXLabels(d9, d10, i9);
        }
        XYSeries seriesAt = this.mDataset.getSeriesAt(0);
        int itemCount = seriesAt.getItemCount();
        int i13 = -1;
        int i14 = 0;
        for (int i15 = 0; i15 < itemCount; i15++) {
            double x9 = seriesAt.getX(i15);
            if (d9 <= x9 && x9 <= d10) {
                i14++;
                if (i13 < 0) {
                    i13 = i15;
                }
            }
        }
        if (i14 < i10) {
            for (int i16 = i13; i16 < i13 + i14; i16++) {
                arrayList.add(Double.valueOf(seriesAt.getX(i16)));
            }
        } else {
            float f9 = i14 / i10;
            int i17 = 0;
            while (i11 < itemCount && i17 < i10) {
                double x10 = seriesAt.getX(Math.round(i11 * f9));
                if (d9 <= x10 && x10 <= d10) {
                    arrayList.add(Double.valueOf(x10));
                    i17++;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public void setDateFormat(String str) {
        this.mDateFormat = str;
    }
}
