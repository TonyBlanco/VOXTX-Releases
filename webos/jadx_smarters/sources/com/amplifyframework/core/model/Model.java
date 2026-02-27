package com.amplifyframework.core.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface Model {

    public enum Type {
        USER,
        SYSTEM
    }

    String getModelName();

    String getPrimaryKeyString();

    Serializable resolveIdentifier();
}
