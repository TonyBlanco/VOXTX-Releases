package x6;

/* JADX INFO: loaded from: classes.dex */
public final class g extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f51962d;

    static {
        g gVar = new g();
        f51962d = gVar;
        gVar.setStackTrace(n.f51976c);
    }

    public g() {
    }

    public g(Throwable th) {
        super(th);
    }

    public static g a() {
        return n.f51975a ? new g() : f51962d;
    }

    public static g b(Throwable th) {
        return n.f51975a ? new g(th) : f51962d;
    }
}
