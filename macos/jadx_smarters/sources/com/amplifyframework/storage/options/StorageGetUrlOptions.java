package com.amplifyframework.storage.options;

import O.c;
import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageOptions;

/* JADX INFO: loaded from: classes.dex */
public class StorageGetUrlOptions extends StorageOptions {
    private final int expires;

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageGetUrlOptions> {
        private int expires;

        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageGetUrlOptions build() {
            return new StorageGetUrlOptions(this);
        }

        public final B expires(int i9) {
            this.expires = i9;
            return this;
        }

        public final int getExpires() {
            return this.expires;
        }
    }

    public StorageGetUrlOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
        this.expires = builder.getExpires();
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageGetUrlOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageGetUrlOptions storageGetUrlOptions) {
        return ((Builder) ((Builder) builder().accessLevel(storageGetUrlOptions.getAccessLevel())).targetIdentityId(storageGetUrlOptions.getTargetIdentityId())).expires(storageGetUrlOptions.getExpires());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageGetUrlOptions)) {
            return false;
        }
        StorageGetUrlOptions storageGetUrlOptions = (StorageGetUrlOptions) obj;
        return c.a(getAccessLevel(), storageGetUrlOptions.getAccessLevel()) && c.a(getTargetIdentityId(), storageGetUrlOptions.getTargetIdentityId()) && c.a(Integer.valueOf(getExpires()), Integer.valueOf(storageGetUrlOptions.getExpires()));
    }

    public int getExpires() {
        return this.expires;
    }

    public int hashCode() {
        return c.b(getAccessLevel(), getTargetIdentityId(), Integer.valueOf(getExpires()));
    }

    public String toString() {
        return "StorageGetUrlOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", expires=" + getExpires() + '}';
    }
}
