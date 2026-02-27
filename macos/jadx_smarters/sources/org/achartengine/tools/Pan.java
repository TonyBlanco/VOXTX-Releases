package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;

/* JADX INFO: loaded from: classes4.dex */
public class Pan extends AbstractTool {
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private List<PanListener> mPanListeners;

    public Pan(AbstractChart abstractChart) {
        super(abstractChart);
        this.mPanListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
    }

    private double getAxisRatio(double[] dArr) {
        return Math.abs(dArr[1] - dArr[0]) / Math.abs(dArr[3] - dArr[2]);
    }

    private synchronized void notifyPanListeners() {
        Iterator<PanListener> it = this.mPanListeners.iterator();
        while (it.hasNext()) {
            it.next().panApplied();
        }
    }

    public synchronized void addPanListener(PanListener panListener) {
        this.mPanListeners.add(panListener);
    }

    public void apply(float f9, float f10, float f11, float f12) {
        int i9;
        double[] dArr;
        XYChart xYChart;
        int i10;
        boolean z9;
        boolean z10;
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            int scalesCount = this.mRenderer.getScalesCount();
            double[] panLimits = this.mRenderer.getPanLimits();
            char c9 = 0;
            boolean z11 = panLimits != null && panLimits.length == 4;
            XYChart xYChart2 = (XYChart) this.mChart;
            boolean z12 = true;
            boolean z13 = true;
            int i11 = 0;
            boolean z14 = true;
            boolean z15 = true;
            while (i11 < scalesCount) {
                double[] range = getRange(i11);
                double[] calcRange = xYChart2.getCalcRange(i11);
                if (this.limitsReachedX && this.limitsReachedY) {
                    if (range[c9] == range[1] && calcRange[c9] == calcRange[1]) {
                        return;
                    }
                    if (range[2] == range[3] && calcRange[2] == calcRange[3]) {
                        return;
                    }
                }
                checkRange(range, i11);
                double[] realPoint = xYChart2.toRealPoint(f9, f10, i11);
                double[] realPoint2 = xYChart2.toRealPoint(f11, f12, i11);
                double d9 = realPoint[c9] - realPoint2[c9];
                double d10 = realPoint[1] - realPoint2[1];
                double axisRatio = getAxisRatio(range);
                if (xYChart2.isVertical(this.mRenderer)) {
                    double d11 = (-d10) * axisRatio;
                    d10 = d9 / axisRatio;
                    d9 = d11;
                }
                if (this.mRenderer.isPanXEnabled()) {
                    if (panLimits != null) {
                        if (z12) {
                            z12 = panLimits[0] <= range[0] + d9;
                        }
                        if (z13) {
                            z13 = panLimits[1] >= range[1] + d9;
                        }
                    }
                    z9 = z12;
                    z10 = z13;
                    if (!z11 || (z9 && z10)) {
                        double d12 = range[0] + d9;
                        double d13 = range[1] + d9;
                        i10 = scalesCount;
                        i9 = i11;
                        dArr = range;
                        xYChart = xYChart2;
                        setXRange(d12, d13, i9);
                        this.limitsReachedX = false;
                    } else {
                        this.limitsReachedX = true;
                        i9 = i11;
                        dArr = range;
                        xYChart = xYChart2;
                        i10 = scalesCount;
                    }
                } else {
                    i9 = i11;
                    dArr = range;
                    xYChart = xYChart2;
                    i10 = scalesCount;
                    z9 = z12;
                    z10 = z13;
                }
                if (this.mRenderer.isPanYEnabled()) {
                    if (panLimits != null) {
                        if (z14) {
                            z14 = panLimits[2] <= dArr[2] + d10;
                        }
                        if (z15) {
                            z15 = panLimits[3] >= dArr[3] + d10;
                        }
                    }
                    if (!z11 || (z14 && z15)) {
                        setYRange(dArr[2] + d10, dArr[3] + d10, i9);
                        this.limitsReachedY = false;
                    } else {
                        this.limitsReachedY = true;
                    }
                }
                i11 = i9 + 1;
                xYChart2 = xYChart;
                z12 = z9;
                z13 = z10;
                scalesCount = i10;
                c9 = 0;
            }
        } else {
            RoundChart roundChart = (RoundChart) abstractChart;
            roundChart.setCenterX(roundChart.getCenterX() + ((int) (f11 - f9)));
            roundChart.setCenterY(roundChart.getCenterY() + ((int) (f12 - f10)));
        }
        notifyPanListeners();
    }

    public synchronized void removePanListener(PanListener panListener) {
        this.mPanListeners.remove(panListener);
    }
}
