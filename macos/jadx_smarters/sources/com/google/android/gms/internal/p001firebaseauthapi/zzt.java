package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
final class zzt extends zzp {
    private final Matcher zza;

    public zzt(Matcher matcher) {
        this.zza = (Matcher) zzy.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzp
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzp
    public final boolean zza(int i9) {
        return this.zza.find(i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzp
    public final int zzb() {
        return this.zza.start();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzp
    public final boolean zzc() {
        return this.zza.matches();
    }
}
