package S4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f9423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9425e;

    public g(long j9, long j10) {
        this.f9423c = null;
        this.f9424d = 0;
        this.f9425e = 1;
        this.f9421a = j9;
        this.f9422b = j10;
    }

    public g(long j9, long j10, TimeInterpolator timeInterpolator) {
        this.f9424d = 0;
        this.f9425e = 1;
        this.f9421a = j9;
        this.f9422b = j10;
        this.f9423c = timeInterpolator;
    }

    public static g b(ValueAnimator valueAnimator) {
        g gVar = new g(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        gVar.f9424d = valueAnimator.getRepeatCount();
        gVar.f9425e = valueAnimator.getRepeatMode();
        return gVar;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f9410b : interpolator instanceof AccelerateInterpolator ? a.f9411c : interpolator instanceof DecelerateInterpolator ? a.f9412d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f9421a;
    }

    public long d() {
        return this.f9422b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f9423c;
        return timeInterpolator != null ? timeInterpolator : a.f9410b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (c() == gVar.c() && d() == gVar.d() && g() == gVar.g() && h() == gVar.h()) {
            return e().getClass().equals(gVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f9424d;
    }

    public int h() {
        return this.f9425e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
