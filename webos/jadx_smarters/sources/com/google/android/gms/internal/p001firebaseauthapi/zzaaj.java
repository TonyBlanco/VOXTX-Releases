package com.google.android.gms.internal.p001firebaseauthapi;

import H5.T;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzaaj extends zzacx<Void, T> {
    private final zzxv zzy;

    public zzaaj(String str, String str2, String str3) {
        super(4);
        r.h(str, "code cannot be null or empty");
        r.h(str2, "new password cannot be null or empty");
        this.zzy = new zzxv(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "confirmPasswordReset";
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
