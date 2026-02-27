package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ayq extends ayp implements ScheduledFuture, azd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final azd f20947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f20948b;

    public ayq(azd azdVar) {
        super(null);
        this.f20947a = azdVar;
    }

    public ayq(azd azdVar, ScheduledFuture scheduledFuture) {
        this(azdVar);
        this.f20948b = scheduledFuture;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp, com.google.ads.interactivemedia.v3.internal.auv
    public final /* synthetic */ Object a() {
        return this.f20947a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    public final azd b() {
        return this.f20947a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp
    public final /* synthetic */ Future c() {
        return this.f20947a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ayp, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean zCancel = c().cancel(z9);
        if (zCancel) {
            this.f20948b.cancel(z9);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f20948b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f20948b.getDelay(timeUnit);
    }
}
