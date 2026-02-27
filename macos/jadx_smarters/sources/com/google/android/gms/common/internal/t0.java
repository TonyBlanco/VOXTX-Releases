package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends AbstractC1410i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f26884f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f26885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Handler f26886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0 f26887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B4.b f26888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f26889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f26890l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Executor f26891m;

    public t0(Context context, Looper looper, Executor executor) {
        s0 s0Var = new s0(this, null);
        this.f26887i = s0Var;
        this.f26885g = context.getApplicationContext();
        this.f26886h = new zzi(looper, s0Var);
        this.f26888j = B4.b.b();
        this.f26889k = 5000L;
        this.f26890l = 300000L;
        this.f26891m = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1410i
    public final void c(o0 o0Var, ServiceConnection serviceConnection, String str) {
        r.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f26884f) {
            try {
                q0 q0Var = (q0) this.f26884f.get(o0Var);
                if (q0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + o0Var.toString());
                }
                if (!q0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + o0Var.toString());
                }
                q0Var.f(serviceConnection, str);
                if (q0Var.i()) {
                    this.f26886h.sendMessageDelayed(this.f26886h.obtainMessage(0, o0Var), this.f26889k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1410i
    public final boolean e(o0 o0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean zJ;
        r.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f26884f) {
            try {
                q0 q0Var = (q0) this.f26884f.get(o0Var);
                if (executor == null) {
                    executor = this.f26891m;
                }
                if (q0Var == null) {
                    q0Var = new q0(this, o0Var);
                    q0Var.d(serviceConnection, serviceConnection, str);
                    q0Var.e(str, executor);
                    this.f26884f.put(o0Var, q0Var);
                } else {
                    this.f26886h.removeMessages(0, o0Var);
                    if (q0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + o0Var.toString());
                    }
                    q0Var.d(serviceConnection, serviceConnection, str);
                    int iA = q0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(q0Var.b(), q0Var.c());
                    } else if (iA == 2) {
                        q0Var.e(str, executor);
                    }
                }
                zJ = q0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zJ;
    }
}
