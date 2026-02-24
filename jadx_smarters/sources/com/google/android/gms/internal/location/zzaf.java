package com.google.android.gms.internal.location;

import J4.C0649h;
import J4.InterfaceC0647f;
import J4.InterfaceC0648g;
import J4.P;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.f;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf implements InterfaceC0648g {
    public final f addGeofences(GoogleApiClient googleApiClient, C0649h c0649h, PendingIntent pendingIntent) {
        return googleApiClient.f(new zzac(this, googleApiClient, c0649h, pendingIntent));
    }

    @Deprecated
    public final f addGeofences(GoogleApiClient googleApiClient, List<InterfaceC0647f> list, PendingIntent pendingIntent) {
        C0649h.a aVar = new C0649h.a();
        aVar.b(list);
        aVar.d(5);
        return googleApiClient.f(new zzac(this, googleApiClient, aVar.c(), pendingIntent));
    }

    public final f removeGeofences(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return zza(googleApiClient, P.e(pendingIntent));
    }

    public final f removeGeofences(GoogleApiClient googleApiClient, List<String> list) {
        return zza(googleApiClient, P.c(list));
    }

    public final f zza(GoogleApiClient googleApiClient, P p9) {
        return googleApiClient.f(new zzad(this, googleApiClient, p9));
    }
}
