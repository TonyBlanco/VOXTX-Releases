package androidx.recyclerview.widget;

import P.L;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class d extends RecyclerView.n implements RecyclerView.s {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f16952D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f16953E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f16954A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Runnable f16955B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RecyclerView.t f16956C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f16959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f16960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f16963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f16964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f16969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f16972p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f16975s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f16982z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16973q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16974r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16976t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16977u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16978v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16979w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f16980x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f16981y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.s(500);
        }
    }

    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i9, int i10) {
            d.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f16985a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16985a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f16985a) {
                this.f16985a = false;
                return;
            }
            if (((Float) d.this.f16982z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f16954A = 0;
                dVar.A(0);
            } else {
                d dVar2 = d.this;
                dVar2.f16954A = 2;
                dVar2.x();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    public class C0193d implements ValueAnimator.AnimatorUpdateListener {
        public C0193d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f16959c.setAlpha(iFloatValue);
            d.this.f16960d.setAlpha(iFloatValue);
            d.this.x();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i9, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f16982z = valueAnimatorOfFloat;
        this.f16954A = 0;
        this.f16955B = new a();
        this.f16956C = new b();
        this.f16959c = stateListDrawable;
        this.f16960d = drawable;
        this.f16963g = stateListDrawable2;
        this.f16964h = drawable2;
        this.f16961e = Math.max(i9, stateListDrawable.getIntrinsicWidth());
        this.f16962f = Math.max(i9, drawable.getIntrinsicWidth());
        this.f16965i = Math.max(i9, stateListDrawable2.getIntrinsicWidth());
        this.f16966j = Math.max(i9, drawable2.getIntrinsicWidth());
        this.f16957a = i10;
        this.f16958b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0193d());
        l(recyclerView);
    }

    public void A(int i9) {
        int i10;
        if (i9 == 2 && this.f16978v != 2) {
            this.f16959c.setState(f16952D);
            m();
        }
        if (i9 == 0) {
            x();
        } else {
            C();
        }
        if (this.f16978v != 2 || i9 == 2) {
            i10 = i9 == 1 ? 1500 : 1200;
            this.f16978v = i9;
        }
        this.f16959c.setState(f16953E);
        y(i10);
        this.f16978v = i9;
    }

    public final void B() {
        this.f16975s.h(this);
        this.f16975s.k(this);
        this.f16975s.l(this.f16956C);
    }

    public void C() {
        int i9 = this.f16954A;
        if (i9 != 0) {
            if (i9 != 3) {
                return;
            } else {
                this.f16982z.cancel();
            }
        }
        this.f16954A = 1;
        ValueAnimator valueAnimator = this.f16982z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f16982z.setDuration(500L);
        this.f16982z.setStartDelay(0L);
        this.f16982z.start();
    }

    public void D(int i9, int i10) {
        int iComputeVerticalScrollRange = this.f16975s.computeVerticalScrollRange();
        int i11 = this.f16974r;
        this.f16976t = iComputeVerticalScrollRange - i11 > 0 && i11 >= this.f16957a;
        int iComputeHorizontalScrollRange = this.f16975s.computeHorizontalScrollRange();
        int i12 = this.f16973q;
        boolean z9 = iComputeHorizontalScrollRange - i12 > 0 && i12 >= this.f16957a;
        this.f16977u = z9;
        boolean z10 = this.f16976t;
        if (!z10 && !z9) {
            if (this.f16978v != 0) {
                A(0);
                return;
            }
            return;
        }
        if (z10) {
            float f9 = i11;
            this.f16968l = (int) ((f9 * (i10 + (f9 / 2.0f))) / iComputeVerticalScrollRange);
            this.f16967k = Math.min(i11, (i11 * i11) / iComputeVerticalScrollRange);
        }
        if (this.f16977u) {
            float f10 = i12;
            this.f16971o = (int) ((f10 * (i9 + (f10 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f16970n = Math.min(i12, (i12 * i12) / iComputeHorizontalScrollRange);
        }
        int i13 = this.f16978v;
        if (i13 == 0 || i13 == 1) {
            A(1);
        }
    }

    public final void E(float f9) {
        int[] iArrR = r();
        float fMax = Math.max(iArrR[0], Math.min(iArrR[1], f9));
        if (Math.abs(this.f16968l - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f16969m, fMax, iArrR, this.f16975s.computeVerticalScrollRange(), this.f16975s.computeVerticalScrollOffset(), this.f16974r);
        if (iZ != 0) {
            this.f16975s.scrollBy(0, iZ);
        }
        this.f16969m = fMax;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f16978v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zW = w(motionEvent.getX(), motionEvent.getY());
            boolean zV = v(motionEvent.getX(), motionEvent.getY());
            if (zW || zV) {
                if (zV) {
                    this.f16979w = 1;
                    this.f16972p = (int) motionEvent.getX();
                } else if (zW) {
                    this.f16979w = 2;
                    this.f16969m = (int) motionEvent.getY();
                }
                A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f16978v == 2) {
            this.f16969m = 0.0f;
            this.f16972p = 0.0f;
            A(1);
            this.f16979w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f16978v == 2) {
            C();
            if (this.f16979w == 1) {
                t(motionEvent.getX());
            }
            if (this.f16979w == 2) {
                E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i9 = this.f16978v;
        if (i9 == 1) {
            boolean zW = w(motionEvent.getX(), motionEvent.getY());
            boolean zV = v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zW && !zV) {
                return false;
            }
            if (zV) {
                this.f16979w = 1;
                this.f16972p = (int) motionEvent.getX();
            } else if (zW) {
                this.f16979w = 2;
                this.f16969m = (int) motionEvent.getY();
            }
            A(2);
        } else if (i9 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z9) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a9) {
        if (this.f16973q != this.f16975s.getWidth() || this.f16974r != this.f16975s.getHeight()) {
            this.f16973q = this.f16975s.getWidth();
            this.f16974r = this.f16975s.getHeight();
            A(0);
        } else if (this.f16954A != 0) {
            if (this.f16976t) {
                p(canvas);
            }
            if (this.f16977u) {
                o(canvas);
            }
        }
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f16975s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.f16975s = recyclerView;
        if (recyclerView != null) {
            B();
        }
    }

    public final void m() {
        this.f16975s.removeCallbacks(this.f16955B);
    }

    public final void n() {
        this.f16975s.a1(this);
        this.f16975s.c1(this);
        this.f16975s.d1(this.f16956C);
        m();
    }

    public final void o(Canvas canvas) {
        int i9 = this.f16974r;
        int i10 = this.f16965i;
        int i11 = this.f16971o;
        int i12 = this.f16970n;
        this.f16963g.setBounds(0, 0, i12, i10);
        this.f16964h.setBounds(0, 0, this.f16973q, this.f16966j);
        canvas.translate(0.0f, i9 - i10);
        this.f16964h.draw(canvas);
        canvas.translate(i11 - (i12 / 2), 0.0f);
        this.f16963g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void p(Canvas canvas) {
        int i9 = this.f16973q;
        int i10 = this.f16961e;
        int i11 = i9 - i10;
        int i12 = this.f16968l;
        int i13 = this.f16967k;
        int i14 = i12 - (i13 / 2);
        this.f16959c.setBounds(0, 0, i10, i13);
        this.f16960d.setBounds(0, 0, this.f16962f, this.f16974r);
        if (u()) {
            this.f16960d.draw(canvas);
            canvas.translate(this.f16961e, i14);
            canvas.scale(-1.0f, 1.0f);
            this.f16959c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i11 = this.f16961e;
        } else {
            canvas.translate(i11, 0.0f);
            this.f16960d.draw(canvas);
            canvas.translate(0.0f, i14);
            this.f16959c.draw(canvas);
        }
        canvas.translate(-i11, -i14);
    }

    public final int[] q() {
        int[] iArr = this.f16981y;
        int i9 = this.f16958b;
        iArr[0] = i9;
        iArr[1] = this.f16973q - i9;
        return iArr;
    }

    public final int[] r() {
        int[] iArr = this.f16980x;
        int i9 = this.f16958b;
        iArr[0] = i9;
        iArr[1] = this.f16974r - i9;
        return iArr;
    }

    public void s(int i9) {
        int i10 = this.f16954A;
        if (i10 == 1) {
            this.f16982z.cancel();
        } else if (i10 != 2) {
            return;
        }
        this.f16954A = 3;
        ValueAnimator valueAnimator = this.f16982z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f16982z.setDuration(i9);
        this.f16982z.start();
    }

    public final void t(float f9) {
        int[] iArrQ = q();
        float fMax = Math.max(iArrQ[0], Math.min(iArrQ[1], f9));
        if (Math.abs(this.f16971o - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f16972p, fMax, iArrQ, this.f16975s.computeHorizontalScrollRange(), this.f16975s.computeHorizontalScrollOffset(), this.f16973q);
        if (iZ != 0) {
            this.f16975s.scrollBy(iZ, 0);
        }
        this.f16972p = fMax;
    }

    public final boolean u() {
        return L.E(this.f16975s) == 1;
    }

    public boolean v(float f9, float f10) {
        if (f10 >= this.f16974r - this.f16965i) {
            int i9 = this.f16971o;
            int i10 = this.f16970n;
            if (f9 >= i9 - (i10 / 2) && f9 <= i9 + (i10 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean w(float f9, float f10) {
        if (!u() ? f9 >= this.f16973q - this.f16961e : f9 <= this.f16961e / 2) {
            int i9 = this.f16968l;
            int i10 = this.f16967k;
            if (f10 >= i9 - (i10 / 2) && f10 <= i9 + (i10 / 2)) {
                return true;
            }
        }
        return false;
    }

    public void x() {
        this.f16975s.invalidate();
    }

    public final void y(int i9) {
        m();
        this.f16975s.postDelayed(this.f16955B, i9);
    }

    public final int z(float f9, float f10, int[] iArr, int i9, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 == 0) {
            return 0;
        }
        int i13 = i9 - i11;
        int i14 = (int) (((f10 - f9) / i12) * i13);
        int i15 = i10 + i14;
        if (i15 >= i13 || i15 < 0) {
            return 0;
        }
        return i14;
    }
}
