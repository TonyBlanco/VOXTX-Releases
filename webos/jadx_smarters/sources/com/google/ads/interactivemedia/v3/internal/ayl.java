package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
abstract class ayl extends azc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ aym f20943b;

    public ayl(aym aymVar, Executor executor) {
        this.f20943b = aymVar;
        atp.k(executor);
        this.f20942a = executor;
    }

    public abstract void c(Object obj);

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final void d(Throwable th) {
        this.f20943b.f20944b = null;
        if (th instanceof ExecutionException) {
            this.f20943b.o(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f20943b.cancel(false);
        } else {
            this.f20943b.o(th);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final void e(Object obj) {
        this.f20943b.f20944b = null;
        c(obj);
    }

    public final void f() {
        try {
            this.f20942a.execute(this);
        } catch (RejectedExecutionException e9) {
            this.f20943b.o(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azc
    public final boolean g() {
        return this.f20943b.isDone();
    }
}
