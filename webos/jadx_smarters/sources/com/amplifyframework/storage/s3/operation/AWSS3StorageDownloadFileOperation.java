package com.amplifyframework.storage.s3.operation;

import android.annotation.SuppressLint;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.storage.StorageChannelEventName;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.operation.StorageDownloadFileOperation;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.s3.CognitoAuthProvider;
import com.amplifyframework.storage.s3.configuration.AWSS3StoragePluginConfiguration;
import com.amplifyframework.storage.s3.request.AWSS3StorageDownloadFileRequest;
import com.amplifyframework.storage.s3.service.StorageService;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class AWSS3StorageDownloadFileOperation extends StorageDownloadFileOperation<AWSS3StorageDownloadFileRequest> {
    private final AWSS3StoragePluginConfiguration awsS3StoragePluginConfiguration;
    private final CognitoAuthProvider cognitoAuthProvider;
    private File file;
    private final Consumer<StorageException> onError;
    private final Consumer<StorageTransferProgress> onProgress;
    private final Consumer<StorageDownloadFileResult> onSuccess;
    private final StorageService storageService;
    private TransferObserver transferObserver;

    /* JADX INFO: renamed from: com.amplifyframework.storage.s3.operation.AWSS3StorageDownloadFileOperation$1, reason: invalid class name */
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
    public final class DownloadTransferListener implements TransferListener {
        private DownloadTransferListener() {
        }

        public /* synthetic */ DownloadTransferListener(AWSS3StorageDownloadFileOperation aWSS3StorageDownloadFileOperation, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onError(int i9, Exception exc) {
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_ERROR, exc));
            AWSS3StorageDownloadFileOperation.this.onError.accept(new StorageException("Something went wrong with your AWS S3 Storage download file operation", exc, "See attached exception for more information and suggestions"));
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onProgressChanged(int i9, long j9, long j10) {
            AWSS3StorageDownloadFileOperation.this.onProgress.accept(new StorageTransferProgress(j9, j10));
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onStateChanged(int i9, TransferState transferState) {
            Amplify.Hub.publish(HubChannel.STORAGE, HubEvent.create(StorageChannelEventName.DOWNLOAD_STATE, transferState.name()));
            if (AnonymousClass1.$SwitchMap$com$amazonaws$mobileconnectors$s3$transferutility$TransferState[transferState.ordinal()] != 1) {
                return;
            }
            AWSS3StorageDownloadFileOperation.this.onSuccess.accept(StorageDownloadFileResult.fromFile(AWSS3StorageDownloadFileOperation.this.file));
        }
    }

    public AWSS3StorageDownloadFileOperation(StorageService storageService, CognitoAuthProvider cognitoAuthProvider, AWSS3StorageDownloadFileRequest aWSS3StorageDownloadFileRequest, AWSS3StoragePluginConfiguration aWSS3StoragePluginConfiguration, Consumer<StorageTransferProgress> consumer, Consumer<StorageDownloadFileResult> consumer2, Consumer<StorageException> consumer3) {
        super(aWSS3StorageDownloadFileRequest);
        this.storageService = storageService;
        this.cognitoAuthProvider = cognitoAuthProvider;
        this.onProgress = consumer;
        this.onSuccess = consumer2;
        this.onError = consumer3;
        this.transferObserver = null;
        this.file = null;
        this.awsS3StoragePluginConfiguration = aWSS3StoragePluginConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(String str) {
        try {
            TransferObserver transferObserverDownloadToFile = this.storageService.downloadToFile(str.concat(getRequest().getKey()), this.file);
            this.transferObserver = transferObserverDownloadToFile;
            transferObserverDownloadToFile.setTransferListener(new DownloadTransferListener(this, null));
        } catch (Exception e9) {
            this.onError.accept(new StorageException("Issue downloading file", e9, "See included exception for more details and suggestions to fix."));
        }
    }

    @Override // com.amplifyframework.core.async.Cancelable
    public void cancel() {
        TransferObserver transferObserver = this.transferObserver;
        if (transferObserver != null) {
            try {
                this.storageService.cancelTransfer(transferObserver);
            } catch (Exception e9) {
                this.onError.accept(new StorageException("Something went wrong while attempting to cancel your AWS S3 Storage download file operation", e9, "See attached exception for more information and suggestions"));
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
                this.onError.accept(new StorageException("Something went wrong while attempting to pause your AWS S3 Storage download file operation", e9, "See attached exception for more information and suggestions"));
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
                this.onError.accept(new StorageException("Something went wrong while attempting to resume your AWS S3 Storage download file operation", e9, "See attached exception for more information and suggestions"));
            }
        }
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    @SuppressLint({"SyntheticAccessor"})
    public void start() {
        if (this.transferObserver != null) {
            return;
        }
        this.file = getRequest().getLocal();
        this.awsS3StoragePluginConfiguration.getAWSS3PluginPrefixResolver(this.cognitoAuthProvider).resolvePrefix(getRequest().getAccessLevel(), getRequest().getTargetIdentityId(), new Consumer() { // from class: com.amplifyframework.storage.s3.operation.a
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Object obj) {
                this.f18416a.lambda$start$0((String) obj);
            }
        }, this.onError);
    }
}
