package I8;

import G8.AbstractC0569f;
import G8.AbstractC0589p;
import G8.AbstractC0591q;
import G8.C0587o;
import G8.InterfaceC0585n;
import G8.P;
import k8.j;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.y;
import o8.InterfaceC2372d;
import p8.AbstractC2511b;
import p8.AbstractC2512c;
import q8.AbstractC2649h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends I8.c implements f {

    /* JADX INFO: renamed from: I8.a$a, reason: collision with other inner class name */
    public static class C0050a extends n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC0585n f2960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2961f;

        public C0050a(InterfaceC0585n interfaceC0585n, int i9) {
            this.f2960e = interfaceC0585n;
            this.f2961f = i9;
        }

        @Override // I8.n
        public void B(i iVar) {
            InterfaceC0585n interfaceC0585n;
            Object objA;
            if (this.f2961f == 1) {
                interfaceC0585n = this.f2960e;
                objA = h.b(h.f2985b.a(iVar.f2989e));
            } else {
                interfaceC0585n = this.f2960e;
                j.a aVar = k8.j.f43666c;
                objA = k8.k.a(iVar.F());
            }
            interfaceC0585n.resumeWith(k8.j.b(objA));
        }

        public final Object C(Object obj) {
            return this.f2961f == 1 ? h.b(h.f2985b.c(obj)) : obj;
        }

        @Override // I8.p
        public void d(Object obj) {
            this.f2960e.y(AbstractC0589p.f2355a);
        }

        @Override // I8.p
        public y f(Object obj, m.b bVar) {
            if (this.f2960e.f(C(obj), null, A(obj)) == null) {
                return null;
            }
            return AbstractC0589p.f2355a;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "ReceiveElement@" + P.b(this) + "[receiveMode=" + this.f2961f + ']';
        }
    }

    public static final class b extends C0050a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final w8.l f2962g;

        public b(InterfaceC0585n interfaceC0585n, int i9, w8.l lVar) {
            super(interfaceC0585n, i9);
            this.f2962g = lVar;
        }

        @Override // I8.n
        public w8.l A(Object obj) {
            return t.a(this.f2962g, obj, this.f2960e.getContext());
        }
    }

    public final class c extends AbstractC0569f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f2963a;

        public c(n nVar) {
            this.f2963a = nVar;
        }

        @Override // G8.AbstractC0583m
        public void a(Throwable th) {
            if (this.f2963a.u()) {
                a.this.x();
            }
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return k8.q.f43674a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f2963a + ']';
        }
    }

    public static final class d extends m.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f2965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.m mVar, a aVar) {
            super(mVar);
            this.f2965d = aVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2162c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f2965d.w()) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public a(w8.l lVar) {
        super(lVar);
    }

    public final Object A(int i9, InterfaceC2372d interfaceC2372d) {
        C0587o c0587oB = AbstractC0591q.b(AbstractC2511b.c(interfaceC2372d));
        C0050a c0050a = this.f2973b == null ? new C0050a(c0587oB, i9) : new b(c0587oB, i9, this.f2973b);
        while (true) {
            if (t(c0050a)) {
                B(c0587oB, c0050a);
                break;
            }
            Object objZ = z();
            if (objZ instanceof i) {
                c0050a.B((i) objZ);
                break;
            }
            if (objZ != I8.b.f2969d) {
                c0587oB.u(c0050a.C(objZ), c0050a.A(objZ));
                break;
            }
        }
        Object objR = c0587oB.r();
        if (objR == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objR;
    }

    public final void B(InterfaceC0585n interfaceC0585n, n nVar) {
        interfaceC0585n.x(new c(nVar));
    }

    @Override // I8.o
    public final Object b() {
        Object objZ = z();
        return objZ == I8.b.f2969d ? h.f2985b.b() : objZ instanceof i ? h.f2985b.a(((i) objZ).f2989e) : h.f2985b.c(objZ);
    }

    @Override // I8.o
    public final Object d(InterfaceC2372d interfaceC2372d) {
        Object objZ = z();
        return (objZ == I8.b.f2969d || (objZ instanceof i)) ? A(0, interfaceC2372d) : objZ;
    }

    @Override // I8.c
    public p p() {
        p pVarP = super.p();
        if (pVarP != null && !(pVarP instanceof i)) {
            x();
        }
        return pVarP;
    }

    public final boolean t(n nVar) {
        boolean zU = u(nVar);
        if (zU) {
            y();
        }
        return zU;
    }

    public boolean u(n nVar) {
        int iY;
        kotlinx.coroutines.internal.m mVarQ;
        if (!v()) {
            kotlinx.coroutines.internal.k kVarH = h();
            d dVar = new d(nVar, this);
            do {
                kotlinx.coroutines.internal.m mVarQ2 = kVarH.q();
                if (!(!(mVarQ2 instanceof r))) {
                    return false;
                }
                iY = mVarQ2.y(nVar, kVarH, dVar);
                if (iY != 1) {
                }
            } while (iY != 2);
            return false;
        }
        kotlinx.coroutines.internal.k kVarH2 = h();
        do {
            mVarQ = kVarH2.q();
            if (!(!(mVarQ instanceof r))) {
                return false;
            }
        } while (!mVarQ.j(nVar, kVarH2));
        return true;
    }

    public abstract boolean v();

    public abstract boolean w();

    public void x() {
    }

    public void y() {
    }

    public Object z() {
        while (true) {
            r rVarQ = q();
            if (rVarQ == null) {
                return I8.b.f2969d;
            }
            if (rVarQ.B(null) != null) {
                rVarQ.z();
                return rVarQ.A();
            }
            rVarQ.C();
        }
    }
}
