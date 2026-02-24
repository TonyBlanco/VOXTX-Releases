package L0;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Interpolator a(Context context, int i9) {
        return AnimationUtils.loadInterpolator(context, i9);
    }
}
