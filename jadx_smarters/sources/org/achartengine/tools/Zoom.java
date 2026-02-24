package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class Zoom extends AbstractTool {
    public static final int ZOOM_AXIS_X = 1;
    public static final int ZOOM_AXIS_XY = 0;
    public static final int ZOOM_AXIS_Y = 2;
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private boolean mZoomIn;
    private List<ZoomListener> mZoomListeners;
    private float mZoomRate;

    public Zoom(AbstractChart abstractChart, boolean z9, float f9) {
        super(abstractChart);
        this.mZoomListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
        this.mZoomIn = z9;
        setZoomRate(f9);
    }

    private synchronized void notifyZoomListeners(ZoomEvent zoomEvent) {
        Iterator<ZoomListener> it = this.mZoomListeners.iterator();
        while (it.hasNext()) {
            it.next().zoomApplied(zoomEvent);
        }
    }

    public synchronized void addZoomListener(ZoomListener zoomListener) {
        this.mZoomListeners.add(zoomListener);
    }

    public void apply(int i9) {
        int i10;
        double zoomInLimitX;
        double zoomInLimitY;
        int i11;
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            int scalesCount = this.mRenderer.getScalesCount();
            char c9 = 0;
            int i12 = 0;
            while (i12 < scalesCount) {
                double[] range = getRange(i12);
                checkRange(range, i12);
                double[] zoomLimits = this.mRenderer.getZoomLimits();
                double d9 = range[c9];
                double d10 = range[1];
                double d11 = (d9 + d10) / 2.0d;
                double d12 = range[2];
                double d13 = range[3];
                double d14 = (d12 + d13) / 2.0d;
                double d15 = d10 - d9;
                double d16 = d13 - d12;
                double d17 = d15 / 2.0d;
                double d18 = d11 - d17;
                double d19 = d17 + d11;
                double d20 = d16 / 2.0d;
                double d21 = d14 - d20;
                double d22 = d14 + d20;
                if (i12 == 0) {
                    this.limitsReachedX = zoomLimits != null && (d18 <= zoomLimits[c9] || d19 >= zoomLimits[1]);
                    this.limitsReachedY = zoomLimits != null && (d21 <= zoomLimits[2] || d22 >= zoomLimits[3]);
                }
                if (this.mZoomIn) {
                    if (!this.mRenderer.isZoomXEnabled() || (!(i9 == 1 || i9 == 0) || (this.limitsReachedX && this.mZoomRate < 1.0f))) {
                        i10 = i12;
                    } else {
                        i10 = i12;
                        d15 /= (double) this.mZoomRate;
                    }
                    if (this.mRenderer.isZoomYEnabled() && ((i9 == 2 || i9 == 0) && (!this.limitsReachedY || this.mZoomRate >= 1.0f))) {
                        d16 /= (double) this.mZoomRate;
                    }
                } else {
                    i10 = i12;
                    if (this.mRenderer.isZoomXEnabled() && !this.limitsReachedX && (i9 == 1 || i9 == 0)) {
                        d15 *= (double) this.mZoomRate;
                    }
                    if (this.mRenderer.isZoomYEnabled() && !this.limitsReachedY && (i9 == 2 || i9 == 0)) {
                        d16 *= (double) this.mZoomRate;
                    }
                }
                double d23 = d16;
                if (zoomLimits != null) {
                    zoomInLimitX = Math.min(this.mRenderer.getZoomInLimitX(), zoomLimits[1] - zoomLimits[0]);
                    zoomInLimitY = Math.min(this.mRenderer.getZoomInLimitY(), zoomLimits[3] - zoomLimits[2]);
                } else {
                    zoomInLimitX = this.mRenderer.getZoomInLimitX();
                    zoomInLimitY = this.mRenderer.getZoomInLimitY();
                }
                double dMax = Math.max(d15, zoomInLimitX);
                double dMax2 = Math.max(d23, zoomInLimitY);
                if (this.mRenderer.isZoomXEnabled() && (i9 == 1 || i9 == 0)) {
                    double d24 = dMax / 2.0d;
                    i11 = 2;
                    setXRange(d11 - d24, d11 + d24, i10);
                } else {
                    i11 = 2;
                }
                if (this.mRenderer.isZoomYEnabled() && (i9 == i11 || i9 == 0)) {
                    double d25 = dMax2 / 2.0d;
                    setYRange(d14 - d25, d14 + d25, i10);
                }
                i12 = i10 + 1;
                c9 = 0;
            }
        } else {
            DefaultRenderer renderer = ((RoundChart) abstractChart).getRenderer();
            renderer.setScale(this.mZoomIn ? renderer.getScale() * this.mZoomRate : renderer.getScale() / this.mZoomRate);
        }
        notifyZoomListeners(new ZoomEvent(this.mZoomIn, this.mZoomRate));
    }

    public synchronized void notifyZoomResetListeners() {
        Iterator<ZoomListener> it = this.mZoomListeners.iterator();
        while (it.hasNext()) {
            it.next().zoomReset();
        }
    }

    public synchronized void removeZoomListener(ZoomListener zoomListener) {
        this.mZoomListeners.remove(zoomListener);
    }

    public void setZoomRate(float f9) {
        this.mZoomRate = f9;
    }
}
