package com.google.android.gms.internal.p001firebaseauthapi;

import G5.A;
import H5.T;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
final class zzaan extends zzacx<Void, T> {
    private final String zzaa;
    private final String zzab;
    private final A zzy;
    private final String zzz;

    public zzaan(A a9, String str, String str2, String str3) {
        super(2);
        AbstractC1617D.a(r.m(a9));
        this.zzz = r.g(str);
        this.zzaa = str2;
        this.zzab = str3;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza((A) null, this.zzz, this.zzaa, this.zzab, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        ((T) this.zze).a(this.zzj, zzaai.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
