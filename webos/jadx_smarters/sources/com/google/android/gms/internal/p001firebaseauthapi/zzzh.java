package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzzh implements zzadk<zzafd> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzzi zzc;

    public zzzh(zzzi zzziVar, zzadk zzadkVar, zzafn zzafnVar) {
        this.zzc = zzziVar;
        this.zza = zzadkVar;
        this.zzb = zzafnVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        List<zzafc> listZza = zzafdVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzafc zzafcVar = listZza.get(0);
        zzagc zzagcVar = new zzagc();
        zzagcVar.zzd(this.zzb.zzc()).zza(this.zzc.zza);
        zzzi zzziVar = this.zzc;
        zzyj.zza(zzziVar.zzc, zzziVar.zzb, this.zzb, zzafcVar, zzagcVar, this.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzc.zzb.zza(AbstractC0622m.a(str));
    }
}
