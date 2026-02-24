package com.amazonaws.mobileconnectors.appsync.subscription;

/* JADX INFO: loaded from: classes.dex */
public interface SubscriptionCallback {
    void onError(String str, Exception exc);

    void onMessage(String str, String str2);
}
