package E1;

import j$.util.concurrent.ConcurrentHashMap;
import v1.InterfaceC2868f;
import v1.l;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f1673a = new ConcurrentHashMap();

    public l a(InterfaceC2868f interfaceC2868f) {
        x1.g.c(interfaceC2868f, "operation == null");
        Class<?> cls = interfaceC2868f.getClass();
        l lVar = (l) this.f1673a.get(cls);
        if (lVar != null) {
            return lVar;
        }
        this.f1673a.putIfAbsent(cls, interfaceC2868f.responseFieldMapper());
        return (l) this.f1673a.get(cls);
    }
}
