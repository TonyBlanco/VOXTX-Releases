package h1;

import android.os.Handler;
import android.os.Looper;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f41565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f41566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f41567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f41568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1847b f41569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f41570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f41571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i[] f41572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1848c f41573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f41574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f41575k;

    public o(InterfaceC1847b interfaceC1847b, h hVar) {
        this(interfaceC1847b, hVar, 4);
    }

    public o(InterfaceC1847b interfaceC1847b, h hVar, int i9) {
        this(interfaceC1847b, hVar, i9, new f(new Handler(Looper.getMainLooper())));
    }

    public o(InterfaceC1847b interfaceC1847b, h hVar, int i9, q qVar) {
        this.f41565a = new AtomicInteger();
        this.f41566b = new HashSet();
        this.f41567c = new PriorityBlockingQueue();
        this.f41568d = new PriorityBlockingQueue();
        this.f41574j = new ArrayList();
        this.f41575k = new ArrayList();
        this.f41569e = interfaceC1847b;
        this.f41570f = hVar;
        this.f41572h = new i[i9];
        this.f41571g = qVar;
    }

    public n a(n nVar) {
        nVar.Q(this);
        synchronized (this.f41566b) {
            this.f41566b.add(nVar);
        }
        nVar.S(d());
        nVar.b("add-to-queue");
        e(nVar, 0);
        b(nVar);
        return nVar;
    }

    public void b(n nVar) {
        if (nVar.T()) {
            this.f41567c.add(nVar);
        } else {
            f(nVar);
        }
    }

    public void c(n nVar) {
        synchronized (this.f41566b) {
            this.f41566b.remove(nVar);
        }
        synchronized (this.f41574j) {
            Iterator it = this.f41574j.iterator();
            if (it.hasNext()) {
                AbstractC1617D.a(it.next());
                throw null;
            }
        }
        e(nVar, 5);
    }

    public int d() {
        return this.f41565a.incrementAndGet();
    }

    public void e(n nVar, int i9) {
        synchronized (this.f41575k) {
            try {
                Iterator it = this.f41575k.iterator();
                if (it.hasNext()) {
                    AbstractC1617D.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(n nVar) {
        this.f41568d.add(nVar);
    }

    public void g() {
        h();
        C1848c c1848c = new C1848c(this.f41567c, this.f41568d, this.f41569e, this.f41571g);
        this.f41573i = c1848c;
        c1848c.start();
        for (int i9 = 0; i9 < this.f41572h.length; i9++) {
            i iVar = new i(this.f41568d, this.f41570f, this.f41569e, this.f41571g);
            this.f41572h[i9] = iVar;
            iVar.start();
        }
    }

    public void h() {
        C1848c c1848c = this.f41573i;
        if (c1848c != null) {
            c1848c.d();
        }
        for (i iVar : this.f41572h) {
            if (iVar != null) {
                iVar.e();
            }
        }
    }
}
