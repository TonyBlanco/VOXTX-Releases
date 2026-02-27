package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f26758a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f26765i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26759c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f26760d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26761e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f26762f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f26763g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26764h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f26766j = new Object();

    public K(Looper looper, J j9) {
        this.f26758a = j9;
        this.f26765i = new zau(looper, this);
    }

    public final void a() {
        this.f26762f = false;
        this.f26763g.incrementAndGet();
    }

    public final void b() {
        this.f26762f = true;
    }

    public final void c(C2914b c2914b) {
        r.e(this.f26765i, "onConnectionFailure must only be called on the Handler thread");
        this.f26765i.removeMessages(1);
        synchronized (this.f26766j) {
            try {
                ArrayList<GoogleApiClient.c> arrayList = new ArrayList(this.f26761e);
                int i9 = this.f26763g.get();
                for (GoogleApiClient.c cVar : arrayList) {
                    if (this.f26762f && this.f26763g.get() == i9) {
                        if (this.f26761e.contains(cVar)) {
                            cVar.onConnectionFailed(c2914b);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    public final void d(Bundle bundle) {
        r.e(this.f26765i, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f26766j) {
            try {
                r.p(!this.f26764h);
                this.f26765i.removeMessages(1);
                this.f26764h = true;
                r.p(this.f26760d.isEmpty());
                ArrayList<GoogleApiClient.b> arrayList = new ArrayList(this.f26759c);
                int i9 = this.f26763g.get();
                for (GoogleApiClient.b bVar : arrayList) {
                    if (!this.f26762f || !this.f26758a.isConnected() || this.f26763g.get() != i9) {
                        break;
                    } else if (!this.f26760d.contains(bVar)) {
                        bVar.onConnected(bundle);
                    }
                }
                this.f26760d.clear();
                this.f26764h = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i9) {
        r.e(this.f26765i, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f26765i.removeMessages(1);
        synchronized (this.f26766j) {
            try {
                this.f26764h = true;
                ArrayList<GoogleApiClient.b> arrayList = new ArrayList(this.f26759c);
                int i10 = this.f26763g.get();
                for (GoogleApiClient.b bVar : arrayList) {
                    if (!this.f26762f || this.f26763g.get() != i10) {
                        break;
                    } else if (this.f26759c.contains(bVar)) {
                        bVar.onConnectionSuspended(i9);
                    }
                }
                this.f26760d.clear();
                this.f26764h = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(GoogleApiClient.b bVar) {
        r.m(bVar);
        synchronized (this.f26766j) {
            try {
                if (this.f26759c.contains(bVar)) {
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(bVar) + " is already registered");
                } else {
                    this.f26759c.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f26758a.isConnected()) {
            Handler handler = this.f26765i;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(GoogleApiClient.c cVar) {
        r.m(cVar);
        synchronized (this.f26766j) {
            try {
                if (this.f26761e.contains(cVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(cVar) + " is already registered");
                } else {
                    this.f26761e.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(GoogleApiClient.c cVar) {
        r.m(cVar);
        synchronized (this.f26766j) {
            try {
                if (!this.f26761e.remove(cVar)) {
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(cVar) + " not found");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i9, new Exception());
            return false;
        }
        GoogleApiClient.b bVar = (GoogleApiClient.b) message.obj;
        synchronized (this.f26766j) {
            try {
                if (this.f26762f && this.f26758a.isConnected() && this.f26759c.contains(bVar)) {
                    bVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
