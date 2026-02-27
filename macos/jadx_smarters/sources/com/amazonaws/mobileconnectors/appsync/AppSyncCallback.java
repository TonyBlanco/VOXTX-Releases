package com.amazonaws.mobileconnectors.appsync;

import B1.b;
import B1.c;
import B1.d;
import B1.e;
import android.os.Handler;
import android.os.Looper;
import u1.InterfaceC2844c;
import v1.i;
import x1.g;

/* JADX INFO: loaded from: classes.dex */
public final class AppSyncCallback<T> extends InterfaceC2844c.a {
    private final InterfaceC2844c.a delegate;
    private final Handler handler;

    public AppSyncCallback(InterfaceC2844c.a aVar, Handler handler) {
        this.delegate = (InterfaceC2844c.a) g.c(aVar, "callback == null");
        this.handler = (Handler) g.c(handler, "handler == null");
    }

    public static <T> AppSyncCallback<T> wrap(InterfaceC2844c.a aVar, Handler handler) {
        return new AppSyncCallback<>(aVar, handler);
    }

    @Override // u1.InterfaceC2844c.a
    public void onFailure(final b bVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCallback.3
            @Override // java.lang.Runnable
            public void run() {
                AppSyncCallback.this.delegate.onFailure(bVar);
            }
        });
    }

    @Override // u1.InterfaceC2844c.a
    public void onHttpError(final c cVar) {
        if (Looper.getMainLooper() == this.handler.getLooper()) {
            this.delegate.onHttpError(cVar);
        } else {
            this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCallback.4
                @Override // java.lang.Runnable
                public void run() {
                    AppSyncCallback.this.delegate.onHttpError(cVar);
                }
            });
        }
    }

    @Override // u1.InterfaceC2844c.a
    public void onNetworkError(final d dVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCallback.5
            @Override // java.lang.Runnable
            public void run() {
                AppSyncCallback.this.delegate.onNetworkError(dVar);
            }
        });
    }

    @Override // u1.InterfaceC2844c.a
    public void onParseError(final e eVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCallback.6
            @Override // java.lang.Runnable
            public void run() {
                AppSyncCallback.this.delegate.onParseError(eVar);
            }
        });
    }

    @Override // u1.InterfaceC2844c.a
    public void onResponse(final i iVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCallback.1
            @Override // java.lang.Runnable
            public void run() {
                AppSyncCallback.this.delegate.onResponse(iVar);
            }
        });
    }

    @Override // u1.InterfaceC2844c.a
    public void onStatusEvent(final InterfaceC2844c.b bVar) {
        this.handler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.AppSyncCallback.2
            @Override // java.lang.Runnable
            public void run() {
                AppSyncCallback.this.delegate.onStatusEvent(bVar);
            }
        });
    }
}
