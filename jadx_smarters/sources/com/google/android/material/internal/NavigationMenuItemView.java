package com.google.android.material.internal;

import P.C0959a;
import P.L;
import Q.C;
import R4.d;
import R4.e;
import R4.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import c.AbstractC1238a;
import f5.f;
import k.g0;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends f implements j.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f27473G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public FrameLayout f27474A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public g f27475B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f27476C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f27477D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Drawable f27478E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0959a f27479F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f27481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f27482y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CheckedTextView f27483z;

    public class a extends C0959a {
        public a() {
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            c9.V(NavigationMenuItemView.this.f27482y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        a aVar = new a();
        this.f27479F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(h.f8808c, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.f8732e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R4.f.f8781e);
        this.f27483z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        L.s0(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f27474A == null) {
                this.f27474A = (FrameLayout) ((ViewStub) findViewById(R4.f.f8780d)).inflate();
            }
            this.f27474A.removeAllViews();
            this.f27474A.addView(view);
        }
    }

    public final void B() {
        b.a aVar;
        int i9;
        if (D()) {
            this.f27483z.setVisibility(8);
            FrameLayout frameLayout = this.f27474A;
            if (frameLayout == null) {
                return;
            }
            aVar = (b.a) frameLayout.getLayoutParams();
            i9 = -1;
        } else {
            this.f27483z.setVisibility(0);
            FrameLayout frameLayout2 = this.f27474A;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (b.a) frameLayout2.getLayoutParams();
            i9 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i9;
        this.f27474A.setLayoutParams(aVar);
    }

    public final StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC1238a.f17761t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f27473G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean D() {
        return this.f27475B.getTitle() == null && this.f27475B.getIcon() == null && this.f27475B.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i9) {
        this.f27475B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            L.w0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        g0.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f27475B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i9) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        g gVar = this.f27475B;
        if (gVar != null && gVar.isCheckable() && this.f27475B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f27473G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.f27482y != z9) {
            this.f27482y = z9;
            this.f27479F.l(this.f27483z, 2048);
        }
    }

    public void setChecked(boolean z9) {
        refreshDrawableState();
        this.f27483z.setChecked(z9);
    }

    public void setHorizontalPadding(int i9) {
        setPadding(i9, getPaddingTop(), i9, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f27477D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = H.a.r(drawable).mutate();
                H.a.o(drawable, this.f27476C);
            }
            int i9 = this.f27480w;
            drawable.setBounds(0, 0, i9, i9);
        } else if (this.f27481x) {
            if (this.f27478E == null) {
                Drawable drawableF = F.h.f(getResources(), e.f8760g, getContext().getTheme());
                this.f27478E = drawableF;
                if (drawableF != null) {
                    int i10 = this.f27480w;
                    drawableF.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f27478E;
        }
        T.j.j(this.f27483z, drawable, null, null, null);
    }

    public void setIconPadding(int i9) {
        this.f27483z.setCompoundDrawablePadding(i9);
    }

    public void setIconSize(int i9) {
        this.f27480w = i9;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f27476C = colorStateList;
        this.f27477D = colorStateList != null;
        g gVar = this.f27475B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i9) {
        this.f27483z.setMaxLines(i9);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.f27481x = z9;
    }

    public void setTextAppearance(int i9) {
        T.j.o(this.f27483z, i9);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27483z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f27483z.setText(charSequence);
    }
}
