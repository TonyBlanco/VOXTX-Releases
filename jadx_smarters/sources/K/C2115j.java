package k;

import P.C0962d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import c.AbstractC1238a;

/* JADX INFO: renamed from: k.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2115j extends EditText implements P.G, T.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f43348a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2105A f43349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2130z f43350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T.l f43351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2116k f43352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f43353g;

    /* JADX INFO: renamed from: k.j$a */
    public class a {
        public a() {
        }

        public TextClassifier a() {
            return C2115j.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C2115j.super.setTextClassifier(textClassifier);
        }
    }

    public C2115j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17725B);
    }

    public C2115j(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        Z.a(this, getContext());
        C2109d c2109d = new C2109d(this);
        this.f43348a = c2109d;
        c2109d.e(attributeSet, i9);
        C2105A c2105a = new C2105A(this);
        this.f43349c = c2105a;
        c2105a.m(attributeSet, i9);
        c2105a.b();
        this.f43350d = new C2130z(this);
        this.f43351e = new T.l();
        C2116k c2116k = new C2116k(this);
        this.f43352f = c2116k;
        c2116k.c(attributeSet, i9);
        d(c2116k);
    }

    private a getSuperCaller() {
        if (this.f43353g == null) {
            this.f43353g = new a();
        }
        return this.f43353g;
    }

    @Override // P.G
    public C0962d a(C0962d c0962d) {
        return this.f43351e.a(this, c0962d);
    }

    public void d(C2116k c2116k) {
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
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            c2109d.b();
        }
        C2105A c2105a = this.f43349c;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return T.j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43349c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43349c.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2130z c2130z;
        return (Build.VERSION.SDK_INT >= 28 || (c2130z = this.f43350d) == null) ? getSuperCaller().a() : c2130z.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f43349c.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC2118m.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrH = P.L.H(this)) != null) {
            S.c.d(editorInfo, strArrH);
            inputConnectionA = S.f.c(this, inputConnectionA, editorInfo);
        }
        return this.f43352f.d(inputConnectionA, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC2124t.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i9) {
        if (AbstractC2124t.b(this, i9)) {
            return true;
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43349c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2105A c2105a = this.f43349c;
        if (c2105a != null) {
            c2105a.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f43352f.e(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f43352f.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f43348a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f43349c.w(colorStateList);
        this.f43349c.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f43349c.x(mode);
        this.f43349c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C2105A c2105a = this.f43349c;
        if (c2105a != null) {
            c2105a.q(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2130z c2130z;
        if (Build.VERSION.SDK_INT >= 28 || (c2130z = this.f43350d) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c2130z.b(textClassifier);
        }
    }
}
