package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class zzou {
    private static final ThreadLocal<SecureRandom> zza = new zzot();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom secureRandomZzc = zzc();
        secureRandomZzc.nextLong();
        return secureRandomZzc;
    }

    public static byte[] zza(int i9) {
        byte[] bArr = new byte[i9];
        zza.get().nextBytes(bArr);
        return bArr;
    }

    private static Provider zzb() throws GeneralSecurityException {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e9) {
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e9);
        }
    }

    private static SecureRandom zzc() {
        try {
            try {
                try {
                    try {
                        return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                    } catch (GeneralSecurityException unused) {
                        return new SecureRandom();
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            }
        } catch (GeneralSecurityException unused4) {
            return SecureRandom.getInstance("SHA1PRNG", zzb());
        }
    }
}
