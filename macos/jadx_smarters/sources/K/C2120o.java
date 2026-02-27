package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import e.AbstractC1726a;

/* JADX INFO: renamed from: k.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2120o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f43385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f43386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f43387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f43388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43389e = 0;

    public C2120o(ImageView imageView) {
        this.f43385a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f43388d == null) {
            this.f43388d = new b0();
        }
        b0 b0Var = this.f43388d;
        b0Var.a();
        ColorStateList colorStateListA = T.e.a(this.f43385a);
        if (colorStateListA != null) {
            b0Var.f43301d = true;
            b0Var.f43298a = colorStateListA;
        }
        PorterDuff.Mode modeB = T.e.b(this.f43385a);
        if (modeB != null) {
            b0Var.f43300c = true;
            b0Var.f43299b = modeB;
        }
        if (!b0Var.f43301d && !b0Var.f43300c) {
            return false;
        }
        C2114i.i(drawable, b0Var, this.f43385a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f43385a.getDrawable() != null) {
            this.f43385a.getDrawable().setLevel(this.f43389e);
        }
    }

    public void c() {
        Drawable drawable = this.f43385a.getDrawable();
        if (drawable != null) {
            M.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            b0 b0Var = this.f43387c;
            if (b0Var != null) {
                C2114i.i(drawable, b0Var, this.f43385a.getDrawableState());
                return;
            }
            b0 b0Var2 = this.f43386b;
            if (b0Var2 != null) {
                C2114i.i(drawable, b0Var2, this.f43385a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        b0 b0Var = this.f43387c;
        if (b0Var != null) {
            return b0Var.f43298a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        b0 b0Var = this.f43387c;
        if (b0Var != null) {
            return b0Var.f43299b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f43385a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i9) {
        int iN;
        d0 d0VarV = d0.v(this.f43385a.getContext(), attributeSet, c.j.f17991P, i9, 0);
        ImageView imageView = this.f43385a;
        P.L.q0(imageView, imageView.getContext(), c.j.f17991P, attributeSet, d0VarV.r(), i9, 0);
        try {
            Drawable drawable = this.f43385a.getDrawable();
            if (drawable == null && (iN = d0VarV.n(c.j.f17996Q, -1)) != -1 && (drawable = AbstractC1726a.b(this.f43385a.getContext(), iN)) != null) {
                this.f43385a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                M.b(drawable);
            }
            if (d0VarV.s(c.j.f18001R)) {
                T.e.c(this.f43385a, d0VarV.c(c.j.f18001R));
            }
            if (d0VarV.s(c.j.f18006S)) {
                T.e.d(this.f43385a, M.e(d0VarV.k(c.j.f18006S, -1), null));
            }
            d0VarV.w();
        } catch (Throwable th) {
            d0VarV.w();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.f43389e = drawable.getLevel();
    }

    public void i(int i9) {
        if (i9 != 0) {
            Drawable drawableB = AbstractC1726a.b(this.f43385a.getContext(), i9);
            if (drawableB != null) {
                M.b(drawableB);
            }
            this.f43385a.setImageDrawable(drawableB);
        } else {
            this.f43385a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f43387c == null) {
            this.f43387c = new b0();
        }
        b0 b0Var = this.f43387c;
        b0Var.f43298a = colorStateList;
        b0Var.f43301d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f43387c == null) {
            this.f43387c = new b0();
        }
        b0 b0Var = this.f43387c;
        b0Var.f43299b = mode;
        b0Var.f43300c = true;
        c();
    }

    public final boolean l() {
        int i9 = Build.VERSION.SDK_INT;
        return i9 > 21 ? this.f43386b != null : i9 == 21;
    }
}
