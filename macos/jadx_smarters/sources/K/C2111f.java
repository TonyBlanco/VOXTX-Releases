package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import c.AbstractC1238a;
import e.AbstractC1726a;

/* JADX INFO: renamed from: k.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2111f extends CheckedTextView implements T.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2112g f43320a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2109d f43321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2105A f43322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2117l f43323e;

    public C2111f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17757p);
    }

    public C2111f(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        Z.a(this, getContext());
        C2105A c2105a = new C2105A(this);
        this.f43322d = c2105a;
        c2105a.m(attributeSet, i9);
        c2105a.b();
        C2109d c2109d = new C2109d(this);
        this.f43321c = c2109d;
        c2109d.e(attributeSet, i9);
        C2112g c2112g = new C2112g(this);
        this.f43320a = c2112g;
        c2112g.d(attributeSet, i9);
        getEmojiTextViewHelper().c(attributeSet, i9);
    }

    private C2117l getEmojiTextViewHelper() {
        if (this.f43323e == null) {
            this.f43323e = new C2117l(this);
        }
        return this.f43323e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2105A c2105a = this.f43322d;
        if (c2105a != null) {
            c2105a.b();
        }
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            c2109d.b();
        }
        C2112g c2112g = this.f43320a;
        if (c2112g != null) {
            c2112g.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return T.j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2112g c2112g = this.f43320a;
        if (c2112g != null) {
            return c2112g.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2112g c2112g = this.f43320a;
        if (c2112g != null) {
            return c2112g.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43322d.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43322d.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC2118m.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i9) {
        setCheckMarkDrawable(AbstractC1726a.b(getContext(), i9));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2112g c2112g = this.f43320a;
        if (c2112g != null) {
            c2112g.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43322d;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43322d;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f43321c;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2112g c2112g = this.f43320a;
        if (c2112g != null) {
            c2112g.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2112g c2112g = this.f43320a;
        if (c2112g != null) {
            c2112g.g(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f43322d.w(colorStateList);
        this.f43322d.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f43322d.x(mode);
        this.f43322d.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C2105A c2105a = this.f43322d;
        if (c2105a != null) {
            c2105a.q(context, i9);
        }
    }
}
