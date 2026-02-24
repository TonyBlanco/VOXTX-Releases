package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzea extends zzef {
    final /* synthetic */ zzeb zza;

    public zzea(zzeb zzebVar) {
        this.zza = zzebVar;
    }

    @Override // com.google.android.gms.internal.cast.zzef
    public final void zza(long j9) {
        this.zza.zzc++;
        zzeb zzebVar = this.zza;
        if (zzebVar.zza(zzebVar.zza) || this.zza.zza.isStarted()) {
            return;
        }
        zzeb zzebVar2 = this.zza;
        if (zzeb.zze(zzebVar2)) {
            return;
        }
        zzebVar2.zza.start();
    }
}
