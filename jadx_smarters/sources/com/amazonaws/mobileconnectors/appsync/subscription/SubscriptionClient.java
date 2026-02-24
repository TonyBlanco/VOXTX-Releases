package com.amazonaws.mobileconnectors.appsync.subscription;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface SubscriptionClient {
    void close();

    void connect(SubscriptionClientCallback subscriptionClientCallback);

    Set<String> getTopics();

    void setTransmitting(boolean z9);

    void subscribe(String str, int i9, SubscriptionCallback subscriptionCallback);

    void unsubscribe(String str);
}
