package com.google.android.gms.internal.location;

import J4.B;
import android.location.Location;
import com.google.android.gms.common.api.internal.C1371k;

/* JADX INFO: loaded from: classes3.dex */
final class zzau extends B {
    private final C1371k zza;

    public zzau(C1371k c1371k) {
        this.zza = c1371k;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    @Override // J4.C
    public final synchronized void zzd(Location location) {
        this.zza.c(new zzat(this, location));
    }
}
