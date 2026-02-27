package o8;

import kotlin.jvm.internal.l;
import o8.g;
import w8.p;

/* JADX INFO: renamed from: o8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2369a implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.c f46135a;

    public AbstractC2369a(g.c key) {
        l.e(key, "key");
        this.f46135a = key;
    }

    @Override // o8.g
    public g V(g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // o8.g.b, o8.g
    public g.b a(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // o8.g.b
    public g.c getKey() {
        return this.f46135a;
    }

    @Override // o8.g
    public Object l(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    @Override // o8.g
    public g w(g.c cVar) {
        return g.b.a.c(this, cVar);
    }
}
