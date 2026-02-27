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
import com.amplifyframework.storage.operation.StorageUploadInputStreamOperation;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadInputStreamResult;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.ServerSideEncryption;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageUploadInputStreamOperation extends StorageUploadInputStreamOperation<AWSS3StorageUploadRequest<InputStream>> {
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final CognitoAuthProvider cognitoAuthProvider;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageTransferProgress> onProgress;
    private final Consumer<StorageUploadInputStreamResult> onSuccess;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    /* JADX INFO: renamed from: com.amplifyframework.storage.s3.operation.AWSS3StorageUploadInputStreamOperation$1, reason: invalid class name */
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

        public /* synthetic */ UploadTransferListener(AWSS3StorageUploadInputStreamOperation aWSS3StorageUploadInputStreamOperation, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onError(int i9, Exception exc) {
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_ERROR, exc));
            AWSS3StorageUploadInputStreamOperation.this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage upload input stream operation", exc, "See attached exception for more information and suggestions"));
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onProgressChanged(int i9, long j9, long j10) {
            AWSS3StorageUploadInputStreamOperation.this.onProgress.accept(new StorageTransferProgress(j9, j10));
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onStateChanged(int i9, TransferState transferState) {
            Consumer consumer;
            Object objFromKey;
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.UPLOAD_STATE, transferState.name()));
            int i10 = AnonymousClass1.$SwitchMap$com$amazonaws$mobileconnectors$s3$transferutility$TransferState[transferState.ordinal()];
            if (i10 == 1) {
                consumer = AWSS3StorageUploadInputStreamOperation.this.onSuccess;
                objFromKey = StorageUploadInputStreamResult.fromKey(AWSS3StorageUploadInputStreamOperation.this.getRequest().getKey());
            } else {
                if (i10 != 2) {
                    return;
                }
                consumer = AWSS3StorageUploadInputStreamOperation.this.onError;
                objFromKey = new StorageException("Storage upload operation was interrupted.", "Please verify that you have a stable internet connection.");
            }
            consumer.accept(objFromKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSS3StorageUploadInputStreamOperation(StorageService storageService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageUploadRequest<InputStream> aWSS3StorageUploadRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageTransferProgress> consumer, Consumer<StorageUploadInputStreamResult> consumer2, Consumer<StorageException> consumer3) {
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
    public /* synthetic */ void lambda$start$0(InputStream inputStream, ObjectMetadata objectMetadata, String str) {
        try {
            TransferObserver transferObserverUploadInputStream = this.storageService.uploadInputStream(str.concat(getRequest().getKey()), inputStream, objectMetadata);
            this.transferObserver = transferObserverUploadInputStream;
            transferObserverUploadInputStream.setTransferListener(new UploadTransferListener(this, null));
        } catch (IOException e9) {
            this.onError.accept(new StorageException("Issue uploading inputStream.", e9, "See included exception for more details and suggestions to fix."));
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        TransferObserver transferObserver = this.transferObserver;
        if (transferObserver != null) {
            try {
                this.storageService.cancelTransfer(transferObserver);
            } catch (Exception e9) {
                this.onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage upload input stream operation", e9, "See attached exception for more information and suggestions"));
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
                this.onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage upload input stream operation", e9, "See attached exception for more information and suggestions"));
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
                this.onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage upload input stream operation", e9, "See attached exception for more information and suggestions"));
            }
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        if (this.transferObserver != null) {
            return;
        }
        final InputStream local = getRequest().getLocal();
        final ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setUserMetadata(getRequest().getMetadata());
        objectMetadata.setContentType(getRequest().getContentType());
        ServerSideEncryption serverSideEncryption = getRequest().getServerSideEncryption();
        if (!ServerSideEncryption.NONE.equals(serverSideEncryption)) {
            objectMetadata.setSSEAlgorithm(serverSideEncryption.getName());
        }
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.cognitoAuthProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: com.amplifyframework.storage.s3.operation.i
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f18426a.lambda$start$0(local, objectMetadata, (String) obj);
            }
        }, this.onError);
    }
}
