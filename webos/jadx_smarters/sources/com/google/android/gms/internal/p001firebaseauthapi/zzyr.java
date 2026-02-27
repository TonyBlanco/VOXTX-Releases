package com.google.android.gms.internal.p001firebaseauthapi;

import G5.f0;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzyr implements zzadk<zzafd> {
    private final /* synthetic */ zzadl zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ f0 zze;
    private final /* synthetic */ zzacd zzf;
    private final /* synthetic */ zzafn zzg;

    public zzyr(zzyj zzyjVar, zzadl zzadlVar, String str, String str2, Boolean bool, f0 f0Var, zzacd zzacdVar, zzafn zzafnVar) {
        this.zza = zzadlVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = f0Var;
        this.zzf = zzacdVar;
        this.zzg = zzafnVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzafd zzafdVar) {
        zzafs zzafsVar;
        List<zzafc> listZza = zzafdVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean zBooleanValue = false;
        zzafc zzafcVar = listZza.get(0);
        zzafv zzafvVarZzf = zzafcVar.zzf();
        List<zzafs> listZza2 = zzafvVarZzf != null ? zzafvVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zzafsVar = listZza2.get(0);
            } else {
                for (int i9 = 0; i9 < listZza2.size(); i9++) {
                    if (listZza2.get(i9).zzf().equals(this.zzb)) {
                        zzafsVar = listZza2.get(i9);
                    }
                }
            }
            zzafsVar.zza(this.zzc);
            break;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (zzafcVar.zzb() - zzafcVar.zza() < 1000) {
            zBooleanValue = true;
        }
        zzafcVar.zza(zBooleanValue);
        zzafcVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzafcVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
