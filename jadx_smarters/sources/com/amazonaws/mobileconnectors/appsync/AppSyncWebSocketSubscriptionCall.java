package com.amazonaws.mobileconnectors.appsync;

import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import v1.InterfaceC2868f;
import v1.InterfaceC2868f.a;
import v1.InterfaceC2868f.b;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
final class AppSyncWebSocketSubscriptionCall<D extends InterfaceC2868f.a, T, V extends InterfaceC2868f.b> implements AppSyncSubscriptionCall<T> {
    private final t subscription;
    private String subscriptionId;
    private final WebSocketConnectionManager websocketConnectionManager;
    private boolean isCanceled = false;
    private AppSyncSubscriptionCall.Callback<T> callback = null;

    public AppSyncWebSocketSubscriptionCall(t tVar, WebSocketConnectionManager webSocketConnectionManager) {
        this.subscription = tVar;
        this.websocketConnectionManager = webSocketConnectionManager;
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public synchronized void cancel() {
        this.isCanceled = true;
        this.websocketConnectionManager.releaseSubscription(this.subscriptionId);
        this.callback.onCompleted();
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppSyncSubscriptionCall<T> m6clone() {
        return new AppSyncWebSocketSubscriptionCall(this.subscription, this.websocketConnectionManager);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public synchronized void execute(AppSyncSubscriptionCall.Callback<T> callback) {
        if (this.callback != null) {
            throw new IllegalStateException("Subscription call has already been executed.");
        }
        this.callback = callback;
        this.subscriptionId = this.websocketConnectionManager.requestSubscription(this.subscription, callback);
    }

    @Override // com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall
    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }
}
