package G8;

import G8.InterfaceC0605x0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k8.AbstractC2152a;
import kotlinx.coroutines.internal.m;
import o8.InterfaceC2372d;
import o8.g;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2511b;
import p8.AbstractC2512c;
import q8.AbstractC2649h;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public class E0 implements InterfaceC0605x0, InterfaceC0600v, M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2265a = AtomicReferenceFieldUpdater.newUpdater(E0.class, Object.class, "_state");

    @NotNull
    private volatile /* synthetic */ Object _parentHandle;

    @NotNull
    private volatile /* synthetic */ Object _state;

    public static final class a extends C0587o {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final E0 f2266j;

        public a(InterfaceC2372d interfaceC2372d, E0 e02) {
            super(interfaceC2372d, 1);
            this.f2266j = e02;
        }

        @Override // G8.C0587o
        public String D() {
            return "AwaitContinuation";
        }

        @Override // G8.C0587o
        public Throwable q(InterfaceC0605x0 interfaceC0605x0) {
            Throwable thE;
            Object objD0 = this.f2266j.d0();
            return (!(objD0 instanceof c) || (thE = ((c) objD0).e()) == null) ? objD0 instanceof B ? ((B) objD0).f2261a : interfaceC0605x0.h() : thE;
        }
    }

    public static final class b extends D0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final E0 f2267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f2268g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C0598u f2269h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f2270i;

        public b(E0 e02, c cVar, C0598u c0598u, Object obj) {
            this.f2267f = e02;
            this.f2268g = cVar;
            this.f2269h = c0598u;
            this.f2270i = obj;
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            z((Throwable) obj);
            return k8.q.f43674a;
        }

        @Override // G8.D
        public void z(Throwable th) {
            this.f2267f.O(this.f2268g, this.f2269h, this.f2270i);
        }
    }

    public static final class c implements InterfaceC0595s0 {

        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @NotNull
        private volatile /* synthetic */ int _isCompleting;

        @NotNull
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J0 f2271a;

        public c(J0 j02, boolean z9, Throwable th) {
            this.f2271a = j02;
            this._isCompleting = z9 ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                l(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                k(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList arrayListB = b();
                arrayListB.add(objD);
                arrayListB.add(th);
                k(arrayListB);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final ArrayList b() {
            return new ArrayList(4);
        }

        @Override // G8.InterfaceC0595s0
        public J0 c() {
            return this.f2271a;
        }

        public final Object d() {
            return this._exceptionsHolder;
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return d() == F0.f2283e;
        }

        public final List i(Throwable th) {
            ArrayList arrayListB;
            Object objD = d();
            if (objD == null) {
                arrayListB = b();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListB2 = b();
                arrayListB2.add(objD);
                arrayListB = arrayListB2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListB = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListB.add(0, thE);
            }
            if (th != null && !kotlin.jvm.internal.l.a(th, thE)) {
                arrayListB.add(th);
            }
            k(F0.f2283e);
            return arrayListB;
        }

        @Override // G8.InterfaceC0595s0
        public boolean isActive() {
            return e() == null;
        }

        public final void j(boolean z9) {
            this._isCompleting = z9 ? 1 : 0;
        }

        public final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void l(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + c() + ']';
        }
    }

    public static final class d extends m.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ E0 f2272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f2273e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.m mVar, E0 e02, Object obj) {
            super(mVar);
            this.f2272d = e02;
            this.f2273e = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2162c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.m mVar) {
            if (this.f2272d.d0() == this.f2273e) {
                return null;
            }
            return kotlinx.coroutines.internal.l.a();
        }
    }

    public static final class e extends q8.k implements w8.p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f2274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f2275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f2277f;

        public e(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D8.f fVar, InterfaceC2372d interfaceC2372d) {
            return ((e) create(fVar, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            e eVar = E0.this.new e(interfaceC2372d);
            eVar.f2277f = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:27:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please report as a decompilation issue!!! */
        @Override // q8.AbstractC2642a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p8.AbstractC2512c.d()
                int r1 = r6.f2276e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f2275d
                kotlinx.coroutines.internal.m r1 = (kotlinx.coroutines.internal.m) r1
                java.lang.Object r3 = r6.f2274c
                kotlinx.coroutines.internal.k r3 = (kotlinx.coroutines.internal.k) r3
                java.lang.Object r4 = r6.f2277f
                D8.f r4 = (D8.f) r4
                k8.k.b(r7)
                goto L7c
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                k8.k.b(r7)
                goto L81
            L2a:
                k8.k.b(r7)
                java.lang.Object r7 = r6.f2277f
                D8.f r7 = (D8.f) r7
                G8.E0 r1 = G8.E0.this
                java.lang.Object r1 = r1.d0()
                boolean r4 = r1 instanceof G8.C0598u
                if (r4 == 0) goto L48
                G8.u r1 = (G8.C0598u) r1
                G8.v r1 = r1.f2361f
                r6.f2276e = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L81
                return r0
            L48:
                boolean r3 = r1 instanceof G8.InterfaceC0595s0
                if (r3 == 0) goto L81
                G8.s0 r1 = (G8.InterfaceC0595s0) r1
                G8.J0 r1 = r1.c()
                if (r1 == 0) goto L81
                java.lang.Object r3 = r1.o()
                kotlinx.coroutines.internal.m r3 = (kotlinx.coroutines.internal.m) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L5e:
                boolean r7 = kotlin.jvm.internal.l.a(r1, r3)
                if (r7 != 0) goto L81
                boolean r7 = r1 instanceof G8.C0598u
                if (r7 == 0) goto L7c
                r7 = r1
                G8.u r7 = (G8.C0598u) r7
                G8.v r7 = r7.f2361f
                r6.f2277f = r4
                r6.f2274c = r3
                r6.f2275d = r1
                r6.f2276e = r2
                java.lang.Object r7 = r4.a(r7, r6)
                if (r7 != r0) goto L7c
                return r0
            L7c:
                kotlinx.coroutines.internal.m r1 = r1.p()
                goto L5e
            L81:
                k8.q r7 = k8.q.f43674a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: G8.E0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public E0(boolean z9) {
        this._state = z9 ? F0.f2285g : F0.f2284f;
        this._parentHandle = null;
    }

    public static /* synthetic */ CancellationException D0(E0 e02, Throwable th, String str, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i9 & 1) != 0) {
            str = null;
        }
        return e02.C0(th, str);
    }

    public final int A0(Object obj) {
        if (obj instanceof C0572g0) {
            if (((C0572g0) obj).isActive()) {
                return 0;
            }
            if (!AbstractC2755b.a(f2265a, this, obj, F0.f2285g)) {
                return -1;
            }
            v0();
            return 1;
        }
        if (!(obj instanceof C0593r0)) {
            return 0;
        }
        if (!AbstractC2755b.a(f2265a, this, obj, ((C0593r0) obj).c())) {
            return -1;
        }
        v0();
        return 1;
    }

    public final boolean B(Object obj, J0 j02, D0 d02) {
        int iY;
        d dVar = new d(d02, this, obj);
        do {
            iY = j02.q().y(d02, j02, dVar);
            if (iY == 1) {
                return true;
            }
        } while (iY != 2);
        return false;
    }

    public final String B0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0595s0 ? ((InterfaceC0595s0) obj).isActive() ? "Active" : "New" : obj instanceof B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public final void C(Throwable th, List list) throws IllegalAccessException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                AbstractC2152a.a(th, th2);
            }
        }
    }

    public final CancellationException C0(Throwable th, String str) {
        CancellationException c0607y0 = th instanceof CancellationException ? (CancellationException) th : null;
        if (c0607y0 == null) {
            if (str == null) {
                str = L();
            }
            c0607y0 = new C0607y0(str, th, this);
        }
        return c0607y0;
    }

    public void D(Object obj) {
    }

    public final Object E(InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objD0;
        do {
            objD0 = d0();
            if (!(objD0 instanceof InterfaceC0595s0)) {
                if (objD0 instanceof B) {
                    throw ((B) objD0).f2261a;
                }
                return F0.h(objD0);
            }
        } while (A0(objD0) < 0);
        return F(interfaceC2372d);
    }

    public final String E0() {
        return p0() + '{' + B0(d0()) + '}';
    }

    public final Object F(InterfaceC2372d interfaceC2372d) {
        a aVar = new a(AbstractC2511b.c(interfaceC2372d), this);
        aVar.v();
        AbstractC0591q.a(aVar, i(new O0(aVar)));
        Object objR = aVar.r();
        if (objR == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objR;
    }

    public final boolean F0(InterfaceC0595s0 interfaceC0595s0, Object obj) throws Throwable {
        if (!AbstractC2755b.a(f2265a, this, interfaceC0595s0, F0.g(obj))) {
            return false;
        }
        t0(null);
        u0(obj);
        N(interfaceC0595s0, obj);
        return true;
    }

    public final boolean G(Throwable th) {
        return H(th);
    }

    public final boolean G0(InterfaceC0595s0 interfaceC0595s0, Throwable th) throws Throwable {
        J0 j0A0 = a0(interfaceC0595s0);
        if (j0A0 == null) {
            return false;
        }
        if (!AbstractC2755b.a(f2265a, this, interfaceC0595s0, new c(j0A0, false, th))) {
            return false;
        }
        r0(j0A0, th);
        return true;
    }

    public final boolean H(Object obj) throws Throwable {
        Object objL0 = F0.f2279a;
        if (Z() && (objL0 = J(obj)) == F0.f2280b) {
            return true;
        }
        if (objL0 == F0.f2279a) {
            objL0 = l0(obj);
        }
        if (objL0 == F0.f2279a || objL0 == F0.f2280b) {
            return true;
        }
        if (objL0 == F0.f2282d) {
            return false;
        }
        D(objL0);
        return true;
    }

    public final Object H0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC0595s0) ? F0.f2279a : ((!(obj instanceof C0572g0) && !(obj instanceof D0)) || (obj instanceof C0598u) || (obj2 instanceof B)) ? I0((InterfaceC0595s0) obj, obj2) : F0((InterfaceC0595s0) obj, obj2) ? obj2 : F0.f2281c;
    }

    public void I(Throwable th) throws Throwable {
        H(th);
    }

    public final Object I0(InterfaceC0595s0 interfaceC0595s0, Object obj) throws Throwable {
        J0 j0A0 = a0(interfaceC0595s0);
        if (j0A0 == null) {
            return F0.f2281c;
        }
        c cVar = interfaceC0595s0 instanceof c ? (c) interfaceC0595s0 : null;
        if (cVar == null) {
            cVar = new c(j0A0, false, null);
        }
        kotlin.jvm.internal.B b9 = new kotlin.jvm.internal.B();
        synchronized (cVar) {
            if (cVar.g()) {
                return F0.f2279a;
            }
            cVar.j(true);
            if (cVar != interfaceC0595s0 && !AbstractC2755b.a(f2265a, this, interfaceC0595s0, cVar)) {
                return F0.f2281c;
            }
            boolean zF = cVar.f();
            B b10 = obj instanceof B ? (B) obj : null;
            if (b10 != null) {
                cVar.a(b10.f2261a);
            }
            Throwable thE = true ^ zF ? cVar.e() : null;
            b9.f43676a = thE;
            k8.q qVar = k8.q.f43674a;
            if (thE != null) {
                r0(j0A0, thE);
            }
            C0598u c0598uR = R(interfaceC0595s0);
            return (c0598uR == null || !J0(cVar, c0598uR, obj)) ? Q(cVar, obj) : F0.f2280b;
        }
    }

    public final Object J(Object obj) {
        Object objH0;
        do {
            Object objD0 = d0();
            if (!(objD0 instanceof InterfaceC0595s0) || ((objD0 instanceof c) && ((c) objD0).g())) {
                return F0.f2279a;
            }
            objH0 = H0(objD0, new B(P(obj), false, 2, null));
        } while (objH0 == F0.f2281c);
        return objH0;
    }

    public final boolean J0(c cVar, C0598u c0598u, Object obj) {
        while (InterfaceC0605x0.a.d(c0598u.f2361f, false, false, new b(this, cVar, c0598u, obj), 1, null) == K0.f2297a) {
            c0598u = q0(c0598u);
            if (c0598u == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean K(Throwable th) {
        if (i0()) {
            return true;
        }
        boolean z9 = th instanceof CancellationException;
        InterfaceC0596t interfaceC0596tC0 = c0();
        return (interfaceC0596tC0 == null || interfaceC0596tC0 == K0.f2297a) ? z9 : interfaceC0596tC0.b(th) || z9;
    }

    public String L() {
        return "Job was cancelled";
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return H(th) && X();
    }

    public final void N(InterfaceC0595s0 interfaceC0595s0, Object obj) throws Throwable {
        InterfaceC0596t interfaceC0596tC0 = c0();
        if (interfaceC0596tC0 != null) {
            interfaceC0596tC0.dispose();
            z0(K0.f2297a);
        }
        B b9 = obj instanceof B ? (B) obj : null;
        Throwable th = b9 != null ? b9.f2261a : null;
        if (!(interfaceC0595s0 instanceof D0)) {
            J0 j0C = interfaceC0595s0.c();
            if (j0C != null) {
                s0(j0C, th);
                return;
            }
            return;
        }
        try {
            ((D0) interfaceC0595s0).z(th);
        } catch (Throwable th2) {
            f0(new E("Exception in completion handler " + interfaceC0595s0 + " for " + this, th2));
        }
    }

    public final void O(c cVar, C0598u c0598u, Object obj) {
        C0598u c0598uQ0 = q0(c0598u);
        if (c0598uQ0 == null || !J0(cVar, c0598uQ0, obj)) {
            D(Q(cVar, obj));
        }
    }

    public final Throwable P(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0607y0(L(), null, this) : th;
        }
        if (obj != null) {
            return ((M0) obj).r();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    public final Object Q(c cVar, Object obj) throws Throwable {
        boolean zF;
        Throwable thW;
        B b9 = obj instanceof B ? (B) obj : null;
        Throwable th = b9 != null ? b9.f2261a : null;
        synchronized (cVar) {
            zF = cVar.f();
            List listI = cVar.i(th);
            thW = W(cVar, listI);
            if (thW != null) {
                C(thW, listI);
            }
        }
        if (thW != null && thW != th) {
            obj = new B(thW, false, 2, null);
        }
        if (thW != null && (K(thW) || e0(thW))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            ((B) obj).b();
        }
        if (!zF) {
            t0(thW);
        }
        u0(obj);
        AbstractC2755b.a(f2265a, this, cVar, F0.g(obj));
        N(cVar, obj);
        return obj;
    }

    public final C0598u R(InterfaceC0595s0 interfaceC0595s0) {
        C0598u c0598u = interfaceC0595s0 instanceof C0598u ? (C0598u) interfaceC0595s0 : null;
        if (c0598u != null) {
            return c0598u;
        }
        J0 j0C = interfaceC0595s0.c();
        if (j0C != null) {
            return q0(j0C);
        }
        return null;
    }

    public final Object S() throws Throwable {
        Object objD0 = d0();
        if (!(!(objD0 instanceof InterfaceC0595s0))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objD0 instanceof B) {
            throw ((B) objD0).f2261a;
        }
        return F0.h(objD0);
    }

    public final Throwable U(Object obj) {
        B b9 = obj instanceof B ? (B) obj : null;
        if (b9 != null) {
            return b9.f2261a;
        }
        return null;
    }

    @Override // o8.g
    public o8.g V(o8.g gVar) {
        return InterfaceC0605x0.a.f(this, gVar);
    }

    public final Throwable W(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new C0607y0(L(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof X0) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof X0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean X() {
        return true;
    }

    public boolean Z() {
        return false;
    }

    @Override // o8.g.b, o8.g
    public g.b a(g.c cVar) {
        return InterfaceC0605x0.a.c(this, cVar);
    }

    public final J0 a0(InterfaceC0595s0 interfaceC0595s0) {
        J0 j0C = interfaceC0595s0.c();
        if (j0C != null) {
            return j0C;
        }
        if (interfaceC0595s0 instanceof C0572g0) {
            return new J0();
        }
        if (interfaceC0595s0 instanceof D0) {
            x0((D0) interfaceC0595s0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0595s0).toString());
    }

    public final InterfaceC0596t c0() {
        return (InterfaceC0596t) this._parentHandle;
    }

    @Override // G8.InterfaceC0605x0
    public final D8.d d() {
        return D8.g.b(new e(null));
    }

    public final Object d0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.u)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.u) obj).c(this);
        }
    }

    public final Throwable e() {
        Object objD0 = d0();
        if (!(objD0 instanceof InterfaceC0595s0)) {
            return U(objD0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean e0(Throwable th) {
        return false;
    }

    public void f0(Throwable th) throws Throwable {
        throw th;
    }

    @Override // G8.InterfaceC0600v
    public final void g(M0 m02) throws Throwable {
        H(m02);
    }

    public final void g0(InterfaceC0605x0 interfaceC0605x0) {
        if (interfaceC0605x0 == null) {
            z0(K0.f2297a);
            return;
        }
        interfaceC0605x0.start();
        InterfaceC0596t interfaceC0596tK = interfaceC0605x0.k(this);
        z0(interfaceC0596tK);
        if (h0()) {
            interfaceC0596tK.dispose();
            z0(K0.f2297a);
        }
    }

    @Override // o8.g.b
    public final g.c getKey() {
        return InterfaceC0605x0.f2366b0;
    }

    @Override // G8.InterfaceC0605x0
    public final CancellationException h() {
        Object objD0 = d0();
        if (!(objD0 instanceof c)) {
            if (objD0 instanceof InterfaceC0595s0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objD0 instanceof B) {
                return D0(this, ((B) objD0).f2261a, null, 1, null);
            }
            return new C0607y0(P.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objD0).e();
        if (thE != null) {
            CancellationException cancellationExceptionC0 = C0(thE, P.a(this) + " is cancelling");
            if (cancellationExceptionC0 != null) {
                return cancellationExceptionC0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final boolean h0() {
        return !(d0() instanceof InterfaceC0595s0);
    }

    @Override // G8.InterfaceC0605x0
    public final InterfaceC0566d0 i(w8.l lVar) {
        return v(false, true, lVar);
    }

    public boolean i0() {
        return false;
    }

    @Override // G8.InterfaceC0605x0
    public boolean isActive() {
        Object objD0 = d0();
        return (objD0 instanceof InterfaceC0595s0) && ((InterfaceC0595s0) objD0).isActive();
    }

    public final boolean j0() {
        Object objD0;
        do {
            objD0 = d0();
            if (!(objD0 instanceof InterfaceC0595s0)) {
                return false;
            }
        } while (A0(objD0) < 0);
        return true;
    }

    @Override // G8.InterfaceC0605x0
    public final InterfaceC0596t k(InterfaceC0600v interfaceC0600v) {
        return (InterfaceC0596t) InterfaceC0605x0.a.d(this, true, false, new C0598u(interfaceC0600v), 2, null);
    }

    public final Object k0(InterfaceC2372d interfaceC2372d) {
        C0587o c0587o = new C0587o(AbstractC2511b.c(interfaceC2372d), 1);
        c0587o.v();
        AbstractC0591q.a(c0587o, i(new P0(c0587o)));
        Object objR = c0587o.r();
        if (objR == AbstractC2512c.d()) {
            AbstractC2649h.c(interfaceC2372d);
        }
        return objR == AbstractC2512c.d() ? objR : k8.q.f43674a;
    }

    @Override // o8.g
    public Object l(Object obj, w8.p pVar) {
        return InterfaceC0605x0.a.b(this, obj, pVar);
    }

    public final Object l0(Object obj) throws Throwable {
        Throwable thP = null;
        while (true) {
            Object objD0 = d0();
            if (objD0 instanceof c) {
                synchronized (objD0) {
                    if (((c) objD0).h()) {
                        return F0.f2282d;
                    }
                    boolean zF = ((c) objD0).f();
                    if (obj != null || !zF) {
                        if (thP == null) {
                            thP = P(obj);
                        }
                        ((c) objD0).a(thP);
                    }
                    Throwable thE = zF ^ true ? ((c) objD0).e() : null;
                    if (thE != null) {
                        r0(((c) objD0).c(), thE);
                    }
                    return F0.f2279a;
                }
            }
            if (!(objD0 instanceof InterfaceC0595s0)) {
                return F0.f2282d;
            }
            if (thP == null) {
                thP = P(obj);
            }
            InterfaceC0595s0 interfaceC0595s0 = (InterfaceC0595s0) objD0;
            if (!interfaceC0595s0.isActive()) {
                Object objH0 = H0(objD0, new B(thP, false, 2, null));
                if (objH0 == F0.f2279a) {
                    throw new IllegalStateException(("Cannot happen in " + objD0).toString());
                }
                if (objH0 != F0.f2281c) {
                    return objH0;
                }
            } else if (G0(interfaceC0595s0, thP)) {
                return F0.f2279a;
            }
        }
    }

    @Override // G8.InterfaceC0605x0
    public final Object m(InterfaceC2372d interfaceC2372d) {
        if (j0()) {
            Object objK0 = k0(interfaceC2372d);
            return objK0 == AbstractC2512c.d() ? objK0 : k8.q.f43674a;
        }
        B0.i(interfaceC2372d.getContext());
        return k8.q.f43674a;
    }

    public final boolean m0(Object obj) {
        Object objH0;
        do {
            objH0 = H0(d0(), obj);
            if (objH0 == F0.f2279a) {
                return false;
            }
            if (objH0 == F0.f2280b) {
                return true;
            }
        } while (objH0 == F0.f2281c);
        D(objH0);
        return true;
    }

    public final Object n0(Object obj) {
        Object objH0;
        do {
            objH0 = H0(d0(), obj);
            if (objH0 == F0.f2279a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, U(obj));
            }
        } while (objH0 == F0.f2281c);
        return objH0;
    }

    public final D0 o0(w8.l lVar, boolean z9) {
        D0 c0603w0;
        if (z9) {
            c0603w0 = lVar instanceof AbstractC0609z0 ? (AbstractC0609z0) lVar : null;
            if (c0603w0 == null) {
                c0603w0 = new C0601v0(lVar);
            }
        } else {
            c0603w0 = lVar instanceof D0 ? (D0) lVar : null;
            if (c0603w0 == null) {
                c0603w0 = new C0603w0(lVar);
            }
        }
        c0603w0.B(this);
        return c0603w0;
    }

    public String p0() {
        return P.a(this);
    }

    public final C0598u q0(kotlinx.coroutines.internal.m mVar) {
        while (mVar.t()) {
            mVar = mVar.q();
        }
        while (true) {
            mVar = mVar.p();
            if (!mVar.t()) {
                if (mVar instanceof C0598u) {
                    return (C0598u) mVar;
                }
                if (mVar instanceof J0) {
                    return null;
                }
            }
        }
    }

    @Override // G8.M0
    public CancellationException r() {
        Throwable thE;
        Object objD0 = d0();
        if (objD0 instanceof c) {
            thE = ((c) objD0).e();
        } else if (objD0 instanceof B) {
            thE = ((B) objD0).f2261a;
        } else {
            if (objD0 instanceof InterfaceC0595s0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objD0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C0607y0("Parent job is " + B0(objD0), thE, this);
    }

    public final void r0(J0 j02, Throwable th) throws Throwable {
        t0(th);
        E e9 = null;
        for (kotlinx.coroutines.internal.m mVarP = (kotlinx.coroutines.internal.m) j02.o(); !kotlin.jvm.internal.l.a(mVarP, j02); mVarP = mVarP.p()) {
            if (mVarP instanceof AbstractC0609z0) {
                D0 d02 = (D0) mVarP;
                try {
                    d02.z(th);
                } catch (Throwable th2) {
                    if (e9 != null) {
                        AbstractC2152a.a(e9, th2);
                    } else {
                        e9 = new E("Exception in completion handler " + d02 + " for " + this, th2);
                        k8.q qVar = k8.q.f43674a;
                    }
                }
            }
        }
        if (e9 != null) {
            f0(e9);
        }
        K(th);
    }

    @Override // G8.InterfaceC0605x0
    public void s(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new C0607y0(L(), null, this);
        }
        I(cancellationException);
    }

    public final void s0(J0 j02, Throwable th) throws Throwable {
        E e9 = null;
        for (kotlinx.coroutines.internal.m mVarP = (kotlinx.coroutines.internal.m) j02.o(); !kotlin.jvm.internal.l.a(mVarP, j02); mVarP = mVarP.p()) {
            if (mVarP instanceof D0) {
                D0 d02 = (D0) mVarP;
                try {
                    d02.z(th);
                } catch (Throwable th2) {
                    if (e9 != null) {
                        AbstractC2152a.a(e9, th2);
                    } else {
                        e9 = new E("Exception in completion handler " + d02 + " for " + this, th2);
                        k8.q qVar = k8.q.f43674a;
                    }
                }
            }
        }
        if (e9 != null) {
            f0(e9);
        }
    }

    @Override // G8.InterfaceC0605x0
    public final boolean start() {
        int iA0;
        do {
            iA0 = A0(d0());
            if (iA0 == 0) {
                return false;
            }
        } while (iA0 != 1);
        return true;
    }

    public void t0(Throwable th) {
    }

    public String toString() {
        return E0() + '@' + P.b(this);
    }

    public void u0(Object obj) {
    }

    @Override // G8.InterfaceC0605x0
    public final InterfaceC0566d0 v(boolean z9, boolean z10, w8.l lVar) {
        D0 d0O0 = o0(lVar, z9);
        while (true) {
            Object objD0 = d0();
            if (objD0 instanceof C0572g0) {
                C0572g0 c0572g0 = (C0572g0) objD0;
                if (!c0572g0.isActive()) {
                    w0(c0572g0);
                } else if (AbstractC2755b.a(f2265a, this, objD0, d0O0)) {
                    return d0O0;
                }
            } else {
                if (!(objD0 instanceof InterfaceC0595s0)) {
                    if (z10) {
                        B b9 = objD0 instanceof B ? (B) objD0 : null;
                        lVar.invoke(b9 != null ? b9.f2261a : null);
                    }
                    return K0.f2297a;
                }
                J0 j0C = ((InterfaceC0595s0) objD0).c();
                if (j0C != null) {
                    InterfaceC0566d0 interfaceC0566d0 = K0.f2297a;
                    if (z9 && (objD0 instanceof c)) {
                        synchronized (objD0) {
                            try {
                                thE = ((c) objD0).e();
                                if (thE == null || ((lVar instanceof C0598u) && !((c) objD0).g())) {
                                    if (B(objD0, j0C, d0O0)) {
                                        if (thE == null) {
                                            return d0O0;
                                        }
                                        interfaceC0566d0 = d0O0;
                                    }
                                }
                                k8.q qVar = k8.q.f43674a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thE != null) {
                        if (z10) {
                            lVar.invoke(thE);
                        }
                        return interfaceC0566d0;
                    }
                    if (B(objD0, j0C, d0O0)) {
                        return d0O0;
                    }
                } else {
                    if (objD0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    x0((D0) objD0);
                }
            }
        }
    }

    public void v0() {
    }

    @Override // o8.g
    public o8.g w(g.c cVar) {
        return InterfaceC0605x0.a.e(this, cVar);
    }

    public final void w0(C0572g0 c0572g0) {
        J0 j02 = new J0();
        Object c0593r0 = j02;
        if (!c0572g0.isActive()) {
            c0593r0 = new C0593r0(j02);
        }
        AbstractC2755b.a(f2265a, this, c0572g0, c0593r0);
    }

    public final void x0(D0 d02) {
        d02.k(new J0());
        AbstractC2755b.a(f2265a, this, d02, d02.p());
    }

    public final void y0(D0 d02) {
        Object objD0;
        do {
            objD0 = d0();
            if (!(objD0 instanceof D0)) {
                if (!(objD0 instanceof InterfaceC0595s0) || ((InterfaceC0595s0) objD0).c() == null) {
                    return;
                }
                d02.u();
                return;
            }
            if (objD0 != d02) {
                return;
            }
        } while (!AbstractC2755b.a(f2265a, this, objD0, F0.f2285g));
    }

    public final void z0(InterfaceC0596t interfaceC0596t) {
        this._parentHandle = interfaceC0596t;
    }
}
