package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class azg extends ayc implements ScheduledExecutorService, aze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f20962a;

    public azg(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        atp.k(scheduledExecutorService);
        this.f20962a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j9, TimeUnit timeUnit) {
        azk azkVarQ = azk.q(runnable, null);
        return new ayq(azkVarQ, this.f20962a.schedule(azkVarQ, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j9, TimeUnit timeUnit) {
        azk azkVarP = azk.p(callable);
        return new ayq(azkVarP, this.f20962a.schedule(azkVarP, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        azf azfVar = new azf(runnable);
        return new ayq(azfVar, this.f20962a.scheduleAtFixedRate(azfVar, j9, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        azf azfVar = new azf(runnable);
        return new ayq(azfVar, this.f20962a.scheduleWithFixedDelay(azfVar, j9, j10, timeUnit));
    }
}
