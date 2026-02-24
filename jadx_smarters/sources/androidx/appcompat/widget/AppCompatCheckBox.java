package androidx.appcompat.widget;

import T.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import c.AbstractC1238a;
import e.AbstractC1726a;
import k.C2105A;
import k.C2109d;
import k.C2113h;
import k.C2117l;
import k.Z;
import k.a0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2113h f13955a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2109d f13956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2105A f13957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2117l f13958e;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17756o);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        Z.a(this, getContext());
        C2113h c2113h = new C2113h(this);
        this.f13955a = c2113h;
        c2113h.e(attributeSet, i9);
        C2109d c2109d = new C2109d(this);
        this.f13956c = c2109d;
        c2109d.e(attributeSet, i9);
        C2105A c2105a = new C2105A(this);
        this.f13957d = c2105a;
        c2105a.m(attributeSet, i9);
        getEmojiTextViewHelper().c(attributeSet, i9);
    }

    private C2117l getEmojiTextViewHelper() {
        if (this.f13958e == null) {
            this.f13958e = new C2117l(this);
        }
        return this.f13958e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            c2109d.b();
        }
        C2105A c2105a = this.f13957d;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C2113h c2113h = this.f13955a;
        return c2113h != null ? c2113h.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C2113h c2113h = this.f13955a;
        if (c2113h != null) {
            return c2113h.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2113h c2113h = this.f13955a;
        if (c2113h != null) {
            return c2113h.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13957d.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13957d.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i9) {
        setButtonDrawable(AbstractC1726a.b(getContext(), i9));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2113h c2113h = this.f13955a;
        if (c2113h != null) {
            c2113h.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f13957d;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f13957d;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f13956c;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2113h c2113h = this.f13955a;
        if (c2113h != null) {
            c2113h.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2113h c2113h = this.f13955a;
        if (c2113h != null) {
            c2113h.h(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f13957d.w(colorStateList);
        this.f13957d.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f13957d.x(mode);
        this.f13957d.b();
    }
}
