package com.google.android.gms.internal.p001firebaseauthapi;

import G5.AbstractC0540g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes3.dex */
public final class zzade<ResultT, CallbackT> implements zzacv<ResultT> {
    private final zzacx<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzade(zzacx<ResultT, CallbackT> zzacxVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzacxVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacv
    public final void zza(ResultT resultt, Status status) {
        r.n(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzacx<ResultT, CallbackT> zzacxVar = this.zza;
        if (zzacxVar.zzs != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzacxVar.zzc);
            zzacx<ResultT, CallbackT> zzacxVar2 = this.zza;
            taskCompletionSource.setException(zzacf.zza(firebaseAuth, zzacxVar2.zzs, ("reauthenticateWithCredential".equals(zzacxVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC0540g abstractC0540g = zzacxVar.zzp;
        if (abstractC0540g != null) {
            this.zzb.setException(zzacf.zza(status, abstractC0540g, zzacxVar.zzq, zzacxVar.zzr));
        } else {
            this.zzb.setException(zzacf.zza(status));
        }
    }
}
