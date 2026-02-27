package org.apache.http.client;

import java.io.IOException;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpRequestRetryHandler {
    boolean retryRequest(IOException iOException, int i9, HttpContext httpContext);
}
