package com.amazonaws.mobileconnectors.s3.transferutility;

/* JADX INFO: loaded from: classes.dex */
public interface TransferListener {
    void onError(int i9, Exception exc);

    void onProgressChanged(int i9, long j9, long j10);

    void onStateChanged(int i9, TransferState transferState);
}
