package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import com.google.android.gms.common.api.a;
import k.m0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements e.b, j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f13935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f13936B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f13937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f13938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.appcompat.widget.a f13941u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i.a f13942v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e.a f13943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13945y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13946z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13952f;

        public c(int i9, int i10) {
            super(i9, i10);
            this.f13947a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f13947a = cVar.f13947a;
        }
    }

    public class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f13936B;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f13943w;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f13946z = (int) (56.0f * f9);
        this.f13935A = (int) (f9 * 4.0f);
        this.f13938r = context;
        this.f13939s = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int L(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.r()
            if (r9 == 0) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            if (r7 <= 0) goto L4d
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4d
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L46
            int r4 = r4 + 1
        L46:
            if (r9 == 0) goto L4b
            if (r4 >= r3) goto L4b
            goto L4e
        L4b:
            r3 = r4
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r7 = r0.f13947a
            if (r7 != 0) goto L55
            if (r9 == 0) goto L55
            r1 = 1
        L55:
            r0.f13950d = r1
            r0.f13948b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.L(android.view.View, int, int, int, int):int");
    }

    public void B() {
        androidx.appcompat.widget.a aVar = this.f13941u;
        if (aVar != null) {
            aVar.y();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f13947a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean G(int i9) {
        boolean zA = false;
        if (i9 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i9 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i9);
        if (i9 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i9 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.a aVar = this.f13941u;
        return aVar != null && aVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.a aVar = this.f13941u;
        return aVar != null && aVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.a aVar = this.f13941u;
        return aVar != null && aVar.E();
    }

    public boolean K() {
        return this.f13940t;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    public final void M(int i9, int i10) {
        int i11;
        int i12;
        boolean z9;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f13946z;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int iMax = 0;
        int i20 = 0;
        boolean z12 = false;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        long j9 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i23 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z13 = childAt instanceof ActionMenuItemView;
                int i24 = i21 + 1;
                if (z13) {
                    int i25 = this.f13935A;
                    i14 = i24;
                    r14 = 0;
                    childAt.setPadding(i25, 0, i25, 0);
                } else {
                    i14 = i24;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f13952f = r14;
                cVar.f13949c = r14;
                cVar.f13948b = r14;
                cVar.f13950d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f13951e = z13 && ((ActionMenuItemView) childAt).r();
                int iL = L(childAt, i19, cVar.f13947a ? 1 : i17, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                if (cVar.f13950d) {
                    i22++;
                }
                if (cVar.f13947a) {
                    z12 = true;
                }
                i17 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j9 |= (long) (1 << i20);
                    iMax = iMax;
                }
                i21 = i14;
            }
            i20++;
            size2 = i23;
        }
        int i26 = size2;
        boolean z14 = z12 && i21 == 2;
        boolean z15 = false;
        while (i22 > 0 && i17 > 0) {
            int i27 = 0;
            int i28 = 0;
            int i29 = a.e.API_PRIORITY_OTHER;
            long j10 = 0;
            while (i28 < childCount) {
                boolean z16 = z15;
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                int i30 = iMax;
                if (cVar2.f13950d) {
                    int i31 = cVar2.f13948b;
                    if (i31 < i29) {
                        j10 = 1 << i28;
                        i29 = i31;
                        i27 = 1;
                    } else if (i31 == i29) {
                        i27++;
                        j10 |= 1 << i28;
                    }
                }
                i28++;
                iMax = i30;
                z15 = z16;
            }
            z9 = z15;
            i13 = iMax;
            j9 |= j10;
            if (i27 > i17) {
                i11 = mode;
                i12 = i15;
                break;
            }
            int i32 = i29 + 1;
            int i33 = 0;
            while (i33 < childCount) {
                View childAt2 = getChildAt(i33);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i34 = i15;
                int i35 = mode;
                long j11 = 1 << i33;
                if ((j10 & j11) == 0) {
                    if (cVar3.f13948b == i32) {
                        j9 |= j11;
                    }
                    z11 = z14;
                } else {
                    if (z14 && cVar3.f13951e && i17 == 1) {
                        int i36 = this.f13935A;
                        z11 = z14;
                        childAt2.setPadding(i36 + i19, 0, i36, 0);
                    } else {
                        z11 = z14;
                    }
                    cVar3.f13948b++;
                    cVar3.f13952f = true;
                    i17--;
                }
                i33++;
                mode = i35;
                i15 = i34;
                z14 = z11;
            }
            iMax = i13;
            z15 = true;
        }
        i11 = mode;
        i12 = i15;
        z9 = z15;
        i13 = iMax;
        boolean z17 = !z12 && i21 == 1;
        if (i17 <= 0 || j9 == 0 || (i17 >= i21 - 1 && !z17 && iMax2 <= 1)) {
            z10 = z9;
        } else {
            float fBitCount = Long.bitCount(j9);
            if (!z17) {
                if ((j9 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f13951e) {
                    fBitCount -= 0.5f;
                }
                int i37 = childCount - 1;
                if ((j9 & ((long) (1 << i37))) != 0 && !((c) getChildAt(i37).getLayoutParams()).f13951e) {
                    fBitCount -= 0.5f;
                }
            }
            int i38 = fBitCount > 0.0f ? (int) ((i17 * i19) / fBitCount) : 0;
            z10 = z9;
            for (int i39 = 0; i39 < childCount; i39++) {
                if ((j9 & ((long) (1 << i39))) != 0) {
                    View childAt3 = getChildAt(i39);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f13949c = i38;
                        cVar4.f13952f = true;
                        if (i39 == 0 && !cVar4.f13951e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i38) / 2;
                        }
                    } else if (cVar4.f13947a) {
                        cVar4.f13949c = i38;
                        cVar4.f13952f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i38) / 2;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i38 / 2;
                        }
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            for (int i40 = 0; i40 < childCount; i40++) {
                View childAt4 = getChildAt(i40);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f13952f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f13948b * i19) + cVar5.f13949c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i11 != 1073741824 ? i13 : i26);
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f13937q;
    }

    public void O(i.a aVar, e.a aVar2) {
        this.f13942v = aVar;
        this.f13943w = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.a aVar = this.f13941u;
        return aVar != null && aVar.K();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f13937q = eVar;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(g gVar) {
        return this.f13937q.L(gVar, 0);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f13937q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f13937q = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f13941u = aVar;
            aVar.J(true);
            androidx.appcompat.widget.a aVar2 = this.f13941u;
            i.a bVar = this.f13942v;
            if (bVar == null) {
                bVar = new b();
            }
            aVar2.d(bVar);
            this.f13937q.c(this.f13941u, this.f13938r);
            this.f13941u.H(this);
        }
        return this.f13937q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f13941u.A();
    }

    public int getPopupTheme() {
        return this.f13939s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f13941u;
        if (aVar != null) {
            aVar.f(false);
            if (this.f13941u.E()) {
                this.f13941u.B();
                this.f13941u.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f13944x) {
            super.onLayout(z9, i9, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i9;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean zB = m0.b(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f13947a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f13947a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f13947a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = i26 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i9, int i10) {
        androidx.appcompat.view.menu.e eVar;
        boolean z9 = this.f13944x;
        boolean z10 = View.MeasureSpec.getMode(i9) == 1073741824;
        this.f13944x = z10;
        if (z9 != z10) {
            this.f13945y = 0;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (this.f13944x && (eVar = this.f13937q) != null && size != this.f13945y) {
            this.f13945y = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f13944x && childCount > 0) {
            M(i9, i10);
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            c cVar = (c) getChildAt(i11).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i9, i10);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.f13941u.G(z9);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f13936B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f13941u.I(drawable);
    }

    public void setOverflowReserved(boolean z9) {
        this.f13940t = z9;
    }

    public void setPopupTheme(int i9) {
        if (this.f13939s != i9) {
            this.f13939s = i9;
            if (i9 == 0) {
                this.f13938r = getContext();
            } else {
                this.f13938r = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f13941u = aVar;
        aVar.H(this);
    }
}
