package o8;

import o8.g;
import w8.l;

/* JADX INFO: renamed from: o8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2370b implements g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f46136a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.c f46137c;

    public AbstractC2370b(g.c baseKey, l safeCast) {
        kotlin.jvm.internal.l.e(baseKey, "baseKey");
        kotlin.jvm.internal.l.e(safeCast, "safeCast");
        this.f46136a = safeCast;
        this.f46137c = baseKey instanceof AbstractC2370b ? ((AbstractC2370b) baseKey).f46137c : baseKey;
    }

    public final boolean a(g.c key) {
        kotlin.jvm.internal.l.e(key, "key");
        return key == this || this.f46137c == key;
    }

    public final g.b b(g.b element) {
        kotlin.jvm.internal.l.e(element, "element");
        return (g.b) this.f46136a.invoke(element);
    }
}
