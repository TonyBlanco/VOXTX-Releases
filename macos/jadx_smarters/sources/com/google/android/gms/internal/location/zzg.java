package com.google.android.gms.internal.location;

import J4.InterfaceC0643b;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements InterfaceC0643b {
    public final f removeActivityUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.f(new zze(this, googleApiClient, pendingIntent));
    }

    public final f requestActivityUpdates(GoogleApiClient googleApiClient, long j9, PendingIntent pendingIntent) {
        return googleApiClient.f(new zzd(this, googleApiClient, j9, pendingIntent));
    }
}
