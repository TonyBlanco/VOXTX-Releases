package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.VersionInfoUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtility {
    static final int DEFAULT_MINIMUM_UPLOAD_PART_SIZE_IN_BYTES = 5242880;
    static final long MAXIMUM_SUPPORTED_UPLOAD_PART_SIZE_IN_BYTES = 5368709120L;
    static final int MINIMUM_SUPPORTED_UPLOAD_PART_SIZE_IN_BYTES = 5242880;
    private static final String TRANSFER_ADD = "add_transfer";
    private static final String TRANSFER_CANCEL = "cancel_transfer";
    private static final String TRANSFER_PAUSE = "pause_transfer";
    private static final String TRANSFER_RESUME = "resume_transfer";
    final ConnectivityManager connManager;
    private TransferDBUtil dbUtil;
    private final String defaultBucket;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final AmazonS3 f18379s3;
    private final TransferUtilityOptions transferUtilityOptions;
    private TransferStatusUpdater updater;
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferUtility.class);
    private static final Object LOCK = new Object();
    private static String userAgentFromConfig = "";

    public static class Builder {
        private Context appContext;
        private AWSConfiguration awsConfig;
        private String defaultBucket;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        private AmazonS3 f18380s3;
        private TransferUtilityOptions transferUtilityOptions;

        public Builder awsConfiguration(AWSConfiguration aWSConfiguration) {
            this.awsConfig = aWSConfiguration;
            return this;
        }

        public TransferUtility build() {
            if (this.f18380s3 == null) {
                throw new IllegalArgumentException("AmazonS3 client is required please set using .s3Client(yourClient)");
            }
            if (this.appContext == null) {
                throw new IllegalArgumentException("Context is required please set using .context(applicationContext)");
            }
            AWSConfiguration aWSConfiguration = this.awsConfig;
            if (aWSConfiguration != null) {
                try {
                    JSONObject jSONObjectOptJsonObject = aWSConfiguration.optJsonObject("S3TransferUtility");
                    this.f18380s3.setRegion(Region.getRegion(jSONObjectOptJsonObject.getString("Region")));
                    this.defaultBucket = jSONObjectOptJsonObject.getString("Bucket");
                    if (jSONObjectOptJsonObject.has(Constants.LOCAL_TESTING_FLAG_NAME) ? jSONObjectOptJsonObject.getBoolean(Constants.LOCAL_TESTING_FLAG_NAME) : false) {
                        this.f18380s3.setEndpoint(Constants.LOCAL_TESTING_ENDPOINT);
                        this.f18380s3.setS3ClientOptions(S3ClientOptions.builder().setPathStyleAccess(true).skipContentMd5Check(true).build());
                    }
                    TransferUtility.setUserAgentFromConfig(this.awsConfig.getUserAgent());
                } catch (Exception e9) {
                    throw new IllegalArgumentException("Failed to read S3TransferUtility please check your setup or awsconfiguration.json file", e9);
                }
            }
            if (this.transferUtilityOptions == null) {
                this.transferUtilityOptions = new TransferUtilityOptions();
            }
            return new TransferUtility(this.f18380s3, this.appContext, this.defaultBucket, this.transferUtilityOptions);
        }

        public Builder context(Context context) {
            this.appContext = context.getApplicationContext();
            return this;
        }

        public Builder defaultBucket(String str) {
            this.defaultBucket = str;
            return this;
        }

        public Builder s3Client(AmazonS3 amazonS3) {
            this.f18380s3 = amazonS3;
            return this;
        }

        public Builder transferUtilityOptions(TransferUtilityOptions transferUtilityOptions) {
            this.transferUtilityOptions = transferUtilityOptions;
            return this;
        }
    }

    @Deprecated
    public TransferUtility(AmazonS3 amazonS3, Context context) {
        this.f18379s3 = amazonS3;
        this.defaultBucket = null;
        TransferUtilityOptions transferUtilityOptions = new TransferUtilityOptions();
        this.transferUtilityOptions = transferUtilityOptions;
        this.dbUtil = new TransferDBUtil(context.getApplicationContext());
        this.updater = TransferStatusUpdater.getInstance(context.getApplicationContext());
        TransferThreadPool.init(transferUtilityOptions.getTransferThreadPoolSize());
        this.connManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    private TransferUtility(AmazonS3 amazonS3, Context context, String str, TransferUtilityOptions transferUtilityOptions) {
        this.f18379s3 = amazonS3;
        this.defaultBucket = str;
        this.transferUtilityOptions = transferUtilityOptions;
        this.dbUtil = new TransferDBUtil(context.getApplicationContext());
        this.updater = TransferStatusUpdater.getInstance(context.getApplicationContext());
        TransferThreadPool.init(transferUtilityOptions.getTransferThreadPoolSize());
        this.connManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static <X extends AmazonWebServiceRequest> X appendMultipartTransferServiceUserAgentString(X x9) {
        x9.getRequestClientOptions().appendUserAgent("TransferService_multipart/" + getUserAgentFromConfig() + VersionInfoUtils.getVersion());
        return x9;
    }

    public static <X extends AmazonWebServiceRequest> X appendTransferServiceUserAgentString(X x9) {
        x9.getRequestClientOptions().appendUserAgent("TransferService/" + getUserAgentFromConfig() + VersionInfoUtils.getVersion());
        return x9;
    }

    public static Builder builder() {
        return new Builder();
    }

    private int createMultipartUploadRecords(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        long length = file.length();
        double d9 = length;
        long jMax = (long) Math.max(Math.ceil(d9 / 10000.0d), this.transferUtilityOptions.getMinimumUploadPartSizeInBytes());
        int iCeil = ((int) Math.ceil(d9 / jMax)) + 1;
        ContentValues[] contentValuesArr = new ContentValues[iCeil];
        contentValuesArr[0] = this.dbUtil.generateContentValuesForMultiPartUpload(str, str2, file, 0L, 0, "", file.length(), 0, objectMetadata, cannedAccessControlList, this.transferUtilityOptions);
        long j9 = 0;
        int i9 = 1;
        for (int i10 = 1; i10 < iCeil; i10++) {
            long jMin = Math.min(jMax, length);
            length -= jMax;
            contentValuesArr[i10] = this.dbUtil.generateContentValuesForMultiPartUpload(str, str2, file, j9, i9, "", jMin, length <= 0 ? 1 : 0, objectMetadata, cannedAccessControlList, this.transferUtilityOptions);
            j9 += jMax;
            i9++;
        }
        return this.dbUtil.bulkInsertTransferRecords(contentValuesArr);
    }

    private String getDefaultBucketOrThrow() {
        String str = this.defaultBucket;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("TransferUtility has not been configured with a default bucket. Please use the corresponding method that specifies bucket name or configure the default bucket name in construction of the object. See TransferUtility.builder().defaultBucket() or TransferUtility.builder().awsConfiguration()");
    }

    private List<Integer> getTransferIdsWithTypeAndStates(TransferType transferType, TransferState[] transferStateArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQueryTransfersWithTypeAndStates = null;
        try {
            cursorQueryTransfersWithTypeAndStates = this.dbUtil.queryTransfersWithTypeAndStates(transferType, transferStateArr);
            while (cursorQueryTransfersWithTypeAndStates.moveToNext()) {
                if (cursorQueryTransfersWithTypeAndStates.getInt(cursorQueryTransfersWithTypeAndStates.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)) == 0) {
                    arrayList.add(Integer.valueOf(cursorQueryTransfersWithTypeAndStates.getInt(cursorQueryTransfersWithTypeAndStates.getColumnIndexOrThrow("_id"))));
                }
            }
            cursorQueryTransfersWithTypeAndStates.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQueryTransfersWithTypeAndStates != null) {
                cursorQueryTransfersWithTypeAndStates.close();
            }
            throw th;
        }
    }

    private static String getUserAgentFromConfig() {
        synchronized (LOCK) {
            try {
                String str = userAgentFromConfig;
                if (str != null && !str.trim().isEmpty()) {
                    return userAgentFromConfig.trim() + "/";
                }
                return "";
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setUserAgentFromConfig(String str) {
        synchronized (LOCK) {
            userAgentFromConfig = str;
        }
    }

    private boolean shouldUploadInMultipart(File file) {
        return file != null && file.length() > this.transferUtilityOptions.getMinimumUploadPartSizeInBytes();
    }

    private synchronized void submitTransferJob(String str, int i9) {
        S3ClientReference.put(Integer.valueOf(i9), this.f18379s3);
        TransferRecord transfer = this.updater.getTransfer(i9);
        if (transfer == null) {
            transfer = this.dbUtil.getTransferById(i9);
            if (transfer == null) {
                LOGGER.error("Cannot find transfer with id: " + i9);
                return;
            }
            this.updater.addTransfer(transfer);
        } else if (TRANSFER_ADD.equals(str)) {
            LOGGER.warn("Transfer has already been added: " + i9);
            return;
        }
        if (TRANSFER_ADD.equals(str) || TRANSFER_RESUME.equals(str)) {
            transfer.start(this.f18379s3, this.dbUtil, this.updater, this.connManager);
        } else if (TRANSFER_PAUSE.equals(str)) {
            transfer.pause(this.f18379s3, this.updater);
        } else if (TRANSFER_CANCEL.equals(str)) {
            transfer.cancel(this.f18379s3, this.updater);
        } else {
            LOGGER.error("Unknown action: " + str);
        }
    }

    private File writeInputStreamToFile(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("Invalid inputStream: " + inputStream);
        }
        File fileCreateTempFile = File.createTempFile("aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002", ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i9 = inputStream.read(bArr);
                    if (i9 == -1) {
                        return fileCreateTempFile;
                    }
                    fileOutputStream.write(bArr, 0, i9);
                    fileOutputStream.flush();
                }
            } catch (IOException e9) {
                fileCreateTempFile.delete();
                throw new IOException("Error writing the inputStream into a file.", e9);
            }
        } finally {
            fileOutputStream.close();
        }
    }

    public boolean cancel(int i9) {
        submitTransferJob(TRANSFER_CANCEL, i9);
        return true;
    }

    public void cancelAllWithType(TransferType transferType) {
        Cursor cursorQueryAllTransfersWithType = null;
        try {
            cursorQueryAllTransfersWithType = this.dbUtil.queryAllTransfersWithType(transferType);
            while (cursorQueryAllTransfersWithType.moveToNext()) {
                cancel(cursorQueryAllTransfersWithType.getInt(cursorQueryAllTransfersWithType.getColumnIndexOrThrow("_id")));
            }
            cursorQueryAllTransfersWithType.close();
        } catch (Throwable th) {
            if (cursorQueryAllTransfersWithType != null) {
                cursorQueryAllTransfersWithType.close();
            }
            throw th;
        }
    }

    public boolean deleteTransferRecord(int i9) {
        cancel(i9);
        return this.dbUtil.deleteTransferRecords(i9) > 0;
    }

    public TransferObserver download(String str, File file) {
        return download(getDefaultBucketOrThrow(), str, file, null);
    }

    public TransferObserver download(String str, File file, TransferListener transferListener) {
        return download(getDefaultBucketOrThrow(), str, file, transferListener);
    }

    public TransferObserver download(String str, String str2, File file) {
        return download(str, str2, file, null);
    }

    public TransferObserver download(String str, String str2, File file, TransferListener transferListener) {
        if (file == null || file.isDirectory()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        int i9 = Integer.parseInt(this.dbUtil.insertSingleTransferRecord(TransferType.DOWNLOAD, str, str2, file, this.transferUtilityOptions).getLastPathSegment());
        if (file.isFile()) {
            LOGGER.warn("Overwrite existing file: " + file);
            file.delete();
        }
        TransferObserver transferObserver = new TransferObserver(i9, this.dbUtil, str, str2, file, transferListener);
        submitTransferJob(TRANSFER_ADD, i9);
        return transferObserver;
    }

    public TransferDBUtil getDbUtil() {
        return this.dbUtil;
    }

    public TransferObserver getTransferById(int i9) throws Throwable {
        Cursor cursorQueryTransferById;
        Cursor cursor = null;
        try {
            cursorQueryTransferById = this.dbUtil.queryTransferById(i9);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!cursorQueryTransferById.moveToNext()) {
                cursorQueryTransferById.close();
                return null;
            }
            TransferObserver transferObserver = new TransferObserver(i9, this.dbUtil);
            transferObserver.updateFromDB(cursorQueryTransferById);
            cursorQueryTransferById.close();
            return transferObserver;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorQueryTransferById;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public List<TransferObserver> getTransfersWithType(TransferType transferType) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQueryAllTransfersWithType = null;
        try {
            cursorQueryAllTransfersWithType = this.dbUtil.queryAllTransfersWithType(transferType);
            while (cursorQueryAllTransfersWithType.moveToNext()) {
                TransferObserver transferObserver = new TransferObserver(cursorQueryAllTransfersWithType.getInt(cursorQueryAllTransfersWithType.getColumnIndexOrThrow("_id")), this.dbUtil);
                transferObserver.updateFromDB(cursorQueryAllTransfersWithType);
                arrayList.add(transferObserver);
            }
            cursorQueryAllTransfersWithType.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQueryAllTransfersWithType != null) {
                cursorQueryAllTransfersWithType.close();
            }
            throw th;
        }
    }

    public List<TransferObserver> getTransfersWithTypeAndState(TransferType transferType, TransferState transferState) {
        return getTransfersWithTypeAndStates(transferType, new TransferState[]{transferState});
    }

    public List<TransferObserver> getTransfersWithTypeAndStates(TransferType transferType, TransferState[] transferStateArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQueryTransfersWithTypeAndStates = null;
        try {
            cursorQueryTransfersWithTypeAndStates = this.dbUtil.queryTransfersWithTypeAndStates(transferType, transferStateArr);
            while (cursorQueryTransfersWithTypeAndStates.moveToNext()) {
                if (cursorQueryTransfersWithTypeAndStates.getInt(cursorQueryTransfersWithTypeAndStates.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)) == 0) {
                    TransferObserver transferObserver = new TransferObserver(cursorQueryTransfersWithTypeAndStates.getInt(cursorQueryTransfersWithTypeAndStates.getColumnIndexOrThrow("_id")), this.dbUtil);
                    transferObserver.updateFromDB(cursorQueryTransfersWithTypeAndStates);
                    arrayList.add(transferObserver);
                }
            }
            cursorQueryTransfersWithTypeAndStates.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQueryTransfersWithTypeAndStates != null) {
                cursorQueryTransfersWithTypeAndStates.close();
            }
            throw th;
        }
    }

    public boolean pause(int i9) {
        submitTransferJob(TRANSFER_PAUSE, i9);
        return true;
    }

    public void pauseAllWithType(TransferType transferType) {
        Cursor cursorQueryAllTransfersWithType = null;
        try {
            cursorQueryAllTransfersWithType = this.dbUtil.queryAllTransfersWithType(transferType);
            while (cursorQueryAllTransfersWithType.moveToNext()) {
                pause(cursorQueryAllTransfersWithType.getInt(cursorQueryAllTransfersWithType.getColumnIndexOrThrow("_id")));
            }
            cursorQueryAllTransfersWithType.close();
        } catch (Throwable th) {
            if (cursorQueryAllTransfersWithType != null) {
                cursorQueryAllTransfersWithType.close();
            }
            throw th;
        }
    }

    public TransferObserver resume(int i9) {
        submitTransferJob(TRANSFER_RESUME, i9);
        return getTransferById(i9);
    }

    public List<TransferObserver> resumeAllWithType(TransferType transferType) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = getTransferIdsWithTypeAndStates(transferType, new TransferState[]{TransferState.PAUSED, TransferState.FAILED, TransferState.CANCELED}).iterator();
        while (it.hasNext()) {
            arrayList.add(resume(it.next().intValue()));
        }
        return arrayList;
    }

    public TransferObserver upload(String str, File file) {
        return upload(getDefaultBucketOrThrow(), str, file, new ObjectMetadata());
    }

    public TransferObserver upload(String str, File file, CannedAccessControlList cannedAccessControlList) {
        return upload(getDefaultBucketOrThrow(), str, file, new ObjectMetadata(), cannedAccessControlList);
    }

    public TransferObserver upload(String str, File file, ObjectMetadata objectMetadata) {
        return upload(getDefaultBucketOrThrow(), str, file, objectMetadata, (CannedAccessControlList) null);
    }

    public TransferObserver upload(String str, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        return upload(getDefaultBucketOrThrow(), str, file, objectMetadata, cannedAccessControlList, null);
    }

    public TransferObserver upload(String str, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferListener transferListener) {
        return upload(getDefaultBucketOrThrow(), str, file, objectMetadata, cannedAccessControlList, transferListener);
    }

    public TransferObserver upload(String str, InputStream inputStream) throws IOException {
        return upload(str, inputStream, UploadOptions.builder().build());
    }

    public TransferObserver upload(String str, InputStream inputStream, UploadOptions uploadOptions) throws IOException {
        return upload(uploadOptions.getBucket() != null ? uploadOptions.getBucket() : getDefaultBucketOrThrow(), str, writeInputStreamToFile(inputStream), uploadOptions.getMetadata() != null ? uploadOptions.getMetadata() : new ObjectMetadata(), uploadOptions.getCannedAcl(), uploadOptions.getTransferListener());
    }

    public TransferObserver upload(String str, String str2, File file) {
        return upload(str, str2, file, new ObjectMetadata());
    }

    public TransferObserver upload(String str, String str2, File file, CannedAccessControlList cannedAccessControlList) {
        return upload(str, str2, file, new ObjectMetadata(), cannedAccessControlList);
    }

    public TransferObserver upload(String str, String str2, File file, ObjectMetadata objectMetadata) {
        return upload(str, str2, file, objectMetadata, (CannedAccessControlList) null);
    }

    public TransferObserver upload(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        return upload(str, str2, file, objectMetadata, cannedAccessControlList, null);
    }

    public TransferObserver upload(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferListener transferListener) {
        if (file == null || file.isDirectory() || !file.exists()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        int iCreateMultipartUploadRecords = shouldUploadInMultipart(file) ? createMultipartUploadRecords(str, str2, file, objectMetadata, cannedAccessControlList) : Integer.parseInt(this.dbUtil.insertSingleTransferRecord(TransferType.UPLOAD, str, str2, file, objectMetadata, cannedAccessControlList, this.transferUtilityOptions).getLastPathSegment());
        TransferObserver transferObserver = new TransferObserver(iCreateMultipartUploadRecords, this.dbUtil, str, str2, file, transferListener);
        submitTransferJob(TRANSFER_ADD, iCreateMultipartUploadRecords);
        return transferObserver;
    }
}
