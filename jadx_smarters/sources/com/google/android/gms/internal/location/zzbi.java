package com.google.android.gms.internal.location;

import J4.C0653l;
import J4.InterfaceC0657p;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.f;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbi implements InterfaceC0657p {
    public final f checkLocationSettings(GoogleApiClient googleApiClient, C0653l c0653l) {
        return googleApiClient.e(new zzbh(this, googleApiClient, c0653l, null));
    }
}
