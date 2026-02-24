package com.google.android.gms.internal.cast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqu {
    public static zzqp zza(ExecutorService executorService) {
        if (executorService instanceof zzqp) {
            return (zzqp) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzqt((ScheduledExecutorService) executorService) : new zzqq(executorService);
    }
}
