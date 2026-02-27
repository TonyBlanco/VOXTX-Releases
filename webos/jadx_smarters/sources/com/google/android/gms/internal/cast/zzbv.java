package com.google.android.gms.internal.cast;

import android.graphics.Bitmap;
import q4.InterfaceC2546a;

/* JADX INFO: loaded from: classes3.dex */
final class zzbv implements InterfaceC2546a {
    final /* synthetic */ zzbw zza;

    public zzbv(zzbw zzbwVar) {
        this.zza = zzbwVar;
    }

    @Override // q4.InterfaceC2546a
    public final void zza(Bitmap bitmap) {
        if (bitmap != null) {
            this.zza.zza.setImageBitmap(bitmap);
        }
    }
}
