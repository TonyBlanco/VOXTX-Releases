package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzjm extends zzjo {
    public zzjm(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final double zza(Object obj, long j9) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j9));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final float zzb(Object obj, long j9) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j9));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zzc(Object obj, long j9, boolean z9) {
        if (zzjp.zzb) {
            zzjp.zzD(obj, j9, z9 ? (byte) 1 : (byte) 0);
        } else {
            zzjp.zzE(obj, j9, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zzd(Object obj, long j9, byte b9) {
        if (zzjp.zzb) {
            zzjp.zzD(obj, j9, b9);
        } else {
            zzjp.zzE(obj, j9, b9);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zze(Object obj, long j9, double d9) {
        this.zza.putLong(obj, j9, Double.doubleToLongBits(d9));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final void zzf(Object obj, long j9, float f9) {
        this.zza.putInt(obj, j9, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.recaptcha.internal.zzjo
    public final boolean zzg(Object obj, long j9) {
        return zzjp.zzb ? zzjp.zzt(obj, j9) : zzjp.zzu(obj, j9);
    }
}
