package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
class zzea extends zzeb {
    final zzdw zzb;
    final Character zzc;

    public zzea(zzdw zzdwVar, Character ch) {
        this.zzb = zzdwVar;
        if (ch != null && zzdwVar.zzd('=')) {
            throw new IllegalArgumentException(zzdl.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public zzea(String str, String str2, Character ch) {
        this(new zzdw(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzea) {
            zzea zzeaVar = (zzea) obj;
            if (this.zzb.equals(zzeaVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzeaVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                str = ".omitPadding()";
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                str = "')";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        zzdw zzdwVar;
        bArr.getClass();
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zzb.zzc(charSequenceZze.length())) {
            throw new zzdz("Invalid input length " + charSequenceZze.length());
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < charSequenceZze.length()) {
            long jZzb = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zzdwVar = this.zzb;
                if (i11 >= zzdwVar.zzc) {
                    break;
                }
                jZzb <<= zzdwVar.zzb;
                if (i9 + i11 < charSequenceZze.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZze.charAt(i12 + i9));
                    i12++;
                }
                i11++;
            }
            int i13 = zzdwVar.zzd;
            int i14 = i13 * 8;
            int i15 = i12 * zzdwVar.zzb;
            int i16 = (i13 - 1) * 8;
            while (i16 >= i14 - i15) {
                bArr[i10] = (byte) ((jZzb >>> i16) & 255);
                i16 -= 8;
                i10++;
            }
            i9 += this.zzb.zzc;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public void zzb(Appendable appendable, byte[] bArr, int i9, int i10) throws IOException {
        int i11 = 0;
        zzdi.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            zzf(appendable, bArr, i11, Math.min(this.zzb.zzd, i10 - i11));
            i11 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public final int zzc(int i9) {
        return (int) (((((long) this.zzb.zzb) * ((long) i9)) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public final int zzd(int i9) {
        zzdw zzdwVar = this.zzb;
        return zzdwVar.zzc * zzed.zza(i9, zzdwVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzeb
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i9, int i10) throws IOException {
        zzdi.zzd(i9, i9 + i10, bArr.length);
        int i11 = 0;
        zzdi.zza(i10 <= this.zzb.zzd);
        long j9 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j9 = (j9 | ((long) (bArr[i9 + i12] & 255))) << 8;
        }
        int i13 = ((i10 + 1) * 8) - this.zzb.zzb;
        while (i11 < i10 * 8) {
            zzdw zzdwVar = this.zzb;
            appendable.append(zzdwVar.zza(zzdwVar.zza & ((int) (j9 >>> (i13 - i11)))));
            i11 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i11 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i11 += this.zzb.zzb;
            }
        }
    }
}
