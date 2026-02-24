package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzhk extends zzhm {
    private zzhk() {
        super(null);
    }

    public /* synthetic */ zzhk(zzhj zzhjVar) {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final List zza(Object obj, long j9) {
        zzgv zzgvVar = (zzgv) zzjp.zzf(obj, j9);
        if (zzgvVar.zzc()) {
            return zzgvVar;
        }
        int size = zzgvVar.size();
        zzgv zzgvVarZzd = zzgvVar.zzd(size == 0 ? 10 : size + size);
        zzjp.zzs(obj, j9, zzgvVarZzd);
        return zzgvVarZzd;
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzb(Object obj, long j9) {
        ((zzgv) zzjp.zzf(obj, j9)).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzc(Object obj, Object obj2, long j9) {
        zzgv zzgvVarZzd = (zzgv) zzjp.zzf(obj, j9);
        zzgv zzgvVar = (zzgv) zzjp.zzf(obj2, j9);
        int size = zzgvVarZzd.size();
        int size2 = zzgvVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzgvVarZzd.zzc()) {
                zzgvVarZzd = zzgvVarZzd.zzd(size2 + size);
            }
            zzgvVarZzd.addAll(zzgvVar);
        }
        if (size > 0) {
            zzgvVar = zzgvVarZzd;
        }
        zzjp.zzs(obj, j9, zzgvVar);
    }
}
