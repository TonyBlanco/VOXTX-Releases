package com.google.android.gms.internal.measurement;

import M4.AbstractC0728d2;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
final class zzcx extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzef zzefVar, String str, String str2, Context context, Bundle bundle) {
        super(zzefVar, true);
        this.zze = zzefVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = context;
        this.zzd = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            if (this.zze.zzW(this.zza, this.zzb)) {
                str3 = this.zzb;
                str2 = this.zza;
                str = this.zze.zzd;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            r.m(this.zzc);
            zzef zzefVar = this.zze;
            zzefVar.zzj = zzefVar.zzf(this.zzc, true);
            if (this.zze.zzj == null) {
                Log.w(this.zze.zzd, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.zzc, ModuleDescriptor.MODULE_ID);
            ((zzcc) r.m(this.zze.zzj)).initialize(F4.b.Z(this.zzc), new zzcl(79000L, Math.max(iA, r0), DynamiteModule.c(this.zzc, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.zzd, AbstractC0728d2.a(this.zzc)), this.zzh);
        } catch (Exception e9) {
            this.zze.zzT(e9, true, false);
        }
    }
}
