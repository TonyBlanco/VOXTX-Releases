package com.google.android.material.button;

import P.L;
import R4.k;
import R4.l;
import T.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import d.AbstractC1617D;
import e.AbstractC1726a;
import f5.u;
import f5.w;
import i5.AbstractC1893c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.C2110e;
import l5.h;
import l5.n;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends C2110e implements Checkable, n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f27110r = {R.attr.state_checkable};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f27111s = {R.attr.state_checked};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f27112t = k.f8859m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V4.a f27113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f27114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f27115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f27116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorStateList f27117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f27118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27125q;

    public interface a {
        void a(MaterialButton materialButton, boolean z9);
    }

    public static class b extends V.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27126d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i9) {
                return new b[i9];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            c(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void c(Parcel parcel) {
            this.f27126d = parcel.readInt() == 1;
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f27126d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8685t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27112t;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        this.f27114f = new LinkedHashSet();
        this.f27123o = false;
        this.f27124p = false;
        Context context2 = getContext();
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f8962L2, i9, i10, new int[0]);
        this.f27122n = typedArrayH.getDimensionPixelSize(l.f9066Y2, 0);
        this.f27116h = w.f(typedArrayH.getInt(l.f9092b3, -1), PorterDuff.Mode.SRC_IN);
        this.f27117i = AbstractC1893c.a(getContext(), typedArrayH, l.f9083a3);
        this.f27118j = AbstractC1893c.d(getContext(), typedArrayH, l.f9050W2);
        this.f27125q = typedArrayH.getInteger(l.f9058X2, 1);
        this.f27119k = typedArrayH.getDimensionPixelSize(l.f9074Z2, 0);
        V4.a aVar = new V4.a(this, l5.k.e(context2, attributeSet, i9, i10).m());
        this.f27113e = aVar;
        aVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.f27122n);
        h(this.f27118j != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        V4.a aVar = this.f27113e;
        return aVar != null && aVar.p();
    }

    public final boolean b() {
        int i9 = this.f27125q;
        return i9 == 3 || i9 == 4;
    }

    public final boolean c() {
        int i9 = this.f27125q;
        return i9 == 1 || i9 == 2;
    }

    public final boolean d() {
        int i9 = this.f27125q;
        return i9 == 16 || i9 == 32;
    }

    public final boolean e() {
        return L.E(this) == 1;
    }

    public final boolean f() {
        V4.a aVar = this.f27113e;
        return (aVar == null || aVar.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            j.j(this, this.f27118j, null, null, null);
        } else if (b()) {
            j.j(this, null, null, this.f27118j, null);
        } else if (d()) {
            j.j(this, null, this.f27118j, null, null);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f27113e.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f27118j;
    }

    public int getIconGravity() {
        return this.f27125q;
    }

    public int getIconPadding() {
        return this.f27122n;
    }

    public int getIconSize() {
        return this.f27119k;
    }

    public ColorStateList getIconTint() {
        return this.f27117i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f27116h;
    }

    public int getInsetBottom() {
        return this.f27113e.c();
    }

    public int getInsetTop() {
        return this.f27113e.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f27113e.h();
        }
        return null;
    }

    public l5.k getShapeAppearanceModel() {
        if (f()) {
            return this.f27113e.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f27113e.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f27113e.k();
        }
        return 0;
    }

    @Override // k.C2110e
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f27113e.l() : super.getSupportBackgroundTintList();
    }

    @Override // k.C2110e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f27113e.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z9) {
        Drawable drawable = this.f27118j;
        if (drawable != null) {
            Drawable drawableMutate = H.a.r(drawable).mutate();
            this.f27118j = drawableMutate;
            H.a.o(drawableMutate, this.f27117i);
            PorterDuff.Mode mode = this.f27116h;
            if (mode != null) {
                H.a.p(this.f27118j, mode);
            }
            int intrinsicWidth = this.f27119k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f27118j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f27119k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f27118j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f27118j;
            int i9 = this.f27120l;
            int i10 = this.f27121m;
            drawable2.setBounds(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
            this.f27118j.setVisible(true, z9);
        }
        if (z9) {
            g();
            return;
        }
        Drawable[] drawableArrA = j.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f27118j) && ((!b() || drawable5 == this.f27118j) && (!d() || drawable4 == this.f27118j))) {
            return;
        }
        g();
    }

    public final void i(int i9, int i10) {
        if (this.f27118j == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f27120l = 0;
                if (this.f27125q == 16) {
                    this.f27121m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f27119k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f27118j.getIntrinsicHeight();
                }
                int textHeight = (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f27122n) - getPaddingBottom()) / 2;
                if (this.f27121m != textHeight) {
                    this.f27121m = textHeight;
                    h(false);
                }
                return;
            }
            return;
        }
        this.f27121m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.f27125q;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f27120l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f27119k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f27118j.getIntrinsicWidth();
        }
        int textWidth = ((((i9 - getTextWidth()) - L.I(this)) - intrinsicWidth) - this.f27122n) - L.J(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textWidth /= 2;
        }
        if (e() != (this.f27125q == 4)) {
            textWidth = -textWidth;
        }
        if (this.f27120l != textWidth) {
            this.f27120l = textWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f27123o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f27113e.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i9) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f27110r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f27111s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // k.C2110e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // k.C2110e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.C2110e, android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        V4.a aVar;
        super.onLayout(z9, i9, i10, i11, i12);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f27113e) != null) {
            aVar.H(i12 - i10, i11 - i9);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f27126d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f27126d = this.f27123o;
        return bVar;
    }

    @Override // k.C2110e, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f27118j != null) {
            if (this.f27118j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        if (f()) {
            this.f27113e.r(i9);
        } else {
            super.setBackgroundColor(i9);
        }
    }

    @Override // k.C2110e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f27113e.s();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.C2110e, android.view.View
    public void setBackgroundResource(int i9) {
        setBackgroundDrawable(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (f()) {
            this.f27113e.t(z9);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (a() && isEnabled() && this.f27123o != z9) {
            this.f27123o = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f27123o);
            }
            if (this.f27124p) {
                return;
            }
            this.f27124p = true;
            Iterator it = this.f27114f.iterator();
            if (it.hasNext()) {
                AbstractC1617D.a(it.next());
                throw null;
            }
            this.f27124p = false;
        }
    }

    public void setCornerRadius(int i9) {
        if (f()) {
            this.f27113e.u(i9);
        }
    }

    public void setCornerRadiusResource(int i9) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i9));
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        if (f()) {
            this.f27113e.f().V(f9);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f27118j != drawable) {
            this.f27118j = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i9) {
        if (this.f27125q != i9) {
            this.f27125q = i9;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i9) {
        if (this.f27122n != i9) {
            this.f27122n = i9;
            setCompoundDrawablePadding(i9);
        }
    }

    public void setIconResource(int i9) {
        setIcon(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    public void setIconSize(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f27119k != i9) {
            this.f27119k = i9;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f27117i != colorStateList) {
            this.f27117i = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f27116h != mode) {
            this.f27116h = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i9) {
        setIconTint(AbstractC1726a.a(getContext(), i9));
    }

    public void setInsetBottom(int i9) {
        this.f27113e.v(i9);
    }

    public void setInsetTop(int i9) {
        this.f27113e.w(i9);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f27115g = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        a aVar = this.f27115g;
        if (aVar != null) {
            aVar.a(this, z9);
        }
        super.setPressed(z9);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f27113e.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i9) {
        if (f()) {
            setRippleColor(AbstractC1726a.a(getContext(), i9));
        }
    }

    @Override // l5.n
    public void setShapeAppearanceModel(l5.k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f27113e.y(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (f()) {
            this.f27113e.z(z9);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f27113e.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i9) {
        if (f()) {
            setStrokeColor(AbstractC1726a.a(getContext(), i9));
        }
    }

    public void setStrokeWidth(int i9) {
        if (f()) {
            this.f27113e.B(i9);
        }
    }

    public void setStrokeWidthResource(int i9) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i9));
        }
    }

    @Override // k.C2110e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f27113e.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // k.C2110e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f27113e.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i9) {
        super.setTextAlignment(i9);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f27123o);
    }
}
