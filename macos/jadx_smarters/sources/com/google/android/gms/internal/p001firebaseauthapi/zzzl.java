package com.google.android.gms.internal.p001firebaseauthapi;

import H5.AbstractC0622m;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes3.dex */
final class zzzl implements zzadk<zzagj> {
    private final /* synthetic */ zzagg zza;
    private final /* synthetic */ zzacd zzb;

    public zzzl(zzyj zzyjVar, zzagg zzaggVar, zzacd zzacdVar) {
        this.zza = zzaggVar;
        this.zzb = zzacdVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagj zzagjVar) {
        zzagj zzagjVar2 = zzagjVar;
        zzagg zzaggVar = this.zza;
        if (zzaggVar instanceof zzagk) {
            this.zzb.zzb(zzagjVar2.zza());
            return;
        }
        if (zzaggVar instanceof zzagm) {
            this.zzb.zza(zzagjVar2);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + InstructionFileId.DOT);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(AbstractC0622m.a(str));
    }
}
