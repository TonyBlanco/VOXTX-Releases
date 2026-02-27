package com.amazonaws.mobileconnectors.appsync.subscription;

/* JADX INFO: loaded from: classes.dex */
public interface SubscriptionClientCallback {
    void onConnect();

    void onError(Exception exc);
}
