package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0541h;
import H5.C0611b;
import H5.T;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzaba extends zzacx<Void, T> {
    private final zzyd zzy;

    public zzaba(C0541h c0541h, String str) {
        super(2);
        r.n(c0541h, "Credential cannot be null");
        this.zzy = new zzyd(c0541h, str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        C0611b c0611bZza = zzaai.zza(this.zzc, this.zzk);
        if (!this.zzd.L().equalsIgnoreCase(c0611bZza.L())) {
            zza(new Status(17024));
        } else {
            ((T) this.zze).a(this.zzj, c0611bZza);
            zzb(null);
        }
    }
}
