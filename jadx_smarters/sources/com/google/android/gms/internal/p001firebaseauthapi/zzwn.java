package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwn {
    private ECPrivateKey zza;

    public zzwn(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i9, zzwr zzwrVar) throws GeneralSecurityException {
        byte[] bArrZza = zzwg.zza(bArr, zzwp.zza(this.zza, zzwp.zza(this.zza.getParams(), zzwrVar, bArr)));
        Mac macZza = zzwt.zzb.zza(str);
        if (i9 > macZza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            macZza.init(new SecretKeySpec(new byte[macZza.getMacLength()], str));
        } else {
            macZza.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArrDoFinal = macZza.doFinal(bArrZza);
        byte[] bArr4 = new byte[i9];
        macZza.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int i10 = 1;
        int length = 0;
        while (true) {
            macZza.update(bArrDoFinal2);
            macZza.update(bArr3);
            macZza.update((byte) i10);
            bArrDoFinal2 = macZza.doFinal();
            if (bArrDoFinal2.length + length >= i9) {
                System.arraycopy(bArrDoFinal2, 0, bArr4, length, i9 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal2, 0, bArr4, length, bArrDoFinal2.length);
            length += bArrDoFinal2.length;
            i10++;
        }
    }
}
