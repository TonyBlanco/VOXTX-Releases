package E1;

import D1.a;
import E1.c;
import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Response;
import v1.InterfaceC2868f;
import w1.AbstractC2902b;

/* JADX INFO: loaded from: classes.dex */
public final class f implements AppSyncPrefetch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2868f f1633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f1634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Call.Factory f1635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K1.d f1636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f1637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E1.b f1638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final E1.a f1639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D1.b f1640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f1642j = new AtomicReference(c.IDLE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f1643k = new AtomicReference();

    public class a implements a.InterfaceC0015a {
        public a() {
        }

        @Override // D1.a.InterfaceC0015a
        public void onCompleted() {
        }

        @Override // D1.a.InterfaceC0015a
        public void onFailure(B1.b bVar) {
            x1.d dVarD = f.this.d();
            if (!dVarD.f()) {
                f fVar = f.this;
                fVar.f1638f.d(bVar, "onFailure for prefetch operation: %s. No callback present.", fVar.operation().name().name());
            } else {
                if (bVar instanceof B1.c) {
                    ((AppSyncPrefetch.Callback) dVarD.e()).onHttpError((B1.c) bVar);
                    return;
                }
                boolean z9 = bVar instanceof B1.d;
                AppSyncPrefetch.Callback callback = (AppSyncPrefetch.Callback) dVarD.e();
                if (z9) {
                    callback.onNetworkError((B1.d) bVar);
                } else {
                    callback.onFailure(bVar);
                }
            }
        }

        @Override // D1.a.InterfaceC0015a
        public void onFetch(a.b bVar) {
        }

        @Override // D1.a.InterfaceC0015a
        public void onResponse(a.d dVar) {
            Response response = (Response) dVar.f1322a.e();
            try {
                x1.d dVarD = f.this.d();
                if (!dVarD.f()) {
                    f fVar = f.this;
                    fVar.f1638f.a("onResponse for prefetch operation: %s. No callback present.", fVar.operation().name().name());
                } else {
                    if (response.isSuccessful()) {
                        ((AppSyncPrefetch.Callback) dVarD.e()).onSuccess();
                    } else {
                        ((AppSyncPrefetch.Callback) dVarD.e()).onHttpError(new B1.c(response));
                    }
                }
            } finally {
                response.close();
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1645a;

        static {
            int[] iArr = new int[c.values().length];
            f1645a = iArr;
            try {
                iArr[c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1645a[c.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1645a[c.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1645a[c.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public f(InterfaceC2868f interfaceC2868f, HttpUrl httpUrl, Call.Factory factory, K1.d dVar, Executor executor, E1.b bVar, E1.a aVar, boolean z9) {
        this.f1633a = interfaceC2868f;
        this.f1634b = httpUrl;
        this.f1635c = factory;
        this.f1636d = dVar;
        this.f1637e = executor;
        this.f1638f = bVar;
        this.f1639g = aVar;
        this.f1641i = z9;
        this.f1640h = new I1.e(Collections.singletonList(new I1.c(httpUrl, factory, AbstractC2902b.f51587b, true, dVar, bVar, z9)));
    }

    public final synchronized void b(x1.d dVar) {
        try {
            int i9 = b.f1645a[((c) this.f1642j.get()).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    this.f1643k.set(dVar.k());
                    this.f1639g.g(this);
                    this.f1642j.set(c.ACTIVE);
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

    public final a.InterfaceC0015a c() {
        return new a();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public synchronized void cancel() {
        AtomicReference atomicReference;
        c cVar;
        try {
            int i9 = b.f1645a[((c) this.f1642j.get()).ordinal()];
            if (i9 == 1) {
                try {
                    this.f1640h.dispose();
                    this.f1639g.m(this);
                    this.f1643k.set(null);
                    atomicReference = this.f1642j;
                    cVar = c.CANCELED;
                } catch (Throwable th) {
                    this.f1639g.m(this);
                    this.f1643k.set(null);
                    this.f1642j.set(c.CANCELED);
                    throw th;
                }
            } else if (i9 == 2) {
                atomicReference = this.f1642j;
                cVar = c.CANCELED;
            } else if (i9 != 3 && i9 != 4) {
                throw new IllegalStateException("Unknown state");
            }
            atomicReference.set(cVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppSyncPrefetch m3clone() {
        return new f(this.f1633a, this.f1634b, this.f1635c, this.f1636d, this.f1637e, this.f1638f, this.f1639g, this.f1641i);
    }

    public final synchronized x1.d d() {
        try {
            int i9 = b.f1645a[((c) this.f1642j.get()).ordinal()];
            if (i9 == 1) {
                this.f1639g.m(this);
                this.f1642j.set(c.TERMINATED);
                return x1.d.d(this.f1643k.getAndSet(null));
            }
            if (i9 != 2) {
                if (i9 == 3) {
                    return x1.d.d(this.f1643k.getAndSet(null));
                }
                if (i9 != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException(c.a.b((c) this.f1642j.get()).a(c.ACTIVE, c.CANCELED));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public void enqueue(AppSyncPrefetch.Callback callback) {
        try {
            b(x1.d.d(callback));
            this.f1640h.a(a.c.a(this.f1633a).a(), this.f1637e, c());
        } catch (B1.a e9) {
            if (callback != null) {
                callback.onFailure(e9);
            } else {
                this.f1638f.d(e9, "Operation: %s was canceled", operation().name().name());
            }
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public boolean isCanceled() {
        return this.f1642j.get() == c.CANCELED;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch
    public InterfaceC2868f operation() {
        return this.f1633a;
    }
}
