package x1;

/* JADX INFO: renamed from: x1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2950a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2950a f51874a = new C2950a();

    public static d l() {
        return f51874a;
    }

    @Override // x1.d
    public d b(InterfaceC2951b interfaceC2951b) {
        g.b(interfaceC2951b);
        return d.a();
    }

    @Override // x1.d
    public d c(c cVar) {
        g.b(cVar);
        return d.a();
    }

    @Override // x1.d
    public Object e() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // x1.d
    public boolean f() {
        return false;
    }

    @Override // x1.d
    public d g(c cVar) {
        g.b(cVar);
        return d.a();
    }

    public int hashCode() {
        return 2040732332;
    }

    @Override // x1.d
    public Object i(Object obj) {
        return g.c(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // x1.d
    public d j(d dVar) {
        return (d) g.b(dVar);
    }

    @Override // x1.d
    public Object k() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
