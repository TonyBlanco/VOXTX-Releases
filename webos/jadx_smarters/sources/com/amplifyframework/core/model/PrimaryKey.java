package com.amplifyframework.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class PrimaryKey {
    private static final String ID = "id";

    private PrimaryKey() {
    }

    public static String fieldName() {
        return "id";
    }

    public static boolean matches(Object obj) {
        return (obj instanceof String) && fieldName().equals(obj);
    }
}
