package com.google.android.gms.internal.location;

import J4.AbstractC0656o;
import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC1359e;

/* JADX INFO: loaded from: classes3.dex */
final class zzax extends zzaj {
    private InterfaceC1359e zza;

    public zzax(InterfaceC1359e interfaceC1359e) {
        this.zza = interfaceC1359e;
    }

    private final void zze(int i9) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(AbstractC0656o.b(AbstractC0656o.a(i9)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i9, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i9, String[] strArr) {
        zze(i9);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i9, PendingIntent pendingIntent) {
        zze(i9);
    }
}
