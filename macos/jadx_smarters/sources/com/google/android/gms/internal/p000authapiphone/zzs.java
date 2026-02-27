package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1390u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzs extends zzg {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzs(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzh
    public final void zza(Status status, boolean z9) {
        AbstractC1390u.b(status, Boolean.valueOf(z9), this.zza);
    }
}
