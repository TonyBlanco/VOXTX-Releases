package org.apache.http.impl.io;

import org.apache.http.io.HttpTransportMetrics;

/* JADX INFO: loaded from: classes4.dex */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred = 0;

    @Override // org.apache.http.io.HttpTransportMetrics
    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void incrementBytesTransferred(long j9) {
        this.bytesTransferred += j9;
    }

    @Override // org.apache.http.io.HttpTransportMetrics
    public void reset() {
        this.bytesTransferred = 0L;
    }

    public void setBytesTransferred(long j9) {
        this.bytesTransferred = j9;
    }
}
