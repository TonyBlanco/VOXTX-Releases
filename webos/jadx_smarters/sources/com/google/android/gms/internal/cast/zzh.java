package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzh implements zzad {
    final /* synthetic */ zzk zza;

    public zzh(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.cast.zzad
    public final void zza() {
        zzk.zzr(this.zza, true);
    }

    @Override // com.google.android.gms.internal.cast.zzad
    public final void zzb() {
        zzk.zzr(this.zza, false);
    }
}
