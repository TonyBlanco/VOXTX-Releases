package K8;

import k8.j;
import k8.k;
import k8.q;
import kotlinx.coroutines.internal.AbstractC2166g;
import o8.InterfaceC2372d;
import p8.AbstractC2511b;
import w8.l;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(InterfaceC2372d interfaceC2372d, Throwable th) throws Throwable {
        j.a aVar = j.f43666c;
        interfaceC2372d.resumeWith(j.b(k.a(th)));
        throw th;
    }

    public static final void b(InterfaceC2372d interfaceC2372d, InterfaceC2372d interfaceC2372d2) throws Throwable {
        try {
            InterfaceC2372d interfaceC2372dC = AbstractC2511b.c(interfaceC2372d);
            j.a aVar = j.f43666c;
            AbstractC2166g.c(interfaceC2372dC, j.b(q.f43674a), null, 2, null);
        } catch (Throwable th) {
            a(interfaceC2372d2, th);
        }
    }

    public static final void c(l lVar, InterfaceC2372d interfaceC2372d) throws Throwable {
        try {
            InterfaceC2372d interfaceC2372dC = AbstractC2511b.c(AbstractC2511b.a(lVar, interfaceC2372d));
            j.a aVar = j.f43666c;
            AbstractC2166g.c(interfaceC2372dC, j.b(q.f43674a), null, 2, null);
        } catch (Throwable th) {
            a(interfaceC2372d, th);
        }
    }

    public static final void d(p pVar, Object obj, InterfaceC2372d interfaceC2372d, l lVar) throws Throwable {
        try {
            InterfaceC2372d interfaceC2372dC = AbstractC2511b.c(AbstractC2511b.b(pVar, obj, interfaceC2372d));
            j.a aVar = j.f43666c;
            AbstractC2166g.b(interfaceC2372dC, j.b(q.f43674a), lVar);
        } catch (Throwable th) {
            a(interfaceC2372d, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, InterfaceC2372d interfaceC2372d, l lVar, int i9, Object obj2) throws Throwable {
        if ((i9 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, interfaceC2372d, lVar);
    }
}
