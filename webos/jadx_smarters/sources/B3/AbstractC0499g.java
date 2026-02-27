package B3;

import B3.C;
import B3.J;
import O2.Q1;
import V2.AbstractC1059p;
import V2.InterfaceC1065w;
import android.os.Handler;
import d4.AbstractC1684a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: B3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0499g extends AbstractC0493a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f568i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b4.S f570k;

    /* JADX INFO: renamed from: B3.g$a */
    public final class a implements J, InterfaceC1065w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public J.a f572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC1065w.a f573d;

        public a(Object obj) {
            this.f572c = AbstractC0499g.this.f0(null);
            this.f573d = AbstractC0499g.this.b0(null);
            this.f571a = obj;
        }

        @Override // V2.InterfaceC1065w
        public void C(int i9, C.b bVar) {
            if (a(i9, bVar)) {
                this.f573d.j();
            }
        }

        @Override // B3.J
        public void D(int i9, C.b bVar, C0512u c0512u, C0515x c0515x) {
            if (a(i9, bVar)) {
                this.f572c.u(c0512u, e(c0515x));
            }
        }

        @Override // V2.InterfaceC1065w
        public void G(int i9, C.b bVar) {
            if (a(i9, bVar)) {
                this.f573d.i();
            }
        }

        @Override // B3.J
        public void I(int i9, C.b bVar, C0512u c0512u, C0515x c0515x) {
            if (a(i9, bVar)) {
                this.f572c.r(c0512u, e(c0515x));
            }
        }

        @Override // V2.InterfaceC1065w
        public /* synthetic */ void K(int i9, C.b bVar) {
            AbstractC1059p.a(this, i9, bVar);
        }

        @Override // B3.J
        public void L(int i9, C.b bVar, C0512u c0512u, C0515x c0515x, IOException iOException, boolean z9) {
            if (a(i9, bVar)) {
                this.f572c.x(c0512u, e(c0515x), iOException, z9);
            }
        }

        @Override // V2.InterfaceC1065w
        public void N(int i9, C.b bVar, int i10) {
            if (a(i9, bVar)) {
                this.f573d.k(i10);
            }
        }

        @Override // V2.InterfaceC1065w
        public void Q(int i9, C.b bVar, Exception exc) {
            if (a(i9, bVar)) {
                this.f573d.l(exc);
            }
        }

        @Override // B3.J
        public void R(int i9, C.b bVar, C0512u c0512u, C0515x c0515x) {
            if (a(i9, bVar)) {
                this.f572c.A(c0512u, e(c0515x));
            }
        }

        @Override // V2.InterfaceC1065w
        public void T(int i9, C.b bVar) {
            if (a(i9, bVar)) {
                this.f573d.h();
            }
        }

        @Override // B3.J
        public void Z(int i9, C.b bVar, C0515x c0515x) {
            if (a(i9, bVar)) {
                this.f572c.i(e(c0515x));
            }
        }

        public final boolean a(int i9, C.b bVar) {
            C.b bVarP0;
            if (bVar != null) {
                bVarP0 = AbstractC0499g.this.p0(this.f571a, bVar);
                if (bVarP0 == null) {
                    return false;
                }
            } else {
                bVarP0 = null;
            }
            int iR0 = AbstractC0499g.this.r0(this.f571a, i9);
            J.a aVar = this.f572c;
            if (aVar.f301a != iR0 || !d4.k0.c(aVar.f302b, bVarP0)) {
                this.f572c = AbstractC0499g.this.d0(iR0, bVarP0);
            }
            InterfaceC1065w.a aVar2 = this.f573d;
            if (aVar2.f10030a == iR0 && d4.k0.c(aVar2.f10031b, bVarP0)) {
                return true;
            }
            this.f573d = AbstractC0499g.this.a0(iR0, bVarP0);
            return true;
        }

        @Override // V2.InterfaceC1065w
        public void c0(int i9, C.b bVar) {
            if (a(i9, bVar)) {
                this.f573d.m();
            }
        }

        public final C0515x e(C0515x c0515x) {
            long jQ0 = AbstractC0499g.this.q0(this.f571a, c0515x.f666f);
            long jQ02 = AbstractC0499g.this.q0(this.f571a, c0515x.f667g);
            return (jQ0 == c0515x.f666f && jQ02 == c0515x.f667g) ? c0515x : new C0515x(c0515x.f661a, c0515x.f662b, c0515x.f663c, c0515x.f664d, c0515x.f665e, jQ0, jQ02);
        }

        @Override // B3.J
        public void o(int i9, C.b bVar, C0515x c0515x) {
            if (a(i9, bVar)) {
                this.f572c.D(e(c0515x));
            }
        }
    }

    /* JADX INFO: renamed from: B3.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C f575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C.c f576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f577c;

        public b(C c9, C.c cVar, a aVar) {
            this.f575a = c9;
            this.f576b = cVar;
            this.f577c = aVar;
        }
    }

    @Override // B3.C
    public void P() {
        Iterator it = this.f568i.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f575a.P();
        }
    }

    @Override // B3.AbstractC0493a
    public void g0() {
        for (b bVar : this.f568i.values()) {
            bVar.f575a.B(bVar.f576b);
        }
    }

    @Override // B3.AbstractC0493a
    public void h0() {
        for (b bVar : this.f568i.values()) {
            bVar.f575a.F(bVar.f576b);
        }
    }

    @Override // B3.AbstractC0493a
    public void l0(b4.S s9) {
        this.f570k = s9;
        this.f569j = d4.k0.x();
    }

    @Override // B3.AbstractC0493a
    public void n0() {
        for (b bVar : this.f568i.values()) {
            bVar.f575a.V(bVar.f576b);
            bVar.f575a.u(bVar.f577c);
            bVar.f575a.z(bVar.f577c);
        }
        this.f568i.clear();
    }

    public C.b p0(Object obj, C.b bVar) {
        return bVar;
    }

    public long q0(Object obj, long j9) {
        return j9;
    }

    public int r0(Object obj, int i9) {
        return i9;
    }

    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public abstract void s0(Object obj, C c9, Q1 q12);

    public final void u0(final Object obj, C c9) {
        AbstractC1684a.a(!this.f568i.containsKey(obj));
        C.c cVar = new C.c() { // from class: B3.f
            @Override // B3.C.c
            public final void J(C c10, Q1 q12) {
                this.f566a.s0(obj, c10, q12);
            }
        };
        a aVar = new a(obj);
        this.f568i.put(obj, new b(c9, cVar, aVar));
        c9.k((Handler) AbstractC1684a.e(this.f569j), aVar);
        c9.A((Handler) AbstractC1684a.e(this.f569j), aVar);
        c9.a(cVar, this.f570k, i0());
        if (j0()) {
            return;
        }
        c9.B(cVar);
    }

    public final void v0(Object obj) {
        b bVar = (b) AbstractC1684a.e((b) this.f568i.remove(obj));
        bVar.f575a.V(bVar.f576b);
        bVar.f575a.u(bVar.f577c);
        bVar.f575a.z(bVar.f577c);
    }
}
