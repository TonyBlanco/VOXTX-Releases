package com.google.android.gms.internal.cast;

import android.text.format.DateUtils;
import android.widget.TextView;
import o4.C2328e;
import p4.C2434i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcp extends zzcq implements C2434i.e {
    private final TextView zza;
    private final long zzb;
    private final String zzc;
    private boolean zzd = true;

    public zzcp(TextView textView, long j9, String str) {
        this.zza = textView;
        this.zzb = j9;
        this.zzc = str;
    }

    @Override // p4.C2434i.e
    public final void onProgressUpdated(long j9, long j10) {
        if (this.zzd) {
            TextView textView = this.zza;
            if (j9 == -1000) {
                j9 = j10;
            }
            textView.setText(DateUtils.formatElapsedTime(j9 / 1000));
        }
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.c(this, this.zzb);
            if (remoteMediaClient.q()) {
                this.zza.setText(DateUtils.formatElapsedTime(remoteMediaClient.g() / 1000));
            } else {
                this.zza.setText(this.zzc);
            }
        }
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setText(this.zzc);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.P(this);
        }
        super.onSessionEnded();
    }

    @Override // com.google.android.gms.internal.cast.zzcq
    public final void zza(boolean z9) {
        this.zzd = z9;
    }

    @Override // com.google.android.gms.internal.cast.zzcq
    public final void zzb(long j9) {
        this.zza.setText(DateUtils.formatElapsedTime(j9 / 1000));
    }
}
