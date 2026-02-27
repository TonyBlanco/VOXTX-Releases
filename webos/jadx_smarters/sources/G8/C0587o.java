package G8;

import G8.InterfaceC0605x0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C2165f;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2512c;
import q8.InterfaceC2646e;
import t.AbstractC2755b;

/* JADX INFO: renamed from: G8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0587o extends Z implements InterfaceC0585n, InterfaceC2646e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2349h = AtomicIntegerFieldUpdater.newUpdater(C0587o.class, "_decision");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2350i = AtomicReferenceFieldUpdater.newUpdater(C0587o.class, Object.class, "_state");

    @NotNull
    private volatile /* synthetic */ int _decision;

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2372d f2351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o8.g f2352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0566d0 f2353g;

    public C0587o(InterfaceC2372d interfaceC2372d, int i9) {
        super(i9);
        this.f2351e = interfaceC2372d;
        this.f2352f = interfaceC2372d.getContext();
        this._decision = 0;
        this._state = C0565d.f2325a;
    }

    private final boolean A() {
        return AbstractC0560a0.c(this.f2315d) && ((C2165f) this.f2351e).l();
    }

    public static /* synthetic */ void I(C0587o c0587o, Object obj, int i9, w8.l lVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        c0587o.H(obj, i9, lVar);
    }

    public final AbstractC0581l B(w8.l lVar) {
        return lVar instanceof AbstractC0581l ? (AbstractC0581l) lVar : new C0599u0(lVar);
    }

    public final void C(w8.l lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (m(th)) {
            return;
        }
        b(th);
        o();
    }

    public final void F() {
        Throwable thO;
        InterfaceC2372d interfaceC2372d = this.f2351e;
        C2165f c2165f = interfaceC2372d instanceof C2165f ? (C2165f) interfaceC2372d : null;
        if (c2165f == null || (thO = c2165f.o(this)) == null) {
            return;
        }
        n();
        b(thO);
    }

    public final boolean G() {
        Object obj = this._state;
        if ((obj instanceof A) && ((A) obj).f2257d != null) {
            n();
            return false;
        }
        this._decision = 0;
        this._state = C0565d.f2325a;
        return true;
    }

    public final void H(Object obj, int i9, w8.l lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof L0)) {
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.c()) {
                        if (lVar != null) {
                            l(lVar, rVar.f2261a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new k8.c();
            }
        } while (!AbstractC2755b.a(f2350i, this, obj2, J((L0) obj2, obj, i9, lVar, null)));
        o();
        p(i9);
    }

    public final Object J(L0 l02, Object obj, int i9, w8.l lVar, Object obj2) {
        if (obj instanceof B) {
            return obj;
        }
        if (!AbstractC0560a0.b(i9) && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((l02 instanceof AbstractC0581l) && !(l02 instanceof AbstractC0569f)) || obj2 != null)) {
            return new A(obj, l02 instanceof AbstractC0581l ? (AbstractC0581l) l02 : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean K() {
        do {
            int i9 = this._decision;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f2349h.compareAndSet(this, 0, 2));
        return true;
    }

    public final kotlinx.coroutines.internal.y L(Object obj, Object obj2, w8.l lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof L0)) {
                if ((obj3 instanceof A) && obj2 != null && ((A) obj3).f2257d == obj2) {
                    return AbstractC0589p.f2355a;
                }
                return null;
            }
        } while (!AbstractC2755b.a(f2350i, this, obj3, J((L0) obj3, obj, this.f2315d, lVar, obj2)));
        o();
        return AbstractC0589p.f2355a;
    }

    public final boolean M() {
        do {
            int i9 = this._decision;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f2349h.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // G8.Z
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof L0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof B) {
                return;
            }
            if (obj2 instanceof A) {
                A a9 = (A) obj2;
                if (!(!a9.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (AbstractC2755b.a(f2350i, this, obj2, A.b(a9, null, null, null, null, th, 15, null))) {
                    a9.d(this, th);
                    return;
                }
            } else if (AbstractC2755b.a(f2350i, this, obj2, new A(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // G8.InterfaceC0585n
    public boolean b(Throwable th) {
        Object obj;
        boolean z9;
        do {
            obj = this._state;
            if (!(obj instanceof L0)) {
                return false;
            }
            z9 = obj instanceof AbstractC0581l;
        } while (!AbstractC2755b.a(f2350i, this, obj, new r(this, th, z9)));
        AbstractC0581l abstractC0581l = z9 ? (AbstractC0581l) obj : null;
        if (abstractC0581l != null) {
            j(abstractC0581l, th);
        }
        o();
        p(this.f2315d);
        return true;
    }

    @Override // G8.Z
    public final InterfaceC2372d c() {
        return this.f2351e;
    }

    @Override // G8.Z
    public Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // G8.Z
    public Object e(Object obj) {
        return obj instanceof A ? ((A) obj).f2254a : obj;
    }

    @Override // G8.InterfaceC0585n
    public Object f(Object obj, Object obj2, w8.l lVar) {
        return L(obj, obj2, lVar);
    }

    @Override // q8.InterfaceC2646e
    public InterfaceC2646e getCallerFrame() {
        InterfaceC2372d interfaceC2372d = this.f2351e;
        if (interfaceC2372d instanceof InterfaceC2646e) {
            return (InterfaceC2646e) interfaceC2372d;
        }
        return null;
    }

    @Override // o8.InterfaceC2372d
    public o8.g getContext() {
        return this.f2352f;
    }

    @Override // G8.Z
    public Object h() {
        return s();
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void j(AbstractC0581l abstractC0581l, Throwable th) {
        try {
            abstractC0581l.a(th);
        } catch (Throwable th2) {
            K.a(getContext(), new E("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(w8.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            K.a(getContext(), new E("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(w8.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            K.a(getContext(), new E("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        if (A()) {
            return ((C2165f) this.f2351e).m(th);
        }
        return false;
    }

    public final void n() {
        InterfaceC0566d0 interfaceC0566d0 = this.f2353g;
        if (interfaceC0566d0 == null) {
            return;
        }
        interfaceC0566d0.dispose();
        this.f2353g = K0.f2297a;
    }

    public final void o() {
        if (A()) {
            return;
        }
        n();
    }

    public final void p(int i9) {
        if (K()) {
            return;
        }
        AbstractC0560a0.a(this, i9);
    }

    public Throwable q(InterfaceC0605x0 interfaceC0605x0) {
        return interfaceC0605x0.h();
    }

    public final Object r() {
        InterfaceC0605x0 interfaceC0605x0;
        boolean zA = A();
        if (M()) {
            if (this.f2353g == null) {
                w();
            }
            if (zA) {
                F();
            }
            return AbstractC2512c.d();
        }
        if (zA) {
            F();
        }
        Object objS = s();
        if (objS instanceof B) {
            throw ((B) objS).f2261a;
        }
        if (!AbstractC0560a0.b(this.f2315d) || (interfaceC0605x0 = (InterfaceC0605x0) getContext().a(InterfaceC0605x0.f2366b0)) == null || interfaceC0605x0.isActive()) {
            return e(objS);
        }
        CancellationException cancellationExceptionH = interfaceC0605x0.h();
        a(objS, cancellationExceptionH);
        throw cancellationExceptionH;
    }

    @Override // o8.InterfaceC2372d
    public void resumeWith(Object obj) {
        I(this, F.b(obj, this), this.f2315d, null, 4, null);
    }

    public final Object s() {
        return this._state;
    }

    public final String t() {
        Object objS = s();
        return objS instanceof L0 ? "Active" : objS instanceof r ? "Cancelled" : "Completed";
    }

    public String toString() {
        return D() + '(' + P.c(this.f2351e) + "){" + t() + "}@" + P.b(this);
    }

    @Override // G8.InterfaceC0585n
    public void u(Object obj, w8.l lVar) {
        H(obj, this.f2315d, lVar);
    }

    public void v() {
        InterfaceC0566d0 interfaceC0566d0W = w();
        if (interfaceC0566d0W != null && z()) {
            interfaceC0566d0W.dispose();
            this.f2353g = K0.f2297a;
        }
    }

    public final InterfaceC0566d0 w() {
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) getContext().a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 == null) {
            return null;
        }
        InterfaceC0566d0 interfaceC0566d0D = InterfaceC0605x0.a.d(interfaceC0605x0, true, false, new C0594s(this), 2, null);
        this.f2353g = interfaceC0566d0D;
        return interfaceC0566d0D;
    }

    @Override // G8.InterfaceC0585n
    public void x(w8.l lVar) {
        AbstractC0581l abstractC0581lB = B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C0565d) {
                if (AbstractC2755b.a(f2350i, this, obj, abstractC0581lB)) {
                    return;
                }
            } else if (obj instanceof AbstractC0581l) {
                C(lVar, obj);
            } else {
                if (obj instanceof B) {
                    B b9 = (B) obj;
                    if (!b9.b()) {
                        C(lVar, obj);
                    }
                    if (obj instanceof r) {
                        if (!(obj instanceof B)) {
                            b9 = null;
                        }
                        k(lVar, b9 != null ? b9.f2261a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof A) {
                    A a9 = (A) obj;
                    if (a9.f2255b != null) {
                        C(lVar, obj);
                    }
                    if (abstractC0581lB instanceof AbstractC0569f) {
                        return;
                    }
                    if (a9.c()) {
                        k(lVar, a9.f2258e);
                        return;
                    } else {
                        if (AbstractC2755b.a(f2350i, this, obj, A.b(a9, null, abstractC0581lB, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (abstractC0581lB instanceof AbstractC0569f) {
                        return;
                    }
                    if (AbstractC2755b.a(f2350i, this, obj, new A(obj, abstractC0581lB, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // G8.InterfaceC0585n
    public void y(Object obj) {
        p(this.f2315d);
    }

    public boolean z() {
        return !(s() instanceof L0);
    }
}
