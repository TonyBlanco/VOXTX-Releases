package T4;

import R4.g;
import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import f5.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9544a = {R.attr.stateListAnimator};

    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(View view, float f9) {
        int integer = view.getResources().getInteger(g.f8803a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j9 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, R4.b.f8659E, -R4.b.f8660F}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j9));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f9).setDuration(j9));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(View view, AttributeSet attributeSet, int i9, int i10) {
        Context context = view.getContext();
        TypedArray typedArrayH = u.h(context, attributeSet, f9544a, i9, i10, new int[0]);
        try {
            if (typedArrayH.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayH.getResourceId(0, 0)));
            }
        } finally {
            typedArrayH.recycle();
        }
    }
}
