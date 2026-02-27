package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0541h;
import H5.C0611b;
import H5.T;
import H5.d0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabn extends zzacx<Object, T> {
    private final zzyd zzy;

    public zzabn(C0541h c0541h, String str) {
        super(2);
        r.n(c0541h, "credential cannot be null");
        this.zzy = new zzyd(c0541h, str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "sendSignInLinkToEmail";
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
