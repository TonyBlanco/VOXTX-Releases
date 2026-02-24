package C2;

import d.AbstractC1617D;
import d6.InterfaceC1711a;
import d6.InterfaceC1712b;
import f6.C1777a;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements InterfaceC1711a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1711a f948a = new a();

    /* JADX INFO: renamed from: C2.a$a, reason: collision with other inner class name */
    public static final class C0008a implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0008a f949a = new C0008a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f950b = c6.d.a("window").b(C1777a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f951c = c6.d.a("logSourceMetrics").b(C1777a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f952d = c6.d.a("globalMetrics").b(C1777a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f953e = c6.d.a("appNamespace").b(C1777a.b().c(4).a()).a();

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(F2.a aVar, c6.f fVar) {
            fVar.add(f950b, aVar.d());
            fVar.add(f951c, aVar.c());
            fVar.add(f952d, aVar.b());
            fVar.add(f953e, aVar.a());
        }
    }

    public static final class b implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f954a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f955b = c6.d.a("storageMetrics").b(C1777a.b().c(1).a()).a();

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(F2.b bVar, c6.f fVar) {
            fVar.add(f955b, bVar.a());
        }
    }

    public static final class c implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f956a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f957b = c6.d.a("eventsDroppedCount").b(C1777a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f958c = c6.d.a("reason").b(C1777a.b().c(3).a()).a();

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(F2.c cVar, c6.f fVar) {
            fVar.add(f957b, cVar.a());
            fVar.add(f958c, cVar.b());
        }
    }

    public static final class d implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f959a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f960b = c6.d.a("logSource").b(C1777a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f961c = c6.d.a("logEventDropped").b(C1777a.b().c(2).a()).a();

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(F2.d dVar, c6.f fVar) {
            fVar.add(f960b, dVar.b());
            fVar.add(f961c, dVar.a());
        }
    }

    public static final class e implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f962a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f963b = c6.d.d("clientMetrics");

        public void a(m mVar, c6.f fVar) {
            throw null;
        }

        @Override // c6.b
        public /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
            AbstractC1617D.a(obj);
            a(null, (c6.f) obj2);
        }
    }

    public static final class f implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f964a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f965b = c6.d.a("currentCacheSizeBytes").b(C1777a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f966c = c6.d.a("maxCacheSizeBytes").b(C1777a.b().c(2).a()).a();

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(F2.e eVar, c6.f fVar) {
            fVar.add(f965b, eVar.a());
            fVar.add(f966c, eVar.b());
        }
    }

    public static final class g implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f967a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f968b = c6.d.a("startMs").b(C1777a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f969c = c6.d.a("endMs").b(C1777a.b().c(2).a()).a();

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(F2.f fVar, c6.f fVar2) {
            fVar2.add(f968b, fVar.b());
            fVar2.add(f969c, fVar.a());
        }
    }

    @Override // d6.InterfaceC1711a
    public void configure(InterfaceC1712b interfaceC1712b) {
        interfaceC1712b.registerEncoder(m.class, e.f962a);
        interfaceC1712b.registerEncoder(F2.a.class, C0008a.f949a);
        interfaceC1712b.registerEncoder(F2.f.class, g.f967a);
        interfaceC1712b.registerEncoder(F2.d.class, d.f959a);
        interfaceC1712b.registerEncoder(F2.c.class, c.f956a);
        interfaceC1712b.registerEncoder(F2.b.class, b.f954a);
        interfaceC1712b.registerEncoder(F2.e.class, f.f964a);
    }
}
