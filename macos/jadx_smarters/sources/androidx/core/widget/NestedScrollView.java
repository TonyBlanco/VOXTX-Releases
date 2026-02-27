package androidx.core.widget;

import P.A;
import P.C;
import P.C0959a;
import P.D;
import P.InterfaceC0983z;
import P.L;
import Q.C;
import Q.E;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements C, InterfaceC0983z {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f14539B = new a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f14540C = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f14541A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14542a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f14543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f14544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f14545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f14546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f14550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f14552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f14559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f14560t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14561u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14562v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f14563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final D f14564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final A f14565y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f14566z;

    public static class a extends C0959a {
        @Override // P.C0959a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            E.a(accessibilityEvent, nestedScrollView.getScrollX());
            E.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // P.C0959a
        public void g(View view, Q.C c9) {
            int scrollRange;
            super.g(view, c9);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c9.X(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c9.q0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c9.b(C.a.f7413r);
                c9.b(C.a.f7385C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c9.b(C.a.f7412q);
                c9.b(C.a.f7387E);
            }
        }

        @Override // P.C0959a
        public boolean j(View view, int i9, Bundle bundle) {
            if (super.j(view, i9, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i9 != 4096) {
                if (i9 == 8192 || i9 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, iMax, true);
                    return true;
                }
                if (i9 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, iMin, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i9, int i10, int i11, int i12);
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14567a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i9) {
                return new d[i9];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f14567a = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f14567a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f14567a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C.a.f778c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14543c = new Rect();
        this.f14548h = true;
        this.f14549i = false;
        this.f14550j = null;
        this.f14551k = false;
        this.f14554n = true;
        this.f14558r = -1;
        this.f14559s = new int[2];
        this.f14560t = new int[2];
        this.f14545e = T.d.a(context, attributeSet);
        this.f14546f = T.d.a(context, attributeSet);
        y();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14540C, i9, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f14564x = new D(this);
        this.f14565y = new A(this);
        setNestedScrollingEnabled(true);
        L.s0(this, f14539B);
    }

    public static boolean B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && B((View) parent, view2);
    }

    public static int e(int i9, int i10, int i11) {
        if (i10 >= i11 || i9 < 0) {
            return 0;
        }
        return i10 + i9 > i11 ? i11 - i10 : i9;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f14566z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f14566z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f14566z;
    }

    public final boolean A(View view) {
        return !C(view, 0, getHeight());
    }

    public final boolean C(View view, int i9, int i10) {
        view.getDrawingRect(this.f14543c);
        offsetDescendantRectToMyCoords(view, this.f14543c);
        return this.f14543c.bottom + i9 >= getScrollY() && this.f14543c.top - i9 <= getScrollY() + i10;
    }

    public final void D(int i9, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i9);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f14565y.e(0, scrollY2, 0, i9 - scrollY2, null, i10, iArr);
    }

    public final void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f14558r) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.f14547g = (int) motionEvent.getY(i9);
            this.f14558r = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.f14552l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean F(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.v(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f14544d
            r8 = 0
            int r9 = r12.getScrollRange()
            r10 = 0
            r11 = 0
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r10
            r17 = r11
            r18 = r8
            r19 = r9
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.F(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean G(int i9) {
        boolean z9 = i9 == 130;
        int height = getHeight();
        if (z9) {
            this.f14543c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f14543c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f14543c.top = getScrollY() - height;
            Rect rect2 = this.f14543c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f14543c;
        int i10 = rect3.top;
        int i11 = height + i10;
        rect3.bottom = i11;
        return K(i9, i10, i11);
    }

    public final void H() {
        VelocityTracker velocityTracker = this.f14552l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14552l = null;
        }
    }

    public final int I(int i9, float f9) {
        float fD;
        EdgeEffect edgeEffect;
        float width = f9 / getWidth();
        float height = i9 / getHeight();
        float f10 = 0.0f;
        if (T.d.b(this.f14545e) != 0.0f) {
            fD = -T.d.d(this.f14545e, -height, width);
            if (T.d.b(this.f14545e) == 0.0f) {
                edgeEffect = this.f14545e;
                edgeEffect.onRelease();
            }
            f10 = fD;
        } else if (T.d.b(this.f14546f) != 0.0f) {
            fD = T.d.d(this.f14546f, height, 1.0f - width);
            if (T.d.b(this.f14546f) == 0.0f) {
                edgeEffect = this.f14546f;
                edgeEffect.onRelease();
            }
            f10 = fD;
        }
        int iRound = Math.round(f10 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    public final void J(boolean z9) {
        if (z9) {
            R(2, 1);
        } else {
            T(1);
        }
        this.f14562v = getScrollY();
        L.j0(this);
    }

    public final boolean K(int i9, int i10, int i11) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z9 = false;
        boolean z10 = i9 == 33;
        View viewS = s(z10, i10, i11);
        if (viewS == null) {
            viewS = this;
        }
        if (i10 < scrollY || i11 > i12) {
            l(z10 ? i10 - scrollY : i11 - i12);
            z9 = true;
        }
        if (viewS != findFocus()) {
            viewS.requestFocus(i9);
        }
        return z9;
    }

    public final void L(View view) {
        view.getDrawingRect(this.f14543c);
        offsetDescendantRectToMyCoords(view, this.f14543c);
        int iF = f(this.f14543c);
        if (iF != 0) {
            scrollBy(0, iF);
        }
    }

    public final boolean M(Rect rect, boolean z9) {
        int iF = f(rect);
        boolean z10 = iF != 0;
        if (z10) {
            if (z9) {
                scrollBy(0, iF);
            } else {
                N(0, iF);
            }
        }
        return z10;
    }

    public final void N(int i9, int i10) {
        O(i9, i10, 250, false);
    }

    public final void O(int i9, int i10, int i11, boolean z9) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f14542a > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f14544d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, i11);
            J(z9);
        } else {
            if (!this.f14544d.isFinished()) {
                a();
            }
            scrollBy(i9, i10);
        }
        this.f14542a = AnimationUtils.currentAnimationTimeMillis();
    }

    public void P(int i9, int i10, int i11, boolean z9) {
        O(i9 - getScrollX(), i10 - getScrollY(), i11, z9);
    }

    public void Q(int i9, int i10, boolean z9) {
        P(i9, i10, 250, z9);
    }

    public boolean R(int i9, int i10) {
        return this.f14565y.p(i9, i10);
    }

    public final boolean S(MotionEvent motionEvent) {
        boolean z9;
        if (T.d.b(this.f14545e) != 0.0f) {
            T.d.d(this.f14545e, 0.0f, motionEvent.getX() / getWidth());
            z9 = true;
        } else {
            z9 = false;
        }
        if (T.d.b(this.f14546f) == 0.0f) {
            return z9;
        }
        T.d.d(this.f14546f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void T(int i9) {
        this.f14565y.r(i9);
    }

    public final void a() {
        this.f14544d.abortAnimation();
        T(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i9);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i9, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i9) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i9);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !C(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i9 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i9 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i9 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            l(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f14543c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f14543c);
            l(f(this.f14543c));
            viewFindNextFocus.requestFocus(i9);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !A(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f14544d.isFinished()) {
            return;
        }
        this.f14544d.computeScrollOffset();
        int currY = this.f14544d.getCurrY();
        int i9 = currY - this.f14562v;
        this.f14562v = currY;
        int[] iArr = this.f14560t;
        iArr[1] = 0;
        g(0, i9, iArr, null, 1);
        int i10 = i9 - this.f14560t[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            F(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f14560t;
            iArr2[1] = 0;
            h(0, scrollY2, 0, i11, this.f14559s, 1, iArr2);
            i10 = i11 - this.f14560t[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i10 < 0) {
                    if (this.f14545e.isFinished()) {
                        edgeEffect = this.f14545e;
                        edgeEffect.onAbsorb((int) this.f14544d.getCurrVelocity());
                    }
                } else if (this.f14546f.isFinished()) {
                    edgeEffect = this.f14546f;
                    edgeEffect.onAbsorb((int) this.f14544d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f14544d.isFinished()) {
            T(1);
        } else {
            L.j0(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public final boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f9, float f10, boolean z9) {
        return this.f14565y.a(f9, f10, z9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f14565y.b(f9, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return g(i9, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return this.f14565y.f(i9, i10, i11, i12, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f14545e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f14545e.setSize(width, height);
            if (this.f14545e.draw(canvas)) {
                L.j0(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f14546f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f14546f.setSize(width2, height2);
        if (this.f14546f.draw(canvas)) {
            L.j0(this);
        }
        canvas.restoreToCount(iSave2);
    }

    public int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i9 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i9 - verticalFadingEdgeLength : i9;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i9);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public boolean g(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.f14565y.d(i9, i10, iArr, iArr2, i11);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f14564x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public void h(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        this.f14565y.e(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return v(0);
    }

    @Override // P.B
    public void i(View view, View view2, int i9, int i10) {
        this.f14564x.c(view, view2, i9, i10);
        R(2, i10);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f14565y.l();
    }

    @Override // P.B
    public void j(View view, int i9) {
        this.f14564x.d(view, i9);
        T(i9);
    }

    @Override // P.B
    public void k(View view, int i9, int i10, int[] iArr, int i11) {
        g(i9, i10, iArr, null, i11);
    }

    public final void l(int i9) {
        if (i9 != 0) {
            if (this.f14554n) {
                N(0, i9);
            } else {
                scrollBy(0, i9);
            }
        }
    }

    @Override // P.C
    public void m(View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        D(i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i9, int i10) {
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // P.B
    public void n(View view, int i9, int i10, int i11, int i12, int i13) {
        D(i12, i13, null);
    }

    @Override // P.B
    public boolean o(View view, View view2, int i9, int i10) {
        return (i9 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14549i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L9b
            boolean r0 = r8.f14551k
            if (r0 != 0) goto L9b
            r0 = 2
            boolean r0 = P.AbstractC0982y.b(r9, r0)
            r1 = 0
            if (r0 == 0) goto L1c
            r0 = 9
        L17:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L1c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = P.AbstractC0982y.b(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
            goto L17
        L27:
            r0 = 0
        L28:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L9b
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L67
            boolean r1 = r8.c()
            if (r1 == 0) goto L8f
            boolean r9 = P.AbstractC0982y.b(r9, r5)
            if (r9 != 0) goto L8f
            android.widget.EdgeEffect r9 = r8.f14545e
            float r0 = (float) r0
            float r0 = -r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            T.d.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f14545e
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L90
        L67:
            if (r0 <= r1) goto L8e
            boolean r7 = r8.c()
            if (r7 == 0) goto L8b
            boolean r9 = P.AbstractC0982y.b(r9, r5)
            if (r9 != 0) goto L8b
            android.widget.EdgeEffect r9 = r8.f14546f
            int r0 = r0 - r1
            float r0 = (float) r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            T.d.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f14546f
            r9.onRelease()
            r8.invalidate()
            r2 = 1
        L8b:
            r9 = r2
            r2 = r1
            goto L90
        L8e:
            r2 = r0
        L8f:
            r9 = 0
        L90:
            if (r2 == r3) goto L9a
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r6
        L9a:
            return r9
        L9b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        int measuredHeight = 0;
        this.f14548h = false;
        View view = this.f14550j;
        if (view != null && B(view, this)) {
            L(this.f14550j);
        }
        this.f14550j = null;
        if (!this.f14549i) {
            if (this.f14563w != null) {
                scrollTo(getScrollX(), this.f14563w.f14567a);
                this.f14563w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iE = e(scrollY, paddingTop, measuredHeight);
            if (iE != scrollY) {
                scrollTo(getScrollX(), iE);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f14549i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f14553m && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f9, float f10, boolean z9) {
        if (z9) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        t((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f9, float f10) {
        return dispatchNestedPreFling(f9, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        k(view, i9, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        D(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i9) {
        i(view, view2, i9, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i9, int i10, boolean z9, boolean z10) {
        super.scrollTo(i9, i10);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (i9 == 2) {
            i9 = 130;
        } else if (i9 == 1) {
            i9 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i9) : focusFinder.findNextFocusFromRect(this, rect, i9);
        if (viewFindNextFocus == null || A(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i9, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f14563w = dVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f14567a = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        c cVar = this.f14541A;
        if (cVar != null) {
            cVar.a(this, i9, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !C(viewFindFocus, 0, i12)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f14543c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f14543c);
        l(f(this.f14543c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i9) {
        return o(view, view2, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i9) {
        EdgeEffect edgeEffect;
        if (T.d.b(this.f14545e) != 0.0f) {
            edgeEffect = this.f14545e;
        } else {
            if (T.d.b(this.f14546f) == 0.0f) {
                return false;
            }
            edgeEffect = this.f14546f;
            i9 = -i9;
        }
        edgeEffect.onAbsorb(i9);
        return true;
    }

    public final void q() {
        this.f14551k = false;
        H();
        T(0);
        this.f14545e.onRelease();
        this.f14546f.onRelease();
    }

    public boolean r(KeyEvent keyEvent) {
        this.f14543c.setEmpty();
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : u(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : u(130);
        }
        if (keyCode != 62) {
            return false;
        }
        G(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f14548h) {
            this.f14550j = view2;
        } else {
            L(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        if (z9) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f14548h = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View s(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(boolean, int, int):android.view.View");
    }

    @Override // android.view.View
    public void scrollTo(int i9, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iE = e(i9, width, width2);
            int iE2 = e(i10, height, height2);
            if (iE == getScrollX() && iE2 == getScrollY()) {
                return;
            }
            super.scrollTo(iE, iE2);
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.f14553m) {
            this.f14553m = z9;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        this.f14565y.m(z9);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.f14541A = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.f14554n = z9;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i9) {
        return R(i9, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        T(0);
    }

    public void t(int i9) {
        if (getChildCount() > 0) {
            this.f14544d.fling(getScrollX(), getScrollY(), 0, i9, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, 0, 0);
            J(true);
        }
    }

    public boolean u(int i9) {
        int childCount;
        boolean z9 = i9 == 130;
        int height = getHeight();
        Rect rect = this.f14543c;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f14543c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f14543c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f14543c;
        return K(i9, rect3.top, rect3.bottom);
    }

    public boolean v(int i9) {
        return this.f14565y.k(i9);
    }

    public final boolean w(int i9, int i10) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i10 >= childAt.getTop() - scrollY && i10 < childAt.getBottom() - scrollY && i9 >= childAt.getLeft() && i9 < childAt.getRight();
    }

    public final void x() {
        VelocityTracker velocityTracker = this.f14552l;
        if (velocityTracker == null) {
            this.f14552l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void y() {
        this.f14544d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f14555o = viewConfiguration.getScaledTouchSlop();
        this.f14556p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f14557q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void z() {
        if (this.f14552l == null) {
            this.f14552l = VelocityTracker.obtain();
        }
    }
}
