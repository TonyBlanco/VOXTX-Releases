package G1;

import D1.a;
import java.util.concurrent.Executor;
import v1.InterfaceC2868f;
import v1.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements C1.a {

    public static final class b implements D1.a {

        public class a implements a.InterfaceC0015a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.InterfaceC0015a f2162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a.c f2163b;

            public a(a.InterfaceC0015a interfaceC0015a, a.c cVar) {
                this.f2162a = interfaceC0015a;
                this.f2163b = cVar;
            }

            @Override // D1.a.InterfaceC0015a
            public void onCompleted() {
                this.f2162a.onCompleted();
            }

            @Override // D1.a.InterfaceC0015a
            public void onFailure(B1.b bVar) {
                this.f2162a.onResponse(b.this.b(this.f2163b.f1314b));
                this.f2162a.onCompleted();
            }

            @Override // D1.a.InterfaceC0015a
            public void onFetch(a.b bVar) {
                this.f2162a.onFetch(bVar);
            }

            @Override // D1.a.InterfaceC0015a
            public void onResponse(a.d dVar) {
                this.f2162a.onResponse(dVar);
            }
        }

        public b() {
        }

        public final a.d b(InterfaceC2868f interfaceC2868f) {
            return new a.d(null, i.a(interfaceC2868f).j(true).f(), null);
        }

        @Override // D1.a
        public void dispose() {
        }

        @Override // D1.a
        public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
            bVar.a(cVar.b().c(true).a(), executor, new a(interfaceC0015a, cVar));
        }
    }

    @Override // C1.a
    public D1.a a(E1.b bVar) {
        return new b();
    }
}
