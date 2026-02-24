package com.google.android.material.timepicker;

import P.L;
import R4.k;
import R4.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f27766a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f27769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f27772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f27774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f27775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f27776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27778n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27779o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f27780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27781q;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f9, boolean z9);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8688w);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f27772h = new ArrayList();
        Paint paint = new Paint();
        this.f27775k = paint;
        this.f27776l = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f9252t1, i9, k.f8867u);
        this.f27781q = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9270v1, 0);
        this.f27773i = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f9279w1, 0);
        this.f27777m = getResources().getDimensionPixelSize(R4.d.f8740m);
        this.f27774j = r6.getDimensionPixelSize(R4.d.f8738k);
        int color = typedArrayObtainStyledAttributes.getColor(l.f9261u1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f27771g = ViewConfiguration.get(context).getScaledTouchSlop();
        L.C0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void b(c cVar) {
        this.f27772h.add(cVar);
    }

    public final void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f27781q * ((float) Math.cos(this.f27780p))) + width;
        float f9 = height;
        float fSin = (this.f27781q * ((float) Math.sin(this.f27780p))) + f9;
        this.f27775k.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f27773i, this.f27775k);
        double dSin = Math.sin(this.f27780p);
        double dCos = Math.cos(this.f27780p);
        this.f27775k.setStrokeWidth(this.f27777m);
        canvas.drawLine(width, f9, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f27775k);
        canvas.drawCircle(width, f9, this.f27774j, this.f27775k);
    }

    public RectF d() {
        return this.f27776l;
    }

    public final int e(float f9, float f10) {
        int degrees = (int) Math.toDegrees(Math.atan2(f10 - (getHeight() / 2), f9 - (getWidth() / 2)));
        int i9 = degrees + 90;
        return i9 < 0 ? degrees + 450 : i9;
    }

    public float f() {
        return this.f27778n;
    }

    public int g() {
        return this.f27773i;
    }

    public final Pair h(float f9) {
        float f10 = f();
        if (Math.abs(f10 - f9) > 180.0f) {
            if (f10 > 180.0f && f9 < 180.0f) {
                f9 += 360.0f;
            }
            if (f10 < 180.0f && f9 > 180.0f) {
                f10 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f10), Float.valueOf(f9));
    }

    public final boolean i(float f9, float f10, boolean z9, boolean z10, boolean z11) {
        float fE = e(f9, f10);
        boolean z12 = false;
        boolean z13 = f() != fE;
        if (z10 && z13) {
            return true;
        }
        if (!z13 && !z9) {
            return false;
        }
        if (z11 && this.f27767c) {
            z12 = true;
        }
        l(fE, z12);
        return true;
    }

    public void j(int i9) {
        this.f27781q = i9;
        invalidate();
    }

    public void k(float f9) {
        l(f9, false);
    }

    public void l(float f9, boolean z9) {
        ValueAnimator valueAnimator = this.f27766a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z9) {
            m(f9, false);
            return;
        }
        Pair pairH = h(f9);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f27766a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f27766a.addUpdateListener(new a());
        this.f27766a.addListener(new b());
        this.f27766a.start();
    }

    public final void m(float f9, boolean z9) {
        float f10 = f9 % 360.0f;
        this.f27778n = f10;
        this.f27780p = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f27781q * ((float) Math.cos(this.f27780p)));
        float fSin = height + (this.f27781q * ((float) Math.sin(this.f27780p)));
        RectF rectF = this.f27776l;
        int i9 = this.f27773i;
        rectF.set(width - i9, fSin - i9, width + i9, fSin + i9);
        Iterator it = this.f27772h.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(f10, z9);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        k(f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f27768d = x9;
            this.f27769e = y9;
            this.f27770f = true;
            this.f27779o = false;
            z9 = false;
            z10 = true;
        } else {
            if (actionMasked == 1 || actionMasked == 2) {
                int i9 = (int) (x9 - this.f27768d);
                int i10 = (int) (y9 - this.f27769e);
                this.f27770f = (i9 * i9) + (i10 * i10) > this.f27771g;
                z9 = this.f27779o;
                z11 = actionMasked == 1;
                z10 = false;
                this.f27779o |= i(x9, y9, z9, z10, z11);
                return true;
            }
            z9 = false;
            z10 = false;
        }
        z11 = false;
        this.f27779o |= i(x9, y9, z9, z10, z11);
        return true;
    }
}
