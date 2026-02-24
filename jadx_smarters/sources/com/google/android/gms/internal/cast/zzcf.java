package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import n4.AbstractC2268e;
import o4.AbstractC2342t;
import o4.C2325b;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcf extends AbstractC2660a {
    private final ImageView zza;
    private final String zzb;
    private final String zzc;
    private final Context zzd;
    private AbstractC2268e.d zze;

    public zzcf(ImageView imageView, Context context) {
        this.zza = imageView;
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zzb = applicationContext.getString(AbstractC2342t.f46011m);
        this.zzc = applicationContext.getString(AbstractC2342t.f45996D);
        imageView.setEnabled(false);
        this.zze = null;
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
        if (this.zze == null) {
            this.zze = new zzce(this);
        }
        c2328e.p(this.zze);
        super.onSessionConnected(c2328e);
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        AbstractC2268e.d dVar;
        this.zza.setEnabled(false);
        C2328e c2328eC = C2325b.e(this.zzd).c().c();
        if (c2328eC != null && (dVar = this.zze) != null) {
            c2328eC.t(dVar);
        }
        super.onSessionEnded();
    }

    public final void zza() {
        C2328e c2328eC = C2325b.e(this.zzd).c().c();
        if (c2328eC == null || !c2328eC.c()) {
            this.zza.setEnabled(false);
            return;
        }
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            this.zza.setEnabled(false);
        } else {
            this.zza.setEnabled(true);
        }
        boolean zS = c2328eC.s();
        this.zza.setSelected(zS);
        this.zza.setContentDescription(zS ? this.zzc : this.zzb);
    }
}
