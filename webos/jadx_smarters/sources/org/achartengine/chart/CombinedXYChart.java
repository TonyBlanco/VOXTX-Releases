package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.Serializable;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class CombinedXYChart extends XYChart {
    private XYCombinedChartDef[] chartDefinitions;
    private XYChart[] mCharts;
    private Class<?>[] xyChartTypes;

    public static class XYCombinedChartDef implements Serializable {
        private int[] seriesIndex;
        private String type;

        public XYCombinedChartDef(String str, int... iArr) {
            this.type = str;
            this.seriesIndex = iArr;
        }

        public boolean containsSeries(int i9) {
            return getChartSeriesIndex(i9) >= 0;
        }

        public int getChartSeriesIndex(int i9) {
            for (int i10 = 0; i10 < getSeriesIndex().length; i10++) {
                if (this.seriesIndex[i10] == i9) {
                    return i10;
                }
            }
            return -1;
        }

        public int[] getSeriesIndex() {
            return this.seriesIndex;
        }

        public String getType() {
            return this.type;
        }
    }

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYCombinedChartDef[] xYCombinedChartDefArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class, RangeStackedBarChart.class};
        this.chartDefinitions = xYCombinedChartDefArr;
        int length = xYCombinedChartDefArr.length;
        this.mCharts = new XYChart[length];
        for (int i9 = 0; i9 < length; i9++) {
            try {
                this.mCharts[i9] = getXYChart(xYCombinedChartDefArr[i9].getType());
            } catch (Exception unused) {
            }
            if (this.mCharts[i9] == null) {
                throw new IllegalArgumentException("Unknown chart type " + xYCombinedChartDefArr[i9].getType());
            }
            XYMultipleSeriesDataset xYMultipleSeriesDataset2 = new XYMultipleSeriesDataset();
            XYMultipleSeriesRenderer xYMultipleSeriesRenderer2 = new XYMultipleSeriesRenderer();
            for (int i10 : xYCombinedChartDefArr[i9].getSeriesIndex()) {
                xYMultipleSeriesDataset2.addSeries(xYMultipleSeriesDataset.getSeriesAt(i10));
                xYMultipleSeriesRenderer2.addSeriesRenderer(xYMultipleSeriesRenderer.getSeriesRendererAt(i10));
            }
            xYMultipleSeriesRenderer2.setBarSpacing(xYMultipleSeriesRenderer.getBarSpacing());
            xYMultipleSeriesRenderer2.setPointSize(xYMultipleSeriesRenderer.getPointSize());
            this.mCharts[i9].setDatasetRenderer(xYMultipleSeriesDataset2, xYMultipleSeriesRenderer2);
        }
    }

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, XYCombinedChartDef[] xYCombinedChartDefArr, XYChart[] xYChartArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class, RangeStackedBarChart.class};
        this.chartDefinitions = xYCombinedChartDefArr;
        this.mCharts = xYChartArr;
    }

    private int getChartSeriesIndex(int i9) {
        int i10 = 0;
        while (true) {
            XYCombinedChartDef[] xYCombinedChartDefArr = this.chartDefinitions;
            if (i10 >= xYCombinedChartDefArr.length) {
                throw new IllegalArgumentException("Unknown series with index " + i9);
            }
            if (xYCombinedChartDefArr[i10].containsSeries(i9)) {
                return this.chartDefinitions[i10].getChartSeriesIndex(i9);
            }
            i10++;
        }
    }

    private XYChart getXYChart(int i9) {
        int i10 = 0;
        while (true) {
            XYCombinedChartDef[] xYCombinedChartDefArr = this.chartDefinitions;
            if (i10 >= xYCombinedChartDefArr.length) {
                throw new IllegalArgumentException("Unknown series with index " + i9);
            }
            if (xYCombinedChartDefArr[i10].containsSeries(i9)) {
                return this.mCharts[i10];
            }
            i10++;
        }
    }

    private XYChart getXYChart(String str) throws IllegalAccessException, InstantiationException {
        int length = this.xyChartTypes.length;
        XYChart xYChart = null;
        for (int i9 = 0; i9 < length && xYChart == null; i9++) {
            XYChart xYChart2 = (XYChart) this.xyChartTypes[i9].newInstance();
            if (str.equals(xYChart2.getChartType())) {
                xYChart = xYChart2;
            }
        }
        return xYChart;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(List<Float> list, List<Double> list2, float f9, int i9, int i10) {
        return getXYChart(i9).clickableAreasForPoints(list, list2, f9, getChartSeriesIndex(i9), i10);
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f9, float f10, int i9, Paint paint) {
        getXYChart(i9).drawLegendShape(canvas, simpleSeriesRenderer, f9, f10, getChartSeriesIndex(i9), paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, int i10) {
        XYChart xYChart = getXYChart(i9);
        xYChart.setScreenR(getScreenR());
        xYChart.setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i9).getScaleNumber()), 0);
        xYChart.drawSeries(canvas, paint, list, xYSeriesRenderer, f9, getChartSeriesIndex(i9), i10);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, XYSeriesRenderer xYSeriesRenderer, float f9, int i9, XYMultipleSeriesRenderer.Orientation orientation, int i10) {
        XYChart xYChart = getXYChart(i9);
        xYChart.setScreenR(getScreenR());
        xYChart.setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i9).getScaleNumber()), 0);
        xYChart.drawSeries(xYSeries, canvas, paint, list, xYSeriesRenderer, f9, getChartSeriesIndex(i9), orientation, i10);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return "Combined";
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i9) {
        return getXYChart(i9).getLegendShapeWidth(getChartSeriesIndex(i9));
    }
}
