package org.achartengine.tools;

/* JADX INFO: loaded from: classes4.dex */
public class ZoomEvent {
    private boolean mZoomIn;
    private float mZoomRate;

    public ZoomEvent(boolean z9, float f9) {
        this.mZoomIn = z9;
        this.mZoomRate = f9;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isZoomIn() {
        return this.mZoomIn;
    }
}
