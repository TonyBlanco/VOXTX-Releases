package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.InterfaceC1413l;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.h> extends com.google.android.gms.common.api.f {
    static final ThreadLocal zaa = new c1();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private d1 resultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.i zah;
    private com.google.android.gms.common.api.h zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC1413l zao;
    private volatile O0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public static class a extends zau {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.h hVar) {
            int i9 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.i) com.google.android.gms.common.internal.r.m(iVar), hVar)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 != 1) {
                if (i9 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f26440n);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i9, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) pair.first;
            com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) pair.second;
            try {
                iVar.a(hVar);
            } catch (RuntimeException e9) {
                BasePendingResult.zal(hVar);
                throw e9;
            }
        }
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.zab = new a(googleApiClient != null ? googleApiClient.i() : Looper.getMainLooper());
        this.zac = new WeakReference(googleApiClient);
    }

    public static void zal(com.google.android.gms.common.api.h hVar) {
    }

    public final com.google.android.gms.common.api.h a() {
        com.google.android.gms.common.api.h hVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed.");
            com.google.android.gms.common.internal.r.q(isReady(), "Result is not ready.");
            hVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        P0 p02 = (P0) this.zai.getAndSet(null);
        if (p02 != null) {
            p02.f26508a.f26510a.remove(this);
        }
        return (com.google.android.gms.common.api.h) com.google.android.gms.common.internal.r.m(hVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void addStatusListener(f.a aVar) {
        com.google.android.gms.common.internal.r.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        com.google.android.gms.common.internal.r.l("await must not be called on the UI thread");
        com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed");
        com.google.android.gms.common.internal.r.q(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f26438l);
        }
        com.google.android.gms.common.internal.r.q(isReady(), "Result is not ready.");
        return (R) a();
    }

    @ResultIgnorabilityUnspecified
    public final R await(long j9, TimeUnit timeUnit) {
        if (j9 > 0) {
            com.google.android.gms.common.internal.r.l("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed.");
        com.google.android.gms.common.internal.r.q(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j9, timeUnit)) {
                forceFailureUnlessReady(Status.f26440n);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f26438l);
        }
        com.google.android.gms.common.internal.r.q(isReady(), "Result is not ready.");
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.h hVar) {
        this.zaj = hVar;
        this.zak = hVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.i iVar = this.zah;
            if (iVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(iVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((f.a) arrayList.get(i9)).a(this.zak);
        }
        this.zag.clear();
    }

    @Override // com.google.android.gms.common.api.f
    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f26441o));
                }
            } finally {
            }
        }
    }

    public abstract com.google.android.gms.common.api.h createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z9;
        synchronized (this.zae) {
            z9 = this.zam;
        }
        return z9;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC1413l interfaceC1413l) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r9) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r9);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.r.q(!isReady(), "Results have already been set");
                com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed");
                b(r9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void setResultCallback(com.google.android.gms.common.api.i iVar) {
        synchronized (this.zae) {
            try {
                if (iVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z9 = true;
                com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z9 = false;
                }
                com.google.android.gms.common.internal.r.q(z9, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(iVar, a());
                } else {
                    this.zah = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.i iVar, long j9, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (iVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z9 = true;
                com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z9 = false;
                }
                com.google.android.gms.common.internal.r.q(z9, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(iVar, a());
                } else {
                    this.zah = iVar;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j9));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.h> com.google.android.gms.common.api.k then(com.google.android.gms.common.api.j jVar) {
        com.google.android.gms.common.api.k kVarB;
        com.google.android.gms.common.internal.r.q(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.r.q(this.zap == null, "Cannot call then() twice.");
                com.google.android.gms.common.internal.r.q(this.zah == null, "Cannot call then() if callbacks are set.");
                com.google.android.gms.common.internal.r.q(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new O0(this.zac);
                kVarB = this.zap.b(jVar);
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVarB;
    }

    public final void zak() {
        boolean z9 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z9 = false;
        }
        this.zaq = z9;
    }

    public final boolean zam() {
        boolean zIsCanceled;
        synchronized (this.zae) {
            try {
                if (((GoogleApiClient) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                zIsCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCanceled;
    }

    public final void zan(P0 p02) {
        this.zai.set(p02);
    }
}
