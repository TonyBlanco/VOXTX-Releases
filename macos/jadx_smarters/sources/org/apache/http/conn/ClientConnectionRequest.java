package org.apache.http.conn;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ClientConnectionRequest {
    void abortRequest();

    ManagedClientConnection getConnection(long j9, TimeUnit timeUnit) throws InterruptedException, ConnectionPoolTimeoutException;
}
