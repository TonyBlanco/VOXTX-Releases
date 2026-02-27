package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AWSS3PluginPrefixResolver {
    void resolvePrefix(@NotNull StorageAccessLevel storageAccessLevel, @Nullable String str, @NotNull Consumer<String> consumer, @NotNull Consumer<StorageException> consumer2);
}
