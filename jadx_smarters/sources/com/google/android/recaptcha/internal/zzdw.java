package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzdw {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzdw(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i9 = 0; i9 < cArr.length; i9++) {
            char c9 = cArr[i9];
            boolean z9 = true;
            zzdi.zzc(c9 < 128, "Non-ASCII character: %s", c9);
            if (bArr[c9] != -1) {
                z9 = false;
            }
            zzdi.zzc(z9, "Duplicate character: %s", c9);
            bArr[c9] = (byte) i9;
        }
        this(str, cArr, bArr, false);
    }

    private zzdw(String str, char[] cArr, byte[] bArr, boolean z9) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzed.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i9 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i9;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i9];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzed.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e9) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdw) {
            zzdw zzdwVar = (zzdw) obj;
            boolean z9 = zzdwVar.zzi;
            if (Arrays.equals(this.zzf, zzdwVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i9) {
        return this.zzf[i9];
    }

    public final int zzb(char c9) throws zzdz {
        if (c9 > 127) {
            throw new zzdz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c9))));
        }
        byte b9 = this.zzg[c9];
        if (b9 != -1) {
            return b9;
        }
        if (c9 <= ' ' || c9 == 127) {
            throw new zzdz("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c9))));
        }
        throw new zzdz("Unrecognized character: " + c9);
    }

    public final boolean zzc(int i9) {
        return this.zzh[i9 % this.zzc];
    }

    public final boolean zzd(char c9) {
        return this.zzg[61] != -1;
    }
}
