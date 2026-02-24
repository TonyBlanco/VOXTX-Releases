package t6;

import d6.InterfaceC1711a;
import d6.InterfaceC1712b;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC1711a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1711a f50778a = new c();

    public static final class a implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50779a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f50780b = c6.d.d("packageName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f50781c = c6.d.d("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f50782d = c6.d.d("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f50783e = c6.d.d("deviceManufacturer");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C2795a c2795a, c6.f fVar) {
            fVar.add(f50780b, c2795a.c());
            fVar.add(f50781c, c2795a.d());
            fVar.add(f50782d, c2795a.a());
            fVar.add(f50783e, c2795a.b());
        }
    }

    public static final class b implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f50784a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f50785b = c6.d.d("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f50786c = c6.d.d("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f50787d = c6.d.d("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f50788e = c6.d.d("osVersion");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f50789f = c6.d.d("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f50790g = c6.d.d("androidAppInfo");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C2796b c2796b, c6.f fVar) {
            fVar.add(f50785b, c2796b.b());
            fVar.add(f50786c, c2796b.c());
            fVar.add(f50787d, c2796b.f());
            fVar.add(f50788e, c2796b.e());
            fVar.add(f50789f, c2796b.d());
            fVar.add(f50790g, c2796b.a());
        }
    }

    /* JADX INFO: renamed from: t6.c$c, reason: collision with other inner class name */
    public static final class C0457c implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0457c f50791a = new C0457c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f50792b = c6.d.d("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f50793c = c6.d.d("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f50794d = c6.d.d("sessionSamplingRate");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f fVar, c6.f fVar2) {
            fVar2.add(f50792b, fVar.b());
            fVar2.add(f50793c, fVar.a());
            fVar2.add(f50794d, fVar.c());
        }
    }

    public static final class d implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f50795a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f50796b = c6.d.d("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f50797c = c6.d.d("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f50798d = c6.d.d("applicationInfo");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(r rVar, c6.f fVar) {
            fVar.add(f50796b, rVar.b());
            fVar.add(f50797c, rVar.c());
            fVar.add(f50798d, rVar.a());
        }
    }

    public static final class e implements c6.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f50799a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c6.d f50800b = c6.d.d("sessionId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c6.d f50801c = c6.d.d("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c6.d f50802d = c6.d.d("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c6.d f50803e = c6.d.d("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c6.d f50804f = c6.d.d("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c6.d f50805g = c6.d.d("firebaseInstallationId");

        @Override // c6.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(u uVar, c6.f fVar) {
            fVar.add(f50800b, uVar.e());
            fVar.add(f50801c, uVar.d());
            fVar.add(f50802d, uVar.f());
            fVar.add(f50803e, uVar.b());
            fVar.add(f50804f, uVar.a());
            fVar.add(f50805g, uVar.c());
        }
    }

    @Override // d6.InterfaceC1711a
    public void configure(InterfaceC1712b interfaceC1712b) {
        interfaceC1712b.registerEncoder(r.class, d.f50795a);
        interfaceC1712b.registerEncoder(u.class, e.f50799a);
        interfaceC1712b.registerEncoder(f.class, C0457c.f50791a);
        interfaceC1712b.registerEncoder(C2796b.class, b.f50784a);
        interfaceC1712b.registerEncoder(C2795a.class, a.f50779a);
    }
}
