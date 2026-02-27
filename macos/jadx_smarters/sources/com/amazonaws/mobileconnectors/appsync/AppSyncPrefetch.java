package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import B1.c;
import B1.d;
import M1.a;
import okhttp3.Response;
import v1.InterfaceC2868f;

/* JADX INFO: loaded from: classes.dex */
public interface AppSyncPrefetch extends a {

    public static abstract class Callback {
        public void onCanceledError(B1.a aVar) {
            onFailure(aVar);
        }

        public abstract void onFailure(b bVar);

        public void onHttpError(c cVar) {
            onFailure(cVar);
            Response responseB = cVar.b();
            if (responseB != null) {
                responseB.close();
            }
        }

        public void onNetworkError(d dVar) {
            onFailure(dVar);
        }

        public abstract void onSuccess();
    }

    public interface Factory {
        <D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> AppSyncPrefetch prefetch(InterfaceC2868f interfaceC2868f);
    }

    void cancel();

    AppSyncPrefetch clone();

    void enqueue(Callback callback);

    /* synthetic */ boolean isCanceled();

    InterfaceC2868f operation();
}
