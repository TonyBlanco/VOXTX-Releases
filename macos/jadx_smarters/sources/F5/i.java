package f5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40789a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f40790b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f40791c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f40792d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f40791c == animator) {
                iVar.f40791c = null;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f40794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueAnimator f40795b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f40794a = iArr;
            this.f40795b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f40792d);
        this.f40789a.add(bVar);
    }
}
