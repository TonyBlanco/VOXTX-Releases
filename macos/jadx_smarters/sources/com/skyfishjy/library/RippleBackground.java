package com.skyfishjy.library;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import c8.AbstractC1277a;
import c8.AbstractC1278b;
import c8.AbstractC1279c;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.protocol.HttpRequestExecutor;

/* JADX INFO: loaded from: classes4.dex */
public class RippleBackground extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38985a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f38987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f38991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f38993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f38995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f38996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout.LayoutParams f38997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f38998o;

    public class a extends View {
        public a(Context context) {
            super(context);
            setVisibility(4);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            float fMin = Math.min(getWidth(), getHeight()) / 2;
            canvas.drawCircle(fMin, fMin, fMin - RippleBackground.this.f38986c, RippleBackground.this.f38993j);
        }
    }

    public RippleBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38994k = false;
        this.f38998o = new ArrayList();
        c(context, attributeSet);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Paint paint;
        Paint.Style style;
        if (isInEditMode()) {
            return;
        }
        if (attributeSet == null) {
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1279c.f18321a);
        this.f38985a = typedArrayObtainStyledAttributes.getColor(AbstractC1279c.f18322b, getResources().getColor(AbstractC1277a.f18318a));
        this.f38986c = typedArrayObtainStyledAttributes.getDimension(AbstractC1279c.f18327g, getResources().getDimension(AbstractC1278b.f18320b));
        this.f38987d = typedArrayObtainStyledAttributes.getDimension(AbstractC1279c.f18324d, getResources().getDimension(AbstractC1278b.f18319a));
        this.f38988e = typedArrayObtainStyledAttributes.getInt(AbstractC1279c.f18323c, HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        this.f38989f = typedArrayObtainStyledAttributes.getInt(AbstractC1279c.f18325e, 6);
        this.f38991h = typedArrayObtainStyledAttributes.getFloat(AbstractC1279c.f18326f, 6.0f);
        this.f38992i = typedArrayObtainStyledAttributes.getInt(AbstractC1279c.f18328h, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f38990g = this.f38988e / this.f38989f;
        Paint paint2 = new Paint();
        this.f38993j = paint2;
        paint2.setAntiAlias(true);
        if (this.f38992i == 0) {
            this.f38986c = 0.0f;
            paint = this.f38993j;
            style = Paint.Style.FILL;
        } else {
            paint = this.f38993j;
            style = Paint.Style.STROKE;
        }
        paint.setStyle(style);
        this.f38993j.setColor(this.f38985a);
        float f9 = this.f38987d;
        float f10 = this.f38986c;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ((f9 + f10) * 2.0f), (int) ((f9 + f10) * 2.0f));
        this.f38997n = layoutParams;
        layoutParams.addRule(13, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f38995l = animatorSet;
        animatorSet.setDuration(this.f38988e);
        this.f38995l.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f38996m = new ArrayList();
        for (int i9 = 0; i9 < this.f38989f; i9++) {
            a aVar = new a(getContext());
            addView(aVar, this.f38997n);
            this.f38998o.add(aVar);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(aVar, "ScaleX", 1.0f, this.f38991h);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setStartDelay(this.f38990g * i9);
            this.f38996m.add(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(aVar, "ScaleY", 1.0f, this.f38991h);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(1);
            objectAnimatorOfFloat2.setStartDelay(this.f38990g * i9);
            this.f38996m.add(objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(aVar, "Alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat3.setRepeatCount(-1);
            objectAnimatorOfFloat3.setRepeatMode(1);
            objectAnimatorOfFloat3.setStartDelay(this.f38990g * i9);
            this.f38996m.add(objectAnimatorOfFloat3);
        }
        this.f38995l.playTogether(this.f38996m);
    }

    public boolean d() {
        return this.f38994k;
    }

    public void e() {
        if (d()) {
            return;
        }
        Iterator it = this.f38998o.iterator();
        while (it.hasNext()) {
            ((a) it.next()).setVisibility(0);
        }
        this.f38995l.start();
        this.f38994k = true;
    }

    public void f() {
        if (d()) {
            this.f38995l.end();
            this.f38994k = false;
        }
    }
}
