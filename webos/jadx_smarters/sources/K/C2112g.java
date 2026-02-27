package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import e.AbstractC1726a;

/* JADX INFO: renamed from: k.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2112g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f43325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f43326b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f43327c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43328d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43329e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43330f;

    public C2112g(CheckedTextView checkedTextView) {
        this.f43325a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = T.b.a(this.f43325a);
        if (drawableA != null) {
            if (this.f43328d || this.f43329e) {
                Drawable drawableMutate = H.a.r(drawableA).mutate();
                if (this.f43328d) {
                    H.a.o(drawableMutate, this.f43326b);
                }
                if (this.f43329e) {
                    H.a.p(drawableMutate, this.f43327c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f43325a.getDrawableState());
                }
                this.f43325a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f43326b;
    }

    public PorterDuff.Mode c() {
        return this.f43327c;
    }

    public void d(AttributeSet attributeSet, int i9) {
        int iN;
        int iN2;
        d0 d0VarV = d0.v(this.f43325a.getContext(), attributeSet, c.j.f17992P0, i9, 0);
        CheckedTextView checkedTextView = this.f43325a;
        P.L.q0(checkedTextView, checkedTextView.getContext(), c.j.f17992P0, attributeSet, d0VarV.r(), i9, 0);
        try {
            if (d0VarV.s(c.j.f18002R0) && (iN2 = d0VarV.n(c.j.f18002R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f43325a;
                    checkedTextView2.setCheckMarkDrawable(AbstractC1726a.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (d0VarV.s(c.j.f17997Q0)) {
                        CheckedTextView checkedTextView3 = this.f43325a;
                        checkedTextView3.setCheckMarkDrawable(AbstractC1726a.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (d0VarV.s(c.j.f17997Q0) && (iN = d0VarV.n(c.j.f17997Q0, 0)) != 0) {
                CheckedTextView checkedTextView32 = this.f43325a;
                checkedTextView32.setCheckMarkDrawable(AbstractC1726a.b(checkedTextView32.getContext(), iN));
            }
            if (d0VarV.s(c.j.f18007S0)) {
                T.b.b(this.f43325a, d0VarV.c(c.j.f18007S0));
            }
            if (d0VarV.s(c.j.f18012T0)) {
                T.b.c(this.f43325a, M.e(d0VarV.k(c.j.f18012T0, -1), null));
            }
        } finally {
            d0VarV.w();
        }
    }

    public void e() {
        if (this.f43330f) {
            this.f43330f = false;
        } else {
            this.f43330f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f43326b = colorStateList;
        this.f43328d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f43327c = mode;
        this.f43329e = true;
        a();
    }
}
