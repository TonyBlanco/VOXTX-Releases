package com.google.android.gms.internal.p001firebaseauthapi;

import G5.H;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class zzadd implements zzadf {
    private final /* synthetic */ Status zza;

    public zzadd(zzacz zzaczVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadf
    public final void zza(H h9, Object... objArr) {
        h9.onVerificationFailed(zzacf.zza(this.zza));
    }
}
