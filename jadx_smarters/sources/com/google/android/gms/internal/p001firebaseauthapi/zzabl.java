package com.google.android.gms.internal.p001firebaseauthapi;

import H5.C0611b;
import H5.T;
import H5.d0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabl extends zzacx<Object, T> {
    private final zzagu zzy;

    public zzabl(String str, String str2) {
        super(2);
        r.h(str, "token cannot be null or empty");
        this.zzy = new zzagu(str, str2);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "signInWithCustomToken";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        C0611b c0611bZza = zzaai.zza(this.zzc, this.zzk);
        ((T) this.zze).a(this.zzj, c0611bZza);
        zzb(new d0(c0611bZza));
    }
}
