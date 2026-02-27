package com.amazonaws.mobileconnectors.appsync;

import D1.a;
import D1.b;
import android.util.Log;
import java.util.concurrent.Executor;
import v1.InterfaceC2868f;
import z1.InterfaceC3002a;

/* JADX INFO: loaded from: classes.dex */
class AppSyncOptimisticUpdateInterceptor implements a {
    private static final String TAG = "AppSyncOptimisticUpdateInterceptor";
    private InterfaceC3002a store;

    @Override // D1.a
    public void dispose() {
    }

    @Override // D1.a
    public void interceptAsync(final a.c cVar, b bVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        if (cVar.f1317e.f()) {
            final InterfaceC2868f.a aVar = (InterfaceC2868f.a) cVar.f1317e.e();
            executor.execute(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncOptimisticUpdateInterceptor.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Log.v(AppSyncOptimisticUpdateInterceptor.TAG, "Thread:[" + Thread.currentThread().getId() + "]: Updating store with the optimistic update for [" + cVar.f1314b + "]");
                        AppSyncOptimisticUpdateInterceptor.this.store.i(cVar.f1314b, aVar).c();
                    } catch (Exception unused) {
                        Log.e(AppSyncOptimisticUpdateInterceptor.TAG, "Thread:[" + Thread.currentThread().getId() + "]: failed to update store with optimistic update for: [" + cVar.f1314b + "]");
                    }
                }
            });
        }
        bVar.a(cVar, executor, interfaceC0015a);
    }

    public void setStore(InterfaceC3002a interfaceC3002a) {
        this.store = interfaceC3002a;
    }
}
