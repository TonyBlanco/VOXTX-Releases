package P;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f6767b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f6768c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6769d = -1;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f6770a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f6771c;

        public a(T t9, View view) {
            this.f6770a = t9;
            this.f6771c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6770a.a(this.f6771c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6770a.b(this.f6771c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6770a.c(this.f6771c);
        }
    }

    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    public static class c {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public S(View view) {
        this.f6766a = new WeakReference(view);
    }

    public S b(float f9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f6766a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public S f(float f9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().scaleX(f9);
        }
        return this;
    }

    public S g(float f9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().scaleY(f9);
        }
        return this;
    }

    public S h(long j9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().setDuration(j9);
        }
        return this;
    }

    public S i(Interpolator interpolator) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public S j(T t9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            k(view, t9);
        }
        return this;
    }

    public final void k(View view, T t9) {
        if (t9 != null) {
            view.animate().setListener(new a(t9, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public S l(long j9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().setStartDelay(j9);
        }
        return this;
    }

    public S m(final V v9) {
        final View view = (View) this.f6766a.get();
        if (view != null) {
            c.a(view.animate(), v9 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: P.Q
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v9.a(view);
                }
            } : null);
        }
        return this;
    }

    public void n() {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public S o(float f9) {
        View view = (View) this.f6766a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
        return this;
    }

    public S p() {
        View view = (View) this.f6766a.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }
}
