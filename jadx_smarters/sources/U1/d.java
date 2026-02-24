package U1;

import U1.i;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import m2.InterfaceC2224e;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class d implements i.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f9626q = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Handler f9627r = new Handler(Looper.getMainLooper(), new c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f9629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f9630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S1.c f9631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f9632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f9633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f9636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Exception f9638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Set f9640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f9641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f9642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile Future f9643p;

    public static class b {
        public h a(l lVar, boolean z9) {
            return new h(lVar, z9);
        }
    }

    public static class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (1 != i9 && 2 != i9) {
                return false;
            }
            d dVar = (d) message.obj;
            if (1 == i9) {
                dVar.j();
            } else {
                dVar.i();
            }
            return true;
        }
    }

    public d(S1.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z9, e eVar) {
        this(cVar, executorService, executorService2, z9, eVar, f9626q);
    }

    public d(S1.c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z9, e eVar, b bVar) {
        this.f9628a = new ArrayList();
        this.f9631d = cVar;
        this.f9632e = executorService;
        this.f9633f = executorService2;
        this.f9634g = z9;
        this.f9630c = eVar;
        this.f9629b = bVar;
    }

    @Override // m2.InterfaceC2224e
    public void a(Exception exc) {
        this.f9638k = exc;
        f9627r.obtainMessage(2, this).sendToTarget();
    }

    @Override // U1.i.a
    public void c(i iVar) {
        this.f9643p = this.f9633f.submit(iVar);
    }

    public void e(InterfaceC2224e interfaceC2224e) {
        AbstractC2539h.a();
        if (this.f9637j) {
            interfaceC2224e.f(this.f9642o);
        } else if (this.f9639l) {
            interfaceC2224e.a(this.f9638k);
        } else {
            this.f9628a.add(interfaceC2224e);
        }
    }

    @Override // m2.InterfaceC2224e
    public void f(l lVar) {
        this.f9636i = lVar;
        f9627r.obtainMessage(1, this).sendToTarget();
    }

    public final void g(InterfaceC2224e interfaceC2224e) {
        if (this.f9640m == null) {
            this.f9640m = new HashSet();
        }
        this.f9640m.add(interfaceC2224e);
    }

    public void h() {
        if (this.f9639l || this.f9637j || this.f9635h) {
            return;
        }
        this.f9641n.b();
        Future future = this.f9643p;
        if (future != null) {
            future.cancel(true);
        }
        this.f9635h = true;
        this.f9630c.a(this, this.f9631d);
    }

    public final void i() {
        if (this.f9635h) {
            return;
        }
        if (this.f9628a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
        this.f9639l = true;
        this.f9630c.d(this.f9631d, null);
        for (InterfaceC2224e interfaceC2224e : this.f9628a) {
            if (!k(interfaceC2224e)) {
                interfaceC2224e.a(this.f9638k);
            }
        }
    }

    public final void j() {
        if (this.f9635h) {
            this.f9636i.b();
            return;
        }
        if (this.f9628a.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        h hVarA = this.f9629b.a(this.f9636i, this.f9634g);
        this.f9642o = hVarA;
        this.f9637j = true;
        hVarA.a();
        this.f9630c.d(this.f9631d, this.f9642o);
        for (InterfaceC2224e interfaceC2224e : this.f9628a) {
            if (!k(interfaceC2224e)) {
                this.f9642o.a();
                interfaceC2224e.f(this.f9642o);
            }
        }
        this.f9642o.d();
    }

    public final boolean k(InterfaceC2224e interfaceC2224e) {
        Set set = this.f9640m;
        return set != null && set.contains(interfaceC2224e);
    }

    public void l(InterfaceC2224e interfaceC2224e) {
        AbstractC2539h.a();
        if (this.f9637j || this.f9639l) {
            g(interfaceC2224e);
            return;
        }
        this.f9628a.remove(interfaceC2224e);
        if (this.f9628a.isEmpty()) {
            h();
        }
    }

    public void m(i iVar) {
        this.f9641n = iVar;
        this.f9643p = this.f9632e.submit(iVar);
    }
}
