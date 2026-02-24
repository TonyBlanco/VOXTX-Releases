package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzac implements zzah {
    private final /* synthetic */ zzs zza;

    public zzac(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzah
    public final /* synthetic */ Iterator zza(zzab zzabVar, CharSequence charSequence) {
        return new zzaf(this, zzabVar, charSequence, this.zza.zza(charSequence));
    }
}
