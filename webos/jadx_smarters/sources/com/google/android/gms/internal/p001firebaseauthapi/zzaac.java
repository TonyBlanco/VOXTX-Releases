package com.google.android.gms.internal.p001firebaseauthapi;

import G5.P;
import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzaac implements zzadk<zzafn> {
    private final /* synthetic */ P zza;
    private final /* synthetic */ zzacd zzb;
    private final /* synthetic */ zzyj zzc;

    public zzaac(zzyj zzyjVar, P p9, zzacd zzacdVar) {
        this.zzc = zzyjVar;
        this.zza = p9;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        zzafn zzafnVar2 = zzafnVar;
        zzagc zzagcVar = new zzagc();
        zzagcVar.zzd(zzafnVar2.zzc());
        if (this.zza.J() || this.zza.H() != null) {
            zzagcVar.zzb(this.zza.H());
        }
        if (this.zza.zzc() || this.zza.I() != null) {
            zzagcVar.zzg(this.zza.zza());
        }
        zzyj.zza(this.zzc, this.zzb, zzafnVar2, zzagcVar, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(AbstractC0622m.a(str));
    }
}
