package com.google.android.material.chip;

import P.L;
import Q.C;
import R4.j;
import R4.k;
import R4.l;
import S4.f;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.ads.AdError;
import com.google.android.material.chip.a;
import f5.h;
import f5.u;
import f5.w;
import i5.AbstractC1893c;
import i5.AbstractC1896f;
import i5.C1894d;
import j5.AbstractC2100b;
import java.util.List;
import l5.n;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0258a, n, h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.material.chip.a f27151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InsetDrawable f27152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RippleDrawable f27153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f27154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f27155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h.a f27156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f27164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f27165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f27166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f27167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f27168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AbstractC1896f f27169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f27149y = k.f8861o;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Rect f27150z = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f27147A = {R.attr.state_selected};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f27148B = {R.attr.state_checkable};

    public class a extends AbstractC1896f {
        public a() {
        }

        @Override // i5.AbstractC1896f
        public void a(int i9) {
        }

        @Override // i5.AbstractC1896f
        public void b(Typeface typeface, boolean z9) {
            Chip chip = Chip.this;
            chip.setText(chip.f27151f.I2() ? Chip.this.f27151f.e1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (Chip.this.f27156k != null) {
                Chip.this.f27156k.a(Chip.this, z9);
            }
            if (Chip.this.f27155j != null) {
                Chip.this.f27155j.onCheckedChanged(compoundButton, z9);
            }
        }
    }

    public class c extends ViewOutlineProvider {
        public c() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f27151f != null) {
                Chip.this.f27151f.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class d extends W.a {
        public d(Chip chip) {
            super(chip);
        }

        @Override // W.a
        public int B(float f9, float f10) {
            return (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f9, f10)) ? 1 : 0;
        }

        @Override // W.a
        public void C(List list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.t() && Chip.this.f27154i != null) {
                list.add(1);
            }
        }

        @Override // W.a
        public boolean J(int i9, int i10, Bundle bundle) {
            if (i10 != 16) {
                return false;
            }
            if (i9 == 0) {
                return Chip.this.performClick();
            }
            if (i9 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        @Override // W.a
        public void M(C c9) {
            c9.V(Chip.this.s());
            c9.Y(Chip.this.isClickable());
            c9.X(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c9.u0(text);
            } else {
                c9.b0(text);
            }
        }

        @Override // W.a
        public void N(int i9, C c9) {
            if (i9 != 1) {
                c9.b0("");
                c9.T(Chip.f27150z);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                closeIconContentDescription = Chip.this.getContext().getString(j.f8836j, TextUtils.isEmpty(text) ? "" : text).trim();
            }
            c9.b0(closeIconContentDescription);
            c9.T(Chip.this.getCloseIconTouchBoundsInt());
            c9.b(C.a.f7404i);
            c9.c0(Chip.this.isEnabled());
        }

        @Override // W.a
        public void O(int i9, boolean z9) {
            if (i9 == 1) {
                Chip.this.f27160o = z9;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8672g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27149y;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        this.f27167v = new Rect();
        this.f27168w = new RectF();
        this.f27169x = new a();
        Context context2 = getContext();
        D(attributeSet);
        com.google.android.material.chip.a aVarS0 = com.google.android.material.chip.a.s0(context2, attributeSet, i9, i10);
        p(context2, attributeSet, i9);
        setChipDrawable(aVarS0);
        aVarS0.V(L.y(this));
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f9233r0, i9, i10, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(AbstractC1893c.a(context2, typedArrayH, l.f9260u0));
        }
        boolean zHasValue = typedArrayH.hasValue(l.f9108d1);
        typedArrayH.recycle();
        this.f27165t = new d(this);
        y();
        if (!zHasValue) {
            q();
        }
        setChecked(this.f27157l);
        setText(aVarS0.e1());
        setEllipsize(aVarS0.Y0());
        C();
        if (!this.f27151f.I2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        B();
        if (w()) {
            setMinHeight(this.f27163r);
        }
        this.f27162q = L.E(this);
        super.setOnCheckedChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f27168w.setEmpty();
        if (o() && this.f27154i != null) {
            this.f27151f.V0(this.f27168w);
        }
        return this.f27168w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f27167v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f27167v;
    }

    private C1894d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.f1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.f27159n != z9) {
            this.f27159n = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.f27158m != z9) {
            this.f27158m = z9;
            refreshDrawableState();
        }
    }

    public final void A() {
        this.f27153h = new RippleDrawable(AbstractC2100b.d(this.f27151f.c1()), getBackgroundDrawable(), null);
        this.f27151f.H2(false);
        L.w0(this, this.f27153h);
        B();
    }

    public final void B() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f27151f) == null) {
            return;
        }
        int iG0 = (int) (aVar.G0() + this.f27151f.g1() + this.f27151f.n0());
        int iL0 = (int) (this.f27151f.L0() + this.f27151f.h1() + this.f27151f.j0());
        if (this.f27152g != null) {
            Rect rect = new Rect();
            this.f27152g.getPadding(rect);
            iL0 += rect.left;
            iG0 += rect.right;
        }
        L.F0(this, iL0, getPaddingTop(), iG0, getPaddingBottom());
    }

    public final void C() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C1894d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f27169x);
        }
    }

    public final void D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0258a
    public void a() {
        m(this.f27163r);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f27166u ? super.dispatchHoverEvent(motionEvent) : this.f27165t.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f27166u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f27165t.w(keyEvent) || this.f27165t.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f27151f;
        if ((aVar == null || !aVar.m1()) ? false : this.f27151f.i2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f27164s)) {
            return this.f27164s;
        }
        if (!s()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f27152g;
        return insetDrawable == null ? this.f27151f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.F0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f27151f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.G0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.P0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.S0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f27166u && (this.f27165t.A() == 1 || this.f27165t.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public f getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public l5.k getShapeAppearanceModel() {
        return this.f27151f.C();
    }

    public f getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            return aVar.h1();
        }
        return 0.0f;
    }

    public final void k(com.google.android.material.chip.a aVar) {
        aVar.m2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] l() {
        ?? IsEnabled = isEnabled();
        int i9 = IsEnabled;
        if (this.f27160o) {
            i9 = IsEnabled + 1;
        }
        int i10 = i9;
        if (this.f27159n) {
            i10 = i9 + 1;
        }
        int i11 = i10;
        if (this.f27158m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (isChecked()) {
            i12 = i11 + 1;
        }
        int[] iArr = new int[i12];
        int i13 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i13 = 1;
        }
        if (this.f27160o) {
            iArr[i13] = 16842908;
            i13++;
        }
        if (this.f27159n) {
            iArr[i13] = 16843623;
            i13++;
        }
        if (this.f27158m) {
            iArr[i13] = 16842919;
            i13++;
        }
        if (isChecked()) {
            iArr[i13] = 16842913;
        }
        return iArr;
    }

    public boolean m(int i9) {
        this.f27163r = i9;
        if (!w()) {
            if (this.f27152g != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int iMax = Math.max(0, i9 - this.f27151f.getIntrinsicHeight());
        int iMax2 = Math.max(0, i9 - this.f27151f.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f27152g != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f27152g != null) {
            Rect rect = new Rect();
            this.f27152g.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                z();
                return true;
            }
        }
        if (getMinHeight() != i9) {
            setMinHeight(i9);
        }
        if (getMinWidth() != i9) {
            setMinWidth(i9);
        }
        r(i10, i11, i10, i11);
        z();
        return true;
    }

    public final void n() {
        if (getBackgroundDrawable() == this.f27152g && this.f27151f.getCallback() == null) {
            this.f27151f.setCallback(this.f27152g);
        }
    }

    public final boolean o() {
        com.google.android.material.chip.a aVar = this.f27151f;
        return (aVar == null || aVar.O0() == null) ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l5.h.f(this, this.f27151f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i9) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f27147A);
        }
        if (s()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f27148B);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        if (this.f27166u) {
            this.f27165t.I(z9, i9, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C.y0(accessibilityNodeInfo).a0(C.c.a(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i9) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        if (this.f27162q != i9) {
            this.f27162q = i9;
            B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f27158m
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = 1
            goto L41
        L2c:
            boolean r0 = r5.f27158m
            if (r0 == 0) goto L35
            r5.u()
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(Context context, AttributeSet attributeSet, int i9) {
        TypedArray typedArrayH = u.h(context, attributeSet, l.f9233r0, i9, f27149y, new int[0]);
        this.f27161p = typedArrayH.getBoolean(l.f9064Y0, false);
        this.f27163r = (int) Math.ceil(typedArrayH.getDimension(l.f8968M0, (float) Math.ceil(w.b(getContext(), 48))));
        typedArrayH.recycle();
    }

    public final void q() {
        setOutlineProvider(new c());
    }

    public final void r(int i9, int i10, int i11, int i12) {
        this.f27152g = new InsetDrawable((Drawable) this.f27151f, i9, i10, i11, i12);
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f27151f;
        return aVar != null && aVar.l1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f27164s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f27153h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f27153h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i9) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.u1(z9);
        }
    }

    public void setCheckableResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.v1(i9);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar == null) {
            this.f27157l = z9;
        } else if (aVar.l1()) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.w1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i9) {
        setCheckedIconVisible(i9);
    }

    public void setCheckedIconResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.x1(i9);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.y1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.z1(i9);
        }
    }

    public void setCheckedIconVisible(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.A1(i9);
        }
    }

    public void setCheckedIconVisible(boolean z9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.B1(z9);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.C1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.D1(i9);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.E1(f9);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.F1(i9);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f27151f;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f27151f = aVar;
            aVar.x2(false);
            k(this.f27151f);
            m(this.f27163r);
        }
    }

    public void setChipEndPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.G1(f9);
        }
    }

    public void setChipEndPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.H1(i9);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.I1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i9) {
        setChipIconVisible(i9);
    }

    public void setChipIconResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.J1(i9);
        }
    }

    public void setChipIconSize(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.K1(f9);
        }
    }

    public void setChipIconSizeResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.L1(i9);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.M1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.N1(i9);
        }
    }

    public void setChipIconVisible(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.O1(i9);
        }
    }

    public void setChipIconVisible(boolean z9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.P1(z9);
        }
    }

    public void setChipMinHeight(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.Q1(f9);
        }
    }

    public void setChipMinHeightResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.R1(i9);
        }
    }

    public void setChipStartPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.S1(f9);
        }
    }

    public void setChipStartPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.T1(i9);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.U1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.V1(i9);
        }
    }

    public void setChipStrokeWidth(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.W1(f9);
        }
    }

    public void setChipStrokeWidthResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.X1(i9);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i9) {
        setText(getResources().getString(i9));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.Z1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.a2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i9) {
        setCloseIconVisible(i9);
    }

    public void setCloseIconEndPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.b2(f9);
        }
    }

    public void setCloseIconEndPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.c2(i9);
        }
    }

    public void setCloseIconResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.d2(i9);
        }
        y();
    }

    public void setCloseIconSize(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.e2(f9);
        }
    }

    public void setCloseIconSizeResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.f2(i9);
        }
    }

    public void setCloseIconStartPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.g2(f9);
        }
    }

    public void setCloseIconStartPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.h2(i9);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.j2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.k2(i9);
        }
    }

    public void setCloseIconVisible(int i9) {
        setCloseIconVisible(getResources().getBoolean(i9));
    }

    public void setCloseIconVisible(boolean z9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.l2(z9);
        }
        y();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i9, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i9, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.V(f9);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f27151f == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.n2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.f27161p = z9;
        m(this.f27163r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i9) {
        if (i9 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i9);
        }
    }

    public void setHideMotionSpec(f fVar) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.o2(fVar);
        }
    }

    public void setHideMotionSpecResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.p2(i9);
        }
    }

    public void setIconEndPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.q2(f9);
        }
    }

    public void setIconEndPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.r2(i9);
        }
    }

    public void setIconStartPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.s2(f9);
        }
    }

    public void setIconStartPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.t2(i9);
        }
    }

    @Override // f5.h
    public void setInternalOnCheckedChangeListener(h.a aVar) {
        this.f27156k = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i9) {
        if (this.f27151f == null) {
            return;
        }
        super.setLayoutDirection(i9);
    }

    @Override // android.widget.TextView
    public void setLines(int i9) {
        if (i9 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i9);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i9) {
        if (i9 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i9);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i9) {
        super.setMaxWidth(i9);
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.u2(i9);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i9) {
        if (i9 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i9);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f27155j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f27154i = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.v2(colorStateList);
        }
        if (this.f27151f.j1()) {
            return;
        }
        A();
    }

    public void setRippleColorResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.w2(i9);
            if (this.f27151f.j1()) {
                return;
            }
            A();
        }
    }

    @Override // l5.n
    public void setShapeAppearanceModel(l5.k kVar) {
        this.f27151f.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(f fVar) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.y2(fVar);
        }
    }

    public void setShowMotionSpecResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.z2(i9);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z9) {
        if (!z9) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z9);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.I2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f27151f;
        if (aVar2 != null) {
            aVar2.A2(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i9) {
        super.setTextAppearance(i9);
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.C2(i9);
        }
        C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.C2(i9);
        }
        C();
    }

    public void setTextAppearance(C1894d c1894d) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.B2(c1894d);
        }
        C();
    }

    public void setTextAppearanceResource(int i9) {
        setTextAppearance(getContext(), i9);
    }

    public void setTextEndPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.D2(f9);
        }
    }

    public void setTextEndPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.E2(i9);
        }
    }

    public void setTextStartPadding(float f9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.F2(f9);
        }
    }

    public void setTextStartPaddingResource(int i9) {
        com.google.android.material.chip.a aVar = this.f27151f;
        if (aVar != null) {
            aVar.G2(i9);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f27151f;
        return aVar != null && aVar.n1();
    }

    public boolean u() {
        boolean z9 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f27154i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z9 = true;
        }
        if (this.f27166u) {
            this.f27165t.U(1, 1);
        }
        return z9;
    }

    public final void v() {
        if (this.f27152g != null) {
            this.f27152g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    public boolean w() {
        return this.f27161p;
    }

    public final void x(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.m2(null);
        }
    }

    public final void y() {
        boolean z9;
        if (o() && t() && this.f27154i != null) {
            L.s0(this, this.f27165t);
            z9 = true;
        } else {
            L.s0(this, null);
            z9 = false;
        }
        this.f27166u = z9;
    }

    public final void z() {
        if (AbstractC2100b.f43042a) {
            A();
            return;
        }
        this.f27151f.H2(true);
        L.w0(this, getBackgroundDrawable());
        B();
        n();
    }
}
