package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import B1.c;
import B1.d;
import android.os.Handler;
import com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch;
import x1.g;

/* JADX INFO: loaded from: classes.dex */
public final class AppSyncPrefetchCallback extends AppSyncPrefetch.Callback {
    private final AppSyncPrefetch.Callback delegate;
    private final Handler handler;

    public AppSyncPrefetchCallback(AppSyncPrefetch.Callback callback, Handler handler) {
        this.delegate = (AppSyncPrefetch.Callback) g.c(callback, "callback == null");
        this.handler = (Handler) g.c(handler, "handler == null");
    }

    public static <T> AppSyncPrefetchCallback wrap(AppSyncPrefetch.Callback callback, Handler handler) {
        return new AppSyncPrefetchCallback(callback, handler);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch.Callback
    public void onFailure(final b bVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncPrefetchCallback.2
            @Override // java.lang.Runnable
            public void run() {
                AppSyncPrefetchCallback.this.delegate.onFailure(bVar);
            }
        });
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch.Callback
    public void onHttpError(final c cVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncPrefetchCallback.3
            @Override // java.lang.Runnable
            public void run() {
                AppSyncPrefetchCallback.this.delegate.onHttpError(cVar);
            }
        });
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch.Callback
    public void onNetworkError(final d dVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncPrefetchCallback.4
            @Override // java.lang.Runnable
            public void run() {
                AppSyncPrefetchCallback.this.delegate.onNetworkError(dVar);
            }
        });
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncPrefetch.Callback
    public void onSuccess() {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncPrefetchCallback.1
            @Override // java.lang.Runnable
            public void run() {
                AppSyncPrefetchCallback.this.delegate.onSuccess();
            }
        });
    }
}
