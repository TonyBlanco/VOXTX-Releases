package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class agp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19695a;

    public agp() {
    }

    public agp(byte[] bArr) {
    }

    public final void a(Context context) {
        com.google.ads.interactivemedia.v3.impl.data.i.e(context, "Application Context cannot be null");
        if (this.f19695a) {
            return;
        }
        this.f19695a = true;
        ahe.b().c(context);
        aha ahaVarA = aha.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(ahaVarA);
        }
        ahn.g(context);
        ahb.b().c(context);
    }

    public final boolean b() {
        return this.f19695a;
    }

    public final synchronized void c() throws InterruptedException {
        while (!this.f19695a) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z9 = false;
        while (!this.f19695a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e() {
        return this.f19695a;
    }

    public final synchronized boolean f() {
        if (this.f19695a) {
            return false;
        }
        this.f19695a = true;
        notifyAll();
        return true;
    }

    public final synchronized void g() {
        this.f19695a = false;
    }
}
