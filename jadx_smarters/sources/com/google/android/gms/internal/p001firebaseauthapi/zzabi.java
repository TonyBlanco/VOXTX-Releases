package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0537d;
import H5.T;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabi extends zzacx<Void, T> {
    private final zzxz zzy;

    public zzabi(String str, C0537d c0537d) {
        super(6);
        r.h(str, "token cannot be null or empty");
        this.zzy = new zzxz(str, c0537d);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        zzb(null);
    }
}
