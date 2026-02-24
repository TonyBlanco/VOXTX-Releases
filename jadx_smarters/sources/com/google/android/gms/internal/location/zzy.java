package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.InterfaceC1359e;

/* JADX INFO: loaded from: classes3.dex */
final class zzy extends zzah {
    private final InterfaceC1359e zza;

    public zzy(InterfaceC1359e interfaceC1359e) {
        this.zza = interfaceC1359e;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        this.zza.setResult(zzaaVar.getStatus());
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}
