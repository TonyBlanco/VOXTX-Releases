package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: K0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0673d extends N {

    /* JADX INFO: renamed from: K0.d$a */
    public class a extends AbstractC0682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3483a;

        public a(View view) {
            this.f3483a = view;
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            A.g(this.f3483a, 1.0f);
            A.a(this.f3483a);
            abstractC0681l.Q(this);
        }
    }

    /* JADX INFO: renamed from: K0.d$b */
    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f3485a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3486c = false;

        public b(View view) {
            this.f3485a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            A.g(this.f3485a, 1.0f);
            if (this.f3486c) {
                this.f3485a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (P.L.S(this.f3485a) && this.f3485a.getLayerType() == 0) {
                this.f3486c = true;
                this.f3485a.setLayerType(2, null);
            }
        }
    }

    public C0673d() {
    }

    public C0673d(int i9) {
        j0(i9);
    }

    public static float l0(s sVar, float f9) {
        Float f10;
        return (sVar == null || (f10 = (Float) sVar.f3568a.get("android:fade:transitionAlpha")) == null) ? f9 : f10.floatValue();
    }

    @Override // K0.N
    public Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fL0 = l0(sVar, 0.0f);
        return k0(view, fL0 != 1.0f ? fL0 : 0.0f, 1.0f);
    }

    @Override // K0.N
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        A.e(view);
        return k0(view, l0(sVar, 1.0f), 0.0f);
    }

    @Override // K0.N, K0.AbstractC0681l
    public void j(s sVar) {
        super.j(sVar);
        sVar.f3568a.put("android:fade:transitionAlpha", Float.valueOf(A.c(sVar.f3569b)));
    }

    public final Animator k0(View view, float f9, float f10) {
        if (f9 == f10) {
            return null;
        }
        A.g(view, f9);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) A.f3416b, f10);
        objectAnimatorOfFloat.addListener(new b(view));
        b(new a(view));
        return objectAnimatorOfFloat;
    }
}
