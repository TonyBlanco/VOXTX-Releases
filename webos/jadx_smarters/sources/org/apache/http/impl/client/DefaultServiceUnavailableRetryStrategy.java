package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class DefaultServiceUnavailableRetryStrategy implements ServiceUnavailableRetryStrategy {
    private final int maxRetries;
    private final long retryInterval;

    public DefaultServiceUnavailableRetryStrategy() {
        this(1, 1000);
    }

    public DefaultServiceUnavailableRetryStrategy(int i9, int i10) {
        Args.positive(i9, "Max retries");
        Args.positive(i10, "Retry interval");
        this.maxRetries = i9;
        this.retryInterval = i10;
    }

    @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
    public long getRetryInterval() {
        return this.retryInterval;
    }

    @Override // org.apache.http.client.ServiceUnavailableRetryStrategy
    public boolean retryRequest(HttpResponse httpResponse, int i9, HttpContext httpContext) {
        return i9 <= this.maxRetries && httpResponse.getStatusLine().getStatusCode() == 503;
    }
}
