package U1;

import U1.a;
import U1.h;
import W1.a;
import W1.h;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import i2.InterfaceC1881c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import l2.InterfaceC2175b;
import m2.InterfaceC2224e;
import q2.AbstractC2535d;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class c implements U1.e, h.a, h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W1.h f9610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f9611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f9612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f9613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f9614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ReferenceQueue f9615h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExecutorService f9616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExecutorService f9617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final U1.e f9618c;

        public a(ExecutorService executorService, ExecutorService executorService2, U1.e eVar) {
            this.f9616a = executorService;
            this.f9617b = executorService2;
            this.f9618c = eVar;
        }

        public U1.d a(S1.c cVar, boolean z9) {
            return new U1.d(cVar, this.f9616a, this.f9617b, z9, this.f9618c);
        }
    }

    public static class b implements a.InterfaceC0122a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0132a f9619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile W1.a f9620b;

        public b(a.InterfaceC0132a interfaceC0132a) {
            this.f9619a = interfaceC0132a;
        }

        @Override // U1.a.InterfaceC0122a
        public W1.a a() {
            if (this.f9620b == null) {
                synchronized (this) {
                    try {
                        if (this.f9620b == null) {
                            this.f9620b = this.f9619a.build();
                        }
                        if (this.f9620b == null) {
                            this.f9620b = new W1.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f9620b;
        }
    }

    /* JADX INFO: renamed from: U1.c$c, reason: collision with other inner class name */
    public static class C0123c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U1.d f9621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2224e f9622b;

        public C0123c(InterfaceC2224e interfaceC2224e, U1.d dVar) {
            this.f9622b = interfaceC2224e;
            this.f9621a = dVar;
        }

        public void a() {
            this.f9621a.l(this.f9622b);
        }
    }

    public static class d implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f9623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReferenceQueue f9624b;

        public d(Map map, ReferenceQueue referenceQueue) {
            this.f9623a = map;
            this.f9624b = referenceQueue;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            e eVar = (e) this.f9624b.poll();
            if (eVar == null) {
                return true;
            }
            this.f9623a.remove(eVar.f9625a);
            return true;
        }
    }

    public static class e extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S1.c f9625a;

        public e(S1.c cVar, h hVar, ReferenceQueue referenceQueue) {
            super(hVar, referenceQueue);
            this.f9625a = cVar;
        }
    }

    public c(W1.h hVar, a.InterfaceC0132a interfaceC0132a, ExecutorService executorService, ExecutorService executorService2) {
        this(hVar, interfaceC0132a, executorService, executorService2, null, null, null, null, null);
    }

    public c(W1.h hVar, a.InterfaceC0132a interfaceC0132a, ExecutorService executorService, ExecutorService executorService2, Map map, g gVar, Map map2, a aVar, m mVar) {
        this.f9610c = hVar;
        this.f9614g = new b(interfaceC0132a);
        this.f9612e = map2 == null ? new HashMap() : map2;
        this.f9609b = gVar == null ? new g() : gVar;
        this.f9608a = map == null ? new HashMap() : map;
        this.f9611d = aVar == null ? new a(executorService, executorService2, this) : aVar;
        this.f9613f = mVar == null ? new m() : mVar;
        hVar.e(this);
    }

    public static void j(String str, long j9, S1.c cVar) {
        Log.v("Engine", str + " in " + AbstractC2535d.a(j9) + "ms, key: " + cVar);
    }

    @Override // U1.e
    public void a(U1.d dVar, S1.c cVar) {
        AbstractC2539h.a();
        if (dVar.equals((U1.d) this.f9608a.get(cVar))) {
            this.f9608a.remove(cVar);
        }
    }

    @Override // W1.h.a
    public void b(l lVar) {
        AbstractC2539h.a();
        this.f9613f.a(lVar);
    }

    @Override // U1.h.a
    public void c(S1.c cVar, h hVar) {
        AbstractC2539h.a();
        this.f9612e.remove(cVar);
        if (hVar.c()) {
            this.f9610c.a(cVar, hVar);
        } else {
            this.f9613f.a(hVar);
        }
    }

    @Override // U1.e
    public void d(S1.c cVar, h hVar) {
        AbstractC2539h.a();
        if (hVar != null) {
            hVar.e(cVar, this);
            if (hVar.c()) {
                this.f9612e.put(cVar, new e(cVar, hVar, f()));
            }
        }
        this.f9608a.remove(cVar);
    }

    public final h e(S1.c cVar) {
        l lVarD = this.f9610c.d(cVar);
        if (lVarD == null) {
            return null;
        }
        return lVarD instanceof h ? (h) lVarD : new h(lVarD, true);
    }

    public final ReferenceQueue f() {
        if (this.f9615h == null) {
            this.f9615h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new d(this.f9612e, this.f9615h));
        }
        return this.f9615h;
    }

    public C0123c g(S1.c cVar, int i9, int i10, T1.c cVar2, InterfaceC2175b interfaceC2175b, S1.g gVar, InterfaceC1881c interfaceC1881c, O1.i iVar, boolean z9, U1.b bVar, InterfaceC2224e interfaceC2224e) {
        AbstractC2539h.a();
        long jB = AbstractC2535d.b();
        f fVarA = this.f9609b.a(cVar2.getId(), cVar, i9, i10, interfaceC2175b.g(), interfaceC2175b.f(), gVar, interfaceC2175b.e(), interfaceC1881c, interfaceC2175b.b());
        h hVarI = i(fVarA, z9);
        if (hVarI != null) {
            interfaceC2224e.f(hVarI);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from cache", jB, fVarA);
            }
            return null;
        }
        h hVarH = h(fVarA, z9);
        if (hVarH != null) {
            interfaceC2224e.f(hVarH);
            if (Log.isLoggable("Engine", 2)) {
                j("Loaded resource from active resources", jB, fVarA);
            }
            return null;
        }
        U1.d dVar = (U1.d) this.f9608a.get(fVarA);
        if (dVar != null) {
            dVar.e(interfaceC2224e);
            if (Log.isLoggable("Engine", 2)) {
                j("Added to existing load", jB, fVarA);
            }
            return new C0123c(interfaceC2224e, dVar);
        }
        U1.d dVarA = this.f9611d.a(fVarA, z9);
        i iVar2 = new i(dVarA, new U1.a(fVarA, i9, i10, cVar2, interfaceC2175b, gVar, interfaceC1881c, this.f9614g, bVar, iVar), iVar);
        this.f9608a.put(fVarA, dVarA);
        dVarA.e(interfaceC2224e);
        dVarA.m(iVar2);
        if (Log.isLoggable("Engine", 2)) {
            j("Started new load", jB, fVarA);
        }
        return new C0123c(interfaceC2224e, dVarA);
    }

    public final h h(S1.c cVar, boolean z9) {
        h hVar = null;
        if (!z9) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f9612e.get(cVar);
        if (weakReference != null) {
            hVar = (h) weakReference.get();
            if (hVar != null) {
                hVar.a();
            } else {
                this.f9612e.remove(cVar);
            }
        }
        return hVar;
    }

    public final h i(S1.c cVar, boolean z9) {
        if (!z9) {
            return null;
        }
        h hVarE = e(cVar);
        if (hVarE != null) {
            hVarE.a();
            this.f9612e.put(cVar, new e(cVar, hVarE, f()));
        }
        return hVarE;
    }

    public void k(l lVar) {
        AbstractC2539h.a();
        if (!(lVar instanceof h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((h) lVar).d();
    }
}
