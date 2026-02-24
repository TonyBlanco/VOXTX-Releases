package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.storage.s3.CognitoAuthProvider;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.l;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StoragePluginConfiguration {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final AWSS3PluginPrefixResolver awsS3PluginPrefixResolver;

    public static final class Builder {

        @Nullable
        private AWSS3PluginPrefixResolver awsS3PluginPrefixResolver;

        @NotNull
        public final AWSS3StoragePluginConfiguration build() {
            return new AWSS3StoragePluginConfiguration(this, null);
        }

        @Nullable
        public final AWSS3PluginPrefixResolver getAwsS3PluginPrefixResolver() {
            return this.awsS3PluginPrefixResolver;
        }

        public final void setAwsS3PluginPrefixResolver(@Nullable AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver) {
            this.awsS3PluginPrefixResolver = aWSS3PluginPrefixResolver;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @NotNull
        public final AWSS3StoragePluginConfiguration invoke(@NotNull l block) {
            kotlin.jvm.internal.l.e(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    private AWSS3StoragePluginConfiguration(Builder builder) {
        this.awsS3PluginPrefixResolver = builder.getAwsS3PluginPrefixResolver();
    }

    public /* synthetic */ AWSS3StoragePluginConfiguration(Builder builder, g gVar) {
        this(builder);
    }

    @NotNull
    public final AWSS3PluginPrefixResolver getAWSS3PluginPrefixResolver(@NotNull CognitoAuthProvider cognitoAuthProvider) {
        kotlin.jvm.internal.l.e(cognitoAuthProvider, "cognitoAuthProvider");
        AWSS3PluginPrefixResolver aWSS3PluginPrefixResolver = this.awsS3PluginPrefixResolver;
        return aWSS3PluginPrefixResolver != null ? aWSS3PluginPrefixResolver : new StorageAccessLevelAwarePrefixResolver(cognitoAuthProvider);
    }
}
