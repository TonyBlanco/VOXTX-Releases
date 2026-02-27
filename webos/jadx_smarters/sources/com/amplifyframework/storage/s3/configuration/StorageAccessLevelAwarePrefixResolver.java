package com.amplifyframework.storage.s3.configuration;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageAccessLevel;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.utils.S3Keys;
import k8.j;
import k8.k;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class StorageAccessLevelAwarePrefixResolver implements AWSS3PluginPrefixResolver {
    private final CognitoAuthProvider cognitoAuthProvider;

    public StorageAccessLevelAwarePrefixResolver(@NotNull CognitoAuthProvider cognitoAuthProvider) {
        l.e(cognitoAuthProvider, "cognitoAuthProvider");
        this.cognitoAuthProvider = cognitoAuthProvider;
    }

    @Override // com.amplifyframework.storage.s3.configuration.AWSS3PluginPrefixResolver
    public void resolvePrefix(@NotNull StorageAccessLevel accessLevel, @Nullable String str, @NotNull Consumer<String> onSuccess, @NotNull Consumer<StorageException> onError) throws Throwable {
        Object objB;
        l.e(accessLevel, "accessLevel");
        l.e(onSuccess, "onSuccess");
        l.e(onError, "onError");
        try {
            j.a aVar = j.f43666c;
            objB = j.b(this.cognitoAuthProvider.getIdentityId());
        } catch (Throwable th) {
            j.a aVar2 = j.f43666c;
            objB = j.b(k.a(th));
        }
        if (j.g(objB)) {
            if (str == null) {
                k.b(objB);
                str = (String) objB;
            }
            onSuccess.accept(S3Keys.getAccessLevelPrefix(accessLevel, str));
            return;
        }
        Throwable thD = j.d(objB);
        if (thD == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.amplifyframework.storage.StorageException");
        }
        onError.accept((StorageException) thD);
    }
}
