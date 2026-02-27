package com.google.android.gms.internal.p001firebaseauthapi;

import G5.F;
import H5.C0611b;
import H5.T;
import H5.d0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzabq extends zzacx<Object, T> {
    private final zzyg zzy;

    public zzabq(F f9, String str) {
        super(2);
        r.m(f9);
        this.zzy = new zzyg(f9, str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "signInWithPhoneNumber";
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
