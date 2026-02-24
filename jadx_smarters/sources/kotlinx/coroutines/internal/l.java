package kotlinx.coroutines.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43762a = new y("CONDITION_FALSE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43763b = new y("LIST_EMPTY");

    public static final Object a() {
        return f43762a;
    }

    public static final m b(Object obj) {
        m mVar;
        v vVar = obj instanceof v ? (v) obj : null;
        return (vVar == null || (mVar = vVar.f43784a) == null) ? (m) obj : mVar;
    }
}
