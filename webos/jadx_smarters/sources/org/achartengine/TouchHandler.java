package org.achartengine;

import android.graphics.RectF;
import android.view.MotionEvent;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.tools.Pan;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.Zoom;
import org.achartengine.tools.ZoomListener;

/* JADX INFO: loaded from: classes4.dex */
public class TouchHandler implements ITouchHandler {
    private GraphicalView graphicalView;
    private Pan mPan;
    private Zoom mPinchZoom;
    private DefaultRenderer mRenderer;
    private float oldX;
    private float oldX2;
    private float oldY;
    private float oldY2;
    private RectF zoomR;

    public TouchHandler(GraphicalView graphicalView, AbstractChart abstractChart) {
        this.zoomR = new RectF();
        this.graphicalView = graphicalView;
        this.zoomR = graphicalView.getZoomRectangle();
        this.mRenderer = abstractChart instanceof XYChart ? ((XYChart) abstractChart).getRenderer() : ((RoundChart) abstractChart).getRenderer();
        if (this.mRenderer.isPanEnabled()) {
            this.mPan = new Pan(abstractChart);
        }
        if (this.mRenderer.isZoomEnabled()) {
            this.mPinchZoom = new Zoom(abstractChart, true, 1.0f);
        }
    }

    private void applyZoom(float f9, int i9) {
        float fMin = Math.min(Math.max(f9, 0.9f), 1.1f);
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            double d9 = fMin;
            if (d9 <= 0.9d || d9 >= 1.1d) {
                return;
            }
            zoom.setZoomRate(fMin);
            this.mPinchZoom.apply(i9);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void addPanListener(PanListener panListener) {
        Pan pan = this.mPan;
        if (pan != null) {
            pan.addPanListener(panListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void addZoomListener(ZoomListener zoomListener) {
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            zoom.addZoomListener(zoomListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public boolean handleTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.mRenderer == null || action != 2) {
            if (action == 0) {
                this.oldX = motionEvent.getX(0);
                this.oldY = motionEvent.getY(0);
                DefaultRenderer defaultRenderer = this.mRenderer;
                if (defaultRenderer != null && defaultRenderer.isZoomEnabled() && this.zoomR.contains(this.oldX, this.oldY)) {
                    float f9 = this.oldX;
                    RectF rectF = this.zoomR;
                    if (f9 < rectF.left + (rectF.width() / 3.0f)) {
                        this.graphicalView.zoomIn();
                    } else {
                        float f10 = this.oldX;
                        RectF rectF2 = this.zoomR;
                        if (f10 < rectF2.left + ((rectF2.width() * 2.0f) / 3.0f)) {
                            this.graphicalView.zoomOut();
                        } else {
                            this.graphicalView.zoomReset();
                        }
                    }
                    return true;
                }
            } else if (action == 1 || action == 6) {
                this.oldX = 0.0f;
                this.oldY = 0.0f;
                this.oldX2 = 0.0f;
                this.oldY2 = 0.0f;
                if (action == 6) {
                    this.oldX = -1.0f;
                    this.oldY = -1.0f;
                }
            }
        } else if (this.oldX >= 0.0f || this.oldY >= 0.0f) {
            float x9 = motionEvent.getX(0);
            float y9 = motionEvent.getY(0);
            if (motionEvent.getPointerCount() > 1 && ((this.oldX2 >= 0.0f || this.oldY2 >= 0.0f) && this.mRenderer.isZoomEnabled())) {
                float x10 = motionEvent.getX(1);
                float y10 = motionEvent.getY(1);
                float fAbs = Math.abs(x9 - x10);
                float fAbs2 = Math.abs(y9 - y10);
                float fAbs3 = Math.abs(this.oldX - this.oldX2);
                float fAbs4 = Math.abs(this.oldY - this.oldY2);
                float fAbs5 = Math.abs(y9 - this.oldY) / Math.abs(x9 - this.oldX);
                float fAbs6 = Math.abs(y10 - this.oldY2) / Math.abs(x10 - this.oldX2);
                double d9 = fAbs5;
                if (d9 <= 0.25d && fAbs6 <= 0.25d) {
                    applyZoom(fAbs / fAbs3, 1);
                } else if (d9 < 3.73d || fAbs6 < 3.73d) {
                    applyZoom(Math.abs(x9 - this.oldX) >= Math.abs(y9 - this.oldY) ? fAbs / fAbs3 : fAbs2 / fAbs4, 0);
                } else {
                    applyZoom(fAbs2 / fAbs4, 2);
                }
                this.oldX2 = x10;
                this.oldY2 = y10;
            } else if (this.mRenderer.isPanEnabled()) {
                this.mPan.apply(this.oldX, this.oldY, x9, y9);
                this.oldX2 = 0.0f;
                this.oldY2 = 0.0f;
            }
            this.oldX = x9;
            this.oldY = y9;
            this.graphicalView.repaint();
            return true;
        }
        return !this.mRenderer.isClickEnabled();
    }

    @Override // org.achartengine.ITouchHandler
    public void removePanListener(PanListener panListener) {
        Pan pan = this.mPan;
        if (pan != null) {
            pan.removePanListener(panListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void removeZoomListener(ZoomListener zoomListener) {
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            zoom.removeZoomListener(zoomListener);
        }
    }
}
