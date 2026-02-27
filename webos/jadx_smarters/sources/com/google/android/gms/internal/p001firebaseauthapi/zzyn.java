package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0541h;
import H5.AbstractC0622m;

/* JADX INFO: loaded from: classes3.dex */
final class zzyn implements zzadk<zzafn> {
    private final /* synthetic */ C0541h zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzacd zzc;
    private final /* synthetic */ zzyj zzd;

    public zzyn(zzyj zzyjVar, C0541h c0541h, String str, zzacd zzacdVar) {
        this.zzd = zzyjVar;
        this.zza = c0541h;
        this.zzb = str;
        this.zzc = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafn zzafnVar) {
        this.zzd.zza(new zzaep(this.zza, zzafnVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzc.zza(AbstractC0622m.a(str));
    }
}
