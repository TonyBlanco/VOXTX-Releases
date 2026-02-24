package E1;

import D1.a;
import E1.c;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.HttpUrl;
import u1.InterfaceC2844c;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.InterfaceC2869g;
import v1.l;
import w1.AbstractC2902b;
import w1.InterfaceC2901a;
import x1.InterfaceC2951b;
import y1.C2982a;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AppSyncQueryCall, AppSyncMutationCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2868f f1587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f1588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Call.Factory f1589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2902b.c f1590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f1591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K1.d f1592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3002a f1593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2982a f1594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1.a f1595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D1.b f1596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Executor f1597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E1.b f1598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E1.a f1599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f1600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f1602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x1.d f1603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f1605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f1606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x1.d f1607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public L1.b f1608v;

    public class a implements a.InterfaceC0015a {

        /* JADX INFO: renamed from: E1.e$a$a, reason: collision with other inner class name */
        public class C0020a implements InterfaceC2951b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.b f1610a;

            public C0020a(a.b bVar) {
                this.f1610a = bVar;
            }

            @Override // x1.InterfaceC2951b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void apply(InterfaceC2844c.a aVar) {
                InterfaceC2844c.b bVar;
                int i9 = c.f1614b[this.f1610a.ordinal()];
                if (i9 == 1) {
                    bVar = InterfaceC2844c.b.FETCH_CACHE;
                } else if (i9 != 2) {
                    return;
                } else {
                    bVar = InterfaceC2844c.b.FETCH_NETWORK;
                }
                aVar.onStatusEvent(bVar);
            }
        }

        public a() {
        }

        @Override // D1.a.InterfaceC0015a
        public void onCompleted() {
            x1.d dVarM = e.this.m();
            if (e.this.f1603q.f()) {
                ((E1.d) e.this.f1603q.e()).d();
            }
            if (dVarM.f()) {
                ((InterfaceC2844c.a) dVarM.e()).onStatusEvent(InterfaceC2844c.b.COMPLETED);
            } else {
                e eVar = e.this;
                eVar.f1598l.a("onCompleted for operation: %s. No callback present.", eVar.operation().name().name());
            }
        }

        @Override // D1.a.InterfaceC0015a
        public void onFailure(B1.b bVar) {
            x1.d dVarM = e.this.m();
            if (!dVarM.f()) {
                e eVar = e.this;
                eVar.f1598l.b(bVar, "onFailure for operation: %s. No callback present.", eVar.operation().name().name());
                return;
            }
            if (bVar instanceof B1.c) {
                ((InterfaceC2844c.a) dVarM.e()).onHttpError((B1.c) bVar);
                return;
            }
            if (bVar instanceof B1.e) {
                ((InterfaceC2844c.a) dVarM.e()).onParseError((B1.e) bVar);
                return;
            }
            boolean z9 = bVar instanceof B1.d;
            InterfaceC2844c.a aVar = (InterfaceC2844c.a) dVarM.e();
            if (z9) {
                aVar.onNetworkError((B1.d) bVar);
            } else {
                aVar.onFailure(bVar);
            }
        }

        @Override // D1.a.InterfaceC0015a
        public void onFetch(a.b bVar) {
            e.this.k().b(new C0020a(bVar));
        }

        @Override // D1.a.InterfaceC0015a
        public void onResponse(a.d dVar) {
            x1.d dVarK = e.this.k();
            if (dVarK.f()) {
                ((InterfaceC2844c.a) dVarK.e()).onResponse((v1.i) dVar.f1323b.e());
            } else {
                e eVar = e.this;
                eVar.f1598l.a("onResponse for operation: %s. No callback present.", eVar.operation().name().name());
            }
        }
    }

    public class b implements InterfaceC2951b {
        public b() {
        }

        @Override // x1.InterfaceC2951b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(InterfaceC2844c.a aVar) {
            aVar.onStatusEvent(InterfaceC2844c.b.SCHEDULED);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1614b;

        static {
            int[] iArr = new int[a.b.values().length];
            f1614b = iArr;
            try {
                iArr[a.b.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1614b[a.b.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[E1.c.values().length];
            f1613a = iArr2;
            try {
                iArr2[E1.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1613a[E1.c.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1613a[E1.c.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1613a[E1.c.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC2868f f1615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HttpUrl f1616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Call.Factory f1617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC2902b.c f1618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f1619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public K1.d f1620f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC3002a f1621g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C1.a f1622h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public C2982a f1623i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Executor f1624j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public E1.b f1625k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List f1626l;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public E1.a f1629o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f1630p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public L1.b f1632r;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public List f1627m = Collections.emptyList();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public List f1628n = Collections.emptyList();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public x1.d f1631q = x1.d.a();

        public d a(InterfaceC3002a interfaceC3002a) {
            this.f1621g = interfaceC3002a;
            return this;
        }

        public d b(List list) {
            this.f1626l = list;
            return this;
        }

        public e c() {
            return new e(this, null);
        }

        public d d(C2982a c2982a) {
            this.f1623i = c2982a;
            return this;
        }

        public d e(Executor executor) {
            this.f1624j = executor;
            return this;
        }

        public d f(InterfaceC2901a interfaceC2901a) {
            return this;
        }

        public d g(AbstractC2902b.c cVar) {
            this.f1618d = cVar;
            return this;
        }

        public d h(Call.Factory factory) {
            this.f1617c = factory;
            return this;
        }

        public d i(E1.b bVar) {
            this.f1625k = bVar;
            return this;
        }

        public d j(InterfaceC2868f interfaceC2868f) {
            this.f1615a = interfaceC2868f;
            return this;
        }

        public d k(x1.d dVar) {
            this.f1631q = dVar;
            return this;
        }

        public d l(List list) {
            this.f1628n = list != null ? new ArrayList(list) : Collections.emptyList();
            return this;
        }

        public d m(List list) {
            this.f1627m = list != null ? new ArrayList(list) : Collections.emptyList();
            return this;
        }

        public d n(C1.a aVar) {
            this.f1622h = aVar;
            return this;
        }

        public d o(i iVar) {
            this.f1619e = iVar;
            return this;
        }

        public d p(K1.d dVar) {
            this.f1620f = dVar;
            return this;
        }

        public d q(boolean z9) {
            this.f1630p = z9;
            return this;
        }

        public d r(HttpUrl httpUrl) {
            this.f1616b = httpUrl;
            return this;
        }

        public d s(L1.b bVar) {
            this.f1632r = bVar;
            return this;
        }

        public d t(E1.a aVar) {
            this.f1629o = aVar;
            return this;
        }
    }

    public e(d dVar) {
        this.f1605s = new AtomicReference(E1.c.IDLE);
        this.f1606t = new AtomicReference();
        InterfaceC2868f interfaceC2868f = dVar.f1615a;
        this.f1587a = interfaceC2868f;
        this.f1588b = dVar.f1616b;
        this.f1589c = dVar.f1617c;
        this.f1590d = dVar.f1618d;
        this.f1591e = dVar.f1619e;
        this.f1592f = dVar.f1620f;
        this.f1593g = dVar.f1621g;
        this.f1595i = dVar.f1622h;
        this.f1594h = dVar.f1623i;
        this.f1597k = dVar.f1624j;
        this.f1598l = dVar.f1625k;
        this.f1600n = dVar.f1626l;
        List list = dVar.f1627m;
        this.f1601o = list;
        List list2 = dVar.f1628n;
        this.f1602p = list2;
        this.f1599m = dVar.f1629o;
        this.f1608v = dVar.f1632r;
        this.f1603q = ((list2.isEmpty() && list.isEmpty()) || dVar.f1621g == null) ? x1.d.a() : x1.d.h(E1.d.b().h(dVar.f1628n).i(list).l(dVar.f1616b).f(dVar.f1617c).j(dVar.f1619e).k(dVar.f1620f).a(dVar.f1621g).e(dVar.f1624j).g(dVar.f1625k).b(dVar.f1626l).d(dVar.f1629o).c());
        this.f1604r = dVar.f1630p;
        this.f1596j = j(interfaceC2868f);
        this.f1607u = dVar.f1631q;
    }

    public /* synthetic */ e(d dVar, a aVar) {
        this(dVar);
    }

    private synchronized void c(x1.d dVar) {
        try {
            int i9 = c.f1613a[((E1.c) this.f1605s.get()).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    this.f1606t.set(dVar.k());
                    this.f1599m.e(this);
                    dVar.b(new b());
                    this.f1605s.set(E1.c.ACTIVE);
                } else {
                    if (i9 == 3) {
                        throw new B1.a("Call is cancelled.");
                    }
                    if (i9 != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
            }
            throw new IllegalStateException("Already Executed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public static d d() {
        return new d();
    }

    private a.InterfaceC0015a i() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized x1.d k() {
        try {
            int i9 = c.f1613a[((E1.c) this.f1605s.get()).ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            throw new IllegalStateException("Unknown state");
                        }
                    }
                }
                throw new IllegalStateException(c.a.b((E1.c) this.f1605s.get()).a(E1.c.ACTIVE, E1.c.CANCELED));
            }
        } catch (Throwable th) {
            throw th;
        }
        return x1.d.d(this.f1606t.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized x1.d m() {
        try {
            int i9 = c.f1613a[((E1.c) this.f1605s.get()).ordinal()];
            if (i9 == 1) {
                this.f1599m.k(this);
                this.f1605s.set(E1.c.TERMINATED);
                return x1.d.d(this.f1606t.getAndSet(null));
            }
            if (i9 != 2) {
                if (i9 == 3) {
                    return x1.d.d(this.f1606t.getAndSet(null));
                }
                if (i9 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(c.a.b((E1.c) this.f1605s.get()).a(E1.c.ACTIVE, E1.c.CANCELED));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public synchronized void cancel() {
        try {
            int i9 = c.f1613a[((E1.c) this.f1605s.get()).ordinal()];
            if (i9 == 1) {
                this.f1605s.set(E1.c.CANCELED);
                try {
                    if (this.f1587a instanceof InterfaceC2867e) {
                        f();
                    }
                    this.f1596j.dispose();
                    if (this.f1603q.f()) {
                        ((E1.d) this.f1603q.e()).c();
                    }
                    this.f1599m.k(this);
                    this.f1606t.set(null);
                } catch (Throwable th) {
                    this.f1599m.k(this);
                    this.f1606t.set(null);
                    throw th;
                }
            } else if (i9 == 2) {
                this.f1605s.set(E1.c.CANCELED);
            } else if (i9 != 3 && i9 != 4) {
                throw new IllegalStateException("Unknown state");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e mo0cacheHeaders(C2982a c2982a) {
        if (this.f1605s.get() == E1.c.IDLE) {
            return n().d((C2982a) x1.g.c(c2982a, "cacheHeaders == null")).c();
        }
        throw new IllegalStateException("Already Executed");
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public void enqueue(InterfaceC2844c.a aVar) {
        try {
            c(x1.d.d(aVar));
            this.f1596j.a(a.c.a(this.f1587a).b(this.f1594h).c(false).e(this.f1607u).a(), this.f1597k, i());
        } catch (B1.a e9) {
            if (aVar != null) {
                aVar.onCanceledError(e9);
            } else {
                this.f1598l.d(e9, "Operation: %s was canceled", operation().name().name());
            }
        }
    }

    public final void f() {
        D1.a aVar;
        InterfaceC2867e interfaceC2867e = (InterfaceC2867e) this.f1587a;
        Iterator it = this.f1600n.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            } else {
                aVar = (D1.a) it.next();
                if ("AppSyncOfflineMutationInterceptor".equalsIgnoreCase(aVar.getClass().getSimpleName())) {
                    break;
                }
            }
        }
        if (aVar == null) {
            return;
        }
        try {
            aVar.getClass().getMethod("dispose", InterfaceC2867e.class).invoke(aVar, interfaceC2867e);
        } catch (Exception e9) {
            this.f1598l.g(e9, "unable to invoke dispose method", new Object[0]);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e mo1clone() {
        return n().c();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e httpCachePolicy(AbstractC2902b.c cVar) {
        if (this.f1605s.get() == E1.c.IDLE) {
            return n().g((AbstractC2902b.c) x1.g.c(cVar, "httpCachePolicy == null")).c();
        }
        throw new IllegalStateException("Already Executed");
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public boolean isCanceled() {
        return this.f1605s.get() == E1.c.CANCELED;
    }

    public final D1.b j(InterfaceC2868f interfaceC2868f) {
        ArrayList arrayList = new ArrayList();
        AbstractC2902b.c cVar = interfaceC2868f instanceof v1.h ? this.f1590d : null;
        l lVarA = this.f1591e.a(interfaceC2868f);
        arrayList.addAll(this.f1600n);
        arrayList.add(this.f1595i.a(this.f1598l));
        arrayList.add(new I1.a(this.f1593g, lVarA, this.f1597k, this.f1598l));
        arrayList.add(new I1.b(null, this.f1593g.j(), lVarA, this.f1592f, this.f1598l));
        arrayList.add(new I1.d(this.f1608v, this.f1593g.j()));
        arrayList.add(new I1.c(this.f1588b, this.f1589c, cVar, false, this.f1592f, this.f1598l, this.f1604r));
        return new I1.e(arrayList);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e responseFetcher(C1.a aVar) {
        if (this.f1605s.get() == E1.c.IDLE) {
            return n().n((C1.a) x1.g.c(aVar, "responseFetcher == null")).c();
        }
        throw new IllegalStateException("Already Executed");
    }

    public d n() {
        return d().j(this.f1587a).r(this.f1588b).h(this.f1589c).f(null).g(this.f1590d).o(this.f1591e).p(this.f1592f).a(this.f1593g).d(this.f1594h).n(this.f1595i).e(this.f1597k).i(this.f1598l).b(this.f1600n).t(this.f1599m).m(this.f1601o).l(this.f1602p).q(this.f1604r).k(this.f1607u);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g watcher() {
        return new g(clone(), this.f1593g, this.f1598l, this.f1599m);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall, u1.InterfaceC2844c, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public InterfaceC2868f operation() {
        return this.f1587a;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public AppSyncMutationCall refetchQueries(InterfaceC2869g... interfaceC2869gArr) {
        if (this.f1605s.get() == E1.c.IDLE) {
            return n().m(Arrays.asList((Object[]) x1.g.c(interfaceC2869gArr, "operationNames == null"))).c();
        }
        throw new IllegalStateException("Already Executed");
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    public AppSyncMutationCall refetchQueries(v1.h... hVarArr) {
        if (this.f1605s.get() == E1.c.IDLE) {
            return n().l(Arrays.asList((Object[]) x1.g.c(hVarArr, "queries == null"))).c();
        }
        throw new IllegalStateException("Already Executed");
    }
}
