package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import n4.C2281m;
import p4.C2434i;
import q4.x;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcn extends AbstractC2660a {
    private final TextView zza;

    public zzcn(TextView textView) {
        this.zza = textView;
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        MediaInfo mediaInfoJ;
        C2281m c2281mQ;
        String strE;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || (mediaInfoJ = remoteMediaClient.j()) == null || (c2281mQ = mediaInfoJ.Q()) == null || (strE = x.e(c2281mQ)) == null) {
            return;
        }
        this.zza.setText(strE);
    }
}
