package G1;

import D1.a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b implements C1.a {

    /* JADX INFO: renamed from: G1.b$b, reason: collision with other inner class name */
    public static final class C0036b implements D1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f2156a;

        /* JADX INFO: renamed from: G1.b$b$a */
        public class a implements a.InterfaceC0015a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.InterfaceC0015a f2157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.c f2158b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ D1.b f2159c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Executor f2160d;

            public a(a.InterfaceC0015a interfaceC0015a, a.c cVar, D1.b bVar, Executor executor) {
                this.f2157a = interfaceC0015a;
                this.f2158b = cVar;
                this.f2159c = bVar;
                this.f2160d = executor;
            }

            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
                this.f2157a.onCompleted();
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar) {
                if (C0036b.this.f2156a) {
                    return;
                }
                this.f2159c.a(this.f2158b.b().c(false).a(), this.f2160d, this.f2157a);
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar) {
                this.f2157a.onFetch(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                this.f2157a.onResponse(dVar);
            }
        }

        public C0036b() {
        }

        @Override // D1.a
        public void dispose() {
            this.f2156a = true;
        }

        @Override // D1.a
        public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
            bVar.a(cVar.b().c(true).a(), executor, new a(interfaceC0015a, cVar, bVar, executor));
        }
    }

    @Override // C1.a
    public D1.a a(E1.b bVar) {
        return new C0036b();
    }
}
