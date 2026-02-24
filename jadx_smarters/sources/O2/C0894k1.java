package O2;

import B3.C;
import B3.C0512u;
import B3.C0513v;
import B3.C0514w;
import B3.C0515x;
import B3.InterfaceC0517z;
import B3.a0;
import P2.InterfaceC0984a;
import V2.AbstractC1059p;
import V2.InterfaceC1065w;
import android.util.Pair;
import b4.InterfaceC1211b;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.InterfaceC1705w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: O2.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0894k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2.v0 f6105a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f6109e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0984a f6112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1705w f6113i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b4.S f6116l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B3.a0 f6114j = new a0.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f6107c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6108d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6106b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f6110f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f6111g = new HashSet();

    /* JADX INFO: renamed from: O2.k1$a */
    public final class a implements B3.J, InterfaceC1065w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f6117a;

        public a(c cVar) {
            this.f6117a = cVar;
        }

        @Override // V2.InterfaceC1065w
        public void C(int i9, C.b bVar) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6087a.U(pairM);
                    }
                });
            }
        }

        @Override // B3.J
        public void D(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.Y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5935a.b0(pairM, c0512u, c0515x);
                    }
                });
            }
        }

        @Override // V2.InterfaceC1065w
        public void G(int i9, C.b bVar) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.Z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5941a.S(pairM);
                    }
                });
            }
        }

        @Override // B3.J
        public void I(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5979a.a0(pairM, c0512u, c0515x);
                    }
                });
            }
        }

        @Override // V2.InterfaceC1065w
        public /* synthetic */ void K(int i9, C.b bVar) {
            AbstractC1059p.a(this, i9, bVar);
        }

        @Override // B3.J
        public void L(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x, final IOException iOException, final boolean z9) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5986a.d0(pairM, c0512u, c0515x, iOException, z9);
                    }
                });
            }
        }

        public final Pair M(int i9, C.b bVar) {
            C.b bVar2 = null;
            if (bVar != null) {
                C.b bVarN = C0894k1.n(this.f6117a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(C0894k1.s(this.f6117a, i9)), bVar2);
        }

        @Override // V2.InterfaceC1065w
        public void N(int i9, C.b bVar, final int i10) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.f1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5975a.V(pairM, i10);
                    }
                });
            }
        }

        public final /* synthetic */ void O(Pair pair, C0515x c0515x) {
            C0894k1.this.f6112h.Z(((Integer) pair.first).intValue(), (C.b) pair.second, c0515x);
        }

        public final /* synthetic */ void P(Pair pair) {
            C0894k1.this.f6112h.T(((Integer) pair.first).intValue(), (C.b) pair.second);
        }

        @Override // V2.InterfaceC1065w
        public void Q(int i9, C.b bVar, final Exception exc) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5963a.W(pairM, exc);
                    }
                });
            }
        }

        @Override // B3.J
        public void R(int i9, C.b bVar, final C0512u c0512u, final C0515x c0515x) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5969a.f0(pairM, c0512u, c0515x);
                    }
                });
            }
        }

        public final /* synthetic */ void S(Pair pair) {
            C0894k1.this.f6112h.G(((Integer) pair.first).intValue(), (C.b) pair.second);
        }

        @Override // V2.InterfaceC1065w
        public void T(int i9, C.b bVar) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5947a.P(pairM);
                    }
                });
            }
        }

        public final /* synthetic */ void U(Pair pair) {
            C0894k1.this.f6112h.C(((Integer) pair.first).intValue(), (C.b) pair.second);
        }

        public final /* synthetic */ void V(Pair pair, int i9) {
            C0894k1.this.f6112h.N(((Integer) pair.first).intValue(), (C.b) pair.second, i9);
        }

        public final /* synthetic */ void W(Pair pair, Exception exc) {
            C0894k1.this.f6112h.Q(((Integer) pair.first).intValue(), (C.b) pair.second, exc);
        }

        public final /* synthetic */ void Y(Pair pair) {
            C0894k1.this.f6112h.c0(((Integer) pair.first).intValue(), (C.b) pair.second);
        }

        @Override // B3.J
        public void Z(int i9, C.b bVar, final C0515x c0515x) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.b1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5956a.O(pairM, c0515x);
                    }
                });
            }
        }

        public final /* synthetic */ void a0(Pair pair, C0512u c0512u, C0515x c0515x) {
            C0894k1.this.f6112h.I(((Integer) pair.first).intValue(), (C.b) pair.second, c0512u, c0515x);
        }

        public final /* synthetic */ void b0(Pair pair, C0512u c0512u, C0515x c0515x) {
            C0894k1.this.f6112h.D(((Integer) pair.first).intValue(), (C.b) pair.second, c0512u, c0515x);
        }

        @Override // V2.InterfaceC1065w
        public void c0(int i9, C.b bVar) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5960a.Y(pairM);
                    }
                });
            }
        }

        public final /* synthetic */ void d0(Pair pair, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9) {
            C0894k1.this.f6112h.L(((Integer) pair.first).intValue(), (C.b) pair.second, c0512u, c0515x, iOException, z9);
        }

        public final /* synthetic */ void f0(Pair pair, C0512u c0512u, C0515x c0515x) {
            C0894k1.this.f6112h.R(((Integer) pair.first).intValue(), (C.b) pair.second, c0512u, c0515x);
        }

        public final /* synthetic */ void g0(Pair pair, C0515x c0515x) {
            C0894k1.this.f6112h.o(((Integer) pair.first).intValue(), (C.b) AbstractC1684a.e((C.b) pair.second), c0515x);
        }

        @Override // B3.J
        public void o(int i9, C.b bVar, final C0515x c0515x) {
            final Pair pairM = M(i9, bVar);
            if (pairM != null) {
                C0894k1.this.f6113i.i(new Runnable() { // from class: O2.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6004a.g0(pairM, c0515x);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: O2.k1$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final B3.C f6119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C.c f6120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f6121c;

        public b(B3.C c9, C.c cVar, a aVar) {
            this.f6119a = c9;
            this.f6120b = cVar;
            this.f6121c = aVar;
        }
    }

    /* JADX INFO: renamed from: O2.k1$c */
    public static final class c implements W0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0514w f6122a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6125d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6126e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f6124c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f6123b = new Object();

        public c(B3.C c9, boolean z9) {
            this.f6122a = new C0514w(c9, z9);
        }

        @Override // O2.W0
        public Object a() {
            return this.f6123b;
        }

        @Override // O2.W0
        public Q1 b() {
            return this.f6122a.J0();
        }

        public void c(int i9) {
            this.f6125d = i9;
            this.f6126e = false;
            this.f6124c.clear();
        }
    }

    /* JADX INFO: renamed from: O2.k1$d */
    public interface d {
        void c();
    }

    public C0894k1(d dVar, InterfaceC0984a interfaceC0984a, InterfaceC1705w interfaceC1705w, P2.v0 v0Var) {
        this.f6105a = v0Var;
        this.f6109e = dVar;
        this.f6112h = interfaceC0984a;
        this.f6113i = interfaceC1705w;
    }

    public static Object m(Object obj) {
        return AbstractC0862a.A(obj);
    }

    public static C.b n(c cVar, C.b bVar) {
        for (int i9 = 0; i9 < cVar.f6124c.size(); i9++) {
            if (((C.b) cVar.f6124c.get(i9)).f274d == bVar.f274d) {
                return bVar.c(p(cVar, bVar.f271a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return AbstractC0862a.B(obj);
    }

    public static Object p(c cVar, Object obj) {
        return AbstractC0862a.D(cVar.f6123b, obj);
    }

    public static int s(c cVar, int i9) {
        return i9 + cVar.f6125d;
    }

    public Q1 A(int i9, int i10, B3.a0 a0Var) {
        AbstractC1684a.a(i9 >= 0 && i9 <= i10 && i10 <= r());
        this.f6114j = a0Var;
        B(i9, i10);
        return i();
    }

    public final void B(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            c cVar = (c) this.f6106b.remove(i11);
            this.f6108d.remove(cVar.f6123b);
            g(i11, -cVar.f6122a.J0().u());
            cVar.f6126e = true;
            if (this.f6115k) {
                v(cVar);
            }
        }
    }

    public Q1 C(List list, B3.a0 a0Var) {
        B(0, this.f6106b.size());
        return f(this.f6106b.size(), list, a0Var);
    }

    public Q1 D(B3.a0 a0Var) {
        int iR = r();
        if (a0Var.getLength() != iR) {
            a0Var = a0Var.e().g(0, iR);
        }
        this.f6114j = a0Var;
        return i();
    }

    public Q1 f(int i9, List list, B3.a0 a0Var) {
        int iU;
        if (!list.isEmpty()) {
            this.f6114j = a0Var;
            for (int i10 = i9; i10 < list.size() + i9; i10++) {
                c cVar = (c) list.get(i10 - i9);
                if (i10 > 0) {
                    c cVar2 = (c) this.f6106b.get(i10 - 1);
                    iU = cVar2.f6125d + cVar2.f6122a.J0().u();
                } else {
                    iU = 0;
                }
                cVar.c(iU);
                g(i10, cVar.f6122a.J0().u());
                this.f6106b.add(i10, cVar);
                this.f6108d.put(cVar.f6123b, cVar);
                if (this.f6115k) {
                    x(cVar);
                    if (this.f6107c.isEmpty()) {
                        this.f6111g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i9, int i10) {
        while (i9 < this.f6106b.size()) {
            ((c) this.f6106b.get(i9)).f6125d += i10;
            i9++;
        }
    }

    public InterfaceC0517z h(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        Object objO = o(bVar.f271a);
        C.b bVarC = bVar.c(m(bVar.f271a));
        c cVar = (c) AbstractC1684a.e((c) this.f6108d.get(objO));
        l(cVar);
        cVar.f6124c.add(bVarC);
        C0513v c0513vE = cVar.f6122a.E(bVarC, interfaceC1211b, j9);
        this.f6107c.put(c0513vE, cVar);
        k();
        return c0513vE;
    }

    public Q1 i() {
        if (this.f6106b.isEmpty()) {
            return Q1.f5705a;
        }
        int iU = 0;
        for (int i9 = 0; i9 < this.f6106b.size(); i9++) {
            c cVar = (c) this.f6106b.get(i9);
            cVar.f6125d = iU;
            iU += cVar.f6122a.J0().u();
        }
        return new y1(this.f6106b, this.f6114j);
    }

    public final void j(c cVar) {
        b bVar = (b) this.f6110f.get(cVar);
        if (bVar != null) {
            bVar.f6119a.B(bVar.f6120b);
        }
    }

    public final void k() {
        Iterator it = this.f6111g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f6124c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.f6111g.add(cVar);
        b bVar = (b) this.f6110f.get(cVar);
        if (bVar != null) {
            bVar.f6119a.F(bVar.f6120b);
        }
    }

    public B3.a0 q() {
        return this.f6114j;
    }

    public int r() {
        return this.f6106b.size();
    }

    public boolean t() {
        return this.f6115k;
    }

    public final /* synthetic */ void u(B3.C c9, Q1 q12) {
        this.f6109e.c();
    }

    public final void v(c cVar) {
        if (cVar.f6126e && cVar.f6124c.isEmpty()) {
            b bVar = (b) AbstractC1684a.e((b) this.f6110f.remove(cVar));
            bVar.f6119a.V(bVar.f6120b);
            bVar.f6119a.u(bVar.f6121c);
            bVar.f6119a.z(bVar.f6121c);
            this.f6111g.remove(cVar);
        }
    }

    public void w(b4.S s9) {
        AbstractC1684a.g(!this.f6115k);
        this.f6116l = s9;
        for (int i9 = 0; i9 < this.f6106b.size(); i9++) {
            c cVar = (c) this.f6106b.get(i9);
            x(cVar);
            this.f6111g.add(cVar);
        }
        this.f6115k = true;
    }

    public final void x(c cVar) {
        C0514w c0514w = cVar.f6122a;
        C.c cVar2 = new C.c() { // from class: O2.X0
            @Override // B3.C.c
            public final void J(B3.C c9, Q1 q12) {
                this.f5929a.u(c9, q12);
            }
        };
        a aVar = new a(cVar);
        this.f6110f.put(cVar, new b(c0514w, cVar2, aVar));
        c0514w.k(d4.k0.z(), aVar);
        c0514w.A(d4.k0.z(), aVar);
        c0514w.a(cVar2, this.f6116l, this.f6105a);
    }

    public void y() {
        for (b bVar : this.f6110f.values()) {
            try {
                bVar.f6119a.V(bVar.f6120b);
            } catch (RuntimeException e9) {
                AbstractC1681B.e("MediaSourceList", "Failed to release child source.", e9);
            }
            bVar.f6119a.u(bVar.f6121c);
            bVar.f6119a.z(bVar.f6121c);
        }
        this.f6110f.clear();
        this.f6111g.clear();
        this.f6115k = false;
    }

    public void z(InterfaceC0517z interfaceC0517z) {
        c cVar = (c) AbstractC1684a.e((c) this.f6107c.remove(interfaceC0517z));
        cVar.f6122a.Y(interfaceC0517z);
        cVar.f6124c.remove(((C0513v) interfaceC0517z).f640a);
        if (!this.f6107c.isEmpty()) {
            k();
        }
        v(cVar);
    }
}
