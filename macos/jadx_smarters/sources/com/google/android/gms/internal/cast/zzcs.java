package com.google.android.gms.internal.cast;

import android.view.View;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcs extends AbstractC2660a {
    private final View zza;
    private final int zzb;

    public zzcs(View view, int i9) {
        this.zza = view;
        this.zzb = i9;
    }

    private final void zza() {
        View view;
        int i9;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            view = this.zza;
            i9 = this.zzb;
        } else {
            view = this.zza;
            i9 = 0;
        }
        view.setVisibility(i9);
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setVisibility(this.zzb);
        super.onSessionEnded();
    }
}
