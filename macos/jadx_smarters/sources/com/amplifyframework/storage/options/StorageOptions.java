package com.amplifyframework.storage.options;

import com.amplifyframework.storage.StorageAccessLevel;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class StorageOptions {
    private final StorageAccessLevel accessLevel;
    private final String targetIdentityId;

    public static abstract class Builder<B extends Builder, O extends StorageOptions> {
        private StorageAccessLevel accessLevel;
        private String targetIdentityId;

        public B accessLevel(StorageAccessLevel storageAccessLevel) {
            this.accessLevel = storageAccessLevel;
            return this;
        }

        public abstract O build();

        public final StorageAccessLevel getAccessLevel() {
            return this.accessLevel;
        }

        public final String getTargetIdentityId() {
            return this.targetIdentityId;
        }

        public B targetIdentityId(String str) {
            this.targetIdentityId = str;
            return this;
        }
    }

    public StorageOptions(StorageAccessLevel storageAccessLevel, String str) {
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str;
    }

    public StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public String getTargetIdentityId() {
        return this.targetIdentityId;
    }
}
