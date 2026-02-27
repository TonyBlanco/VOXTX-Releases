package F1;

import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v1.InterfaceC2864b;
import v1.InterfaceC2868f;
import y1.C2982a;
import z1.AbstractC3004c;
import z1.AbstractC3006e;
import z1.AbstractC3007f;
import z1.C3003b;
import z1.C3009h;
import z1.C3010i;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC3002a, F1.d, F1.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3009h f1819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3004c f1820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K1.d f1821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReadWriteLock f1822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f1823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f1824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F1.a f1825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E1.b f1826i;

    public class a extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.a f1828e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Executor executor, InterfaceC2868f interfaceC2868f, InterfaceC2868f.a aVar) {
            super(executor);
            this.f1827d = interfaceC2868f;
            this.f1828e = aVar;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean d() {
            e.this.r(e.this.L(this.f1827d, this.f1828e, false, null));
            return Boolean.TRUE;
        }
    }

    public class b extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C3003b f1830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.b f1831e;

        public class a implements F1.i {
            public a() {
            }

            @Override // F1.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Set a(F1.j jVar) {
                b bVar = b.this;
                e eVar = e.this;
                bVar.getClass();
                b bVar2 = b.this;
                return eVar.K(null, bVar2.f1830d, bVar2.f1831e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Executor executor, InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
            super(executor);
            this.f1830d = c3003b;
            this.f1831e = bVar;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Set d() {
            return (Set) e.this.n(new a());
        }
    }

    public class c extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C3003b f1834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.b f1835e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Executor executor, InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
            super(executor);
            this.f1834d = c3003b;
            this.f1835e = bVar;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean d() {
            e.this.r(e.this.K(null, this.f1834d, this.f1835e));
            return Boolean.TRUE;
        }
    }

    public class d implements F1.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1837a;

        public d(InterfaceC2868f interfaceC2868f) {
            this.f1837a = interfaceC2868f;
        }

        @Override // F1.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(F1.d dVar) {
            String strB = AbstractC3004c.rootKeyForOperation(this.f1837a).b();
            C2982a c2982a = C2982a.f52130b;
            C3010i c3010iT = dVar.t(strB, c2982a);
            if (c3010iT == null) {
                return null;
            }
            return this.f1837a.wrapData((InterfaceC2868f.a) this.f1837a.responseFieldMapper().map(new K1.b(this.f1837a.variables(), c3010iT, new H1.a(dVar, this.f1837a.variables(), e.this.a(), c2982a, e.this.f1825h), e.this.f1821d, F1.h.f1882h)));
        }
    }

    /* JADX INFO: renamed from: F1.e$e, reason: collision with other inner class name */
    public class C0025e implements F1.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2982a f1840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ F1.h f1841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v1.l f1842d;

        public C0025e(InterfaceC2868f interfaceC2868f, C2982a c2982a, F1.h hVar, v1.l lVar) {
            this.f1839a = interfaceC2868f;
            this.f1840b = c2982a;
            this.f1841c = hVar;
            this.f1842d = lVar;
        }

        @Override // F1.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v1.i a(F1.d dVar) {
            C3010i c3010iT = dVar.t(AbstractC3004c.rootKeyForOperation(this.f1839a).b(), this.f1840b);
            if (c3010iT != null) {
                K1.b bVar = new K1.b(this.f1839a.variables(), c3010iT, new H1.a(dVar, this.f1839a.variables(), e.this.a(), this.f1840b, e.this.f1825h), e.this.f1821d, this.f1841c);
                try {
                    this.f1841c.p(this.f1839a);
                    return v1.i.a(this.f1839a).g(this.f1839a.wrapData((InterfaceC2868f.a) this.f1842d.map(bVar))).j(true).h(this.f1841c.k()).f();
                } catch (Exception e9) {
                    e.this.f1826i.d(e9, "Failed to read cache response", new Object[0]);
                }
            }
            return v1.i.a(this.f1839a).j(true).f();
        }
    }

    public class f implements F1.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3003b f1844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.b f1845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v1.l f1846c;

        public f(C3003b c3003b, InterfaceC2868f.b bVar, v1.l lVar) {
            this.f1844a = c3003b;
            this.f1845b = bVar;
            this.f1846c = lVar;
        }

        @Override // F1.i
        public /* bridge */ /* synthetic */ Object a(Object obj) {
            b((F1.d) obj);
            return null;
        }

        public InterfaceC2864b b(F1.d dVar) {
            String strB = this.f1844a.b();
            C2982a c2982a = C2982a.f52130b;
            C3010i c3010iT = dVar.t(strB, c2982a);
            if (c3010iT == null) {
                return null;
            }
            AbstractC1617D.a(this.f1846c.map(new K1.b(this.f1845b, c3010iT, new H1.a(dVar, this.f1845b, e.this.a(), c2982a, e.this.f1825h), e.this.f1821d, F1.h.f1882h)));
            return null;
        }
    }

    public class g extends F1.h {
        public g() {
        }

        @Override // F1.h
        public F1.a j() {
            return e.this.f1825h;
        }

        @Override // F1.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3003b n(v1.k kVar, Map map) {
            return e.this.f1820c.fromFieldRecordSet(kVar, map);
        }
    }

    public class h implements F1.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.a f1850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ UUID f1852d;

        public h(InterfaceC2868f interfaceC2868f, InterfaceC2868f.a aVar, boolean z9, UUID uuid) {
            this.f1849a = interfaceC2868f;
            this.f1850b = aVar;
            this.f1851c = z9;
            this.f1852d = uuid;
        }

        @Override // F1.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set a(F1.j jVar) {
            F1.b bVar = new F1.b(this.f1849a.variables(), e.this.f1821d);
            this.f1850b.marshaller().marshal(bVar);
            F1.h hVarJ = e.this.j();
            hVarJ.p(this.f1849a);
            Collection collectionF = bVar.f(hVarJ);
            if (!this.f1851c) {
                return e.this.f1819b.e(collectionF, C2982a.f52130b);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionF.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3010i) it.next()).i().e(this.f1852d).c());
            }
            return e.this.f1819b.j(arrayList);
        }
    }

    public class i implements F1.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.b f1854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3003b f1855b;

        public i(InterfaceC2868f.b bVar, InterfaceC2864b interfaceC2864b, C3003b c3003b) {
            this.f1854a = bVar;
            this.f1855b = c3003b;
        }

        @Override // F1.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Set a(F1.j jVar) {
            new F1.b(this.f1854a, e.this.f1821d);
            throw null;
        }
    }

    public class j extends F1.h {
        public j() {
        }

        @Override // F1.h
        public F1.a j() {
            return e.this.f1825h;
        }

        @Override // F1.h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C3003b n(v1.k kVar, C3010i c3010i) {
            return C3003b.a(c3010i.g());
        }
    }

    public class k extends AbstractC3006e {

        public class a implements F1.i {
            public a() {
            }

            @Override // F1.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean a(F1.j jVar) {
                e.this.f1819b.b();
                return Boolean.TRUE;
            }
        }

        public k(Executor executor) {
            super(executor);
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean d() {
            return (Boolean) e.this.n(new a());
        }
    }

    public class l extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C3003b f1860d;

        public class a implements F1.i {
            public a() {
            }

            @Override // F1.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean a(F1.j jVar) {
                return Boolean.valueOf(e.this.f1819b.h(l.this.f1860d));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Executor executor, C3003b c3003b) {
            super(executor);
            this.f1860d = c3003b;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean d() {
            return (Boolean) e.this.n(new a());
        }
    }

    public class m extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f1863d;

        public class a implements F1.i {
            public a() {
            }

            @Override // F1.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer a(F1.j jVar) {
                Iterator it = m.this.f1863d.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    if (e.this.f1819b.h((C3003b) it.next())) {
                        i9++;
                    }
                }
                return Integer.valueOf(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Executor executor, List list) {
            super(executor);
            this.f1863d = list;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Integer d() {
            return (Integer) e.this.n(new a());
        }
    }

    public class n extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1866d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Executor executor, InterfaceC2868f interfaceC2868f) {
            super(executor);
            this.f1866d = interfaceC2868f;
        }

        @Override // z1.AbstractC3006e
        public Object d() {
            return e.this.H(this.f1866d);
        }
    }

    public class o extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v1.l f1869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ F1.h f1870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C2982a f1871g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Executor executor, InterfaceC2868f interfaceC2868f, v1.l lVar, F1.h hVar, C2982a c2982a) {
            super(executor);
            this.f1868d = interfaceC2868f;
            this.f1869e = lVar;
            this.f1870f = hVar;
            this.f1871g = c2982a;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public v1.i d() {
            return e.this.J(this.f1868d, this.f1869e, this.f1870f, this.f1871g);
        }
    }

    public class p extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v1.l f1873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C3003b f1874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.b f1875f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Executor executor, v1.l lVar, C3003b c3003b, InterfaceC2868f.b bVar) {
            super(executor);
            this.f1873d = lVar;
            this.f1874e = c3003b;
            this.f1875f = bVar;
        }

        @Override // z1.AbstractC3006e
        public /* bridge */ /* synthetic */ Object d() {
            e();
            return null;
        }

        public InterfaceC2864b e() {
            e.C(e.this, this.f1873d, this.f1874e, this.f1875f);
            return null;
        }
    }

    public class q extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f f1877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2868f.a f1878e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Executor executor, InterfaceC2868f interfaceC2868f, InterfaceC2868f.a aVar) {
            super(executor);
            this.f1877d = interfaceC2868f;
            this.f1878e = aVar;
        }

        @Override // z1.AbstractC3006e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Set d() {
            return e.this.L(this.f1877d, this.f1878e, false, null);
        }
    }

    public e(AbstractC3007f abstractC3007f, AbstractC3004c abstractC3004c, K1.d dVar, Executor executor, E1.b bVar) {
        x1.g.c(abstractC3007f, "cacheStore == null");
        this.f1819b = (C3009h) new C3009h().a(abstractC3007f);
        this.f1820c = (AbstractC3004c) x1.g.c(abstractC3004c, "cacheKeyResolver == null");
        this.f1821d = (K1.d) x1.g.c(dVar, "scalarTypeAdapters == null");
        this.f1824g = (Executor) x1.g.c(executor, "dispatcher == null");
        this.f1826i = (E1.b) x1.g.c(bVar, "logger == null");
        this.f1822e = new ReentrantReadWriteLock();
        this.f1823f = Collections.newSetFromMap(new WeakHashMap());
        this.f1825h = new F1.f();
    }

    public static /* synthetic */ InterfaceC2864b C(e eVar, v1.l lVar, C3003b c3003b, InterfaceC2868f.b bVar) {
        eVar.I(lVar, c3003b, bVar);
        return null;
    }

    public final Object H(InterfaceC2868f interfaceC2868f) {
        return o(new d(interfaceC2868f));
    }

    public final InterfaceC2864b I(v1.l lVar, C3003b c3003b, InterfaceC2868f.b bVar) {
        AbstractC1617D.a(o(new f(c3003b, bVar, lVar)));
        return null;
    }

    public final v1.i J(InterfaceC2868f interfaceC2868f, v1.l lVar, F1.h hVar, C2982a c2982a) {
        return (v1.i) o(new C0025e(interfaceC2868f, c2982a, hVar, lVar));
    }

    public final Set K(InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
        return (Set) n(new i(bVar, interfaceC2864b, c3003b));
    }

    public final Set L(InterfaceC2868f interfaceC2868f, InterfaceC2868f.a aVar, boolean z9, UUID uuid) {
        return (Set) n(new h(interfaceC2868f, aVar, z9, uuid));
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3004c a() {
        return this.f1820c;
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e b(InterfaceC2868f interfaceC2868f, InterfaceC2868f.a aVar) {
        return new a(this.f1824g, interfaceC2868f, aVar);
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e c(InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
        return new c(this.f1824g, interfaceC2864b, c3003b, bVar);
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e d(C3003b c3003b) {
        x1.g.c(c3003b, "cacheKey == null");
        return new l(this.f1824g, c3003b);
    }

    @Override // z1.InterfaceC3002a
    public F1.h e() {
        return new j();
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e f(v1.l lVar, C3003b c3003b, InterfaceC2868f.b bVar) {
        x1.g.c(lVar, "responseFieldMapper == null");
        x1.g.c(c3003b, "cacheKey == null");
        x1.g.c(bVar, "variables == null");
        return new p(this.f1824g, lVar, c3003b, bVar);
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e g(InterfaceC2864b interfaceC2864b, C3003b c3003b, InterfaceC2868f.b bVar) {
        x1.g.c(interfaceC2864b, "fragment == null");
        x1.g.c(c3003b, "cacheKey == null");
        x1.g.c(bVar, "operation == null");
        if (c3003b != C3003b.f52622b) {
            return new b(this.f1824g, interfaceC2864b, c3003b, bVar);
        }
        throw new IllegalArgumentException("undefined cache key");
    }

    @Override // z1.InterfaceC3002a
    public synchronized void h(InterfaceC3002a.InterfaceC0490a interfaceC0490a) {
        this.f1823f.remove(interfaceC0490a);
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e i(InterfaceC2868f interfaceC2868f, InterfaceC2868f.a aVar) {
        x1.g.c(interfaceC2868f, "operation == null");
        x1.g.c(aVar, "operationData == null");
        return new q(this.f1824g, interfaceC2868f, aVar);
    }

    @Override // z1.InterfaceC3002a
    public F1.h j() {
        return new g();
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e k(InterfaceC2868f interfaceC2868f) {
        x1.g.c(interfaceC2868f, "operation == null");
        return new n(this.f1824g, interfaceC2868f);
    }

    @Override // z1.InterfaceC3002a
    public synchronized void l(InterfaceC3002a.InterfaceC0490a interfaceC0490a) {
        this.f1823f.add(interfaceC0490a);
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e m(List list) {
        x1.g.c(list, "cacheKey == null");
        return new m(this.f1824g, list);
    }

    @Override // z1.InterfaceC3002a
    public Object n(F1.i iVar) {
        this.f1822e.writeLock().lock();
        try {
            return iVar.a(this);
        } finally {
            this.f1822e.writeLock().unlock();
        }
    }

    @Override // z1.InterfaceC3002a
    public Object o(F1.i iVar) {
        this.f1822e.readLock().lock();
        try {
            return iVar.a(this);
        } finally {
            this.f1822e.readLock().unlock();
        }
    }

    @Override // F1.d
    public Collection p(Collection collection, C2982a c2982a) {
        return this.f1819b.d((Collection) x1.g.c(collection, "keys == null"), c2982a);
    }

    @Override // F1.j
    public Set q(Collection collection, C2982a c2982a) {
        return this.f1819b.e((Collection) x1.g.c(collection, "recordSet == null"), c2982a);
    }

    @Override // z1.InterfaceC3002a
    public void r(Set set) {
        LinkedHashSet linkedHashSet;
        x1.g.c(set, "changedKeys == null");
        if (set.isEmpty()) {
            return;
        }
        synchronized (this) {
            linkedHashSet = new LinkedHashSet(this.f1823f);
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC3002a.InterfaceC0490a) it.next()).a(set);
        }
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e s() {
        return new k(this.f1824g);
    }

    @Override // F1.d
    public C3010i t(String str, C2982a c2982a) {
        return this.f1819b.c((String) x1.g.c(str, "key == null"), c2982a);
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3007f u() {
        return this.f1819b;
    }

    @Override // z1.InterfaceC3002a
    public AbstractC3006e v(InterfaceC2868f interfaceC2868f, v1.l lVar, F1.h hVar, C2982a c2982a) {
        x1.g.c(interfaceC2868f, "operation == null");
        x1.g.c(hVar, "responseNormalizer == null");
        return new o(this.f1824g, interfaceC2868f, lVar, hVar, c2982a);
    }

    @Override // F1.j
    public Set w(C3010i c3010i, C2982a c2982a) {
        return this.f1819b.f((C3010i) x1.g.c(c3010i, "record == null"), c2982a);
    }
}
