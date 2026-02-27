package androidx.appcompat.widget;

import P.L;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c.j;
import k.d0;
import k.m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14198a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f14206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f14207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f14208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14212p;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i9, int i10) {
            super(i9, i10);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14198a = true;
        this.f14199c = -1;
        this.f14200d = 0;
        this.f14202f = 8388659;
        d0 d0VarV = d0.v(context, attributeSet, j.f18090i1, i9, 0);
        L.q0(this, context, j.f18090i1, attributeSet, d0VarV.r(), i9, 0);
        int iK = d0VarV.k(j.f18100k1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = d0VarV.k(j.f18095j1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = d0VarV.a(j.f18105l1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f14204h = d0VarV.i(j.f18115n1, -1.0f);
        this.f14199c = d0VarV.k(j.f18110m1, -1);
        this.f14205i = d0VarV.a(j.f18130q1, false);
        setDividerDrawable(d0VarV.g(j.f18120o1));
        this.f14211o = d0VarV.k(j.f18135r1, 0);
        this.f14212p = d0VarV.f(j.f18125p1, 0);
        d0VarV.w();
    }

    private void A(View view, int i9, int i10, int i11, int i12) {
        view.layout(i9, i10, i11 + i9, i12 + i10);
    }

    private void l(int i9, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i11 = 0; i11 < i9; i11++) {
            View viewS = s(i11);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i12 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewS.getMeasuredHeight();
                    measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i10, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i12;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void g(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = m0.b(this);
        for (int i9 = 0; i9 < virtualChildCount; i9++) {
            View viewS = s(i9);
            if (viewS != null && viewS.getVisibility() != 8 && t(i9)) {
                a aVar = (a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewS.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f14209m);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                a aVar2 = (a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f14209m;
                } else {
                    right = viewS2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f14209m;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i9;
        if (this.f14199c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f14199c;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14199c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14200d;
        if (this.f14201e == 1 && (i9 = this.f14202f & 112) != 48) {
            if (i9 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14203g) / 2;
            } else if (i9 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14203g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14199c;
    }

    public Drawable getDividerDrawable() {
        return this.f14208l;
    }

    public int getDividerPadding() {
        return this.f14212p;
    }

    public int getDividerWidth() {
        return this.f14209m;
    }

    public int getGravity() {
        return this.f14202f;
    }

    public int getOrientation() {
        return this.f14201e;
    }

    public int getShowDividers() {
        return this.f14211o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14204h;
    }

    public void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i9 = 0; i9 < virtualChildCount; i9++) {
            View viewS = s(i9);
            if (viewS != null && viewS.getVisibility() != 8 && t(i9)) {
                i(canvas, (viewS.getTop() - ((LinearLayout.LayoutParams) ((a) viewS.getLayoutParams())).topMargin) - this.f14210n);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.f14210n : viewS2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    public void i(Canvas canvas, int i9) {
        this.f14208l.setBounds(getPaddingLeft() + this.f14212p, i9, (getWidth() - getPaddingRight()) - this.f14212p, this.f14210n + i9);
        this.f14208l.draw(canvas);
    }

    public void j(Canvas canvas, int i9) {
        this.f14208l.setBounds(i9, getPaddingTop() + this.f14212p, this.f14209m + i9, (getHeight() - getPaddingBottom()) - this.f14212p);
        this.f14208l.draw(canvas);
    }

    public final void k(int i9, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i11 = 0; i11 < i9; i11++) {
            View viewS = s(i11);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i12 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewS.getMeasuredWidth();
                    measureChildWithMargins(viewS, i10, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i12;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i9 = this.f14201e;
        if (i9 == 0) {
            return new a(-2, -2);
        }
        if (i9 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f14208l == null) {
            return;
        }
        if (this.f14201e == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        if (this.f14201e == 1) {
            v(i9, i10, i11, i12);
        } else {
            u(i9, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        if (this.f14201e == 1) {
            z(i9, i10);
        } else {
            x(i9, i10);
        }
    }

    public int p(View view, int i9) {
        return 0;
    }

    public int q(View view) {
        return 0;
    }

    public int r(View view) {
        return 0;
    }

    public View s(int i9) {
        return getChildAt(i9);
    }

    public void setBaselineAligned(boolean z9) {
        this.f14198a = z9;
    }

    public void setBaselineAlignedChildIndex(int i9) {
        if (i9 >= 0 && i9 < getChildCount()) {
            this.f14199c = i9;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14208l) {
            return;
        }
        this.f14208l = drawable;
        if (drawable != null) {
            this.f14209m = drawable.getIntrinsicWidth();
            this.f14210n = drawable.getIntrinsicHeight();
        } else {
            this.f14209m = 0;
            this.f14210n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i9) {
        this.f14212p = i9;
    }

    public void setGravity(int i9) {
        if (this.f14202f != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f14202f = i9;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i9) {
        int i10 = i9 & 8388615;
        int i11 = this.f14202f;
        if ((8388615 & i11) != i10) {
            this.f14202f = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f14205i = z9;
    }

    public void setOrientation(int i9) {
        if (this.f14201e != i9) {
            this.f14201e = i9;
            requestLayout();
        }
    }

    public void setShowDividers(int i9) {
        if (i9 != this.f14211o) {
            requestLayout();
        }
        this.f14211o = i9;
    }

    public void setVerticalGravity(int i9) {
        int i10 = i9 & 112;
        int i11 = this.f14202f;
        if ((i11 & 112) != i10) {
            this.f14202f = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f9) {
        this.f14204h = Math.max(0.0f, f9);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t(int i9) {
        if (i9 == 0) {
            return (this.f14211o & 1) != 0;
        }
        if (i9 == getChildCount()) {
            return (this.f14211o & 4) != 0;
        }
        if ((this.f14211o & 2) == 0) {
            return false;
        }
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            if (getChildAt(i10).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.v(int, int, int, int):void");
    }

    public void w(View view, int i9, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03ad A[PHI: r3
      0x03ad: PHI (r3v31 int) = (r3v27 int), (r3v32 int) binds: [B:173:0x03be, B:167:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.x(int, int):void");
    }

    public int y(int i9) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02d3 A[PHI: r10
      0x02d3: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:136:0x02e4, B:130:0x02d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.z(int, int):void");
    }
}
