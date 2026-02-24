package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: k.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2109d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43307a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f43310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f43311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f43312f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43309c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2114i f43308b = C2114i.b();

    public C2109d(View view) {
        this.f43307a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f43312f == null) {
            this.f43312f = new b0();
        }
        b0 b0Var = this.f43312f;
        b0Var.a();
        ColorStateList colorStateListU = P.L.u(this.f43307a);
        if (colorStateListU != null) {
            b0Var.f43301d = true;
            b0Var.f43298a = colorStateListU;
        }
        PorterDuff.Mode modeV = P.L.v(this.f43307a);
        if (modeV != null) {
            b0Var.f43300c = true;
            b0Var.f43299b = modeV;
        }
        if (!b0Var.f43301d && !b0Var.f43300c) {
            return false;
        }
        C2114i.i(drawable, b0Var, this.f43307a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f43307a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            b0 b0Var = this.f43311e;
            if (b0Var != null) {
                C2114i.i(background, b0Var, this.f43307a.getDrawableState());
                return;
            }
            b0 b0Var2 = this.f43310d;
            if (b0Var2 != null) {
                C2114i.i(background, b0Var2, this.f43307a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        b0 b0Var = this.f43311e;
        if (b0Var != null) {
            return b0Var.f43298a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        b0 b0Var = this.f43311e;
        if (b0Var != null) {
            return b0Var.f43299b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i9) {
        d0 d0VarV = d0.v(this.f43307a.getContext(), attributeSet, c.j.f18020U3, i9, 0);
        View view = this.f43307a;
        P.L.q0(view, view.getContext(), c.j.f18020U3, attributeSet, d0VarV.r(), i9, 0);
        try {
            if (d0VarV.s(c.j.f18025V3)) {
                this.f43309c = d0VarV.n(c.j.f18025V3, -1);
                ColorStateList colorStateListF = this.f43308b.f(this.f43307a.getContext(), this.f43309c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (d0VarV.s(c.j.f18030W3)) {
                P.L.x0(this.f43307a, d0VarV.c(c.j.f18030W3));
            }
            if (d0VarV.s(c.j.f18035X3)) {
                P.L.y0(this.f43307a, M.e(d0VarV.k(c.j.f18035X3, -1), null));
            }
            d0VarV.w();
        } catch (Throwable th) {
            d0VarV.w();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f43309c = -1;
        h(null);
        b();
    }

    public void g(int i9) {
        this.f43309c = i9;
        C2114i c2114i = this.f43308b;
        h(c2114i != null ? c2114i.f(this.f43307a.getContext(), i9) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f43310d == null) {
                this.f43310d = new b0();
            }
            b0 b0Var = this.f43310d;
            b0Var.f43298a = colorStateList;
            b0Var.f43301d = true;
        } else {
            this.f43310d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f43311e == null) {
            this.f43311e = new b0();
        }
        b0 b0Var = this.f43311e;
        b0Var.f43298a = colorStateList;
        b0Var.f43301d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f43311e == null) {
            this.f43311e = new b0();
        }
        b0 b0Var = this.f43311e;
        b0Var.f43299b = mode;
        b0Var.f43300c = true;
        b();
    }

    public final boolean k() {
        int i9 = Build.VERSION.SDK_INT;
        return i9 > 21 ? this.f43310d != null : i9 == 21;
    }
}
