package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ayp extends auv implements Future, azd {
    public ayp() {
    }

    public ayp(byte[] bArr) {
        this();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auv
    public /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public abstract azd b();

    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return c().cancel(z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azd
    public final void g(Runnable runnable, Executor executor) {
        b().g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return c().get(j9, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }
}
