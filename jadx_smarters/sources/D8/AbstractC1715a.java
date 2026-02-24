package d8;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: d8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1715a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Rect f39848h = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f39850c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f39854g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f39849a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39851d = 255;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f39852e = f39848h;

    public AbstractC1715a() {
        Paint paint = new Paint();
        this.f39854g = paint;
        paint.setColor(-1);
        this.f39854g.setStyle(Paint.Style.FILL);
        this.f39854g.setAntiAlias(true);
    }

    public void a(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39849a.put(valueAnimator, animatorUpdateListener);
    }

    public abstract void b(Canvas canvas, Paint paint);

    public final void c() {
        if (this.f39853f) {
            return;
        }
        this.f39850c = g();
        this.f39853f = true;
    }

    public int d() {
        return this.f39852e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b(canvas, this.f39854g);
    }

    public int e() {
        return this.f39852e.width();
    }

    public final boolean f() {
        Iterator it = this.f39850c.iterator();
        if (it.hasNext()) {
            return ((ValueAnimator) it.next()).isStarted();
        }
        return false;
    }

    public abstract ArrayList g();

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f39851d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public void h() {
        invalidateSelf();
    }

    public void i(int i9) {
        this.f39854g.setColor(i9);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator it = this.f39850c.iterator();
        if (it.hasNext()) {
            return ((ValueAnimator) it.next()).isRunning();
        }
        return false;
    }

    public void j(int i9, int i10, int i11, int i12) {
        this.f39852e = new Rect(i9, i10, i11, i12);
    }

    public void k(Rect rect) {
        j(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void l() {
        for (int i9 = 0; i9 < this.f39850c.size(); i9++) {
            ValueAnimator valueAnimator = (ValueAnimator) this.f39850c.get(i9);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.f39849a.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    public final void m() {
        ArrayList<ValueAnimator> arrayList = this.f39850c;
        if (arrayList != null) {
            for (ValueAnimator valueAnimator : arrayList) {
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.end();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f39851d = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        c();
        if (this.f39850c == null || f()) {
            return;
        }
        l();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m();
    }
}
