package com.amazonaws.mobileconnectors.appsync;

/* JADX INFO: loaded from: classes.dex */
public class ConflictMutation {
    final String mutationId;
    final int retryCount;

    public ConflictMutation(String str, int i9) {
        this.mutationId = str;
        this.retryCount = i9;
    }
}
