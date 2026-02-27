package com.amazonaws.mobileconnectors.appsync;

import C1.a;
import u1.InterfaceC2844c;
import v1.InterfaceC2868f;
import v1.h;
import w1.AbstractC2902b;
import y1.C2982a;

/* JADX INFO: loaded from: classes.dex */
public interface AppSyncQueryCall<T> extends InterfaceC2844c {

    public interface Factory {
        <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncQueryCall<T> query(h hVar);
    }

    /* JADX INFO: renamed from: cacheHeaders */
    AppSyncQueryCall<T> mo0cacheHeaders(C2982a c2982a);

    /* synthetic */ InterfaceC2844c cacheHeaders(C2982a c2982a);

    /* synthetic */ void cancel();

    /* JADX INFO: renamed from: clone */
    AppSyncQueryCall<T> mo1clone();

    /* synthetic */ InterfaceC2844c clone();

    /* synthetic */ void enqueue(InterfaceC2844c.a aVar);

    AppSyncQueryCall<T> httpCachePolicy(AbstractC2902b.c cVar);

    /* synthetic */ boolean isCanceled();

    @Override // u1.InterfaceC2844c, com.amazonaws.mobileconnectors.appsync.AppSyncMutationCall
    /* synthetic */ InterfaceC2868f operation();

    AppSyncQueryCall<T> responseFetcher(a aVar);

    AppSyncQueryWatcher<T> watcher();
}
