package com.google.android.gms.internal.cast;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzuy extends zzva {
    public zzuy(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final double zza(Object obj, long j9) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j9));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final float zzb(Object obj, long j9) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j9));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.cast.zzvb.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.cast.zzvb.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z9' boolean)' in method call: com.google.android.gms.internal.cast.zzvb.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z9' boolean)' in method call: com.google.android.gms.internal.cast.zzvb.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.cast.zzva
    public final void zzc(Object obj, long j9, boolean z9) {
        if (zzvb.zzb) {
            zzvb.zzi(obj, j9, z9);
        } else {
            zzvb.zzj(obj, j9, z9);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zzd(Object obj, long j9, byte b9) {
        if (zzvb.zzb) {
            zzvb.zzD(obj, j9, b9);
        } else {
            zzvb.zzE(obj, j9, b9);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zze(Object obj, long j9, double d9) {
        this.zza.putLong(obj, j9, Double.doubleToLongBits(d9));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final void zzf(Object obj, long j9, float f9) {
        this.zza.putInt(obj, j9, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.cast.zzva
    public final boolean zzg(Object obj, long j9) {
        return zzvb.zzb ? zzvb.zzt(obj, j9) : zzvb.zzu(obj, j9);
    }
}
