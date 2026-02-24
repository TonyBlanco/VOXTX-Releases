package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;
import java.util.Map;
import l.C2167a;
import m.C2214b;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f15880k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15881a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2214b f15882b = new C2214b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15883c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f15885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f15886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f15890j;

    public class LifecycleBoundObserver extends androidx.lifecycle.LiveData.c implements InterfaceC1184n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC1186p f15891f;

        public LifecycleBoundObserver(InterfaceC1186p interfaceC1186p, v vVar) {
            super(vVar);
            this.f15891f = interfaceC1186p;
        }

        @Override // androidx.lifecycle.InterfaceC1184n
        public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
            AbstractC1180j.c cVarB = this.f15891f.getLifecycle().b();
            if (cVarB == AbstractC1180j.c.DESTROYED) {
                LiveData.this.m(this.f15895a);
                return;
            }
            AbstractC1180j.c cVar = null;
            while (cVar != cVarB) {
                c(k());
                cVar = cVarB;
                cVarB = this.f15891f.getLifecycle().b();
            }
        }

        public void e() {
            this.f15891f.getLifecycle().c(this);
        }

        public boolean j(InterfaceC1186p interfaceC1186p) {
            return this.f15891f == interfaceC1186p;
        }

        public boolean k() {
            return this.f15891f.getLifecycle().b().isAtLeast(AbstractC1180j.c.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f15881a) {
                obj = LiveData.this.f15886f;
                LiveData.this.f15886f = LiveData.f15880k;
            }
            LiveData.this.o(obj);
        }
    }

    public class b extends c {
        public b(v vVar) {
            super(vVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    public abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v f15895a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15897d = -1;

        public c(v vVar) {
            this.f15895a = vVar;
        }

        public void c(boolean z9) {
            if (z9 == this.f15896c) {
                return;
            }
            this.f15896c = z9;
            LiveData.this.c(z9 ? 1 : -1);
            if (this.f15896c) {
                LiveData.this.e(this);
            }
        }

        public void e() {
        }

        public boolean j(InterfaceC1186p interfaceC1186p) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = f15880k;
        this.f15886f = obj;
        this.f15890j = new a();
        this.f15885e = obj;
        this.f15887g = -1;
    }

    public static void b(String str) {
        if (C2167a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i9) {
        int i10 = this.f15883c;
        this.f15883c = i9 + i10;
        if (this.f15884d) {
            return;
        }
        this.f15884d = true;
        while (true) {
            try {
                int i11 = this.f15883c;
                if (i10 == i11) {
                    this.f15884d = false;
                    return;
                }
                boolean z9 = i10 == 0 && i11 > 0;
                boolean z10 = i10 > 0 && i11 == 0;
                if (z9) {
                    j();
                } else if (z10) {
                    k();
                }
                i10 = i11;
            } catch (Throwable th) {
                this.f15884d = false;
                throw th;
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f15896c) {
            if (!cVar.k()) {
                cVar.c(false);
                return;
            }
            int i9 = cVar.f15897d;
            int i10 = this.f15887g;
            if (i9 >= i10) {
                return;
            }
            cVar.f15897d = i10;
            cVar.f15895a.a(this.f15885e);
        }
    }

    public void e(c cVar) {
        if (this.f15888h) {
            this.f15889i = true;
            return;
        }
        this.f15888h = true;
        do {
            this.f15889i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                C2214b.d dVarF = this.f15882b.f();
                while (dVarF.hasNext()) {
                    d((c) ((Map.Entry) dVarF.next()).getValue());
                    if (this.f15889i) {
                        break;
                    }
                }
            }
        } while (this.f15889i);
        this.f15888h = false;
    }

    public Object f() {
        Object obj = this.f15885e;
        if (obj != f15880k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f15883c > 0;
    }

    public void h(InterfaceC1186p interfaceC1186p, v vVar) {
        b("observe");
        if (interfaceC1186p.getLifecycle().b() == AbstractC1180j.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1186p, vVar);
        c cVar = (c) this.f15882b.i(vVar, lifecycleBoundObserver);
        if (cVar != null && !cVar.j(interfaceC1186p)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        interfaceC1186p.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(v vVar) {
        b("observeForever");
        b bVar = new b(vVar);
        c cVar = (c) this.f15882b.i(vVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVar != null) {
            return;
        }
        bVar.c(true);
    }

    public void j() {
    }

    public void k() {
    }

    public void l(Object obj) {
        boolean z9;
        synchronized (this.f15881a) {
            z9 = this.f15886f == f15880k;
            this.f15886f = obj;
        }
        if (z9) {
            C2167a.e().c(this.f15890j);
        }
    }

    public void m(v vVar) {
        b("removeObserver");
        c cVar = (c) this.f15882b.j(vVar);
        if (cVar == null) {
            return;
        }
        cVar.e();
        cVar.c(false);
    }

    public void n(InterfaceC1186p interfaceC1186p) {
        b("removeObservers");
        for (Map.Entry entry : this.f15882b) {
            if (((c) entry.getValue()).j(interfaceC1186p)) {
                m((v) entry.getKey());
            }
        }
    }

    public void o(Object obj) {
        b("setValue");
        this.f15887g++;
        this.f15885e = obj;
        e(null);
    }
}
