package com.google.android.gms.internal.cast;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes3.dex */
final class zzqr extends zzqh implements ScheduledFuture, InterfaceFutureC2987b {
    private final ScheduledFuture zza;

    public zzqr(InterfaceFutureC2987b interfaceFutureC2987b, ScheduledFuture scheduledFuture) {
        super(interfaceFutureC2987b);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.cast.zzqg, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean zCancel = zzb().cancel(z9);
        if (zCancel) {
            this.zza.cancel(z9);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
