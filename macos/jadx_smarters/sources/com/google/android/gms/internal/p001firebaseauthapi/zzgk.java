package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgk extends zzdb {
    private final String zza;

    private zzgk(String str) {
        this.zza = str;
    }

    public static zzgk zza(String str) throws GeneralSecurityException {
        return new zzgk(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgk) {
            return ((zzgk) obj).zza.equals(this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgk.class, this.zza});
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzch
    public final boolean zza() {
        return false;
    }

    public final String zzb() {
        return this.zza;
    }
}
