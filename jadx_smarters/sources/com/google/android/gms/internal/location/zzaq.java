package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C1371k;
import com.google.android.gms.location.LocationAvailability;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
final class zzaq implements C1371k.b {
    final /* synthetic */ LocationAvailability zza;

    public zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
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
