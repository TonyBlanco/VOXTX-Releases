package com.amazonaws.mobileconnectors.appsync.subscription;

/* JADX INFO: loaded from: classes.dex */
public interface SubscriptionListener<T> {
    void onError(Exception exc);

    void onMessage(T t9);
}
