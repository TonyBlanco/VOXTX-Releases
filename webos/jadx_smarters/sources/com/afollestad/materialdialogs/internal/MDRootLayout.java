package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import d1.AbstractC1650b;
import d1.EnumC1649a;
import d1.e;
import d1.f;
import e1.AbstractC1730a;

/* JADX INFO: loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MDButton[] f18334a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f18336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f18337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f18340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EnumC1649a f18348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f18350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewTreeObserver.OnScrollChangedListener f18351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewTreeObserver.OnScrollChangedListener f18352t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18353u;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f18354a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18356d;

        public a(View view, boolean z9, boolean z10) {
            this.f18354a = view;
            this.f18355c = z9;
            this.f18356d = z10;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f18354a.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.l((WebView) this.f18354a)) {
                MDRootLayout.this.h((ViewGroup) this.f18354a, this.f18355c, this.f18356d);
            } else {
                if (this.f18355c) {
                    MDRootLayout.this.f18338f = false;
                }
                if (this.f18356d) {
                    MDRootLayout.this.f18339g = false;
                }
            }
            this.f18354a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public class b extends RecyclerView.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f18359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18360c;

        public b(ViewGroup viewGroup, boolean z9, boolean z10) {
            this.f18358a = viewGroup;
            this.f18359b = z9;
            this.f18360c = z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i9, int i10) {
            super.b(recyclerView, i9, i10);
            MDButton[] mDButtonArr = MDRootLayout.this.f18334a;
            int length = mDButtonArr.length;
            boolean z9 = false;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    MDButton mDButton = mDButtonArr[i11];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z9 = true;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.p(this.f18358a, this.f18359b, this.f18360c, z9);
            MDRootLayout.this.invalidate();
        }
    }

    public class c implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18362a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f18364d;

        public c(ViewGroup viewGroup, boolean z9, boolean z10) {
            this.f18362a = viewGroup;
            this.f18363c = z9;
            this.f18364d = z10;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f18334a;
            int length = mDButtonArr.length;
            boolean z9 = false;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    MDButton mDButton = mDButtonArr[i9];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z9 = true;
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f18362a;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.q((WebView) viewGroup, this.f18363c, this.f18364d, z9);
            } else {
                MDRootLayout.this.p(viewGroup, this.f18363c, this.f18364d, z9);
            }
            MDRootLayout.this.invalidate();
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18366a;

        static {
            int[] iArr = new int[EnumC1649a.values().length];
            f18366a = iArr;
            try {
                iArr[EnumC1649a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18366a[EnumC1649a.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18334a = new MDButton[3];
        this.f18338f = false;
        this.f18339g = false;
        this.f18340h = f.ADAPTIVE;
        this.f18341i = false;
        this.f18342j = true;
        this.f18348p = EnumC1649a.START;
        o(context, attributeSet, 0);
    }

    public static boolean i(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    public static boolean j(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().I()) ? false : true;
    }

    public static boolean k(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    public static boolean l(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    public static View m(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    public static View n(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    public static boolean s(View view) {
        boolean z9 = (view == null || view.getVisibility() == 8) ? false : true;
        if (z9 && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z9;
    }

    public final void h(ViewGroup viewGroup, boolean z9, boolean z10) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        if ((z10 || this.f18351s != null) && !(z10 && this.f18352t == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            b bVar = new b(viewGroup, z9, z10);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.l(bVar);
            bVar.b(recyclerView, 0, 0);
            return;
        }
        c cVar = new c(viewGroup, z9, z10);
        if (z10) {
            this.f18352t = cVar;
            viewTreeObserver = viewGroup.getViewTreeObserver();
            onScrollChangedListener = this.f18352t;
        } else {
            this.f18351s = cVar;
            viewTreeObserver = viewGroup.getViewTreeObserver();
            onScrollChangedListener = this.f18351s;
        }
        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
        cVar.onScrollChanged();
    }

    public final void o(Context context, AttributeSet attributeSet, int i9) {
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f39512u, i9, 0);
        this.f18343k = typedArrayObtainStyledAttributes.getBoolean(e.f39513v, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f18345m = resources.getDimensionPixelSize(d1.c.f39475g);
        this.f18346n = resources.getDimensionPixelSize(d1.c.f39469a);
        this.f18349q = resources.getDimensionPixelSize(d1.c.f39471c);
        this.f18347o = resources.getDimensionPixelSize(d1.c.f39470b);
        this.f18350r = new Paint();
        this.f18353u = resources.getDimensionPixelSize(d1.c.f39473e);
        this.f18350r.setColor(AbstractC1730a.a(context, AbstractC1650b.f39468a));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f18337e;
        if (view != null) {
            if (this.f18338f) {
                canvas.drawRect(0.0f, r0 - this.f18353u, getMeasuredWidth(), view.getTop(), this.f18350r);
            }
            if (this.f18339g) {
                canvas.drawRect(0.0f, this.f18337e.getBottom(), getMeasuredWidth(), r0 + this.f18353u, this.f18350r);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getId() == d1.d.f39479d) {
                this.f18336d = childAt;
            } else if (childAt.getId() == d1.d.f39477b) {
                this.f18334a[0] = (MDButton) childAt;
            } else if (childAt.getId() == d1.d.f39476a) {
                this.f18334a[1] = (MDButton) childAt;
            } else if (childAt.getId() == d1.d.f39478c) {
                this.f18334a[2] = (MDButton) childAt;
            } else {
                this.f18337e = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int measuredWidth;
        int measuredWidth2;
        MDButton mDButton;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        if (s(this.f18336d)) {
            int measuredHeight = this.f18336d.getMeasuredHeight() + i10;
            this.f18336d.layout(i9, i10, i11, measuredHeight);
            i10 = measuredHeight;
        } else if (!this.f18344l && this.f18342j) {
            i10 += this.f18345m;
        }
        if (s(this.f18337e)) {
            View view = this.f18337e;
            view.layout(i9, i10, i11, view.getMeasuredHeight() + i10);
        }
        if (this.f18341i) {
            int measuredHeight2 = i12 - this.f18346n;
            for (MDButton mDButton2 : this.f18334a) {
                if (s(mDButton2)) {
                    mDButton2.layout(i9, measuredHeight2 - mDButton2.getMeasuredHeight(), i11, measuredHeight2);
                    measuredHeight2 -= mDButton2.getMeasuredHeight();
                }
            }
        } else {
            if (this.f18342j) {
                i12 -= this.f18346n;
            }
            int i13 = i12 - this.f18347o;
            int measuredWidth9 = this.f18349q;
            if (s(this.f18334a[2])) {
                if (this.f18348p == EnumC1649a.END) {
                    measuredWidth7 = i9 + measuredWidth9;
                    measuredWidth8 = this.f18334a[2].getMeasuredWidth() + measuredWidth7;
                    measuredWidth = -1;
                } else {
                    int i14 = i11 - measuredWidth9;
                    measuredWidth7 = i14 - this.f18334a[2].getMeasuredWidth();
                    measuredWidth8 = i14;
                    measuredWidth = measuredWidth7;
                }
                this.f18334a[2].layout(measuredWidth7, i13, measuredWidth8, i12);
                measuredWidth9 += this.f18334a[2].getMeasuredWidth();
            } else {
                measuredWidth = -1;
            }
            if (s(this.f18334a[1])) {
                EnumC1649a enumC1649a = this.f18348p;
                if (enumC1649a == EnumC1649a.END) {
                    measuredWidth5 = measuredWidth9 + i9;
                    measuredWidth6 = this.f18334a[1].getMeasuredWidth() + measuredWidth5;
                } else if (enumC1649a == EnumC1649a.START) {
                    measuredWidth6 = i11 - measuredWidth9;
                    measuredWidth5 = measuredWidth6 - this.f18334a[1].getMeasuredWidth();
                } else {
                    measuredWidth5 = this.f18349q + i9;
                    measuredWidth6 = this.f18334a[1].getMeasuredWidth() + measuredWidth5;
                    measuredWidth2 = measuredWidth6;
                    this.f18334a[1].layout(measuredWidth5, i13, measuredWidth6, i12);
                }
                measuredWidth2 = -1;
                this.f18334a[1].layout(measuredWidth5, i13, measuredWidth6, i12);
            } else {
                measuredWidth2 = -1;
            }
            if (s(this.f18334a[0])) {
                EnumC1649a enumC1649a2 = this.f18348p;
                if (enumC1649a2 == EnumC1649a.END) {
                    measuredWidth3 = i11 - this.f18349q;
                    measuredWidth4 = measuredWidth3 - this.f18334a[0].getMeasuredWidth();
                } else if (enumC1649a2 == EnumC1649a.START) {
                    measuredWidth4 = i9 + this.f18349q;
                    measuredWidth3 = this.f18334a[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth2 != -1 || measuredWidth == -1) {
                        if (measuredWidth == -1 && measuredWidth2 != -1) {
                            mDButton = this.f18334a[0];
                        } else if (measuredWidth == -1) {
                            measuredWidth2 = ((i11 - i9) / 2) - (this.f18334a[0].getMeasuredWidth() / 2);
                            mDButton = this.f18334a[0];
                        }
                        measuredWidth = measuredWidth2 + mDButton.getMeasuredWidth();
                    } else {
                        measuredWidth2 = measuredWidth - this.f18334a[0].getMeasuredWidth();
                    }
                    measuredWidth3 = measuredWidth;
                    measuredWidth4 = measuredWidth2;
                }
                this.f18334a[0].layout(measuredWidth4, i13, measuredWidth3, i12);
            }
        }
        t(this.f18337e, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public final void p(ViewGroup viewGroup, boolean z9, boolean z10, boolean z11) {
        if (z9 && viewGroup.getChildCount() > 0) {
            View view = this.f18336d;
            this.f18338f = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z10 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f18339g = z11 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    public final void q(WebView webView, boolean z9, boolean z10, boolean z11) {
        boolean z12 = false;
        if (z9) {
            View view = this.f18336d;
            this.f18338f = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z10) {
            if (z11 && (webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom() < webView.getContentHeight() * webView.getScale()) {
                z12 = true;
            }
            this.f18339g = z12;
        }
    }

    public final void r() {
        EnumC1649a enumC1649a;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i9 = d.f18366a[this.f18348p.ordinal()];
            if (i9 == 1) {
                enumC1649a = EnumC1649a.END;
            } else if (i9 != 2) {
                return;
            } else {
                enumC1649a = EnumC1649a.START;
            }
            this.f18348p = enumC1649a;
        }
    }

    public void setButtonGravity(EnumC1649a enumC1649a) {
        this.f18348p = enumC1649a;
        r();
    }

    public void setButtonStackedGravity(EnumC1649a enumC1649a) {
        for (MDButton mDButton : this.f18334a) {
            if (mDButton != null) {
                mDButton.setStackedGravity(enumC1649a);
            }
        }
    }

    public void setDividerColor(int i9) {
        this.f18350r.setColor(i9);
        invalidate();
    }

    public void setMaxHeight(int i9) {
        this.f18335c = i9;
    }

    public void setStackingBehavior(f fVar) {
        this.f18340h = fVar;
        invalidate();
    }

    public final void t(View view, boolean z9, boolean z10) {
        ViewGroup viewGroup;
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            boolean zK = k(scrollView);
            viewGroup = scrollView;
            if (!zK) {
                if (z9) {
                    this.f18338f = false;
                }
                if (!z10) {
                    return;
                }
                this.f18339g = false;
                return;
            }
            h(viewGroup, z9, z10);
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            boolean zI = i(adapterView);
            viewGroup = adapterView;
            if (!zI) {
                if (z9) {
                    this.f18338f = false;
                }
                if (!z10) {
                    return;
                }
                this.f18339g = false;
                return;
            }
        } else {
            if (view instanceof WebView) {
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, z9, z10));
                return;
            }
            if (!(view instanceof RecyclerView)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    View viewN = n(viewGroup2);
                    t(viewN, z9, z10);
                    View viewM = m(viewGroup2);
                    if (viewM != viewN) {
                        t(viewM, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            boolean zJ = j((RecyclerView) view);
            if (z9) {
                this.f18338f = zJ;
            }
            if (z10) {
                this.f18339g = zJ;
            }
            if (!zJ) {
                return;
            } else {
                viewGroup = (ViewGroup) view;
            }
        }
        h(viewGroup, z9, z10);
    }
}
