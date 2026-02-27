package androidx.leanback.transition;

import android.animation.Animator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import d.AbstractC1617D;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public class ParallaxTransition extends Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Interpolator f15310a = new LinearInterpolator();

    public ParallaxTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Animator b(View view) {
        AbstractC1617D.a(view.getTag(AbstractC1801f.f41028l));
        return null;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        return b(view);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return b(view);
    }
}
