package com.google.android.gms.internal.p001firebaseauthapi;

import G5.A;
import G5.AbstractC0553u;
import H5.C0611b;
import H5.T;
import H5.d0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import d.AbstractC1617D;

/* JADX INFO: loaded from: classes3.dex */
final class zzaaq extends zzacx<Object, T> {
    private final String zzaa;
    private final A zzy;
    private final String zzz;

    public zzaaq(A a9, String str, String str2) {
        super(2);
        AbstractC1617D.a(r.m(a9));
        this.zzz = r.g(str);
        this.zzaa = str2;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadj
    public final void zza(TaskCompletionSource taskCompletionSource, zzacg zzacgVar) {
        this.zzg = new zzade(this, taskCompletionSource);
        zzacgVar.zza(this.zzz, (A) null, this.zzaa, this.zzb);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacx
    public final void zzb() {
        C0611b c0611bZza = zzaai.zza(this.zzc, this.zzk);
        AbstractC0553u abstractC0553u = this.zzd;
        if (abstractC0553u != null && !abstractC0553u.L().equalsIgnoreCase(c0611bZza.L())) {
            zza(new Status(17024));
        } else {
            ((T) this.zze).a(this.zzj, c0611bZza);
            zzb(new d0(c0611bZza));
        }
    }
}
