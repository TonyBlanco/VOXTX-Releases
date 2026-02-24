package com.google.android.gms.internal.appset;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1390u;
import com.google.android.gms.tasks.TaskCompletionSource;
import i4.C1887c;
import i4.C1890f;

/* JADX INFO: loaded from: classes3.dex */
final class zzo extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, C1890f c1890f) {
        AbstractC1390u.b(status, c1890f != null ? new C1887c(c1890f.I(), c1890f.H()) : null, this.zza);
    }
}
