package k;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static j0 f43355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static j0 f43356m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43357a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f43358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f43360e = new Runnable() { // from class: k.h0
        @Override // java.lang.Runnable
        public final void run() {
            this.f43337a.e();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f43361f = new Runnable() { // from class: k.i0
        @Override // java.lang.Runnable
        public final void run() {
            this.f43347a.d();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k0 f43364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f43366k;

    public j0(View view, CharSequence charSequence) {
        this.f43357a = view;
        this.f43358c = charSequence;
        this.f43359d = P.N.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void g(j0 j0Var) {
        j0 j0Var2 = f43355l;
        if (j0Var2 != null) {
            j0Var2.b();
        }
        f43355l = j0Var;
        if (j0Var != null) {
            j0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        j0 j0Var = f43355l;
        if (j0Var != null && j0Var.f43357a == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new j0(view, charSequence);
            return;
        }
        j0 j0Var2 = f43356m;
        if (j0Var2 != null && j0Var2.f43357a == view) {
            j0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f43357a.removeCallbacks(this.f43360e);
    }

    public final void c() {
        this.f43366k = true;
    }

    public void d() {
        if (f43356m == this) {
            f43356m = null;
            k0 k0Var = this.f43364i;
            if (k0Var != null) {
                k0Var.c();
                this.f43364i = null;
                c();
                this.f43357a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f43355l == this) {
            g(null);
        }
        this.f43357a.removeCallbacks(this.f43361f);
    }

    public final /* synthetic */ void e() {
        i(false);
    }

    public final void f() {
        this.f43357a.postDelayed(this.f43360e, ViewConfiguration.getLongPressTimeout());
    }

    public void i(boolean z9) {
        long longPressTimeout;
        long j9;
        long j10;
        if (P.L.V(this.f43357a)) {
            g(null);
            j0 j0Var = f43356m;
            if (j0Var != null) {
                j0Var.d();
            }
            f43356m = this;
            this.f43365j = z9;
            k0 k0Var = new k0(this.f43357a.getContext());
            this.f43364i = k0Var;
            k0Var.e(this.f43357a, this.f43362g, this.f43363h, this.f43365j, this.f43358c);
            this.f43357a.addOnAttachStateChangeListener(this);
            if (this.f43365j) {
                j10 = 2500;
            } else {
                if ((P.L.O(this.f43357a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j9 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j9 = 15000;
                }
                j10 = j9 - longPressTimeout;
            }
            this.f43357a.removeCallbacks(this.f43361f);
            this.f43357a.postDelayed(this.f43361f, j10);
        }
    }

    public final boolean j(MotionEvent motionEvent) {
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        if (!this.f43366k && Math.abs(x9 - this.f43362g) <= this.f43359d && Math.abs(y9 - this.f43363h) <= this.f43359d) {
            return false;
        }
        this.f43362g = x9;
        this.f43363h = y9;
        this.f43366k = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f43364i != null && this.f43365j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f43357a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f43357a.isEnabled() && this.f43364i == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f43362g = view.getWidth() / 2;
        this.f43363h = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
