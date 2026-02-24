package org.apache.http.conn;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpClientConnection;
import org.apache.http.concurrent.Cancellable;

/* JADX INFO: loaded from: classes4.dex */
public interface ConnectionRequest extends Cancellable {
    HttpClientConnection get(long j9, TimeUnit timeUnit) throws ExecutionException, InterruptedException, ConnectionPoolTimeoutException;
}
