package com.google.android.gms.internal.p001firebaseauthapi;

import G5.F;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class zzze implements zzadk<zzahb> {
    private final /* synthetic */ zzadk zza;
    private final /* synthetic */ zzzb zzb;

    public zzze(zzzb zzzbVar, zzadk zzadkVar) {
        this.zzb = zzzbVar;
        this.zza = zzadkVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzahb zzahbVar) {
        zzahb zzahbVar2 = zzahbVar;
        if (TextUtils.isEmpty(zzahbVar2.zze())) {
            this.zzb.zzb.zza(new zzafn(zzahbVar2.zzd(), zzahbVar2.zzb(), Long.valueOf(zzahbVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzahbVar2.zzf()), null, this.zzb.zza, this.zza);
        } else {
            this.zzb.zza.zza(new Status(17025), F.N(zzahbVar2.zzc(), zzahbVar2.zze()));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
