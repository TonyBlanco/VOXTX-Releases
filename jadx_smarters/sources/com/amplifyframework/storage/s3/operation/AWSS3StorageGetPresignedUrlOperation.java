package com.amplifyframework.storage.s3.operation;

import android.annotation.SuppressLint;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageGetUrlOperation;
import com.amplifyframework.storage.result.StorageGetUrlResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageGetPresignedUrlRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageGetPresignedUrlOperation extends StorageGetUrlOperation<AWSS3StorageGetPresignedUrlRequest> {
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final CognitoAuthProvider cognitoAuthProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageGetUrlResult> onSuccess;
    private final StorageService storageService;

    public AWSS3StorageGetPresignedUrlOperation(StorageService storageService, ExecutorService executorService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageGetPresignedUrlRequest aWSS3StorageGetPresignedUrlRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageGetUrlResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageGetPresignedUrlRequest);
        this.storageService = storageService;
        this.executorService = executorService;
        this.cognitoAuthProvider = cognitoAuthProvider;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
        this.onSuccess = consumer;
        this.onError = consumer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$0(String str) {
        try {
            this.onSuccess.accept(StorageGetUrlResult.fromUrl(this.storageService.getPresignedUrl(str.concat(getRequest().getKey()), getRequest().getExpires())));
        } catch (Exception e9) {
            this.onError.accept(new StorageException("Encountered an issue while generating pre-signed URL", e9, "See included exception for more details and suggestions to fix."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.cognitoAuthProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: com.amplifyframework.storage.s3.operation.c
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f18418a.lambda$null$0((String) obj);
            }
        }, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        this.executorService.submit(new Runnable() { // from class: com.amplifyframework.storage.s3.operation.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f18417a.lambda$start$1();
            }
        });
    }
}
