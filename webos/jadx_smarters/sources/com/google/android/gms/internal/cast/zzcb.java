package com.google.android.gms.internal.cast;

import android.view.View;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb extends AbstractC2660a {
    private final View zza;

    public zzcb(View view) {
        this.zza = view;
    }

    private final void zza() {
        View view;
        int i9;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q() || remoteMediaClient.r()) {
            view = this.zza;
            i9 = 0;
        } else {
            view = this.zza;
            i9 = 8;
        }
        view.setVisibility(i9);
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSendingRemoteMediaRequest() {
        this.zza.setVisibility(0);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setVisibility(8);
        super.onSessionEnded();
    }
}
