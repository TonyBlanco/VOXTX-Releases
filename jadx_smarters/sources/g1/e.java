package G1;

import D1.a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements C1.a {

    public static final class b implements D1.a {
        public b() {
        }

        @Override // D1.a
        public void dispose() {
        }

        @Override // D1.a
        public void interceptAsync(a.c cVar, D1.b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
            bVar.a(cVar.b().c(false).a(), executor, interfaceC0015a);
        }
    }

    @Override // C1.a
    public D1.a a(E1.b bVar) {
        return new b();
    }
}
