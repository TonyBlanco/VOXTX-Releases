package x1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51875a;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2951b f51876a;

        public a(InterfaceC2951b interfaceC2951b) {
            this.f51876a = interfaceC2951b;
        }

        @Override // x1.c
        public Object apply(Object obj) {
            this.f51876a.apply(obj);
            return obj;
        }
    }

    public e(Object obj) {
        this.f51875a = obj;
    }

    @Override // x1.d
    public d b(InterfaceC2951b interfaceC2951b) {
        g.b(interfaceC2951b);
        return g(new a(interfaceC2951b));
    }

    @Override // x1.d
    public d c(c cVar) {
        g.b(cVar);
        return (d) g.c(cVar.apply(this.f51875a), "the Function passed to Optional.flatMap() must not return null.");
    }

    @Override // x1.d
    public Object e() {
        return this.f51875a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f51875a.equals(((e) obj).f51875a);
        }
        return false;
    }

    @Override // x1.d
    public boolean f() {
        return true;
    }

    @Override // x1.d
    public d g(c cVar) {
        return new e(g.c(cVar.apply(this.f51875a), "the Function passed to Optional.map() must not return null."));
    }

    public int hashCode() {
        return this.f51875a.hashCode() + 1502476572;
    }

    @Override // x1.d
    public Object i(Object obj) {
        g.c(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f51875a;
    }

    @Override // x1.d
    public d j(d dVar) {
        g.b(dVar);
        return this;
    }

    @Override // x1.d
    public Object k() {
        return this.f51875a;
    }

    public String toString() {
        return "Optional.of(" + this.f51875a + ")";
    }
}
