package org.achartengine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.amazonaws.services.s3.internal.Constants;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.tools.FitZoom;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.Zoom;
import org.achartengine.tools.ZoomListener;

/* JADX INFO: loaded from: classes4.dex */
public class GraphicalView extends View {
    private static final int ZOOM_BUTTONS_COLOR = Color.argb(175, 150, 150, 150);
    private Bitmap fitZoomImage;
    private AbstractChart mChart;
    private boolean mDrawn;
    private FitZoom mFitZoom;
    private Handler mHandler;
    private Paint mPaint;
    private Rect mRect;
    private DefaultRenderer mRenderer;
    private ITouchHandler mTouchHandler;
    private Zoom mZoomIn;
    private Zoom mZoomOut;
    private RectF mZoomR;
    private float oldX;
    private float oldY;
    private Bitmap zoomInImage;
    private Bitmap zoomOutImage;
    private int zoomSize;

    public GraphicalView(Context context, AbstractChart abstractChart) {
        int iIntValue;
        super(context);
        this.mRect = new Rect();
        this.mZoomR = new RectF();
        this.zoomSize = 50;
        this.mPaint = new Paint();
        this.mChart = abstractChart;
        this.mHandler = new Handler();
        AbstractChart abstractChart2 = this.mChart;
        this.mRenderer = abstractChart2 instanceof XYChart ? ((XYChart) abstractChart2).getRenderer() : ((RoundChart) abstractChart2).getRenderer();
        if (this.mRenderer.isZoomButtonsVisible()) {
            this.zoomInImage = BitmapFactory.decodeStream(GraphicalView.class.getResourceAsStream("image/zoom_in.png"));
            this.zoomOutImage = BitmapFactory.decodeStream(GraphicalView.class.getResourceAsStream("image/zoom_out.png"));
            this.fitZoomImage = BitmapFactory.decodeStream(GraphicalView.class.getResourceAsStream("image/zoom-1.png"));
        }
        DefaultRenderer defaultRenderer = this.mRenderer;
        if ((defaultRenderer instanceof XYMultipleSeriesRenderer) && ((XYMultipleSeriesRenderer) defaultRenderer).getMarginsColor() == 0) {
            ((XYMultipleSeriesRenderer) this.mRenderer).setMarginsColor(this.mPaint.getColor());
        }
        if ((this.mRenderer.isZoomEnabled() && this.mRenderer.isZoomButtonsVisible()) || this.mRenderer.isExternalZoomEnabled()) {
            this.mZoomIn = new Zoom(this.mChart, true, this.mRenderer.getZoomRate());
            this.mZoomOut = new Zoom(this.mChart, false, this.mRenderer.getZoomRate());
            this.mFitZoom = new FitZoom(this.mChart);
        }
        try {
            iIntValue = Integer.valueOf(Build.VERSION.SDK).intValue();
        } catch (Exception unused) {
            iIntValue = 7;
        }
        this.mTouchHandler = iIntValue < 7 ? new TouchHandlerOld(this, this.mChart) : new TouchHandler(this, this.mChart);
    }

    public void addPanListener(PanListener panListener) {
        this.mTouchHandler.addPanListener(panListener);
    }

    public void addZoomListener(ZoomListener zoomListener, boolean z9, boolean z10) {
        Zoom zoom;
        if (z9 && (zoom = this.mZoomIn) != null) {
            zoom.addZoomListener(zoomListener);
            this.mZoomOut.addZoomListener(zoomListener);
        }
        if (z10) {
            this.mTouchHandler.addZoomListener(zoomListener);
        }
    }

    public AbstractChart getChart() {
        return this.mChart;
    }

    public SeriesSelection getCurrentSeriesAndPoint() {
        return this.mChart.getSeriesAndPointForScreenCoordinate(new Point(this.oldX, this.oldY));
    }

    public RectF getZoomRectangle() {
        return this.mZoomR;
    }

    public boolean isChartDrawn() {
        return this.mDrawn;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.mRect);
        Rect rect = this.mRect;
        int i9 = rect.top;
        int i10 = rect.left;
        int iWidth = rect.width();
        int iHeight = this.mRect.height();
        if (this.mRenderer.isInScroll()) {
            iWidth = getMeasuredWidth();
            iHeight = getMeasuredHeight();
            i9 = 0;
            i10 = 0;
        }
        this.mChart.draw(canvas, i10, i9, iWidth, iHeight, this.mPaint);
        DefaultRenderer defaultRenderer = this.mRenderer;
        if (defaultRenderer != null && defaultRenderer.isZoomEnabled() && this.mRenderer.isZoomButtonsVisible()) {
            this.mPaint.setColor(ZOOM_BUTTONS_COLOR);
            int iMax = Math.max(this.zoomSize, Math.min(iWidth, iHeight) / 7);
            this.zoomSize = iMax;
            float f9 = i9 + iHeight;
            float f10 = i10 + iWidth;
            this.mZoomR.set(r2 - (iMax * 3), f9 - (iMax * 0.775f), f10, f9);
            RectF rectF = this.mZoomR;
            int i11 = this.zoomSize;
            canvas.drawRoundRect(rectF, i11 / 3, i11 / 3, this.mPaint);
            int i12 = this.zoomSize;
            float f11 = f9 - (i12 * 0.625f);
            canvas.drawBitmap(this.zoomInImage, f10 - (i12 * 2.75f), f11, (Paint) null);
            canvas.drawBitmap(this.zoomOutImage, f10 - (this.zoomSize * 1.75f), f11, (Paint) null);
            canvas.drawBitmap(this.fitZoomImage, f10 - (this.zoomSize * 0.75f), f11, (Paint) null);
        }
        this.mDrawn = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.oldX = motionEvent.getX();
            this.oldY = motionEvent.getY();
        }
        DefaultRenderer defaultRenderer = this.mRenderer;
        if (defaultRenderer != null && this.mDrawn && ((defaultRenderer.isPanEnabled() || this.mRenderer.isZoomEnabled()) && this.mTouchHandler.handleTouch(motionEvent))) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removePanListener(PanListener panListener) {
        this.mTouchHandler.removePanListener(panListener);
    }

    public synchronized void removeZoomListener(ZoomListener zoomListener) {
        try {
            Zoom zoom = this.mZoomIn;
            if (zoom != null) {
                zoom.removeZoomListener(zoomListener);
                this.mZoomOut.removeZoomListener(zoomListener);
            }
            this.mTouchHandler.removeZoomListener(zoomListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void repaint() {
        this.mHandler.post(new Runnable() { // from class: org.achartengine.GraphicalView.1
            @Override // java.lang.Runnable
            public void run() {
                GraphicalView.this.invalidate();
            }
        });
    }

    public void repaint(final int i9, final int i10, final int i11, final int i12) {
        this.mHandler.post(new Runnable() { // from class: org.achartengine.GraphicalView.2
            @Override // java.lang.Runnable
            public void run() {
                GraphicalView.this.invalidate(i9, i10, i11, i12);
            }
        });
    }

    public void setZoomRate(float f9) {
        Zoom zoom = this.mZoomIn;
        if (zoom == null || this.mZoomOut == null) {
            return;
        }
        zoom.setZoomRate(f9);
        this.mZoomOut.setZoomRate(f9);
    }

    public Bitmap toBitmap() {
        setDrawingCacheEnabled(false);
        if (!isDrawingCacheEnabled()) {
            setDrawingCacheEnabled(true);
        }
        if (this.mRenderer.isApplyBackgroundColor()) {
            setDrawingCacheBackgroundColor(this.mRenderer.getBackgroundColor());
        }
        setDrawingCacheQuality(Constants.MB);
        return getDrawingCache(true);
    }

    public double[] toRealPoint(int i9) {
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            return ((XYChart) abstractChart).toRealPoint(this.oldX, this.oldY, i9);
        }
        return null;
    }

    public void zoomIn() {
        Zoom zoom = this.mZoomIn;
        if (zoom != null) {
            zoom.apply(0);
            repaint();
        }
    }

    public void zoomOut() {
        Zoom zoom = this.mZoomOut;
        if (zoom != null) {
            zoom.apply(0);
            repaint();
        }
    }

    public void zoomReset() {
        FitZoom fitZoom = this.mFitZoom;
        if (fitZoom != null) {
            fitZoom.apply();
            this.mZoomIn.notifyZoomResetListeners();
            repaint();
        }
    }
}
