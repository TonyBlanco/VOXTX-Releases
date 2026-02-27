package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzzt implements zzadk<zzafd> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzafn zzb;
    private final /* synthetic */ zzzu zzc;

    public zzzt(zzzu zzzuVar, zzadk zzadkVar, zzafn zzafnVar) {
        this.zzc = zzzuVar;
        this.zza = zzadkVar;
        this.zzb = zzafnVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        List<zzafc> listZza = zzafdVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzc.zza.zza(this.zzb, listZza.get(0));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
