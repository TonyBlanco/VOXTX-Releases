package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimator f27010d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f27010d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f27007a = 0;
        this.f27008b = 2;
        this.f27009c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27007a = 0;
        this.f27008b = 2;
        this.f27009c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i9, int i10) {
        return i9 == 2;
    }

    public final void F(View view, int i9, long j9, TimeInterpolator timeInterpolator) {
        this.f27010d = view.animate().translationY(i9).setInterpolator(timeInterpolator).setDuration(j9).setListener(new a());
    }

    public boolean G() {
        return this.f27008b == 1;
    }

    public boolean H() {
        return this.f27008b == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z9) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f27010d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f27008b = 1;
        int i9 = this.f27007a + this.f27009c;
        if (z9) {
            F(view, i9, 175L, S4.a.f9411c);
        } else {
            view.setTranslationY(i9);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z9) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f27010d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f27008b = 2;
        if (z9) {
            F(view, 0, 225L, S4.a.f9412d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        this.f27007a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i9);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        if (i10 > 0) {
            I(view);
        } else if (i10 < 0) {
            K(view);
        }
    }
}
