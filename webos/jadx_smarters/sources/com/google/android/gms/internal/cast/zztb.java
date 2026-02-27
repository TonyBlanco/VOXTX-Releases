package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zztb extends zztd {
    private zztb() {
        super(null);
    }

    public /* synthetic */ zztb(zzta zztaVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast.zztd
    public final void zza(Object obj, long j9) {
        ((zzsp) zzvb.zzf(obj, j9)).zzb();
    }

    @Override // com.google.android.gms.internal.cast.zztd
    public final void zzb(Object obj, Object obj2, long j9) {
        zzsp zzspVarZzg = (zzsp) zzvb.zzf(obj, j9);
        zzsp zzspVar = (zzsp) zzvb.zzf(obj2, j9);
        int size = zzspVarZzg.size();
        int size2 = zzspVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzspVarZzg.zzc()) {
                zzspVarZzg = zzspVarZzg.zzg(size2 + size);
            }
            zzspVarZzg.addAll(zzspVar);
        }
        if (size > 0) {
            zzspVar = zzspVarZzg;
        }
        zzvb.zzs(obj, j9, zzspVar);
    }
}
