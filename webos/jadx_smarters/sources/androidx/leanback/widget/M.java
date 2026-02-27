package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.E;
import androidx.leanback.widget.L;
import h0.C1845a;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L f15382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15384d;

    public static class a extends E.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f15385c;

        public a(K k9, b bVar) {
            super(k9);
            k9.b(bVar.f15344a);
            L.a aVar = bVar.f15387d;
            if (aVar != null) {
                k9.a(aVar.f15344a);
            }
            this.f15385c = bVar;
            bVar.f15386c = this;
        }
    }

    public static class b extends E.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f15386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public L.a f15387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f15388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f15390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f15391h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f15392i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f15393j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C1845a f15394k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View.OnKeyListener f15395l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InterfaceC1149d f15396m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public InterfaceC1148c f15397n;

        public b(View view) {
            super(view);
            this.f15389f = 0;
            this.f15393j = 0.0f;
            this.f15394k = C1845a.a(view.getContext());
        }

        public final L.a a() {
            return this.f15387d;
        }

        public final InterfaceC1148c b() {
            return this.f15397n;
        }

        public final InterfaceC1149d d() {
            return this.f15396m;
        }

        public View.OnKeyListener e() {
            return this.f15395l;
        }

        public final J f() {
            return null;
        }

        public final Object g() {
            return this.f15388e;
        }

        public final boolean h() {
            return this.f15391h;
        }

        public final boolean i() {
            return this.f15390g;
        }

        public final void j(boolean z9) {
            this.f15389f = z9 ? 1 : 2;
        }

        public final void k(InterfaceC1148c interfaceC1148c) {
            this.f15397n = interfaceC1148c;
        }

        public final void l(InterfaceC1149d interfaceC1149d) {
            this.f15396m = interfaceC1149d;
        }

        public final void m(View view) {
            int i9 = this.f15389f;
            if (i9 == 1) {
                view.setActivated(true);
            } else if (i9 == 2) {
                view.setActivated(false);
            }
        }
    }

    public M() {
        L l9 = new L();
        this.f15382b = l9;
        this.f15383c = true;
        this.f15384d = 1;
        l9.l(true);
    }

    public void A(b bVar) {
        L.a aVar = bVar.f15387d;
        if (aVar != null) {
            this.f15382b.f(aVar);
        }
        bVar.f15388e = null;
    }

    public void B(b bVar, boolean z9) {
        L.a aVar = bVar.f15387d;
        if (aVar == null || aVar.f15344a.getVisibility() == 8) {
            return;
        }
        bVar.f15387d.f15344a.setVisibility(z9 ? 0 : 4);
    }

    public final void C(E.a aVar, boolean z9) {
        b bVarM = m(aVar);
        bVarM.f15391h = z9;
        x(bVarM, z9);
    }

    public final void D(E.a aVar, boolean z9) {
        b bVarM = m(aVar);
        bVarM.f15390g = z9;
        y(bVarM, z9);
    }

    public final void E(E.a aVar, float f9) {
        b bVarM = m(aVar);
        bVarM.f15393j = f9;
        z(bVarM);
    }

    public final void F(b bVar, View view) {
        boolean zH;
        int i9 = this.f15384d;
        if (i9 == 1) {
            zH = bVar.h();
        } else {
            if (i9 != 2) {
                if (i9 == 3) {
                    bVar.j(bVar.h() && bVar.i());
                }
                bVar.m(view);
            }
            zH = bVar.i();
        }
        bVar.j(zH);
        bVar.m(view);
    }

    public final void G(b bVar) {
        if (this.f15382b == null || bVar.f15387d == null) {
            return;
        }
        ((K) bVar.f15386c.f15344a).d(bVar.h());
    }

    @Override // androidx.leanback.widget.E
    public final void b(E.a aVar, Object obj) {
        u(m(aVar), obj);
    }

    @Override // androidx.leanback.widget.E
    public final E.a e(ViewGroup viewGroup) {
        E.a aVar;
        b bVarI = i(viewGroup);
        bVarI.f15392i = false;
        if (t()) {
            K k9 = new K(viewGroup.getContext());
            L l9 = this.f15382b;
            if (l9 != null) {
                bVarI.f15387d = (L.a) l9.e((ViewGroup) bVarI.f15344a);
            }
            aVar = new a(k9, bVarI);
        } else {
            aVar = bVarI;
        }
        p(bVarI);
        if (bVarI.f15392i) {
            return aVar;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // androidx.leanback.widget.E
    public final void f(E.a aVar) {
        A(m(aVar));
    }

    @Override // androidx.leanback.widget.E
    public final void g(E.a aVar) {
        v(m(aVar));
    }

    @Override // androidx.leanback.widget.E
    public final void h(E.a aVar) {
        w(m(aVar));
    }

    public abstract b i(ViewGroup viewGroup);

    public void j(b bVar, boolean z9) {
        InterfaceC1149d interfaceC1149d;
        if (!z9 || (interfaceC1149d = bVar.f15396m) == null) {
            return;
        }
        interfaceC1149d.a(null, null, bVar, bVar.g());
    }

    public abstract void k(b bVar, boolean z9);

    public final L l() {
        return this.f15382b;
    }

    public final b m(E.a aVar) {
        return aVar instanceof a ? ((a) aVar).f15385c : (b) aVar;
    }

    public final boolean n() {
        return this.f15383c;
    }

    public final float o(E.a aVar) {
        return m(aVar).f15393j;
    }

    public void p(b bVar) {
        bVar.f15392i = true;
        if (q()) {
            return;
        }
        View view = bVar.f15344a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        a aVar = bVar.f15386c;
        if (aVar != null) {
            ((ViewGroup) aVar.f15344a).setClipChildren(false);
        }
    }

    public boolean q() {
        return false;
    }

    public abstract boolean r();

    public final boolean s() {
        return r() && n();
    }

    public final boolean t() {
        return this.f15382b != null || s();
    }

    public void u(b bVar, Object obj) {
        bVar.f15388e = obj;
        if (bVar.f15387d != null) {
            bVar.f();
        }
    }

    public void v(b bVar) {
        L.a aVar = bVar.f15387d;
        if (aVar != null) {
            this.f15382b.g(aVar);
        }
    }

    public void w(b bVar) {
        L.a aVar = bVar.f15387d;
        if (aVar != null) {
            this.f15382b.h(aVar);
        }
        E.a(bVar.f15344a);
    }

    public void x(b bVar, boolean z9) {
        G(bVar);
        F(bVar, bVar.f15344a);
    }

    public void y(b bVar, boolean z9) {
        j(bVar, z9);
        G(bVar);
        F(bVar, bVar.f15344a);
    }

    public void z(b bVar) {
        if (n()) {
            bVar.f15394k.c(bVar.f15393j);
            L.a aVar = bVar.f15387d;
            if (aVar != null) {
                this.f15382b.m(aVar, bVar.f15393j);
            }
            if (r()) {
                ((K) bVar.f15386c.f15344a).c(bVar.f15394k.b().getColor());
            }
        }
    }
}
