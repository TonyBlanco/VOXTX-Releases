package v6;

import F8.a;
import android.util.Log;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.json.JSONObject;
import p8.AbstractC2512c;
import q8.AbstractC2645d;
import q8.l;
import t6.C2796b;
import w8.p;

/* JADX INFO: renamed from: v6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2889c implements InterfaceC2894h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f51411g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8.g f51412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6.h f51413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2796b f51414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2887a f51415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2893g f51416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.sync.b f51417f;

    /* JADX INFO: renamed from: v6.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: v6.c$b */
    public static final class b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f51418a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f51419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f51420d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f51422f;

        public b(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f51420d = obj;
            this.f51422f |= Integer.MIN_VALUE;
            return C2889c.this.d(this);
        }
    }

    /* JADX INFO: renamed from: v6.c$c, reason: collision with other inner class name */
    public static final class C0474c extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f51423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f51424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f51426e;

        public C0474c(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, InterfaceC2372d interfaceC2372d) {
            return ((C0474c) create(jSONObject, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            C0474c c0474c = C2889c.this.new C0474c(interfaceC2372d);
            c0474c.f51426e = obj;
            return c0474c;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0181 A[RETURN] */
        @Override // q8.AbstractC2642a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.C2889c.C0474c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: v6.c$d */
    public static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51428a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f51429c;

        public d(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC2372d interfaceC2372d) {
            return ((d) create(str, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            d dVar = new d(interfaceC2372d);
            dVar.f51429c = obj;
            return dVar;
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC2512c.d();
            if (this.f51428a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f51429c));
            return q.f43674a;
        }
    }

    public C2889c(o8.g backgroundDispatcher, k6.h firebaseInstallationsApi, C2796b appInfo, InterfaceC2887a configsFetcher, Y.f dataStore) {
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.l.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.l.e(appInfo, "appInfo");
        kotlin.jvm.internal.l.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.l.e(dataStore, "dataStore");
        this.f51412a = backgroundDispatcher;
        this.f51413b = firebaseInstallationsApi;
        this.f51414c = appInfo;
        this.f51415d = configsFetcher;
        this.f51416e = new C2893g(dataStore);
        this.f51417f = kotlinx.coroutines.sync.d.b(false, 1, null);
    }

    @Override // v6.InterfaceC2894h
    public Boolean a() {
        return this.f51416e.g();
    }

    @Override // v6.InterfaceC2894h
    public F8.a b() {
        Integer numE = this.f51416e.e();
        if (numE == null) {
            return null;
        }
        a.C0031a c0031a = F8.a.f2095c;
        return F8.a.c(F8.c.o(numE.intValue(), F8.d.SECONDS));
    }

    @Override // v6.InterfaceC2894h
    public Double c() {
        return this.f51416e.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:44:0x00ae, B:46:0x00b2, B:49:0x00bf, B:36:0x0088, B:38:0x0090, B:41:0x0096), top: B:58:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:44:0x00ae, B:46:0x00b2, B:49:0x00bf, B:36:0x0088, B:38:0x0090, B:41:0x0096), top: B:58:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.sync.b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // v6.InterfaceC2894h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(o8.InterfaceC2372d r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C2889c.d(o8.d):java.lang.Object");
    }

    public final String f(String str) {
        return new E8.e("/").b(str, "");
    }
}
