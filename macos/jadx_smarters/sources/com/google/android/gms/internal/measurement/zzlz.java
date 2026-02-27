package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzlz implements zzmg {
    private final zzmg[] zza;

    public zzlz(zzmg... zzmgVarArr) {
        this.zza = zzmgVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i9 = 0; i9 < 2; i9++) {
            zzmg zzmgVar = zzmgVarArr[i9];
            if (zzmgVar.zzc(cls)) {
                return zzmgVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i9 = 0; i9 < 2; i9++) {
            if (zzmgVarArr[i9].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
