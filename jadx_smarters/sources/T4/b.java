package T4;

import P.L;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f9520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f9521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public VelocityTracker f9526j;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f9527a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f9528c;

        public a(CoordinatorLayout coordinatorLayout, View view) {
            this.f9527a = coordinatorLayout;
            this.f9528c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f9528c == null || (overScroller = b.this.f9521e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b.this.N(this.f9527a, this.f9528c);
                return;
            }
            b bVar = b.this;
            bVar.P(this.f9527a, this.f9528c, bVar.f9521e.getCurrY());
            L.k0(this.f9528c, this);
        }
    }

    public b() {
        this.f9523g = -1;
        this.f9525i = -1;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9523g = -1;
        this.f9525i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.f9523g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f9524h = r12
            goto L4c
        L2d:
            int r0 = r11.f9523g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f9524h
            int r7 = r1 - r0
            r11.f9524h = r0
            int r8 = r11.K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.O(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.f9526j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f9526j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f9526j
            int r4 = r11.f9523g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f9522f = r3
            r11.f9523g = r1
            android.view.VelocityTracker r13 = r11.f9526j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.f9526j = r13
        L81:
            android.view.VelocityTracker r13 = r11.f9526j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f9522f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.b.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean H(View view);

    public final void I() {
        if (this.f9526j == null) {
            this.f9526j = VelocityTracker.obtain();
        }
    }

    public final boolean J(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, float f9) {
        Runnable runnable = this.f9520d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f9520d = null;
        }
        if (this.f9521e == null) {
            this.f9521e = new OverScroller(view.getContext());
        }
        this.f9521e.fling(0, E(), 0, Math.round(f9), 0, 0, i9, i10);
        if (!this.f9521e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f9520d = aVar;
        L.k0(view, aVar);
        return true;
    }

    public abstract int K(View view);

    public abstract int L(View view);

    public abstract int M();

    public abstract void N(CoordinatorLayout coordinatorLayout, View view);

    public final int O(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        return Q(coordinatorLayout, view, M() - i9, i10, i11);
    }

    public int P(CoordinatorLayout coordinatorLayout, View view, int i9) {
        return Q(coordinatorLayout, view, i9, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
    }

    public abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f9525i < 0) {
            this.f9525i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f9522f) {
            int i9 = this.f9523g;
            if (i9 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i9)) == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y9 - this.f9524h) > this.f9525i) {
                this.f9524h = y9;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f9523g = -1;
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            boolean z9 = H(view) && coordinatorLayout.C(view, x9, y10);
            this.f9522f = z9;
            if (z9) {
                this.f9524h = y10;
                this.f9523g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f9521e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f9521e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f9526j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}
