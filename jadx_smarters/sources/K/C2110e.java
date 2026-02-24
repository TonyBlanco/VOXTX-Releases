package k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import c.AbstractC1238a;

/* JADX INFO: renamed from: k.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2110e extends Button implements T.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f43316a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2105A f43317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2117l f43318d;

    public C2110e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17755n);
    }

    public C2110e(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        Z.a(this, getContext());
        C2109d c2109d = new C2109d(this);
        this.f43316a = c2109d;
        c2109d.e(attributeSet, i9);
        C2105A c2105a = new C2105A(this);
        this.f43317c = c2105a;
        c2105a.m(attributeSet, i9);
        c2105a.b();
        getEmojiTextViewHelper().c(attributeSet, i9);
    }

    private C2117l getEmojiTextViewHelper() {
        if (this.f43318d == null) {
            this.f43318d = new C2117l(this);
        }
        return this.f43318d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            c2109d.b();
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m0.f43381b) {
            return super.getAutoSizeMaxTextSize();
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            return c2105a.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m0.f43381b) {
            return super.getAutoSizeMinTextSize();
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            return c2105a.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m0.f43381b) {
            return super.getAutoSizeStepGranularity();
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            return c2105a.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m0.f43381b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2105A c2105a = this.f43317c;
        return c2105a != null ? c2105a.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m0.f43381b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            return c2105a.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return T.j.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f43317c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f43317c.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.o(z9, i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        C2105A c2105a = this.f43317c;
        if (c2105a == null || m0.f43381b || !c2105a.l()) {
            return;
        }
        this.f43317c.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) {
        if (m0.f43381b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
            return;
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.t(i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i9) {
        if (m0.f43381b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
            return;
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.u(iArr, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (m0.f43381b) {
            super.setAutoSizeTextTypeWithDefaults(i9);
            return;
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.v(i9);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.s(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f43316a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f43317c.w(colorStateList);
        this.f43317c.b();
    }

    @Override // T.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f43317c.x(mode);
        this.f43317c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.q(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i9, float f9) {
        if (m0.f43381b) {
            super.setTextSize(i9, f9);
            return;
        }
        C2105A c2105a = this.f43317c;
        if (c2105a != null) {
            c2105a.A(i9, f9);
        }
    }
}
