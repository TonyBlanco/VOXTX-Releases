package com.amazonaws.mobileconnectors.appsync;

import u1.InterfaceC2844c;
import v1.InterfaceC2867e;
import v1.InterfaceC2868f;
import v1.InterfaceC2869g;
import v1.h;
import y1.C2982a;

/* JADX INFO: loaded from: classes.dex */
public interface AppSyncMutationCall<T> extends InterfaceC2844c {

    public interface Factory {
        <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncMutationCall<T> mutate(InterfaceC2867e interfaceC2867e);

        <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncMutationCall<T> mutate(InterfaceC2867e interfaceC2867e, D d9);
    }

    AppSyncMutationCall<T> cacheHeaders(C2982a c2982a);

    /* JADX INFO: renamed from: cacheHeaders */
    /* synthetic */ InterfaceC2844c mo0cacheHeaders(C2982a c2982a);

    /* synthetic */ void cancel();

    AppSyncMutationCall<T> clone();

    /* JADX INFO: renamed from: clone */
    /* synthetic */ InterfaceC2844c mo1clone();

    /* synthetic */ void enqueue(InterfaceC2844c.a aVar);

    /* synthetic */ boolean isCanceled();

    /* synthetic */ InterfaceC2868f operation();

    AppSyncMutationCall<T> refetchQueries(InterfaceC2869g... interfaceC2869gArr);

    AppSyncMutationCall<T> refetchQueries(h... hVarArr);
}
