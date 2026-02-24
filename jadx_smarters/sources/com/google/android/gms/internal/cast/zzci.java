package com.google.android.gms.internal.cast;

import android.view.View;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;
import r4.C2662c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzci extends AbstractC2660a implements C2434i.e {
    private final View zza;
    private final C2662c zzb;

    public zzci(View view, C2662c c2662c) {
        this.zza = view;
        this.zzb = c2662c;
        view.setEnabled(false);
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
    public final void onSendingRemoteMediaRequest() {
        this.zza.setEnabled(false);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.c(this, 1000L);
        }
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.P(this);
        }
        this.zza.setEnabled(false);
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        boolean z9 = false;
        if (remoteMediaClient == null || !remoteMediaClient.q() || remoteMediaClient.w()) {
            this.zza.setEnabled(false);
            return;
        }
        if (!remoteMediaClient.s()) {
            this.zza.setEnabled(true);
            return;
        }
        View view = this.zza;
        if (remoteMediaClient.r0()) {
            C2662c c2662c = this.zzb;
            if ((((long) c2662c.a()) + c2662c.e()) - (((long) c2662c.d()) + c2662c.e()) >= 10000) {
                z9 = true;
            }
        }
        view.setEnabled(z9);
    }
}
