package androidx.recyclerview.widget;

import P.C0973o;
import P.L;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends RecyclerView.n implements RecyclerView.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0194f f17003A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Rect f17005C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f17006D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f17016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f17017k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f17019m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17021o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f17024r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f17026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f17027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f17028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecyclerView.j f17029w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0973o f17032z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17007a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f17008b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.D f17009c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17018l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17020n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f17022p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f17025s = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f17030x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17031y = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RecyclerView.s f17004B = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if (fVar.f17009c == null || !fVar.E()) {
                return;
            }
            f fVar2 = f.this;
            RecyclerView.D d9 = fVar2.f17009c;
            if (d9 != null) {
                fVar2.z(d9);
            }
            f fVar3 = f.this;
            fVar3.f17024r.removeCallbacks(fVar3.f17025s);
            L.k0(f.this.f17024r, this);
        }
    }

    public class b implements RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            f.this.f17032z.a(motionEvent);
            VelocityTracker velocityTracker = f.this.f17026t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (f.this.f17018l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(f.this.f17018l);
            if (iFindPointerIndex >= 0) {
                f.this.o(actionMasked, motionEvent, iFindPointerIndex);
            }
            f fVar = f.this;
            RecyclerView.D d9 = fVar.f17009c;
            if (d9 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        fVar.L(motionEvent, fVar.f17021o, iFindPointerIndex);
                        f.this.z(d9);
                        f fVar2 = f.this;
                        fVar2.f17024r.removeCallbacks(fVar2.f17025s);
                        f.this.f17025s.run();
                        f.this.f17024r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    f fVar3 = f.this;
                    if (pointerId == fVar3.f17018l) {
                        fVar3.f17018l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        f fVar4 = f.this;
                        fVar4.L(motionEvent, fVar4.f17021o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = fVar.f17026t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            f.this.F(null, 0);
            f.this.f17018l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarS;
            f.this.f17032z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                f.this.f17018l = motionEvent.getPointerId(0);
                f.this.f17010d = motionEvent.getX();
                f.this.f17011e = motionEvent.getY();
                f.this.A();
                f fVar = f.this;
                if (fVar.f17009c == null && (gVarS = fVar.s(motionEvent)) != null) {
                    f fVar2 = f.this;
                    fVar2.f17010d -= gVarS.f17055k;
                    fVar2.f17011e -= gVarS.f17056l;
                    fVar2.r(gVarS.f17050f, true);
                    if (f.this.f17007a.remove(gVarS.f17050f.f16733a)) {
                        f fVar3 = f.this;
                        fVar3.f17019m.c(fVar3.f17024r, gVarS.f17050f);
                    }
                    f.this.F(gVarS.f17050f, gVarS.f17051g);
                    f fVar4 = f.this;
                    fVar4.L(motionEvent, fVar4.f17021o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                f fVar5 = f.this;
                fVar5.f17018l = -1;
                fVar5.F(null, 0);
            } else {
                int i9 = f.this.f17018l;
                if (i9 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i9)) >= 0) {
                    f.this.o(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = f.this.f17026t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return f.this.f17009c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void e(boolean z9) {
            if (z9) {
                f.this.F(null, 0);
            }
        }
    }

    public class c extends g {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f17035p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f17036q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.D d9, int i9, int i10, float f9, float f10, float f11, float f12, int i11, RecyclerView.D d10) {
            super(d9, i9, i10, f9, f10, f11, f12);
            this.f17035p = i11;
            this.f17036q = d10;
        }

        @Override // androidx.recyclerview.widget.f.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f17057m) {
                return;
            }
            if (this.f17035p <= 0) {
                f fVar = f.this;
                fVar.f17019m.c(fVar.f17024r, this.f17036q);
            } else {
                f.this.f17007a.add(this.f17036q.f16733a);
                this.f17054j = true;
                int i9 = this.f17035p;
                if (i9 > 0) {
                    f.this.B(this, i9);
                }
            }
            f fVar2 = f.this;
            View view = fVar2.f17030x;
            View view2 = this.f17036q.f16733a;
            if (view == view2) {
                fVar2.D(view2);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f17038a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f17039c;

        public d(g gVar, int i9) {
            this.f17038a = gVar;
            this.f17039c = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = f.this.f17024r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f17038a;
            if (gVar.f17057m || gVar.f17050f.m() == -1) {
                return;
            }
            RecyclerView.l itemAnimator = f.this.f17024r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.q(null)) && !f.this.x()) {
                f.this.f17019m.B(this.f17038a.f17050f, this.f17039c);
            } else {
                f.this.f17024r.post(this);
            }
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Interpolator f17041b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Interpolator f17042c = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17043a = -1;

        public static class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f9) {
                return f9 * f9 * f9 * f9 * f9;
            }
        }

        public static class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f9) {
                float f10 = f9 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            }
        }

        public static int e(int i9, int i10) {
            int i11;
            int i12 = i9 & 789516;
            if (i12 == 0) {
                return i9;
            }
            int i13 = i9 & (~i12);
            if (i10 == 0) {
                i11 = i12 << 2;
            } else {
                int i14 = i12 << 1;
                i13 |= (-789517) & i14;
                i11 = (i14 & 789516) << 2;
            }
            return i13 | i11;
        }

        public static int s(int i9, int i10) {
            return i10 << (i9 * 8);
        }

        public static int t(int i9, int i10) {
            return s(2, i9) | s(1, i10) | s(0, i10 | i9);
        }

        public void A(RecyclerView.D d9, int i9) {
            if (d9 != null) {
                B0.b.f167a.b(d9.f16733a);
            }
        }

        public abstract void B(RecyclerView.D d9, int i9);

        public boolean a(RecyclerView recyclerView, RecyclerView.D d9, RecyclerView.D d10) {
            return true;
        }

        public RecyclerView.D b(RecyclerView.D d9, List list, int i9, int i10) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i9 + d9.f16733a.getWidth();
            int height = i10 + d9.f16733a.getHeight();
            int left2 = i9 - d9.f16733a.getLeft();
            int top2 = i10 - d9.f16733a.getTop();
            int size = list.size();
            RecyclerView.D d10 = null;
            int i11 = -1;
            for (int i12 = 0; i12 < size; i12++) {
                RecyclerView.D d11 = (RecyclerView.D) list.get(i12);
                if (left2 > 0 && (right = d11.f16733a.getRight() - width) < 0 && d11.f16733a.getRight() > d9.f16733a.getRight() && (iAbs4 = Math.abs(right)) > i11) {
                    d10 = d11;
                    i11 = iAbs4;
                }
                if (left2 < 0 && (left = d11.f16733a.getLeft() - i9) > 0 && d11.f16733a.getLeft() < d9.f16733a.getLeft() && (iAbs3 = Math.abs(left)) > i11) {
                    d10 = d11;
                    i11 = iAbs3;
                }
                if (top2 < 0 && (top = d11.f16733a.getTop() - i10) > 0 && d11.f16733a.getTop() < d9.f16733a.getTop() && (iAbs2 = Math.abs(top)) > i11) {
                    d10 = d11;
                    i11 = iAbs2;
                }
                if (top2 > 0 && (bottom = d11.f16733a.getBottom() - height) < 0 && d11.f16733a.getBottom() > d9.f16733a.getBottom() && (iAbs = Math.abs(bottom)) > i11) {
                    d10 = d11;
                    i11 = iAbs;
                }
            }
            return d10;
        }

        public void c(RecyclerView recyclerView, RecyclerView.D d9) {
            B0.b.f167a.a(d9.f16733a);
        }

        public int d(int i9, int i10) {
            int i11;
            int i12 = i9 & 3158064;
            if (i12 == 0) {
                return i9;
            }
            int i13 = i9 & (~i12);
            if (i10 == 0) {
                i11 = i12 >> 2;
            } else {
                int i14 = i12 >> 1;
                i13 |= (-3158065) & i14;
                i11 = (i14 & 3158064) >> 2;
            }
            return i13 | i11;
        }

        public final int f(RecyclerView recyclerView, RecyclerView.D d9) {
            return d(k(recyclerView, d9), L.E(recyclerView));
        }

        public long g(RecyclerView recyclerView, int i9, float f9, float f10) {
            RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i9 == 8 ? 200L : 250L : i9 == 8 ? itemAnimator.n() : itemAnimator.o();
        }

        public int h() {
            return 0;
        }

        public final int i(RecyclerView recyclerView) {
            if (this.f17043a == -1) {
                this.f17043a = recyclerView.getResources().getDimensionPixelSize(A0.b.f24d);
            }
            return this.f17043a;
        }

        public float j(RecyclerView.D d9) {
            return 0.5f;
        }

        public abstract int k(RecyclerView recyclerView, RecyclerView.D d9);

        public float l(float f9) {
            return f9;
        }

        public float m(RecyclerView.D d9) {
            return 0.5f;
        }

        public float n(float f9) {
            return f9;
        }

        public boolean o(RecyclerView recyclerView, RecyclerView.D d9) {
            return (f(recyclerView, d9) & 16711680) != 0;
        }

        public int p(RecyclerView recyclerView, int i9, int i10, int i11, long j9) {
            int iSignum = (int) (((int) (((int) Math.signum(i10)) * i(recyclerView) * f17042c.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i9)))) * f17041b.getInterpolation(j9 <= 2000 ? j9 / 2000.0f : 1.0f));
            return iSignum == 0 ? i10 > 0 ? 1 : -1 : iSignum;
        }

        public abstract boolean q();

        public abstract boolean r();

        public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d9, float f9, float f10, int i9, boolean z9) {
            B0.b.f167a.c(canvas, recyclerView, d9.f16733a, f9, f10, i9, z9);
        }

        public void v(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d9, float f9, float f10, int i9, boolean z9) {
            B0.b.f167a.d(canvas, recyclerView, d9.f16733a, f9, f10, i9, z9);
        }

        public void w(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d9, List list, int i9, float f9, float f10) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) list.get(i10);
                gVar.e();
                int iSave = canvas.save();
                u(canvas, recyclerView, gVar.f17050f, gVar.f17055k, gVar.f17056l, gVar.f17051g, false);
                canvas.restoreToCount(iSave);
            }
            if (d9 != null) {
                int iSave2 = canvas.save();
                u(canvas, recyclerView, d9, f9, f10, i9, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void x(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d9, List list, int i9, float f9, float f10) {
            int size = list.size();
            boolean z9 = false;
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) list.get(i10);
                int iSave = canvas.save();
                v(canvas, recyclerView, gVar.f17050f, gVar.f17055k, gVar.f17056l, gVar.f17051g, false);
                canvas.restoreToCount(iSave);
            }
            if (d9 != null) {
                int iSave2 = canvas.save();
                v(canvas, recyclerView, d9, f9, f10, i9, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i11 = size - 1; i11 >= 0; i11--) {
                g gVar2 = (g) list.get(i11);
                boolean z10 = gVar2.f17058n;
                if (z10 && !gVar2.f17054j) {
                    list.remove(i11);
                } else if (!z10) {
                    z9 = true;
                }
            }
            if (z9) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean y(RecyclerView recyclerView, RecyclerView.D d9, RecyclerView.D d10);

        /* JADX WARN: Multi-variable type inference failed */
        public void z(RecyclerView recyclerView, RecyclerView.D d9, int i9, RecyclerView.D d10, int i10, int i11, int i12) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).j(d9.f16733a, d10.f16733a, i11, i12);
                return;
            }
            if (layoutManager.H()) {
                if (layoutManager.o0(d10.f16733a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m1(i10);
                }
                if (layoutManager.r0(d10.f16733a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m1(i10);
                }
            }
            if (layoutManager.I()) {
                if (layoutManager.s0(d10.f16733a) <= recyclerView.getPaddingTop()) {
                    recyclerView.m1(i10);
                }
                if (layoutManager.m0(d10.f16733a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m1(i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    public class C0194f extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17044a = true;

        public C0194f() {
        }

        public void a() {
            this.f17044a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewT;
            RecyclerView.D dI0;
            if (!this.f17044a || (viewT = f.this.t(motionEvent)) == null || (dI0 = f.this.f17024r.i0(viewT)) == null) {
                return;
            }
            f fVar = f.this;
            if (fVar.f17019m.o(fVar.f17024r, dI0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i9 = f.this.f17018l;
                if (pointerId == i9) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i9);
                    float x9 = motionEvent.getX(iFindPointerIndex);
                    float y9 = motionEvent.getY(iFindPointerIndex);
                    f fVar2 = f.this;
                    fVar2.f17010d = x9;
                    fVar2.f17011e = y9;
                    fVar2.f17015i = 0.0f;
                    fVar2.f17014h = 0.0f;
                    if (fVar2.f17019m.r()) {
                        f.this.F(dI0, 2);
                    }
                }
            }
        }
    }

    public static class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f17046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f17047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f17048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f17049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RecyclerView.D f17050f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f17051g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ValueAnimator f17052h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f17053i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f17054j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f17055k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f17056l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f17057m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f17058n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f17059o;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.D d9, int i9, int i10, float f9, float f10, float f11, float f12) {
            this.f17051g = i10;
            this.f17053i = i9;
            this.f17050f = d9;
            this.f17046a = f9;
            this.f17047c = f10;
            this.f17048d = f11;
            this.f17049e = f12;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f17052h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(d9.f16733a);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f17052h.cancel();
        }

        public void b(long j9) {
            this.f17052h.setDuration(j9);
        }

        public void c(float f9) {
            this.f17059o = f9;
        }

        public void d() {
            this.f17050f.J(false);
            this.f17052h.start();
        }

        public void e() {
            float f9 = this.f17046a;
            float f10 = this.f17048d;
            this.f17055k = f9 == f10 ? this.f17050f.f16733a.getTranslationX() : f9 + (this.f17059o * (f10 - f9));
            float f11 = this.f17047c;
            float f12 = this.f17049e;
            this.f17056l = f11 == f12 ? this.f17050f.f16733a.getTranslationY() : f11 + (this.f17059o * (f12 - f11));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f17058n) {
                this.f17050f.J(true);
            }
            this.f17058n = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface h {
        void j(View view, View view2, int i9, int i10);
    }

    public f(e eVar) {
        this.f17019m = eVar;
    }

    private void G() {
        this.f17023q = ViewConfiguration.get(this.f17024r.getContext()).getScaledTouchSlop();
        this.f17024r.h(this);
        this.f17024r.k(this.f17004B);
        this.f17024r.j(this);
        I();
    }

    private void q() {
        this.f17024r.a1(this);
        this.f17024r.c1(this.f17004B);
        this.f17024r.b1(this);
        for (int size = this.f17022p.size() - 1; size >= 0; size--) {
            this.f17019m.c(this.f17024r, ((g) this.f17022p.get(0)).f17050f);
        }
        this.f17022p.clear();
        this.f17030x = null;
        this.f17031y = -1;
        C();
        J();
    }

    public static boolean y(View view, float f9, float f10, float f11, float f12) {
        return f9 >= f11 && f9 <= f11 + ((float) view.getWidth()) && f10 >= f12 && f10 <= f12 + ((float) view.getHeight());
    }

    public void A() {
        VelocityTracker velocityTracker = this.f17026t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f17026t = VelocityTracker.obtain();
    }

    public void B(g gVar, int i9) {
        this.f17024r.post(new d(gVar, i9));
    }

    public final void C() {
        VelocityTracker velocityTracker = this.f17026t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17026t = null;
        }
    }

    public void D(View view) {
        if (view == this.f17030x) {
            this.f17030x = null;
            if (this.f17029w != null) {
                this.f17024r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean E() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(androidx.recyclerview.widget.RecyclerView.D r24, int r25) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.f.F(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    public void H(RecyclerView.D d9) {
        if (!this.f17019m.o(this.f17024r, d9)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (d9.f16733a.getParent() != this.f17024r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        A();
        this.f17015i = 0.0f;
        this.f17014h = 0.0f;
        F(d9, 2);
    }

    public final void I() {
        this.f17003A = new C0194f();
        this.f17032z = new C0973o(this.f17024r.getContext(), this.f17003A);
    }

    public final void J() {
        C0194f c0194f = this.f17003A;
        if (c0194f != null) {
            c0194f.a();
            this.f17003A = null;
        }
        if (this.f17032z != null) {
            this.f17032z = null;
        }
    }

    public final int K(RecyclerView.D d9) {
        if (this.f17020n == 2) {
            return 0;
        }
        int iK = this.f17019m.k(this.f17024r, d9);
        int iD = (this.f17019m.d(iK, L.E(this.f17024r)) & 65280) >> 8;
        if (iD == 0) {
            return 0;
        }
        int i9 = (iK & 65280) >> 8;
        if (Math.abs(this.f17014h) > Math.abs(this.f17015i)) {
            int iN = n(d9, iD);
            if (iN > 0) {
                return (i9 & iN) == 0 ? e.e(iN, L.E(this.f17024r)) : iN;
            }
            int iP = p(d9, iD);
            if (iP > 0) {
                return iP;
            }
        } else {
            int iP2 = p(d9, iD);
            if (iP2 > 0) {
                return iP2;
            }
            int iN2 = n(d9, iD);
            if (iN2 > 0) {
                return (i9 & iN2) == 0 ? e.e(iN2, L.E(this.f17024r)) : iN2;
            }
        }
        return 0;
    }

    public void L(MotionEvent motionEvent, int i9, int i10) {
        float x9 = motionEvent.getX(i10);
        float y9 = motionEvent.getY(i10);
        float f9 = x9 - this.f17010d;
        this.f17014h = f9;
        this.f17015i = y9 - this.f17011e;
        if ((i9 & 4) == 0) {
            this.f17014h = Math.max(0.0f, f9);
        }
        if ((i9 & 8) == 0) {
            this.f17014h = Math.min(0.0f, this.f17014h);
        }
        if ((i9 & 1) == 0) {
            this.f17015i = Math.max(0.0f, this.f17015i);
        }
        if ((i9 & 2) == 0) {
            this.f17015i = Math.min(0.0f, this.f17015i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void b(View view) {
        D(view);
        RecyclerView.D dI0 = this.f17024r.i0(view);
        if (dI0 == null) {
            return;
        }
        RecyclerView.D d9 = this.f17009c;
        if (d9 != null && dI0 == d9) {
            F(null, 0);
            return;
        }
        r(dI0, false);
        if (this.f17007a.remove(dI0.f16733a)) {
            this.f17019m.c(this.f17024r, dI0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a9) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a9) {
        float f9;
        float f10;
        this.f17031y = -1;
        if (this.f17009c != null) {
            w(this.f17008b);
            float[] fArr = this.f17008b;
            float f11 = fArr[0];
            f10 = fArr[1];
            f9 = f11;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        this.f17019m.w(canvas, recyclerView, this.f17009c, this.f17022p, this.f17020n, f9, f10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a9) {
        float f9;
        float f10;
        if (this.f17009c != null) {
            w(this.f17008b);
            float[] fArr = this.f17008b;
            float f11 = fArr[0];
            f10 = fArr[1];
            f9 = f11;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        this.f17019m.x(canvas, recyclerView, this.f17009c, this.f17022p, this.f17020n, f9, f10);
    }

    public final void l() {
    }

    public void m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f17024r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            q();
        }
        this.f17024r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f17012f = resources.getDimension(A0.b.f26f);
            this.f17013g = resources.getDimension(A0.b.f25e);
            G();
        }
    }

    public final int n(RecyclerView.D d9, int i9) {
        if ((i9 & 12) == 0) {
            return 0;
        }
        int i10 = this.f17014h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f17026t;
        if (velocityTracker != null && this.f17018l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f17019m.n(this.f17013g));
            float xVelocity = this.f17026t.getXVelocity(this.f17018l);
            float yVelocity = this.f17026t.getYVelocity(this.f17018l);
            int i11 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i11 & i9) != 0 && i10 == i11 && fAbs >= this.f17019m.l(this.f17012f) && fAbs > Math.abs(yVelocity)) {
                return i11;
            }
        }
        float width = this.f17024r.getWidth() * this.f17019m.m(d9);
        if ((i9 & i10) == 0 || Math.abs(this.f17014h) <= width) {
            return 0;
        }
        return i10;
    }

    public void o(int i9, MotionEvent motionEvent, int i10) {
        RecyclerView.D dV;
        int iF;
        if (this.f17009c != null || i9 != 2 || this.f17020n == 2 || !this.f17019m.q() || this.f17024r.getScrollState() == 1 || (dV = v(motionEvent)) == null || (iF = (this.f17019m.f(this.f17024r, dV) & 65280) >> 8) == 0) {
            return;
        }
        float x9 = motionEvent.getX(i10);
        float y9 = motionEvent.getY(i10);
        float f9 = x9 - this.f17010d;
        float f10 = y9 - this.f17011e;
        float fAbs = Math.abs(f9);
        float fAbs2 = Math.abs(f10);
        int i11 = this.f17023q;
        if (fAbs >= i11 || fAbs2 >= i11) {
            if (fAbs > fAbs2) {
                if (f9 < 0.0f && (iF & 4) == 0) {
                    return;
                }
                if (f9 > 0.0f && (iF & 8) == 0) {
                    return;
                }
            } else {
                if (f10 < 0.0f && (iF & 1) == 0) {
                    return;
                }
                if (f10 > 0.0f && (iF & 2) == 0) {
                    return;
                }
            }
            this.f17015i = 0.0f;
            this.f17014h = 0.0f;
            this.f17018l = motionEvent.getPointerId(0);
            F(dV, 1);
        }
    }

    public final int p(RecyclerView.D d9, int i9) {
        if ((i9 & 3) == 0) {
            return 0;
        }
        int i10 = this.f17015i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f17026t;
        if (velocityTracker != null && this.f17018l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f17019m.n(this.f17013g));
            float xVelocity = this.f17026t.getXVelocity(this.f17018l);
            float yVelocity = this.f17026t.getYVelocity(this.f17018l);
            int i11 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i11 & i9) != 0 && i11 == i10 && fAbs >= this.f17019m.l(this.f17012f) && fAbs > Math.abs(xVelocity)) {
                return i11;
            }
        }
        float height = this.f17024r.getHeight() * this.f17019m.m(d9);
        if ((i9 & i10) == 0 || Math.abs(this.f17015i) <= height) {
            return 0;
        }
        return i10;
    }

    public void r(RecyclerView.D d9, boolean z9) {
        for (int size = this.f17022p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f17022p.get(size);
            if (gVar.f17050f == d9) {
                gVar.f17057m |= z9;
                if (!gVar.f17058n) {
                    gVar.a();
                }
                this.f17022p.remove(size);
                return;
            }
        }
    }

    public g s(MotionEvent motionEvent) {
        if (this.f17022p.isEmpty()) {
            return null;
        }
        View viewT = t(motionEvent);
        for (int size = this.f17022p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f17022p.get(size);
            if (gVar.f17050f.f16733a == viewT) {
                return gVar;
            }
        }
        return null;
    }

    public View t(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        RecyclerView.D d9 = this.f17009c;
        if (d9 != null) {
            View view = d9.f16733a;
            if (y(view, x9, y9, this.f17016j + this.f17014h, this.f17017k + this.f17015i)) {
                return view;
            }
        }
        for (int size = this.f17022p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f17022p.get(size);
            View view2 = gVar.f17050f.f16733a;
            if (y(view2, x9, y9, gVar.f17055k, gVar.f17056l)) {
                return view2;
            }
        }
        return this.f17024r.S(x9, y9);
    }

    public final List u(RecyclerView.D d9) {
        RecyclerView.D d10 = d9;
        List list = this.f17027u;
        if (list == null) {
            this.f17027u = new ArrayList();
            this.f17028v = new ArrayList();
        } else {
            list.clear();
            this.f17028v.clear();
        }
        int iH = this.f17019m.h();
        int iRound = Math.round(this.f17016j + this.f17014h) - iH;
        int iRound2 = Math.round(this.f17017k + this.f17015i) - iH;
        int i9 = iH * 2;
        int width = d10.f16733a.getWidth() + iRound + i9;
        int height = d10.f16733a.getHeight() + iRound2 + i9;
        int i10 = (iRound + width) / 2;
        int i11 = (iRound2 + height) / 2;
        RecyclerView.o layoutManager = this.f17024r.getLayoutManager();
        int iH0 = layoutManager.h0();
        int i12 = 0;
        while (i12 < iH0) {
            View viewG0 = layoutManager.g0(i12);
            if (viewG0 != d10.f16733a && viewG0.getBottom() >= iRound2 && viewG0.getTop() <= height && viewG0.getRight() >= iRound && viewG0.getLeft() <= width) {
                RecyclerView.D dI0 = this.f17024r.i0(viewG0);
                if (this.f17019m.a(this.f17024r, this.f17009c, dI0)) {
                    int iAbs = Math.abs(i10 - ((viewG0.getLeft() + viewG0.getRight()) / 2));
                    int iAbs2 = Math.abs(i11 - ((viewG0.getTop() + viewG0.getBottom()) / 2));
                    int i13 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f17027u.size();
                    int i14 = 0;
                    for (int i15 = 0; i15 < size && i13 > ((Integer) this.f17028v.get(i15)).intValue(); i15++) {
                        i14++;
                    }
                    this.f17027u.add(i14, dI0);
                    this.f17028v.add(i14, Integer.valueOf(i13));
                }
            }
            i12++;
            d10 = d9;
        }
        return this.f17027u;
    }

    public final RecyclerView.D v(MotionEvent motionEvent) {
        View viewT;
        RecyclerView.o layoutManager = this.f17024r.getLayoutManager();
        int i9 = this.f17018l;
        if (i9 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i9);
        float x9 = motionEvent.getX(iFindPointerIndex) - this.f17010d;
        float y9 = motionEvent.getY(iFindPointerIndex) - this.f17011e;
        float fAbs = Math.abs(x9);
        float fAbs2 = Math.abs(y9);
        int i10 = this.f17023q;
        if (fAbs < i10 && fAbs2 < i10) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.H()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.I()) && (viewT = t(motionEvent)) != null) {
            return this.f17024r.i0(viewT);
        }
        return null;
    }

    public final void w(float[] fArr) {
        if ((this.f17021o & 12) != 0) {
            fArr[0] = (this.f17016j + this.f17014h) - this.f17009c.f16733a.getLeft();
        } else {
            fArr[0] = this.f17009c.f16733a.getTranslationX();
        }
        if ((this.f17021o & 3) != 0) {
            fArr[1] = (this.f17017k + this.f17015i) - this.f17009c.f16733a.getTop();
        } else {
            fArr[1] = this.f17009c.f16733a.getTranslationY();
        }
    }

    public boolean x() {
        int size = this.f17022p.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!((g) this.f17022p.get(i9)).f17058n) {
                return true;
            }
        }
        return false;
    }

    public void z(RecyclerView.D d9) {
        if (!this.f17024r.isLayoutRequested() && this.f17020n == 2) {
            float fJ = this.f17019m.j(d9);
            int i9 = (int) (this.f17016j + this.f17014h);
            int i10 = (int) (this.f17017k + this.f17015i);
            if (Math.abs(i10 - d9.f16733a.getTop()) >= d9.f16733a.getHeight() * fJ || Math.abs(i9 - d9.f16733a.getLeft()) >= d9.f16733a.getWidth() * fJ) {
                List listU = u(d9);
                if (listU.size() == 0) {
                    return;
                }
                RecyclerView.D dB = this.f17019m.b(d9, listU, i9, i10);
                if (dB == null) {
                    this.f17027u.clear();
                    this.f17028v.clear();
                    return;
                }
                int iM = dB.m();
                int iM2 = d9.m();
                if (this.f17019m.y(this.f17024r, d9, dB)) {
                    this.f17019m.z(this.f17024r, d9, iM2, dB, iM, i9, i10);
                }
            }
        }
    }
}
