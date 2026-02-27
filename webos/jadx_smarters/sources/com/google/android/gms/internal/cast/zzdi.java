package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public final class zzdi extends zzdh {
    final /* synthetic */ zzdk zza;
    private final zzdp zzb;

    public zzdi(zzdk zzdkVar, zzdp zzdpVar) {
        this.zza = zzdkVar;
        this.zzb = zzdpVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzb(int i9, int i10, Surface surface) {
        zzdk zzdkVar;
        zzdl zzdlVar;
        zzdm.zza.a("onConnected", new Object[0]);
        DisplayManager displayManager = (DisplayManager) this.zzb.getContext().getSystemService("display");
        if (displayManager == null) {
            zzdm.zza.c("Unable to get the display manager", new Object[0]);
            zzdkVar = this.zza;
            zzdlVar = new zzdl(Status.f26439m);
        } else {
            zzdm.zzf(this.zza.zzc);
            this.zza.zzc.zzc = displayManager.createVirtualDisplay("private_display", i9, i10, ((i9 < i10 ? i9 : i10) * 320) / 1080, surface, 2);
            zzdm zzdmVar = this.zza.zzc;
            if (zzdmVar.zzc == null) {
                zzdm.zza.c("Unable to create virtual display", new Object[0]);
                zzdkVar = this.zza;
                zzdlVar = new zzdl(Status.f26439m);
            } else if (zzdmVar.zzc.getDisplay() == null) {
                zzdm.zza.c("Virtual display does not have a display", new Object[0]);
                zzdkVar = this.zza;
                zzdlVar = new zzdl(Status.f26439m);
            } else {
                try {
                    ((zzds) this.zzb.getService()).zzf(this, this.zza.zzc.zzc.getDisplay().getDisplayId());
                    return;
                } catch (RemoteException | IllegalStateException unused) {
                    zzdm.zza.c("Unable to provision the route's new virtual Display", new Object[0]);
                    zzdkVar = this.zza;
                    zzdlVar = new zzdl(Status.f26439m);
                }
            }
        }
        zzdkVar.setResult(zzdlVar);
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzc() {
        zzdm.zza.a("onConnectedWithDisplay", new Object[0]);
        zzdm zzdmVar = this.zza.zzc;
        if (zzdmVar.zzc == null) {
            zzdm.zza.c("There is no virtual display", new Object[0]);
            this.zza.setResult(new zzdl(Status.f26439m));
            return;
        }
        Display display = zzdmVar.zzc.getDisplay();
        if (display != null) {
            this.zza.setResult(new zzdl(display));
        } else {
            zzdm.zza.c("Virtual display no longer has a display", new Object[0]);
            this.zza.setResult(new zzdl(Status.f26439m));
        }
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzd(int i9) throws RemoteException {
        zzdm.zza.a("onError: %d", Integer.valueOf(i9));
        zzdm.zzf(this.zza.zzc);
        this.zza.setResult(new zzdl(Status.f26439m));
    }
}
