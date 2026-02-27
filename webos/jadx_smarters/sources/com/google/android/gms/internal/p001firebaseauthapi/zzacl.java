package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public class zzacl {
    final zzact zza;
    private final String zzb;

    public zzacl(String str, zzact zzactVar) {
        this.zzb = str;
        this.zza = zzactVar;
    }

    public final String zza(String str, String str2) {
        return this.zzb + str + "?key=" + str2;
    }
}
