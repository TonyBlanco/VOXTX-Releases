package com.google.android.gms.internal.cast;

import android.hardware.display.VirtualDisplay;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzdm {
    private static final C2775b zza = new C2775b("CastRemoteDisplayApiImpl");
    private final a zzb;
    private VirtualDisplay zzc;
    private final zzdu zzd = new zzde(this);

    public zzdm(a aVar) {
        this.zzb = aVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzdm zzdmVar) {
        VirtualDisplay virtualDisplay = zzdmVar.zzc;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                zza.a("releasing virtual display: " + virtualDisplay.getDisplay().getDisplayId(), new Object[0]);
            }
            virtualDisplay.release();
        }
        zzdmVar.zzc = null;
    }

    public final f startRemoteDisplay(GoogleApiClient googleApiClient, String str) {
        zza.a("startRemoteDisplay", new Object[0]);
        return googleApiClient.f(new zzdf(this, googleApiClient, str));
    }

    public final f stopRemoteDisplay(GoogleApiClient googleApiClient) {
        zza.a("stopRemoteDisplay", new Object[0]);
        return googleApiClient.f(new zzdg(this, googleApiClient));
    }
}
