package com.google.android.material.chip;

import P.L;
import Q.C;
import R4.k;
import R4.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import f5.C1776a;
import f5.u;
import java.util.List;
import java.util.Set;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class ChipGroup extends f5.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27174l = k.f8860n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f27177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1776a f27178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f27180k;

    public class a implements C1776a.b {
        public a() {
        }

        @Override // f5.C1776a.b
        public void a(Set set) {
            if (ChipGroup.this.f27177h != null) {
                e eVar = ChipGroup.this.f27177h;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f27178i.j(ChipGroup.this));
            }
        }
    }

    public class b implements e {
        public b(d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f27178i.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i9, int i10) {
            super(i9, i10);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface d {
    }

    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    public class f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f27183a;

        public f() {
        }

        public /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(L.m());
                }
                ChipGroup.this.f27178i.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f27183a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f27178i.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f27183a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8671f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27174l;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        C1776a c1776a = new C1776a();
        this.f27178i = c1776a;
        f fVar = new f(this, null);
        this.f27180k = fVar;
        TypedArray typedArrayH = u.h(getContext(), attributeSet, l.f9144h1, i9, i10, new int[0]);
        int dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(l.f9162j1, 0);
        setChipSpacingHorizontal(typedArrayH.getDimensionPixelOffset(l.f9171k1, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayH.getDimensionPixelOffset(l.f9180l1, dimensionPixelOffset));
        setSingleLine(typedArrayH.getBoolean(l.f9198n1, false));
        setSingleSelection(typedArrayH.getBoolean(l.f9207o1, false));
        setSelectionRequired(typedArrayH.getBoolean(l.f9189m1, false));
        this.f27179j = typedArrayH.getResourceId(l.f9153i1, -1);
        typedArrayH.recycle();
        c1776a.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        L.C0(this, 1);
    }

    private int getChipCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof Chip) {
                i9++;
            }
        }
        return i9;
    }

    @Override // f5.e
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof Chip) {
                if (((Chip) getChildAt(i10)) == view) {
                    return i9;
                }
                i9++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f27178i.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f27178i.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f27175f;
    }

    public int getChipSpacingVertical() {
        return this.f27176g;
    }

    public boolean h() {
        return this.f27178i.l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i9 = this.f27179j;
        if (i9 != -1) {
            this.f27178i.f(i9);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.y0(accessibilityNodeInfo).Z(C.b.a(getRowCount(), c() ? getChipCount() : -1, false, h() ? 1 : 2));
    }

    public void setChipSpacing(int i9) {
        setChipSpacingHorizontal(i9);
        setChipSpacingVertical(i9);
    }

    public void setChipSpacingHorizontal(int i9) {
        if (this.f27175f != i9) {
            this.f27175f = i9;
            setItemSpacing(i9);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i9) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i9));
    }

    public void setChipSpacingResource(int i9) {
        setChipSpacing(getResources().getDimensionPixelOffset(i9));
    }

    public void setChipSpacingVertical(int i9) {
        if (this.f27176g != i9) {
            this.f27176g = i9;
            setLineSpacing(i9);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i9) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i9));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i9) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f27177h = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f27180k.f27183a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z9) {
        this.f27178i.p(z9);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i9) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i9) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i9) {
        setSingleLine(getResources().getBoolean(i9));
    }

    @Override // f5.e
    public void setSingleLine(boolean z9) {
        super.setSingleLine(z9);
    }

    public void setSingleSelection(int i9) {
        setSingleSelection(getResources().getBoolean(i9));
    }

    public void setSingleSelection(boolean z9) {
        this.f27178i.q(z9);
    }
}
