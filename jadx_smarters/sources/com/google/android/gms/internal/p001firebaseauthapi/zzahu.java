package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzahu {
    private final zzaik zza;
    private final byte[] zzb;

    private zzahu(int i9) {
        byte[] bArr = new byte[i9];
        this.zzb = bArr;
        this.zza = zzaik.zzb(bArr);
    }

    public final zzahp zza() {
        this.zza.zzb();
        return new zzahz(this.zzb);
    }

    public final zzaik zzb() {
        return this.zza;
    }
}
