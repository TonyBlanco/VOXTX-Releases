package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1390u;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzt extends zze {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzt(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzf
    public final void zza(Status status, int i9) {
        AbstractC1390u.b(status, Integer.valueOf(i9), this.zza);
    }
}
