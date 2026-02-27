package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import q4.InterfaceC2546a;

/* JADX INFO: loaded from: classes3.dex */
final class zzbx implements InterfaceC2546a {
    final /* synthetic */ zzbz zza;

    public zzbx(zzbz zzbzVar) {
        this.zza = zzbzVar;
    }

    @Override // q4.InterfaceC2546a
    public final void zza(Bitmap bitmap) {
        if (bitmap != null) {
            zzbz zzbzVar = this.zza;
            if (zzbzVar.zzd != null) {
                zzbzVar.zzd.setVisibility(4);
            }
            this.zza.zza.setVisibility(0);
            this.zza.zza.setImageBitmap(bitmap);
            zzbz zzbzVar2 = this.zza;
            if (zzbzVar2.zzf != null) {
                zzbzVar2.zzf.zza();
            }
        }
    }
}
