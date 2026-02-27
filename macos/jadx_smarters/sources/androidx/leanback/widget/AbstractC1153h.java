package androidx.leanback.widget;

import android.animation.TimeAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import g0.AbstractC1800e;
import g0.AbstractC1801f;
import h0.C1845a;

/* JADX INFO: renamed from: androidx.leanback.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1153h {

    /* JADX INFO: renamed from: androidx.leanback.widget.h$a */
    public static class a implements InterfaceC1152g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15652b;

        public a(int i9, boolean z9) {
            if (!AbstractC1153h.b(i9)) {
                throw new IllegalArgumentException("Unhandled zoom index");
            }
            this.f15651a = i9;
            this.f15652b = z9;
        }

        @Override // androidx.leanback.widget.InterfaceC1152g
        public void a(View view, boolean z9) {
            view.setSelected(z9);
            c(view).a(z9, false);
        }

        @Override // androidx.leanback.widget.InterfaceC1152g
        public void b(View view) {
            c(view).a(false, true);
        }

        public final b c(View view) {
            b bVar = (b) view.getTag(AbstractC1801f.f41027k);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(view, d(view.getResources()), this.f15652b, 150);
            view.setTag(AbstractC1801f.f41027k, bVar2);
            return bVar2;
        }

        public final float d(Resources resources) {
            int i9 = this.f15651a;
            if (i9 == 0) {
                return 1.0f;
            }
            return resources.getFraction(AbstractC1153h.a(i9), 1, 1);
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.h$b */
    public static class b implements TimeAnimator.TimeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f15653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final P f15655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f15656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15657e = 0.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f15658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TimeAnimator f15660h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Interpolator f15661i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final C1845a f15662j;

        public b(View view, float f9, boolean z9, int i9) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f15660h = timeAnimator;
            this.f15661i = new AccelerateDecelerateInterpolator();
            this.f15653a = view;
            this.f15654b = i9;
            this.f15656d = f9 - 1.0f;
            if (view instanceof P) {
                this.f15655c = (P) view;
            } else {
                this.f15655c = null;
            }
            timeAnimator.setTimeListener(this);
            if (z9) {
                this.f15662j = C1845a.a(view.getContext());
            } else {
                this.f15662j = null;
            }
        }

        public void a(boolean z9, boolean z10) {
            b();
            float f9 = z9 ? 1.0f : 0.0f;
            if (z10) {
                c(f9);
                return;
            }
            float f10 = this.f15657e;
            if (f10 != f9) {
                this.f15658f = f10;
                this.f15659g = f9 - f10;
                this.f15660h.start();
            }
        }

        public void b() {
            this.f15660h.end();
        }

        public void c(float f9) {
            this.f15657e = f9;
            float f10 = (this.f15656d * f9) + 1.0f;
            this.f15653a.setScaleX(f10);
            this.f15653a.setScaleY(f10);
            P p9 = this.f15655c;
            if (p9 != null) {
                p9.setShadowFocusLevel(f9);
            } else {
                Q.i(this.f15653a, f9);
            }
            C1845a c1845a = this.f15662j;
            if (c1845a != null) {
                c1845a.c(f9);
                int color = this.f15662j.b().getColor();
                P p10 = this.f15655c;
                if (p10 != null) {
                    p10.setOverlayColor(color);
                } else {
                    Q.h(this.f15653a, color);
                }
            }
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j9, long j10) {
            float interpolation;
            int i9 = this.f15654b;
            if (j9 >= i9) {
                this.f15660h.end();
                interpolation = 1.0f;
            } else {
                interpolation = (float) (j9 / ((double) i9));
            }
            Interpolator interpolator = this.f15661i;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            c(this.f15658f + (interpolation * this.f15659g));
        }
    }

    public static int a(int i9) {
        if (i9 == 1) {
            return AbstractC1800e.f41006d;
        }
        if (i9 == 2) {
            return AbstractC1800e.f41005c;
        }
        if (i9 == 3) {
            return AbstractC1800e.f41004b;
        }
        if (i9 != 4) {
            return 0;
        }
        return AbstractC1800e.f41007e;
    }

    public static boolean b(int i9) {
        return i9 == 0 || a(i9) > 0;
    }

    public static void c(C1164t c1164t, int i9, boolean z9) {
        c1164t.x0(new a(i9, z9));
    }
}
