package com.google.android.gms.internal.p001firebaseauthapi;

import H5.C0620k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabs extends zzacx<zzagj, Void> {
    private final zzagm zzy;

    public zzabs(C0620k c0620k, String str) {
        super(12);
        r.m(c0620k);
        this.zzy = zzagm.zza(r.g(c0620k.H()), str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        zzb(this.zzv);
    }
}
