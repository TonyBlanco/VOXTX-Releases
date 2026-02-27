package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f15328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f15329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f15331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f15332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15333g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f15334h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f15335i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f15336j;

        public a(View view, View view2, int i9, int i10, float f9, float f10) {
            this.f15329c = view;
            this.f15328a = view2;
            this.f15330d = i9 - Math.round(view.getTranslationX());
            this.f15331e = i10 - Math.round(view.getTranslationY());
            this.f15335i = f9;
            this.f15336j = f10;
            int[] iArr = (int[]) view2.getTag(AbstractC1801f.f41016E);
            this.f15332f = iArr;
            if (iArr != null) {
                view2.setTag(AbstractC1801f.f41016E, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f15332f == null) {
                this.f15332f = new int[2];
            }
            this.f15332f[0] = Math.round(this.f15330d + this.f15329c.getTranslationX());
            this.f15332f[1] = Math.round(this.f15331e + this.f15329c.getTranslationY());
            this.f15328a.setTag(AbstractC1801f.f41016E, this.f15332f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f15333g = this.f15329c.getTranslationX();
            this.f15334h = this.f15329c.getTranslationY();
            this.f15329c.setTranslationX(this.f15335i);
            this.f15329c.setTranslationY(this.f15336j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f15329c.setTranslationX(this.f15333g);
            this.f15329c.setTranslationY(this.f15334h);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f15329c.setTranslationX(this.f15335i);
            this.f15329c.setTranslationY(this.f15336j);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    public static Animator a(View view, TransitionValues transitionValues, int i9, int i10, float f9, float f10, float f11, float f12, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(AbstractC1801f.f41016E)) != null) {
            f9 = (r2[0] - i9) + translationX;
            f10 = (r2[1] - i10) + translationY;
        }
        int iRound = Math.round(f9 - translationX) + i9;
        int iRound2 = i10 + Math.round(f10 - translationY);
        view.setTranslationX(f9);
        view.setTranslationY(f10);
        if (f9 == f11 && f10 == f12) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f9, f10);
        path.lineTo(f11, f12);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        a aVar = new a(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(aVar);
        objectAnimatorOfFloat.addListener(aVar);
        objectAnimatorOfFloat.addPauseListener(aVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }
}
