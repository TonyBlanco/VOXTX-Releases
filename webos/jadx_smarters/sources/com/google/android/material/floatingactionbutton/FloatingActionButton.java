package com.google.android.material.floatingactionbutton;

import O.h;
import P.L;
import R4.d;
import R4.k;
import R4.l;
import S4.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import d5.C1710b;
import d5.InterfaceC1709a;
import e5.C1744b;
import f5.c;
import f5.u;
import f5.w;
import f5.x;
import i5.AbstractC1893c;
import java.util.List;
import k.C2114i;
import k.C2120o;
import k5.InterfaceC2149b;
import l5.n;
import m5.C2229a;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends x implements InterfaceC1709a, n, CoordinatorLayout.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f27382s = k.f8853g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f27383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f27384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f27385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f27386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f27387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f27393m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f27394n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f27395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C2120o f27396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1710b f27397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.google.android.material.floatingactionbutton.a f27398r;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f27399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27400b;

        public BaseBehavior() {
            this.f27400b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f9118e2);
            this.f27400b = typedArrayObtainStyledAttributes.getBoolean(l.f9127f2, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f27394n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public final void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f27394n;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i9 = 0;
            int i10 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i9 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i9 = -rect.top;
            }
            if (i9 != 0) {
                L.d0(floatingActionButton, i9);
            }
            if (i10 != 0) {
                L.c0(floatingActionButton, i10);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i9) {
            List listS = coordinatorLayout.s(floatingActionButton);
            int size = listS.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) listS.get(i10);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.J(floatingActionButton, i9);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        public final boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f27400b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f27399a == null) {
                this.f27399a = new Rect();
            }
            Rect rect = this.f27399a;
            c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        public final boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.l(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f14502h == 0) {
                fVar.f14502h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: H */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i9) {
            return super.l(coordinatorLayout, floatingActionButton, i9);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }
    }

    public static abstract class a {
    }

    public class b implements InterfaceC2149b {
        public b() {
        }

        @Override // k5.InterfaceC2149b
        public void a(int i9, int i10, int i11, int i12) {
            FloatingActionButton.this.f27394n.set(i9, i10, i11, i12);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i9 + floatingActionButton.f27391k, i10 + FloatingActionButton.this.f27391k, i11 + FloatingActionButton.this.f27391k, i12 + FloatingActionButton.this.f27391k);
        }

        @Override // k5.InterfaceC2149b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // k5.InterfaceC2149b
        public boolean c() {
            return FloatingActionButton.this.f27393m;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8683r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27382s;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        this.f27394n = new Rect();
        this.f27395o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f8985O1, i9, i10, new int[0]);
        this.f27383c = AbstractC1893c.a(context2, typedArrayH, l.f9001Q1);
        this.f27384d = w.f(typedArrayH.getInt(l.f9009R1, -1), null);
        this.f27387g = AbstractC1893c.a(context2, typedArrayH, l.f9091b2);
        this.f27389i = typedArrayH.getInt(l.f9049W1, -1);
        this.f27390j = typedArrayH.getDimensionPixelSize(l.f9041V1, 0);
        this.f27388h = typedArrayH.getDimensionPixelSize(l.f9017S1, 0);
        float dimension = typedArrayH.getDimension(l.f9025T1, 0.0f);
        float dimension2 = typedArrayH.getDimension(l.f9065Y1, 0.0f);
        float dimension3 = typedArrayH.getDimension(l.f9082a2, 0.0f);
        this.f27393m = typedArrayH.getBoolean(l.f9109d2, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f8720S);
        setMaxImageSize(typedArrayH.getDimensionPixelSize(l.f9073Z1, 0));
        f fVarB = f.b(context2, typedArrayH, l.f9100c2);
        f fVarB2 = f.b(context2, typedArrayH, l.f9057X1);
        l5.k kVarM = l5.k.g(context2, attributeSet, i9, i10, l5.k.f44133m).m();
        boolean z9 = typedArrayH.getBoolean(l.f9033U1, false);
        setEnabled(typedArrayH.getBoolean(l.f8993P1, true));
        typedArrayH.recycle();
        C2120o c2120o = new C2120o(this);
        this.f27396p = c2120o;
        c2120o.g(attributeSet, i9);
        this.f27397q = new C1710b(this);
        getImpl().T(kVarM);
        getImpl().t(this.f27383c, this.f27384d, this.f27387g, this.f27388h);
        getImpl().P(dimensionPixelSize);
        getImpl().J(dimension);
        getImpl().M(dimension2);
        getImpl().Q(dimension3);
        getImpl().U(fVarB);
        getImpl().L(fVarB2);
        getImpl().K(z9);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f27398r == null) {
            this.f27398r = e();
        }
        return this.f27398r;
    }

    public static int k(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i9, size);
        }
        if (mode == 0) {
            return i9;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // d5.InterfaceC1709a
    public boolean a() {
        return this.f27397q.c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A(getDrawableState());
    }

    public final com.google.android.material.floatingactionbutton.a e() {
        return new C1744b(this, new b());
    }

    public boolean f(Rect rect) {
        if (!L.W(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        i(rect);
        return true;
    }

    public final int g(int i9) {
        int i10 = this.f27390j;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        if (i9 != -1) {
            return resources.getDimensionPixelSize(i9 != 1 ? d.f8731d : d.f8730c);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f27383c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f27384d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().j();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().p();
    }

    public Drawable getContentBackground() {
        return getImpl().i();
    }

    public int getCustomSize() {
        return this.f27390j;
    }

    public int getExpandedComponentIdHint() {
        return this.f27397q.b();
    }

    public f getHideMotionSpec() {
        return getImpl().l();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f27387g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f27387g;
    }

    public l5.k getShapeAppearanceModel() {
        return (l5.k) h.f(getImpl().q());
    }

    public f getShowMotionSpec() {
        return getImpl().r();
    }

    public int getSize() {
        return this.f27389i;
    }

    public int getSizeDimension() {
        return g(this.f27389i);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f27385e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f27386f;
    }

    public boolean getUseCompatPadding() {
        return this.f27393m;
    }

    public void h(a aVar, boolean z9) {
        getImpl().s(m(aVar), z9);
    }

    public final void i(Rect rect) {
        int i9 = rect.left;
        Rect rect2 = this.f27394n;
        rect.left = i9 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f27385e;
        if (colorStateList == null) {
            H.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f27386f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C2114i.e(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().w();
    }

    public void l(a aVar, boolean z9) {
        getImpl().Y(m(aVar), z9);
    }

    public final a.k m(a aVar) {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i9, int i10) {
        int sizeDimension = getSizeDimension();
        this.f27391k = (sizeDimension - this.f27392l) / 2;
        getImpl().b0();
        int iMin = Math.min(k(sizeDimension, i9), k(sizeDimension, i10));
        Rect rect = this.f27394n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2229a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2229a c2229a = (C2229a) parcelable;
        super.onRestoreInstanceState(c2229a.a());
        this.f27397q.d((Bundle) h.f(c2229a.f44404d.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C2229a c2229a = new C2229a(parcelableOnSaveInstanceState);
        c2229a.f44404d.put("expandableWidgetHelper", this.f27397q.e());
        return c2229a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && f(this.f27395o) && !this.f27395o.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f27383c != colorStateList) {
            this.f27383c = colorStateList;
            getImpl().H(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f27384d != mode) {
            this.f27384d = mode;
            getImpl().I(mode);
        }
    }

    public void setCompatElevation(float f9) {
        getImpl().J(f9);
    }

    public void setCompatElevationResource(int i9) {
        setCompatElevation(getResources().getDimension(i9));
    }

    public void setCompatHoveredFocusedTranslationZ(float f9) {
        getImpl().M(f9);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i9) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i9));
    }

    public void setCompatPressedTranslationZ(float f9) {
        getImpl().Q(f9);
    }

    public void setCompatPressedTranslationZResource(int i9) {
        setCompatPressedTranslationZ(getResources().getDimension(i9));
    }

    public void setCustomSize(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i9 != this.f27390j) {
            this.f27390j = i9;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        getImpl().c0(f9);
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        if (z9 != getImpl().k()) {
            getImpl().K(z9);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i9) {
        this.f27397q.f(i9);
    }

    public void setHideMotionSpec(f fVar) {
        getImpl().L(fVar);
    }

    public void setHideMotionSpecResource(int i9) {
        setHideMotionSpec(f.c(getContext(), i9));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().a0();
            if (this.f27385e != null) {
                j();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        this.f27396p.i(i9);
        j();
    }

    public void setMaxImageSize(int i9) {
        this.f27392l = i9;
        getImpl().O(i9);
    }

    public void setRippleColor(int i9) {
        setRippleColor(ColorStateList.valueOf(i9));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f27387g != colorStateList) {
            this.f27387g = colorStateList;
            getImpl().R(this.f27387g);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f9) {
        super.setScaleX(f9);
        getImpl().E();
    }

    @Override // android.view.View
    public void setScaleY(float f9) {
        super.setScaleY(f9);
        getImpl().E();
    }

    public void setShadowPaddingEnabled(boolean z9) {
        getImpl().S(z9);
    }

    @Override // l5.n
    public void setShapeAppearanceModel(l5.k kVar) {
        getImpl().T(kVar);
    }

    public void setShowMotionSpec(f fVar) {
        getImpl().U(fVar);
    }

    public void setShowMotionSpecResource(int i9) {
        setShowMotionSpec(f.c(getContext(), i9));
    }

    public void setSize(int i9) {
        this.f27390j = 0;
        if (i9 != this.f27389i) {
            this.f27389i = i9;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f27385e != colorStateList) {
            this.f27385e = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f27386f != mode) {
            this.f27386f = mode;
            j();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f9) {
        super.setTranslationX(f9);
        getImpl().F();
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        getImpl().F();
    }

    @Override // android.view.View
    public void setTranslationZ(float f9) {
        super.setTranslationZ(f9);
        getImpl().F();
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f27393m != z9) {
            this.f27393m = z9;
            getImpl().y();
        }
    }

    @Override // f5.x, android.widget.ImageView, android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
    }
}
