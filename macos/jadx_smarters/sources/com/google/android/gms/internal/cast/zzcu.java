package com.google.android.gms.internal.cast;

import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import o4.AbstractC2336m;
import o4.AbstractC2340q;
import o4.AbstractC2343u;
import o4.AbstractC2344v;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;
import r4.C2662c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcu extends AbstractC2660a implements C2434i.e {
    private final TextView zza;
    private final ImageView zzb;
    private final C2662c zzc;

    public zzcu(View view, C2662c c2662c) {
        TextView textView = (TextView) view.findViewById(AbstractC2340q.f45944R);
        this.zza = textView;
        ImageView imageView = (ImageView) view.findViewById(AbstractC2340q.f45943Q);
        this.zzb = imageView;
        this.zzc = c2662c;
        TypedArray typedArrayObtainStyledAttributes = imageView.getContext().obtainStyledAttributes(null, AbstractC2344v.f46049b, AbstractC2336m.f45890a, AbstractC2343u.f46025a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC2344v.f46063p, 0);
        typedArrayObtainStyledAttributes.recycle();
        imageView.getDrawable().setColorFilter(imageView.getContext().getResources().getColor(resourceId), PorterDuff.Mode.SRC_IN);
        textView.setVisibility(8);
        imageView.setVisibility(8);
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
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q() || !remoteMediaClient.s()) {
            this.zza.setVisibility(8);
            this.zzb.setVisibility(8);
        } else {
            boolean zV = !remoteMediaClient.r0() ? remoteMediaClient.v() : this.zzc.m();
            this.zza.setVisibility(0);
            this.zzb.setVisibility(true == zV ? 0 : 8);
            zzr.zzd(zzln.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT);
        }
    }
}
