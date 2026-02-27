package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzlz implements zzll {
    private final zzxt zza;
    private final zzxt zzb;

    private zzlz(byte[] bArr, byte[] bArr2) {
        this.zza = zzxt.zza(bArr);
        this.zzb = zzxt.zza(bArr2);
    }

    public static zzlz zza(byte[] bArr) throws GeneralSecurityException {
        return new zzlz(bArr, zzxr.zza(bArr));
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzll
    public final zzxt zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzll
    public final zzxt zzb() {
        return this.zzb;
    }
}
