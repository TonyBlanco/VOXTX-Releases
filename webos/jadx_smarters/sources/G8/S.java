package G8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2304a = kotlinx.coroutines.internal.z.e("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f2305b = b();

    public static final V a() {
        return f2305b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V b() {
        if (!f2304a) {
            return Q.f2302i;
        }
        I0 i0C = C0562b0.c();
        return (kotlinx.coroutines.internal.r.c(i0C) || !(i0C instanceof V)) ? Q.f2302i : (V) i0C;
    }
}
