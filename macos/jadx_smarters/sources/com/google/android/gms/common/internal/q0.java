package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements ServiceConnection, u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f26868a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26869c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f26871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f26872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComponentName f26873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t0 f26874h;

    public q0(t0 t0Var, o0 o0Var) {
        this.f26874h = t0Var;
        this.f26872f = o0Var;
    }

    public final int a() {
        return this.f26869c;
    }

    public final ComponentName b() {
        return this.f26873g;
    }

    public final IBinder c() {
        return this.f26871e;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f26868a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f26869c = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C4.m.m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            t0 t0Var = this.f26874h;
            boolean zD = t0Var.f26888j.d(t0Var.f26885g, str, this.f26872f.b(t0Var.f26885g), this, 4225, executor);
            this.f26870d = zD;
            if (zD) {
                this.f26874h.f26886h.sendMessageDelayed(this.f26874h.f26886h.obtainMessage(1, this.f26872f), this.f26874h.f26890l);
            } else {
                this.f26869c = 2;
                try {
                    t0 t0Var2 = this.f26874h;
                    t0Var2.f26888j.c(t0Var2.f26885g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f26868a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f26874h.f26886h.removeMessages(1, this.f26872f);
        t0 t0Var = this.f26874h;
        t0Var.f26888j.c(t0Var.f26885g, this);
        this.f26870d = false;
        this.f26869c = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f26868a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f26868a.isEmpty();
    }

    public final boolean j() {
        return this.f26870d;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f26874h.f26884f) {
            try {
                this.f26874h.f26886h.removeMessages(1, this.f26872f);
                this.f26871e = iBinder;
                this.f26873g = componentName;
                Iterator it = this.f26868a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f26869c = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f26874h.f26884f) {
            try {
                this.f26874h.f26886h.removeMessages(1, this.f26872f);
                this.f26871e = null;
                this.f26873g = componentName;
                Iterator it = this.f26868a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f26869c = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
