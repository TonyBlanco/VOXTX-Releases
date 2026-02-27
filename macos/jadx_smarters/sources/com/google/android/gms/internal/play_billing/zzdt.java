package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class zzdt implements zzea {
    private final zzea[] zza;

    public zzdt(zzea... zzeaVarArr) {
        this.zza = zzeaVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final zzdz zzb(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            zzea zzeaVar = this.zza[i9];
            if (zzeaVar.zzc(cls)) {
                return zzeaVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final boolean zzc(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            if (this.zza[i9].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
