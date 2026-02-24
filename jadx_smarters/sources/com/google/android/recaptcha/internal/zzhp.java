package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzhp implements zzhw {
    private final zzhw[] zza;

    public zzhp(zzhw... zzhwVarArr) {
        this.zza = zzhwVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzhw
    public final zzhv zzb(Class cls) {
        zzhw[] zzhwVarArr = this.zza;
        for (int i9 = 0; i9 < 2; i9++) {
            zzhw zzhwVar = zzhwVarArr[i9];
            if (zzhwVar.zzc(cls)) {
                return zzhwVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzhw
    public final boolean zzc(Class cls) {
        zzhw[] zzhwVarArr = this.zza;
        for (int i9 = 0; i9 < 2; i9++) {
            if (zzhwVarArr[i9].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
