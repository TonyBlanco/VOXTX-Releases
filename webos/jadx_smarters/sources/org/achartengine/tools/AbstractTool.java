package org.achartengine.tools;

import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractTool {
    protected AbstractChart mChart;
    protected XYMultipleSeriesRenderer mRenderer;

    public AbstractTool(AbstractChart abstractChart) {
        this.mChart = abstractChart;
        if (abstractChart instanceof XYChart) {
            this.mRenderer = ((XYChart) abstractChart).getRenderer();
        }
    }

    public void checkRange(double[] dArr, int i9) {
        double[] calcRange;
        AbstractChart abstractChart = this.mChart;
        if (!(abstractChart instanceof XYChart) || (calcRange = ((XYChart) abstractChart).getCalcRange(i9)) == null) {
            return;
        }
        if (!this.mRenderer.isMinXSet(i9)) {
            double d9 = calcRange[0];
            dArr[0] = d9;
            this.mRenderer.setXAxisMin(d9, i9);
        }
        if (!this.mRenderer.isMaxXSet(i9)) {
            double d10 = calcRange[1];
            dArr[1] = d10;
            this.mRenderer.setXAxisMax(d10, i9);
        }
        if (!this.mRenderer.isMinYSet(i9)) {
            double d11 = calcRange[2];
            dArr[2] = d11;
            this.mRenderer.setYAxisMin(d11, i9);
        }
        if (this.mRenderer.isMaxYSet(i9)) {
            return;
        }
        double d12 = calcRange[3];
        dArr[3] = d12;
        this.mRenderer.setYAxisMax(d12, i9);
    }

    public double[] getRange(int i9) {
        return new double[]{this.mRenderer.getXAxisMin(i9), this.mRenderer.getXAxisMax(i9), this.mRenderer.getYAxisMin(i9), this.mRenderer.getYAxisMax(i9)};
    }

    public void setXRange(double d9, double d10, int i9) {
        this.mRenderer.setXAxisMin(d9, i9);
        this.mRenderer.setXAxisMax(d10, i9);
    }

    public void setYRange(double d9, double d10, int i9) {
        this.mRenderer.setYAxisMin(d9, i9);
        this.mRenderer.setYAxisMax(d10, i9);
    }
}
