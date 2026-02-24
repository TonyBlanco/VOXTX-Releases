package com.google.android.gms.internal.cast;

import android.view.View;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcm extends AbstractC2660a {
    private final View zza;
    private final int zzb;

    public zzcm(View view, int i9) {
        this.zza = view;
        this.zzb = i9;
        view.setEnabled(false);
    }

    private final void zza() {
        View view;
        C2434i remoteMediaClient = getRemoteMediaClient();
        boolean z9 = false;
        if (remoteMediaClient == null || !remoteMediaClient.p0() || remoteMediaClient.w()) {
            this.zza.setVisibility(this.zzb);
            view = this.zza;
        } else {
            this.zza.setVisibility(0);
            view = this.zza;
            z9 = true;
        }
        view.setEnabled(z9);
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
