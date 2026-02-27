package E1;

import E1.c;
import com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher;
import com.amazonaws.mobileconnectors.appsync.fetcher.AppSyncResponseFetchers;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import u1.InterfaceC2844c;
import v1.InterfaceC2868f;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements AppSyncQueryWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f1646a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3002a f1648c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E1.b f1650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E1.a f1651f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1.a f1647b = AppSyncResponseFetchers.CACHE_FIRST;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f1649d = Collections.emptySet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3002a.InterfaceC0490a f1652g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f1653h = new AtomicReference(E1.c.IDLE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f1654i = new AtomicReference();

    public class a implements InterfaceC3002a.InterfaceC0490a {
        public a() {
        }

        @Override // z1.InterfaceC3002a.InterfaceC0490a
        public void a(Set set) {
            if (x1.g.a(g.this.f1649d, set)) {
                return;
            }
            g.this.refetch();
        }
    }

    public class b extends InterfaceC2844c.a {
        public b() {
        }

        @Override // u1.InterfaceC2844c.a
        public void onFailure(B1.b bVar) {
            x1.d dVarL = g.this.l();
            if (!dVarL.f()) {
                g.this.f1650e.b(bVar, "onFailure for operation: %s. No callback present.", g.this.operation().name().name());
                return;
            }
            if (bVar instanceof B1.c) {
                ((InterfaceC2844c.a) dVarL.e()).onHttpError((B1.c) bVar);
                return;
            }
            if (bVar instanceof B1.e) {
                ((InterfaceC2844c.a) dVarL.e()).onParseError((B1.e) bVar);
                return;
            }
            boolean z9 = bVar instanceof B1.d;
            InterfaceC2844c.a aVar = (InterfaceC2844c.a) dVarL.e();
            if (z9) {
                aVar.onNetworkError((B1.d) bVar);
            } else {
                aVar.onFailure(bVar);
            }
        }

        @Override // u1.InterfaceC2844c.a
        public void onResponse(v1.i iVar) {
            x1.d dVarK = g.this.k();
            if (!dVarK.f()) {
                g.this.f1650e.a("onResponse for watched operation: %s. No callback present.", g.this.operation().name().name());
                return;
            }
            g.this.f1649d = iVar.c();
            g.this.f1648c.l(g.this.f1652g);
            ((InterfaceC2844c.a) dVarK.e()).onResponse(iVar);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1657a;

        static {
            int[] iArr = new int[E1.c.values().length];
            f1657a = iArr;
            try {
                iArr[E1.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1657a[E1.c.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1657a[E1.c.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1657a[E1.c.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(e eVar, InterfaceC3002a interfaceC3002a, E1.b bVar, E1.a aVar) {
        this.f1646a = eVar;
        this.f1648c = interfaceC3002a;
        this.f1650e = bVar;
        this.f1651f = aVar;
    }

    private synchronized void h(x1.d dVar) {
        try {
            int i9 = c.f1657a[((E1.c) this.f1653h.get()).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    this.f1654i.set(dVar.k());
                    this.f1651f.i(this);
                    this.f1653h.set(E1.c.ACTIVE);
                } else {
                    if (i9 == 3) {
                        throw new B1.a("Call is cancelled.");
                    }
                    if (i9 != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
            }
            throw new IllegalStateException("Already Executed");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized x1.d l() {
        try {
            int i9 = c.f1657a[((E1.c) this.f1653h.get()).ordinal()];
            if (i9 == 1) {
                this.f1651f.o(this);
                this.f1653h.set(E1.c.TERMINATED);
                return x1.d.d(this.f1654i.getAndSet(null));
            }
            if (i9 != 2) {
                if (i9 == 3) {
                    return x1.d.d(this.f1654i.getAndSet(null));
                }
                if (i9 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(c.a.b((E1.c) this.f1653h.get()).a(E1.c.ACTIVE, E1.c.CANCELED));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public synchronized void cancel() {
        AtomicReference atomicReference;
        E1.c cVar;
        try {
            int i9 = c.f1657a[((E1.c) this.f1653h.get()).ordinal()];
            if (i9 == 1) {
                try {
                    this.f1646a.cancel();
                    this.f1648c.h(this.f1652g);
                    this.f1651f.o(this);
                    this.f1654i.set(null);
                    atomicReference = this.f1653h;
                    cVar = E1.c.CANCELED;
                } catch (Throwable th) {
                    this.f1651f.o(this);
                    this.f1654i.set(null);
                    this.f1653h.set(E1.c.CANCELED);
                    throw th;
                }
            } else if (i9 == 2) {
                atomicReference = this.f1653h;
                cVar = E1.c.CANCELED;
            } else if (i9 != 3 && i9 != 4) {
                throw new IllegalStateException("Unknown state");
            }
            atomicReference.set(cVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public AppSyncQueryWatcher enqueueAndWatch(InterfaceC2844c.a aVar) {
        try {
            h(x1.d.d(aVar));
            this.f1646a.enqueue(i());
            return this;
        } catch (B1.a e9) {
            if (aVar != null) {
                aVar.onCanceledError(e9);
            } else {
                this.f1650e.d(e9, "Operation: %s was canceled", operation().name().name());
            }
            return this;
        }
    }

    public final InterfaceC2844c.a i() {
        return new b();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public boolean isCanceled() {
        return this.f1653h.get() == E1.c.CANCELED;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized g refetchResponseFetcher(C1.a aVar) {
        if (this.f1653h.get() != E1.c.IDLE) {
            throw new IllegalStateException("Already Executed");
        }
        x1.g.c(aVar, "responseFetcher == null");
        this.f1647b = aVar;
        return this;
    }

    public final synchronized x1.d k() {
        try {
            int i9 = c.f1657a[((E1.c) this.f1653h.get()).ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            throw new IllegalStateException("Unknown state");
                        }
                    }
                }
                throw new IllegalStateException(c.a.b((E1.c) this.f1653h.get()).a(E1.c.ACTIVE, E1.c.CANCELED));
            }
        } catch (Throwable th) {
            throw th;
        }
        return x1.d.d(this.f1654i.get());
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public InterfaceC2868f operation() {
        return this.f1646a.operation();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncQueryWatcher
    public synchronized void refetch() {
        try {
            int i9 = c.f1657a[((E1.c) this.f1653h.get()).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    throw new IllegalStateException("Cannot refetch a watcher which has not first called enqueueAndWatch.");
                }
                if (i9 == 3) {
                    throw new IllegalStateException("Cannot refetch a canceled watcher,");
                }
                if (i9 == 4) {
                    throw new IllegalStateException("Cannot refetch a watcher which has experienced an error.");
                }
                throw new IllegalStateException("Unknown state");
            }
            this.f1648c.h(this.f1652g);
            this.f1646a.cancel();
            e eVarResponseFetcher = this.f1646a.clone().responseFetcher(this.f1647b);
            this.f1646a = eVarResponseFetcher;
            eVarResponseFetcher.enqueue(i());
        } catch (Throwable th) {
            throw th;
        }
    }
}
