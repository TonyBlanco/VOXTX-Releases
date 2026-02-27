package com.google.android.gms.internal.p001firebaseauthapi;

import G5.H;
import G5.J;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabr extends zzacx<Void, H> {
    private final zzyf zzy;

    public zzabr(J j9, String str, String str2, long j10, boolean z9, boolean z10, String str3, String str4, boolean z11) {
        super(8);
        r.m(j9);
        r.g(str);
        this.zzy = new zzyf(j9, str, str2, j10, z9, z10, str3, str4, z11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
    }
}
