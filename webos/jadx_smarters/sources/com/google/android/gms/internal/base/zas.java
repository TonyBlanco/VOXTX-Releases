package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zas implements zaq {
    private zas() {
    }

    public /* synthetic */ zas(zar zarVar) {
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zaa(ThreadFactory threadFactory, int i9) {
        return zac(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zab(int i9, int i10) {
        return zac(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final ExecutorService zac(int i9, ThreadFactory threadFactory, int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i9, i9, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
