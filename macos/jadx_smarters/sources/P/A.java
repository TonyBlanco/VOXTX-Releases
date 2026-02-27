package P;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f6731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f6732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f6733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f6735e;

    public A(View view) {
        this.f6733c = view;
    }

    public boolean a(float f9, float f10, boolean z9) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return P.a(viewParentH, this.f6733c, f9, f10, z9);
    }

    public boolean b(float f9, float f10) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return P.b(viewParentH, this.f6733c, f9, f10);
    }

    public boolean c(int i9, int i10, int[] iArr, int[] iArr2) {
        return d(i9, i10, iArr, iArr2, 0);
    }

    public boolean d(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent viewParentH;
        int i12;
        int i13;
        if (!l() || (viewParentH = h(i11)) == null) {
            return false;
        }
        if (i9 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f6733c.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        P.c(viewParentH, this.f6733c, i9, i10, iArr, i11);
        if (iArr2 != null) {
            this.f6733c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        g(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    public boolean f(int i9, int i10, int i11, int i12, int[] iArr) {
        return g(i9, i10, i11, i12, iArr, 0, null);
    }

    public final boolean g(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent viewParentH;
        int i14;
        int i15;
        int[] iArr3;
        if (!l() || (viewParentH = h(i13)) == null) {
            return false;
        }
        if (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f6733c.getLocationInWindow(iArr);
            i14 = iArr[0];
            i15 = iArr[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        P.d(viewParentH, this.f6733c, i9, i10, i11, i12, i13, iArr3);
        if (iArr != null) {
            this.f6733c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i14;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    public final ViewParent h(int i9) {
        if (i9 == 0) {
            return this.f6731a;
        }
        if (i9 != 1) {
            return null;
        }
        return this.f6732b;
    }

    public final int[] i() {
        if (this.f6735e == null) {
            this.f6735e = new int[2];
        }
        return this.f6735e;
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i9) {
        return h(i9) != null;
    }

    public boolean l() {
        return this.f6734d;
    }

    public void m(boolean z9) {
        if (this.f6734d) {
            L.Q0(this.f6733c);
        }
        this.f6734d = z9;
    }

    public final void n(int i9, ViewParent viewParent) {
        if (i9 == 0) {
            this.f6731a = viewParent;
        } else {
            if (i9 != 1) {
                return;
            }
            this.f6732b = viewParent;
        }
    }

    public boolean o(int i9) {
        return p(i9, 0);
    }

    public boolean p(int i9, int i10) {
        if (k(i10)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f6733c;
        for (ViewParent parent = this.f6733c.getParent(); parent != null; parent = parent.getParent()) {
            if (P.f(parent, view, this.f6733c, i9, i10)) {
                n(i10, parent);
                P.e(parent, view, this.f6733c, i9, i10);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i9) {
        ViewParent viewParentH = h(i9);
        if (viewParentH != null) {
            P.g(viewParentH, this.f6733c, i9);
            n(i9, null);
        }
    }
}
