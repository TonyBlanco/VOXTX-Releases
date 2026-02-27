package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import g0.l;

/* JADX INFO: loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeInterpolator f15299f = new DecelerateInterpolator();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f15300g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f15301h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f15302i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f15303j = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f15304k = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f15305a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Visibility f15306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f15308e;

    public static class a extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int layoutDirection = viewGroup.getLayoutDirection();
            float translationX = view.getTranslationX();
            float fC = fadeAndShortSlide.c(viewGroup);
            return layoutDirection == 1 ? translationX + fC : translationX - fC;
        }
    }

    public static class b extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int layoutDirection = viewGroup.getLayoutDirection();
            float translationX = view.getTranslationX();
            float fC = fadeAndShortSlide.c(viewGroup);
            return layoutDirection == 1 ? translationX - fC : translationX + fC;
        }
    }

    public static class c extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int width = iArr[0] + (view.getWidth() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            int width2 = epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX();
            float translationX = view.getTranslationX();
            float fC = fadeAndShortSlide.c(viewGroup);
            return width < width2 ? translationX - fC : translationX + fC;
        }
    }

    public static class d extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() + fadeAndShortSlide.d(viewGroup);
        }
    }

    public static class e extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.d(viewGroup);
        }
    }

    public class f extends g {
        public f() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int height = iArr[1] + (view.getHeight() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            int height2 = epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY();
            float translationY = view.getTranslationY();
            float fD = fadeAndShortSlide.d(viewGroup);
            return height < height2 ? translationY - fD : translationY + fD;
        }
    }

    public static abstract class g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15306c = new Fade();
        this.f15307d = -1.0f;
        this.f15308e = new f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f41106e0);
        e(typedArrayObtainStyledAttributes.getInt(l.f41114i0, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.transition.Transition
    public Transition addListener(Transition.TransitionListener transitionListener) {
        this.f15306c.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final void b(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    public float c(ViewGroup viewGroup) {
        float f9 = this.f15307d;
        return f9 >= 0.0f ? f9 : viewGroup.getWidth() / 4;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        this.f15306c.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        b(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        this.f15306c.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        b(transitionValues);
    }

    @Override // android.transition.Transition
    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f15306c = (Visibility) this.f15306c.clone();
        return fadeAndShortSlide;
    }

    public float d(ViewGroup viewGroup) {
        float f9 = this.f15307d;
        return f9 >= 0.0f ? f9 : viewGroup.getHeight() / 4;
    }

    public void e(int i9) {
        g gVar;
        if (i9 == 48) {
            gVar = f15304k;
        } else if (i9 == 80) {
            gVar = f15303j;
        } else if (i9 == 112) {
            gVar = this.f15308e;
        } else if (i9 == 8388611) {
            gVar = f15300g;
        } else if (i9 == 8388613) {
            gVar = f15301h;
        } else {
            if (i9 != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            gVar = f15302i;
        }
        this.f15305a = gVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i9 = iArr[0];
        int i10 = iArr[1];
        float translationX = view.getTranslationX();
        Animator animatorA = androidx.leanback.transition.b.a(view, transitionValues2, i9, i10, this.f15305a.a(this, viewGroup, view, iArr), this.f15305a.b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f15299f, this);
        Animator animatorOnAppear = this.f15306c.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        Animator animatorA = androidx.leanback.transition.b.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f15305a.a(this, viewGroup, view, iArr), this.f15305a.b(this, viewGroup, view, iArr), f15299f, this);
        Animator animatorOnDisappear = this.f15306c.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f15306c.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f15306c.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
