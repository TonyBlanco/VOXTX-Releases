package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzqi extends zzqg implements InterfaceFutureC2987b {
    @Override // y5.InterfaceFutureC2987b
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.cast.zzqg
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract InterfaceFutureC2987b zzc();
}
