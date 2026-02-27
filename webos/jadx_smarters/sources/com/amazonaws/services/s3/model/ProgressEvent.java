package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {
    public ProgressEvent(int i9) {
        super(i9);
    }

    public ProgressEvent(int i9, long j9) {
        super(i9, j9);
    }

    @Deprecated
    public int getBytesTransfered() {
        return (int) getBytesTransferred();
    }

    @Deprecated
    public void setBytesTransfered(int i9) {
        setBytesTransferred(i9);
    }
}
