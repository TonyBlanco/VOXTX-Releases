package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class zzqv extends zzqo {
    final /* synthetic */ zzqw zza;
    private final Callable zzb;

    public zzqv(zzqw zzqwVar, Callable callable) {
        this.zza = zzqwVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.cast.zzqo
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.cast.zzqo
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.cast.zzqo
    public final void zzc(Throwable th) {
        this.zza.zzl(th);
    }

    @Override // com.google.android.gms.internal.cast.zzqo
    public final void zzd(Object obj) {
        this.zza.zzk(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzqo
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
