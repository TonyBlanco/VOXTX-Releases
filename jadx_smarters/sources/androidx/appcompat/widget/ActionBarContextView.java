package androidx.appcompat.widget;

import P.L;
import P.S;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.AbstractC1238a;
import c.f;
import c.g;
import c.j;
import i.AbstractC1872b;
import k.AbstractC2106a;
import k.d0;
import k.m0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC2106a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f13886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f13887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f13888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f13889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f13890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f13891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f13892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f13893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13897u;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1872b f13898a;

        public a(AbstractC1872b abstractC1872b) {
            this.f13898a = abstractC1872b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f13898a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17748g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        d0 d0VarV = d0.v(context, attributeSet, j.f18168y, i9, 0);
        L.w0(this, d0VarV.g(j.f18173z));
        this.f13894r = d0VarV.n(j.f17931D, 0);
        this.f13895s = d0VarV.n(j.f17926C, 0);
        this.f43286f = d0VarV.m(j.f17921B, 0);
        this.f13897u = d0VarV.n(j.f17916A, g.f17880d);
        d0VarV.w();
    }

    @Override // k.AbstractC2106a
    public /* bridge */ /* synthetic */ S f(int i9, long j9) {
        return super.f(i9, j9);
    }

    public void g() {
        if (this.f13888l == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // k.AbstractC2106a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // k.AbstractC2106a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f13887k;
    }

    public CharSequence getTitle() {
        return this.f13886j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(i.AbstractC1872b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f13888l
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f13897u
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f13888l = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f13888l
            goto L15
        L22:
            android.view.View r0 = r3.f13888l
            int r1 = c.f.f17859i
            android.view.View r0 = r0.findViewById(r1)
            r3.f13889m = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.a r0 = r3.f43285e
            if (r0 == 0) goto L41
            r0.y()
        L41:
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f43285e = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.a r1 = r3.f43285e
            android.content.Context r2 = r3.f43283c
            r4.c(r1, r2)
            androidx.appcompat.widget.a r4 = r3.f43285e
            androidx.appcompat.view.menu.j r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f43284d = r4
            r1 = 0
            P.L.w0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f43284d
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(i.b):void");
    }

    public final void i() {
        if (this.f13891o == null) {
            LayoutInflater.from(getContext()).inflate(g.f17877a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f13891o = linearLayout;
            this.f13892p = (TextView) linearLayout.findViewById(f.f17855e);
            this.f13893q = (TextView) this.f13891o.findViewById(f.f17854d);
            if (this.f13894r != 0) {
                this.f13892p.setTextAppearance(getContext(), this.f13894r);
            }
            if (this.f13895s != 0) {
                this.f13893q.setTextAppearance(getContext(), this.f13895s);
            }
        }
        this.f13892p.setText(this.f13886j);
        this.f13893q.setText(this.f13887k);
        boolean z9 = !TextUtils.isEmpty(this.f13886j);
        boolean z10 = !TextUtils.isEmpty(this.f13887k);
        this.f13893q.setVisibility(z10 ? 0 : 8);
        this.f13891o.setVisibility((z9 || z10) ? 0 : 8);
        if (this.f13891o.getParent() == null) {
            addView(this.f13891o);
        }
    }

    public boolean j() {
        return this.f13896t;
    }

    public void k() {
        removeAllViews();
        this.f13890n = null;
        this.f43284d = null;
        this.f43285e = null;
        View view = this.f13889m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.a aVar = this.f43285e;
        if (aVar != null) {
            return aVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f43285e;
        if (aVar != null) {
            aVar.B();
            this.f43285e.C();
        }
    }

    @Override // k.AbstractC2106a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        boolean zB = m0.b(this);
        int paddingRight = zB ? (i11 - i9) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f13888l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13888l.getLayoutParams();
            int i13 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC2106a.d(paddingRight, i13, zB);
            paddingRight = AbstractC2106a.d(iD + e(this.f13888l, iD, paddingTop, paddingTop2, zB), i14, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f13891o;
        if (linearLayout != null && this.f13890n == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f13891o, iE, paddingTop, paddingTop2, zB);
        }
        int i15 = iE;
        View view2 = this.f13890n;
        if (view2 != null) {
            e(view2, i15, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i11 - i9) - getPaddingRight();
        ActionMenuView actionMenuView = this.f43284d;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        if (View.MeasureSpec.getMode(i9) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i9);
        int size2 = this.f43286f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f13888l;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13888l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f43284d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f43284d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f13891o;
        if (linearLayout != null && this.f13890n == null) {
            if (this.f13896t) {
                this.f13891o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f13891o.getMeasuredWidth();
                boolean z9 = measuredWidth <= paddingLeft;
                if (z9) {
                    paddingLeft -= measuredWidth;
                }
                this.f13891o.setVisibility(z9 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f13890n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f13890n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f43286f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // k.AbstractC2106a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // k.AbstractC2106a
    public void setContentHeight(int i9) {
        this.f43286f = i9;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f13890n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f13890n = view;
        if (view != null && (linearLayout = this.f13891o) != null) {
            removeView(linearLayout);
            this.f13891o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13887k = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f13886j = charSequence;
        i();
        L.v0(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.f13896t) {
            requestLayout();
        }
        this.f13896t = z9;
    }

    @Override // k.AbstractC2106a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i9) {
        super.setVisibility(i9);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
