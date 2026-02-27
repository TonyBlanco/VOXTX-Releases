package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import M1.a;
import v1.InterfaceC2868f;
import v1.i;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public interface AppSyncSubscriptionCall<T> extends a {

    public interface Callback<T> {
        void onCompleted();

        void onFailure(b bVar);

        void onResponse(i iVar);
    }

    public interface Factory {
        <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncSubscriptionCall<T> subscribe(t tVar);
    }

    public interface StartedCallback<T> extends Callback<T> {
        void onStarted();
    }

    /* synthetic */ void cancel();

    AppSyncSubscriptionCall<T> clone();

    void execute(Callback<T> callback);

    /* synthetic */ boolean isCanceled();
}
