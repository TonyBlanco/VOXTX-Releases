package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import c.AbstractC1238a;
import e.AbstractC1726a;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2108c extends AutoCompleteTextView implements T.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f43302e = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f43303a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2105A f43304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2116k f43305d;

    public C2108c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17754m);
    }

    public C2108c(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        Z.a(this, getContext());
        d0 d0VarV = d0.v(getContext(), attributeSet, f43302e, i9, 0);
        if (d0VarV.s(0)) {
            setDropDownBackgroundDrawable(d0VarV.g(0));
        }
        d0VarV.w();
        C2109d c2109d = new C2109d(this);
        this.f43303a = c2109d;
        c2109d.e(attributeSet, i9);
        C2105A c2105a = new C2105A(this);
        this.f43304c = c2105a;
        c2105a.m(attributeSet, i9);
        c2105a.b();
        C2116k c2116k = new C2116k(this);
        this.f43305d = c2116k;
        c2116k.c(attributeSet, i9);
        a(c2116k);
    }

    public void a(C2116k c2116k) {
        KeyListener keyListener = getKeyListener();
        if (c2116k.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c2116k.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            c2109d.b();
        }
        C2105A c2105a = this.f43304c;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return T.j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43304c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43304c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f43305d.d(AbstractC2118m.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43304c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43304c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i9) {
        setDropDownBackgroundDrawable(AbstractC1726a.b(getContext(), i9));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f43305d.e(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f43305d.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f43303a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f43304c.w(colorStateList);
        this.f43304c.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f43304c.x(mode);
        this.f43304c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C2105A c2105a = this.f43304c;
        if (c2105a != null) {
            c2105a.q(context, i9);
        }
    }
}
