package com.google.android.gms.internal.p001firebaseauthapi;

import G5.H;

/* JADX INFO: loaded from: classes3.dex */
final class zzada implements zzadf {
    private final /* synthetic */ String zza;

    public zzada(zzacz zzaczVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadf
    public final void zza(H h9, Object... objArr) {
        h9.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
