package v2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import x2.f;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2870a {
    public static boolean a(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public static boolean b(f... fVarArr) {
        for (f fVar : fVarArr) {
            if (fVar.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(ValueAnimator valueAnimator) {
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public static void d(Animator animator) {
        if (animator == null || animator.isStarted()) {
            return;
        }
        animator.start();
    }

    public static void e(f... fVarArr) {
        for (f fVar : fVarArr) {
            fVar.start();
        }
    }

    public static void f(f... fVarArr) {
        for (f fVar : fVarArr) {
            fVar.stop();
        }
    }
}
