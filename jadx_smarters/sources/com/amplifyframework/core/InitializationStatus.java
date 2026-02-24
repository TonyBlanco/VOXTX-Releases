package com.amplifyframework.core;

/* JADX INFO: loaded from: classes.dex */
public enum InitializationStatus {
    SUCCEEDED,
    FAILED;

    public static InitializationStatus fromString(String str) {
        for (InitializationStatus initializationStatus : values()) {
            if (initializationStatus.toString().equals(str)) {
                return initializationStatus;
            }
        }
        throw new IllegalArgumentException("Unknown status = " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
