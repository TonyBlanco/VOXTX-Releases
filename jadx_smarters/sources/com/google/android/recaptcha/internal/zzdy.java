package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdy extends zzea {
    public zzdy(String str, String str2, Character ch) {
        zzdw zzdwVar = new zzdw(str, str2.toCharArray());
        super(zzdwVar, ch);
        zzdi.zza(zzdwVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzea, com.google.android.recaptcha.internal.zzeb
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        bArr.getClass();
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zzb.zzc(charSequenceZze.length())) {
            throw new zzdz("Invalid input length " + charSequenceZze.length());
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < charSequenceZze.length()) {
            int i11 = i10 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZze.charAt(i9)) << 18) | (this.zzb.zzb(charSequenceZze.charAt(i9 + 1)) << 12);
            bArr[i10] = (byte) (iZzb >>> 16);
            int i12 = i9 + 2;
            if (i12 < charSequenceZze.length()) {
                int i13 = i9 + 3;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZze.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iZzb2 >>> 8) & 255);
                if (i13 < charSequenceZze.length()) {
                    i9 += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZze.charAt(i13))) & 255);
                } else {
                    i10 = i14;
                    i9 = i13;
                }
            } else {
                i9 = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzea, com.google.android.recaptcha.internal.zzeb
    public final void zzb(Appendable appendable, byte[] bArr, int i9, int i10) throws IOException {
        int i11 = 0;
        zzdi.zzd(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = bArr[i11] & 255;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | (i13 << 16) | (bArr[i11 + 2] & 255);
            appendable.append(this.zzb.zza(i14 >>> 18));
            appendable.append(this.zzb.zza((i14 >>> 12) & 63));
            appendable.append(this.zzb.zza((i14 >>> 6) & 63));
            appendable.append(this.zzb.zza(i14 & 63));
            i11 += 3;
        }
        if (i11 < i10) {
            zzf(appendable, bArr, i11, i10 - i11);
        }
    }
}
