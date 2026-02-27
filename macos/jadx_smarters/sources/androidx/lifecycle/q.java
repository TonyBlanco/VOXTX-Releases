package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l.C2167a;
import m.C2213a;
import m.C2214b;

/* JADX INFO: loaded from: classes.dex */
public class q extends AbstractC1180j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2213a f15936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1180j.c f15937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f15938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f15942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15943i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1180j.c f15944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1184n f15945b;

        public a(InterfaceC1185o interfaceC1185o, AbstractC1180j.c cVar) {
            this.f15945b = s.f(interfaceC1185o);
            this.f15944a = cVar;
        }

        public void a(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
            AbstractC1180j.c targetState = bVar.getTargetState();
            this.f15944a = q.k(this.f15944a, targetState);
            this.f15945b.b(interfaceC1186p, bVar);
            this.f15944a = targetState;
        }
    }

    public q(InterfaceC1186p interfaceC1186p) {
        this(interfaceC1186p, true);
    }

    public q(InterfaceC1186p interfaceC1186p, boolean z9) {
        this.f15936b = new C2213a();
        this.f15939e = 0;
        this.f15940f = false;
        this.f15941g = false;
        this.f15942h = new ArrayList();
        this.f15938d = new WeakReference(interfaceC1186p);
        this.f15937c = AbstractC1180j.c.INITIALIZED;
        this.f15943i = z9;
    }

    public static AbstractC1180j.c k(AbstractC1180j.c cVar, AbstractC1180j.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // androidx.lifecycle.AbstractC1180j
    public void a(InterfaceC1185o interfaceC1185o) {
        InterfaceC1186p interfaceC1186p;
        f("addObserver");
        AbstractC1180j.c cVar = this.f15937c;
        AbstractC1180j.c cVar2 = AbstractC1180j.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC1180j.c.INITIALIZED;
        }
        a aVar = new a(interfaceC1185o, cVar2);
        if (((a) this.f15936b.i(interfaceC1185o, aVar)) == null && (interfaceC1186p = (InterfaceC1186p) this.f15938d.get()) != null) {
            boolean z9 = this.f15939e != 0 || this.f15940f;
            AbstractC1180j.c cVarE = e(interfaceC1185o);
            this.f15939e++;
            while (aVar.f15944a.compareTo(cVarE) < 0 && this.f15936b.contains(interfaceC1185o)) {
                n(aVar.f15944a);
                AbstractC1180j.b bVarUpFrom = AbstractC1180j.b.upFrom(aVar.f15944a);
                if (bVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f15944a);
                }
                aVar.a(interfaceC1186p, bVarUpFrom);
                m();
                cVarE = e(interfaceC1185o);
            }
            if (!z9) {
                p();
            }
            this.f15939e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1180j
    public AbstractC1180j.c b() {
        return this.f15937c;
    }

    @Override // androidx.lifecycle.AbstractC1180j
    public void c(InterfaceC1185o interfaceC1185o) {
        f("removeObserver");
        this.f15936b.j(interfaceC1185o);
    }

    public final void d(InterfaceC1186p interfaceC1186p) {
        Iterator itDescendingIterator = this.f15936b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f15941g) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f15944a.compareTo(this.f15937c) > 0 && !this.f15941g && this.f15936b.contains((InterfaceC1185o) entry.getKey())) {
                AbstractC1180j.b bVarDownFrom = AbstractC1180j.b.downFrom(aVar.f15944a);
                if (bVarDownFrom == null) {
                    throw new IllegalStateException("no event down from " + aVar.f15944a);
                }
                n(bVarDownFrom.getTargetState());
                aVar.a(interfaceC1186p, bVarDownFrom);
                m();
            }
        }
    }

    public final AbstractC1180j.c e(InterfaceC1185o interfaceC1185o) {
        Map.Entry entryL = this.f15936b.l(interfaceC1185o);
        AbstractC1180j.c cVar = null;
        AbstractC1180j.c cVar2 = entryL != null ? ((a) entryL.getValue()).f15944a : null;
        if (!this.f15942h.isEmpty()) {
            cVar = (AbstractC1180j.c) this.f15942h.get(r0.size() - 1);
        }
        return k(k(this.f15937c, cVar2), cVar);
    }

    public final void f(String str) {
        if (!this.f15943i || C2167a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void g(InterfaceC1186p interfaceC1186p) {
        C2214b.d dVarF = this.f15936b.f();
        while (dVarF.hasNext() && !this.f15941g) {
            Map.Entry entry = (Map.Entry) dVarF.next();
            a aVar = (a) entry.getValue();
            while (aVar.f15944a.compareTo(this.f15937c) < 0 && !this.f15941g && this.f15936b.contains((InterfaceC1185o) entry.getKey())) {
                n(aVar.f15944a);
                AbstractC1180j.b bVarUpFrom = AbstractC1180j.b.upFrom(aVar.f15944a);
                if (bVarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + aVar.f15944a);
                }
                aVar.a(interfaceC1186p, bVarUpFrom);
                m();
            }
        }
    }

    public void h(AbstractC1180j.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.getTargetState());
    }

    public final boolean i() {
        if (this.f15936b.size() == 0) {
            return true;
        }
        AbstractC1180j.c cVar = ((a) this.f15936b.d().getValue()).f15944a;
        AbstractC1180j.c cVar2 = ((a) this.f15936b.g().getValue()).f15944a;
        return cVar == cVar2 && this.f15937c == cVar2;
    }

    public void j(AbstractC1180j.c cVar) {
        f("markState");
        o(cVar);
    }

    public final void l(AbstractC1180j.c cVar) {
        AbstractC1180j.c cVar2 = this.f15937c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == AbstractC1180j.c.INITIALIZED && cVar == AbstractC1180j.c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f15937c);
        }
        this.f15937c = cVar;
        if (this.f15940f || this.f15939e != 0) {
            this.f15941g = true;
            return;
        }
        this.f15940f = true;
        p();
        this.f15940f = false;
        if (this.f15937c == AbstractC1180j.c.DESTROYED) {
            this.f15936b = new C2213a();
        }
    }

    public final void m() {
        this.f15942h.remove(r0.size() - 1);
    }

    public final void n(AbstractC1180j.c cVar) {
        this.f15942h.add(cVar);
    }

    public void o(AbstractC1180j.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    public final void p() {
        InterfaceC1186p interfaceC1186p = (InterfaceC1186p) this.f15938d.get();
        if (interfaceC1186p == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f15941g = false;
            if (zI) {
                return;
            }
            if (this.f15937c.compareTo(((a) this.f15936b.d().getValue()).f15944a) < 0) {
                d(interfaceC1186p);
            }
            Map.Entry entryG = this.f15936b.g();
            if (!this.f15941g && entryG != null && this.f15937c.compareTo(((a) entryG.getValue()).f15944a) > 0) {
                g(interfaceC1186p);
            }
        }
    }
}
