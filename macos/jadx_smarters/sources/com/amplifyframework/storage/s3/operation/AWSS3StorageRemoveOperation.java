package com.amplifyframework.storage.s3.operation;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageRemoveOperation;
import com.amplifyframework.storage.result.StorageRemoveResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageRemoveRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageRemoveOperation extends StorageRemoveOperation<AWSS3StorageRemoveRequest> {
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final CognitoAuthProvider cognitoAuthProvider;
    private final ExecutorService executorService;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageRemoveResult> onSuccess;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageRemoveOperation(StorageService storageService, ExecutorService executorService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageRemoveRequest aWSS3StorageRemoveRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageRemoveResult> consumer, Consumer<StorageException> consumer2) {
        super(aWSS3StorageRemoveRequest);
        Objects.requireNonNull(aWSS3StorageRemoveRequest);
        Objects.requireNonNull(storageService);
        this.storageService = storageService;
        Objects.requireNonNull(executorService);
        this.executorService = executorService;
        this.cognitoAuthProvider = cognitoAuthProvider;
        Objects.requireNonNull(consumer);
        this.onSuccess = consumer;
        Objects.requireNonNull(consumer2);
        this.onError = consumer2;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$null$0(String str) {
        try {
            this.storageService.deleteObject(str.concat(getRequest().getKey()));
            this.onSuccess.accept(StorageRemoveResult.fromKey(getRequest().getKey()));
        } catch (Exception e9) {
            this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage remove operation", e9, "See attached exception for more information and suggestions"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.cognitoAuthProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: com.amplifyframework.storage.s3.operation.f
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f18421a.lambda$null$0((String) obj);
            }
        }, this.onError);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public void start() {
        this.executorService.submit(new Runnable() { // from class: com.amplifyframework.storage.s3.operation.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f18422a.lambda$start$1();
            }
        });
    }
}
