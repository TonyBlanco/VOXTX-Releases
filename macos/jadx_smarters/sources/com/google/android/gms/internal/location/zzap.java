package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.location.LocationResult;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
final class zzap implements C1371k.b {
    final /* synthetic */ LocationResult zza;

    public zzap(zzar zzarVar, LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.C1371k.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        AbstractC1617D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.C1371k.b
    public final void onNotifyListenerFailed() {
    }
}
