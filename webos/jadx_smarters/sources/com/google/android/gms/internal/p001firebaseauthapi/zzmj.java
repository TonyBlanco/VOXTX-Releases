package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzmj {
    static final zzmj zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmj(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzmj(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
