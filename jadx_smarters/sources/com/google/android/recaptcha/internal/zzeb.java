package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzeb {
    private static final zzeb zza = new zzdy("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzeb zzb = new zzdy("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzeb zzc = new zzea("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzeb zzd = new zzea("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzeb zze = new zzdx("base16()", "0123456789ABCDEF");

    public static zzeb zzg() {
        return zza;
    }

    public static zzeb zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzdz;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i9, int i10) throws IOException;

    public abstract int zzc(int i9);

    public abstract int zzd(int i9);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i9, int i10) {
        zzdi.zzd(0, i10, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i10));
        try {
            zzb(sb, bArr, 0, i10);
            return sb.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzdz e9) {
            throw new IllegalArgumentException(e9);
        }
    }
}
