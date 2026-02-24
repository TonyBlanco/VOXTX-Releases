package com.amplifyframework.storage.s3.options;

import O.c;
import com.amplifyframework.storage.options.StorageDownloadFileOptions;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageDownloadFileOptions extends StorageDownloadFileOptions {

    public static final class Builder extends StorageDownloadFileOptions.Builder<Builder> {
        @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions.Builder, com.amplifyframework.storage.options.StorageOptions.Builder
        public AWSS3StorageDownloadFileOptions build() {
            return new AWSS3StorageDownloadFileOptions(this);
        }
    }

    private AWSS3StorageDownloadFileOptions(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AWSS3StorageDownloadFileOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder from(AWSS3StorageDownloadFileOptions aWSS3StorageDownloadFileOptions) {
        return (Builder) ((Builder) builder().accessLevel(aWSS3StorageDownloadFileOptions.getAccessLevel())).targetIdentityId(aWSS3StorageDownloadFileOptions.getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSS3StorageDownloadFileOptions)) {
            return false;
        }
        AWSS3StorageDownloadFileOptions aWSS3StorageDownloadFileOptions = (AWSS3StorageDownloadFileOptions) obj;
        return c.a(getAccessLevel(), aWSS3StorageDownloadFileOptions.getAccessLevel()) && c.a(getTargetIdentityId(), aWSS3StorageDownloadFileOptions.getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public int hashCode() {
        return c.b(getAccessLevel(), getTargetIdentityId());
    }

    @Override // com.amplifyframework.storage.options.StorageDownloadFileOptions
    public String toString() {
        return "AWSS3StorageDownloadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + '}';
    }
}
