package com.google.android.gms.internal.cast;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import com.google.android.gms.common.util.VisibleForTesting;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;
import r4.C2662c;

/* JADX INFO: loaded from: classes3.dex */
public final class zzck extends AbstractC2660a implements C2434i.e {
    private final SeekBar zza;
    private final long zzb;
    private final C2662c zzc;
    private boolean zzd = true;
    private Boolean zze;
    private Drawable zzf;

    public zzck(SeekBar seekBar, long j9, C2662c c2662c) {
        this.zzf = null;
        this.zza = seekBar;
        this.zzb = j9;
        this.zzc = c2662c;
        seekBar.setEnabled(false);
        this.zzf = seekBar.getThumb();
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zzb();
    }

    @Override // p4.C2434i.e
    public final void onProgressUpdated(long j9, long j10) {
        zzb();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.c(this, this.zzb);
        }
        zzb();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.P(this);
        }
        super.onSessionEnded();
        zzb();
    }

    public final void zza(boolean z9) {
        this.zzd = z9;
    }

    @VisibleForTesting
    public final void zzb() {
        SeekBar seekBar;
        int iA;
        C2434i remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q()) {
            this.zza.setMax(this.zzc.b());
            this.zza.setProgress(this.zzc.a());
            this.zza.setEnabled(false);
            return;
        }
        if (this.zzd) {
            this.zza.setMax(this.zzc.b());
            if (remoteMediaClient.s() && this.zzc.m()) {
                seekBar = this.zza;
                iA = this.zzc.c();
            } else {
                seekBar = this.zza;
                iA = this.zzc.a();
            }
            seekBar.setProgress(iA);
            if (remoteMediaClient.w()) {
                this.zza.setEnabled(false);
            } else {
                this.zza.setEnabled(true);
            }
            C2434i remoteMediaClient2 = getRemoteMediaClient();
            if (remoteMediaClient2 == null || !remoteMediaClient2.q()) {
                return;
            }
            Boolean bool = this.zze;
            if (bool == null || bool.booleanValue() != remoteMediaClient2.r0()) {
                Boolean boolValueOf = Boolean.valueOf(remoteMediaClient2.r0());
                this.zze = boolValueOf;
                if (!boolValueOf.booleanValue()) {
                    this.zza.setThumb(new ColorDrawable(0));
                    this.zza.setClickable(false);
                    this.zza.setOnTouchListener(new zzcj(this));
                    return;
                }
                Drawable drawable = this.zzf;
                if (drawable != null) {
                    this.zza.setThumb(drawable);
                }
                this.zza.setClickable(true);
                this.zza.setOnTouchListener(null);
            }
        }
    }
}
