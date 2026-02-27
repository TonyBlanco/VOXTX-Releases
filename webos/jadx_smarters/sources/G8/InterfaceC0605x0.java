package G8;

import java.util.concurrent.CancellationException;
import o8.InterfaceC2372d;
import o8.g;

/* JADX INFO: renamed from: G8.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0605x0 extends g.b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final b f2366b0 = b.f2367a;

    /* JADX INFO: renamed from: G8.x0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC0605x0 interfaceC0605x0, CancellationException cancellationException, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i9 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC0605x0.s(cancellationException);
        }

        public static Object b(InterfaceC0605x0 interfaceC0605x0, Object obj, w8.p pVar) {
            return g.b.a.a(interfaceC0605x0, obj, pVar);
        }

        public static g.b c(InterfaceC0605x0 interfaceC0605x0, g.c cVar) {
            return g.b.a.b(interfaceC0605x0, cVar);
        }

        public static /* synthetic */ InterfaceC0566d0 d(InterfaceC0605x0 interfaceC0605x0, boolean z9, boolean z10, w8.l lVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i9 & 1) != 0) {
                z9 = false;
            }
            if ((i9 & 2) != 0) {
                z10 = true;
            }
            return interfaceC0605x0.v(z9, z10, lVar);
        }

        public static o8.g e(InterfaceC0605x0 interfaceC0605x0, g.c cVar) {
            return g.b.a.c(interfaceC0605x0, cVar);
        }

        public static o8.g f(InterfaceC0605x0 interfaceC0605x0, o8.g gVar) {
            return g.b.a.d(interfaceC0605x0, gVar);
        }
    }

    /* JADX INFO: renamed from: G8.x0$b */
    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f2367a = new b();
    }

    D8.d d();

    CancellationException h();

    InterfaceC0566d0 i(w8.l lVar);

    boolean isActive();

    InterfaceC0596t k(InterfaceC0600v interfaceC0600v);

    Object m(InterfaceC2372d interfaceC2372d);

    void s(CancellationException cancellationException);

    boolean start();

    InterfaceC0566d0 v(boolean z9, boolean z10, w8.l lVar);
}
