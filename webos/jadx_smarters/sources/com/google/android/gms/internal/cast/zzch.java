package com.google.android.gms.internal.cast;

import android.widget.ProgressBar;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzch extends AbstractC2660a implements C2434i.e {
    private final ProgressBar zza;
    private final long zzb;

    public zzch(ProgressBar progressBar, long j9) {
        this.zza = progressBar;
        this.zzb = j9;
        progressBar.setMax(1);
        progressBar.setProgress(0);
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zza();
    }

    @Override // p4.C2434i.e
    public final void onProgressUpdated(long j9, long j10) {
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.c(this, this.zzb);
        }
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.P(this);
        }
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q() || remoteMediaClient.s()) {
            this.zza.setMax(1);
            this.zza.setProgress(0);
        } else {
            this.zza.setMax((int) remoteMediaClient.p());
            this.zza.setProgress((int) remoteMediaClient.g());
        }
    }
}
