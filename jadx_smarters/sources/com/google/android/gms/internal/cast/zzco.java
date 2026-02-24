package com.google.android.gms.internal.cast;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzco extends AbstractC2660a implements C2434i.e {
    private final TextView zza;
    private final String zzb;
    private final View zzc;

    public zzco(TextView textView, String str, View view) {
        this.zza = textView;
        this.zzb = str;
        this.zzc = view;
    }

    private final void zza(long j9, boolean z9) {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            this.zza.setVisibility(0);
            this.zza.setText(this.zzb);
            View view = this.zzc;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        if (remoteMediaClient.s()) {
            this.zza.setText(this.zzb);
            if (this.zzc != null) {
                this.zza.setVisibility(4);
                this.zzc.setVisibility(0);
                return;
            }
            return;
        }
        if (z9) {
            j9 = remoteMediaClient.p();
        }
        this.zza.setVisibility(0);
        this.zza.setText(DateUtils.formatElapsedTime(j9 / 1000));
        View view2 = this.zzc;
        if (view2 != null) {
            view2.setVisibility(4);
        }
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zza(-1L, true);
    }

    @Override // p4.C2434i.e
    public final void onProgressUpdated(long j9, long j10) {
        zza(j10, false);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.c(this, 1000L);
        }
        zza(-1L, true);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setText(this.zzb);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.P(this);
        }
        super.onSessionEnded();
    }
}
