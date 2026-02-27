package com.google.android.gms.internal.cast;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zztt implements zzua {
    private final zztp zza;
    private final zzur zzb;
    private final boolean zzc;
    private final zzrx zzd;

    private zztt(zzur zzurVar, zzrx zzrxVar, zztp zztpVar) {
        this.zzb = zzurVar;
        this.zzc = zzrxVar.zzc(zztpVar);
        this.zzd = zzrxVar;
        this.zza = zztpVar;
    }

    public static zztt zzi(zzur zzurVar, zzrx zzrxVar, zztp zztpVar) {
        return new zztt(zzurVar, zzrxVar, zztpVar);
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final int zza(Object obj) {
        zzur zzurVar = this.zzb;
        int iZzb = zzurVar.zzb(zzurVar.zzc(obj));
        if (!this.zzc) {
            return iZzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final int zzb(Object obj) {
        int iHashCode = this.zzb.zzc(obj).hashCode();
        if (!this.zzc) {
            return iHashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final Object zzc() {
        zztp zztpVar = this.zza;
        return zztpVar instanceof zzsh ? ((zzsh) zztpVar).zzw() : zztpVar.zzB().zzr();
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final void zzd(Object obj) {
        this.zzb.zze(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final void zze(Object obj, Object obj2) {
        zzuc.zzB(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final void zzf(Object obj, zzvi zzviVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final boolean zzg(Object obj, Object obj2) {
        if (!this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.cast.zzua
    public final boolean zzh(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
