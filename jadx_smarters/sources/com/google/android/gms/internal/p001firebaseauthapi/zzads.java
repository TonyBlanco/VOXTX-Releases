package com.google.android.gms.internal.p001firebaseauthapi;

import A5.m;
import G5.F;
import G5.G;
import G5.H;

/* JADX INFO: loaded from: classes3.dex */
final class zzads extends H {
    private final /* synthetic */ H zza;
    private final /* synthetic */ String zzb;

    public zzads(H h9, String str) {
        this.zza = h9;
        this.zzb = str;
    }

    @Override // G5.H
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzadt.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // G5.H
    public final void onCodeSent(String str, G g9) {
        this.zza.onCodeSent(str, g9);
    }

    @Override // G5.H
    public final void onVerificationCompleted(F f9) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(f9);
    }

    @Override // G5.H
    public final void onVerificationFailed(m mVar) {
        zzadt.zza.remove(this.zzb);
        this.zza.onVerificationFailed(mVar);
    }
}
