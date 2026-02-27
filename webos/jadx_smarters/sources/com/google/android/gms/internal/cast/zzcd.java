package com.google.android.gms.internal.cast;

import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.List;
import n4.C2281m;
import n4.r;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd extends AbstractC2660a {
    private final TextView zza;
    private final List zzb;

    public zzcd(TextView textView, List list) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = textView;
        arrayList.addAll(list);
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        MediaInfo mediaInfoS;
        C2281m c2281mQ;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q() || (mediaInfoS = ((r) com.google.android.gms.common.internal.r.m(remoteMediaClient.l())).S()) == null || (c2281mQ = mediaInfoS.Q()) == null) {
            return;
        }
        for (String str : this.zzb) {
            if (c2281mQ.e(str)) {
                this.zza.setText(c2281mQ.J(str));
                return;
            }
        }
        this.zza.setText("");
    }
}
