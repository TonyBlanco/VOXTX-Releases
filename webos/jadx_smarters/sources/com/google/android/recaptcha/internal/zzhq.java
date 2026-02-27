package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzhq implements zzim {
    private static final zzhw zza = new zzho();
    private final zzhw zzb;

    public zzhq() {
        zzhw zzhwVar;
        zzgh zzghVarZza = zzgh.zza();
        try {
            zzhwVar = (zzhw) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzhwVar = zza;
        }
        zzhp zzhpVar = new zzhp(zzghVarZza, zzhwVar);
        byte[] bArr = zzgw.zzd;
        this.zzb = zzhpVar;
    }

    private static boolean zzb(zzhv zzhvVar) {
        return zzhvVar.zzc() == 1;
    }

    @Override // com.google.android.recaptcha.internal.zzim
    public final zzil zza(Class cls) {
        zzie zzieVarZza;
        zzhm zzhmVarZzd;
        zzjf zzjfVarZzz;
        zzga zzgaVarZza;
        zzht zzhtVarZza;
        zzjf zzjfVarZzy;
        zzga zzgaVarZza2;
        zzin.zzF(cls);
        zzhv zzhvVarZzb = this.zzb.zzb(cls);
        if (zzhvVarZzb.zzb()) {
            if (zzgo.class.isAssignableFrom(cls)) {
                zzjfVarZzy = zzin.zzA();
                zzgaVarZza2 = zzgc.zzb();
            } else {
                zzjfVarZzy = zzin.zzy();
                zzgaVarZza2 = zzgc.zza();
            }
            return zzic.zzc(zzjfVarZzy, zzgaVarZza2, zzhvVarZzb.zza());
        }
        if (zzgo.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzhvVarZzb);
            zzieVarZza = zzif.zzb();
            zzhmVarZzd = zzhm.zze();
            zzjfVarZzz = zzin.zzA();
            zzgaVarZza = zZzb ? zzgc.zzb() : null;
            zzhtVarZza = zzhu.zzb();
        } else {
            boolean zZzb2 = zzb(zzhvVarZzb);
            zzieVarZza = zzif.zza();
            zzhmVarZzd = zzhm.zzd();
            if (zZzb2) {
                zzjfVarZzz = zzin.zzy();
                zzgaVarZza = zzgc.zza();
            } else {
                zzjfVarZzz = zzin.zzz();
                zzgaVarZza = null;
            }
            zzhtVarZza = zzhu.zza();
        }
        return zzib.zzm(cls, zzhvVarZzb, zzieVarZza, zzhmVarZzd, zzjfVarZzz, zzgaVarZza, zzhtVarZza);
    }
}
