package com.google.android.gms.internal.cast;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import o4.AbstractC2345w;
import o4.C2328e;
import o4.InterfaceC2347y;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzi implements InterfaceC2347y {
    final /* synthetic */ zzk zza;

    public zzi(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionEnded(AbstractC2345w abstractC2345w, int i9) {
        this.zza.zzi = (C2328e) abstractC2345w;
        zzk.zzn(this.zza, i9);
    }

    @Override // o4.InterfaceC2347y
    public final /* synthetic */ void onSessionEnding(AbstractC2345w abstractC2345w) {
        this.zza.zzi = (C2328e) abstractC2345w;
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResumeFailed(AbstractC2345w abstractC2345w, int i9) {
        this.zza.zzi = (C2328e) abstractC2345w;
        zzk.zzn(this.zza, i9);
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResumed(AbstractC2345w abstractC2345w, boolean z9) {
        zzk.zza.a("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z9));
        this.zza.zzi = (C2328e) abstractC2345w;
        this.zza.zzu();
        r.m(this.zza.zzh);
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzb(zzkVar.zzh, z9), 227);
        zzk zzkVar2 = this.zza;
        zzkVar2.zzh.zzc(zzkVar2.zzg);
        this.zza.zzw();
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionResuming(AbstractC2345w abstractC2345w, String str) {
        zzk.zza.a("onSessionResuming with sessionId = %s", str);
        this.zza.zzi = (C2328e) abstractC2345w;
        zzk zzkVar = this.zza;
        zzk.zzo(zzkVar, zzkVar.zzg, str);
        r.m(this.zza.zzh);
        zzk zzkVar2 = this.zza;
        this.zza.zzb.zzd(zzkVar2.zzc.zzc(zzkVar2.zzh), 226);
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStartFailed(AbstractC2345w abstractC2345w, int i9) {
        this.zza.zzi = (C2328e) abstractC2345w;
        zzk.zzn(this.zza, i9);
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStarted(AbstractC2345w abstractC2345w, String str) {
        zzk.zza.a("onSessionStarted with sessionId = %s", str);
        this.zza.zzi = (C2328e) abstractC2345w;
        this.zza.zzu();
        zzk zzkVar = this.zza;
        zzkVar.zzh.zzf = str;
        this.zza.zzb.zzd(zzkVar.zzc.zza(zzkVar.zzh), 222);
        zzk zzkVar2 = this.zza;
        zzkVar2.zzh.zzc(zzkVar2.zzg);
        this.zza.zzw();
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionStarting(AbstractC2345w abstractC2345w) {
        zzk.zza.a("onSessionStarting", new Object[0]);
        this.zza.zzi = (C2328e) abstractC2345w;
        if (this.zza.zzh != null) {
            zzk.zza.f("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.zza.zzv();
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zzd(zzkVar.zzh), 221);
    }

    @Override // o4.InterfaceC2347y
    public final /* bridge */ /* synthetic */ void onSessionSuspended(AbstractC2345w abstractC2345w, int i9) {
        zzk.zza.a("onSessionSuspended with reason = %d", Integer.valueOf(i9));
        this.zza.zzi = (C2328e) abstractC2345w;
        this.zza.zzu();
        r.m(this.zza.zzh);
        zzk zzkVar = this.zza;
        this.zza.zzb.zzd(zzkVar.zzc.zze(zzkVar.zzh, i9), 225);
        zzk zzkVar2 = this.zza;
        zzkVar2.zzh.zzc(zzkVar2.zzg);
        this.zza.zzt();
    }
}
