package com.google.android.gms.internal.cast;

import u0.C2812L;

/* JADX INFO: loaded from: classes3.dex */
final class zzw extends C2812L.a {
    final /* synthetic */ zzy zza;

    public zzw(zzy zzyVar) {
        this.zza = zzyVar;
    }

    @Override // u0.C2812L.a
    public final void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
        this.zza.zzf();
    }

    @Override // u0.C2812L.a
    public final void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
        this.zza.zzf();
    }

    @Override // u0.C2812L.a
    public final void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
        this.zza.zzf();
    }

    @Override // u0.C2812L.a
    public final void onRouteSelected(C2812L c2812l, C2812L.h hVar, int i9) {
        this.zza.zzs = hVar;
        this.zza.dismiss();
    }
}
