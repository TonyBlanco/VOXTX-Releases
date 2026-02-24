package com.amplifyframework.storage.s3.options;

import O.c;
import com.amplifyframework.storage.options.StorageListOptions;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageListOptions extends StorageListOptions {

    public static final class Builder extends StorageListOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageListOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageListOptions build() {
            return new AWSS3StorageListOptions(this);
        }
    }

    private AWSS3StorageListOptions(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageListOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageListOptions aWSS3StorageListOptions) {
        return (Builder) ((Builder) builder().accessLevel(aWSS3StorageListOptions.getAccessLevel())).targetIdentityId(aWSS3StorageListOptions.getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageListOptions)) {
            return false;
        }
        AWSS3StorageListOptions aWSS3StorageListOptions = (AWSS3StorageListOptions) obj;
        return c.a(getAccessLevel(), aWSS3StorageListOptions.getAccessLevel()) && c.a(getTargetIdentityId(), aWSS3StorageListOptions.getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public int hashCode() {
        return c.b(getAccessLevel(), getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageListOptions
    public String toString() {
        return "AWSS3StorageListOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + '}';
    }
}
