package m0;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import m0.AbstractC2215a;

/* JADX INFO: renamed from: m0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2218d extends AbstractC2215a {
    /* JADX WARN: Multi-variable type inference failed */
    public C2218d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C2218d(AbstractC2215a initialExtras) {
        l.e(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ C2218d(AbstractC2215a abstractC2215a, int i9, g gVar) {
        this((i9 & 1) != 0 ? AbstractC2215a.C0379a.f44278b : abstractC2215a);
    }

    @Override // m0.AbstractC2215a
    public Object a(AbstractC2215a.b key) {
        l.e(key, "key");
        return b().get(key);
    }

    public final void c(AbstractC2215a.b key, Object obj) {
        l.e(key, "key");
        b().put(key, obj);
    }
}
