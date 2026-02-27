package W;

import P.L;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Interpolator f10173x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10175b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f10177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f10178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f10179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f10180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f10181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f10182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f10183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f10185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f10187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OverScroller f10191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f10192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f10193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f10195v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10176c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f10196w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f9) {
            float f10 = f9 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.E(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i9, int i10);

        public abstract int b(View view, int i9, int i10);

        public int c(int i9) {
            return i9;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i9, int i10) {
        }

        public boolean g(int i9) {
            return false;
        }

        public void h(int i9, int i10) {
        }

        public void i(View view, int i9) {
        }

        public void j(int i9) {
        }

        public void k(View view, int i9, int i10, int i11, int i12) {
        }

        public abstract void l(View view, float f9, float f10);

        public abstract boolean m(View view, int i9);
    }

    public d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f10195v = viewGroup;
        this.f10192s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i9 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f10189p = i9;
        this.f10188o = i9;
        this.f10175b = viewConfiguration.getScaledTouchSlop();
        this.f10186m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10187n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10191r = new OverScroller(context, f10173x);
    }

    public static d l(ViewGroup viewGroup, float f9, c cVar) {
        d dVarM = m(viewGroup, cVar);
        dVarM.f10175b = (int) (dVarM.f10175b * (1.0f / f9));
        return dVarM;
    }

    public static d m(ViewGroup viewGroup, c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    public final void A() {
        this.f10185l.computeCurrentVelocity(1000, this.f10186m);
        n(e(this.f10185l.getXVelocity(this.f10176c), this.f10187n, this.f10186m), e(this.f10185l.getYVelocity(this.f10176c), this.f10187n, this.f10186m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [W.d$c] */
    public final void B(float f9, float f10, int i9) {
        boolean zC = c(f9, f10, i9, 1);
        ?? r02 = zC;
        if (c(f10, f9, i9, 4)) {
            r02 = (zC ? 1 : 0) | 4;
        }
        ?? r03 = r02;
        if (c(f9, f10, i9, 2)) {
            r03 = (r02 == true ? 1 : 0) | 2;
        }
        ?? r04 = r03;
        if (c(f10, f9, i9, 8)) {
            r04 = (r03 == true ? 1 : 0) | 8;
        }
        if (r04 != 0) {
            int[] iArr = this.f10182i;
            iArr[i9] = iArr[i9] | r04;
            this.f10192s.f(r04, i9);
        }
    }

    public final void C(float f9, float f10, int i9) {
        q(i9);
        float[] fArr = this.f10177d;
        this.f10179f[i9] = f9;
        fArr[i9] = f9;
        float[] fArr2 = this.f10178e;
        this.f10180g[i9] = f10;
        fArr2[i9] = f10;
        this.f10181h[i9] = t((int) f9, (int) f10);
        this.f10184k |= 1 << i9;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            int pointerId = motionEvent.getPointerId(i9);
            if (x(pointerId)) {
                float x9 = motionEvent.getX(i9);
                float y9 = motionEvent.getY(i9);
                this.f10179f[pointerId] = x9;
                this.f10180g[pointerId] = y9;
            }
        }
    }

    public void E(int i9) {
        this.f10195v.removeCallbacks(this.f10196w);
        if (this.f10174a != i9) {
            this.f10174a = i9;
            this.f10192s.j(i9);
            if (this.f10174a == 0) {
                this.f10193t = null;
            }
        }
    }

    public boolean F(int i9, int i10) {
        if (this.f10194u) {
            return s(i9, i10, (int) this.f10185l.getXVelocity(this.f10176c), (int) this.f10185l.getYVelocity(this.f10176c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.d.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i9, int i10) {
        this.f10193t = view;
        this.f10176c = -1;
        boolean zS = s(i9, i10, 0, 0);
        if (!zS && this.f10174a == 0 && this.f10193t != null) {
            this.f10193t = null;
        }
        return zS;
    }

    public boolean I(View view, int i9) {
        if (view == this.f10193t && this.f10176c == i9) {
            return true;
        }
        if (view == null || !this.f10192s.m(view, i9)) {
            return false;
        }
        this.f10176c = i9;
        b(view, i9);
        return true;
    }

    public void a() {
        this.f10176c = -1;
        g();
        VelocityTracker velocityTracker = this.f10185l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10185l = null;
        }
    }

    public void b(View view, int i9) {
        if (view.getParent() == this.f10195v) {
            this.f10193t = view;
            this.f10176c = i9;
            this.f10192s.i(view, i9);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f10195v + ")");
    }

    public final boolean c(float f9, float f10, int i9, int i10) {
        float fAbs = Math.abs(f9);
        float fAbs2 = Math.abs(f10);
        if ((this.f10181h[i9] & i10) != i10 || (this.f10190q & i10) == 0 || (this.f10183j[i9] & i10) == i10 || (this.f10182i[i9] & i10) == i10) {
            return false;
        }
        int i11 = this.f10175b;
        if (fAbs <= i11 && fAbs2 <= i11) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f10192s.g(i10)) {
            return (this.f10182i[i9] & i10) == 0 && fAbs > ((float) this.f10175b);
        }
        int[] iArr = this.f10183j;
        iArr[i9] = iArr[i9] | i10;
        return false;
    }

    public final boolean d(View view, float f9, float f10) {
        if (view == null) {
            return false;
        }
        boolean z9 = this.f10192s.d(view) > 0;
        boolean z10 = this.f10192s.e(view) > 0;
        if (!z9 || !z10) {
            return z9 ? Math.abs(f9) > ((float) this.f10175b) : z10 && Math.abs(f10) > ((float) this.f10175b);
        }
        float f11 = (f9 * f9) + (f10 * f10);
        int i9 = this.f10175b;
        return f11 > ((float) (i9 * i9));
    }

    public final float e(float f9, float f10, float f11) {
        float fAbs = Math.abs(f9);
        if (fAbs < f10) {
            return 0.0f;
        }
        return fAbs > f11 ? f9 > 0.0f ? f11 : -f11 : f9;
    }

    public final int f(int i9, int i10, int i11) {
        int iAbs = Math.abs(i9);
        if (iAbs < i10) {
            return 0;
        }
        return iAbs > i11 ? i9 > 0 ? i11 : -i11 : i9;
    }

    public final void g() {
        float[] fArr = this.f10177d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f10178e, 0.0f);
        Arrays.fill(this.f10179f, 0.0f);
        Arrays.fill(this.f10180g, 0.0f);
        Arrays.fill(this.f10181h, 0);
        Arrays.fill(this.f10182i, 0);
        Arrays.fill(this.f10183j, 0);
        this.f10184k = 0;
    }

    public final void h(int i9) {
        if (this.f10177d == null || !w(i9)) {
            return;
        }
        this.f10177d[i9] = 0.0f;
        this.f10178e[i9] = 0.0f;
        this.f10179f[i9] = 0.0f;
        this.f10180g[i9] = 0.0f;
        this.f10181h[i9] = 0;
        this.f10182i[i9] = 0;
        this.f10183j[i9] = 0;
        this.f10184k = (~(1 << i9)) & this.f10184k;
    }

    public final int i(int i9, int i10, int i11) {
        if (i9 == 0) {
            return 0;
        }
        int width = this.f10195v.getWidth();
        float f9 = width / 2;
        float fO = f9 + (o(Math.min(1.0f, Math.abs(i9) / width)) * f9);
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i9) / i11) + 1.0f) * 256.0f), 600);
    }

    public final int j(View view, int i9, int i10, int i11, int i12) {
        float f9;
        float f10;
        float f11;
        float f12;
        int iF = f(i11, (int) this.f10187n, (int) this.f10186m);
        int iF2 = f(i12, (int) this.f10187n, (int) this.f10186m);
        int iAbs = Math.abs(i9);
        int iAbs2 = Math.abs(i10);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i13 = iAbs3 + iAbs4;
        int i14 = iAbs + iAbs2;
        if (iF != 0) {
            f9 = iAbs3;
            f10 = i13;
        } else {
            f9 = iAbs;
            f10 = i14;
        }
        float f13 = f9 / f10;
        if (iF2 != 0) {
            f11 = iAbs4;
            f12 = i13;
        } else {
            f11 = iAbs2;
            f12 = i14;
        }
        return (int) ((i(i9, iF, this.f10192s.d(view)) * f13) + (i(i10, iF2, this.f10192s.e(view)) * (f11 / f12)));
    }

    public boolean k(boolean z9) {
        if (this.f10174a == 2) {
            boolean zComputeScrollOffset = this.f10191r.computeScrollOffset();
            int currX = this.f10191r.getCurrX();
            int currY = this.f10191r.getCurrY();
            int left = currX - this.f10193t.getLeft();
            int top = currY - this.f10193t.getTop();
            if (left != 0) {
                L.c0(this.f10193t, left);
            }
            if (top != 0) {
                L.d0(this.f10193t, top);
            }
            if (left != 0 || top != 0) {
                this.f10192s.k(this.f10193t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f10191r.getFinalX() && currY == this.f10191r.getFinalY()) {
                this.f10191r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z9) {
                    this.f10195v.post(this.f10196w);
                } else {
                    E(0);
                }
            }
        }
        return this.f10174a == 2;
    }

    public final void n(float f9, float f10) {
        this.f10194u = true;
        this.f10192s.l(this.f10193t, f9, f10);
        this.f10194u = false;
        if (this.f10174a == 1) {
            E(0);
        }
    }

    public final float o(float f9) {
        return (float) Math.sin((f9 - 0.5f) * 0.47123894f);
    }

    public final void p(int i9, int i10, int i11, int i12) {
        int left = this.f10193t.getLeft();
        int top = this.f10193t.getTop();
        if (i11 != 0) {
            i9 = this.f10192s.a(this.f10193t, i9, i11);
            L.c0(this.f10193t, i9 - left);
        }
        int i13 = i9;
        if (i12 != 0) {
            i10 = this.f10192s.b(this.f10193t, i10, i12);
            L.d0(this.f10193t, i10 - top);
        }
        int i14 = i10;
        if (i11 == 0 && i12 == 0) {
            return;
        }
        this.f10192s.k(this.f10193t, i13, i14, i13 - left, i14 - top);
    }

    public final void q(int i9) {
        float[] fArr = this.f10177d;
        if (fArr == null || fArr.length <= i9) {
            int i10 = i9 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10178e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10179f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f10180g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10181h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10182i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f10183j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10177d = fArr2;
            this.f10178e = fArr3;
            this.f10179f = fArr4;
            this.f10180g = fArr5;
            this.f10181h = iArr;
            this.f10182i = iArr2;
            this.f10183j = iArr3;
        }
    }

    public View r(int i9, int i10) {
        for (int childCount = this.f10195v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f10195v.getChildAt(this.f10192s.c(childCount));
            if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i9, int i10, int i11, int i12) {
        int left = this.f10193t.getLeft();
        int top = this.f10193t.getTop();
        int i13 = i9 - left;
        int i14 = i10 - top;
        if (i13 == 0 && i14 == 0) {
            this.f10191r.abortAnimation();
            E(0);
            return false;
        }
        this.f10191r.startScroll(left, top, i13, i14, j(this.f10193t, i13, i14, i11, i12));
        E(2);
        return true;
    }

    public final int t(int i9, int i10) {
        int i11 = i9 < this.f10195v.getLeft() + this.f10188o ? 1 : 0;
        if (i10 < this.f10195v.getTop() + this.f10188o) {
            i11 |= 4;
        }
        if (i9 > this.f10195v.getRight() - this.f10188o) {
            i11 |= 2;
        }
        return i10 > this.f10195v.getBottom() - this.f10188o ? i11 | 8 : i11;
    }

    public int u() {
        return this.f10175b;
    }

    public boolean v(int i9, int i10) {
        return y(this.f10193t, i9, i10);
    }

    public boolean w(int i9) {
        return ((1 << i9) & this.f10184k) != 0;
    }

    public final boolean x(int i9) {
        if (w(i9)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i9 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i9, int i10) {
        return view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f10185l == null) {
            this.f10185l = VelocityTracker.obtain();
        }
        this.f10185l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x9, (int) y9);
            C(x9, y9, pointerId);
            I(viewR, pointerId);
            int i11 = this.f10181h[pointerId];
            int i12 = this.f10190q;
            if ((i11 & i12) != 0) {
                this.f10192s.h(i11 & i12, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f10174a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i10 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i10);
                        if (x(pointerId2)) {
                            float x10 = motionEvent.getX(i10);
                            float y10 = motionEvent.getY(i10);
                            float f9 = x10 - this.f10177d[pointerId2];
                            float f10 = y10 - this.f10178e[pointerId2];
                            B(f9, f10, pointerId2);
                            if (this.f10174a != 1) {
                                View viewR2 = r((int) x10, (int) y10);
                                if (d(viewR2, f9, f10) && I(viewR2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                } else {
                    if (!x(this.f10176c)) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f10176c);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f10179f;
                    int i13 = this.f10176c;
                    int i14 = (int) (x11 - fArr[i13]);
                    int i15 = (int) (y11 - this.f10180g[i13]);
                    p(this.f10193t.getLeft() + i14, this.f10193t.getTop() + i15, i14, i15);
                }
                D(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x12 = motionEvent.getX(actionIndex);
                    float y12 = motionEvent.getY(actionIndex);
                    C(x12, y12, pointerId3);
                    if (this.f10174a != 0) {
                        if (v((int) x12, (int) y12)) {
                            I(this.f10193t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        I(r((int) x12, (int) y12), pointerId3);
                        int i16 = this.f10181h[pointerId3];
                        int i17 = this.f10190q;
                        if ((i16 & i17) != 0) {
                            this.f10192s.h(i16 & i17, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f10174a == 1 && pointerId4 == this.f10176c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i10 >= pointerCount2) {
                            i9 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i10);
                        if (pointerId5 != this.f10176c) {
                            View viewR3 = r((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                            View view = this.f10193t;
                            if (viewR3 == view && I(view, pointerId5)) {
                                i9 = this.f10176c;
                                break;
                            }
                        }
                        i10++;
                    }
                    if (i9 == -1) {
                        A();
                    }
                }
                h(pointerId4);
                return;
            }
            if (this.f10174a == 1) {
                n(0.0f, 0.0f);
            }
        } else if (this.f10174a == 1) {
            A();
        }
        a();
    }
}
