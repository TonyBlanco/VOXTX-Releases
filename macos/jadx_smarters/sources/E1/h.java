package E1;

import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import u1.C2842a;
import u1.InterfaceC2844c;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public class h implements AppSyncSubscriptionCall {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Semaphore f1658h = new Semaphore(1, true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f1659i = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1660j = h.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E1.b f1661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f1662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L1.b f1663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f1664d = new AtomicReference(E1.c.IDLE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2842a f1665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f1666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppSyncSubscriptionCall.Callback f1667g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppSyncSubscriptionCall.Callback f1668a;

        /* JADX INFO: renamed from: E1.h$a$a, reason: collision with other inner class name */
        public class C0021a extends InterfaceC2844c.a {
            public C0021a() {
            }

            @Override // u1.InterfaceC2844c.a
            public void onFailure(B1.b bVar) {
                h.f1658h.release();
                h.this.i();
                a.this.f1668a.onFailure(bVar);
            }

            @Override // u1.InterfaceC2844c.a
            public void onResponse(v1.i iVar) {
                h.f1658h.release();
            }
        }

        public a(AppSyncSubscriptionCall.Callback callback) {
            this.f1668a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppSyncSubscriptionCall.Callback callback;
            B1.b aVar;
            h.this.f1667g = this.f1668a;
            h.this.f1663c.addListener(h.this.f1662b, this.f1668a);
            int i9 = c.f1672a[((E1.c) h.this.f1664d.get()).ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    callback = this.f1668a;
                    aVar = new B1.a("Call is cancelled.");
                } else if (i9 != 3) {
                    callback = this.f1668a;
                    aVar = new B1.b("Unknown state");
                } else {
                    callback = this.f1668a;
                    aVar = new B1.b("Already Executed");
                }
                callback.onFailure(aVar);
            } else {
                h.this.f1664d.set(E1.c.ACTIVE);
            }
            try {
                if (h.f1658h.tryAcquire(h.f1659i, TimeUnit.SECONDS)) {
                    h.this.f1661a.a("Subscription Infrastructure: Acquired subscription Semaphore. Continuing", new Object[0]);
                } else {
                    h.this.f1661a.a("Subscription Infrastructure: Did not acquire subscription Semaphore after waiting for [" + h.f1659i + "] seconds. Will continue", new Object[0]);
                }
            } catch (InterruptedException e9) {
                h.this.f1661a.d(e9, "Subscription Infrastructure:Got exception while waiting to acquire subscription Semaphore. Will continue without waiting", new Object[0]);
            }
            h.this.f1661a.a("Subscription Infrastructure: Making request to server to get Subscription Meta Data", new Object[0]);
            h.this.f1666f.enqueue(new C0021a());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicReference atomicReference;
            E1.c cVar;
            synchronized (this) {
                try {
                    int i9 = c.f1672a[((E1.c) h.this.f1664d.get()).ordinal()];
                    if (i9 == 1) {
                        atomicReference = h.this.f1664d;
                        cVar = E1.c.CANCELED;
                    } else if (i9 != 2) {
                        if (i9 != 3) {
                            throw new IllegalStateException("Unknown state");
                        }
                        try {
                            h.this.f1663c.unsubscribe(h.this.f1662b);
                            h.this.f1663c.removeListener(h.this.f1662b, h.this.f1667g);
                            if (h.this.f1667g != null) {
                                h.this.f1667g.onCompleted();
                                h.this.f1667g = null;
                            }
                            atomicReference = h.this.f1664d;
                            cVar = E1.c.CANCELED;
                        } catch (Throwable th) {
                            h.this.f1664d.set(E1.c.CANCELED);
                            throw th;
                        }
                    }
                    atomicReference.set(cVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1672a;

        static {
            int[] iArr = new int[E1.c.values().length];
            f1672a = iArr;
            try {
                iArr[E1.c.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1672a[E1.c.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1672a[E1.c.ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(t tVar, L1.b bVar, C2842a c2842a, E1.b bVar2, e eVar) {
        this.f1662b = tVar;
        this.f1663c = bVar;
        this.f1665e = c2842a;
        this.f1666f = eVar;
        this.f1661a = bVar2;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public void cancel() {
        new Thread(new b()).start();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppSyncSubscriptionCall m4clone() {
        return new h(this.f1662b, this.f1663c, this.f1665e, this.f1661a, this.f1666f.clone());
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public synchronized void execute(AppSyncSubscriptionCall.Callback callback) {
        if (callback != null) {
            new Thread(new a(callback)).start();
            return;
        }
        this.f1661a.f("Subscription Infrastructure: Callback passed into subscription [" + this.f1662b + "] was null. Will not subscribe.", new Object[0]);
    }

    public void i() {
        this.f1661a.a("Trying to report failure to Subscription Manager", new Object[0]);
        try {
            this.f1663c.getClass().getDeclaredMethod("reportConnectionError", null).invoke(this.f1663c, null);
        } catch (IllegalAccessException e9) {
            this.f1661a.a("Exception [" + e9 + "] trying to call reportConnectionError in subscriptionManager", new Object[0]);
        } catch (NoSuchMethodException e10) {
            this.f1661a.a("Exception [" + e10 + "] trying to call reportConnectionError in subscriptionManager", new Object[0]);
        } catch (InvocationTargetException e11) {
            this.f1661a.a("Exception [" + e11 + "] trying to call reportConnectionError in subscriptionManager", new Object[0]);
        }
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public boolean isCanceled() {
        return this.f1664d.get() == E1.c.CANCELED;
    }
}
