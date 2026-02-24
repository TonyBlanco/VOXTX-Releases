package o8;

import kotlin.jvm.internal.l;
import o8.g;

/* JADX INFO: renamed from: o8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2373e extends g.b {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final b f46141d0 = b.f46142a;

    /* JADX INFO: renamed from: o8.e$a */
    public static final class a {
        public static g.b a(InterfaceC2373e interfaceC2373e, g.c key) {
            l.e(key, "key");
            if (!(key instanceof AbstractC2370b)) {
                if (InterfaceC2373e.f46141d0 != key) {
                    return null;
                }
                l.c(interfaceC2373e, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC2373e;
            }
            AbstractC2370b abstractC2370b = (AbstractC2370b) key;
            if (!abstractC2370b.a(interfaceC2373e.getKey())) {
                return null;
            }
            g.b bVarB = abstractC2370b.b(interfaceC2373e);
            if (bVarB instanceof g.b) {
                return bVarB;
            }
            return null;
        }

        public static g b(InterfaceC2373e interfaceC2373e, g.c key) {
            l.e(key, "key");
            if (!(key instanceof AbstractC2370b)) {
                return InterfaceC2373e.f46141d0 == key ? h.f46144a : interfaceC2373e;
            }
            AbstractC2370b abstractC2370b = (AbstractC2370b) key;
            return (!abstractC2370b.a(interfaceC2373e.getKey()) || abstractC2370b.b(interfaceC2373e) == null) ? interfaceC2373e : h.f46144a;
        }
    }

    /* JADX INFO: renamed from: o8.e$b */
    public static final class b implements g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f46142a = new b();
    }

    void T(InterfaceC2372d interfaceC2372d);

    InterfaceC2372d o(InterfaceC2372d interfaceC2372d);
}
