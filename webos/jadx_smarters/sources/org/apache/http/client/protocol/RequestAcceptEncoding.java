package org.apache.http.client.protocol;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class RequestAcceptEncoding implements HttpRequestInterceptor {
    private final String acceptEncoding;

    public RequestAcceptEncoding() {
        this(null);
    }

    public RequestAcceptEncoding(List<String> list) {
        String string;
        if (list == null || list.isEmpty()) {
            string = "gzip,deflate";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < list.size(); i9++) {
                if (i9 > 0) {
                    sb.append(",");
                }
                sb.append(list.get(i9));
            }
            string = sb.toString();
        }
        this.acceptEncoding = string;
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        RequestConfig requestConfig = HttpClientContext.adapt(httpContext).getRequestConfig();
        if (httpRequest.containsHeader(HttpHeaders.ACCEPT_ENCODING) || !requestConfig.isContentCompressionEnabled()) {
            return;
        }
        httpRequest.addHeader(HttpHeaders.ACCEPT_ENCODING, this.acceptEncoding);
    }
}
