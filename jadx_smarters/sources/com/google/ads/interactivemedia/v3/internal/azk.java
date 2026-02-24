package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes3.dex */
final class azk extends ayz implements RunnableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile azc f20965b;

    public azk(Callable callable) {
        super((char[]) null);
        this.f20965b = new azj(this, callable);
    }

    public static azk p(Callable callable) {
        return new azk(callable);
    }

    public static azk q(Runnable runnable, Object obj) {
        return new azk(Executors.callable(runnable, obj));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axz
    public final String e() {
        azc azcVar = this.f20965b;
        if (azcVar == null) {
            return super.e();
        }
        return "task=[" + azcVar + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axz
    public final void h() {
        azc azcVar;
        if (k() && (azcVar = this.f20965b) != null) {
            azcVar.h();
        }
        this.f20965b = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        azc azcVar = this.f20965b;
        if (azcVar != null) {
            azcVar.run();
        }
        this.f20965b = null;
    }
}
