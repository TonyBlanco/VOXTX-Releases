package com.amplifyframework.storage.s3.options;

import O.c;
import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageGetUrlOptions;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageGetPresignedUrlOptions extends StorageGetUrlOptions {

    public static final class Builder extends StorageGetUrlOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageGetUrlOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageGetPresignedUrlOptions build() {
            return new AWSS3StorageGetPresignedUrlOptions(this);
        }
    }

    private AWSS3StorageGetPresignedUrlOptions(Builder builder) {
        super(builder);
    }

    @SuppressLint({"SyntheticAccessor"})
    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageGetPresignedUrlOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageGetPresignedUrlOptions aWSS3StorageGetPresignedUrlOptions) {
        return ((Builder) ((Builder) builder().accessLevel(aWSS3StorageGetPresignedUrlOptions.getAccessLevel())).targetIdentityId(aWSS3StorageGetPresignedUrlOptions.getTargetIdentityId())).expires(aWSS3StorageGetPresignedUrlOptions.getExpires());
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageGetPresignedUrlOptions)) {
            return false;
        }
        AWSS3StorageGetPresignedUrlOptions aWSS3StorageGetPresignedUrlOptions = (AWSS3StorageGetPresignedUrlOptions) obj;
        return c.a(getAccessLevel(), aWSS3StorageGetPresignedUrlOptions.getAccessLevel()) && c.a(getTargetIdentityId(), aWSS3StorageGetPresignedUrlOptions.getTargetIdentityId()) && c.a(Integer.valueOf(getExpires()), Integer.valueOf(aWSS3StorageGetPresignedUrlOptions.getExpires()));
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public int hashCode() {
        return c.b(getAccessLevel(), getTargetIdentityId(), Integer.valueOf(getExpires()));
    }

    @Override // com.amplifyframework.storage.options.StorageGetUrlOptions
    public String toString() {
        return "AWSS3StorageGetPresignedUrlOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", expires=" + getExpires() + '}';
    }
}
