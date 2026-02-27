package com.google.android.gms.internal.cast;

import C4.m;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import o4.AbstractC2342t;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcg extends AbstractC2660a {
    private final ImageView zza;
    private final View zzb;
    private final boolean zzc;
    private final Drawable zzd;
    private final String zze;
    private final Drawable zzf;
    private final String zzg;
    private final Drawable zzh;
    private final String zzi;
    private boolean zzj = false;

    public zzcg(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z9) {
        this.zza = imageView;
        this.zzd = drawable;
        this.zzf = drawable2;
        this.zzh = drawable3 != null ? drawable3 : drawable2;
        this.zze = context.getString(AbstractC2342t.f46013o);
        this.zzg = context.getString(AbstractC2342t.f46012n);
        this.zzi = context.getString(AbstractC2342t.f46019u);
        this.zzb = view;
        this.zzc = z9;
        imageView.setEnabled(false);
    }

    private final void zza(Drawable drawable, String str) {
        boolean z9 = !drawable.equals(this.zza.getDrawable());
        this.zza.setImageDrawable(drawable);
        this.zza.setContentDescription(str);
        this.zza.setVisibility(0);
        this.zza.setEnabled(true);
        View view = this.zzb;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z9 && this.zzj) {
            this.zza.sendAccessibilityEvent(8);
        }
    }

    @TargetApi(21)
    private final void zzb(boolean z9) {
        if (m.f()) {
            this.zzj = this.zza.isAccessibilityFocused();
        }
        View view = this.zzb;
        if (view != null) {
            view.setVisibility(0);
            if (this.zzj) {
                this.zzb.sendAccessibilityEvent(8);
            }
        }
        this.zza.setVisibility(true == this.zzc ? 4 : 0);
        this.zza.setEnabled(!z9);
    }

    private final void zzc() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            this.zza.setEnabled(false);
            return;
        }
        if (remoteMediaClient.v()) {
            if (remoteMediaClient.s()) {
                zza(this.zzh, this.zzi);
                return;
            } else {
                zza(this.zzf, this.zzg);
                return;
            }
        }
        if (remoteMediaClient.r()) {
            zzb(false);
        } else if (remoteMediaClient.u()) {
            zza(this.zzd, this.zze);
        } else if (remoteMediaClient.t()) {
            zzb(true);
        }
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zzc();
    }

    @Override // r4.AbstractC2660a
    public final void onSendingRemoteMediaRequest() {
        zzb(true);
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        zzc();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        this.zza.setEnabled(false);
        super.onSessionEnded();
    }
}
