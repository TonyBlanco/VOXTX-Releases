package androidx.appcompat.widget;

import P.AbstractC0960b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC1238a;
import i.C1871a;
import java.util.ArrayList;
import k.P;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements AbstractC0960b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0161a f14169A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c f14170B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f14171C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final f f14172D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14173E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f14174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f14175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14177o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14178p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14180r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14182t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14183u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14184v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14186x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseBooleanArray f14187y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f14188z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0161a extends h {
        public C0161a(Context context, l lVar, View view) {
            super(context, lVar, view, false, AbstractC1238a.f17750i);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.f14174l;
                f(view2 == null ? (View) a.this.f13719j : view2);
            }
            j(a.this.f14172D);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            a aVar = a.this;
            aVar.f14169A = null;
            aVar.f14173E = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.f a() {
            C0161a c0161a = a.this.f14169A;
            if (c0161a != null) {
                return c0161a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f14191a;

        public c(e eVar) {
            this.f14191a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f13713d != null) {
                a.this.f13713d.d();
            }
            View view = (View) a.this.f13719j;
            if (view != null && view.getWindowToken() != null && this.f14191a.m()) {
                a.this.f14188z = this.f14191a;
            }
            a.this.f14170B = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0162a extends P {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a f14194k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0162a(View view, a aVar) {
                super(view);
                this.f14194k = aVar;
            }

            @Override // k.P
            public j.f b() {
                e eVar = a.this.f14188z;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // k.P
            public boolean c() {
                a.this.K();
                return true;
            }

            @Override // k.P
            public boolean d() {
                a aVar = a.this;
                if (aVar.f14170B != null) {
                    return false;
                }
                aVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC1238a.f17749h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g0.a(this, getContentDescription());
            setOnTouchListener(new C0162a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i9, int i10, int i11, int i12) {
            boolean frame = super.setFrame(i9, i10, i11, i12);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                H.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z9) {
            super(context, eVar, view, z9, AbstractC1238a.f17750i);
            h(8388613);
            j(a.this.f14172D);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (a.this.f13713d != null) {
                a.this.f13713d.close();
            }
            a.this.f14188z = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a aVarM = a.this.m();
            if (aVarM != null) {
                aVarM.b(eVar, z9);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f13713d) {
                return false;
            }
            a.this.f14173E = ((l) eVar).getItem().getItemId();
            i.a aVarM = a.this.m();
            if (aVarM != null) {
                return aVarM.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, c.g.f17879c, c.g.f17878b);
        this.f14187y = new SparseBooleanArray();
        this.f14172D = new f();
    }

    public Drawable A() {
        d dVar = this.f14174l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f14176n) {
            return this.f14175m;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        c cVar = this.f14170B;
        if (cVar != null && (obj = this.f13719j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f14170B = null;
            return true;
        }
        e eVar = this.f14188z;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        C0161a c0161a = this.f14169A;
        if (c0161a == null) {
            return false;
        }
        c0161a.b();
        return true;
    }

    public boolean D() {
        return this.f14170B != null || E();
    }

    public boolean E() {
        e eVar = this.f14188z;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f14182t) {
            this.f14181s = C1871a.b(this.f13712c).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f13713d;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z9) {
        this.f14185w = z9;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f13719j = actionMenuView;
        actionMenuView.a(this.f13713d);
    }

    public void I(Drawable drawable) {
        d dVar = this.f14174l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f14176n = true;
            this.f14175m = drawable;
        }
    }

    public void J(boolean z9) {
        this.f14177o = z9;
        this.f14178p = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f14177o || E() || (eVar = this.f13713d) == null || this.f13719j == null || this.f14170B != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f13712c, this.f13713d, this.f14174l, true));
        this.f14170B = cVar;
        ((View) this.f13719j).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        y();
        super.b(eVar, z9);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        boolean z9 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.e0() != this.f13713d) {
            lVar2 = (l) lVar2.e0();
        }
        View viewZ = z(lVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f14173E = lVar.getItem().getItemId();
        int size = lVar.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i9);
            if (item.isVisible() && item.getIcon() != null) {
                z9 = true;
                break;
            }
            i9++;
        }
        C0161a c0161a = new C0161a(this.f13712c, lVar, viewZ);
        this.f14169A = c0161a;
        c0161a.g(z9);
        this.f14169A.k();
        super.e(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void f(boolean z9) {
        super.f(z9);
        ((View) this.f13719j).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f13713d;
        boolean z10 = false;
        if (eVar != null) {
            ArrayList arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i9 = 0; i9 < size; i9++) {
                AbstractC0960b abstractC0960bB = ((g) arrayListS.get(i9)).b();
                if (abstractC0960bB != null) {
                    abstractC0960bB.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f13713d;
        ArrayList arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f14177o && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z10 = !((g) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z10 = true;
            }
        }
        d dVar = this.f14174l;
        if (z10) {
            if (dVar == null) {
                this.f14174l = new d(this.f13711a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f14174l.getParent();
            if (viewGroup != this.f13719j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f14174l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13719j;
                actionMenuView.addView(this.f14174l, actionMenuView.F());
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f13719j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f14174l);
            }
        }
        ((ActionMenuView) this.f13719j).setOverflowReserved(this.f14177o);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        ArrayList arrayListE;
        int size;
        int i9;
        int iL;
        int i10;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.f13713d;
        View view = null;
        int i11 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i12 = aVar.f14181s;
        int i13 = aVar.f14180r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f13719j;
        boolean z9 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            g gVar = (g) arrayListE.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z9 = true;
            }
            if (aVar.f14185w && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (aVar.f14177o && (z9 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = aVar.f14187y;
        sparseBooleanArray.clear();
        if (aVar.f14183u) {
            int i18 = aVar.f14186x;
            iL = i13 / i18;
            i9 = i18 + ((i13 % i18) / iL);
        } else {
            i9 = 0;
            iL = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            g gVar2 = (g) arrayListE.get(i19);
            if (gVar2.o()) {
                View viewN = aVar.n(gVar2, view, viewGroup);
                if (aVar.f14183u) {
                    iL -= ActionMenuView.L(viewN, i9, iL, iMakeMeasureSpec, i11);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i10 = size;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z10 = sparseBooleanArray.get(groupId2);
                boolean z11 = (i17 > 0 || z10) && i13 > 0 && (!aVar.f14183u || iL > 0);
                boolean z12 = z11;
                i10 = size;
                if (z11) {
                    View viewN2 = aVar.n(gVar2, null, viewGroup);
                    if (aVar.f14183u) {
                        int iL2 = ActionMenuView.L(viewN2, i9, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z12 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z13 = z12;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z11 = z13 & (!aVar.f14183u ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z10) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        g gVar3 = (g) arrayListE.get(i21);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i17++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z11) {
                    i17--;
                }
                gVar2.u(z11);
            } else {
                i10 = size;
                gVar2.u(false);
                i19++;
                view = null;
                aVar = this;
                size = i10;
                i11 = 0;
            }
            i19++;
            view = null;
            aVar = this;
            size = i10;
            i11 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        C1871a c1871aB = C1871a.b(context);
        if (!this.f14178p) {
            this.f14177o = c1871aB.f();
        }
        if (!this.f14184v) {
            this.f14179q = c1871aB.c();
        }
        if (!this.f14182t) {
            this.f14181s = c1871aB.d();
        }
        int measuredWidth = this.f14179q;
        if (this.f14177o) {
            if (this.f14174l == null) {
                d dVar = new d(this.f13711a);
                this.f14174l = dVar;
                if (this.f14176n) {
                    dVar.setImageDrawable(this.f14175m);
                    this.f14175m = null;
                    this.f14176n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14174l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f14174l.getMeasuredWidth();
        } else {
            this.f14174l = null;
        }
        this.f14180r = measuredWidth;
        this.f14186x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(g gVar, j.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f13719j);
        if (this.f14171C == null) {
            this.f14171C = new b();
        }
        actionMenuItemView.setPopupCallback(this.f14171C);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i9) {
        if (viewGroup.getChildAt(i9) == this.f14174l) {
            return false;
        }
        return super.l(viewGroup, i9);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j o(ViewGroup viewGroup) {
        j jVar = this.f13719j;
        j jVarO = super.o(viewGroup);
        if (jVar != jVarO) {
            ((ActionMenuView) jVarO).setPresenter(this);
        }
        return jVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i9, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f13719j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
