package com.google.gson.internal;

/* JADX INFO: renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }
}
