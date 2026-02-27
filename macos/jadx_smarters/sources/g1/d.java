package G1;

import D1.a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements C1.a {

    public static final class a implements D1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f2165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E1.b f2166b;

        /* JADX INFO: renamed from: G1.d$a$a, reason: collision with other inner class name */
        public class C0037a implements a.InterfaceC0015a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.InterfaceC0015a f2167a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.c f2168b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ D1.b f2169c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Executor f2170d;

            public C0037a(a.InterfaceC0015a interfaceC0015a, a.c cVar, D1.b bVar, Executor executor) {
                this.f2167a = interfaceC0015a;
                this.f2168b = cVar;
                this.f2169c = bVar;
                this.f2170d = executor;
            }

            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
                this.f2167a.onCompleted();
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar) {
                a.this.f2166b.b(bVar, "Failed to fetch network response for operation %s, trying to return cached one", this.f2168b.f1314b);
                if (a.this.f2165a) {
                    return;
                }
                this.f2169c.a(this.f2168b.b().c(true).a(), this.f2170d, this.f2167a);
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar) {
                this.f2167a.onFetch(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                this.f2167a.onResponse(dVar);
            }
        }

        public a(E1.b bVar) {
            this.f2166b = bVar;
        }

        @Override // D1.a
        public void dispose() {
            this.f2165a = true;
        }

        @Override // D1.a
        public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
            bVar.a(cVar.b().c(false).a(), executor, new C0037a(interfaceC0015a, cVar, bVar, executor));
        }
    }

    @Override // C1.a
    public D1.a a(E1.b bVar) {
        return new a(bVar);
    }
}
