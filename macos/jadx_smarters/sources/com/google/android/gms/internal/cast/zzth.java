package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzth implements zzub {
    private static final zztn zza = new zztf();
    private final zztn zzb;

    public zzth() {
        zztn zztnVar;
        zzsd zzsdVarZza = zzsd.zza();
        try {
            zztnVar = (zztn) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zztnVar = zza;
        }
        zztg zztgVar = new zztg(zzsdVarZza, zztnVar);
        byte[] bArr = zzsq.zzd;
        this.zzb = zztgVar;
    }

    private static boolean zzb(zztm zztmVar) {
        return zztmVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.cast.zzub
    public final zzua zza(Class cls) {
        zztu zztuVarZza;
        zztd zztdVarZzc;
        zzur zzurVarZzz;
        zzrx zzrxVarZza;
        zztk zztkVarZza;
        zzur zzurVarZzy;
        zzrx zzrxVarZza2;
        zzuc.zzC(cls);
        zztm zztmVarZzb = this.zzb.zzb(cls);
        if (zztmVarZzb.zzb()) {
            if (zzsh.class.isAssignableFrom(cls)) {
                zzurVarZzy = zzuc.zzA();
                zzrxVarZza2 = zzrz.zzb();
            } else {
                zzurVarZzy = zzuc.zzy();
                zzrxVarZza2 = zzrz.zza();
            }
            return zztt.zzi(zzurVarZzy, zzrxVarZza2, zztmVarZzb.zza());
        }
        if (zzsh.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zztmVarZzb);
            zztuVarZza = zztv.zzb();
            zztdVarZzc = zztd.zzd();
            zzurVarZzz = zzuc.zzA();
            zzrxVarZza = zZzb ? zzrz.zzb() : null;
            zztkVarZza = zztl.zzb();
        } else {
            boolean zZzb2 = zzb(zztmVarZzb);
            zztuVarZza = zztv.zza();
            zztdVarZzc = zztd.zzc();
            if (zZzb2) {
                zzurVarZzz = zzuc.zzy();
                zzrxVarZza = zzrz.zza();
            } else {
                zzurVarZzz = zzuc.zzz();
                zzrxVarZza = null;
            }
            zztkVarZza = zztl.zza();
        }
        return zzts.zzi(cls, zztmVarZzb, zztuVarZza, zztdVarZzc, zzurVarZzz, zzrxVarZza, zztkVarZza);
    }
}
