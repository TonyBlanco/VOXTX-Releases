package com.google.android.material.appbar;

import H.a;
import P.L;
import R4.b;
import R4.k;
import R4.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import f5.u;
import f5.v;
import l5.C2198g;
import l5.h;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f27000h0 = k.f8868v;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f27001i0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Integer f27002V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f27003W;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f27004e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ImageView.ScaleType f27005f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Boolean f27006g0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f8665K);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27000h0;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        Context context2 = getContext();
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f9067Y3, i9, i10, new int[0]);
        if (typedArrayH.hasValue(l.f9093b4)) {
            setNavigationIconTint(typedArrayH.getColor(l.f9093b4, -1));
        }
        this.f27003W = typedArrayH.getBoolean(l.f9111d4, false);
        this.f27004e0 = typedArrayH.getBoolean(l.f9102c4, false);
        int i11 = typedArrayH.getInt(l.f9084a4, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f27001i0;
            if (i11 < scaleTypeArr.length) {
                this.f27005f0 = scaleTypeArr[i11];
            }
        }
        if (typedArrayH.hasValue(l.f9075Z3)) {
            this.f27006g0 = Boolean.valueOf(typedArrayH.getBoolean(l.f9075Z3, false));
        }
        typedArrayH.recycle();
        T(context2);
    }

    public final Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i9 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i9 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i9 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void T(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C2198g c2198g = new C2198g();
            c2198g.W(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c2198g.L(context);
            c2198g.V(L.y(this));
            L.w0(this, c2198g);
        }
    }

    public final void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i9 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i9;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i9, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i9 += iMax;
            i10 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i10 - i9, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i9, view.getTop(), i10, view.getBottom());
    }

    public final void V() {
        if (this.f27003W || this.f27004e0) {
            TextView textViewE = v.e(this);
            TextView textViewC = v.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairS = S(textViewE, textViewC);
            if (this.f27003W && textViewE != null) {
                U(textViewE, pairS);
            }
            if (!this.f27004e0 || textViewC == null) {
                return;
            }
            U(textViewC, pairS);
        }
    }

    public final Drawable W(Drawable drawable) {
        if (drawable == null || this.f27002V == null) {
            return drawable;
        }
        Drawable drawableR = a.r(drawable.mutate());
        a.n(drawableR, this.f27002V.intValue());
        return drawableR;
    }

    public final void X() {
        ImageView imageViewB = v.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f27006g0;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f27005f0;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f27005f0;
    }

    public Integer getNavigationIconTint() {
        return this.f27002V;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        V();
        X();
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        h.d(this, f9);
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.f27006g0;
        if (bool == null || bool.booleanValue() != z9) {
            this.f27006g0 = Boolean.valueOf(z9);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f27005f0 != scaleType) {
            this.f27005f0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i9) {
        this.f27002V = Integer.valueOf(i9);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.f27004e0 != z9) {
            this.f27004e0 = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.f27003W != z9) {
            this.f27003W = z9;
            requestLayout();
        }
    }
}
