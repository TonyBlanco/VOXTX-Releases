package com.google.android.gms.cast.framework.internal.featurehighlight;

import P.C0973o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.cast.zzeb;
import com.google.android.gms.internal.cast.zzek;
import o4.AbstractC2340q;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f26349a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f26350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f26351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OuterHighlightDrawable f26352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InnerZoneDrawable f26353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f26354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animator f26355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f26356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0973o f26357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0973o f26358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f26359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HelpTextView f26361n;

    public h(Context context) {
        super(context);
        this.f26349a = new int[2];
        this.f26350c = new Rect();
        this.f26351d = new Rect();
        setId(AbstractC2340q.f45935I);
        setWillNotDraw(false);
        InnerZoneDrawable innerZoneDrawable = new InnerZoneDrawable(context);
        this.f26353f = innerZoneDrawable;
        innerZoneDrawable.setCallback(this);
        OuterHighlightDrawable outerHighlightDrawable = new OuterHighlightDrawable(context);
        this.f26352e = outerHighlightDrawable;
        outerHighlightDrawable.setCallback(this);
        this.f26356i = new i(this);
        C0973o c0973o = new C0973o(context, new a(this));
        this.f26357j = c0973o;
        c0973o.b(false);
        setVisibility(8);
    }

    public static /* synthetic */ Animator a(h hVar) {
        InnerZoneDrawable innerZoneDrawable = hVar.f26353f;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.0f, 1.1f).setDuration(500L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(innerZoneDrawable, "scale", 1.1f, 1.0f).setDuration(500L);
        ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(innerZoneDrawable, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
        animatorSet.play(duration);
        animatorSet.play(duration2).with(duration3).after(duration);
        animatorSet.setInterpolator(zzek.zzb());
        animatorSet.setStartDelay(500L);
        zzeb.zzd(animatorSet, -1, null);
        return animatorSet;
    }

    public final View b() {
        return this.f26361n.asView();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final InnerZoneDrawable d() {
        return this.f26353f;
    }

    public final OuterHighlightDrawable f() {
        return this.f26352e;
    }

    public final void g(Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f26361n.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(zzek.zza());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f26352e, PropertyValuesHolder.ofFloat("scale", 1.125f), PropertyValuesHolder.ofInt("alpha", 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzek.zza());
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        Animator animatorA = this.f26353f.a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, animatorA);
        animatorSet.addListener(new e(this, runnable));
        o(animatorSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public final void h(Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f26361n.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(zzek.zza());
        float fExactCenterX = this.f26350c.exactCenterX() - this.f26352e.a();
        float fExactCenterY = this.f26350c.exactCenterY() - this.f26352e.b();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f26352e, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofFloat("translationX", 0.0f, fExactCenterX), PropertyValuesHolder.ofFloat("translationY", 0.0f, fExactCenterY), PropertyValuesHolder.ofInt("alpha", 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzek.zza());
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        Animator animatorA = this.f26353f.a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, animatorA);
        animatorSet.addListener(new f(this, runnable));
        o(animatorSet);
    }

    public final void i(View view, View view2, boolean z9, g gVar) {
        this.f26354g = view;
        this.f26359l = gVar;
        C0973o c0973o = new C0973o(getContext(), new b(this, view, true, gVar));
        this.f26358k = c0973o;
        c0973o.b(false);
        setVisibility(4);
    }

    public final void j(int i9) {
        this.f26352e.e(i9);
    }

    public final void k() {
        if (this.f26354g == null) {
            throw new IllegalStateException("Target view must be set before animation");
        }
        setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f26361n.asView(), "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(zzek.zzc());
        Animator animatorD = this.f26352e.d(this.f26350c.exactCenterX() - this.f26352e.a(), this.f26350c.exactCenterY() - this.f26352e.b());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f26353f, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofInt("alpha", 0, 255));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(zzek.zzc());
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(350L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, animatorD, duration2);
        animatorSet.addListener(new d(this));
        o(animatorSet);
    }

    public final void l(Runnable runnable) {
        addOnLayoutChangeListener(new c(this, null));
    }

    public final void n(HelpTextView helpTextView) {
        helpTextView.getClass();
        this.f26361n = helpTextView;
        addView(helpTextView.asView(), 0);
    }

    public final void o(Animator animator) {
        Animator animator2 = this.f26355h;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f26355h = animator;
        animator.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        this.f26352e.draw(canvas);
        this.f26353f.draw(canvas);
        View view = this.f26354g;
        if (view == null) {
            throw new IllegalStateException("Neither target view nor drawable was set");
        }
        if (view.getParent() != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f26354g.getWidth(), this.f26354g.getHeight(), Bitmap.Config.ARGB_8888);
            this.f26354g.draw(new Canvas(bitmapCreateBitmap));
            int iC = this.f26352e.c();
            int iRed = Color.red(iC);
            int iGreen = Color.green(iC);
            int iBlue = Color.blue(iC);
            for (int i9 = 0; i9 < bitmapCreateBitmap.getHeight(); i9++) {
                for (int i10 = 0; i10 < bitmapCreateBitmap.getWidth(); i10++) {
                    int pixel = bitmapCreateBitmap.getPixel(i10, i9);
                    if (Color.alpha(pixel) != 0) {
                        bitmapCreateBitmap.setPixel(i10, i9, Color.argb(Color.alpha(pixel), iRed, iGreen, iBlue));
                    }
                }
            }
            Rect rect = this.f26350c;
            canvas.drawBitmap(bitmapCreateBitmap, rect.left, rect.top, (Paint) null);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        View view = this.f26354g;
        if (view == null) {
            throw new IllegalStateException("Target view must be set before layout");
        }
        if (view.getParent() != null) {
            int[] iArr = this.f26349a;
            View view2 = this.f26354g;
            getLocationInWindow(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            view2.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i13;
            iArr[1] = iArr[1] - i14;
        }
        Rect rect = this.f26350c;
        int[] iArr2 = this.f26349a;
        int i15 = iArr2[0];
        rect.set(i15, iArr2[1], this.f26354g.getWidth() + i15, this.f26349a[1] + this.f26354g.getHeight());
        this.f26351d.set(i9, i10, i11, i12);
        this.f26352e.setBounds(this.f26351d);
        this.f26353f.setBounds(this.f26351d);
        this.f26356i.a(this.f26350c, this.f26351d);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(i9), i9), View.resolveSize(View.MeasureSpec.getSize(i10), i10));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f26360m = this.f26350c.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (this.f26360m) {
            C0973o c0973o = this.f26358k;
            if (c0973o != null) {
                c0973o.a(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            if (this.f26354g.getParent() != null) {
                this.f26354g.onTouchEvent(motionEvent);
            }
        } else {
            this.f26357j.a(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f26352e || drawable == this.f26353f || drawable == null;
    }
}
