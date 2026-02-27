package com.google.android.recaptcha.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class zzdx extends zzea {
    final char[] zza;

    public zzdx(String str, String str2) {
        zzdw zzdwVar = new zzdw("base16()", "0123456789ABCDEF".toCharArray());
        super(zzdwVar, null);
        this.zza = new char[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];
        zzdi.zza(zzdwVar.zzf.length == 16);
        for (int i9 = 0; i9 < 256; i9++) {
            this.zza[i9] = zzdwVar.zza(i9 >>> 4);
            this.zza[i9 | JceEncryptionConstants.SYMMETRIC_KEY_LENGTH] = zzdwVar.zza(i9 & 15);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzea, com.google.android.recaptcha.internal.zzeb
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzdz {
        bArr.getClass();
        if (charSequence.length() % 2 == 1) {
            throw new zzdz("Invalid input length " + charSequence.length());
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < charSequence.length()) {
            bArr[i10] = (byte) ((this.zzb.zzb(charSequence.charAt(i9)) << 4) | this.zzb.zzb(charSequence.charAt(i9 + 1)));
            i9 += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzea, com.google.android.recaptcha.internal.zzeb
    public final void zzb(Appendable appendable, byte[] bArr, int i9, int i10) throws IOException {
        zzdi.zzd(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            appendable.append(this.zza[i12]);
            appendable.append(this.zza[i12 | JceEncryptionConstants.SYMMETRIC_KEY_LENGTH]);
        }
    }
}
