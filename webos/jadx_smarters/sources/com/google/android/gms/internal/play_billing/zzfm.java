package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzfm extends zzfo {
    public zzfm(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final double zza(Object obj, long j9) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final float zzb(Object obj, long j9) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzc(Object obj, long j9, boolean z9) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j9, z9 ? (byte) 1 : (byte) 0);
        } else {
            zzfp.zzE(obj, j9, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzd(Object obj, long j9, byte b9) {
        if (zzfp.zzb) {
            zzfp.zzD(obj, j9, b9);
        } else {
            zzfp.zzE(obj, j9, b9);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zze(Object obj, long j9, double d9) {
        this.zza.putLong(obj, j9, Double.doubleToLongBits(d9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final void zzf(Object obj, long j9, float f9) {
        this.zza.putInt(obj, j9, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.play_billing.zzfo
    public final boolean zzg(Object obj, long j9) {
        return zzfp.zzb ? zzfp.zzt(obj, j9) : zzfp.zzu(obj, j9);
    }
}
