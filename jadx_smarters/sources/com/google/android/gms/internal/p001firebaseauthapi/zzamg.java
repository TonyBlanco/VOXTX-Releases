package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzamg extends zzame<zzamd, zzamd> {
    private static void zza(Object obj, zzamd zzamdVar) {
        ((zzajc) obj).zzb = zzamdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ int zza(zzamd zzamdVar) {
        return zzamdVar.zza();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ zzamd zza() {
        return zzamd.zzd();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ zzamd zza(zzamd zzamdVar, zzamd zzamdVar2) {
        zzamd zzamdVar3 = zzamdVar;
        zzamd zzamdVar4 = zzamdVar2;
        return zzamd.zzc().equals(zzamdVar4) ? zzamdVar3 : zzamd.zzc().equals(zzamdVar3) ? zzamd.zza(zzamdVar3, zzamdVar4) : zzamdVar3.zza(zzamdVar4);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zza(zzamd zzamdVar, int i9, int i10) {
        zzamdVar.zza((i9 << 3) | 5, Integer.valueOf(i10));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zza(zzamd zzamdVar, int i9, long j9) {
        zzamdVar.zza((i9 << 3) | 1, Long.valueOf(j9));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zza(zzamd zzamdVar, int i9, zzahp zzahpVar) {
        zzamdVar.zza((i9 << 3) | 2, zzahpVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zza(zzamd zzamdVar, int i9, zzamd zzamdVar2) {
        zzamdVar.zza((i9 << 3) | 3, zzamdVar2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zza(zzamd zzamdVar, zzana zzanaVar) throws IOException {
        zzamdVar.zza(zzanaVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final boolean zza(zzalc zzalcVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ int zzb(zzamd zzamdVar) {
        return zzamdVar.zzb();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zzb(zzamd zzamdVar, int i9, long j9) {
        zzamdVar.zza(i9 << 3, Long.valueOf(j9));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zzb(zzamd zzamdVar, zzana zzanaVar) throws IOException {
        zzamdVar.zzb(zzanaVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zzb(Object obj, zzamd zzamdVar) {
        zza(obj, zzamdVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ zzamd zzc(Object obj) {
        zzamd zzamdVar = ((zzajc) obj).zzb;
        if (zzamdVar != zzamd.zzc()) {
            return zzamdVar;
        }
        zzamd zzamdVarZzd = zzamd.zzd();
        zza(obj, zzamdVarZzd);
        return zzamdVarZzd;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ void zzc(Object obj, zzamd zzamdVar) {
        zza(obj, zzamdVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ zzamd zzd(Object obj) {
        return ((zzajc) obj).zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final /* synthetic */ zzamd zze(zzamd zzamdVar) {
        zzamd zzamdVar2 = zzamdVar;
        zzamdVar2.zze();
        return zzamdVar2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzame
    public final void zzf(Object obj) {
        ((zzajc) obj).zzb.zze();
    }
}
