package com.amazonaws.mobileconnectors.s3.transferutility;

import android.support.v4.media.session.PlaybackStateCompat;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtilityOptions implements Serializable {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferUtilityOptions.class);
    private static final int MILLIS_IN_MINUTE = 60000;
    private static final long serialVersionUID = 1;
    private long minimumUploadPartSizeInBytes;
    protected TransferNetworkConnectionType transferNetworkConnectionType;

    @Deprecated
    private long transferServiceCheckTimeInterval;
    private int transferThreadPoolSize;

    public TransferUtilityOptions() {
        this.transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
        this.transferThreadPoolSize = getDefaultThreadPoolSize();
        this.transferNetworkConnectionType = getDefaultTransferNetworkConnectionType();
        this.minimumUploadPartSizeInBytes = 5242880L;
    }

    public TransferUtilityOptions(int i9, TransferNetworkConnectionType transferNetworkConnectionType) {
        this.transferServiceCheckTimeInterval = getDefaultCheckTimeInterval();
        this.transferThreadPoolSize = i9;
        this.transferNetworkConnectionType = transferNetworkConnectionType;
        this.minimumUploadPartSizeInBytes = 5242880L;
    }

    @Deprecated
    public static long getDefaultCheckTimeInterval() {
        return 60000L;
    }

    public static int getDefaultThreadPoolSize() {
        return (Runtime.getRuntime().availableProcessors() + 1) * 2;
    }

    public static TransferNetworkConnectionType getDefaultTransferNetworkConnectionType() {
        return TransferNetworkConnectionType.ANY;
    }

    public long getMinimumUploadPartSizeInBytes() {
        return this.minimumUploadPartSizeInBytes;
    }

    public int getMinimumUploadPartSizeInMB() {
        return (int) (this.minimumUploadPartSizeInBytes / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
    }

    public TransferNetworkConnectionType getTransferNetworkConnectionType() {
        return this.transferNetworkConnectionType;
    }

    @Deprecated
    public long getTransferServiceCheckTimeInterval() {
        return this.transferServiceCheckTimeInterval;
    }

    public int getTransferThreadPoolSize() {
        return this.transferThreadPoolSize;
    }

    public void setMinimumUploadPartSizeInMB(int i9) {
        Log log;
        String str;
        long j9 = ((long) i9) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long j10 = 5368709120L;
        if (j9 > 5368709120L) {
            log = LOGGER;
            str = "The provided minimumUploadPartSize is greater than the maximum upload part size limit. Setting upload part size to the maximum allowed value of5MB.";
        } else {
            j10 = 5242880;
            if (j9 >= 5242880) {
                this.minimumUploadPartSizeInBytes = j9;
                return;
            } else {
                log = LOGGER;
                str = "The provided minimumUploadPartSize is less than the minimum upload part size limit. Setting upload part size to the minimum allowed value of5MB.";
            }
        }
        log.warn(str);
        this.minimumUploadPartSizeInBytes = j10;
    }

    @Deprecated
    public void setTransferServiceCheckTimeInterval(long j9) {
    }

    public void setTransferThreadPoolSize(int i9) {
        if (i9 < 0) {
            i9 = getDefaultThreadPoolSize();
        }
        this.transferThreadPoolSize = i9;
    }
}
