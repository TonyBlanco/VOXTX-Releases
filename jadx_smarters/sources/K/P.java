package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class P implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43167a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f43170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f43171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f43172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f43175j = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = P.this.f43170e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P.this.e();
        }
    }

    public P(View view) {
        this.f43170e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f43167a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f43168c = tapTimeout;
        this.f43169d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f9, float f10, float f11) {
        float f12 = -f11;
        return f9 >= f12 && f10 >= f12 && f9 < ((float) (view.getRight() - view.getLeft())) + f11 && f10 < ((float) (view.getBottom() - view.getTop())) + f11;
    }

    public final void a() {
        Runnable runnable = this.f43172g;
        if (runnable != null) {
            this.f43170e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f43171f;
        if (runnable2 != null) {
            this.f43170e.removeCallbacks(runnable2);
        }
    }

    public abstract j.f b();

    public abstract boolean c();

    public boolean d() {
        j.f fVarB = b();
        if (fVarB == null || !fVarB.a()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f43170e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f43173h = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        N n9;
        View view = this.f43170e;
        j.f fVarB = b();
        if (fVarB == null || !fVarB.a() || (n9 = (N) fVarB.o()) == null || !n9.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(n9, motionEventObtainNoHistory);
        boolean zE = n9.e(motionEventObtainNoHistory, this.f43174i);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f43170e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f43174i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f43167a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f43174i = r6
            java.lang.Runnable r6 = r5.f43171f
            if (r6 != 0) goto L52
            k.P$a r6 = new k.P$a
            r6.<init>()
            r5.f43171f = r6
        L52:
            java.lang.Runnable r6 = r5.f43171f
            int r1 = r5.f43168c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f43172g
            if (r6 != 0) goto L65
            k.P$b r6 = new k.P$b
            r6.<init>()
            r5.f43172g = r6
        L65:
            java.lang.Runnable r6 = r5.f43172g
            int r1 = r5.f43169d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.P.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f43175j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f43175j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = this.f43173h;
        if (z10) {
            z9 = f(motionEvent) || !d();
        } else {
            z9 = g(motionEvent) && c();
            if (z9) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f43170e.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f43173h = z9;
        return z9 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f43173h = false;
        this.f43174i = -1;
        Runnable runnable = this.f43171f;
        if (runnable != null) {
            this.f43170e.removeCallbacks(runnable);
        }
    }
}
