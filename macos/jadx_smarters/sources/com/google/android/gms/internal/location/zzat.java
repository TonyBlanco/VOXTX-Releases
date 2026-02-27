package com.google.android.gms.internal.location;

import J4.InterfaceC0651j;
import android.location.Location;
import com.google.android.gms.common.api.internal.C1371k;

/* JADX INFO: loaded from: classes3.dex */
final class zzat implements C1371k.b {
    final /* synthetic */ Location zza;

    public zzat(zzau zzauVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.C1371k.b
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((InterfaceC0651j) obj).a(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.C1371k.b
    public final void onNotifyListenerFailed() {
    }
}
