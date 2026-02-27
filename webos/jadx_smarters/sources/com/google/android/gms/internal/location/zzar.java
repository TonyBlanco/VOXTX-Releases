package com.google.android.gms.internal.location;

import J4.AbstractBinderC0664x;
import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes3.dex */
final class zzar extends AbstractBinderC0664x {
    private final C1371k zza;

    public zzar(C1371k c1371k) {
        this.zza = c1371k;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    @Override // J4.InterfaceC0666z
    public final void zzd(LocationResult locationResult) {
        this.zza.c(new zzap(this, locationResult));
    }

    @Override // J4.InterfaceC0666z
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.c(new zzaq(this, locationAvailability));
    }
}
