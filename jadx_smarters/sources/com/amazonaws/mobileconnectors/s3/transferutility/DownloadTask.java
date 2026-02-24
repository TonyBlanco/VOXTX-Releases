package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
class DownloadTask implements Callable<Boolean> {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) DownloadTask.class);
    private static final int SIXTEEN_KB = 16384;
    private final TransferRecord download;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final AmazonS3 f18378s3;
    private final TransferStatusUpdater updater;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.download = transferRecord;
        this.f18378s3 = amazonS3;
        this.updater = transferStatusUpdater;
    }

    private void saveToFile(InputStream inputStream, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, file.length() > 0));
            } catch (Throwable th) {
                th = th;
            }
        } catch (SocketTimeoutException e9) {
            e = e9;
        } catch (IOException e10) {
            e = e10;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i9 = inputStream.read(bArr);
                if (i9 != -1) {
                    bufferedOutputStream.write(bArr, 0, i9);
                } else {
                    try {
                        break;
                    } catch (IOException e11) {
                        LOGGER.warn("got exception", e11);
                    }
                }
            }
            bufferedOutputStream.close();
            try {
                inputStream.close();
            } catch (IOException e12) {
                LOGGER.warn("got exception", e12);
            }
        } catch (SocketTimeoutException e13) {
            e = e13;
            String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
            LOGGER.error(str);
            throw new AmazonClientException(str, e);
        } catch (IOException e14) {
            e = e14;
            throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e15) {
                    LOGGER.warn("got exception", e15);
                }
            }
            if (inputStream == null) {
                throw th;
            }
            try {
                inputStream.close();
                throw th;
            } catch (IOException e16) {
                LOGGER.warn("got exception", e16);
                throw th;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() throws Throwable {
        try {
            if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                LOGGER.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                this.updater.updateState(this.download.id, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e9) {
            LOGGER.error("TransferUtilityException: [" + e9 + "]");
        }
        this.updater.updateState(this.download.id, TransferState.IN_PROGRESS);
        ProgressListener progressListenerNewProgressListener = this.updater.newProgressListener(this.download.id);
        try {
            TransferRecord transferRecord = this.download;
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.bucketName, transferRecord.key);
            TransferUtility.appendTransferServiceUserAgentString(getObjectRequest);
            File file = new File(this.download.file);
            long length = file.length();
            if (length > 0) {
                LOGGER.debug(String.format("Resume transfer %d from %d bytes", Integer.valueOf(this.download.id), Long.valueOf(length)));
                getObjectRequest.setRange(length, -1L);
            }
            getObjectRequest.setGeneralProgressListener(progressListenerNewProgressListener);
            S3Object object = this.f18378s3.getObject(getObjectRequest);
            if (object == null) {
                this.updater.throwError(this.download.id, new IllegalStateException("AmazonS3.getObject returns null"));
                this.updater.updateState(this.download.id, TransferState.FAILED);
                return Boolean.FALSE;
            }
            long instanceLength = object.getObjectMetadata().getInstanceLength();
            this.updater.updateProgress(this.download.id, length, instanceLength, true);
            saveToFile(object.getObjectContent(), file);
            this.updater.updateProgress(this.download.id, instanceLength, instanceLength, true);
            this.updater.updateState(this.download.id, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e10) {
            if (TransferState.PENDING_CANCEL.equals(this.download.state)) {
                TransferStatusUpdater transferStatusUpdater = this.updater;
                int i9 = this.download.id;
                TransferState transferState = TransferState.CANCELED;
                transferStatusUpdater.updateState(i9, transferState);
                LOGGER.info("Transfer is " + transferState);
            } else if (TransferState.PENDING_PAUSE.equals(this.download.state)) {
                TransferStatusUpdater transferStatusUpdater2 = this.updater;
                int i10 = this.download.id;
                TransferState transferState2 = TransferState.PAUSED;
                transferStatusUpdater2.updateState(i10, transferState2);
                LOGGER.info("Transfer is " + transferState2);
                new ProgressEvent(0L).setEventCode(32);
                progressListenerNewProgressListener.progressChanged(new ProgressEvent(0L));
            } else {
                try {
                    if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        Log log = LOGGER;
                        log.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        this.updater.updateState(this.download.id, TransferState.WAITING_FOR_NETWORK);
                        log.debug("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).setEventCode(32);
                        progressListenerNewProgressListener.progressChanged(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e11) {
                    LOGGER.error("TransferUtilityException: [" + e11 + "]");
                }
                if (RetryUtils.isInterrupted(e10)) {
                    LOGGER.info("Transfer is interrupted. " + e10);
                } else {
                    LOGGER.debug("Failed to download: " + this.download.id + " due to " + e10.getMessage());
                    this.updater.throwError(this.download.id, e10);
                }
                this.updater.updateState(this.download.id, TransferState.FAILED);
            }
            return Boolean.FALSE;
        }
    }
}
