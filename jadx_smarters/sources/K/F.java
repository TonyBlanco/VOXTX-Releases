package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class F extends ToggleButton implements T.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f43135a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2105A f43136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2117l f43137d;

    public F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public F(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Z.a(this, getContext());
        C2109d c2109d = new C2109d(this);
        this.f43135a = c2109d;
        c2109d.e(attributeSet, i9);
        C2105A c2105a = new C2105A(this);
        this.f43136c = c2105a;
        c2105a.m(attributeSet, i9);
        getEmojiTextViewHelper().c(attributeSet, i9);
    }

    private C2117l getEmojiTextViewHelper() {
        if (this.f43137d == null) {
            this.f43137d = new C2117l(this);
        }
        return this.f43137d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            c2109d.b();
        }
        C2105A c2105a = this.f43136c;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43136c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43136c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43136c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43136c;
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
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f43135a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f43136c.w(colorStateList);
        this.f43136c.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f43136c.x(mode);
        this.f43136c.b();
    }
}
