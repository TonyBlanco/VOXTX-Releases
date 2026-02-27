package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzma implements zzmu {
    private static final zzmg zza = new zzly();
    private final zzmg zzb;

    public zzma() {
        zzmg zzmgVar;
        zzkw zzkwVarZza = zzkw.zza();
        try {
            zzmgVar = (zzmg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzmgVar = zza;
        }
        zzlz zzlzVar = new zzlz(zzkwVarZza, zzmgVar);
        byte[] bArr = zzlj.zzd;
        this.zzb = zzlzVar;
    }

    private static boolean zzb(zzmf zzmfVar) {
        return zzmfVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final zzmt zza(Class cls) {
        zzmn zzmnVarZza;
        zzlw zzlwVarZzc;
        zznk zznkVarZzy;
        zzko zzkoVarZza;
        zzmd zzmdVarZza;
        zznk zznkVarZzy2;
        zzko zzkoVarZza2;
        zzmv.zzC(cls);
        zzmf zzmfVarZzb = this.zzb.zzb(cls);
        if (zzmfVarZzb.zzb()) {
            if (zzlb.class.isAssignableFrom(cls)) {
                zznkVarZzy2 = zzmv.zzz();
                zzkoVarZza2 = zzkq.zzb();
            } else {
                zznkVarZzy2 = zzmv.zzy();
                zzkoVarZza2 = zzkq.zza();
            }
            return zzmm.zzc(zznkVarZzy2, zzkoVarZza2, zzmfVarZzb.zza());
        }
        if (zzlb.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzmfVarZzb);
            zzmnVarZza = zzmo.zzb();
            zzlwVarZzc = zzlw.zzd();
            zznkVarZzy = zzmv.zzz();
            zzkoVarZza = zZzb ? zzkq.zzb() : null;
            zzmdVarZza = zzme.zzb();
        } else {
            boolean zZzb2 = zzb(zzmfVarZzb);
            zzmnVarZza = zzmo.zza();
            zzlwVarZzc = zzlw.zzc();
            zznkVarZzy = zzmv.zzy();
            zzkoVarZza = zZzb2 ? zzkq.zza() : null;
            zzmdVarZza = zzme.zza();
        }
        return zzml.zzl(cls, zzmfVarZzb, zzmnVarZza, zzlwVarZzc, zznkVarZzy, zzkoVarZza, zzmdVarZza);
    }
}
