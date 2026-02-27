package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC1147b;
import androidx.leanback.widget.C1164t;
import androidx.leanback.widget.E;
import androidx.leanback.widget.L;
import androidx.leanback.widget.M;
import androidx.leanback.widget.Q;
import d.AbstractC1617D;
import g0.AbstractC1798c;
import i0.C1873a;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.leanback.widget.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1166v extends M {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f15789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f15790s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f15791t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public F f15795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public HashMap f15802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Q f15803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1164t.e f15804q;

    /* JADX INFO: renamed from: androidx.leanback.widget.v$a */
    public class a implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f15805a;

        public a(d dVar) {
            this.f15805a = dVar;
        }

        @Override // androidx.leanback.widget.A
        public void a(ViewGroup viewGroup, View view, int i9, long j9) {
            C1166v.this.W(this.f15805a, view, true);
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.v$b */
    public class b implements AbstractC1147b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f15807a;

        public b(d dVar) {
            this.f15807a = dVar;
        }

        @Override // androidx.leanback.widget.AbstractC1147b.e
        public boolean a(KeyEvent keyEvent) {
            return this.f15807a.e() != null && this.f15807a.e().onKey(this.f15807a.f15344a, keyEvent.getKeyCode(), keyEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.v$c */
    public class c extends C1164t {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public d f15809k;

        /* JADX INFO: renamed from: androidx.leanback.widget.v$c$a */
        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1164t.d f15811a;

            public a(C1164t.d dVar) {
                this.f15811a = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1164t.d dVar = (C1164t.d) c.this.f15809k.f15814p.i0(this.f15811a.f16733a);
                if (c.this.f15809k.b() != null) {
                    InterfaceC1148c interfaceC1148cB = c.this.f15809k.b();
                    E.a aVar = this.f15811a.f15783u;
                    Object obj = dVar.f15785w;
                    d dVar2 = c.this.f15809k;
                    dVar2.getClass();
                    interfaceC1148cB.a(aVar, obj, dVar2, null);
                }
            }
        }

        public c(d dVar) {
            this.f15809k = dVar;
        }

        @Override // androidx.leanback.widget.C1164t
        public void l0(E e9, int i9) {
            this.f15809k.o().getRecycledViewPool().k(i9, C1166v.this.L(e9));
        }

        @Override // androidx.leanback.widget.C1164t
        public void m0(C1164t.d dVar) {
            C1166v.this.H(this.f15809k, dVar.f16733a);
            this.f15809k.m(dVar.f16733a);
        }

        @Override // androidx.leanback.widget.C1164t
        public void n0(C1164t.d dVar) {
            if (this.f15809k.b() != null) {
                dVar.f15783u.f15344a.setOnClickListener(new a(dVar));
            }
        }

        @Override // androidx.leanback.widget.C1164t
        public void p0(C1164t.d dVar) {
            View view = dVar.f16733a;
            if (view instanceof ViewGroup) {
                androidx.leanback.transition.a.a((ViewGroup) view, true);
            }
            Q q9 = C1166v.this.f15803p;
            if (q9 != null) {
                q9.f(dVar.f16733a);
            }
        }

        @Override // androidx.leanback.widget.C1164t
        public void r0(C1164t.d dVar) {
            if (this.f15809k.b() != null) {
                dVar.f15783u.f15344a.setOnClickListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.v$d */
    public static class d extends M.b {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final C1166v f15813o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final HorizontalGridView f15814p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public C1164t f15815q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final C1160o f15816r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f15817s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f15818t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f15819u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f15820v;

        public d(View view, HorizontalGridView horizontalGridView, C1166v c1166v) {
            super(view);
            this.f15816r = new C1160o();
            this.f15814p = horizontalGridView;
            this.f15813o = c1166v;
            this.f15817s = horizontalGridView.getPaddingTop();
            this.f15818t = horizontalGridView.getPaddingBottom();
            this.f15819u = horizontalGridView.getPaddingLeft();
            this.f15820v = horizontalGridView.getPaddingRight();
        }

        public final C1164t n() {
            return this.f15815q;
        }

        public final HorizontalGridView o() {
            return this.f15814p;
        }
    }

    public C1166v() {
        this(2);
    }

    public C1166v(int i9) {
        this(i9, false);
    }

    public C1166v(int i9, boolean z9) {
        this.f15792e = 1;
        this.f15798k = true;
        this.f15799l = -1;
        this.f15800m = true;
        this.f15801n = true;
        this.f15802o = new HashMap();
        if (!AbstractC1153h.b(i9)) {
            throw new IllegalArgumentException("Unhandled zoom factor");
        }
        this.f15796i = i9;
        this.f15797j = z9;
    }

    public static void P(Context context) {
        if (f15789r == 0) {
            f15789r = context.getResources().getDimensionPixelSize(AbstractC1798c.f40975c);
            f15790s = context.getResources().getDimensionPixelSize(AbstractC1798c.f40974b);
            f15791t = context.getResources().getDimensionPixelSize(AbstractC1798c.f40973a);
        }
    }

    @Override // androidx.leanback.widget.M
    public void A(M.b bVar) {
        d dVar = (d) bVar;
        dVar.f15814p.setAdapter(null);
        dVar.f15815q.j0();
        super.A(bVar);
    }

    @Override // androidx.leanback.widget.M
    public void B(M.b bVar, boolean z9) {
        super.B(bVar, z9);
        ((d) bVar).f15814p.setChildrenVisibility(z9 ? 0 : 4);
    }

    public void H(d dVar, View view) {
        Q q9 = this.f15803p;
        if (q9 == null || !q9.d()) {
            return;
        }
        this.f15803p.j(view, dVar.f15394k.b().getColor());
    }

    public final boolean I() {
        return this.f15800m;
    }

    public Q.b J() {
        return Q.b.f15480d;
    }

    public int K() {
        int i9 = this.f15794g;
        return i9 != 0 ? i9 : this.f15793f;
    }

    public int L(E e9) {
        if (this.f15802o.containsKey(e9)) {
            return ((Integer) this.f15802o.get(e9)).intValue();
        }
        return 24;
    }

    public int M() {
        return this.f15793f;
    }

    public final boolean N() {
        return this.f15798k;
    }

    public final int O(d dVar) {
        L.a aVarA = dVar.a();
        if (aVarA != null) {
            return l() != null ? l().j(aVarA) : aVarA.f15344a.getPaddingBottom();
        }
        return 0;
    }

    public boolean Q() {
        return true;
    }

    public boolean R() {
        return Q.q();
    }

    public boolean S(Context context) {
        return !C1873a.c(context).d();
    }

    public boolean T(Context context) {
        return !C1873a.c(context).f();
    }

    public final boolean U() {
        return Q() && n();
    }

    public final boolean V() {
        return R() && N();
    }

    public void W(d dVar, View view, boolean z9) {
        if (view == null) {
            if (this.f15795h != null) {
                dVar.f15816r.j();
            }
            if (!z9 || dVar.d() == null) {
                return;
            }
            dVar.d().a(null, null, dVar, null);
            return;
        }
        if (dVar.f15390g) {
            C1164t.d dVar2 = (C1164t.d) dVar.f15814p.i0(view);
            if (this.f15795h != null) {
                dVar.f15816r.k(dVar.f15814p, view, dVar2.f15785w);
            }
            if (!z9 || dVar.d() == null) {
                return;
            }
            dVar.d().a(dVar2.f15783u, dVar2.f15785w, dVar, null);
        }
    }

    public final void X(d dVar) {
        int i9;
        int iO;
        if (dVar.h()) {
            iO = (dVar.i() ? f15790s : dVar.f15817s) - O(dVar);
            i9 = this.f15795h == null ? f15791t : dVar.f15818t;
        } else if (dVar.i()) {
            i9 = f15789r;
            iO = i9 - dVar.f15818t;
        } else {
            i9 = dVar.f15818t;
            iO = 0;
        }
        dVar.o().setPadding(dVar.f15819u, iO, dVar.f15820v, i9);
    }

    public final void Y(C1167w c1167w) {
        HorizontalGridView gridView = c1167w.getGridView();
        if (this.f15799l < 0) {
            TypedArray typedArrayObtainStyledAttributes = gridView.getContext().obtainStyledAttributes(g0.l.f41117k);
            this.f15799l = (int) typedArrayObtainStyledAttributes.getDimension(g0.l.f41119l, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        gridView.setFadingLeftEdgeLength(this.f15799l);
    }

    public final void Z(d dVar) {
        if (!dVar.f15391h || !dVar.f15390g) {
            if (this.f15795h != null) {
                dVar.f15816r.j();
            }
        } else {
            F f9 = this.f15795h;
            if (f9 != null) {
                dVar.f15816r.c((ViewGroup) dVar.f15344a, f9);
            }
            HorizontalGridView horizontalGridView = dVar.f15814p;
            C1164t.d dVar2 = (C1164t.d) horizontalGridView.b0(horizontalGridView.getSelectedPosition());
            W(dVar, dVar2 == null ? null : dVar2.f16733a, false);
        }
    }

    @Override // androidx.leanback.widget.M
    public M.b i(ViewGroup viewGroup) {
        P(viewGroup.getContext());
        C1167w c1167w = new C1167w(viewGroup.getContext());
        Y(c1167w);
        if (this.f15793f != 0) {
            c1167w.getGridView().setRowHeight(this.f15793f);
        }
        return new d(c1167w, c1167w.getGridView(), this);
    }

    @Override // androidx.leanback.widget.M
    public void j(M.b bVar, boolean z9) {
        d dVar = (d) bVar;
        HorizontalGridView horizontalGridView = dVar.f15814p;
        C1164t.d dVar2 = (C1164t.d) horizontalGridView.b0(horizontalGridView.getSelectedPosition());
        if (dVar2 == null) {
            super.j(bVar, z9);
            return;
        }
        if (!z9 || bVar.d() == null) {
            return;
        }
        InterfaceC1149d interfaceC1149dD = bVar.d();
        E.a aVarR = dVar2.R();
        Object obj = dVar2.f15785w;
        dVar.f();
        interfaceC1149dD.a(aVarR, obj, dVar, null);
    }

    @Override // androidx.leanback.widget.M
    public void k(M.b bVar, boolean z9) {
        d dVar = (d) bVar;
        dVar.f15814p.setScrollEnabled(!z9);
        dVar.f15814p.setAnimateChildLayout(!z9);
    }

    @Override // androidx.leanback.widget.M
    public void p(M.b bVar) {
        super.p(bVar);
        d dVar = (d) bVar;
        Context context = bVar.f15344a.getContext();
        if (this.f15803p == null) {
            Q qA = new Q.a().c(U()).e(V()).d(S(context) && I()).g(T(context)).b(this.f15801n).f(J()).a(context);
            this.f15803p = qA;
            if (qA.e()) {
                this.f15804q = new C1165u(this.f15803p);
            }
        }
        c cVar = new c(dVar);
        dVar.f15815q = cVar;
        cVar.B0(this.f15804q);
        this.f15803p.g(dVar.f15814p);
        AbstractC1153h.c(dVar.f15815q, this.f15796i, this.f15797j);
        dVar.f15814p.setFocusDrawingOrderEnabled(this.f15803p.c() != 3);
        dVar.f15814p.setOnChildSelectedListener(new a(dVar));
        dVar.f15814p.setOnUnhandledKeyListener(new b(dVar));
        dVar.f15814p.setNumRows(this.f15792e);
    }

    @Override // androidx.leanback.widget.M
    public final boolean r() {
        return false;
    }

    @Override // androidx.leanback.widget.M
    public void u(M.b bVar, Object obj) {
        super.u(bVar, obj);
        AbstractC1617D.a(obj);
        C1164t c1164t = ((d) bVar).f15815q;
        throw null;
    }

    @Override // androidx.leanback.widget.M
    public void x(M.b bVar, boolean z9) {
        super.x(bVar, z9);
        d dVar = (d) bVar;
        if (M() != K()) {
            dVar.o().setRowHeight(z9 ? K() : M());
        }
        X(dVar);
        Z(dVar);
    }

    @Override // androidx.leanback.widget.M
    public void y(M.b bVar, boolean z9) {
        super.y(bVar, z9);
        d dVar = (d) bVar;
        X(dVar);
        Z(dVar);
    }

    @Override // androidx.leanback.widget.M
    public void z(M.b bVar) {
        super.z(bVar);
        d dVar = (d) bVar;
        int childCount = dVar.f15814p.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            H(dVar, dVar.f15814p.getChildAt(i9));
        }
    }
}
