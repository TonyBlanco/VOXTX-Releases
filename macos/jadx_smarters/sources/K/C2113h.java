package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import e.AbstractC1726a;

/* JADX INFO: renamed from: k.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2113h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f43331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f43332b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f43333c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43334d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43335e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43336f;

    public C2113h(CompoundButton compoundButton) {
        this.f43331a = compoundButton;
    }

    public void a() {
        Drawable drawableA = T.c.a(this.f43331a);
        if (drawableA != null) {
            if (this.f43334d || this.f43335e) {
                Drawable drawableMutate = H.a.r(drawableA).mutate();
                if (this.f43334d) {
                    H.a.o(drawableMutate, this.f43332b);
                }
                if (this.f43335e) {
                    H.a.p(drawableMutate, this.f43333c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f43331a.getDrawableState());
                }
                this.f43331a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public int b(int i9) {
        return i9;
    }

    public ColorStateList c() {
        return this.f43332b;
    }

    public PorterDuff.Mode d() {
        return this.f43333c;
    }

    public void e(AttributeSet attributeSet, int i9) {
        int iN;
        int iN2;
        d0 d0VarV = d0.v(this.f43331a.getContext(), attributeSet, c.j.f18017U0, i9, 0);
        CompoundButton compoundButton = this.f43331a;
        P.L.q0(compoundButton, compoundButton.getContext(), c.j.f18017U0, attributeSet, d0VarV.r(), i9, 0);
        try {
            if (d0VarV.s(c.j.f18027W0) && (iN2 = d0VarV.n(c.j.f18027W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f43331a;
                    compoundButton2.setButtonDrawable(AbstractC1726a.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (d0VarV.s(c.j.f18022V0)) {
                        CompoundButton compoundButton3 = this.f43331a;
                        compoundButton3.setButtonDrawable(AbstractC1726a.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (d0VarV.s(c.j.f18022V0) && (iN = d0VarV.n(c.j.f18022V0, 0)) != 0) {
                CompoundButton compoundButton32 = this.f43331a;
                compoundButton32.setButtonDrawable(AbstractC1726a.b(compoundButton32.getContext(), iN));
            }
            if (d0VarV.s(c.j.f18032X0)) {
                T.c.c(this.f43331a, d0VarV.c(c.j.f18032X0));
            }
            if (d0VarV.s(c.j.f18037Y0)) {
                T.c.d(this.f43331a, M.e(d0VarV.k(c.j.f18037Y0, -1), null));
            }
        } finally {
            d0VarV.w();
        }
    }

    public void f() {
        if (this.f43336f) {
            this.f43336f = false;
        } else {
            this.f43336f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.f43332b = colorStateList;
        this.f43334d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.f43333c = mode;
        this.f43335e = true;
        a();
    }
}
