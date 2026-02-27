package com.amazonaws.mobileconnectors.appsync;

/* JADX INFO: loaded from: classes.dex */
public interface PersistentMutationsCallback {
    void onFailure(PersistentMutationsError persistentMutationsError);

    void onResponse(PersistentMutationsResponse persistentMutationsResponse);
}
