package com.google.android.material.tabs;

import P.AbstractC0976s;
import P.I;
import P.L;
import Q.C;
import R4.k;
import R4.l;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.a;
import e.AbstractC1726a;
import f5.u;
import f5.w;
import i5.AbstractC1893c;
import j5.AbstractC2100b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k.g0;
import l5.C2198g;
import n5.C2294a;
import n5.C2295b;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f27503S = k.f8854h;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final O.e f27504T = new O.g(16);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f27505A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f27506B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f27507C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f27508D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f27509E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f27510F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public com.google.android.material.tabs.a f27511G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public c f27512H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ArrayList f27513I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public c f27514J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ValueAnimator f27515K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ViewPager f27516L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public N0.a f27517M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public DataSetObserver f27518N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public h f27519O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public b f27520P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f27521Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final O.e f27522R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27523a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f27524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f27525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f27531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f27532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f27533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f27534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f27536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f27541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f27542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f27543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f27545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f27546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f27547z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27549a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, N0.a aVar, N0.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f27516L == viewPager) {
                tabLayout.H(aVar2, this.f27549a);
            }
        }

        public void b(boolean z9) {
            this.f27549a = z9;
        }
    }

    public interface c {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);
    }

    public interface d extends c {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.A();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.A();
        }
    }

    public class f extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ValueAnimator f27552a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f27554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27555e;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f27557a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f27558c;

            public a(View view, View view2) {
                this.f27557a = view;
                this.f27558c = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.h(this.f27557a, this.f27558c, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f27560a;

            public b(int i9) {
                this.f27560a = i9;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f27553c = this.f27560a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f27553c = this.f27560a;
            }
        }

        public f(Context context) {
            super(context);
            this.f27553c = -1;
            this.f27555e = -1;
            setWillNotDraw(false);
        }

        public void c(int i9, int i10) {
            ValueAnimator valueAnimator = this.f27552a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27552a.cancel();
            }
            i(true, i9, i10);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f27534m
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L16
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f27534m
                int r0 = r0.getIntrinsicHeight()
            L16:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.f27547z
                if (r1 == 0) goto L3c
                r2 = 1
                r3 = 2
                if (r1 == r2) goto L2d
                r2 = 0
                if (r1 == r3) goto L43
                r0 = 3
                if (r1 == r0) goto L28
                r0 = 0
                goto L43
            L28:
                int r0 = r5.getHeight()
                goto L43
            L2d:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L43
            L3c:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
                goto L28
            L43:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f27534m
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L9d
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f27534m
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r3 = r3.f27534m
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f27534m
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                r2 = 21
                if (r0 == 0) goto L8e
                android.graphics.drawable.Drawable r1 = H.a.r(r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 != r2) goto L84
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
                r1.setColorFilter(r0, r2)
                goto L9a
            L84:
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = com.google.android.material.tabs.TabLayout.b(r0)
                H.a.n(r1, r0)
                goto L9a
            L8e:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                if (r0 != r2) goto L97
                r1.setColorFilter(r3)
                goto L9a
            L97:
                H.a.o(r1, r3)
            L9a:
                r1.draw(r6)
            L9d:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.draw(android.graphics.Canvas):void");
        }

        public final void e() {
            View childAt = getChildAt(this.f27553c);
            com.google.android.material.tabs.a aVar = TabLayout.this.f27511G;
            TabLayout tabLayout = TabLayout.this;
            aVar.c(tabLayout, childAt, tabLayout.f27534m);
        }

        public void f(int i9, float f9) {
            ValueAnimator valueAnimator = this.f27552a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f27552a.cancel();
            }
            this.f27553c = i9;
            this.f27554d = f9;
            h(getChildAt(i9), getChildAt(this.f27553c + 1), this.f27554d);
        }

        public void g(int i9) {
            Rect bounds = TabLayout.this.f27534m.getBounds();
            TabLayout.this.f27534m.setBounds(bounds.left, 0, bounds.right, i9);
            requestLayout();
        }

        public final void h(View view, View view2, float f9) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f27534m;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f27534m.getBounds().bottom);
            } else {
                com.google.android.material.tabs.a aVar = TabLayout.this.f27511G;
                TabLayout tabLayout = TabLayout.this;
                aVar.d(tabLayout, view, view2, f9, tabLayout.f27534m);
            }
            L.j0(this);
        }

        public final void i(boolean z9, int i9, int i10) {
            View childAt = getChildAt(this.f27553c);
            View childAt2 = getChildAt(i9);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z9) {
                this.f27552a.removeAllUpdateListeners();
                this.f27552a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27552a = valueAnimator;
            valueAnimator.setInterpolator(S4.a.f9410b);
            valueAnimator.setDuration(i10);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i9));
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
            super.onLayout(z9, i9, i10, i11, i12);
            ValueAnimator valueAnimator = this.f27552a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.f27553c, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i9, int i10) {
            super.onMeasure(i9, i10);
            if (View.MeasureSpec.getMode(i9) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z9 = true;
            if (tabLayout.f27545x == 1 || tabLayout.f27505A == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) w.b(getContext(), 16)) * 2)) {
                    boolean z10 = false;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z10 = true;
                        }
                    }
                    z9 = z10;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f27545x = 0;
                    tabLayout2.O(false);
                }
                if (z9) {
                    super.onMeasure(i9, i10);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i9) {
            super.onRtlPropertiesChanged(i9);
            if (Build.VERSION.SDK_INT >= 23 || this.f27555e == i9) {
                return;
            }
            requestLayout();
            this.f27555e = i9;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f27562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f27563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f27564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f27565d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f27567f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TabLayout f27569h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public i f27570i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27566e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27568g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f27571j = -1;

        public View e() {
            return this.f27567f;
        }

        public Drawable f() {
            return this.f27563b;
        }

        public int g() {
            return this.f27566e;
        }

        public int h() {
            return this.f27568g;
        }

        public CharSequence i() {
            return this.f27564c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f27569h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f27566e;
        }

        public void k() {
            this.f27569h = null;
            this.f27570i = null;
            this.f27562a = null;
            this.f27563b = null;
            this.f27571j = -1;
            this.f27564c = null;
            this.f27565d = null;
            this.f27566e = -1;
            this.f27567f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f27569h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.F(this);
        }

        public g m(View view) {
            this.f27567f = view;
            p();
            return this;
        }

        public void n(int i9) {
            this.f27566e = i9;
        }

        public g o(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f27565d) && !TextUtils.isEmpty(charSequence)) {
                this.f27570i.setContentDescription(charSequence);
            }
            this.f27564c = charSequence;
            p();
            return this;
        }

        public void p() {
            i iVar = this.f27570i;
            if (iVar != null) {
                iVar.r();
            }
        }
    }

    public static class h implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f27572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27574c;

        public h(TabLayout tabLayout) {
            this.f27572a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i9, float f9, int i10) {
            TabLayout tabLayout = (TabLayout) this.f27572a.get();
            if (tabLayout != null) {
                int i11 = this.f27574c;
                tabLayout.J(i9, f9, i11 != 2 || this.f27573b == 1, (i11 == 2 && this.f27573b == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i9) {
            this.f27573b = this.f27574c;
            this.f27574c = i9;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i9) {
            TabLayout tabLayout = (TabLayout) this.f27572a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i9 || i9 >= tabLayout.getTabCount()) {
                return;
            }
            int i10 = this.f27574c;
            tabLayout.G(tabLayout.w(i9), i10 == 0 || (i10 == 2 && this.f27573b == 0));
        }

        public void d() {
            this.f27574c = 0;
            this.f27573b = 0;
        }
    }

    public final class i extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f27575a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f27576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f27577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f27578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public U4.a f27579f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f27580g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f27581h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImageView f27582i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f27583j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f27584k;

        public class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f27586a;

            public a(View view) {
                this.f27586a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                if (this.f27586a.getVisibility() == 0) {
                    i.this.q(this.f27586a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f27584k = 2;
            s(context);
            L.F0(this, TabLayout.this.f27526e, TabLayout.this.f27527f, TabLayout.this.f27528g, TabLayout.this.f27529h);
            setGravity(17);
            setOrientation(!TabLayout.this.f27506B ? 1 : 0);
            setClickable(true);
            L.G0(this, I.b(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
        }

        private U4.a getBadge() {
            return this.f27579f;
        }

        private U4.a getOrCreateBadge() {
            if (this.f27579f == null) {
                this.f27579f = U4.a.c(getContext());
            }
            p();
            U4.a aVar = this.f27579f;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f27583j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f27583j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final float e(Layout layout, int i9, float f9) {
            return layout.getLineWidth(i9) * (f9 / layout.getPaint().getTextSize());
        }

        public final void f(boolean z9) {
            setClipChildren(z9);
            setClipToPadding(z9);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z9);
                viewGroup.setClipToPadding(z9);
            }
        }

        public final FrameLayout g() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public int getContentHeight() {
            View[] viewArr = {this.f27576c, this.f27577d, this.f27580g};
            int iMax = 0;
            int iMin = 0;
            boolean z9 = false;
            for (int i9 = 0; i9 < 3; i9++) {
                View view = viewArr[i9];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z9 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z9 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z9 = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f27576c, this.f27577d, this.f27580g};
            int iMax = 0;
            int iMin = 0;
            boolean z9 = false;
            for (int i9 = 0; i9 < 3; i9++) {
                View view = viewArr[i9];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z9 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z9 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z9 = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f27575a;
        }

        public final void h(Canvas canvas) {
            Drawable drawable = this.f27583j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f27583j.draw(canvas);
            }
        }

        public final FrameLayout i(View view) {
            if ((view == this.f27577d || view == this.f27576c) && U4.d.f9807a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean j() {
            return this.f27579f != null;
        }

        public final void k() {
            ViewGroup viewGroup;
            if (U4.d.f9807a) {
                FrameLayout frameLayoutG = g();
                addView(frameLayoutG, 0);
                viewGroup = frameLayoutG;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R4.h.f8806a, viewGroup, false);
            this.f27577d = imageView;
            viewGroup.addView(imageView, 0);
        }

        public final void l() {
            ViewGroup viewGroup;
            if (U4.d.f9807a) {
                FrameLayout frameLayoutG = g();
                addView(frameLayoutG);
                viewGroup = frameLayoutG;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R4.h.f8807b, viewGroup, false);
            this.f27576c = textView;
            viewGroup.addView(textView);
        }

        public void m() {
            setTab(null);
            setSelected(false);
        }

        public final void n(View view) {
            if (j() && view != null) {
                f(false);
                U4.d.a(this.f27579f, view, i(view));
                this.f27578e = view;
            }
        }

        public final void o() {
            if (j()) {
                f(true);
                View view = this.f27578e;
                if (view != null) {
                    U4.d.b(this.f27579f, view);
                    this.f27578e = null;
                }
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            U4.a aVar = this.f27579f;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f27579f.f()));
            }
            C cY0 = C.y0(accessibilityNodeInfo);
            cY0.a0(C.c.a(0, 1, this.f27575a.g(), 1, false, isSelected()));
            if (isSelected()) {
                cY0.Y(false);
                cY0.P(C.a.f7404i);
            }
            cY0.o0(getResources().getString(R4.j.f8834h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i9, int i10) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i9);
            int mode = View.MeasureSpec.getMode(i9);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i9 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f27540s, Integer.MIN_VALUE);
            }
            super.onMeasure(i9, i10);
            if (this.f27576c != null) {
                float f9 = TabLayout.this.f27537p;
                int i11 = this.f27584k;
                ImageView imageView = this.f27577d;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f27576c;
                    if (textView != null && textView.getLineCount() > 1) {
                        f9 = TabLayout.this.f27538q;
                    }
                } else {
                    i11 = 1;
                }
                float textSize = this.f27576c.getTextSize();
                int lineCount = this.f27576c.getLineCount();
                int iD = T.j.d(this.f27576c);
                if (f9 != textSize || (iD >= 0 && i11 != iD)) {
                    if (TabLayout.this.f27505A != 1 || f9 <= textSize || lineCount != 1 || ((layout = this.f27576c.getLayout()) != null && e(layout, 0, f9) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f27576c.setTextSize(0, f9);
                        this.f27576c.setMaxLines(i11);
                        super.onMeasure(i9, i10);
                    }
                }
            }
        }

        public final void p() {
            g gVar;
            View view;
            View view2;
            g gVar2;
            if (j()) {
                if (this.f27580g == null) {
                    if (this.f27577d != null && (gVar2 = this.f27575a) != null && gVar2.f() != null) {
                        View view3 = this.f27578e;
                        view = this.f27577d;
                        if (view3 != view) {
                            o();
                            view2 = this.f27577d;
                            n(view2);
                            return;
                        }
                        q(view);
                        return;
                    }
                    if (this.f27576c != null && (gVar = this.f27575a) != null && gVar.h() == 1) {
                        View view4 = this.f27578e;
                        view = this.f27576c;
                        if (view4 != view) {
                            o();
                            view2 = this.f27576c;
                            n(view2);
                            return;
                        }
                        q(view);
                        return;
                    }
                }
                o();
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f27575a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f27575a.l();
            return true;
        }

        public final void q(View view) {
            if (j() && view == this.f27578e) {
                U4.d.c(this.f27579f, view, i(view));
            }
        }

        public final void r() {
            g gVar = this.f27575a;
            ImageView imageView = null;
            View viewE = gVar != null ? gVar.e() : null;
            if (viewE != null) {
                ViewParent parent = viewE.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewE);
                    }
                    addView(viewE);
                }
                this.f27580g = viewE;
                TextView textView = this.f27576c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView2 = this.f27577d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f27577d.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f27581h = textView2;
                if (textView2 != null) {
                    this.f27584k = T.j.d(textView2);
                }
                imageView = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view = this.f27580g;
                if (view != null) {
                    removeView(view);
                    this.f27580g = null;
                }
                this.f27581h = null;
            }
            this.f27582i = imageView;
            if (this.f27580g == null) {
                if (this.f27577d == null) {
                    k();
                }
                if (this.f27576c == null) {
                    l();
                    this.f27584k = T.j.d(this.f27576c);
                }
                T.j.o(this.f27576c, TabLayout.this.f27530i);
                ColorStateList colorStateList = TabLayout.this.f27531j;
                if (colorStateList != null) {
                    this.f27576c.setTextColor(colorStateList);
                }
                u(this.f27576c, this.f27577d);
                p();
                d(this.f27577d);
                d(this.f27576c);
            } else {
                TextView textView3 = this.f27581h;
                if (textView3 != null || this.f27582i != null) {
                    u(textView3, this.f27582i);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f27565d)) {
                setContentDescription(gVar.f27565d);
            }
            setSelected(gVar != null && gVar.j());
        }

        public final void s(Context context) {
            int i9 = TabLayout.this.f27539r;
            if (i9 != 0) {
                Drawable drawableB = AbstractC1726a.b(context, i9);
                this.f27583j = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f27583j.setState(getDrawableState());
                }
            } else {
                this.f27583j = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.f27533l != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = AbstractC2100b.a(TabLayout.this.f27533l);
                boolean z9 = TabLayout.this.f27510F;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z9) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z9 ? null : gradientDrawable2);
            }
            L.w0(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        @Override // android.view.View
        public void setSelected(boolean z9) {
            isSelected();
            super.setSelected(z9);
            TextView textView = this.f27576c;
            if (textView != null) {
                textView.setSelected(z9);
            }
            ImageView imageView = this.f27577d;
            if (imageView != null) {
                imageView.setSelected(z9);
            }
            View view = this.f27580g;
            if (view != null) {
                view.setSelected(z9);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f27575a) {
                this.f27575a = gVar;
                r();
            }
        }

        public final void t() {
            ImageView imageView;
            setOrientation(!TabLayout.this.f27506B ? 1 : 0);
            TextView textView = this.f27581h;
            if (textView == null && this.f27582i == null) {
                textView = this.f27576c;
                imageView = this.f27577d;
            } else {
                imageView = this.f27582i;
            }
            u(textView, imageView);
        }

        public final void u(TextView textView, ImageView imageView) {
            g gVar = this.f27575a;
            Drawable drawableMutate = (gVar == null || gVar.f() == null) ? null : H.a.r(this.f27575a.f()).mutate();
            if (drawableMutate != null) {
                H.a.o(drawableMutate, TabLayout.this.f27532k);
                PorterDuff.Mode mode = TabLayout.this.f27536o;
                if (mode != null) {
                    H.a.p(drawableMutate, mode);
                }
            }
            g gVar2 = this.f27575a;
            CharSequence charSequenceI = gVar2 != null ? gVar2.i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z9 = !TextUtils.isEmpty(charSequenceI);
            if (textView != null) {
                if (z9) {
                    textView.setText(charSequenceI);
                    if (this.f27575a.f27568g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iB = (z9 && imageView.getVisibility() == 0) ? (int) w.b(getContext(), 8) : 0;
                if (TabLayout.this.f27506B) {
                    if (iB != AbstractC0976s.a(marginLayoutParams)) {
                        AbstractC0976s.c(marginLayoutParams, iB);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iB != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iB;
                    AbstractC0976s.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f27575a;
            CharSequence charSequence = gVar3 != null ? gVar3.f27565d : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (!z9) {
                    charSequenceI = charSequence;
                }
                g0.a(this, charSequenceI);
            }
        }
    }

    public static class j implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager f27588a;

        public j(ViewPager viewPager) {
            this.f27588a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
            this.f27588a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R4.b.f8661G);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f27503S;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        this.f27523a = new ArrayList();
        this.f27534m = new GradientDrawable();
        this.f27535n = 0;
        this.f27540s = a.e.API_PRIORITY_OTHER;
        this.f27508D = -1;
        this.f27513I = new ArrayList();
        this.f27522R = new O.f(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f27525d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f9175k5, i9, i10, l.f8941I5);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C2198g c2198g = new C2198g();
            c2198g.W(ColorStateList.valueOf(colorDrawable.getColor()));
            c2198g.L(context2);
            c2198g.V(L.y(this));
            L.w0(this, c2198g);
        }
        setSelectedTabIndicator(AbstractC1893c.d(context2, typedArrayH, l.f9229q5));
        setSelectedTabIndicatorColor(typedArrayH.getColor(l.f9256t5, 0));
        fVar.g(typedArrayH.getDimensionPixelSize(l.f9283w5, -1));
        setSelectedTabIndicatorGravity(typedArrayH.getInt(l.f9274v5, 0));
        setTabIndicatorAnimationMode(typedArrayH.getInt(l.f9247s5, 0));
        setTabIndicatorFullWidth(typedArrayH.getBoolean(l.f9265u5, true));
        int dimensionPixelSize = typedArrayH.getDimensionPixelSize(l.f8884B5, 0);
        this.f27529h = dimensionPixelSize;
        this.f27528g = dimensionPixelSize;
        this.f27527f = dimensionPixelSize;
        this.f27526e = dimensionPixelSize;
        this.f27526e = typedArrayH.getDimensionPixelSize(l.f8909E5, dimensionPixelSize);
        this.f27527f = typedArrayH.getDimensionPixelSize(l.f8917F5, this.f27527f);
        this.f27528g = typedArrayH.getDimensionPixelSize(l.f8901D5, this.f27528g);
        this.f27529h = typedArrayH.getDimensionPixelSize(l.f8893C5, this.f27529h);
        int resourceId = typedArrayH.getResourceId(l.f8941I5, k.f8848b);
        this.f27530i = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, c.j.f18050a3);
        try {
            this.f27537p = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.j.f18056b3, 0);
            this.f27531j = AbstractC1893c.a(context2, typedArrayObtainStyledAttributes, c.j.f18072e3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayH.hasValue(l.f8949J5)) {
                this.f27531j = AbstractC1893c.a(context2, typedArrayH, l.f8949J5);
            }
            if (typedArrayH.hasValue(l.f8933H5)) {
                this.f27531j = o(this.f27531j.getDefaultColor(), typedArrayH.getColor(l.f8933H5, 0));
            }
            this.f27532k = AbstractC1893c.a(context2, typedArrayH, l.f9211o5);
            this.f27536o = w.f(typedArrayH.getInt(l.f9220p5, -1), null);
            this.f27533l = AbstractC1893c.a(context2, typedArrayH, l.f8925G5);
            this.f27546y = typedArrayH.getInt(l.f9238r5, 300);
            this.f27541t = typedArrayH.getDimensionPixelSize(l.f9310z5, -1);
            this.f27542u = typedArrayH.getDimensionPixelSize(l.f9301y5, -1);
            this.f27539r = typedArrayH.getResourceId(l.f9184l5, 0);
            this.f27544w = typedArrayH.getDimensionPixelSize(l.f9193m5, 0);
            this.f27505A = typedArrayH.getInt(l.f8875A5, 1);
            this.f27545x = typedArrayH.getInt(l.f9202n5, 0);
            this.f27506B = typedArrayH.getBoolean(l.f9292x5, false);
            this.f27510F = typedArrayH.getBoolean(l.f8957K5, false);
            typedArrayH.recycle();
            Resources resources = getResources();
            this.f27538q = resources.getDimensionPixelSize(R4.d.f8736i);
            this.f27543v = resources.getDimensionPixelSize(R4.d.f8735h);
            l();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f27523a.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            g gVar = (g) this.f27523a.get(i9);
            if (gVar == null || gVar.f() == null || TextUtils.isEmpty(gVar.i())) {
                i9++;
            } else if (!this.f27506B) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i9 = this.f27541t;
        if (i9 != -1) {
            return i9;
        }
        int i10 = this.f27505A;
        if (i10 == 0 || i10 == 2) {
            return this.f27543v;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f27525d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList o(int i9, int i10) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i10, i9});
    }

    private void setSelectedTabView(int i9) {
        int childCount = this.f27525d.getChildCount();
        if (i9 < childCount) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = this.f27525d.getChildAt(i10);
                boolean z9 = true;
                childAt.setSelected(i10 == i9);
                if (i10 != i9) {
                    z9 = false;
                }
                childAt.setActivated(z9);
                i10++;
            }
        }
    }

    public void A() {
        int currentItem;
        C();
        N0.a aVar = this.f27517M;
        if (aVar != null) {
            int iC = aVar.c();
            for (int i9 = 0; i9 < iC; i9++) {
                g(z().o(this.f27517M.e(i9)), false);
            }
            ViewPager viewPager = this.f27516L;
            if (viewPager == null || iC <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            F(w(currentItem));
        }
    }

    public boolean B(g gVar) {
        return f27504T.a(gVar);
    }

    public void C() {
        for (int childCount = this.f27525d.getChildCount() - 1; childCount >= 0; childCount--) {
            E(childCount);
        }
        Iterator it = this.f27523a.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.k();
            B(gVar);
        }
        this.f27524c = null;
    }

    public void D(c cVar) {
        this.f27513I.remove(cVar);
    }

    public final void E(int i9) {
        i iVar = (i) this.f27525d.getChildAt(i9);
        this.f27525d.removeViewAt(i9);
        if (iVar != null) {
            iVar.m();
            this.f27522R.a(iVar);
        }
        requestLayout();
    }

    public void F(g gVar) {
        G(gVar, true);
    }

    public void G(g gVar, boolean z9) {
        g gVar2 = this.f27524c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                s(gVar);
                j(gVar.g());
                return;
            }
            return;
        }
        int iG = gVar != null ? gVar.g() : -1;
        if (z9) {
            if ((gVar2 == null || gVar2.g() == -1) && iG != -1) {
                I(iG, 0.0f, true);
            } else {
                j(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f27524c = gVar;
        if (gVar2 != null) {
            u(gVar2);
        }
        if (gVar != null) {
            t(gVar);
        }
    }

    public void H(N0.a aVar, boolean z9) {
        DataSetObserver dataSetObserver;
        N0.a aVar2 = this.f27517M;
        if (aVar2 != null && (dataSetObserver = this.f27518N) != null) {
            aVar2.o(dataSetObserver);
        }
        this.f27517M = aVar;
        if (z9 && aVar != null) {
            if (this.f27518N == null) {
                this.f27518N = new e();
            }
            aVar.i(this.f27518N);
        }
        A();
    }

    public void I(int i9, float f9, boolean z9) {
        J(i9, f9, z9, true);
    }

    public void J(int i9, float f9, boolean z9, boolean z10) {
        int iRound = Math.round(i9 + f9);
        if (iRound < 0 || iRound >= this.f27525d.getChildCount()) {
            return;
        }
        if (z10) {
            this.f27525d.f(i9, f9);
        }
        ValueAnimator valueAnimator = this.f27515K;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f27515K.cancel();
        }
        scrollTo(i9 < 0 ? 0 : m(i9, f9), 0);
        if (z9) {
            setSelectedTabView(iRound);
        }
    }

    public void K(ViewPager viewPager, boolean z9) {
        L(viewPager, z9, false);
    }

    public final void L(ViewPager viewPager, boolean z9, boolean z10) {
        ViewPager viewPager2 = this.f27516L;
        if (viewPager2 != null) {
            h hVar = this.f27519O;
            if (hVar != null) {
                viewPager2.I(hVar);
            }
            b bVar = this.f27520P;
            if (bVar != null) {
                this.f27516L.H(bVar);
            }
        }
        c cVar = this.f27514J;
        if (cVar != null) {
            D(cVar);
            this.f27514J = null;
        }
        if (viewPager != null) {
            this.f27516L = viewPager;
            if (this.f27519O == null) {
                this.f27519O = new h(this);
            }
            this.f27519O.d();
            viewPager.c(this.f27519O);
            j jVar = new j(viewPager);
            this.f27514J = jVar;
            c(jVar);
            N0.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                H(adapter, z9);
            }
            if (this.f27520P == null) {
                this.f27520P = new b();
            }
            this.f27520P.b(z9);
            viewPager.b(this.f27520P);
            I(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f27516L = null;
            H(null, false);
        }
        this.f27521Q = z10;
    }

    public final void M() {
        int size = this.f27523a.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((g) this.f27523a.get(i9)).p();
        }
    }

    public final void N(LinearLayout.LayoutParams layoutParams) {
        float f9;
        if (this.f27505A == 1 && this.f27545x == 0) {
            layoutParams.width = 0;
            f9 = 1.0f;
        } else {
            layoutParams.width = -2;
            f9 = 0.0f;
        }
        layoutParams.weight = f9;
    }

    public void O(boolean z9) {
        for (int i9 = 0; i9 < this.f27525d.getChildCount(); i9++) {
            View childAt = this.f27525d.getChildAt(i9);
            childAt.setMinimumWidth(getTabMinWidth());
            N((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z9) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i9) {
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        i(view);
    }

    public void c(c cVar) {
        if (this.f27513I.contains(cVar)) {
            return;
        }
        this.f27513I.add(cVar);
    }

    public void d(d dVar) {
        c(dVar);
    }

    public void e(g gVar) {
        g(gVar, this.f27523a.isEmpty());
    }

    public void f(g gVar, int i9, boolean z9) {
        if (gVar.f27569h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        n(gVar, i9);
        h(gVar);
        if (z9) {
            gVar.l();
        }
    }

    public void g(g gVar, boolean z9) {
        f(gVar, this.f27523a.size(), z9);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f27524c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f27523a.size();
    }

    public int getTabGravity() {
        return this.f27545x;
    }

    public ColorStateList getTabIconTint() {
        return this.f27532k;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f27509E;
    }

    public int getTabIndicatorGravity() {
        return this.f27547z;
    }

    public int getTabMaxWidth() {
        return this.f27540s;
    }

    public int getTabMode() {
        return this.f27505A;
    }

    public ColorStateList getTabRippleColor() {
        return this.f27533l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f27534m;
    }

    public ColorStateList getTabTextColors() {
        return this.f27531j;
    }

    public final void h(g gVar) {
        i iVar = gVar.f27570i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f27525d.addView(iVar, gVar.g(), p());
    }

    public final void i(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void j(int i9) {
        if (i9 == -1) {
            return;
        }
        if (getWindowToken() == null || !L.W(this) || this.f27525d.d()) {
            I(i9, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM = m(i9, 0.0f);
        if (scrollX != iM) {
            v();
            this.f27515K.setIntValues(scrollX, iM);
            this.f27515K.start();
        }
        this.f27525d.c(i9, this.f27546y);
    }

    public final void k(int i9) {
        f fVar;
        int i10;
        if (i9 != 0) {
            i10 = 1;
            if (i9 == 1) {
                fVar = this.f27525d;
                fVar.setGravity(i10);
            } else if (i9 != 2) {
                return;
            }
        } else {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        fVar = this.f27525d;
        i10 = 8388611;
        fVar.setGravity(i10);
    }

    public final void l() {
        int i9 = this.f27505A;
        L.F0(this.f27525d, (i9 == 0 || i9 == 2) ? Math.max(0, this.f27544w - this.f27526e) : 0, 0, 0, 0);
        int i10 = this.f27505A;
        if (i10 == 0) {
            k(this.f27545x);
        } else if (i10 == 1 || i10 == 2) {
            if (this.f27545x == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f27525d.setGravity(1);
        }
        O(true);
    }

    public final int m(int i9, float f9) {
        View childAt;
        int i10 = this.f27505A;
        if ((i10 != 0 && i10 != 2) || (childAt = this.f27525d.getChildAt(i9)) == null) {
            return 0;
        }
        int i11 = i9 + 1;
        View childAt2 = i11 < this.f27525d.getChildCount() ? this.f27525d.getChildAt(i11) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i12 = (int) ((width + width2) * 0.5f * f9);
        return L.E(this) == 0 ? left + i12 : left - i12;
    }

    public final void n(g gVar, int i9) {
        gVar.n(i9);
        this.f27523a.add(i9, gVar);
        int size = this.f27523a.size();
        while (true) {
            i9++;
            if (i9 >= size) {
                return;
            } else {
                ((g) this.f27523a.get(i9)).n(i9);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l5.h.e(this);
        if (this.f27516L == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                L((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f27521Q) {
            setupWithViewPager(null);
            this.f27521Q = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i9 = 0; i9 < this.f27525d.getChildCount(); i9++) {
            View childAt = this.f27525d.getChildAt(i9);
            if (childAt instanceof i) {
                ((i) childAt).h(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.y0(accessibilityNodeInfo).Z(C.b.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return x() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = f5.w.b(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f27542u
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = f5.w.b(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f27540s = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto La9
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.f27505A
            if (r0 == 0) goto L81
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L81
            goto La9
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto La9
            goto L8b
        L81:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto La9
        L8b:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || x()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final LinearLayout.LayoutParams p() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        N(layoutParams);
        return layoutParams;
    }

    public g q() {
        g gVar = (g) f27504T.b();
        return gVar == null ? new g() : gVar;
    }

    public final i r(g gVar) {
        O.e eVar = this.f27522R;
        i iVar = eVar != null ? (i) eVar.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        iVar.setContentDescription(TextUtils.isEmpty(gVar.f27565d) ? gVar.f27564c : gVar.f27565d);
        return iVar;
    }

    public final void s(g gVar) {
        for (int size = this.f27513I.size() - 1; size >= 0; size--) {
            ((c) this.f27513I.get(size)).c(gVar);
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        l5.h.d(this, f9);
    }

    public void setInlineLabel(boolean z9) {
        if (this.f27506B != z9) {
            this.f27506B = z9;
            for (int i9 = 0; i9 < this.f27525d.getChildCount(); i9++) {
                View childAt = this.f27525d.getChildAt(i9);
                if (childAt instanceof i) {
                    ((i) childAt).t();
                }
            }
            l();
        }
    }

    public void setInlineLabelResource(int i9) {
        setInlineLabel(getResources().getBoolean(i9));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f27512H;
        if (cVar2 != null) {
            D(cVar2);
        }
        this.f27512H = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        v();
        this.f27515K.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i9) {
        setSelectedTabIndicator(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f27534m != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f27534m = drawable;
            int intrinsicHeight = this.f27508D;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.f27525d.g(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(int i9) {
        this.f27535n = i9;
        O(false);
    }

    public void setSelectedTabIndicatorGravity(int i9) {
        if (this.f27547z != i9) {
            this.f27547z = i9;
            L.j0(this.f27525d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i9) {
        this.f27508D = i9;
        this.f27525d.g(i9);
    }

    public void setTabGravity(int i9) {
        if (this.f27545x != i9) {
            this.f27545x = i9;
            l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f27532k != colorStateList) {
            this.f27532k = colorStateList;
            M();
        }
    }

    public void setTabIconTintResource(int i9) {
        setTabIconTint(AbstractC1726a.a(getContext(), i9));
    }

    public void setTabIndicatorAnimationMode(int i9) {
        com.google.android.material.tabs.a aVar;
        this.f27509E = i9;
        if (i9 == 0) {
            aVar = new com.google.android.material.tabs.a();
        } else if (i9 == 1) {
            aVar = new C2294a();
        } else {
            if (i9 != 2) {
                throw new IllegalArgumentException(i9 + " is not a valid TabIndicatorAnimationMode");
            }
            aVar = new C2295b();
        }
        this.f27511G = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z9) {
        this.f27507C = z9;
        this.f27525d.e();
        L.j0(this.f27525d);
    }

    public void setTabMode(int i9) {
        if (i9 != this.f27505A) {
            this.f27505A = i9;
            l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f27533l != colorStateList) {
            this.f27533l = colorStateList;
            for (int i9 = 0; i9 < this.f27525d.getChildCount(); i9++) {
                View childAt = this.f27525d.getChildAt(i9);
                if (childAt instanceof i) {
                    ((i) childAt).s(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i9) {
        setTabRippleColor(AbstractC1726a.a(getContext(), i9));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f27531j != colorStateList) {
            this.f27531j = colorStateList;
            M();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(N0.a aVar) {
        H(aVar, false);
    }

    public void setUnboundedRipple(boolean z9) {
        if (this.f27510F != z9) {
            this.f27510F = z9;
            for (int i9 = 0; i9 < this.f27525d.getChildCount(); i9++) {
                View childAt = this.f27525d.getChildAt(i9);
                if (childAt instanceof i) {
                    ((i) childAt).s(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i9) {
        setUnboundedRipple(getResources().getBoolean(i9));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        K(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final void t(g gVar) {
        for (int size = this.f27513I.size() - 1; size >= 0; size--) {
            ((c) this.f27513I.get(size)).a(gVar);
        }
    }

    public final void u(g gVar) {
        for (int size = this.f27513I.size() - 1; size >= 0; size--) {
            ((c) this.f27513I.get(size)).b(gVar);
        }
    }

    public final void v() {
        if (this.f27515K == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27515K = valueAnimator;
            valueAnimator.setInterpolator(S4.a.f9410b);
            this.f27515K.setDuration(this.f27546y);
            this.f27515K.addUpdateListener(new a());
        }
    }

    public g w(int i9) {
        if (i9 < 0 || i9 >= getTabCount()) {
            return null;
        }
        return (g) this.f27523a.get(i9);
    }

    public final boolean x() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    public boolean y() {
        return this.f27507C;
    }

    public g z() {
        g gVarQ = q();
        gVarQ.f27569h = this;
        gVarQ.f27570i = r(gVarQ);
        if (gVarQ.f27571j != -1) {
            gVarQ.f27570i.setId(gVarQ.f27571j);
        }
        return gVarQ;
    }
}
