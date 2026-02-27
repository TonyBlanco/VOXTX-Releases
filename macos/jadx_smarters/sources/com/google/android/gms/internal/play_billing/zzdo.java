package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class zzdo extends zzdq {
    private zzdo() {
        throw null;
    }

    public /* synthetic */ zzdo(zzdn zzdnVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zza(Object obj, long j9) {
        ((zzcz) zzfp.zzf(obj, j9)).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zzb(Object obj, Object obj2, long j9) {
        zzcz zzczVarZzd = (zzcz) zzfp.zzf(obj, j9);
        zzcz zzczVar = (zzcz) zzfp.zzf(obj2, j9);
        int size = zzczVarZzd.size();
        int size2 = zzczVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzczVarZzd.zzc()) {
                zzczVarZzd = zzczVarZzd.zzd(size2 + size);
            }
            zzczVarZzd.addAll(zzczVar);
        }
        if (size > 0) {
            zzczVar = zzczVarZzd;
        }
        zzfp.zzs(obj, j9, zzczVar);
    }
}
