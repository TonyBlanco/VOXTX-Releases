package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
class UploadTask implements Callable<Boolean> {
    private static final String OBJECT_TAGS_DELIMITER = "&";
    private static final String OBJECT_TAG_KEY_VALUE_SEPARATOR = "=";
    private static final String REQUESTER_PAYS = "requester";
    private final TransferDBUtil dbUtil;
    private List<UploadPartRequest> requestList;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final AmazonS3 f18382s3;
    private final TransferStatusUpdater updater;
    private final TransferRecord upload;
    Map<Integer, UploadPartTaskMetadata> uploadPartTasks = new HashMap();
    private static final Log LOGGER = LogFactory.getLog((Class<?>) UploadTask.class);
    private static final Map<String, CannedAccessControlList> CANNED_ACL_MAP = new HashMap();

    public class UploadPartTaskMetadata {
        long bytesTransferredSoFar;
        TransferState state;
        UploadPartRequest uploadPartRequest;
        Future<Boolean> uploadPartTask;

        public UploadPartTaskMetadata() {
        }
    }

    public class UploadTaskProgressListener implements ProgressListener {
        private final long bytesAlreadyTransferred;
        private long prevTotalBytesTransferredOfAllParts;

        public UploadTaskProgressListener(long j9) {
            this.prevTotalBytesTransferredOfAllParts = j9;
            this.bytesAlreadyTransferred = j9;
        }

        public synchronized void onProgressChanged(int i9, long j9) {
            UploadPartTaskMetadata uploadPartTaskMetadata = UploadTask.this.uploadPartTasks.get(Integer.valueOf(i9));
            if (uploadPartTaskMetadata == null) {
                UploadTask.LOGGER.info("Update received for unknown part. Ignoring.");
                return;
            }
            uploadPartTaskMetadata.bytesTransferredSoFar = j9;
            long j10 = this.bytesAlreadyTransferred;
            Iterator<Map.Entry<Integer, UploadPartTaskMetadata>> it = UploadTask.this.uploadPartTasks.entrySet().iterator();
            while (it.hasNext()) {
                j10 += it.next().getValue().bytesTransferredSoFar;
            }
            if (j10 > this.prevTotalBytesTransferredOfAllParts && j10 <= UploadTask.this.upload.bytesTotal) {
                UploadTask.this.updater.updateProgress(UploadTask.this.upload.id, j10, UploadTask.this.upload.bytesTotal, true);
                this.prevTotalBytesTransferredOfAllParts = j10;
            }
        }

        @Override // com.amazonaws.event.ProgressListener
        public void progressChanged(ProgressEvent progressEvent) {
        }
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            CANNED_ACL_MAP.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.upload = transferRecord;
        this.f18382s3 = amazonS3;
        this.dbUtil = transferDBUtil;
        this.updater = transferStatusUpdater;
    }

    private void abortMultiPartUpload(int i9, String str, String str2, String str3) {
        Log log = LOGGER;
        log.info("Aborting the multipart since complete multipart failed.");
        try {
            this.f18382s3.abortMultipartUpload(new AbortMultipartUploadRequest(str, str2, str3));
            log.debug("Successfully aborted multipart upload: " + i9);
        } catch (AmazonClientException e9) {
            LOGGER.debug("Failed to abort the multipart upload: " + i9, e9);
        }
    }

    private void completeMultiPartUpload(int i9, String str, String str2, String str3) throws AmazonClientException {
        CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(str, str2, str3, this.dbUtil.queryPartETagsOfUpload(i9));
        TransferUtility.appendMultipartTransferServiceUserAgentString(completeMultipartUploadRequest);
        this.f18382s3.completeMultipartUpload(completeMultipartUploadRequest);
    }

    private PutObjectRequest createPutObjectRequest(TransferRecord transferRecord) {
        File file = new File(transferRecord.file);
        PutObjectRequest putObjectRequest = new PutObjectRequest(transferRecord.bucketName, transferRecord.key, file);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(file.length());
        String str = transferRecord.headerCacheControl;
        if (str != null) {
            objectMetadata.setCacheControl(str);
        }
        String str2 = transferRecord.headerContentDisposition;
        if (str2 != null) {
            objectMetadata.setContentDisposition(str2);
        }
        String str3 = transferRecord.headerContentEncoding;
        if (str3 != null) {
            objectMetadata.setContentEncoding(str3);
        }
        String str4 = transferRecord.headerContentType;
        if (str4 != null) {
            objectMetadata.setContentType(str4);
        } else {
            objectMetadata.setContentType(Mimetypes.getInstance().getMimetype(file));
        }
        String str5 = transferRecord.headerStorageClass;
        if (str5 != null) {
            putObjectRequest.setStorageClass(str5);
        }
        String str6 = transferRecord.expirationTimeRuleId;
        if (str6 != null) {
            objectMetadata.setExpirationTimeRuleId(str6);
        }
        if (transferRecord.httpExpires != null) {
            objectMetadata.setHttpExpiresDate(new Date(Long.valueOf(transferRecord.httpExpires).longValue()));
        }
        String str7 = transferRecord.sseAlgorithm;
        if (str7 != null) {
            objectMetadata.setSSEAlgorithm(str7);
        }
        Map<String, String> map = transferRecord.userMetadata;
        if (map != null) {
            objectMetadata.setUserMetadata(map);
            String str8 = transferRecord.userMetadata.get(Headers.S3_TAGGING);
            if (str8 != null) {
                try {
                    String[] strArrSplit = str8.split(OBJECT_TAGS_DELIMITER);
                    ArrayList arrayList = new ArrayList();
                    for (String str9 : strArrSplit) {
                        String[] strArrSplit2 = str9.split(OBJECT_TAG_KEY_VALUE_SEPARATOR);
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.setTagging(new ObjectTagging(arrayList));
                } catch (Exception e9) {
                    LOGGER.error("Error in passing the object tags as request headers.", e9);
                }
            }
            String str10 = transferRecord.userMetadata.get(Headers.REDIRECT_LOCATION);
            if (str10 != null) {
                putObjectRequest.setRedirectLocation(str10);
            }
            String str11 = transferRecord.userMetadata.get(Headers.REQUESTER_PAYS_HEADER);
            if (str11 != null) {
                putObjectRequest.setRequesterPays("requester".equals(str11));
            }
        }
        String str12 = transferRecord.md5;
        if (str12 != null) {
            objectMetadata.setContentMD5(str12);
        }
        String str13 = transferRecord.sseKMSKey;
        if (str13 != null) {
            putObjectRequest.setSSEAwsKeyManagementParams(new SSEAwsKeyManagementParams(str13));
        }
        putObjectRequest.setMetadata(objectMetadata);
        putObjectRequest.setCannedAcl(getCannedAclFromString(transferRecord.cannedAcl));
        return putObjectRequest;
    }

    private static CannedAccessControlList getCannedAclFromString(String str) {
        if (str == null) {
            return null;
        }
        return CANNED_ACL_MAP.get(str);
    }

    private String initiateMultipartUpload(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequestWithTagging = new InitiateMultipartUploadRequest(putObjectRequest.getBucketName(), putObjectRequest.getKey()).withCannedACL(putObjectRequest.getCannedAcl()).withObjectMetadata(putObjectRequest.getMetadata()).withSSEAwsKeyManagementParams(putObjectRequest.getSSEAwsKeyManagementParams()).withTagging(putObjectRequest.getTagging());
        TransferUtility.appendMultipartTransferServiceUserAgentString(initiateMultipartUploadRequestWithTagging);
        return this.f18382s3.initiateMultipartUpload(initiateMultipartUploadRequestWithTagging).getUploadId();
    }

    private Boolean uploadMultipartAndWaitForCompletion() throws ExecutionException {
        long j9;
        TransferState transferState;
        Log log;
        StringBuilder sb;
        String str = this.upload.multipartId;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestCreatePutObjectRequest = createPutObjectRequest(this.upload);
            TransferUtility.appendMultipartTransferServiceUserAgentString(putObjectRequestCreatePutObjectRequest);
            try {
                this.upload.multipartId = initiateMultipartUpload(putObjectRequestCreatePutObjectRequest);
                TransferDBUtil transferDBUtil = this.dbUtil;
                TransferRecord transferRecord = this.upload;
                transferDBUtil.updateMultipartId(transferRecord.id, transferRecord.multipartId);
                j9 = 0;
            } catch (AmazonClientException e9) {
                e = e9;
                LOGGER.error("Error initiating multipart upload: " + this.upload.id + " due to " + e.getMessage(), e);
                this.updater.throwError(this.upload.id, e);
                this.updater.updateState(this.upload.id, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            long jQueryBytesTransferredByMainUploadId = this.dbUtil.queryBytesTransferredByMainUploadId(this.upload.id);
            if (jQueryBytesTransferredByMainUploadId > 0) {
                LOGGER.info(String.format("Resume transfer %d from %d bytes", Integer.valueOf(this.upload.id), Long.valueOf(jQueryBytesTransferredByMainUploadId)));
            }
            j9 = jQueryBytesTransferredByMainUploadId;
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(j9);
        TransferStatusUpdater transferStatusUpdater = this.updater;
        TransferRecord transferRecord2 = this.upload;
        transferStatusUpdater.updateProgress(transferRecord2.id, j9, transferRecord2.bytesTotal, false);
        TransferDBUtil transferDBUtil2 = this.dbUtil;
        TransferRecord transferRecord3 = this.upload;
        this.requestList = transferDBUtil2.getNonCompletedPartRequestsFromDB(transferRecord3.id, transferRecord3.multipartId);
        LOGGER.info("Multipart upload " + this.upload.id + " in " + this.requestList.size() + " parts.");
        for (UploadPartRequest uploadPartRequest : this.requestList) {
            TransferUtility.appendMultipartTransferServiceUserAgentString(uploadPartRequest);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.uploadPartRequest = uploadPartRequest;
            uploadPartTaskMetadata.bytesTransferredSoFar = 0L;
            uploadPartTaskMetadata.state = TransferState.WAITING;
            this.uploadPartTasks.put(Integer.valueOf(uploadPartRequest.getPartNumber()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.uploadPartTask = TransferThreadPool.submitTask(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest, this.f18382s3, this.dbUtil));
        }
        try {
            Iterator<UploadPartTaskMetadata> it = this.uploadPartTasks.values().iterator();
            boolean zBooleanValue = true;
            while (it.hasNext()) {
                zBooleanValue &= it.next().uploadPartTask.get().booleanValue();
            }
            if (!zBooleanValue) {
                try {
                    if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        this.updater.updateState(this.upload.id, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e10) {
                    LOGGER.error("TransferUtilityException: [" + e10 + "]");
                }
            }
            LOGGER.info("Completing the multi-part upload transfer for " + this.upload.id);
            try {
                TransferRecord transferRecord4 = this.upload;
                completeMultiPartUpload(transferRecord4.id, transferRecord4.bucketName, transferRecord4.key, transferRecord4.multipartId);
                TransferStatusUpdater transferStatusUpdater2 = this.updater;
                TransferRecord transferRecord5 = this.upload;
                int i9 = transferRecord5.id;
                long j10 = transferRecord5.bytesTotal;
                transferStatusUpdater2.updateProgress(i9, j10, j10, true);
                this.updater.updateState(this.upload.id, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (AmazonClientException e11) {
                e = e11;
                LOGGER.error("Failed to complete multipart: " + this.upload.id + " due to " + e.getMessage(), e);
                TransferRecord transferRecord6 = this.upload;
                abortMultiPartUpload(transferRecord6.id, transferRecord6.bucketName, transferRecord6.key, transferRecord6.multipartId);
                this.updater.throwError(this.upload.id, e);
                this.updater.updateState(this.upload.id, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } catch (Exception e12) {
            LOGGER.error("Upload resulted in an exception. " + e12);
            Iterator<UploadPartTaskMetadata> it2 = this.uploadPartTasks.values().iterator();
            while (it2.hasNext()) {
                it2.next().uploadPartTask.cancel(true);
            }
            if (TransferState.PENDING_CANCEL.equals(this.upload.state)) {
                TransferStatusUpdater transferStatusUpdater3 = this.updater;
                int i10 = this.upload.id;
                transferState = TransferState.CANCELED;
                transferStatusUpdater3.updateState(i10, transferState);
                log = LOGGER;
                sb = new StringBuilder();
            } else {
                if (!TransferState.PENDING_PAUSE.equals(this.upload.state)) {
                    for (UploadPartTaskMetadata uploadPartTaskMetadata2 : this.uploadPartTasks.values()) {
                        TransferState transferState2 = TransferState.WAITING_FOR_NETWORK;
                        if (transferState2.equals(uploadPartTaskMetadata2.state)) {
                            LOGGER.info("Individual part is WAITING_FOR_NETWORK.");
                            this.updater.updateState(this.upload.id, transferState2);
                            break;
                        }
                    }
                    try {
                        if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                            LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                            this.updater.updateState(this.upload.id, TransferState.WAITING_FOR_NETWORK);
                            return Boolean.FALSE;
                        }
                    } catch (TransferUtilityException e13) {
                        LOGGER.error("TransferUtilityException: [" + e13 + "]");
                    }
                    if (RetryUtils.isInterrupted(e12)) {
                        LOGGER.info("Transfer is interrupted. " + e12);
                    } else {
                        LOGGER.error("Error encountered during multi-part upload: " + this.upload.id + " due to " + e12.getMessage(), e12);
                        this.updater.throwError(this.upload.id, e12);
                    }
                    this.updater.updateState(this.upload.id, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                TransferStatusUpdater transferStatusUpdater4 = this.updater;
                int i11 = this.upload.id;
                transferState = TransferState.PAUSED;
                transferStatusUpdater4.updateState(i11, transferState);
                log = LOGGER;
                sb = new StringBuilder();
            }
            sb.append("Transfer is ");
            sb.append(transferState);
            log.info(sb.toString());
            return Boolean.FALSE;
        }
    }

    private Boolean uploadSinglePartAndWaitForCompletion() {
        PutObjectRequest putObjectRequestCreatePutObjectRequest = createPutObjectRequest(this.upload);
        ProgressListener progressListenerNewProgressListener = this.updater.newProgressListener(this.upload.id);
        long length = putObjectRequestCreatePutObjectRequest.getFile().length();
        TransferUtility.appendTransferServiceUserAgentString(putObjectRequestCreatePutObjectRequest);
        putObjectRequestCreatePutObjectRequest.setGeneralProgressListener(progressListenerNewProgressListener);
        try {
            this.f18382s3.putObject(putObjectRequestCreatePutObjectRequest);
            this.updater.updateProgress(this.upload.id, length, length, true);
            this.updater.updateState(this.upload.id, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e9) {
            if (TransferState.PENDING_CANCEL.equals(this.upload.state)) {
                TransferStatusUpdater transferStatusUpdater = this.updater;
                int i9 = this.upload.id;
                TransferState transferState = TransferState.CANCELED;
                transferStatusUpdater.updateState(i9, transferState);
                LOGGER.info("Transfer is " + transferState);
            } else if (TransferState.PENDING_PAUSE.equals(this.upload.state)) {
                TransferStatusUpdater transferStatusUpdater2 = this.updater;
                int i10 = this.upload.id;
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
                        this.updater.updateState(this.upload.id, TransferState.WAITING_FOR_NETWORK);
                        log.debug("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).setEventCode(32);
                        progressListenerNewProgressListener.progressChanged(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e10) {
                    LOGGER.error("TransferUtilityException: [" + e10 + "]");
                }
                if (RetryUtils.isInterrupted(e9)) {
                    LOGGER.info("Transfer is interrupted. " + e9);
                } else {
                    LOGGER.debug("Failed to upload: " + this.upload.id + " due to " + e9.getMessage());
                    this.updater.throwError(this.upload.id, e9);
                }
                this.updater.updateState(this.upload.id, TransferState.FAILED);
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        try {
            if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                this.updater.updateState(this.upload.id, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e9) {
            LOGGER.error("TransferUtilityException: [" + e9 + "]");
        }
        this.updater.updateState(this.upload.id, TransferState.IN_PROGRESS);
        TransferRecord transferRecord = this.upload;
        int i9 = transferRecord.isMultipart;
        return (i9 == 1 && transferRecord.partNumber == 0) ? uploadMultipartAndWaitForCompletion() : i9 == 0 ? uploadSinglePartAndWaitForCompletion() : Boolean.FALSE;
    }
}
