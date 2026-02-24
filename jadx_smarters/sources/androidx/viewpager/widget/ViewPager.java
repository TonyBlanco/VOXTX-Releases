package androidx.viewpager.widget;

import P.C0959a;
import P.E;
import P.L;
import P.X;
import Q.C;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import okio.Segment;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int[] f17165k0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Comparator f17166l0 = new a();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Interpolator f17167m0 = new b();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final m f17168n0 = new m();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f17169A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f17170B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f17171C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f17172D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f17173E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f17174F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f17175G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f17176H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f17177I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public VelocityTracker f17178J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f17179K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f17180L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f17181M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f17182N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f17183O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public EdgeEffect f17184P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public EdgeEffect f17185Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f17186R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f17187S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f17188T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f17189U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public List f17190V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public j f17191W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17192a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f17194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f17195e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public j f17196e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public N0.a f17197f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public List f17198f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17199g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f17200g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17201h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ArrayList f17202h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f17203i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Runnable f17204i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ClassLoader f17205j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f17206j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scroller f17207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f17209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f17211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17212p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17213q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f17214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f17215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17216t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17217u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17218v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17219w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17220x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17221y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17222z;

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f17227b - fVar2.f17227b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f9) {
            float f10 = f9 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    public class d implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f17224a = new Rect();

        public d() {
        }

        @Override // P.E
        public X a(View view, X x9) {
            X xE0 = L.e0(view, x9);
            if (xE0.n()) {
                return xE0;
            }
            Rect rect = this.f17224a;
            rect.left = xE0.i();
            rect.top = xE0.k();
            rect.right = xE0.j();
            rect.bottom = xE0.h();
            int childCount = ViewPager.this.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                X xI = L.i(ViewPager.this.getChildAt(i9), xE0);
                rect.left = Math.min(xI.i(), rect.left);
                rect.top = Math.min(xI.k(), rect.top);
                rect.right = Math.min(xI.j(), rect.right);
                rect.bottom = Math.min(xI.h(), rect.bottom);
            }
            return xE0.o(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f17229d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f17230e;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f17233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17236f;

        public g() {
            super(-1, -1);
            this.f17233c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17233c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f17165k0);
            this.f17232b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class h extends C0959a {
        public h() {
        }

        @Override // P.C0959a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            N0.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f17197f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.f17199g);
            accessibilityEvent.setToIndex(ViewPager.this.f17199g);
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            super.g(view, c9);
            c9.X(ViewPager.class.getName());
            c9.q0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c9.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c9.a(Segment.SIZE);
            }
        }

        @Override // P.C0959a
        public boolean j(View view, int i9, Bundle bundle) {
            ViewPager viewPager;
            int i10;
            if (super.j(view, i9, bundle)) {
                return true;
            }
            if (i9 != 4096) {
                if (i9 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i10 = viewPager.f17199g - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i10 = viewPager.f17199g + 1;
            }
            viewPager.setCurrentItem(i10);
            return true;
        }

        public final boolean n() {
            N0.a aVar = ViewPager.this.f17197f;
            return aVar != null && aVar.c() > 1;
        }
    }

    public interface i {
        void a(ViewPager viewPager, N0.a aVar, N0.a aVar2);
    }

    public interface j {
        void a(int i9, float f9, int i10);

        void b(int i9);

        void c(int i9);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.h();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.h();
        }
    }

    public static class l extends V.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Parcelable f17240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ClassLoader f17241f;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i9) {
                return new l[i9];
            }
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f17239d = parcel.readInt();
            this.f17240e = parcel.readParcelable(classLoader);
            this.f17241f = classLoader;
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f17239d + "}";
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f17239d);
            parcel.writeParcelable(this.f17240e, i9);
        }
    }

    public static class m implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z9 = gVar.f17231a;
            return z9 != gVar2.f17231a ? z9 ? 1 : -1 : gVar.f17235e - gVar2.f17235e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17193c = new ArrayList();
        this.f17194d = new f();
        this.f17195e = new Rect();
        this.f17201h = -1;
        this.f17203i = null;
        this.f17205j = null;
        this.f17214r = -3.4028235E38f;
        this.f17215s = Float.MAX_VALUE;
        this.f17221y = 1;
        this.f17177I = -1;
        this.f17186R = true;
        this.f17187S = false;
        this.f17204i0 = new c();
        this.f17206j0 = 0;
        u();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.f17219w != z9) {
            this.f17219w = z9;
        }
    }

    public static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public boolean A() {
        N0.a aVar = this.f17197f;
        if (aVar == null || this.f17199g >= aVar.c() - 1) {
            return false;
        }
        M(this.f17199g + 1, true);
        return true;
    }

    public final boolean B(int i9) {
        if (this.f17193c.size() == 0) {
            if (this.f17186R) {
                return false;
            }
            this.f17188T = false;
            x(0, 0.0f, 0);
            if (this.f17188T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarS = s();
        int clientWidth = getClientWidth();
        int i10 = this.f17210n;
        int i11 = clientWidth + i10;
        float f9 = clientWidth;
        int i12 = fVarS.f17227b;
        float f10 = ((i9 / f9) - fVarS.f17230e) / (fVarS.f17229d + (i10 / f9));
        this.f17188T = false;
        x(i12, f10, (int) (i11 * f10));
        if (this.f17188T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean C(float f9) {
        boolean z9;
        boolean z10;
        float f10 = this.f17173E - f9;
        this.f17173E = f9;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.f17214r * clientWidth;
        float f12 = this.f17215s * clientWidth;
        boolean z11 = false;
        f fVar = (f) this.f17193c.get(0);
        ArrayList arrayList = this.f17193c;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.f17227b != 0) {
            f11 = fVar.f17230e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (fVar2.f17227b != this.f17197f.c() - 1) {
            f12 = fVar2.f17230e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f11) {
            if (z9) {
                this.f17184P.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z10) {
                this.f17185Q.onPull(Math.abs(scrollX - f12) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        }
        int i9 = (int) scrollX;
        this.f17173E += scrollX - i9;
        scrollTo(i9, getScrollY());
        B(i9);
        return z11;
    }

    public void D() {
        E(this.f17199g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2 A[PHI: r7 r10 r15
      0x00c2: PHI (r7v9 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:64:0x00e7, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r10v12 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:64:0x00e7, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r15v10 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00e7, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[PHI: r7 r10 r15
      0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:64:0x00e7, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:64:0x00e7, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00e7, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(int r18) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.E(int):void");
    }

    public final void F(int i9, int i10, int i11, int i12) {
        int iMin;
        if (i10 <= 0 || this.f17193c.isEmpty()) {
            f fVarT = t(this.f17199g);
            iMin = (int) ((fVarT != null ? Math.min(fVarT.f17230e, this.f17215s) : 0.0f) * ((i9 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                g(false);
            }
        } else if (!this.f17207k.isFinished()) {
            this.f17207k.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i9 - getPaddingLeft()) - getPaddingRight()) + i11));
        }
        scrollTo(iMin, getScrollY());
    }

    public final void G() {
        int i9 = 0;
        while (i9 < getChildCount()) {
            if (!((g) getChildAt(i9).getLayoutParams()).f17231a) {
                removeViewAt(i9);
                i9--;
            }
            i9++;
        }
    }

    public void H(i iVar) {
        List list = this.f17198f0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void I(j jVar) {
        List list = this.f17190V;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public final void J(boolean z9) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z9);
        }
    }

    public final boolean K() {
        this.f17177I = -1;
        n();
        this.f17184P.onRelease();
        this.f17185Q.onRelease();
        return this.f17184P.isFinished() || this.f17185Q.isFinished();
    }

    public final void L(int i9, boolean z9, int i10, boolean z10) {
        f fVarT = t(i9);
        int clientWidth = fVarT != null ? (int) (getClientWidth() * Math.max(this.f17214r, Math.min(fVarT.f17230e, this.f17215s))) : 0;
        if (z9) {
            P(clientWidth, 0, i10);
            if (z10) {
                k(i9);
                return;
            }
            return;
        }
        if (z10) {
            k(i9);
        }
        g(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    public void M(int i9, boolean z9) {
        this.f17220x = false;
        N(i9, z9, false);
    }

    public void N(int i9, boolean z9, boolean z10) {
        O(i9, z9, z10, 0);
    }

    public void O(int i9, boolean z9, boolean z10, int i10) {
        N0.a aVar = this.f17197f;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z10 && this.f17199g == i9 && this.f17193c.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i9 < 0) {
            i9 = 0;
        } else if (i9 >= this.f17197f.c()) {
            i9 = this.f17197f.c() - 1;
        }
        int i11 = this.f17221y;
        int i12 = this.f17199g;
        if (i9 > i12 + i11 || i9 < i12 - i11) {
            for (int i13 = 0; i13 < this.f17193c.size(); i13++) {
                ((f) this.f17193c.get(i13)).f17228c = true;
            }
        }
        boolean z11 = this.f17199g != i9;
        if (!this.f17186R) {
            E(i9);
            L(i9, z9, i10, z11);
        } else {
            this.f17199g = i9;
            if (z11) {
                k(i9);
            }
            requestLayout();
        }
    }

    public void P(int i9, int i10, int i11) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f17207k;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f17208l ? this.f17207k.getCurrX() : this.f17207k.getStartX();
            this.f17207k.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i9 - i12;
        int i14 = i10 - scrollY;
        if (i13 == 0 && i14 == 0) {
            g(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float f9 = clientWidth;
        float f10 = i15;
        float fM = f10 + (m(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f9)) * f10);
        int iAbs = Math.abs(i11);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fM / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / ((f9 * this.f17197f.f(this.f17199g)) + this.f17210n)) + 1.0f) * 100.0f), 600);
        this.f17208l = false;
        this.f17207k.startScroll(i12, scrollY, i13, i14, iMin);
        L.j0(this);
    }

    public final void Q() {
        if (this.f17200g0 != 0) {
            ArrayList arrayList = this.f17202h0;
            if (arrayList == null) {
                this.f17202h0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.f17202h0.add(getChildAt(i9));
            }
            Collections.sort(this.f17202h0, f17168n0);
        }
    }

    public f a(int i9, int i10) {
        f fVar = new f();
        fVar.f17227b = i9;
        fVar.f17226a = this.f17197f.g(this, i9);
        fVar.f17229d = this.f17197f.f(i9);
        if (i10 < 0 || i10 >= this.f17193c.size()) {
            this.f17193c.add(fVar);
        } else {
            this.f17193c.add(i10, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i9, int i10) {
        f fVarR;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f17227b == this.f17199g) {
                    childAt.addFocusables(arrayList, i9, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f fVarR;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f17227b == this.f17199g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zV = gVar.f17231a | v(view);
        gVar.f17231a = zV;
        if (!this.f17218v) {
            super.addView(view, i9, layoutParams);
        } else {
            if (zV) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f17234d = true;
            addViewInLayout(view, i9, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.f17198f0 == null) {
            this.f17198f0 = new ArrayList();
        }
        this.f17198f0.add(iVar);
    }

    public void c(j jVar) {
        if (this.f17190V == null) {
            this.f17190V = new ArrayList();
        }
        this.f17190V.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i9) {
        if (this.f17197f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i9 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f17214r)) : i9 > 0 && scrollX < ((int) (((float) clientWidth) * this.f17215s));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f17208l = true;
        if (this.f17207k.isFinished() || !this.f17207k.computeScrollOffset()) {
            g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f17207k.getCurrX();
        int currY = this.f17207k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.f17207k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        L.j0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto La6
            if (r1 == r0) goto La6
            if (r5 != r3) goto L8f
            android.graphics.Rect r2 = r4.f17195e
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f17195e
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8a
            if (r2 < r3) goto L8a
            goto Lb9
        L8a:
            boolean r0 = r1.requestFocus()
            goto Lbd
        L8f:
            if (r5 != r2) goto Lb2
            android.graphics.Rect r2 = r4.f17195e
            android.graphics.Rect r2 = r4.p(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.f17195e
            android.graphics.Rect r3 = r4.p(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8a
            if (r2 > r3) goto L8a
            goto Lb4
        La6:
            if (r5 == r3) goto Lb9
            r0 = 1
            if (r5 != r0) goto Lac
            goto Lb9
        Lac:
            if (r5 == r2) goto Lb4
            r0 = 2
            if (r5 != r0) goto Lb2
            goto Lb4
        Lb2:
            r0 = 0
            goto Lbd
        Lb4:
            boolean r0 = r4.A()
            goto Lbd
        Lb9:
            boolean r0 = r4.z()
        Lbd:
            if (r0 == 0) goto Lc6
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarR;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f17227b == this.f17199g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        N0.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f17197f) != null && aVar.c() > 1)) {
            if (!this.f17184P.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f17214r * width);
                this.f17184P.setSize(height, width);
                zDraw = this.f17184P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f17185Q.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f17215s + 1.0f)) * width2);
                this.f17185Q.setSize(height2, width2);
                zDraw |= this.f17185Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f17184P.finish();
            this.f17185Q.finish();
        }
        if (zDraw) {
            L.j0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17211o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(f fVar, int i9, f fVar2) {
        int i10;
        int i11;
        f fVar3;
        f fVar4;
        int iC = this.f17197f.c();
        int clientWidth = getClientWidth();
        float f9 = clientWidth > 0 ? this.f17210n / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i12 = fVar2.f17227b;
            int i13 = fVar.f17227b;
            if (i12 < i13) {
                float f10 = fVar2.f17230e + fVar2.f17229d + f9;
                int i14 = i12 + 1;
                int i15 = 0;
                while (i14 <= fVar.f17227b && i15 < this.f17193c.size()) {
                    while (true) {
                        fVar4 = (f) this.f17193c.get(i15);
                        if (i14 <= fVar4.f17227b || i15 >= this.f17193c.size() - 1) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    while (i14 < fVar4.f17227b) {
                        f10 += this.f17197f.f(i14) + f9;
                        i14++;
                    }
                    fVar4.f17230e = f10;
                    f10 += fVar4.f17229d + f9;
                    i14++;
                }
            } else if (i12 > i13) {
                int size = this.f17193c.size() - 1;
                float f11 = fVar2.f17230e;
                while (true) {
                    i12--;
                    if (i12 < fVar.f17227b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = (f) this.f17193c.get(size);
                        if (i12 >= fVar3.f17227b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i12 > fVar3.f17227b) {
                        f11 -= this.f17197f.f(i12) + f9;
                        i12--;
                    }
                    f11 -= fVar3.f17229d + f9;
                    fVar3.f17230e = f11;
                }
            }
        }
        int size2 = this.f17193c.size();
        float f12 = fVar.f17230e;
        int i16 = fVar.f17227b;
        int i17 = i16 - 1;
        this.f17214r = i16 == 0 ? f12 : -3.4028235E38f;
        int i18 = iC - 1;
        this.f17215s = i16 == i18 ? (fVar.f17229d + f12) - 1.0f : Float.MAX_VALUE;
        int i19 = i9 - 1;
        while (i19 >= 0) {
            f fVar5 = (f) this.f17193c.get(i19);
            while (true) {
                i11 = fVar5.f17227b;
                if (i17 <= i11) {
                    break;
                }
                f12 -= this.f17197f.f(i17) + f9;
                i17--;
            }
            f12 -= fVar5.f17229d + f9;
            fVar5.f17230e = f12;
            if (i11 == 0) {
                this.f17214r = f12;
            }
            i19--;
            i17--;
        }
        float f13 = fVar.f17230e + fVar.f17229d + f9;
        int i20 = fVar.f17227b + 1;
        int i21 = i9 + 1;
        while (i21 < size2) {
            f fVar6 = (f) this.f17193c.get(i21);
            while (true) {
                i10 = fVar6.f17227b;
                if (i20 >= i10) {
                    break;
                }
                f13 += this.f17197f.f(i20) + f9;
                i20++;
            }
            if (i10 == i18) {
                this.f17215s = (fVar6.f17229d + f13) - 1.0f;
            }
            fVar6.f17230e = f13;
            f13 += fVar6.f17229d + f9;
            i21++;
            i20++;
        }
        this.f17187S = false;
    }

    public boolean f(View view, boolean z9, int i9, int i10, int i11) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && f(childAt, true, i9, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z9 && view.canScrollHorizontally(-i9);
    }

    public final void g(boolean z9) {
        boolean z10 = this.f17206j0 == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.f17207k.isFinished()) {
                this.f17207k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f17207k.getCurrX();
                int currY = this.f17207k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.f17220x = false;
        for (int i9 = 0; i9 < this.f17193c.size(); i9++) {
            f fVar = (f) this.f17193c.get(i9);
            if (fVar.f17228c) {
                fVar.f17228c = false;
                z10 = true;
            }
        }
        if (z10) {
            if (z9) {
                L.k0(this, this.f17204i0);
            } else {
                this.f17204i0.run();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public N0.a getAdapter() {
        return this.f17197f;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        if (this.f17200g0 == 2) {
            i10 = (i9 - 1) - i10;
        }
        return ((g) ((View) this.f17202h0.get(i10)).getLayoutParams()).f17236f;
    }

    public int getCurrentItem() {
        return this.f17199g;
    }

    public int getOffscreenPageLimit() {
        return this.f17221y;
    }

    public int getPageMargin() {
        return this.f17210n;
    }

    public void h() {
        int iC = this.f17197f.c();
        this.f17192a = iC;
        boolean z9 = this.f17193c.size() < (this.f17221y * 2) + 1 && this.f17193c.size() < iC;
        int iMax = this.f17199g;
        int i9 = 0;
        boolean z10 = false;
        while (i9 < this.f17193c.size()) {
            f fVar = (f) this.f17193c.get(i9);
            int iD = this.f17197f.d(fVar.f17226a);
            if (iD != -1) {
                if (iD == -2) {
                    this.f17193c.remove(i9);
                    i9--;
                    if (!z10) {
                        this.f17197f.n(this);
                        z10 = true;
                    }
                    this.f17197f.a(this, fVar.f17227b, fVar.f17226a);
                    int i10 = this.f17199g;
                    if (i10 == fVar.f17227b) {
                        iMax = Math.max(0, Math.min(i10, iC - 1));
                    }
                } else {
                    int i11 = fVar.f17227b;
                    if (i11 != iD) {
                        if (i11 == this.f17199g) {
                            iMax = iD;
                        }
                        fVar.f17227b = iD;
                    }
                }
                z9 = true;
            }
            i9++;
        }
        if (z10) {
            this.f17197f.b(this);
        }
        Collections.sort(this.f17193c, f17166l0);
        if (z9) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                g gVar = (g) getChildAt(i12).getLayoutParams();
                if (!gVar.f17231a) {
                    gVar.f17233c = 0.0f;
                }
            }
            N(iMax, false, true);
            requestLayout();
        }
    }

    public final int i(int i9, float f9, int i10, int i11) {
        if (Math.abs(i11) <= this.f17181M || Math.abs(i10) <= this.f17179K) {
            i9 += (int) (f9 + (i9 >= this.f17199g ? 0.4f : 0.6f));
        } else if (i10 <= 0) {
            i9++;
        }
        if (this.f17193c.size() <= 0) {
            return i9;
        }
        return Math.max(((f) this.f17193c.get(0)).f17227b, Math.min(i9, ((f) this.f17193c.get(r4.size() - 1)).f17227b));
    }

    public final void j(int i9, float f9, int i10) {
        j jVar = this.f17191W;
        if (jVar != null) {
            jVar.a(i9, f9, i10);
        }
        List list = this.f17190V;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.f17190V.get(i11);
                if (jVar2 != null) {
                    jVar2.a(i9, f9, i10);
                }
            }
        }
        j jVar3 = this.f17196e0;
        if (jVar3 != null) {
            jVar3.a(i9, f9, i10);
        }
    }

    public final void k(int i9) {
        j jVar = this.f17191W;
        if (jVar != null) {
            jVar.c(i9);
        }
        List list = this.f17190V;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar2 = (j) this.f17190V.get(i10);
                if (jVar2 != null) {
                    jVar2.c(i9);
                }
            }
        }
        j jVar3 = this.f17196e0;
        if (jVar3 != null) {
            jVar3.c(i9);
        }
    }

    public final void l(int i9) {
        j jVar = this.f17191W;
        if (jVar != null) {
            jVar.b(i9);
        }
        List list = this.f17190V;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar2 = (j) this.f17190V.get(i10);
                if (jVar2 != null) {
                    jVar2.b(i9);
                }
            }
        }
        j jVar3 = this.f17196e0;
        if (jVar3 != null) {
            jVar3.b(i9);
        }
    }

    public float m(float f9) {
        return (float) Math.sin((f9 - 0.5f) * 0.47123894f);
    }

    public final void n() {
        this.f17222z = false;
        this.f17169A = false;
        VelocityTracker velocityTracker = this.f17178J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17178J = null;
        }
    }

    public boolean o(KeyEvent keyEvent) {
        int i9;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return A();
                    }
                    i9 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return z();
                }
                i9 = 17;
            }
            return d(i9);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17186R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f17204i0);
        Scroller scroller = this.f17207k;
        if (scroller != null && !scroller.isFinished()) {
            this.f17207k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        float f9;
        float f10;
        super.onDraw(canvas);
        if (this.f17210n <= 0 || this.f17211o == null || this.f17193c.size() <= 0 || this.f17197f == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.f17210n / width;
        int i10 = 0;
        f fVar = (f) this.f17193c.get(0);
        float f12 = fVar.f17230e;
        int size = this.f17193c.size();
        int i11 = fVar.f17227b;
        int i12 = ((f) this.f17193c.get(size - 1)).f17227b;
        while (i11 < i12) {
            while (true) {
                i9 = fVar.f17227b;
                if (i11 <= i9 || i10 >= size) {
                    break;
                }
                i10++;
                fVar = (f) this.f17193c.get(i10);
            }
            if (i11 == i9) {
                float f13 = fVar.f17230e;
                float f14 = fVar.f17229d;
                f9 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float f15 = this.f17197f.f(i11);
                f9 = (f12 + f15) * width;
                f12 += f15 + f11;
            }
            if (this.f17210n + f9 > scrollX) {
                f10 = f11;
                this.f17211o.setBounds(Math.round(f9), this.f17212p, Math.round(this.f17210n + f9), this.f17213q);
                this.f17211o.draw(canvas);
            } else {
                f10 = f11;
            }
            if (f9 > scrollX + r2) {
                return;
            }
            i11++;
            f11 = f10;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            K();
            return false;
        }
        if (action != 0) {
            if (this.f17222z) {
                return true;
            }
            if (this.f17169A) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.f17175G = x9;
            this.f17173E = x9;
            float y9 = motionEvent.getY();
            this.f17176H = y9;
            this.f17174F = y9;
            this.f17177I = motionEvent.getPointerId(0);
            this.f17169A = false;
            this.f17208l = true;
            this.f17207k.computeScrollOffset();
            if (this.f17206j0 != 2 || Math.abs(this.f17207k.getFinalX() - this.f17207k.getCurrX()) <= this.f17182N) {
                g(false);
                this.f17222z = false;
            } else {
                this.f17207k.abortAnimation();
                this.f17220x = false;
                D();
                this.f17222z = true;
                J(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i9 = this.f17177I;
            if (i9 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i9);
                float x10 = motionEvent.getX(iFindPointerIndex);
                float f9 = x10 - this.f17173E;
                float fAbs = Math.abs(f9);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y10 - this.f17176H);
                if (f9 != 0.0f && !w(this.f17173E, f9) && f(this, false, (int) f9, (int) x10, (int) y10)) {
                    this.f17173E = x10;
                    this.f17174F = y10;
                    this.f17169A = true;
                    return false;
                }
                int i10 = this.f17172D;
                if (fAbs > i10 && fAbs * 0.5f > fAbs2) {
                    this.f17222z = true;
                    J(true);
                    setScrollState(1);
                    float f10 = this.f17175G;
                    float f11 = this.f17172D;
                    this.f17173E = f9 > 0.0f ? f10 + f11 : f10 - f11;
                    this.f17174F = y10;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i10) {
                    this.f17169A = true;
                }
                if (this.f17222z && C(x10)) {
                    L.j0(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.f17178J == null) {
            this.f17178J = VelocityTracker.obtain();
        }
        this.f17178J.addMovement(motionEvent);
        return this.f17222z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int i10;
        int i11;
        int i12;
        f fVarR;
        int childCount = getChildCount();
        if ((i9 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f17227b == this.f17199g && childAt.requestFocus(i9, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.a());
        N0.a aVar = this.f17197f;
        if (aVar != null) {
            aVar.j(lVar.f17240e, lVar.f17241f);
            N(lVar.f17239d, false, true);
        } else {
            this.f17201h = lVar.f17239d;
            this.f17203i = lVar.f17240e;
            this.f17205j = lVar.f17241f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f17239d = this.f17199g;
        N0.a aVar = this.f17197f;
        if (aVar != null) {
            lVar.f17240e = aVar.k();
        }
        return lVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            int i13 = this.f17210n;
            F(i9, i11, i13, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            bottom = rect.bottom + view.getBottom();
        }
        return rect;
    }

    public f q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public f r(View view) {
        for (int i9 = 0; i9 < this.f17193c.size(); i9++) {
            f fVar = (f) this.f17193c.get(i9);
            if (this.f17197f.h(view, fVar.f17226a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f17218v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final f s() {
        int i9;
        int clientWidth = getClientWidth();
        float f9 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.f17210n / clientWidth : 0.0f;
        f fVar = null;
        float f11 = 0.0f;
        int i10 = -1;
        int i11 = 0;
        boolean z9 = true;
        while (i11 < this.f17193c.size()) {
            f fVar2 = (f) this.f17193c.get(i11);
            if (!z9 && fVar2.f17227b != (i9 = i10 + 1)) {
                fVar2 = this.f17194d;
                fVar2.f17230e = f9 + f11 + f10;
                fVar2.f17227b = i9;
                fVar2.f17229d = this.f17197f.f(i9);
                i11--;
            }
            f fVar3 = fVar2;
            f9 = fVar3.f17230e;
            float f12 = fVar3.f17229d + f9 + f10;
            if (!z9 && scrollX < f9) {
                return fVar;
            }
            if (scrollX < f12 || i11 == this.f17193c.size() - 1) {
                return fVar3;
            }
            int i12 = fVar3.f17227b;
            float f13 = fVar3.f17229d;
            i11++;
            z9 = false;
            i10 = i12;
            f11 = f13;
            fVar = fVar3;
        }
        return fVar;
    }

    public void setAdapter(N0.a aVar) {
        N0.a aVar2 = this.f17197f;
        if (aVar2 != null) {
            aVar2.m(null);
            this.f17197f.n(this);
            for (int i9 = 0; i9 < this.f17193c.size(); i9++) {
                f fVar = (f) this.f17193c.get(i9);
                this.f17197f.a(this, fVar.f17227b, fVar.f17226a);
            }
            this.f17197f.b(this);
            this.f17193c.clear();
            G();
            this.f17199g = 0;
            scrollTo(0, 0);
        }
        N0.a aVar3 = this.f17197f;
        this.f17197f = aVar;
        this.f17192a = 0;
        if (aVar != null) {
            if (this.f17209m == null) {
                this.f17209m = new k();
            }
            this.f17197f.m(this.f17209m);
            this.f17220x = false;
            boolean z9 = this.f17186R;
            this.f17186R = true;
            this.f17192a = this.f17197f.c();
            if (this.f17201h >= 0) {
                this.f17197f.j(this.f17203i, this.f17205j);
                N(this.f17201h, false, true);
                this.f17201h = -1;
                this.f17203i = null;
                this.f17205j = null;
            } else if (z9) {
                requestLayout();
            } else {
                D();
            }
        }
        List list = this.f17198f0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f17198f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i) this.f17198f0.get(i10)).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i9) {
        this.f17220x = false;
        N(i9, !this.f17186R, false);
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i9 + " too small; defaulting to 1");
            i9 = 1;
        }
        if (i9 != this.f17221y) {
            this.f17221y = i9;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f17191W = jVar;
    }

    public void setPageMargin(int i9) {
        int i10 = this.f17210n;
        this.f17210n = i9;
        int width = getWidth();
        F(width, width, i9, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(int i9) {
        setPageMarginDrawable(E.b.getDrawable(getContext(), i9));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f17211o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i9) {
        if (this.f17206j0 == i9) {
            return;
        }
        this.f17206j0 = i9;
        l(i9);
    }

    public f t(int i9) {
        for (int i10 = 0; i10 < this.f17193c.size(); i10++) {
            f fVar = (f) this.f17193c.get(i10);
            if (fVar.f17227b == i9) {
                return fVar;
            }
        }
        return null;
    }

    public void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f17207k = new Scroller(context, f17167m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f17172D = viewConfiguration.getScaledPagingTouchSlop();
        this.f17179K = (int) (400.0f * f9);
        this.f17180L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17184P = new EdgeEffect(context);
        this.f17185Q = new EdgeEffect(context);
        this.f17181M = (int) (25.0f * f9);
        this.f17182N = (int) (2.0f * f9);
        this.f17170B = (int) (f9 * 16.0f);
        L.s0(this, new h());
        if (L.C(this) == 0) {
            L.C0(this, 1);
        }
        L.E0(this, new d());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17211o;
    }

    public final boolean w(float f9, float f10) {
        return (f9 < ((float) this.f17171C) && f10 > 0.0f) || (f9 > ((float) (getWidth() - this.f17171C)) && f10 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f17189U
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.f17231a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.f17232b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.j(r12, r13, r14)
            r11.f17188T = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.x(int, float, int):void");
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17177I) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.f17173E = motionEvent.getX(i9);
            this.f17177I = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.f17178J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean z() {
        int i9 = this.f17199g;
        if (i9 <= 0) {
            return false;
        }
        M(i9 - 1, true);
        return true;
    }
}
