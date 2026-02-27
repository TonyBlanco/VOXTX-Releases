package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f14614c = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f14616b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f14615a = new G();

    public static a0 a() {
        return f14614c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC1139y.b(cls, "messageType");
        AbstractC1139y.b(e0Var, "schema");
        return (e0) this.f14616b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        AbstractC1139y.b(cls, "messageType");
        e0 e0Var = (e0) this.f14616b.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0VarA = this.f14615a.a(cls);
        e0 e0VarB = b(cls, e0VarA);
        return e0VarB != null ? e0VarB : e0VarA;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
