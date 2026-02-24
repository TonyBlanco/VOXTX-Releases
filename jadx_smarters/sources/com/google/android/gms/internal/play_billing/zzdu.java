package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class zzdu implements zzep {
    private static final zzea zza = new zzds();
    private final zzea zzb;

    public zzdu() {
        zzea zzeaVar;
        zzcm zzcmVarZza = zzcm.zza();
        try {
            zzeaVar = (zzea) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzeaVar = zza;
        }
        zzdt zzdtVar = new zzdt(zzcmVarZza, zzeaVar);
        byte[] bArr = zzda.zzd;
        this.zzb = zzdtVar;
    }

    private static boolean zzb(zzdz zzdzVar) {
        return zzdzVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final zzeo zza(Class cls) {
        zzei zzeiVarZza;
        zzdq zzdqVarZzc;
        zzff zzffVarZzm;
        zzce zzceVarZza;
        zzdx zzdxVarZza;
        zzff zzffVarZzm2;
        zzce zzceVarZza2;
        zzeq.zzr(cls);
        zzdz zzdzVarZzb = this.zzb.zzb(cls);
        if (zzdzVarZzb.zzb()) {
            if (zzcs.class.isAssignableFrom(cls)) {
                zzffVarZzm2 = zzeq.zzn();
                zzceVarZza2 = zzcg.zzb();
            } else {
                zzffVarZzm2 = zzeq.zzm();
                zzceVarZza2 = zzcg.zza();
            }
            return zzeg.zzc(zzffVarZzm2, zzceVarZza2, zzdzVarZzb.zza());
        }
        if (zzcs.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzdzVarZzb);
            zzeiVarZza = zzej.zzb();
            zzdqVarZzc = zzdq.zzd();
            zzffVarZzm = zzeq.zzn();
            zzceVarZza = zZzb ? zzcg.zzb() : null;
            zzdxVarZza = zzdy.zzb();
        } else {
            boolean zZzb2 = zzb(zzdzVarZzb);
            zzeiVarZza = zzej.zza();
            zzdqVarZzc = zzdq.zzc();
            zzffVarZzm = zzeq.zzm();
            zzceVarZza = zZzb2 ? zzcg.zza() : null;
            zzdxVarZza = zzdy.zza();
        }
        return zzef.zzl(cls, zzdzVarZzb, zzeiVarZza, zzdqVarZzc, zzffVarZzm, zzceVarZza, zzdxVarZza);
    }
}
