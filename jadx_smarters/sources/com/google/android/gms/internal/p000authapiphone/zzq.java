package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1390u;
import com.google.android.gms.common.api.internal.InterfaceC1365h;
import com.google.android.gms.common.internal.AbstractC1403b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzq extends InterfaceC1365h.a {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1365h
    public final void onResult(Status status) {
        if (status.I() == 6) {
            this.zza.trySetException(AbstractC1403b.a(status));
        } else {
            AbstractC1390u.a(status, this.zza);
        }
    }
}
