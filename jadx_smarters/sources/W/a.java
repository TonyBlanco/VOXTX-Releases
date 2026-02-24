package W;

import P.C0959a;
import P.L;
import Q.C;
import Q.D;
import Q.E;
import W.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import s.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends C0959a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Rect f10155n = new Rect(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b.a f10156o = new C0130a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b.InterfaceC0131b f10157p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f10162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f10163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f10164j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f10158d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f10159e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f10160f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10161g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10165k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10166l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10167m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: W.a$a, reason: collision with other inner class name */
    public class C0130a implements b.a {
        @Override // W.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C c9, Rect rect) {
            c9.l(rect);
        }
    }

    public class b implements b.InterfaceC0131b {
        @Override // W.b.InterfaceC0131b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C a(j jVar, int i9) {
            return (C) jVar.n(i9);
        }

        @Override // W.b.InterfaceC0131b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j jVar) {
            return jVar.m();
        }
    }

    public class c extends D {
        public c() {
        }

        @Override // Q.D
        public C b(int i9) {
            return C.L(a.this.H(i9));
        }

        @Override // Q.D
        public C d(int i9) {
            int i10 = i9 == 2 ? a.this.f10165k : a.this.f10166l;
            if (i10 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i10);
        }

        @Override // Q.D
        public boolean f(int i9, int i10, Bundle bundle) {
            return a.this.P(i9, i10, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f10163i = view;
        this.f10162h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (L.C(view) == 0) {
            L.C0(view, 1);
        }
    }

    public static Rect D(View view, int i9, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i9 == 17) {
            rect.set(width, 0, width, height);
        } else if (i9 == 33) {
            rect.set(0, height, width, height);
        } else if (i9 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    public static int F(int i9) {
        if (i9 == 19) {
            return 33;
        }
        if (i9 != 21) {
            return i9 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f10166l;
    }

    public abstract int B(float f9, float f10);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f10163i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f10163i;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    public final boolean G(int i9, Rect rect) {
        Object objD;
        j jVarY = y();
        int i10 = this.f10166l;
        C c9 = i10 == Integer.MIN_VALUE ? null : (C) jVarY.g(i10);
        if (i9 == 1 || i9 == 2) {
            objD = W.b.d(jVarY, f10157p, f10156o, c9, i9, L.E(this.f10163i) == 1, false);
        } else {
            if (i9 != 17 && i9 != 33 && i9 != 66 && i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i11 = this.f10166l;
            if (i11 != Integer.MIN_VALUE) {
                z(i11, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f10163i, i9, rect2);
            }
            objD = W.b.c(jVarY, f10157p, f10156o, c9, rect2, i9);
        }
        C c10 = (C) objD;
        return T(c10 != null ? jVarY.j(jVarY.i(c10)) : Integer.MIN_VALUE);
    }

    public C H(int i9) {
        return i9 == -1 ? u() : t(i9);
    }

    public final void I(boolean z9, int i9, Rect rect) {
        int i10 = this.f10166l;
        if (i10 != Integer.MIN_VALUE) {
            o(i10);
        }
        if (z9) {
            G(i9, rect);
        }
    }

    public abstract boolean J(int i9, int i10, Bundle bundle);

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i9, AccessibilityEvent accessibilityEvent) {
    }

    public abstract void M(C c9);

    public abstract void N(int i9, C c9);

    public abstract void O(int i9, boolean z9);

    public boolean P(int i9, int i10, Bundle bundle) {
        return i9 != -1 ? Q(i9, i10, bundle) : R(i10, bundle);
    }

    public final boolean Q(int i9, int i10, Bundle bundle) {
        return i10 != 1 ? i10 != 2 ? i10 != 64 ? i10 != 128 ? J(i9, i10, bundle) : n(i9) : S(i9) : o(i9) : T(i9);
    }

    public final boolean R(int i9, Bundle bundle) {
        return L.h0(this.f10163i, i9, bundle);
    }

    public final boolean S(int i9) {
        int i10;
        if (!this.f10162h.isEnabled() || !this.f10162h.isTouchExplorationEnabled() || (i10 = this.f10165k) == i9) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            n(i10);
        }
        this.f10165k = i9;
        this.f10163i.invalidate();
        U(i9, 32768);
        return true;
    }

    public final boolean T(int i9) {
        int i10;
        if ((!this.f10163i.isFocused() && !this.f10163i.requestFocus()) || (i10 = this.f10166l) == i9) {
            return false;
        }
        if (i10 != Integer.MIN_VALUE) {
            o(i10);
        }
        if (i9 == Integer.MIN_VALUE) {
            return false;
        }
        this.f10166l = i9;
        O(i9, true);
        U(i9, 8);
        return true;
    }

    public final boolean U(int i9, int i10) {
        ViewParent parent;
        if (i9 == Integer.MIN_VALUE || !this.f10162h.isEnabled() || (parent = this.f10163i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f10163i, q(i9, i10));
    }

    public final void V(int i9) {
        int i10 = this.f10167m;
        if (i10 == i9) {
            return;
        }
        this.f10167m = i9;
        U(i9, 128);
        U(i10, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
    }

    @Override // P.C0959a
    public D b(View view) {
        if (this.f10164j == null) {
            this.f10164j = new c();
        }
        return this.f10164j;
    }

    @Override // P.C0959a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // P.C0959a
    public void g(View view, C c9) {
        super.g(view, c9);
        M(c9);
    }

    public final boolean n(int i9) {
        if (this.f10165k != i9) {
            return false;
        }
        this.f10165k = Integer.MIN_VALUE;
        this.f10163i.invalidate();
        U(i9, 65536);
        return true;
    }

    public final boolean o(int i9) {
        if (this.f10166l != i9) {
            return false;
        }
        this.f10166l = Integer.MIN_VALUE;
        O(i9, false);
        U(i9, 8);
        return true;
    }

    public final boolean p() {
        int i9 = this.f10166l;
        return i9 != Integer.MIN_VALUE && J(i9, 16, null);
    }

    public final AccessibilityEvent q(int i9, int i10) {
        return i9 != -1 ? r(i9, i10) : s(i10);
    }

    public final AccessibilityEvent r(int i9, int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        C cH = H(i9);
        accessibilityEventObtain.getText().add(cH.v());
        accessibilityEventObtain.setContentDescription(cH.q());
        accessibilityEventObtain.setScrollable(cH.H());
        accessibilityEventObtain.setPassword(cH.G());
        accessibilityEventObtain.setEnabled(cH.C());
        accessibilityEventObtain.setChecked(cH.A());
        L(i9, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(cH.o());
        E.c(accessibilityEventObtain, this.f10163i, i9);
        accessibilityEventObtain.setPackageName(this.f10163i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent s(int i9) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i9);
        this.f10163i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    public final C t(int i9) {
        C cK = C.K();
        cK.c0(true);
        cK.e0(true);
        cK.X("android.view.View");
        Rect rect = f10155n;
        cK.T(rect);
        cK.U(rect);
        cK.m0(this.f10163i);
        N(i9, cK);
        if (cK.v() == null && cK.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        cK.l(this.f10159e);
        if (this.f10159e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iJ = cK.j();
        if ((iJ & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iJ & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        cK.k0(this.f10163i.getContext().getPackageName());
        cK.s0(this.f10163i, i9);
        if (this.f10165k == i9) {
            cK.R(true);
            cK.a(128);
        } else {
            cK.R(false);
            cK.a(64);
        }
        boolean z9 = this.f10166l == i9;
        if (z9) {
            cK.a(2);
        } else if (cK.D()) {
            cK.a(1);
        }
        cK.f0(z9);
        this.f10163i.getLocationOnScreen(this.f10161g);
        cK.m(this.f10158d);
        if (this.f10158d.equals(rect)) {
            cK.l(this.f10158d);
            if (cK.f7381b != -1) {
                C cK2 = C.K();
                for (int i10 = cK.f7381b; i10 != -1; i10 = cK2.f7381b) {
                    cK2.n0(this.f10163i, -1);
                    cK2.T(f10155n);
                    N(i10, cK2);
                    cK2.l(this.f10159e);
                    Rect rect2 = this.f10158d;
                    Rect rect3 = this.f10159e;
                    rect2.offset(rect3.left, rect3.top);
                }
                cK2.O();
            }
            this.f10158d.offset(this.f10161g[0] - this.f10163i.getScrollX(), this.f10161g[1] - this.f10163i.getScrollY());
        }
        if (this.f10163i.getLocalVisibleRect(this.f10160f)) {
            this.f10160f.offset(this.f10161g[0] - this.f10163i.getScrollX(), this.f10161g[1] - this.f10163i.getScrollY());
            if (this.f10158d.intersect(this.f10160f)) {
                cK.U(this.f10158d);
                if (E(this.f10158d)) {
                    cK.w0(true);
                }
            }
        }
        return cK;
    }

    public final C u() {
        C cM = C.M(this.f10163i);
        L.f0(this.f10163i, cM);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (cM.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            cM.c(this.f10163i, ((Integer) arrayList.get(i9)).intValue());
        }
        return cM;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f10162h.isEnabled() || !this.f10162h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f10167m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i9 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z9 = false;
                    while (i9 < repeatCount && G(iF, null)) {
                        i9++;
                        z9 = true;
                    }
                    return z9;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f10165k;
    }

    public final j y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        j jVar = new j();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            jVar.k(((Integer) arrayList.get(i9)).intValue(), t(((Integer) arrayList.get(i9)).intValue()));
        }
        return jVar;
    }

    public final void z(int i9, Rect rect) {
        H(i9).l(rect);
    }
}
