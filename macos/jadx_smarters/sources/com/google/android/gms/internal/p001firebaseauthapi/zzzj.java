package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
final class zzzj implements zzadk<zzahd> {
    private final /* synthetic */ zzzk zza;

    public zzzj(zzzk zzzkVar) {
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzahd zzahdVar) {
        zzahd zzahdVar2 = zzahdVar;
        if (TextUtils.isEmpty(zzahdVar2.zza()) || TextUtils.isEmpty(zzahdVar2.zzb())) {
            this.zza.zza.zza(AbstractC0622m.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzafn zzafnVar = new zzafn(zzahdVar2.zzb(), zzahdVar2.zza(), Long.valueOf(zzafp.zza(zzahdVar2.zza())), "Bearer");
        zzzk zzzkVar = this.zza;
        zzzkVar.zzb.zza(zzafnVar, null, null, Boolean.FALSE, null, zzzkVar.zza, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza.zza(AbstractC0622m.a(str));
    }
}
