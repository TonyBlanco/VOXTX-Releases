package com.amazonaws.mobile.client;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class DummyStore implements KeyValueStore {
    private void throwNotInitializedException() {
        throw new IllegalStateException("AWSMobileClient has not been initialized yet.");
    }

    @Override // com.amazonaws.mobile.client.KeyValueStore
    public void clear() {
        throwNotInitializedException();
    }

    @Override // com.amazonaws.mobile.client.KeyValueStore
    public String get(String str) {
        throwNotInitializedException();
        return null;
    }

    @Override // com.amazonaws.mobile.client.KeyValueStore
    public Map<String, String> get(String... strArr) {
        throwNotInitializedException();
        return null;
    }

    @Override // com.amazonaws.mobile.client.KeyValueStore
    public void set(String str, String str2) {
        throwNotInitializedException();
    }

    @Override // com.amazonaws.mobile.client.KeyValueStore
    public void set(Map<String, String> map) {
        throwNotInitializedException();
    }
}
