package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26791b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1404c f26792c;

    public d0(AbstractC1404c abstractC1404c, Object obj) {
        this.f26792c = abstractC1404c;
        this.f26790a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f26790a;
                if (this.f26791b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f26791b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f26790a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f26792c.zzt) {
            this.f26792c.zzt.remove(this);
        }
    }
}
