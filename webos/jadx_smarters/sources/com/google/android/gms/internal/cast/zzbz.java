package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
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
public final class zzbz extends AbstractC2660a {
    private final ImageView zza;
    private final C2427b zzb;
    private final Bitmap zzc;
    private final View zzd;
    private final AbstractC2428c zze;
    private final zzby zzf;
    private final C2547b zzg;

    public zzbz(ImageView imageView, Context context, C2427b c2427b, int i9, View view, zzby zzbyVar) {
        C2426a c2426aH;
        this.zza = imageView;
        this.zzb = c2427b;
        this.zzf = zzbyVar;
        this.zzc = i9 != 0 ? BitmapFactory.decodeResource(context.getResources(), i9) : null;
        this.zzd = view;
        C2325b c2325bG = C2325b.g(context);
        if (c2325bG != null && (c2426aH = c2325bG.a().H()) != null) {
            c2426aH.I();
        }
        this.zzg = new C2547b(context.getApplicationContext());
    }

    private final void zzd() {
        View view = this.zzd;
        if (view != null) {
            view.setVisibility(0);
            this.zza.setVisibility(4);
        }
        Bitmap bitmap = this.zzc;
        if (bitmap != null) {
            this.zza.setImageBitmap(bitmap);
        }
    }

    private final void zze() {
        Uri uriA;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            zzd();
            return;
        }
        MediaInfo mediaInfoJ = remoteMediaClient.j();
        if (mediaInfoJ == null) {
            uriA = null;
        } else {
            mediaInfoJ.Q();
            uriA = AbstractC2430e.a(mediaInfoJ, 0);
        }
        if (uriA == null) {
            zzd();
        } else {
            this.zzg.d(uriA);
        }
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zze();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        this.zzg.c(new zzbx(this));
        zzd();
        zze();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zzg.a();
        zzd();
        super.onSessionEnded();
    }
}
