package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC1169y;
import androidx.leanback.widget.E;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.leanback.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1164t extends RecyclerView.g implements InterfaceC1151f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1169y f15772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f15773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f15774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1152g f15775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f15776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f15777i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractC1169y.b f15778j = new a();

    /* JADX INFO: renamed from: androidx.leanback.widget.t$a */
    public class a extends AbstractC1169y.b {
        public a() {
        }

        @Override // androidx.leanback.widget.AbstractC1169y.b
        public void a() {
            C1164t.this.w();
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.t$b */
    public static class b {
        public abstract void a(E e9, int i9);

        public abstract void b(d dVar);

        public abstract void c(d dVar);

        public void d(d dVar, List list) {
            c(dVar);
        }

        public abstract void e(d dVar);

        public abstract void f(d dVar);

        public abstract void g(d dVar);
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.t$c */
    public final class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View.OnFocusChangeListener f15780a;

        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (C1164t.this.f15773e != null) {
                view = (View) view.getParent();
            }
            InterfaceC1152g interfaceC1152g = C1164t.this.f15775g;
            if (interfaceC1152g != null) {
                interfaceC1152g.a(view, z9);
            }
            View.OnFocusChangeListener onFocusChangeListener = this.f15780a;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z9);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.t$d */
    public class d extends RecyclerView.D implements InterfaceC1150e {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final E f15782t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final E.a f15783u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final c f15784v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f15785w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f15786x;

        public d(E e9, View view, E.a aVar) {
            super(view);
            this.f15784v = C1164t.this.new c();
            this.f15782t = e9;
            this.f15783u = aVar;
        }

        public final Object P() {
            return this.f15786x;
        }

        public final E Q() {
            return this.f15782t;
        }

        public final E.a R() {
            return this.f15783u;
        }

        public void S(Object obj) {
            this.f15786x = obj;
        }

        @Override // androidx.leanback.widget.InterfaceC1150e
        public Object c(Class cls) {
            return this.f15783u.c(cls);
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.t$e */
    public static abstract class e {
        public abstract View a(View view);

        public abstract void b(View view, View view2);
    }

    public void A0(ArrayList arrayList) {
        this.f15777i = arrayList;
    }

    public void B0(e eVar) {
        this.f15773e = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void E(RecyclerView.D d9, int i9) {
        d dVar = (d) d9;
        Object objA = this.f15772d.a(i9);
        dVar.f15785w = objA;
        dVar.f15782t.b(dVar.f15783u, objA);
        n0(dVar);
        b bVar = this.f15776h;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void J(RecyclerView.D d9, int i9, List list) {
        d dVar = (d) d9;
        Object objA = this.f15772d.a(i9);
        dVar.f15785w = objA;
        dVar.f15782t.d(dVar.f15783u, objA, list);
        n0(dVar);
        b bVar = this.f15776h;
        if (bVar != null) {
            bVar.d(dVar, list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.D L(ViewGroup viewGroup, int i9) {
        E.a aVarE;
        View viewA;
        E e9 = (E) this.f15777i.get(i9);
        e eVar = this.f15773e;
        if (eVar != null) {
            viewA = eVar.a(viewGroup);
            aVarE = e9.e(viewGroup);
            this.f15773e.b(viewA, aVarE.f15344a);
        } else {
            aVarE = e9.e(viewGroup);
            viewA = aVarE.f15344a;
        }
        d dVar = new d(e9, viewA, aVarE);
        p0(dVar);
        b bVar = this.f15776h;
        if (bVar != null) {
            bVar.e(dVar);
        }
        View view = dVar.f15783u.f15344a;
        if (view != null) {
            dVar.f15784v.f15780a = view.getOnFocusChangeListener();
            view.setOnFocusChangeListener(dVar.f15784v);
        }
        InterfaceC1152g interfaceC1152g = this.f15775g;
        if (interfaceC1152g != null) {
            interfaceC1152g.b(viewA);
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final boolean T(RecyclerView.D d9) {
        Z(d9);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void W(RecyclerView.D d9) {
        d dVar = (d) d9;
        m0(dVar);
        b bVar = this.f15776h;
        if (bVar != null) {
            bVar.b(dVar);
        }
        dVar.f15782t.g(dVar.f15783u);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void Y(RecyclerView.D d9) {
        d dVar = (d) d9;
        dVar.f15782t.h(dVar.f15783u);
        q0(dVar);
        b bVar = this.f15776h;
        if (bVar != null) {
            bVar.f(dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void Z(RecyclerView.D d9) {
        d dVar = (d) d9;
        dVar.f15782t.f(dVar.f15783u);
        r0(dVar);
        b bVar = this.f15776h;
        if (bVar != null) {
            bVar.g(dVar);
        }
        dVar.f15785w = null;
    }

    @Override // androidx.leanback.widget.InterfaceC1151f
    public InterfaceC1150e g(int i9) {
        return (InterfaceC1150e) this.f15777i.get(i9);
    }

    public void j0() {
        s0(null);
    }

    public ArrayList k0() {
        return this.f15777i;
    }

    public void l0(E e9, int i9) {
    }

    public void m0(d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        AbstractC1169y abstractC1169y = this.f15772d;
        if (abstractC1169y != null) {
            return abstractC1169y.i();
        }
        return 0;
    }

    public void n0(d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long o(int i9) {
        return this.f15772d.b(i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        F fC = this.f15774f;
        if (fC == null) {
            fC = this.f15772d.c();
        }
        E eA = fC.a(this.f15772d.a(i9));
        int iIndexOf = this.f15777i.indexOf(eA);
        if (iIndexOf < 0) {
            this.f15777i.add(eA);
            iIndexOf = this.f15777i.indexOf(eA);
            l0(eA, iIndexOf);
            b bVar = this.f15776h;
            if (bVar != null) {
                bVar.a(eA, iIndexOf);
            }
        }
        return iIndexOf;
    }

    public void p0(d dVar) {
    }

    public void q0(d dVar) {
    }

    public void r0(d dVar) {
    }

    public void s0(AbstractC1169y abstractC1169y) {
        AbstractC1169y abstractC1169y2 = this.f15772d;
        if (abstractC1169y == abstractC1169y2) {
            return;
        }
        if (abstractC1169y2 != null) {
            abstractC1169y2.j(this.f15778j);
        }
        this.f15772d = abstractC1169y;
        if (abstractC1169y == null) {
            w();
            return;
        }
        abstractC1169y.g(this.f15778j);
        if (v() != this.f15772d.d()) {
            c0(this.f15772d.d());
        }
        w();
    }

    public void t0(b bVar) {
        this.f15776h = bVar;
    }

    public void x0(InterfaceC1152g interfaceC1152g) {
        this.f15775g = interfaceC1152g;
    }

    public void z0(F f9) {
        this.f15774f = f9;
        w();
    }
}
