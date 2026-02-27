package E1;

import com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryCall;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import u1.InterfaceC2844c;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.InterfaceC2869g;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1561a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1562b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1563c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f1564d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f1565e = new AtomicInteger();

    public final Set a(Map map, InterfaceC2869g interfaceC2869g) {
        Set hashSet;
        x1.g.c(interfaceC2869g, "operationName == null");
        synchronized (map) {
            try {
                Set set = (Set) map.get(interfaceC2869g);
                hashSet = set != null ? new HashSet(set) : Collections.emptySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    public Set b(InterfaceC2869g interfaceC2869g) {
        return a(this.f1564d, interfaceC2869g);
    }

    public final void c() {
    }

    public final void d(Map map, InterfaceC2869g interfaceC2869g, Object obj) {
        synchronized (map) {
            try {
                Set hashSet = (Set) map.get(interfaceC2869g);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(interfaceC2869g, hashSet);
                }
                hashSet.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1565e.incrementAndGet();
    }

    public void e(InterfaceC2844c interfaceC2844c) {
        x1.g.c(interfaceC2844c, "call == null");
        InterfaceC2868f interfaceC2868fOperation = interfaceC2844c.operation();
        if (interfaceC2868fOperation instanceof v1.h) {
            h((AppSyncQueryCall) interfaceC2844c);
        } else if (interfaceC2868fOperation instanceof InterfaceC2867e) {
            f((AppSyncMutationCall) interfaceC2844c);
        } else if (!(interfaceC2868fOperation instanceof t)) {
            throw new IllegalArgumentException("Unknown call type");
        }
    }

    public void f(AppSyncMutationCall appSyncMutationCall) {
        x1.g.c(appSyncMutationCall, "appSyncMutationCall == null");
        d(this.f1563c, appSyncMutationCall.operation().name(), appSyncMutationCall);
    }

    public void g(AppSyncPrefetch appSyncPrefetch) {
        x1.g.c(appSyncPrefetch, "appSyncPrefetch == null");
        d(this.f1561a, appSyncPrefetch.operation().name(), appSyncPrefetch);
    }

    public void h(AppSyncQueryCall appSyncQueryCall) {
        x1.g.c(appSyncQueryCall, "appSyncQueryCall == null");
        d(this.f1562b, appSyncQueryCall.operation().name(), appSyncQueryCall);
    }

    public void i(AppSyncQueryWatcher appSyncQueryWatcher) {
        x1.g.c(appSyncQueryWatcher, "queryWatcher == null");
        d(this.f1564d, appSyncQueryWatcher.operation().name(), appSyncQueryWatcher);
    }

    public final void j(Map map, InterfaceC2869g interfaceC2869g, Object obj) {
        synchronized (map) {
            try {
                Set set = (Set) map.get(interfaceC2869g);
                if (set == null || !set.remove(obj)) {
                    throw new AssertionError("Call wasn't registered before");
                }
                if (set.isEmpty()) {
                    map.remove(interfaceC2869g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f1565e.decrementAndGet() == 0) {
            c();
        }
    }

    public void k(InterfaceC2844c interfaceC2844c) {
        x1.g.c(interfaceC2844c, "call == null");
        InterfaceC2868f interfaceC2868fOperation = interfaceC2844c.operation();
        if (interfaceC2868fOperation instanceof v1.h) {
            n((AppSyncQueryCall) interfaceC2844c);
        } else if (interfaceC2868fOperation instanceof InterfaceC2867e) {
            l((AppSyncMutationCall) interfaceC2844c);
        } else if (!(interfaceC2868fOperation instanceof t)) {
            throw new IllegalArgumentException("Unknown call type");
        }
    }

    public void l(AppSyncMutationCall appSyncMutationCall) {
        x1.g.c(appSyncMutationCall, "appSyncMutationCall == null");
        j(this.f1563c, appSyncMutationCall.operation().name(), appSyncMutationCall);
    }

    public void m(AppSyncPrefetch appSyncPrefetch) {
        x1.g.c(appSyncPrefetch, "appSyncPrefetch == null");
        j(this.f1561a, appSyncPrefetch.operation().name(), appSyncPrefetch);
    }

    public void n(AppSyncQueryCall appSyncQueryCall) {
        x1.g.c(appSyncQueryCall, "appSyncQueryCall == null");
        j(this.f1562b, appSyncQueryCall.operation().name(), appSyncQueryCall);
    }

    public void o(AppSyncQueryWatcher appSyncQueryWatcher) {
        x1.g.c(appSyncQueryWatcher, "queryWatcher == null");
        j(this.f1564d, appSyncQueryWatcher.operation().name(), appSyncQueryWatcher);
    }
}
