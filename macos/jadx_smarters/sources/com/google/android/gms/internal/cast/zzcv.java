package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import o4.AbstractC2342t;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;
import r4.C2662c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcv extends AbstractC2660a implements C2434i.e {
    private final TextView zza;
    private final C2662c zzb;

    public zzcv(TextView textView, C2662c c2662c) {
        this.zza = textView;
        this.zzb = c2662c;
        textView.setText(textView.getContext().getString(AbstractC2342t.f46010l));
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
        super.onSessionEnded();
        zza();
    }

    public final void zza() {
        TextView textView;
        String string;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            textView = this.zza;
            string = textView.getContext().getString(AbstractC2342t.f46010l);
        } else {
            long jG = remoteMediaClient.g();
            if (jG == MediaInfo.f26258y) {
                jG = remoteMediaClient.p();
            }
            textView = this.zza;
            string = this.zzb.l(jG);
        }
        textView.setText(string);
    }
}
