package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class TransferObserver {
    private String bucket;
    private long bytesTotal;
    private long bytesTransferred;
    private final TransferDBUtil dbUtil;
    private String filePath;
    private final int id;
    private String key;
    private TransferStatusListener statusListener;
    private TransferListener transferListener;
    private TransferState transferState;

    public class TransferStatusListener implements TransferListener {
        public TransferStatusListener() {
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onError(int i9, Exception exc) {
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onProgressChanged(int i9, long j9, long j10) {
            TransferObserver.this.bytesTransferred = j9;
            TransferObserver.this.bytesTotal = j10;
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onStateChanged(int i9, TransferState transferState) {
            TransferObserver.this.transferState = transferState;
        }
    }

    public TransferObserver(int i9, TransferDBUtil transferDBUtil) {
        this.id = i9;
        this.dbUtil = transferDBUtil;
    }

    public TransferObserver(int i9, TransferDBUtil transferDBUtil, String str, String str2, File file) {
        this.id = i9;
        this.dbUtil = transferDBUtil;
        this.bucket = str;
        this.key = str2;
        this.filePath = file.getAbsolutePath();
        this.bytesTotal = file.length();
        this.transferState = TransferState.WAITING;
    }

    public TransferObserver(int i9, TransferDBUtil transferDBUtil, String str, String str2, File file, TransferListener transferListener) {
        this(i9, transferDBUtil, str, str2, file);
        setTransferListener(transferListener);
    }

    public void cleanTransferListener() {
        synchronized (this) {
            try {
                TransferListener transferListener = this.transferListener;
                if (transferListener != null) {
                    TransferStatusUpdater.unregisterListener(this.id, transferListener);
                    this.transferListener = null;
                }
                TransferStatusListener transferStatusListener = this.statusListener;
                if (transferStatusListener != null) {
                    TransferStatusUpdater.unregisterListener(this.id, transferStatusListener);
                    this.statusListener = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getAbsoluteFilePath() {
        return this.filePath;
    }

    public String getBucket() {
        return this.bucket;
    }

    public long getBytesTotal() {
        return this.bytesTotal;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public int getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public TransferState getState() {
        return this.transferState;
    }

    public void refresh() {
        Cursor cursorQueryTransferById = null;
        try {
            cursorQueryTransferById = this.dbUtil.queryTransferById(this.id);
            if (cursorQueryTransferById.moveToFirst()) {
                updateFromDB(cursorQueryTransferById);
            }
            cursorQueryTransferById.close();
        } catch (Throwable th) {
            if (cursorQueryTransferById != null) {
                cursorQueryTransferById.close();
            }
            throw th;
        }
    }

    public void setTransferListener(TransferListener transferListener) {
        synchronized (this) {
            try {
                cleanTransferListener();
                if (this.statusListener == null) {
                    TransferStatusListener transferStatusListener = new TransferStatusListener();
                    this.statusListener = transferStatusListener;
                    TransferStatusUpdater.registerListener(this.id, transferStatusListener);
                }
                if (transferListener != null) {
                    this.transferListener = transferListener;
                    transferListener.onStateChanged(this.id, this.transferState);
                    TransferStatusUpdater.registerListener(this.id, this.transferListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "TransferObserver{id=" + this.id + ", bucket='" + this.bucket + "', key='" + this.key + "', bytesTotal=" + this.bytesTotal + ", bytesTransferred=" + this.bytesTransferred + ", transferState=" + this.transferState + ", filePath='" + this.filePath + "'}";
    }

    public void updateFromDB(Cursor cursor) {
        this.bucket = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME));
        this.key = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        this.bytesTotal = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
        this.bytesTransferred = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
        this.transferState = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.filePath = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
    }
}
