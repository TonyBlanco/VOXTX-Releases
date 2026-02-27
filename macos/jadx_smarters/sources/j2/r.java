package J2;

import D2.g;
import F2.c;
import K2.AbstractC0696k;
import K2.InterfaceC0688c;
import K2.InterfaceC0689d;
import L2.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import z2.C3014b;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2.e f3069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0689d f3070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f3071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f3072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L2.b f3073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M2.a f3074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M2.a f3075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0688c f3076i;

    public r(Context context, D2.e eVar, InterfaceC0689d interfaceC0689d, x xVar, Executor executor, L2.b bVar, M2.a aVar, M2.a aVar2, InterfaceC0688c interfaceC0688c) {
        this.f3068a = context;
        this.f3069b = eVar;
        this.f3070c = interfaceC0689d;
        this.f3071d = xVar;
        this.f3072e = executor;
        this.f3073f = bVar;
        this.f3074g = aVar;
        this.f3075h = aVar2;
        this.f3076i = interfaceC0688c;
    }

    public C2.i j(D2.m mVar) {
        L2.b bVar = this.f3073f;
        final InterfaceC0688c interfaceC0688c = this.f3076i;
        Objects.requireNonNull(interfaceC0688c);
        return mVar.a(C2.i.a().i(this.f3074g.a()).k(this.f3075h.a()).j("GDT_CLIENT_METRICS").h(new C2.h(C3014b.b("proto"), ((F2.a) bVar.a(new b.a() { // from class: J2.h
            @Override // L2.b.a
            public final Object execute() {
                return interfaceC0688c.e();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f3068a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final /* synthetic */ Boolean l(C2.p pVar) {
        return Boolean.valueOf(this.f3070c.M(pVar));
    }

    public final /* synthetic */ Iterable m(C2.p pVar) {
        return this.f3070c.L(pVar);
    }

    public final /* synthetic */ Object n(Iterable iterable, C2.p pVar, long j9) {
        this.f3070c.N(iterable);
        this.f3070c.P(pVar, this.f3074g.a() + j9);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.f3070c.z(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.f3076i.c();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f3076i.d(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(C2.p pVar, long j9) {
        this.f3070c.P(pVar, this.f3074g.a() + j9);
        return null;
    }

    public final /* synthetic */ Object s(C2.p pVar, int i9) {
        this.f3071d.b(pVar, i9 + 1);
        return null;
    }

    public final /* synthetic */ void t(final C2.p pVar, final int i9, Runnable runnable) {
        try {
            try {
                L2.b bVar = this.f3073f;
                final InterfaceC0689d interfaceC0689d = this.f3070c;
                Objects.requireNonNull(interfaceC0689d);
                bVar.a(new b.a() { // from class: J2.i
                    @Override // L2.b.a
                    public final Object execute() {
                        return Integer.valueOf(interfaceC0689d.y());
                    }
                });
                if (k()) {
                    u(pVar, i9);
                } else {
                    this.f3073f.a(new b.a() { // from class: J2.j
                        @Override // L2.b.a
                        public final Object execute() {
                            return this.f3049a.s(pVar, i9);
                        }
                    });
                }
            } catch (L2.a unused) {
                this.f3071d.b(pVar, i9 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public D2.g u(final C2.p pVar, int i9) {
        D2.g gVarB;
        D2.m mVar = this.f3069b.get(pVar.b());
        long jMax = 0;
        D2.g gVarE = D2.g.e(0L);
        while (true) {
            final long j9 = jMax;
            while (((Boolean) this.f3073f.a(new b.a() { // from class: J2.k
                @Override // L2.b.a
                public final Object execute() {
                    return this.f3052a.l(pVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f3073f.a(new b.a() { // from class: J2.l
                    @Override // L2.b.a
                    public final Object execute() {
                        return this.f3054a.m(pVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVar == null) {
                    G2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    gVarB = D2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC0696k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    gVarB = mVar.b(D2.f.a().b(arrayList).c(pVar.c()).a());
                }
                gVarE = gVarB;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f3073f.a(new b.a() { // from class: J2.m
                        @Override // L2.b.a
                        public final Object execute() {
                            return this.f3056a.n(iterable, pVar, j9);
                        }
                    });
                    this.f3071d.a(pVar, i9 + 1, true);
                    return gVarE;
                }
                this.f3073f.a(new b.a() { // from class: J2.n
                    @Override // L2.b.a
                    public final Object execute() {
                        return this.f3060a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j9, gVarE.b());
                    if (pVar.e()) {
                        this.f3073f.a(new b.a() { // from class: J2.o
                            @Override // L2.b.a
                            public final Object execute() {
                                return this.f3062a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strJ = ((AbstractC0696k) it2.next()).b().j();
                        map.put(strJ, !map.containsKey(strJ) ? 1 : Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    }
                    this.f3073f.a(new b.a() { // from class: J2.p
                        @Override // L2.b.a
                        public final Object execute() {
                            return this.f3063a.q(map);
                        }
                    });
                }
            }
            this.f3073f.a(new b.a() { // from class: J2.q
                @Override // L2.b.a
                public final Object execute() {
                    return this.f3065a.r(pVar, j9);
                }
            });
            return gVarE;
        }
    }

    public void v(final C2.p pVar, final int i9, final Runnable runnable) {
        this.f3072e.execute(new Runnable() { // from class: J2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f3043a.t(pVar, i9, runnable);
            }
        });
    }
}
