package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import g0.AbstractC1801f;
import g0.l;

/* JADX INFO: loaded from: classes.dex */
class SlideKitkat extends Visibility {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f15311d = new DecelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f15312e = new AccelerateInterpolator();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f15313f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f15314g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f15315h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f15316i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f15317j = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f15318k = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15319a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f15320c;

    public static class a extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationX() - view.getWidth();
        }
    }

    public static class b extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationY() - view.getHeight();
        }
    }

    public static class c extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationX() + view.getWidth();
        }
    }

    public static class d extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationY() + view.getHeight();
        }
    }

    public static class e extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
        }
    }

    public static class f extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }

    public interface g {
        float a(View view);

        float b(View view);

        Property c();
    }

    public static abstract class h implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public Property c() {
            return View.TRANSLATION_X;
        }
    }

    public static abstract class i implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public Property c() {
            return View.TRANSLATION_Y;
        }
    }

    public static class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15321a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f15323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f15324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f15325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f15326g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Property f15327h;

        public j(View view, Property property, float f9, float f10, int i9) {
            this.f15327h = property;
            this.f15323d = view;
            this.f15325f = f9;
            this.f15324e = f10;
            this.f15326g = i9;
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15323d.setTag(AbstractC1801f.f41037u, new float[]{this.f15323d.getTranslationX(), this.f15323d.getTranslationY()});
            this.f15327h.set(this.f15323d, Float.valueOf(this.f15325f));
            this.f15321a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f15321a) {
                this.f15327h.set(this.f15323d, Float.valueOf(this.f15325f));
            }
            this.f15323d.setVisibility(this.f15326g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f15322c = ((Float) this.f15327h.get(this.f15323d)).floatValue();
            this.f15327h.set(this.f15323d, Float.valueOf(this.f15324e));
            this.f15323d.setVisibility(this.f15326g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f15327h.set(this.f15323d, Float.valueOf(this.f15322c));
            this.f15323d.setVisibility(0);
        }
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f41106e0);
        c(typedArrayObtainStyledAttributes.getInt(l.f41114i0, 80));
        long j9 = typedArrayObtainStyledAttributes.getInt(l.f41110g0, -1);
        if (j9 >= 0) {
            setDuration(j9);
        }
        long j10 = typedArrayObtainStyledAttributes.getInt(l.f41112h0, -1);
        if (j10 > 0) {
            setStartDelay(j10);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f41108f0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Animator b(View view, Property property, float f9, float f10, float f11, TimeInterpolator timeInterpolator, int i9) {
        float[] fArr = (float[]) view.getTag(AbstractC1801f.f41037u);
        if (fArr != null) {
            f9 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(AbstractC1801f.f41037u, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f9, f10);
        j jVar = new j(view, property, f11, f10, i9);
        objectAnimatorOfFloat.addListener(jVar);
        objectAnimatorOfFloat.addPauseListener(jVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    public void c(int i9) {
        g gVar;
        if (i9 == 3) {
            gVar = f15313f;
        } else if (i9 == 5) {
            gVar = f15315h;
        } else if (i9 == 48) {
            gVar = f15314g;
        } else if (i9 == 80) {
            gVar = f15316i;
        } else if (i9 == 8388611) {
            gVar = f15317j;
        } else {
            if (i9 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            gVar = f15318k;
        }
        this.f15320c = gVar;
        this.f15319a = i9;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i9, TransitionValues transitionValues2, int i10) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.f15320c.b(view);
        return b(view, this.f15320c.c(), this.f15320c.a(view), fB, fB, f15311d, 0);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i9, TransitionValues transitionValues2, int i10) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.f15320c.b(view);
        return b(view, this.f15320c.c(), fB, this.f15320c.a(view), fB, f15312e, 4);
    }
}
