package com.google.android.material.appbar;

import P.C0959a;
import P.E;
import P.InterfaceC0983z;
import P.L;
import P.X;
import Q.C;
import Q.F;
import R4.g;
import R4.k;
import R4.l;
import T4.f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.AbstractC1617D;
import e.AbstractC1726a;
import f5.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.C2198g;
import l5.h;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26949u = k.f8851e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26950a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public X f26956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f26957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WeakReference f26963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f26964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f26965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f26966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f26967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Behavior f26968t;

    public static class BaseBehavior<T extends AppBarLayout> extends T4.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26969k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26970l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ValueAnimator f26971m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public e f26972n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public WeakReference f26973o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f26974p;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f26975a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f26976c;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f26975a = coordinatorLayout;
                this.f26976c = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f26975a, this.f26976c, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public class b extends C0959a {
            public b() {
            }

            @Override // P.C0959a
            public void g(View view, C c9) {
                super.g(view, c9);
                c9.q0(BaseBehavior.this.f26974p);
                c9.X(ScrollView.class.getName());
            }
        }

        public class c implements F {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f26979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f26980b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f26981c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f26982d;

            public c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9) {
                this.f26979a = coordinatorLayout;
                this.f26980b = appBarLayout;
                this.f26981c = view;
                this.f26982d = i9;
            }

            @Override // Q.F
            public boolean a(View view, F.a aVar) {
                BaseBehavior.this.q(this.f26979a, this.f26980b, this.f26981c, 0, this.f26982d, new int[]{0, 0}, 1);
                return true;
            }
        }

        public class d implements F {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppBarLayout f26984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f26985b;

            public d(AppBarLayout appBarLayout, boolean z9) {
                this.f26984a = appBarLayout;
                this.f26985b = z9;
            }

            @Override // Q.F
            public boolean a(View view, F.a aVar) {
                this.f26984a.setExpanded(this.f26985b);
                return true;
            }
        }

        public static class e extends V.a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f26987d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f26988e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f26989f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public float f26990g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f26991h;

            public class a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public e[] newArray(int i9) {
                    return new e[i9];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f26987d = parcel.readByte() != 0;
                this.f26988e = parcel.readByte() != 0;
                this.f26989f = parcel.readInt();
                this.f26990g = parcel.readFloat();
                this.f26991h = parcel.readByte() != 0;
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // V.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i9) {
                super.writeToParcel(parcel, i9);
                parcel.writeByte(this.f26987d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f26988e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f26989f);
                parcel.writeFloat(this.f26990g);
                parcel.writeByte(this.f26991h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean a0(int i9, int i10) {
            return (i9 & i10) == i10;
        }

        public static View d0(AppBarLayout appBarLayout, int i9) {
            int iAbs = Math.abs(i9);
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // T4.b
        public int M() {
            return E() + this.f26969k;
        }

        public final boolean T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z9 = false;
            if (M() != (-appBarLayout.getTotalScrollRange())) {
                U(coordinatorLayout, appBarLayout, C.a.f7412q, false);
                z9 = true;
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    U(coordinatorLayout, appBarLayout, C.a.f7413r, true);
                    return true;
                }
                int i9 = -appBarLayout.getDownNestedPreScrollRange();
                if (i9 != 0) {
                    L.o0(coordinatorLayout, C.a.f7413r, null, new c(coordinatorLayout, appBarLayout, view, i9));
                    return true;
                }
            }
            return z9;
        }

        public final void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C.a aVar, boolean z9) {
            L.o0(coordinatorLayout, aVar, null, new d(appBarLayout, z9));
        }

        public final void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9, float f9) {
            int iAbs = Math.abs(M() - i9);
            float fAbs = Math.abs(f9);
            W(coordinatorLayout, appBarLayout, i9, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        public final void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9, int i10) {
            int iM = M();
            if (iM == i9) {
                ValueAnimator valueAnimator = this.f26971m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f26971m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f26971m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f26971m = valueAnimator3;
                valueAnimator3.setInterpolator(S4.a.f9413e);
                this.f26971m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f26971m.setDuration(Math.min(i10, 600));
            this.f26971m.setIntValues(iM, i9);
            this.f26971m.start();
        }

        public final int X(int i9, int i10, int i11) {
            return i9 < (i10 + i11) / 2 ? i10 : i11;
        }

        @Override // T4.b
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f26973o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.j() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        public final boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                if (((e) appBarLayout.getChildAt(i9).getLayoutParams()).f26997a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                if ((childAt instanceof InterfaceC0983z) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int e0(AppBarLayout appBarLayout, int i9) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (a0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i11 = -i9;
                if (top <= i11 && bottom >= i11) {
                    return i10;
                }
            }
            return -1;
        }

        public final View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = coordinatorLayout.getChildAt(i9);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // T4.b
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        @Override // T4.b
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public final int i0(AppBarLayout appBarLayout, int i9) {
            int iAbs = Math.abs(i9);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i10);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i10++;
                } else if (interpolatorD != null) {
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= L.F(childAt);
                        }
                    }
                    if (L.B(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f9 = topInset;
                        return Integer.signum(i9) * (childAt.getTop() + Math.round(f9 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f9)));
                    }
                }
            }
            return i9;
        }

        @Override // T4.b
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(c0(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        @Override // T4.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r8, com.google.android.material.appbar.AppBarLayout r9, int r10) {
            /*
                r7 = this;
                boolean r10 = super.l(r8, r9, r10)
                int r0 = r9.getPendingAction()
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$e r1 = r7.f26972n
                r2 = 0
                if (r1 == 0) goto L56
                r3 = r0 & 8
                if (r3 != 0) goto L56
                boolean r0 = r1.f26987d
                if (r0 == 0) goto L1e
                int r0 = r9.getTotalScrollRange()
                int r0 = -r0
            L1a:
                r7.P(r8, r9, r0)
                goto L78
            L1e:
                boolean r0 = r1.f26988e
                if (r0 == 0) goto L26
            L22:
                r7.P(r8, r9, r2)
                goto L78
            L26:
                int r0 = r1.f26989f
                android.view.View r0 = r9.getChildAt(r0)
                int r1 = r0.getBottom()
                int r1 = -r1
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$e r3 = r7.f26972n
                boolean r3 = r3.f26991h
                if (r3 == 0) goto L42
                int r0 = P.L.F(r0)
                int r3 = r9.getTopInset()
                int r0 = r0 + r3
            L40:
                int r1 = r1 + r0
                goto L52
            L42:
                int r0 = r0.getHeight()
                float r0 = (float) r0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$e r3 = r7.f26972n
                float r3 = r3.f26990g
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                goto L40
            L52:
                r7.P(r8, r9, r1)
                goto L78
            L56:
                if (r0 == 0) goto L78
                r1 = r0 & 4
                r3 = 1
                if (r1 == 0) goto L5f
                r1 = 1
                goto L60
            L5f:
                r1 = 0
            L60:
                r4 = r0 & 2
                r5 = 0
                if (r4 == 0) goto L70
                int r0 = r9.getUpNestedPreScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L1a
                r7.V(r8, r9, r0, r5)
                goto L78
            L70:
                r0 = r0 & r3
                if (r0 == 0) goto L78
                if (r1 == 0) goto L22
                r7.V(r8, r9, r2, r5)
            L78:
                r9.o()
                r0 = 0
                r7.f26972n = r0
                int r0 = r7.E()
                int r1 = r9.getTotalScrollRange()
                int r1 = -r1
                int r0 = J.a.b(r0, r1, r2)
                r7.G(r0)
                int r4 = r7.E()
                r5 = 0
                r6 = 1
                r1 = r7
                r2 = r8
                r3 = r9
                r1.y0(r2, r3, r4, r5, r6)
                int r0 = r7.E()
                r9.m(r0)
                r7.x0(r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int):boolean");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9, int i10, int i11, int i12) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i9, i10, i11, i12);
            }
            coordinatorLayout.K(appBarLayout, i9, i10, View.MeasureSpec.makeMeasureSpec(0, 0), i12);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9, int i10, int[] iArr, int i11) {
            int i12;
            int downNestedPreScrollRange;
            if (i10 != 0) {
                if (i10 < 0) {
                    int i13 = -appBarLayout.getTotalScrollRange();
                    i12 = i13;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i12 != downNestedPreScrollRange) {
                    iArr[1] = O(coordinatorLayout, appBarLayout, i10, i12, downNestedPreScrollRange);
                }
            }
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
            if (i12 < 0) {
                iArr[1] = O(coordinatorLayout, appBarLayout, i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                x0(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof e) {
                s0((e) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f26972n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f26972n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            e eVarT0 = t0(parcelableY, appBarLayout);
            return eVarT0 == null ? parcelableY : eVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i9, int i10) {
            ValueAnimator valueAnimator;
            boolean z9 = (i9 & 2) != 0 && (appBarLayout.l() || Z(coordinatorLayout, appBarLayout, view));
            if (z9 && (valueAnimator = this.f26971m) != null) {
                valueAnimator.cancel();
            }
            this.f26973o = null;
            this.f26970l = i10;
            return z9;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9) {
            if (this.f26970l == 0 || i9 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
            this.f26973o = new WeakReference(view);
        }

        public void s0(e eVar, boolean z9) {
            if (this.f26972n == null || z9) {
                this.f26972n = eVar;
            }
        }

        public e t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = appBarLayout.getChildAt(i9);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = V.a.f9836c;
                    }
                    e eVar = new e(parcelable);
                    boolean z9 = iE == 0;
                    eVar.f26988e = z9;
                    eVar.f26987d = !z9 && (-iE) >= appBarLayout.getTotalScrollRange();
                    eVar.f26989f = i9;
                    eVar.f26991h = bottom == L.F(childAt) + appBarLayout.getTopInset();
                    eVar.f26990g = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        @Override // T4.b
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9, int i10, int i11) {
            int iM = M();
            int i12 = 0;
            if (i10 == 0 || iM < i10 || iM > i11) {
                this.f26969k = 0;
            } else {
                int iB = J.a.b(i9, i10, i11);
                if (iM != iB) {
                    int iI0 = appBarLayout.h() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i13 = iM - iB;
                    this.f26969k = iB - iI0;
                    if (zG) {
                        while (i12 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i12).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(appBarLayout, appBarLayout.getChildAt(i12), E());
                            }
                            i12++;
                        }
                    }
                    if (!zG && appBarLayout.h()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.m(E());
                    y0(coordinatorLayout, appBarLayout, iB, iB < iM ? -1 : 1, false);
                    i12 = i13;
                }
            }
            x0(coordinatorLayout, appBarLayout);
            return i12;
        }

        public final boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listT = coordinatorLayout.t(appBarLayout);
            int size = listT.size();
            for (int i9 = 0; i9 < size; i9++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) ((View) listT.get(i9)).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).K() != 0;
                }
            }
            return false;
        }

        public final void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iF = -childAt.getBottom();
                    if (iE0 == 0 && L.B(appBarLayout) && L.B(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iF += L.F(childAt);
                    } else if (a0(iC, 5)) {
                        int iF2 = L.F(childAt) + iF;
                        if (iM < iF2) {
                            topInset2 = iF2;
                        } else {
                            iF = iF2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iF -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, J.a.b(X(iM, iF, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View viewF0;
            L.m0(coordinatorLayout, C.a.f7412q.b());
            L.m0(coordinatorLayout, C.a.f7413r.b());
            if (appBarLayout.getTotalScrollRange() == 0 || (viewF0 = f0(coordinatorLayout)) == null || !b0(appBarLayout)) {
                return;
            }
            if (!L.Q(coordinatorLayout)) {
                L.s0(coordinatorLayout, new b());
            }
            this.f26974p = T(coordinatorLayout, appBarLayout, viewF0);
        }

        public final void y0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9, int i10, boolean z9) {
            View viewD0 = d0(appBarLayout, i9);
            boolean zV = false;
            if (viewD0 != null) {
                int iC = ((e) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iF = L.F(viewD0);
                    if (i10 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i9) < (viewD0.getBottom() - iF) - appBarLayout.getTopInset()) : (-i9) >= (viewD0.getBottom() - iF) - appBarLayout.getTopInset()) {
                        zV = true;
                    }
                }
            }
            if (appBarLayout.l()) {
                zV = appBarLayout.v(c0(coordinatorLayout));
            }
            boolean zS = appBarLayout.s(zV);
            if (z9 || (zS && v0(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // T4.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // T4.d
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // T4.d
        public /* bridge */ /* synthetic */ boolean G(int i9) {
            return super.G(i9);
        }

        @Override // T4.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9) {
            return super.l(coordinatorLayout, appBarLayout, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i9, int i10, int i11, int i12) {
            return super.m(coordinatorLayout, appBarLayout, i9, i10, i11, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9, int i10, int[] iArr, int i11) {
            super.q(coordinatorLayout, appBarLayout, view, i9, i10, iArr, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i9, i10, i11, i12, i13, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i9, int i10) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i9, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i9) {
            super.C(coordinatorLayout, appBarLayout, view, i9);
        }
    }

    public static class ScrollingViewBehavior extends T4.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f8892C4);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f8900D4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        public static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).M();
            }
            return 0;
        }

        @Override // T4.c
        public float J(View view) {
            int i9;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i9 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i9) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // T4.c
        public int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        @Override // T4.c
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) list.get(i9);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void S(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                L.d0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f26969k) + M()) - I(view2));
            }
        }

        public final void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                L.m0(coordinatorLayout, C.a.f7412q.b());
                L.m0(coordinatorLayout, C.a.f7413r.b());
                L.s0(coordinatorLayout, null);
            }
        }

        @Override // T4.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
            return super.l(coordinatorLayout, view, i9);
        }

        @Override // T4.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int i12) {
            return super.m(coordinatorLayout, view, i9, i10, i11, i12);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.s(view));
            if (appBarLayoutH != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f9530d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutH.p(false, !z9);
                    return true;
                }
            }
            return false;
        }
    }

    public class a implements E {
        public a() {
        }

        @Override // P.E
        public X a(View view, X x9) {
            return AppBarLayout.this.n(x9);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2198g f26993a;

        public b(C2198g c2198g) {
            this.f26993a = c2198g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f26993a.V(fFloatValue);
            if (AppBarLayout.this.f26967s instanceof C2198g) {
                ((C2198g) AppBarLayout.this.f26967s).V(fFloatValue);
            }
            Iterator it = AppBarLayout.this.f26965q.iterator();
            if (it.hasNext()) {
                AbstractC1617D.a(it.next());
                this.f26993a.z();
                throw null;
            }
        }
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f9);
    }

    public static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f26995a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f26996b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f9) {
            b(this.f26995a, appBarLayout, view);
            float fAbs = this.f26995a.top - Math.abs(f9);
            if (fAbs > 0.0f) {
                L.z0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fA = 1.0f - J.a.a(Math.abs(fAbs / this.f26995a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f26995a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f26996b);
            this.f26996b.offset(0, (int) (-fHeight));
            L.z0(view, this.f26996b);
        }
    }

    public static class e extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f26998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Interpolator f26999c;

        public e(int i9, int i10) {
            super(i9, i10);
            this.f26997a = 1;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26997a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f9259u);
            this.f26997a = typedArrayObtainStyledAttributes.getInt(l.f9277w, 0);
            f(a(typedArrayObtainStyledAttributes.getInt(l.f9268v, 0)));
            if (typedArrayObtainStyledAttributes.hasValue(l.f9286x)) {
                this.f26999c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(l.f9286x, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f26997a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f26997a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f26997a = 1;
        }

        public final c a(int i9) {
            if (i9 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f26998b;
        }

        public int c() {
            return this.f26997a;
        }

        public Interpolator d() {
            return this.f26999c;
        }

        public boolean e() {
            int i9 = this.f26997a;
            return (i9 & 1) == 1 && (i9 & 10) != 0;
        }

        public void f(c cVar) {
            this.f26998b = cVar;
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8666a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f26949u;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        this.f26951c = -1;
        this.f26952d = -1;
        this.f26953e = -1;
        this.f26955g = 0;
        this.f26965q = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            f.a(this);
        }
        f.c(this, attributeSet, i9, i10);
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f9169k, i9, i10, new int[0]);
        L.w0(this, typedArrayH.getDrawable(l.f9178l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C2198g c2198g = new C2198g();
            c2198g.W(ColorStateList.valueOf(colorDrawable.getColor()));
            c2198g.L(context2);
            L.w0(this, c2198g);
        }
        if (typedArrayH.hasValue(l.f9214p)) {
            q(typedArrayH.getBoolean(l.f9214p, false), false, false);
        }
        if (typedArrayH.hasValue(l.f9205o)) {
            f.b(this, typedArrayH.getDimensionPixelSize(l.f9205o, 0));
        }
        if (i11 >= 26) {
            if (typedArrayH.hasValue(l.f9196n)) {
                setKeyboardNavigationCluster(typedArrayH.getBoolean(l.f9196n, false));
            }
            if (typedArrayH.hasValue(l.f9187m)) {
                setTouchscreenBlocksFocus(typedArrayH.getBoolean(l.f9187m, false));
            }
        }
        this.f26961m = typedArrayH.getBoolean(l.f9223q, false);
        this.f26962n = typedArrayH.getResourceId(l.f9232r, -1);
        setStatusBarForeground(typedArrayH.getDrawable(l.f9241s));
        typedArrayH.recycle();
        L.E0(this, new a());
    }

    public final void c() {
        WeakReference weakReference = this.f26963o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26963o = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final View d(View view) {
        int i9;
        if (this.f26963o == null && (i9 = this.f26962n) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i9) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f26962n);
            }
            if (viewFindViewById != null) {
                this.f26963o = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f26963o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f26950a);
            this.f26967s.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f26967s;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f26968t = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int iF;
        int i9 = this.f26952d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i11 = eVar.f26997a;
            if ((i11 & 5) != 5) {
                if (i10 > 0) {
                    break;
                }
            } else {
                int i12 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if ((i11 & 8) != 0) {
                    iF = L.F(childAt);
                } else if ((i11 & 2) != 0) {
                    iF = measuredHeight - L.F(childAt);
                } else {
                    iMin = i12 + measuredHeight;
                    if (childCount == 0 && L.B(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i10 += iMin;
                }
                iMin = i12 + iF;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i10 += iMin;
            }
        }
        int iMax = Math.max(0, i10);
        this.f26952d = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i9 = this.f26953e;
        if (i9 != -1) {
            return i9;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int iF = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            int i11 = eVar.f26997a;
            if ((i11 & 1) == 0) {
                break;
            }
            iF += measuredHeight;
            if ((i11 & 2) != 0) {
                iF -= L.F(childAt);
                break;
            }
            i10++;
        }
        int iMax = Math.max(0, iF);
        this.f26953e = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f26962n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iF = L.F(this);
        if (iF == 0) {
            int childCount = getChildCount();
            iF = childCount >= 1 ? L.F(getChildAt(childCount - 1)) : 0;
            if (iF == 0) {
                return getHeight() / 3;
            }
        }
        return (iF * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f26955g;
    }

    public Drawable getStatusBarForeground() {
        return this.f26967s;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        X x9 = this.f26956h;
        if (x9 != null) {
            return x9.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i9 = this.f26951c;
        if (i9 != -1) {
            return i9;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int iF = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i11 = eVar.f26997a;
            if ((i11 & 1) == 0) {
                break;
            }
            iF += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            if (i10 == 0 && L.B(childAt)) {
                iF -= getTopInset();
            }
            if ((i11 & 2) != 0) {
                iF -= L.F(childAt);
                break;
            }
            i10++;
        }
        int iMax = Math.max(0, iF);
        this.f26951c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean h() {
        return this.f26954f;
    }

    public final boolean i() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (((e) getChildAt(i9).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return getTotalScrollRange() != 0;
    }

    public final void k() {
        Behavior behavior = this.f26968t;
        BaseBehavior.e eVarT0 = (behavior == null || this.f26951c == -1 || this.f26955g != 0) ? null : behavior.t0(V.a.f9836c, this);
        this.f26951c = -1;
        this.f26952d = -1;
        this.f26953e = -1;
        if (eVarT0 != null) {
            this.f26968t.s0(eVarT0, false);
        }
    }

    public boolean l() {
        return this.f26961m;
    }

    public void m(int i9) {
        this.f26950a = i9;
        if (!willNotDraw()) {
            L.j0(this);
        }
        List list = this.f26957i;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1617D.a(this.f26957i.get(i10));
            }
        }
    }

    public X n(X x9) {
        X x10 = L.B(this) ? x9 : null;
        if (!O.c.a(this.f26956h, x10)) {
            this.f26956h = x10;
            y();
            requestLayout();
        }
        return x9;
    }

    public void o() {
        this.f26955g = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i9) {
        if (this.f26966r == null) {
            this.f26966r = new int[4];
        }
        int[] iArr = this.f26966r;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i9 + iArr.length);
        boolean z9 = this.f26959k;
        int i10 = R4.b.f8659E;
        if (!z9) {
            i10 = -i10;
        }
        iArr[0] = i10;
        iArr[1] = (z9 && this.f26960l) ? R4.b.f8660F : -R4.b.f8660F;
        int i11 = R4.b.f8658D;
        if (!z9) {
            i11 = -i11;
        }
        iArr[2] = i11;
        iArr[3] = (z9 && this.f26960l) ? R4.b.f8657C : -R4.b.f8657C;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        boolean z10 = true;
        if (L.B(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                L.d0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f26954f = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i13).getLayoutParams()).d() != null) {
                this.f26954f = true;
                break;
            }
            i13++;
        }
        Drawable drawable = this.f26967s;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f26958j) {
            return;
        }
        if (!this.f26961m && !i()) {
            z10 = false;
        }
        r(z10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824 && L.B(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = J.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i10));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z9, boolean z10) {
        q(z9, z10, true);
    }

    public final void q(boolean z9, boolean z10, boolean z11) {
        this.f26955g = (z9 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    public final boolean r(boolean z9) {
        if (this.f26959k == z9) {
            return false;
        }
        this.f26959k = z9;
        refreshDrawableState();
        return true;
    }

    public boolean s(boolean z9) {
        return t(z9, !this.f26958j);
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        h.d(this, f9);
    }

    public void setExpanded(boolean z9) {
        p(z9, L.W(this));
    }

    public void setLiftOnScroll(boolean z9) {
        this.f26961m = z9;
    }

    public void setLiftOnScrollTargetViewId(int i9) {
        this.f26962n = i9;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f26958j = z9;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i9) {
        if (i9 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i9);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f26967s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f26967s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f26967s.setState(getDrawableState());
                }
                H.a.m(this.f26967s, L.E(this));
                this.f26967s.setVisible(getVisibility() == 0, false);
                this.f26967s.setCallback(this);
            }
            y();
            L.j0(this);
        }
    }

    public void setStatusBarForegroundColor(int i9) {
        setStatusBarForeground(new ColorDrawable(i9));
    }

    public void setStatusBarForegroundResource(int i9) {
        setStatusBarForeground(AbstractC1726a.b(getContext(), i9));
    }

    @Deprecated
    public void setTargetElevation(float f9) {
        f.b(this, f9);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        boolean z9 = i9 == 0;
        Drawable drawable = this.f26967s;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    public boolean t(boolean z9, boolean z10) {
        if (!z10 || this.f26960l == z9) {
            return false;
        }
        this.f26960l = z9;
        refreshDrawableState();
        if (!this.f26961m || !(getBackground() instanceof C2198g)) {
            return true;
        }
        x((C2198g) getBackground(), z9);
        return true;
    }

    public final boolean u() {
        return this.f26967s != null && getTopInset() > 0;
    }

    public boolean v(View view) {
        View viewD = d(view);
        if (viewD != null) {
            view = viewD;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f26967s;
    }

    public final boolean w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || L.B(childAt)) ? false : true;
    }

    public final void x(C2198g c2198g, boolean z9) {
        float dimension = getResources().getDimension(R4.d.f8728a);
        float f9 = z9 ? 0.0f : dimension;
        if (!z9) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f26964p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f9, dimension);
        this.f26964p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(g.f8803a));
        this.f26964p.setInterpolator(S4.a.f9409a);
        this.f26964p.addUpdateListener(new b(c2198g));
        this.f26964p.start();
    }

    public final void y() {
        setWillNotDraw(!u());
    }
}
