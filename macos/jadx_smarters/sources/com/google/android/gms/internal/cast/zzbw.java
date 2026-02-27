package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import n4.C2284p;
import o4.C2325b;
import o4.C2328e;
import p4.AbstractC2428c;
import p4.AbstractC2430e;
import p4.C2426a;
import p4.C2427b;
import p4.C2434i;
import q4.C2547b;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbw extends AbstractC2660a {
    private final ImageView zza;
    private final C2427b zzb;
    private final Bitmap zzc;
    private final AbstractC2428c zzd;
    private final C2547b zze;

    public zzbw(ImageView imageView, Context context, C2427b c2427b, int i9) {
        C2426a c2426aH;
        C2547b c2547b = new C2547b(context.getApplicationContext());
        this.zza = imageView;
        this.zzb = c2427b;
        this.zzc = BitmapFactory.decodeResource(context.getResources(), i9);
        C2325b c2325bG = C2325b.g(context);
        if (c2325bG != null && (c2426aH = c2325bG.a().H()) != null) {
            c2426aH.I();
        }
        this.zze = c2547b;
    }

    private final void zzb() {
        MediaInfo mediaInfoL;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            this.zza.setImageBitmap(this.zzc);
            return;
        }
        C2284p c2284pO = remoteMediaClient.o();
        Uri uriA = null;
        if (c2284pO != null && (mediaInfoL = c2284pO.L()) != null) {
            mediaInfoL.Q();
            uriA = AbstractC2430e.a(mediaInfoL, 0);
        }
        if (uriA == null) {
            this.zza.setImageBitmap(this.zzc);
        } else {
            this.zze.d(uriA);
        }
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zzb();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        this.zze.c(new zzbv(this));
        this.zza.setImageBitmap(this.zzc);
        zzb();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zze.a();
        this.zza.setImageBitmap(this.zzc);
        super.onSessionEnded();
    }
}
