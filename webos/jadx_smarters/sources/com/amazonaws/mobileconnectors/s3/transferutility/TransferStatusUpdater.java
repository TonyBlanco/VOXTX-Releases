package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
class TransferStatusUpdater {
    static final String TEMP_FILE_PREFIX = "aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002";
    private static TransferDBUtil dbUtil;
    private static TransferStatusUpdater transferStatusUpdater;
    private Context context;
    private final Handler mainHandler;
    private final Map<Integer, TransferRecord> transfers;
    private static final Log LOGGER = LogFactory.getLog((Class<?>) TransferStatusUpdater.class);
    private static final HashSet<TransferState> STATES_NOT_TO_NOTIFY = new HashSet<>(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));
    static final Map<Integer, List<TransferListener>> LISTENERS = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    public class TransferProgressListener implements ProgressListener {
        private long bytesTransferredSoFar;
        private final TransferRecord transfer;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.transfer = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public synchronized void progressChanged(ProgressEvent progressEvent) {
            try {
                if (32 == progressEvent.getEventCode()) {
                    TransferStatusUpdater.LOGGER.info("Reset Event triggered. Resetting the bytesCurrent to 0.");
                    this.bytesTransferredSoFar = 0L;
                } else {
                    long bytesTransferred = this.bytesTransferredSoFar + progressEvent.getBytesTransferred();
                    this.bytesTransferredSoFar = bytesTransferred;
                    TransferRecord transferRecord = this.transfer;
                    if (bytesTransferred > transferRecord.bytesCurrent) {
                        transferRecord.bytesCurrent = bytesTransferred;
                        TransferStatusUpdater.this.updateProgress(transferRecord.id, bytesTransferred, transferRecord.bytesTotal, true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil, Context context) {
        dbUtil = transferDBUtil;
        this.context = context;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.transfers = new ConcurrentHashMap();
    }

    public static synchronized TransferStatusUpdater getInstance(Context context) {
        try {
            if (transferStatusUpdater == null) {
                TransferDBUtil transferDBUtil = new TransferDBUtil(context);
                dbUtil = transferDBUtil;
                transferStatusUpdater = new TransferStatusUpdater(transferDBUtil, context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return transferStatusUpdater;
    }

    public static void registerListener(int i9, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            try {
                List<TransferListener> list = map.get(Integer.valueOf(i9));
                if (list == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(transferListener);
                    map.put(Integer.valueOf(i9), copyOnWriteArrayList);
                } else if (!list.contains(transferListener)) {
                    list.add(transferListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void unregisterListener(int i9, TransferListener transferListener) {
        if (transferListener == null) {
            throw new IllegalArgumentException("Listener can't be null");
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            try {
                List<TransferListener> list = map.get(Integer.valueOf(i9));
                if (list != null && !list.isEmpty()) {
                    list.remove(transferListener);
                }
            } finally {
            }
        }
    }

    public synchronized void addTransfer(TransferRecord transferRecord) {
        this.transfers.put(Integer.valueOf(transferRecord.id), transferRecord);
    }

    public synchronized void clear() {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.clear();
        }
        this.transfers.clear();
    }

    public synchronized TransferRecord getTransfer(int i9) {
        return this.transfers.get(Integer.valueOf(i9));
    }

    public synchronized Map<Integer, TransferRecord> getTransfers() {
        return Collections.unmodifiableMap(this.transfers);
    }

    public synchronized ProgressListener newProgressListener(int i9) {
        TransferRecord transfer;
        transfer = getTransfer(i9);
        if (transfer == null) {
            LOGGER.info("TransferStatusUpdater doesn't track the transfer: " + i9);
            throw new IllegalArgumentException("transfer " + i9 + " doesn't exist");
        }
        LOGGER.info("Creating a new progress listener for transfer: " + i9);
        return new TransferProgressListener(transfer);
    }

    public synchronized void removeTransfer(int i9) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.remove(Integer.valueOf(i9));
        }
        this.transfers.remove(Integer.valueOf(i9));
    }

    public synchronized void removeTransferRecordFromDB(int i9) {
        try {
            TransferRecord transferById = dbUtil.getTransferById(i9);
            if (transferById != null) {
                String str = transferById.file;
                if (new File(str).getName().startsWith(TEMP_FILE_PREFIX)) {
                    new File(str).delete();
                }
            }
            S3ClientReference.remove(Integer.valueOf(i9));
            dbUtil.deleteTransferRecords(i9);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void throwError(final int i9, final Exception exc) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            try {
                List<TransferListener> list = map.get(Integer.valueOf(i9));
                if (list != null && !list.isEmpty()) {
                    for (final TransferListener transferListener : list) {
                        this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                            @Override // java.lang.Runnable
                            public void run() {
                                transferListener.onError(i9, exc);
                            }
                        });
                    }
                }
            } finally {
            }
        }
    }

    public synchronized void updateProgress(final int i9, final long j9, final long j10, boolean z9) {
        try {
            TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i9));
            if (transferRecord != null) {
                transferRecord.bytesCurrent = j9;
                transferRecord.bytesTotal = j10;
            }
            dbUtil.updateBytesTransferred(i9, j9);
            if (z9) {
                Map<Integer, List<TransferListener>> map = LISTENERS;
                synchronized (map) {
                    try {
                        List<TransferListener> list = map.get(Integer.valueOf(i9));
                        if (list != null && !list.isEmpty()) {
                            for (Iterator<TransferListener> it = list.iterator(); it.hasNext(); it = it) {
                                final TransferListener next = it.next();
                                this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        next.onProgressChanged(i9, j9, j10);
                                    }
                                });
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateState(final int i9, final TransferState transferState) {
        Log log;
        String str;
        try {
            boolean zContains = STATES_NOT_TO_NOTIFY.contains(transferState);
            TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i9));
            if (transferRecord != null) {
                zContains |= transferState.equals(transferRecord.state);
                transferRecord.state = transferState;
                if (dbUtil.updateTransferRecord(transferRecord) == 0) {
                    log = LOGGER;
                    str = "Failed to update the status of transfer " + i9;
                    log.warn(str);
                }
            } else if (dbUtil.updateState(i9, transferState) == 0) {
                log = LOGGER;
                str = "Failed to update the status of transfer " + i9;
                log.warn(str);
            }
            if (zContains) {
                return;
            }
            if (TransferState.COMPLETED.equals(transferState)) {
                removeTransferRecordFromDB(i9);
            }
            Map<Integer, List<TransferListener>> map = LISTENERS;
            synchronized (map) {
                try {
                    List<TransferListener> list = map.get(Integer.valueOf(i9));
                    if (list != null && !list.isEmpty()) {
                        for (final TransferListener transferListener : list) {
                            if (transferListener instanceof TransferObserver.TransferStatusListener) {
                                transferListener.onStateChanged(i9, transferState);
                            } else {
                                this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        transferListener.onStateChanged(i9, transferState);
                                    }
                                });
                            }
                        }
                        if (TransferState.isFinalState(transferState)) {
                            list.clear();
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
