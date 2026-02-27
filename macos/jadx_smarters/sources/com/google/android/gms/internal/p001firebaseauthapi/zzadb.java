package com.google.android.gms.internal.p001firebaseauthapi;

import G5.F;
import G5.H;

/* JADX INFO: loaded from: classes3.dex */
final class zzadb implements zzadf {
    private final /* synthetic */ F zza;

    public zzadb(zzacz zzaczVar, F f9) {
        this.zza = f9;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadf
    public final void zza(H h9, Object... objArr) {
        h9.onVerificationCompleted(this.zza);
    }
}
