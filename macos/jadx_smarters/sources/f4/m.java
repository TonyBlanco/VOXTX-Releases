package f4;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import f4.d;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f40693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f40694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f40695f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f40691a = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f40692c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile float f40696g = 3.1415927f;

    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f9) {
        this.f40693d = aVar;
        this.f40694e = f9;
        this.f40695f = new GestureDetector(context, this);
    }

    @Override // f4.d.a
    public void a(float[] fArr, float f9) {
        this.f40696g = -f9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f40691a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float x9 = (motionEvent2.getX() - this.f40691a.x) / this.f40694e;
        float y9 = motionEvent2.getY();
        PointF pointF = this.f40691a;
        float f11 = (y9 - pointF.y) / this.f40694e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d9 = this.f40696g;
        float fCos = (float) Math.cos(d9);
        float fSin = (float) Math.sin(d9);
        PointF pointF2 = this.f40692c;
        pointF2.x -= (fCos * x9) - (fSin * f11);
        float f12 = pointF2.y + (fSin * x9) + (fCos * f11);
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        this.f40693d.b(this.f40692c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f40693d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f40695f.onTouchEvent(motionEvent);
    }
}
