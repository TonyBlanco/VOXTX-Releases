package com.amplifyframework.storage.s3.options;

import O.c;
import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageRemoveOptions;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageRemoveOptions extends StorageRemoveOptions {

    public static final class Builder extends StorageRemoveOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageRemoveOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public AWSS3StorageRemoveOptions build() {
            return new AWSS3StorageRemoveOptions(this);
        }
    }

    private AWSS3StorageRemoveOptions(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageRemoveOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageRemoveOptions aWSS3StorageRemoveOptions) {
        return (Builder) ((Builder) builder().accessLevel(aWSS3StorageRemoveOptions.getAccessLevel())).targetIdentityId(aWSS3StorageRemoveOptions.getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageRemoveOptions)) {
            return false;
        }
        AWSS3StorageRemoveOptions aWSS3StorageRemoveOptions = (AWSS3StorageRemoveOptions) obj;
        return c.a(getAccessLevel(), aWSS3StorageRemoveOptions.getAccessLevel()) && c.a(getTargetIdentityId(), aWSS3StorageRemoveOptions.getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public int hashCode() {
        return c.b(getAccessLevel(), getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageRemoveOptions
    public String toString() {
        return "AWSS3StorageRemoveOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + '}';
    }
}
