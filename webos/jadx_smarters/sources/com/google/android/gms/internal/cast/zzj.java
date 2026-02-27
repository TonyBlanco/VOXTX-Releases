package com.google.android.gms.internal.cast;

import com.google.android.gms.common.util.VisibleForTesting;
import n4.C2286s;
import o4.AbstractC2318A;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzj extends AbstractC2318A {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // o4.AbstractC2318A
    public final void onTransferFailed(int i9, int i10) {
        zzk.zza.a("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i9), Integer.valueOf(i10));
        this.zza.zzu();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzf(zzkVar.zzh, i9, i10), 232);
        this.zza.zzk = false;
    }

    @Override // o4.AbstractC2318A
    public final void onTransferred(int i9, C2286s c2286s) {
        zzk.zza.a("onTransferred with type = %d", Integer.valueOf(i9));
        this.zza.zzu();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzg(zzkVar.zzh, i9), 231);
        this.zza.zzk = false;
        this.zza.zzh = null;
    }

    @Override // o4.AbstractC2318A
    public final void onTransferring(int i9) {
        zzk.zza.a("onTransferring with type = %d", Integer.valueOf(i9));
        this.zza.zzk = true;
        this.zza.zzu();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzg(zzkVar.zzh, i9), 230);
    }
}
