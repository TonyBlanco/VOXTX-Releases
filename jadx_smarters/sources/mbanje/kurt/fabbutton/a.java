package mbanje.kurt.fabbutton;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: mbanje.kurt.fabbutton.a$a, reason: collision with other inner class name */
    public class C0390a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44858a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f44859c;

        public C0390a(g gVar, View view) {
            this.f44858a = gVar;
            this.f44859c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f44858a.a(-1.0f, -1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f);
            this.f44859c.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44860a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f44861c;

        public b(g gVar, View view) {
            this.f44860a = gVar;
            this.f44861c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f44860a.a(-1.0f, -1.0f, -1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f44861c.invalidate();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44862a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f44863c;

        public c(g gVar, View view) {
            this.f44862a = gVar;
            this.f44863c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f44862a.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f, -1.0f);
            this.f44863c.invalidate();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44864a;

        public d(g gVar) {
            this.f44864a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f44864a.a(-1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f44865a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f44866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f44867d;

        public e(float f9, g gVar, View view) {
            this.f44865a = f9;
            this.f44866c = gVar;
            this.f44867d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f44866c.a((285.0f - fFloatValue) + this.f44865a, -1.0f, fFloatValue, -1.0f);
            this.f44867d.invalidate();
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44868a;

        public f(g gVar) {
            this.f44868a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f44868a.a(-1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f);
        }
    }

    public interface g {
        void a(float f9, float f10, float f11, float f12);
    }

    public static AnimatorSet a(View view, float f9, int i9, g gVar) {
        float f10 = (270.0f * f9) - 90.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(15.0f, 285.0f);
        long j9 = (i9 / 4) / 2;
        valueAnimatorOfFloat.setDuration(j9);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat.addUpdateListener(new c(gVar, view));
        float f11 = ((f9 + 0.5f) * 720.0f) / 4.0f;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((f9 * 720.0f) / 4.0f, f11);
        valueAnimatorOfFloat2.setDuration(j9);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new d(gVar));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f10, (285.0f + f10) - 15.0f);
        valueAnimatorOfFloat3.setDuration(j9);
        valueAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat3.addUpdateListener(new e(f10, gVar, view));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f11, ((f9 + 1.0f) * 720.0f) / 4.0f);
        valueAnimatorOfFloat4.setDuration(j9);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.addUpdateListener(new f(gVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
        animatorSet.play(valueAnimatorOfFloat3).with(valueAnimatorOfFloat4).after(valueAnimatorOfFloat2);
        return animatorSet;
    }

    public static ValueAnimator b(View view, float f9, float f10, g gVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f9, f10);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new b(gVar, view));
        return valueAnimatorOfFloat;
    }

    public static ValueAnimator c(View view, float f9, float f10, g gVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f9, f10);
        valueAnimatorOfFloat.setDuration(5000L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimatorOfFloat.addUpdateListener(new C0390a(gVar, view));
        return valueAnimatorOfFloat;
    }
}
