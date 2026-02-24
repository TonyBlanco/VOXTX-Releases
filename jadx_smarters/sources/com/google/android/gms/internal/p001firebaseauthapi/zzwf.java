package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
final class zzwf extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            return zzwt.zza.zza("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
