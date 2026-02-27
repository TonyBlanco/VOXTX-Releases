package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzlu extends zzlw {
    private zzlu() {
        super(null);
    }

    public /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j9) {
        ((zzli) zznu.zzf(obj, j9)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzb(Object obj, Object obj2, long j9) {
        zzli zzliVarZzd = (zzli) zznu.zzf(obj, j9);
        zzli zzliVar = (zzli) zznu.zzf(obj2, j9);
        int size = zzliVarZzd.size();
        int size2 = zzliVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVarZzd.zzc()) {
                zzliVarZzd = zzliVarZzd.zzd(size2 + size);
            }
            zzliVarZzd.addAll(zzliVar);
        }
        if (size > 0) {
            zzliVar = zzliVarZzd;
        }
        zznu.zzs(obj, j9, zzliVar);
    }
}
