package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes3.dex */
final class zzqw extends zzqe implements RunnableFuture {
    private volatile zzqo zzb;

    public zzqw(Callable callable) {
        this.zzb = new zzqv(this, callable);
    }

    public static zzqw zzn(Runnable runnable, Object obj) {
        return new zzqw(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzqo zzqoVar = this.zzb;
        if (zzqoVar != null) {
            zzqoVar.run();
        }
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.cast.zzpy
    public final String zze() {
        zzqo zzqoVar = this.zzb;
        if (zzqoVar == null) {
            return super.zze();
        }
        return "task=[" + zzqoVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.cast.zzpy
    public final void zzj() {
        zzqo zzqoVar;
        if (zzm() && (zzqoVar = this.zzb) != null) {
            zzqoVar.zze();
        }
        this.zzb = null;
    }
}
