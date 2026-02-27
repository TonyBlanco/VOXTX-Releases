package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

/* JADX INFO: loaded from: classes3.dex */
final class zzdb extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzdc zza;

    public zzdb(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.zza.zzg(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzdc.zze(this.zza, network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        zzdc.zzd(this.zza);
    }
}
