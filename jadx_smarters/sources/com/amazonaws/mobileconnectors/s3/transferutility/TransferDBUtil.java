package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.json.JsonUtils;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class TransferDBUtil {
    private static final String QUERY_PLACE_HOLDER_STRING = ",?";
    private static TransferDBBase transferDBBase;
    private Gson gson = new Gson();
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferDBUtil.class);
    private static final Object LOCK = new Object();

    public TransferDBUtil(Context context) {
        synchronized (LOCK) {
            try {
                if (transferDBBase == null) {
                    transferDBBase = new TransferDBBase(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String createPlaceholders(int i9) {
        if (i9 <= 0) {
            LOGGER.error("Cannot create a string of 0 or less placeholders.");
            return null;
        }
        StringBuilder sb = new StringBuilder((i9 * 2) - 1);
        sb.append("?");
        for (int i10 = 1; i10 < i9; i10++) {
            sb.append(QUERY_PLACE_HOLDER_STRING);
        }
        return sb.toString();
    }

    private ContentValues generateContentValuesForObjectMetadata(ObjectMetadata objectMetadata) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_USER_METADATA, JsonUtils.mapToString(objectMetadata.getUserMetadata()));
        contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_TYPE, objectMetadata.getContentType());
        contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_ENCODING, objectMetadata.getContentEncoding());
        contentValues.put(TransferTable.COLUMN_HEADER_CACHE_CONTROL, objectMetadata.getCacheControl());
        contentValues.put(TransferTable.COLUMN_CONTENT_MD5, objectMetadata.getContentMD5());
        contentValues.put(TransferTable.COLUMN_HEADER_CONTENT_DISPOSITION, objectMetadata.getContentDisposition());
        contentValues.put(TransferTable.COLUMN_SSE_ALGORITHM, objectMetadata.getSSEAlgorithm());
        contentValues.put(TransferTable.COLUMN_SSE_KMS_KEY, objectMetadata.getSSEAwsKmsKeyId());
        contentValues.put(TransferTable.COLUMN_EXPIRATION_TIME_RULE_ID, objectMetadata.getExpirationTimeRuleId());
        if (objectMetadata.getHttpExpiresDate() != null) {
            contentValues.put(TransferTable.COLUMN_HTTP_EXPIRES_DATE, String.valueOf(objectMetadata.getHttpExpiresDate().getTime()));
        }
        if (objectMetadata.getStorageClass() != null) {
            contentValues.put(TransferTable.COLUMN_HEADER_STORAGE_CLASS, objectMetadata.getStorageClass());
        }
        return contentValues;
    }

    private ContentValues generateContentValuesForSinglePartTransfer(TransferType transferType, String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferUtilityOptions transferUtilityOptions) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", transferType.toString());
        contentValues.put("state", TransferState.WAITING.toString());
        contentValues.put(TransferTable.COLUMN_BUCKET_NAME, str);
        contentValues.put("key", str2);
        contentValues.put(TransferTable.COLUMN_FILE, file.getAbsolutePath());
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, (Long) 0L);
        if (transferType.equals(TransferType.UPLOAD)) {
            contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(file.length()));
        }
        contentValues.put(TransferTable.COLUMN_IS_MULTIPART, (Integer) 0);
        contentValues.put(TransferTable.COLUMN_PART_NUM, (Integer) 0);
        contentValues.put(TransferTable.COLUMN_IS_ENCRYPTED, (Integer) 0);
        contentValues.putAll(generateContentValuesForObjectMetadata(objectMetadata));
        if (cannedAccessControlList != null) {
            contentValues.put(TransferTable.COLUMN_CANNED_ACL, cannedAccessControlList.toString());
        }
        if (transferUtilityOptions != null) {
            contentValues.put(TransferTable.COLUMN_TRANSFER_UTILITY_OPTIONS, this.gson.toJson(transferUtilityOptions));
        }
        return contentValues;
    }

    public static TransferDBBase getTransferDBBase(Context context) {
        TransferDBBase transferDBBase2;
        synchronized (LOCK) {
            try {
                if (transferDBBase == null) {
                    transferDBBase = new TransferDBBase(context);
                }
                transferDBBase2 = transferDBBase;
            } catch (Throwable th) {
                throw th;
            }
        }
        return transferDBBase2;
    }

    public int bulkInsertTransferRecords(ContentValues[] contentValuesArr) {
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.bulkInsert(transferDBBase2.getContentUri(), contentValuesArr);
    }

    public int cancelAllWithType(TransferType transferType) {
        String str;
        String[] strArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.PENDING_CANCEL.toString());
        if (transferType == TransferType.ANY) {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), TransferState.PAUSED.toString(), TransferState.WAITING_FOR_NETWORK.toString()};
            str = "state in (?,?,?,?,?)";
        } else {
            str = "state in (?,?,?,?,?) and type=?";
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), TransferState.PAUSED.toString(), TransferState.WAITING_FOR_NETWORK.toString(), transferType.toString()};
        }
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.update(transferDBBase2.getContentUri(), contentValues, str, strArr);
    }

    public boolean checkWaitingForNetworkPartRequestsFromDB(int i9) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = transferDBBase.query(getPartUri(i9), null, "state=?", new String[]{TransferState.WAITING_FOR_NETWORK.toString()}, null);
            boolean zMoveToNext = cursorQuery.moveToNext();
            cursorQuery.close();
            return zMoveToNext;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public void closeDB() {
        synchronized (LOCK) {
            try {
                TransferDBBase transferDBBase2 = transferDBBase;
                if (transferDBBase2 != null) {
                    transferDBBase2.closeDBHelper();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int deleteTransferRecords(int i9) {
        return transferDBBase.delete(getRecordUri(i9), null, null);
    }

    public ContentValues generateContentValuesForMultiPartUpload(String str, String str2, File file, long j9, int i9, String str3, long j10, int i10, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferUtilityOptions transferUtilityOptions) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", TransferType.UPLOAD.toString());
        contentValues.put("state", TransferState.WAITING.toString());
        contentValues.put(TransferTable.COLUMN_BUCKET_NAME, str);
        contentValues.put("key", str2);
        contentValues.put(TransferTable.COLUMN_FILE, file.getAbsolutePath());
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, (Long) 0L);
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j10));
        contentValues.put(TransferTable.COLUMN_IS_MULTIPART, (Integer) 1);
        contentValues.put(TransferTable.COLUMN_PART_NUM, Integer.valueOf(i9));
        contentValues.put(TransferTable.COLUMN_FILE_OFFSET, Long.valueOf(j9));
        contentValues.put(TransferTable.COLUMN_MULTIPART_ID, str3);
        contentValues.put(TransferTable.COLUMN_IS_LAST_PART, Integer.valueOf(i10));
        contentValues.put(TransferTable.COLUMN_IS_ENCRYPTED, (Integer) 0);
        contentValues.putAll(generateContentValuesForObjectMetadata(objectMetadata));
        if (cannedAccessControlList != null) {
            contentValues.put(TransferTable.COLUMN_CANNED_ACL, cannedAccessControlList.toString());
        }
        if (transferUtilityOptions != null) {
            contentValues.put(TransferTable.COLUMN_TRANSFER_UTILITY_OPTIONS, this.gson.toJson(transferUtilityOptions));
        }
        return contentValues;
    }

    public Uri getContentUri() {
        return transferDBBase.getContentUri();
    }

    public List<UploadPartRequest> getNonCompletedPartRequestsFromDB(int i9, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = transferDBBase.query(getPartUri(i9), null, null, null, null);
            while (cursorQuery.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.getState(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest uploadPartRequestWithPartSize = new UploadPartRequest().withId(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("_id"))).withMainUploadId(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_MAIN_UPLOAD_ID))).withBucketName(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME))).withKey(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("key"))).withUploadId(str).withFile(new File(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_FILE)))).withFileOffset(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_FILE_OFFSET))).withPartNumber(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM))).withPartSize(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL)));
                    boolean z9 = true;
                    if (1 != cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_IS_LAST_PART))) {
                        z9 = false;
                    }
                    arrayList.add(uploadPartRequestWithPartSize.withLastPart(z9));
                }
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public Uri getPartUri(int i9) {
        return Uri.parse(transferDBBase.getContentUri() + "/part/" + i9);
    }

    public Uri getRecordUri(int i9) {
        return Uri.parse(transferDBBase.getContentUri() + "/" + i9);
    }

    public Uri getStateUri(TransferState transferState) {
        return Uri.parse(transferDBBase.getContentUri() + "/state/" + transferState.toString());
    }

    public TransferRecord getTransferById(int i9) throws Throwable {
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            Cursor cursorQueryTransferById = queryTransferById(i9);
            try {
                if (cursorQueryTransferById.moveToFirst()) {
                    transferRecord = new TransferRecord(i9);
                    transferRecord.updateFromDB(cursorQueryTransferById);
                }
                cursorQueryTransferById.close();
                return transferRecord;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQueryTransferById;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Uri insertMultipartUploadRecord(String str, String str2, File file, long j9, int i9, String str3, long j10, int i10, TransferUtilityOptions transferUtilityOptions) {
        ContentValues contentValuesGenerateContentValuesForMultiPartUpload = generateContentValuesForMultiPartUpload(str, str2, file, j9, i9, str3, j10, i10, new ObjectMetadata(), null, transferUtilityOptions);
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.insert(transferDBBase2.getContentUri(), contentValuesGenerateContentValuesForMultiPartUpload);
    }

    public Uri insertSingleTransferRecord(TransferType transferType, String str, String str2, File file, TransferUtilityOptions transferUtilityOptions) {
        return insertSingleTransferRecord(transferType, str, str2, file, new ObjectMetadata(), transferUtilityOptions);
    }

    public Uri insertSingleTransferRecord(TransferType transferType, String str, String str2, File file, ObjectMetadata objectMetadata, TransferUtilityOptions transferUtilityOptions) {
        return insertSingleTransferRecord(transferType, str, str2, file, objectMetadata, null, transferUtilityOptions);
    }

    public Uri insertSingleTransferRecord(TransferType transferType, String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferUtilityOptions transferUtilityOptions) {
        ContentValues contentValuesGenerateContentValuesForSinglePartTransfer = generateContentValuesForSinglePartTransfer(transferType, str, str2, file, objectMetadata, cannedAccessControlList, transferUtilityOptions);
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.insert(transferDBBase2.getContentUri(), contentValuesGenerateContentValuesForSinglePartTransfer);
    }

    public int pauseAllWithType(TransferType transferType) {
        String str;
        String[] strArr;
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.PENDING_PAUSE.toString());
        if (transferType == TransferType.ANY) {
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString()};
            str = "state in (?,?,?)";
        } else {
            str = "state in (?,?,?) and type=?";
            strArr = new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString(), transferType.toString()};
        }
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.update(transferDBBase2.getContentUri(), contentValues, str, strArr);
    }

    public Cursor queryAllTransfersWithType(TransferType transferType) {
        if (transferType == TransferType.ANY) {
            TransferDBBase transferDBBase2 = transferDBBase;
            return transferDBBase2.query(transferDBBase2.getContentUri(), null, null, null, null);
        }
        TransferDBBase transferDBBase3 = transferDBBase;
        return transferDBBase3.query(transferDBBase3.getContentUri(), null, "type=?", new String[]{transferType.toString()}, null);
    }

    public long queryBytesTransferredByMainUploadId(int i9) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = transferDBBase.query(getPartUri(i9), null, null, null, null);
            long j9 = 0;
            while (cursorQuery.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.getState(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("state"))))) {
                    j9 += cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
                }
            }
            cursorQuery.close();
            return j9;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r8 = r0.getLong(r0.getColumnIndexOrThrow(com.amazonaws.mobileconnectors.s3.transferutility.TransferTable.COLUMN_BYTES_CURRENT));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long queryBytesTransferredOfPartNum(int r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            com.amazonaws.mobileconnectors.s3.transferutility.TransferDBBase r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil.transferDBBase     // Catch: java.lang.Throwable -> L42
            android.net.Uri r2 = r7.getPartUri(r8)     // Catch: java.lang.Throwable -> L42
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L42
        Lf:
            boolean r8 = r0.moveToNext()     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L44
            java.lang.String r8 = "part_num"
            int r8 = r0.getColumnIndexOrThrow(r8)     // Catch: java.lang.Throwable -> L42
            int r8 = r0.getInt(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "state"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L42
            if (r8 != r9) goto Lf
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r8 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.PART_COMPLETED     // Catch: java.lang.Throwable -> L42
            com.amazonaws.mobileconnectors.s3.transferutility.TransferState r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferState.getState(r1)     // Catch: java.lang.Throwable -> L42
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto Lf
            java.lang.String r8 = "bytes_current"
            int r8 = r0.getColumnIndexOrThrow(r8)     // Catch: java.lang.Throwable -> L42
            long r8 = r0.getLong(r8)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r8 = move-exception
            goto L4a
        L44:
            r8 = 0
        L46:
            r0.close()
            return r8
        L4a:
            if (r0 == 0) goto L4f
            r0.close()
        L4f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferDBUtil.queryBytesTransferredOfPartNum(int, int):long");
    }

    public List<PartETag> queryPartETagsOfUpload(int i9) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = transferDBBase.query(getPartUri(i9), null, null, null, null);
            while (cursorQuery.moveToNext()) {
                arrayList.add(new PartETag(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(TransferTable.COLUMN_ETAG))));
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public Cursor queryTransferById(int i9) {
        return transferDBBase.query(getRecordUri(i9), null, null, null, null);
    }

    public Cursor queryTransfersWithTypeAndState(TransferType transferType, TransferState transferState) {
        return transferType == TransferType.ANY ? transferDBBase.query(getStateUri(transferState), null, null, null, null) : transferDBBase.query(getStateUri(transferState), null, "type=?", new String[]{transferType.toString()}, null);
    }

    public Cursor queryTransfersWithTypeAndStates(TransferType transferType, TransferState[] transferStateArr) {
        String str;
        String[] strArr;
        int length = transferStateArr.length;
        String strCreatePlaceholders = createPlaceholders(length);
        int i9 = 0;
        if (transferType == TransferType.ANY) {
            String str2 = "state in (" + strCreatePlaceholders + ")";
            String[] strArr2 = new String[length];
            while (i9 < length) {
                strArr2[i9] = transferStateArr[i9].toString();
                i9++;
            }
            str = str2;
            strArr = strArr2;
        } else {
            String str3 = "state in (" + strCreatePlaceholders + ") and type=?";
            String[] strArr3 = new String[length + 1];
            while (i9 < length) {
                strArr3[i9] = transferStateArr[i9].toString();
                i9++;
            }
            strArr3[i9] = transferType.toString();
            str = str3;
            strArr = strArr3;
        }
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.query(transferDBBase2.getContentUri(), null, str, strArr, null);
    }

    public int setAllRunningRecordsToPausedBeforeShutdownService() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.PAUSED.toString());
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.update(transferDBBase2.getContentUri(), contentValues, "state in (?,?,?,?)", new String[]{TransferState.IN_PROGRESS.toString(), TransferState.PENDING_PAUSE.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString()});
    }

    public int updateBytesTotalForDownload(int i9, long j9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(j9));
        return transferDBBase.update(getRecordUri(i9), contentValues, null, null);
    }

    public int updateBytesTransferred(int i9, long j9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, Long.valueOf(j9));
        return transferDBBase.update(getRecordUri(i9), contentValues, null, null);
    }

    public int updateETag(int i9, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_ETAG, str);
        return transferDBBase.update(getRecordUri(i9), contentValues, null, null);
    }

    public int updateMultipartId(int i9, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TransferTable.COLUMN_MULTIPART_ID, str);
        return transferDBBase.update(getRecordUri(i9), contentValues, null, null);
    }

    public int updateNetworkConnected() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.RESUMED_WAITING.toString());
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.update(transferDBBase2.getContentUri(), contentValues, "state in (?,?)", new String[]{TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
    }

    public int updateNetworkDisconnected() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", TransferState.PENDING_NETWORK_DISCONNECT.toString());
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.update(transferDBBase2.getContentUri(), contentValues, "state in (?,?,?)", new String[]{TransferState.IN_PROGRESS.toString(), TransferState.RESUMED_WAITING.toString(), TransferState.WAITING.toString()});
    }

    public int updateState(int i9, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        return TransferState.FAILED.equals(transferState) ? transferDBBase.update(getRecordUri(i9), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()}) : transferDBBase.update(getRecordUri(i9), contentValues, null, null);
    }

    public int updateStateAndNotifyUpdate(int i9, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        TransferDBBase transferDBBase2 = transferDBBase;
        return transferDBBase2.update(transferDBBase2.getContentUri(), contentValues, "_id=" + i9, null);
    }

    public int updateTransferRecord(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(transferRecord.id));
        contentValues.put("state", transferRecord.state.toString());
        contentValues.put(TransferTable.COLUMN_BYTES_TOTAL, Long.valueOf(transferRecord.bytesTotal));
        contentValues.put(TransferTable.COLUMN_BYTES_CURRENT, Long.valueOf(transferRecord.bytesCurrent));
        return transferDBBase.update(getRecordUri(transferRecord.id), contentValues, null, null);
    }
}
