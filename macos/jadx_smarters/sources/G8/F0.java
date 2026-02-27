package G8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2279a = new kotlinx.coroutines.internal.y("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2280b = new kotlinx.coroutines.internal.y("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2281c = new kotlinx.coroutines.internal.y("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2282d = new kotlinx.coroutines.internal.y("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.y f2283e = new kotlinx.coroutines.internal.y("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0572g0 f2284f = new C0572g0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0572g0 f2285g = new C0572g0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0595s0 ? new C0597t0((InterfaceC0595s0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0595s0 interfaceC0595s0;
        C0597t0 c0597t0 = obj instanceof C0597t0 ? (C0597t0) obj : null;
        return (c0597t0 == null || (interfaceC0595s0 = c0597t0.f2360a) == null) ? obj : interfaceC0595s0;
    }
}
