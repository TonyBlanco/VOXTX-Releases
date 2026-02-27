package androidx.appcompat.view.menu;

import P.AbstractC0974p;
import P.L;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import c.AbstractC1241d;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f13843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f13846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j.d f13847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f13849l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public h(Context context, e eVar, View view, boolean z9, int i9) {
        this(context, eVar, view, z9, i9, 0);
    }

    public h(Context context, e eVar, View view, boolean z9, int i9, int i10) {
        this.f13844g = 8388611;
        this.f13849l = new a();
        this.f13838a = context;
        this.f13839b = eVar;
        this.f13843f = view;
        this.f13840c = z9;
        this.f13841d = i9;
        this.f13842e = i10;
    }

    public final j.d a() {
        Display defaultDisplay = ((WindowManager) this.f13838a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        j.d bVar = Math.min(point.x, point.y) >= this.f13838a.getResources().getDimensionPixelSize(AbstractC1241d.f17777a) ? new androidx.appcompat.view.menu.b(this.f13838a, this.f13843f, this.f13841d, this.f13842e, this.f13840c) : new k(this.f13838a, this.f13839b, this.f13843f, this.f13841d, this.f13842e, this.f13840c);
        bVar.j(this.f13839b);
        bVar.t(this.f13849l);
        bVar.n(this.f13843f);
        bVar.d(this.f13846i);
        bVar.q(this.f13845h);
        bVar.r(this.f13844g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f13847j.dismiss();
        }
    }

    public j.d c() {
        if (this.f13847j == null) {
            this.f13847j = a();
        }
        return this.f13847j;
    }

    public boolean d() {
        j.d dVar = this.f13847j;
        return dVar != null && dVar.a();
    }

    public void e() {
        this.f13847j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13848k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f13843f = view;
    }

    public void g(boolean z9) {
        this.f13845h = z9;
        j.d dVar = this.f13847j;
        if (dVar != null) {
            dVar.q(z9);
        }
    }

    public void h(int i9) {
        this.f13844g = i9;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f13848k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f13846i = aVar;
        j.d dVar = this.f13847j;
        if (dVar != null) {
            dVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i9, int i10, boolean z9, boolean z10) {
        j.d dVarC = c();
        dVarC.u(z10);
        if (z9) {
            if ((AbstractC0974p.b(this.f13844g, L.E(this.f13843f)) & 7) == 5) {
                i9 -= this.f13843f.getWidth();
            }
            dVarC.s(i9);
            dVarC.v(i10);
            int i11 = (int) ((this.f13838a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarC.p(new Rect(i9 - i11, i10 - i11, i9 + i11, i10 + i11));
        }
        dVarC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f13843f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i9, int i10) {
        if (d()) {
            return true;
        }
        if (this.f13843f == null) {
            return false;
        }
        l(i9, i10, true, true);
        return true;
    }
}
