package o5;

import P.AbstractC0976s;
import P.L;
import Q.C;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import f5.w;
import i5.AbstractC1893c;
import k.d0;

/* JADX INFO: renamed from: o5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2357i extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f46118a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f46119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f46120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f46121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f46122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f46123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f46124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46125i;

    public C2357i(TextInputLayout textInputLayout, d0 d0Var) {
        super(textInputLayout.getContext());
        this.f46118a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R4.h.f8810e, (ViewGroup) this, false);
        this.f46121e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f46119c = appCompatTextView;
        g(d0Var);
        f(d0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public CharSequence a() {
        return this.f46120d;
    }

    public ColorStateList b() {
        return this.f46119c.getTextColors();
    }

    public TextView c() {
        return this.f46119c;
    }

    public CharSequence d() {
        return this.f46121e.getContentDescription();
    }

    public Drawable e() {
        return this.f46121e.getDrawable();
    }

    public final void f(d0 d0Var) {
        this.f46119c.setVisibility(8);
        this.f46119c.setId(R4.f.f8775O);
        this.f46119c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        L.u0(this.f46119c, 1);
        l(d0Var.n(R4.l.f9132f7, 0));
        if (d0Var.s(R4.l.f9141g7)) {
            m(d0Var.c(R4.l.f9141g7));
        }
        k(d0Var.p(R4.l.f9123e7));
    }

    public final void g(d0 d0Var) {
        if (AbstractC1893c.g(getContext())) {
            AbstractC0976s.c((ViewGroup.MarginLayoutParams) this.f46121e.getLayoutParams(), 0);
        }
        q(null);
        r(null);
        if (d0Var.s(R4.l.f9177k7)) {
            this.f46122f = AbstractC1893c.b(getContext(), d0Var, R4.l.f9177k7);
        }
        if (d0Var.s(R4.l.f9186l7)) {
            this.f46123g = w.f(d0Var.k(R4.l.f9186l7, -1), null);
        }
        if (d0Var.s(R4.l.f9168j7)) {
            p(d0Var.g(R4.l.f9168j7));
            if (d0Var.s(R4.l.f9159i7)) {
                o(d0Var.p(R4.l.f9159i7));
            }
            n(d0Var.a(R4.l.f9150h7, true));
        }
    }

    public boolean h() {
        return this.f46121e.getVisibility() == 0;
    }

    public void i(boolean z9) {
        this.f46125i = z9;
        x();
    }

    public void j() {
        AbstractC2353e.c(this.f46118a, this.f46121e, this.f46122f);
    }

    public void k(CharSequence charSequence) {
        this.f46120d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f46119c.setText(charSequence);
        x();
    }

    public void l(int i9) {
        T.j.o(this.f46119c, i9);
    }

    public void m(ColorStateList colorStateList) {
        this.f46119c.setTextColor(colorStateList);
    }

    public void n(boolean z9) {
        this.f46121e.setCheckable(z9);
    }

    public void o(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f46121e.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        w();
    }

    public void p(Drawable drawable) {
        this.f46121e.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC2353e.a(this.f46118a, this.f46121e, this.f46122f, this.f46123g);
            u(true);
            j();
        } else {
            u(false);
            q(null);
            r(null);
            o(null);
        }
    }

    public void q(View.OnClickListener onClickListener) {
        AbstractC2353e.e(this.f46121e, onClickListener, this.f46124h);
    }

    public void r(View.OnLongClickListener onLongClickListener) {
        this.f46124h = onLongClickListener;
        AbstractC2353e.f(this.f46121e, onLongClickListener);
    }

    public void s(ColorStateList colorStateList) {
        if (this.f46122f != colorStateList) {
            this.f46122f = colorStateList;
            AbstractC2353e.a(this.f46118a, this.f46121e, colorStateList, this.f46123g);
        }
    }

    public void t(PorterDuff.Mode mode) {
        if (this.f46123g != mode) {
            this.f46123g = mode;
            AbstractC2353e.a(this.f46118a, this.f46121e, this.f46122f, mode);
        }
    }

    public void u(boolean z9) {
        if (h() != z9) {
            this.f46121e.setVisibility(z9 ? 0 : 8);
            w();
            x();
        }
    }

    public void v(C c9) {
        View view;
        if (this.f46119c.getVisibility() == 0) {
            c9.i0(this.f46119c);
            view = this.f46119c;
        } else {
            view = this.f46121e;
        }
        c9.v0(view);
    }

    public void w() {
        EditText editText = this.f46118a.f27633f;
        if (editText == null) {
            return;
        }
        L.F0(this.f46119c, h() ? 0 : L.J(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R4.d.f8751x), editText.getCompoundPaddingBottom());
    }

    public final void x() {
        int i9 = (this.f46120d == null || this.f46125i) ? 8 : 0;
        setVisibility((this.f46121e.getVisibility() == 0 || i9 == 0) ? 0 : 8);
        this.f46119c.setVisibility(i9);
        this.f46118a.q0();
    }
}
