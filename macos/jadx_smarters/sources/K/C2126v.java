package k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: k.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2126v extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f43401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f43402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f43403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f43404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43406i;

    public C2126v(SeekBar seekBar) {
        super(seekBar);
        this.f43403f = null;
        this.f43404g = null;
        this.f43405h = false;
        this.f43406i = false;
        this.f43401d = seekBar;
    }

    @Override // k.r
    public void c(AttributeSet attributeSet, int i9) {
        super.c(attributeSet, i9);
        d0 d0VarV = d0.v(this.f43401d.getContext(), attributeSet, c.j.f18011T, i9, 0);
        SeekBar seekBar = this.f43401d;
        P.L.q0(seekBar, seekBar.getContext(), c.j.f18011T, attributeSet, d0VarV.r(), i9, 0);
        Drawable drawableH = d0VarV.h(c.j.f18016U);
        if (drawableH != null) {
            this.f43401d.setThumb(drawableH);
        }
        j(d0VarV.g(c.j.f18021V));
        if (d0VarV.s(c.j.f18031X)) {
            this.f43404g = M.e(d0VarV.k(c.j.f18031X, -1), this.f43404g);
            this.f43406i = true;
        }
        if (d0VarV.s(c.j.f18026W)) {
            this.f43403f = d0VarV.c(c.j.f18026W);
            this.f43405h = true;
        }
        d0VarV.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.f43402e;
        if (drawable != null) {
            if (this.f43405h || this.f43406i) {
                Drawable drawableR = H.a.r(drawable.mutate());
                this.f43402e = drawableR;
                if (this.f43405h) {
                    H.a.o(drawableR, this.f43403f);
                }
                if (this.f43406i) {
                    H.a.p(this.f43402e, this.f43404g);
                }
                if (this.f43402e.isStateful()) {
                    this.f43402e.setState(this.f43401d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f43402e != null) {
            int max = this.f43401d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f43402e.getIntrinsicWidth();
                int intrinsicHeight = this.f43402e.getIntrinsicHeight();
                int i9 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f43402e.setBounds(-i9, -i10, i9, i10);
                float width = ((this.f43401d.getWidth() - this.f43401d.getPaddingLeft()) - this.f43401d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f43401d.getPaddingLeft(), this.f43401d.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f43402e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f43402e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f43401d.getDrawableState())) {
            this.f43401d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f43402e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f43402e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f43402e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f43401d);
            H.a.m(drawable, P.L.E(this.f43401d));
            if (drawable.isStateful()) {
                drawable.setState(this.f43401d.getDrawableState());
            }
            f();
        }
        this.f43401d.invalidate();
    }
}
