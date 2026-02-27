package com.amazonaws.mobileconnectors.appsync;

import M1.a;
import u1.InterfaceC2844c;
import v1.InterfaceC2868f;

/* JADX INFO: loaded from: classes.dex */
public interface AppSyncQueryWatcher<T> extends a {
    void cancel();

    AppSyncQueryWatcher<T> enqueueAndWatch(InterfaceC2844c.a aVar);

    /* synthetic */ boolean isCanceled();

    InterfaceC2868f operation();

    void refetch();

    AppSyncQueryWatcher<T> refetchResponseFetcher(C1.a aVar);
}
