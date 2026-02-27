package androidx.appcompat.widget;

import P.B;
import P.C;
import P.D;
import P.L;
import P.X;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import c.AbstractC1238a;
import c.f;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import k.G;
import k.H;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements G, B, C {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f13900G = {AbstractC1238a.f17743b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public OverScroller f13901A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ViewPropertyAnimator f13902B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AnimatorListenerAdapter f13903C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Runnable f13904D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Runnable f13905E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final D f13906F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13907a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f13909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f13910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H f13911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f13912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f13920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f13921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f13922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f13923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f13924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f13925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f13926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public X f13927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public X f13928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public X f13929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public X f13930y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f13931z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13902B = null;
            actionBarOverlayLayout.f13917l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13902B = null;
            actionBarOverlayLayout.f13917l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13902B = actionBarOverlayLayout.f13910e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f13903C);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13902B = actionBarOverlayLayout.f13910e.animate().translationY(-ActionBarOverlayLayout.this.f13910e.getHeight()).setListener(ActionBarOverlayLayout.this.f13903C);
        }
    }

    public interface d {
        void a();

        void b(int i9);

        void c();

        void d(boolean z9);

        void e();

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i9, int i10) {
            super(i9, i10);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13908c = 0;
        this.f13920o = new Rect();
        this.f13921p = new Rect();
        this.f13922q = new Rect();
        this.f13923r = new Rect();
        this.f13924s = new Rect();
        this.f13925t = new Rect();
        this.f13926u = new Rect();
        X x9 = X.f6773b;
        this.f13927v = x9;
        this.f13928w = x9;
        this.f13929x = x9;
        this.f13930y = x9;
        this.f13903C = new a();
        this.f13904D = new b();
        this.f13905E = new c();
        v(context);
        this.f13906F = new D(this);
    }

    public final void A() {
        u();
        this.f13904D.run();
    }

    public final boolean B(float f9) {
        this.f13901A.fling(0, 0, 0, (int) f9, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        return this.f13901A.getFinalY() > this.f13910e.getHeight();
    }

    @Override // k.G
    public boolean a() {
        z();
        return this.f13911f.a();
    }

    @Override // k.G
    public boolean b() {
        z();
        return this.f13911f.b();
    }

    @Override // k.G
    public boolean c() {
        z();
        return this.f13911f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // k.G
    public void d(Menu menu, i.a aVar) {
        z();
        this.f13911f.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13912g == null || this.f13913h) {
            return;
        }
        int bottom = this.f13910e.getVisibility() == 0 ? (int) (this.f13910e.getBottom() + this.f13910e.getTranslationY() + 0.5f) : 0;
        this.f13912g.setBounds(0, bottom, getWidth(), this.f13912g.getIntrinsicHeight() + bottom);
        this.f13912g.draw(canvas);
    }

    @Override // k.G
    public boolean e() {
        z();
        return this.f13911f.e();
    }

    @Override // k.G
    public void f() {
        z();
        this.f13911f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // k.G
    public boolean g() {
        z();
        return this.f13911f.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f13910e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13906F.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f13911f.getTitle();
    }

    @Override // k.G
    public void h(int i9) {
        z();
        if (i9 == 2) {
            this.f13911f.p();
        } else if (i9 == 5) {
            this.f13911f.y();
        } else {
            if (i9 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // P.B
    public void i(View view, View view2, int i9, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i9);
        }
    }

    @Override // P.B
    public void j(View view, int i9) {
        if (i9 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // P.B
    public void k(View view, int i9, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i9, i10, iArr);
        }
    }

    @Override // k.G
    public void l() {
        z();
        this.f13911f.r();
    }

    @Override // P.C
    public void m(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        n(view, i9, i10, i11, i12, i13);
    }

    @Override // P.B
    public void n(View view, int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i9, i10, i11, i12);
        }
    }

    @Override // P.B
    public boolean o(View view, View view2, int i9, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i9);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        X xV = X.v(windowInsets, this);
        boolean zQ = q(this.f13910e, new Rect(xV.i(), xV.k(), xV.j(), xV.h()), true, true, false, true);
        L.h(this, xV, this.f13920o);
        Rect rect = this.f13920o;
        X xL = xV.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f13927v = xL;
        boolean z9 = true;
        if (!this.f13928w.equals(xL)) {
            this.f13928w = this.f13927v;
            zQ = true;
        }
        if (this.f13921p.equals(this.f13920o)) {
            z9 = zQ;
        } else {
            this.f13921p.set(this.f13920o);
        }
        if (z9) {
            requestLayout();
        }
        return xV.a().c().b().t();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        L.p0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int measuredHeight;
        X xA;
        z();
        measureChildWithMargins(this.f13910e, i9, 0, i10, 0);
        e eVar = (e) this.f13910e.getLayoutParams();
        int iMax = Math.max(0, this.f13910e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f13910e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f13910e.getMeasuredState());
        boolean z9 = (L.O(this) & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0;
        if (z9) {
            measuredHeight = this.f13907a;
            if (this.f13915j && this.f13910e.getTabContainer() != null) {
                measuredHeight += this.f13907a;
            }
        } else {
            measuredHeight = this.f13910e.getVisibility() != 8 ? this.f13910e.getMeasuredHeight() : 0;
        }
        this.f13922q.set(this.f13920o);
        X x9 = this.f13927v;
        this.f13929x = x9;
        if (this.f13914i || z9) {
            xA = new X.b(this.f13929x).c(G.b.b(x9.i(), this.f13929x.k() + measuredHeight, this.f13929x.j(), this.f13929x.h())).a();
        } else {
            Rect rect = this.f13922q;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            xA = x9.l(0, measuredHeight, 0, 0);
        }
        this.f13929x = xA;
        q(this.f13909d, this.f13922q, true, true, true, true);
        if (!this.f13930y.equals(this.f13929x)) {
            X x10 = this.f13929x;
            this.f13930y = x10;
            L.i(this.f13909d, x10);
        }
        measureChildWithMargins(this.f13909d, i9, 0, i10, 0);
        e eVar2 = (e) this.f13909d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f13909d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f13909d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f13909d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i9, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        if (!this.f13916k || !z9) {
            return false;
        }
        if (B(f10)) {
            p();
        } else {
            A();
        }
        this.f13917l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        int i13 = this.f13918m + i10;
        this.f13918m = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i9) {
        this.f13906F.b(view, view2, i9);
        this.f13918m = getActionBarHideOffset();
        u();
        d dVar = this.f13931z;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i9) {
        if ((i9 & 2) == 0 || this.f13910e.getVisibility() != 0) {
            return false;
        }
        return this.f13916k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f13916k && !this.f13917l) {
            if (this.f13918m <= this.f13910e.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f13931z;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i9) {
        super.onWindowSystemUiVisibilityChanged(i9);
        z();
        int i10 = this.f13919n ^ i9;
        this.f13919n = i9;
        boolean z9 = (i9 & 4) == 0;
        boolean z10 = (i9 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0;
        d dVar = this.f13931z;
        if (dVar != null) {
            dVar.d(!z10);
            if (z9 || !z10) {
                this.f13931z.a();
            } else {
                this.f13931z.e();
            }
        }
        if ((i10 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) == 0 || this.f13931z == null) {
            return;
        }
        L.p0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        this.f13908c = i9;
        d dVar = this.f13931z;
        if (dVar != null) {
            dVar.b(i9);
        }
    }

    public final void p() {
        u();
        this.f13905E.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i9) {
        u();
        this.f13910e.setTranslationY(-Math.max(0, Math.min(i9, this.f13910e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f13931z = dVar;
        if (getWindowToken() != null) {
            this.f13931z.b(this.f13908c);
            int i9 = this.f13919n;
            if (i9 != 0) {
                onWindowSystemUiVisibilityChanged(i9);
                L.p0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f13915j = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.f13916k) {
            this.f13916k = z9;
            if (z9) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i9) {
        z();
        this.f13911f.setIcon(i9);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f13911f.setIcon(drawable);
    }

    public void setLogo(int i9) {
        z();
        this.f13911f.t(i9);
    }

    public void setOverlayMode(boolean z9) {
        this.f13914i = z9;
        this.f13913h = z9 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i9) {
    }

    @Override // k.G
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f13911f.setWindowCallback(callback);
    }

    @Override // k.G
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f13911f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final H t(View view) {
        if (view instanceof H) {
            return (H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.f13904D);
        removeCallbacks(this.f13905E);
        ViewPropertyAnimator viewPropertyAnimator = this.f13902B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f13900G);
        this.f13907a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f13912g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f13913h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f13901A = new OverScroller(context);
    }

    public boolean w() {
        return this.f13914i;
    }

    public final void x() {
        u();
        postDelayed(this.f13905E, 600L);
    }

    public final void y() {
        u();
        postDelayed(this.f13904D, 600L);
    }

    public void z() {
        if (this.f13909d == null) {
            this.f13909d = (ContentFrameLayout) findViewById(f.f17852b);
            this.f13910e = (ActionBarContainer) findViewById(f.f17853c);
            this.f13911f = t(findViewById(f.f17851a));
        }
    }
}
