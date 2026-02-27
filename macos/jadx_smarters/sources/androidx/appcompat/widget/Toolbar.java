package androidx.appcompat.widget;

import P.AbstractC0974p;
import P.AbstractC0976s;
import P.C0979v;
import P.L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.k;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC1238a;
import c.j;
import d.AbstractC1622a;
import e.AbstractC1726a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.C2119n;
import k.H;
import k.X;
import k.d0;
import k.g0;
import k.m0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f14109A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f14110B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14111C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f14112D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f14113E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f14114F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f14115G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0979v f14116H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f14117I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public h f14118J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ActionMenuView.e f14119K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public androidx.appcompat.widget.d f14120L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public androidx.appcompat.widget.a f14121M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public f f14122N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public i.a f14123O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public e.a f14124P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f14125Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public OnBackInvokedCallback f14126R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public OnBackInvokedDispatcher f14127S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f14128T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final Runnable f14129U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f14130a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f14131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f14132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageButton f14133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f14134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f14135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f14136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f14137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f14138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f14139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X f14149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f14153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f14154z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f14116H.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f14118J;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f14124P;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f14130a.J()) {
                Toolbar.this.f14116H.k(eVar);
            }
            e.a aVar = Toolbar.this.f14124P;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new k(runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f14159a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.appcompat.view.menu.g f14160c;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f14137i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f14137i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f14137i);
            }
            Toolbar.this.f14138j = gVar.getActionView();
            this.f14160c = gVar;
            ViewParent parent2 = Toolbar.this.f14138j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f14138j);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f39307a = (toolbar4.f14143o & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f14162b = 2;
                toolbar4.f14138j.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f14138j);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f14138j;
            if (callback instanceof i.c) {
                ((i.c) callback).b();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void f(boolean z9) {
            if (this.f14160c != null) {
                androidx.appcompat.view.menu.e eVar = this.f14159a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        if (this.f14159a.getItem(i9) == this.f14160c) {
                            return;
                        }
                    }
                }
                h(this.f14159a, this.f14160c);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f14138j;
            if (callback instanceof i.c) {
                ((i.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f14138j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f14137i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f14138j = null;
            toolbar3.a();
            this.f14160c = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f14159a;
            if (eVar2 != null && (gVar = this.f14160c) != null) {
                eVar2.f(gVar);
            }
            this.f14159a = eVar;
        }
    }

    public static class g extends AbstractC1622a.C0309a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14162b;

        public g(int i9, int i10) {
            super(i9, i10);
            this.f14162b = 0;
            this.f39307a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14162b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14162b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14162b = 0;
            a(marginLayoutParams);
        }

        public g(g gVar) {
            super((AbstractC1622a.C0309a) gVar);
            this.f14162b = 0;
            this.f14162b = gVar.f14162b;
        }

        public g(AbstractC1622a.C0309a c0309a) {
            super(c0309a);
            this.f14162b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends V.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f14164e;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i9) {
                return new i[i9];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14163d = parcel.readInt();
            this.f14164e = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f14163d);
            parcel.writeInt(this.f14164e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17741R);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14152x = 8388627;
        this.f14113E = new ArrayList();
        this.f14114F = new ArrayList();
        this.f14115G = new int[2];
        this.f14116H = new C0979v(new Runnable() { // from class: k.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f43324a.y();
            }
        });
        this.f14117I = new ArrayList();
        this.f14119K = new a();
        this.f14129U = new b();
        d0 d0VarV = d0.v(getContext(), attributeSet, j.f18117n3, i9, 0);
        L.q0(this, context, j.f18117n3, attributeSet, d0VarV.r(), i9, 0);
        this.f14141m = d0VarV.n(j.f17995P3, 0);
        this.f14142n = d0VarV.n(j.f17950G3, 0);
        this.f14152x = d0VarV.l(j.f18122o3, this.f14152x);
        this.f14143o = d0VarV.l(j.f18127p3, 48);
        int iE = d0VarV.e(j.f17965J3, 0);
        iE = d0VarV.s(j.f17990O3) ? d0VarV.e(j.f17990O3, iE) : iE;
        this.f14148t = iE;
        this.f14147s = iE;
        this.f14146r = iE;
        this.f14145q = iE;
        int iE2 = d0VarV.e(j.f17980M3, -1);
        if (iE2 >= 0) {
            this.f14145q = iE2;
        }
        int iE3 = d0VarV.e(j.f17975L3, -1);
        if (iE3 >= 0) {
            this.f14146r = iE3;
        }
        int iE4 = d0VarV.e(j.f17985N3, -1);
        if (iE4 >= 0) {
            this.f14147s = iE4;
        }
        int iE5 = d0VarV.e(j.f17970K3, -1);
        if (iE5 >= 0) {
            this.f14148t = iE5;
        }
        this.f14144p = d0VarV.f(j.f17920A3, -1);
        int iE6 = d0VarV.e(j.f18162w3, Integer.MIN_VALUE);
        int iE7 = d0VarV.e(j.f18142s3, Integer.MIN_VALUE);
        int iF = d0VarV.f(j.f18152u3, 0);
        int iF2 = d0VarV.f(j.f18157v3, 0);
        h();
        this.f14149u.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f14149u.g(iE6, iE7);
        }
        this.f14150v = d0VarV.e(j.f18167x3, Integer.MIN_VALUE);
        this.f14151w = d0VarV.e(j.f18147t3, Integer.MIN_VALUE);
        this.f14135g = d0VarV.g(j.f18137r3);
        this.f14136h = d0VarV.p(j.f18132q3);
        CharSequence charSequenceP = d0VarV.p(j.f17960I3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = d0VarV.p(j.f17945F3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f14139k = getContext();
        setPopupTheme(d0VarV.n(j.f17940E3, 0));
        Drawable drawableG = d0VarV.g(j.f17935D3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = d0VarV.p(j.f17930C3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = d0VarV.g(j.f18172y3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = d0VarV.p(j.f18177z3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (d0VarV.s(j.f18000Q3)) {
            setTitleTextColor(d0VarV.c(j.f18000Q3));
        }
        if (d0VarV.s(j.f17955H3)) {
            setSubtitleTextColor(d0VarV.c(j.f17955H3));
        }
        if (d0VarV.s(j.f17925B3)) {
            x(d0VarV.n(j.f17925B3, 0));
        }
        d0VarV.w();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i9 = 0; i9 < menu.size(); i9++) {
            arrayList.add(menu.getItem(i9));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f14130a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f14130a;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int C(View view, int i9, int[] iArr, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i9 + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        int iQ = q(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int D(View view, int i9, int[] iArr, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i9 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iQ = q(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int E(View view, int i9, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i13) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i9, getPaddingLeft() + getPaddingRight() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void F(View view, int i9, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f14116H.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f14117I = currentMenuItems2;
    }

    public final void H() {
        removeCallbacks(this.f14129U);
        post(this.f14129U);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f14162b != 2 && childAt != this.f14130a) {
                removeViewAt(childCount);
                this.f14114F.add(childAt);
            }
        }
    }

    public void J(int i9, int i10) {
        h();
        this.f14149u.g(i9, i10);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.f14130a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarN = this.f14130a.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.O(this.f14121M);
            eVarN.O(this.f14122N);
        }
        if (this.f14122N == null) {
            this.f14122N = new f();
        }
        aVar.G(true);
        if (eVar != null) {
            eVar.c(aVar, this.f14139k);
            eVar.c(this.f14122N, this.f14139k);
        } else {
            aVar.i(this.f14139k, null);
            this.f14122N.i(this.f14139k, null);
            aVar.f(true);
            this.f14122N.f(true);
        }
        this.f14130a.setPopupTheme(this.f14140l);
        this.f14130a.setPresenter(aVar);
        this.f14121M = aVar;
        R();
    }

    public void L(i.a aVar, e.a aVar2) {
        this.f14123O = aVar;
        this.f14124P = aVar2;
        ActionMenuView actionMenuView = this.f14130a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i9) {
        this.f14142n = i9;
        TextView textView = this.f14132d;
        if (textView != null) {
            textView.setTextAppearance(context, i9);
        }
    }

    public void N(Context context, int i9) {
        this.f14141m = i9;
        TextView textView = this.f14131c;
        if (textView != null) {
            textView.setTextAppearance(context, i9);
        }
    }

    public final boolean O() {
        if (!this.f14125Q) {
            return false;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f14130a;
        return actionMenuView != null && actionMenuView.P();
    }

    public void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z9 = v() && onBackInvokedDispatcherA != null && L.V(this) && this.f14128T;
            if (z9 && this.f14127S == null) {
                if (this.f14126R == null) {
                    this.f14126R = e.b(new Runnable() { // from class: k.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f43319a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f14126R);
            } else {
                if (z9 || (onBackInvokedDispatcher = this.f14127S) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.f14126R);
                onBackInvokedDispatcherA = null;
            }
            this.f14127S = onBackInvokedDispatcherA;
        }
    }

    public void a() {
        for (int size = this.f14114F.size() - 1; size >= 0; size--) {
            addView((View) this.f14114F.get(size));
        }
        this.f14114F.clear();
    }

    public final void b(List list, int i9) {
        boolean z9 = L.E(this) == 1;
        int childCount = getChildCount();
        int iB = AbstractC0974p.b(i9, L.E(this));
        list.clear();
        if (!z9) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14162b == 0 && P(childAt) && p(gVar.f39307a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt2 = getChildAt(i11);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f14162b == 0 && P(childAt2) && p(gVar2.f39307a) == iB) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f14162b = 1;
        if (!z9 || this.f14138j == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f14114F.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f14130a) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f14122N;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f14160c;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f14130a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.f14137i == null) {
            C2119n c2119n = new C2119n(getContext(), null, AbstractC1238a.f17740Q);
            this.f14137i = c2119n;
            c2119n.setImageDrawable(this.f14135g);
            this.f14137i.setContentDescription(this.f14136h);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f39307a = (this.f14143o & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f14162b = 2;
            this.f14137i.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f14137i.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f14137i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f14137i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        X x9 = this.f14149u;
        if (x9 != null) {
            return x9.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i9 = this.f14151w;
        return i9 != Integer.MIN_VALUE ? i9 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        X x9 = this.f14149u;
        if (x9 != null) {
            return x9.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        X x9 = this.f14149u;
        if (x9 != null) {
            return x9.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        X x9 = this.f14149u;
        if (x9 != null) {
            return x9.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i9 = this.f14150v;
        return i9 != Integer.MIN_VALUE ? i9 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.f14130a;
        return (actionMenuView == null || (eVarN = actionMenuView.N()) == null || !eVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f14151w, 0));
    }

    public int getCurrentContentInsetLeft() {
        return L.E(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return L.E(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f14150v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f14134f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f14134f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f14130a.getMenu();
    }

    public View getNavButtonView() {
        return this.f14133e;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f14133e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f14133e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f14121M;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f14130a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f14139k;
    }

    public int getPopupTheme() {
        return this.f14140l;
    }

    public CharSequence getSubtitle() {
        return this.f14154z;
    }

    public final TextView getSubtitleTextView() {
        return this.f14132d;
    }

    public CharSequence getTitle() {
        return this.f14153y;
    }

    public int getTitleMarginBottom() {
        return this.f14148t;
    }

    public int getTitleMarginEnd() {
        return this.f14146r;
    }

    public int getTitleMarginStart() {
        return this.f14145q;
    }

    public int getTitleMarginTop() {
        return this.f14147s;
    }

    public final TextView getTitleTextView() {
        return this.f14131c;
    }

    public H getWrapper() {
        if (this.f14120L == null) {
            this.f14120L = new androidx.appcompat.widget.d(this, true);
        }
        return this.f14120L;
    }

    public final void h() {
        if (this.f14149u == null) {
            this.f14149u = new X();
        }
    }

    public final void i() {
        if (this.f14134f == null) {
            this.f14134f = new AppCompatImageView(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f14130a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f14130a.getMenu();
            if (this.f14122N == null) {
                this.f14122N = new f();
            }
            this.f14130a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f14122N, this.f14139k);
            R();
        }
    }

    public final void k() {
        if (this.f14130a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f14130a = actionMenuView;
            actionMenuView.setPopupTheme(this.f14140l);
            this.f14130a.setOnMenuItemClickListener(this.f14119K);
            this.f14130a.O(this.f14123O, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f39307a = (this.f14143o & 112) | 8388613;
            this.f14130a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f14130a, false);
        }
    }

    public final void l() {
        if (this.f14133e == null) {
            this.f14133e = new C2119n(getContext(), null, AbstractC1238a.f17740Q);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f39307a = (this.f14143o & 112) | 8388611;
            this.f14133e.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC1622a.C0309a ? new g((AbstractC1622a.C0309a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f14129U);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f14112D = false;
        }
        if (!this.f14112D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f14112D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f14112D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0297 A[LOOP:0: B:111:0x0295->B:112:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b9 A[LOOP:1: B:114:0x02b7->B:115:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f2 A[LOOP:2: B:123:0x02f0->B:124:0x02f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int iMax2;
        int measuredHeight;
        int[] iArr = this.f14115G;
        boolean zB = m0.b(this);
        int i11 = !zB ? 1 : 0;
        if (P(this.f14133e)) {
            F(this.f14133e, i9, 0, i10, 0, this.f14144p);
            measuredWidth = this.f14133e.getMeasuredWidth() + s(this.f14133e);
            iMax = Math.max(0, this.f14133e.getMeasuredHeight() + t(this.f14133e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f14133e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f14137i)) {
            F(this.f14137i, i9, 0, i10, 0, this.f14144p);
            measuredWidth = this.f14137i.getMeasuredWidth() + s(this.f14137i);
            iMax = Math.max(iMax, this.f14137i.getMeasuredHeight() + t(this.f14137i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14137i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f14130a)) {
            F(this.f14130a, i9, iMax3, i10, 0, this.f14144p);
            measuredWidth2 = this.f14130a.getMeasuredWidth() + s(this.f14130a);
            iMax = Math.max(iMax, this.f14130a.getMeasuredHeight() + t(this.f14130a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14130a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i11] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f14138j)) {
            iMax4 += E(this.f14138j, i9, iMax4, i10, 0, iArr);
            iMax = Math.max(iMax, this.f14138j.getMeasuredHeight() + t(this.f14138j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14138j.getMeasuredState());
        }
        if (P(this.f14134f)) {
            iMax4 += E(this.f14134f, i9, iMax4, i10, 0, iArr);
            iMax = Math.max(iMax, this.f14134f.getMeasuredHeight() + t(this.f14134f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f14134f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((g) childAt.getLayoutParams()).f14162b == 0 && P(childAt)) {
                iMax4 += E(childAt, i9, iMax4, i10, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i13 = this.f14147s + this.f14148t;
        int i14 = this.f14145q + this.f14146r;
        if (P(this.f14131c)) {
            E(this.f14131c, i9, iMax4 + i14, i10, i13, iArr);
            int measuredWidth3 = this.f14131c.getMeasuredWidth() + s(this.f14131c);
            measuredHeight = this.f14131c.getMeasuredHeight() + t(this.f14131c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f14131c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            measuredHeight = 0;
        }
        if (P(this.f14132d)) {
            iMax2 = Math.max(iMax2, E(this.f14132d, i9, iMax4 + i14, i10, measuredHeight + i13, iArr));
            measuredHeight += this.f14132d.getMeasuredHeight() + t(this.f14132d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f14132d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i9, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(iMax5 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f14130a;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i9 = iVar.f14163d;
        if (i9 != 0 && this.f14122N != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i9)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f14164e) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        h();
        this.f14149u.f(i9 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f14122N;
        if (fVar != null && (gVar = fVar.f14160c) != null) {
            iVar.f14163d = gVar.getItemId();
        }
        iVar.f14164e = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f14111C = false;
        }
        if (!this.f14111C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f14111C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f14111C = false;
        }
        return true;
    }

    public final int p(int i9) {
        int iE = L.E(this);
        int iB = AbstractC0974p.b(i9, iE) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : iE == 1 ? 5 : 3;
    }

    public final int q(View view, int i9) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i9 > 0 ? (measuredHeight - i9) / 2 : 0;
        int iR = r(gVar.f39307a);
        if (iR == 48) {
            return getPaddingTop() - i10;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i11) {
            iMax = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i12 < i13) {
                iMax = Math.max(0, iMax - (i13 - i12));
            }
        }
        return paddingTop + iMax;
    }

    public final int r(int i9) {
        int i10 = i9 & 112;
        return (i10 == 16 || i10 == 48 || i10 == 80) ? i10 : this.f14152x & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0976s.b(marginLayoutParams) + AbstractC0976s.a(marginLayoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.f14128T != z9) {
            this.f14128T = z9;
            R();
        }
    }

    public void setCollapseContentDescription(int i9) {
        setCollapseContentDescription(i9 != 0 ? getContext().getText(i9) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f14137i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i9) {
        setCollapseIcon(AbstractC1726a.b(getContext(), i9));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f14137i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f14137i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f14135g);
            }
        }
    }

    public void setCollapsible(boolean z9) {
        this.f14125Q = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i9) {
        if (i9 < 0) {
            i9 = Integer.MIN_VALUE;
        }
        if (i9 != this.f14151w) {
            this.f14151w = i9;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i9) {
        if (i9 < 0) {
            i9 = Integer.MIN_VALUE;
        }
        if (i9 != this.f14150v) {
            this.f14150v = i9;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i9) {
        setLogo(AbstractC1726a.b(getContext(), i9));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f14134f)) {
                c(this.f14134f, true);
            }
        } else {
            ImageView imageView = this.f14134f;
            if (imageView != null && z(imageView)) {
                removeView(this.f14134f);
                this.f14114F.remove(this.f14134f);
            }
        }
        ImageView imageView2 = this.f14134f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i9) {
        setLogoDescription(getContext().getText(i9));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f14134f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i9) {
        setNavigationContentDescription(i9 != 0 ? getContext().getText(i9) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f14133e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            g0.a(this.f14133e, charSequence);
        }
    }

    public void setNavigationIcon(int i9) {
        setNavigationIcon(AbstractC1726a.b(getContext(), i9));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f14133e)) {
                c(this.f14133e, true);
            }
        } else {
            ImageButton imageButton = this.f14133e;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f14133e);
                this.f14114F.remove(this.f14133e);
            }
        }
        ImageButton imageButton2 = this.f14133e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f14133e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f14118J = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f14130a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i9) {
        if (this.f14140l != i9) {
            this.f14140l = i9;
            if (i9 == 0) {
                this.f14139k = getContext();
            } else {
                this.f14139k = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setSubtitle(int i9) {
        setSubtitle(getContext().getText(i9));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f14132d;
            if (textView != null && z(textView)) {
                removeView(this.f14132d);
                this.f14114F.remove(this.f14132d);
            }
        } else {
            if (this.f14132d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f14132d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f14132d.setEllipsize(TextUtils.TruncateAt.END);
                int i9 = this.f14142n;
                if (i9 != 0) {
                    this.f14132d.setTextAppearance(context, i9);
                }
                ColorStateList colorStateList = this.f14110B;
                if (colorStateList != null) {
                    this.f14132d.setTextColor(colorStateList);
                }
            }
            if (!z(this.f14132d)) {
                c(this.f14132d, true);
            }
        }
        TextView textView2 = this.f14132d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f14154z = charSequence;
    }

    public void setSubtitleTextColor(int i9) {
        setSubtitleTextColor(ColorStateList.valueOf(i9));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f14110B = colorStateList;
        TextView textView = this.f14132d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i9) {
        setTitle(getContext().getText(i9));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f14131c;
            if (textView != null && z(textView)) {
                removeView(this.f14131c);
                this.f14114F.remove(this.f14131c);
            }
        } else {
            if (this.f14131c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f14131c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f14131c.setEllipsize(TextUtils.TruncateAt.END);
                int i9 = this.f14141m;
                if (i9 != 0) {
                    this.f14131c.setTextAppearance(context, i9);
                }
                ColorStateList colorStateList = this.f14109A;
                if (colorStateList != null) {
                    this.f14131c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f14131c)) {
                c(this.f14131c, true);
            }
        }
        TextView textView2 = this.f14131c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f14153y = charSequence;
    }

    public void setTitleMarginBottom(int i9) {
        this.f14148t = i9;
        requestLayout();
    }

    public void setTitleMarginEnd(int i9) {
        this.f14146r = i9;
        requestLayout();
    }

    public void setTitleMarginStart(int i9) {
        this.f14145q = i9;
        requestLayout();
    }

    public void setTitleMarginTop(int i9) {
        this.f14147s = i9;
        requestLayout();
    }

    public void setTitleTextColor(int i9) {
        setTitleTextColor(ColorStateList.valueOf(i9));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f14109A = colorStateList;
        TextView textView = this.f14131c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i9 = iArr[0];
        int i10 = iArr[1];
        int size = list.size();
        int i11 = 0;
        int measuredWidth = 0;
        while (i11 < size) {
            View view = (View) list.get(i11);
            g gVar = (g) view.getLayoutParams();
            int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i9;
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i10;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, i13);
            int iMax3 = Math.max(0, -i12);
            int iMax4 = Math.max(0, -i13);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i11++;
            i10 = iMax4;
            i9 = iMax3;
        }
        return measuredWidth;
    }

    public boolean v() {
        f fVar = this.f14122N;
        return (fVar == null || fVar.f14160c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f14130a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i9) {
        getMenuInflater().inflate(i9, getMenu());
    }

    public void y() {
        Iterator it = this.f14117I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.f14114F.contains(view);
    }
}
