package G1;

import D1.a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements C1.a {

    public static final class b implements D1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x1.d f2145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x1.d f2146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x1.d f2147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public x1.d f2148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a.InterfaceC0015a f2150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f2151g;

        /* JADX INFO: renamed from: G1.a$b$a, reason: collision with other inner class name */
        public class C0034a implements a.InterfaceC0015a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.InterfaceC0015a f2152a;

            public C0034a(a.InterfaceC0015a interfaceC0015a) {
                this.f2152a = interfaceC0015a;
            }

            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar) {
                b.this.f(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar) {
                this.f2152a.onFetch(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                b.this.g(dVar);
            }
        }

        /* JADX INFO: renamed from: G1.a$b$b, reason: collision with other inner class name */
        public class C0035b implements a.InterfaceC0015a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.InterfaceC0015a f2154a;

            public C0035b(a.InterfaceC0015a interfaceC0015a) {
                this.f2154a = interfaceC0015a;
            }

            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar) {
                b.this.h(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar) {
                this.f2154a.onFetch(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                b.this.i(dVar);
            }
        }

        public b() {
            this.f2145a = x1.d.a();
            this.f2146b = x1.d.a();
            this.f2147c = x1.d.a();
            this.f2148d = x1.d.a();
        }

        @Override // D1.a
        public void dispose() {
            this.f2151g = true;
        }

        public final synchronized void e() {
            a.InterfaceC0015a interfaceC0015a;
            try {
                if (this.f2151g) {
                    return;
                }
                if (!this.f2149e) {
                    if (this.f2145a.f()) {
                        this.f2150f.onResponse((a.d) this.f2145a.e());
                    } else if (this.f2147c.f()) {
                    }
                    this.f2149e = true;
                }
                if (this.f2149e) {
                    if (this.f2146b.f()) {
                        this.f2150f.onResponse((a.d) this.f2146b.e());
                        interfaceC0015a = this.f2150f;
                    } else if (this.f2148d.f()) {
                        if (this.f2147c.f()) {
                            this.f2150f.onFailure((B1.b) this.f2148d.e());
                        } else {
                            interfaceC0015a = this.f2150f;
                        }
                    }
                    interfaceC0015a.onCompleted();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void f(B1.b bVar) {
            this.f2147c = x1.d.h(bVar);
            e();
        }

        public final synchronized void g(a.d dVar) {
            this.f2145a = x1.d.h(dVar);
            e();
        }

        public final synchronized void h(B1.b bVar) {
            this.f2148d = x1.d.h(bVar);
            e();
        }

        public final synchronized void i(a.d dVar) {
            this.f2146b = x1.d.h(dVar);
            e();
        }

        @Override // D1.a
        public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
            if (this.f2151g) {
                return;
            }
            this.f2150f = interfaceC0015a;
            bVar.a(cVar.b().c(true).a(), executor, new C0034a(interfaceC0015a));
            bVar.a(cVar.b().c(false).a(), executor, new C0035b(interfaceC0015a));
        }
    }

    @Override // C1.a
    public D1.a a(E1.b bVar) {
        return new b();
    }
}
