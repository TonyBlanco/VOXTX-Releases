package n6;

/* JADX INFO: renamed from: n6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2297b implements InterfaceC2296a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C2297b f45544a;

    public static C2297b b() {
        if (f45544a == null) {
            f45544a = new C2297b();
        }
        return f45544a;
    }

    @Override // n6.InterfaceC2296a
    public long a() {
        return System.currentTimeMillis();
    }
}
