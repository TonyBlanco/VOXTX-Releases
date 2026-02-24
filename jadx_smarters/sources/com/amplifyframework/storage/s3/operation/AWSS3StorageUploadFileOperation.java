package com.amplifyframework.storage.s3.operation;

import android.annotation.SuppressLint;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.StorageChannelEventName;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageUploadFileOperation;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import j$.util.Objects;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageUploadFileOperation extends StorageUploadFileOperation<AWSS3StorageUploadRequest<File>> {
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final CognitoAuthProvider cognitoAuthProvider;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageTransferProgress> onProgress;
    private final Consumer<StorageUploadFileResult> onSuccess;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    /* JADX INFO: renamed from: com.amplifyframework.storage.s3.operation.AWSS3StorageUploadFileOperation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazonaws$mobileconnectors$s3$transferutility$TransferState;

        static {
            int[] iArr = new int[TransferState.values().length];
            $SwitchMap$com$amazonaws$mobileconnectors$s3$transferutility$TransferState = iArr;
            try {
                iArr[TransferState.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazonaws$mobileconnectors$s3$transferutility$TransferState[TransferState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public final class UploadTransferListener implements TransferListener {
        private UploadTransferListener() {
        }

        public /* synthetic */ UploadTransferListener(AWSS3StorageUploadFileOperation aWSS3StorageUploadFileOperation, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onError(int i9, Exception exc) {
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_ERROR, exc));
            AWSS3StorageUploadFileOperation.this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage upload file operation", exc, "See attached exception for more information and suggestions"));
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onProgressChanged(int i9, long j9, long j10) {
            AWSS3StorageUploadFileOperation.this.onProgress.accept(new StorageTransferProgress(j9, j10));
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onStateChanged(int i9, TransferState transferState) {
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_STATE, transferState.name()));
            if (AnonymousClass1.$SwitchMap$com$amazonaws$mobileconnectors$s3$transferutility$TransferState[transferState.ordinal()] != 1) {
                return;
            }
            AWSS3StorageUploadFileOperation.this.onSuccess.accept(StorageUploadFileResult.fromKey(AWSS3StorageUploadFileOperation.this.getRequest().getKey()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadFileOperation(StorageService storageService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageUploadRequest<File> aWSS3StorageUploadRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StorageUploadRequest);
        Objects.requireNonNull(aWSS3StorageUploadRequest);
        Objects.requireNonNull(storageService);
        this.storageService = storageService;
        this.cognitoAuthProvider = cognitoAuthProvider;
        Objects.requireNonNull(consumer);
        this.onProgress = consumer;
        Objects.requireNonNull(consumer2);
        this.onSuccess = consumer2;
        Objects.requireNonNull(consumer3);
        this.onError = consumer3;
        this.transferObserver = null;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(File file, ObjectMetadata objectMetadata, String str) {
        try {
            TransferObserver transferObserverUploadFile = this.storageService.uploadFile(str.concat(getRequest().getKey()), file, objectMetadata);
            this.transferObserver = transferObserverUploadFile;
            transferObserverUploadFile.setTransferListener(new UploadTransferListener(this, null));
        } catch (Exception e9) {
            this.onError.accept(new StorageException("Issue uploading file.", e9, "See included exception for more details and suggestions to fix."));
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        TransferObserver transferObserver = this.transferObserver;
        if (transferObserver != null) {
            try {
                this.storageService.cancelTransfer(transferObserver);
            } catch (Exception e9) {
                this.onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage upload file operation", e9, "See attached exception for more information and suggestions"));
            }
        }
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void pause() {
        TransferObserver transferObserver = this.transferObserver;
        if (transferObserver != null) {
            try {
                this.storageService.pauseTransfer(transferObserver);
            } catch (Exception e9) {
                this.onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage upload file operation", e9, "See attached exception for more information and suggestions"));
            }
        }
    }

    @Override // com.amplifyframework.core.async.Resumable
    public void resume() {
        TransferObserver transferObserver = this.transferObserver;
        if (transferObserver != null) {
            try {
                this.storageService.resumeTransfer(transferObserver);
            } catch (Exception e9) {
                this.onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage upload file operation", e9, "See attached exception for more information and suggestions"));
            }
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        if (this.transferObserver != null) {
            return;
        }
        final File local = getRequest().getLocal();
        final ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setUserMetadata(getRequest().getMetadata());
        objectMetadata.setContentType(getRequest().getContentType());
        ServerSideEncryption serverSideEncryption = getRequest().getServerSideEncryption();
        if (!ServerSideEncryption.NONE.equals(serverSideEncryption)) {
            objectMetadata.setSSEAlgorithm(serverSideEncryption.getName());
        }
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.cognitoAuthProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: com.amplifyframework.storage.s3.operation.h
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f18423a.lambda$start$0(local, objectMetadata, (String) obj);
            }
        }, this.onError);
    }
}
