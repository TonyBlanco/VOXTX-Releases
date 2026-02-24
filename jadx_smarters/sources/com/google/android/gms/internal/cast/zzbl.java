package com.google.android.gms.internal.cast;

import o4.AbstractC2345w;
import o4.InterfaceC2347y;

/* JADX INFO: loaded from: classes3.dex */
final class zzbl implements InterfaceC2347y {
    final /* synthetic */ zzbm zza;

    public /* synthetic */ zzbl(zzbm zzbmVar, zzbk zzbkVar) {
        this.zza = zzbmVar;
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionEnded(AbstractC2345w abstractC2345w, int i9) {
        zzbm.zza.a("onSessionEnded with error = %d", Integer.valueOf(i9));
        zzbm.zzg(this.zza);
        zzbm zzbmVar = this.zza;
        if (zzbmVar.zzf == 2) {
            return;
        }
        zzbmVar.zzq();
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionEnding(AbstractC2345w abstractC2345w) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(AbstractC2345w abstractC2345w, int i9) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResumed(AbstractC2345w abstractC2345w, boolean z9) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResuming(AbstractC2345w abstractC2345w, String str) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(AbstractC2345w abstractC2345w, int i9) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStarted(AbstractC2345w abstractC2345w, String str) {
        zzbm.zza.a("onSessionStarted with transferType = %d", Integer.valueOf(this.zza.zzf));
        if (this.zza.zzb.zzg()) {
            zzbm zzbmVar = this.zza;
            if (zzbmVar.zzf == 2) {
                zzbm.zzi(zzbmVar);
            }
        }
        this.zza.zzq();
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStarting(AbstractC2345w abstractC2345w) {
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionSuspended(AbstractC2345w abstractC2345w, int i9) {
    }
}
