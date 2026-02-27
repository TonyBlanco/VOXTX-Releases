package D1;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.Executor;
import okhttp3.Response;
import v1.InterfaceC2868f;
import v1.i;
import x1.g;
import y1.C2982a;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: D1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0015a {
        void onCompleted();

        void onFailure(B1.b bVar);

        void onFetch(b bVar);

        void onResponse(d dVar);
    }

    public enum b {
        CACHE,
        NETWORK
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f1313a = UUID.randomUUID();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2868f f1314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2982a f1315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f1316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final x1.d f1317e;

        /* JADX INFO: renamed from: D1.a$c$a, reason: collision with other inner class name */
        public static final class C0016a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterfaceC2868f f1318a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f1320c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public C2982a f1319b = C2982a.f52130b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public x1.d f1321d = x1.d.a();

            public C0016a(InterfaceC2868f interfaceC2868f) {
                this.f1318a = (InterfaceC2868f) g.c(interfaceC2868f, "operation == null");
            }

            public c a() {
                return new c(this.f1318a, this.f1319b, this.f1321d, this.f1320c);
            }

            public C0016a b(C2982a c2982a) {
                this.f1319b = (C2982a) g.c(c2982a, "cacheHeaders == null");
                return this;
            }

            public C0016a c(boolean z9) {
                this.f1320c = z9;
                return this;
            }

            public C0016a d(InterfaceC2868f.a aVar) {
                this.f1321d = x1.d.d(aVar);
                return this;
            }

            public C0016a e(x1.d dVar) {
                this.f1321d = (x1.d) g.c(dVar, "optimisticUpdates == null");
                return this;
            }
        }

        public c(InterfaceC2868f interfaceC2868f, C2982a c2982a, x1.d dVar, boolean z9) {
            this.f1314b = interfaceC2868f;
            this.f1315c = c2982a;
            this.f1317e = dVar;
            this.f1316d = z9;
        }

        public static C0016a a(InterfaceC2868f interfaceC2868f) {
            return new C0016a(interfaceC2868f);
        }

        public C0016a b() {
            return new C0016a(this.f1314b).b(this.f1315c).c(this.f1316d).d((InterfaceC2868f.a) this.f1317e.k());
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x1.d f1322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x1.d f1323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x1.d f1324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x1.d f1325d;

        public d(Response response) {
            this(response, null, null);
        }

        public d(Response response, i iVar, Collection collection) {
            this.f1322a = x1.d.d(response);
            this.f1323b = x1.d.d(iVar);
            this.f1324c = x1.d.d(collection);
            this.f1325d = x1.d.d(null);
        }

        public d(Response response, i iVar, Collection collection, String str) {
            this.f1322a = x1.d.d(response);
            this.f1323b = x1.d.d(iVar);
            this.f1324c = x1.d.d(collection);
            this.f1325d = x1.d.d(str);
        }
    }

    void dispose();

    void interceptAsync(c cVar, D1.b bVar, Executor executor, InterfaceC0015a interfaceC0015a);
}
