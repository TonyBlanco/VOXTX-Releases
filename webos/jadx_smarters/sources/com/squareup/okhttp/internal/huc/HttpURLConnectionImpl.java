package com.squareup.okhttp.internal.huc;

import com.squareup.okhttp.Handshake;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpDate;
import com.squareup.okhttp.internal.http.HttpEngine;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.internal.http.OkHeaders;
import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RetryableSink;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.StatusLine;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okio.BufferedSink;
import okio.Sink;
import org.apache.http.client.methods.HttpGet;

/* JADX INFO: loaded from: classes4.dex */
public class HttpURLConnectionImpl extends HttpURLConnection {
    final OkHttpClient client;
    private long fixedContentLength;
    Handshake handshake;
    protected HttpEngine httpEngine;
    protected IOException httpEngineFailure;
    private int redirectionCount;
    private Headers.Builder requestHeaders;
    private Headers responseHeaders;
    private Route route;

    public HttpURLConnectionImpl(URL url, OkHttpClient okHttpClient) {
        super(url);
        this.requestHeaders = new Headers.Builder();
        this.fixedContentLength = -1L;
        this.client = okHttpClient;
    }

    private String defaultUserAgent() {
        String property = System.getProperty("http.agent");
        if (property != null) {
            return property;
        }
        return "Java" + System.getProperty("java.version");
    }

    private boolean execute(boolean z9) throws RouteException, RequestException, IOException {
        try {
            this.httpEngine.sendRequest();
            this.route = this.httpEngine.getRoute();
            this.handshake = this.httpEngine.getConnection() != null ? this.httpEngine.getConnection().getHandshake() : null;
            if (!z9) {
                return true;
            }
            this.httpEngine.readResponse();
            return true;
        } catch (IOException e9) {
            HttpEngine httpEngineRecover = this.httpEngine.recover(e9);
            if (httpEngineRecover != null) {
                this.httpEngine = httpEngineRecover;
                return false;
            }
            this.httpEngineFailure = e9;
            throw e9;
        }
    }

    private Headers getHeaders() throws IOException {
        if (this.responseHeaders == null) {
            Response response = getResponse().getResponse();
            this.responseHeaders = response.headers().newBuilder().add(Platform.get().getPrefix() + "-Response-Source", responseSourceHeader(response)).build();
        }
        return this.responseHeaders;
    }

    private HttpEngine getResponse() throws IOException {
        initHttpEngine();
        if (this.httpEngine.hasResponse()) {
            return this.httpEngine;
        }
        while (true) {
            if (execute(true)) {
                Response response = this.httpEngine.getResponse();
                Request requestFollowUpRequest = this.httpEngine.followUpRequest();
                if (requestFollowUpRequest == null) {
                    this.httpEngine.releaseConnection();
                    return this.httpEngine;
                }
                if (response.isRedirect()) {
                    int i9 = this.redirectionCount + 1;
                    this.redirectionCount = i9;
                    if (i9 > 20) {
                        throw new ProtocolException("Too many redirects: " + this.redirectionCount);
                    }
                }
                ((HttpURLConnection) this).url = requestFollowUpRequest.url();
                this.requestHeaders = requestFollowUpRequest.headers().newBuilder();
                Sink requestBody = this.httpEngine.getRequestBody();
                if (!requestFollowUpRequest.method().equals(((HttpURLConnection) this).method)) {
                    requestBody = null;
                }
                if (requestBody != null && !(requestBody instanceof RetryableSink)) {
                    throw new HttpRetryException("Cannot retry streamed HTTP body", ((HttpURLConnection) this).responseCode);
                }
                if (!this.httpEngine.sameConnection(requestFollowUpRequest.url())) {
                    this.httpEngine.releaseConnection();
                }
                this.httpEngine = newHttpEngine(requestFollowUpRequest.method(), this.httpEngine.close(), (RetryableSink) requestBody, response);
            }
        }
    }

    private void initHttpEngine() throws IOException {
        IOException iOException = this.httpEngineFailure;
        if (iOException != null) {
            throw iOException;
        }
        if (this.httpEngine != null) {
            return;
        }
        ((HttpURLConnection) this).connected = true;
        try {
            if (((HttpURLConnection) this).doOutput) {
                if (((HttpURLConnection) this).method.equals(HttpGet.METHOD_NAME)) {
                    ((HttpURLConnection) this).method = "POST";
                } else if (!HttpMethod.permitsRequestBody(((HttpURLConnection) this).method)) {
                    throw new ProtocolException(((HttpURLConnection) this).method + " does not support writing");
                }
            }
            this.httpEngine = newHttpEngine(((HttpURLConnection) this).method, null, null, null);
        } catch (IOException e9) {
            this.httpEngineFailure = e9;
            throw e9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.squareup.okhttp.internal.http.HttpEngine newHttpEngine(java.lang.String r16, com.squareup.okhttp.Connection r17, com.squareup.okhttp.internal.http.RetryableSink r18, com.squareup.okhttp.Response r19) {
        /*
            r15 = this;
            r0 = r15
            com.squareup.okhttp.Request$Builder r1 = new com.squareup.okhttp.Request$Builder
            r1.<init>()
            java.net.URL r2 = r15.getURL()
            com.squareup.okhttp.Request$Builder r1 = r1.url(r2)
            r2 = 0
            r3 = r16
            com.squareup.okhttp.Request$Builder r1 = r1.method(r3, r2)
            com.squareup.okhttp.Headers$Builder r4 = r0.requestHeaders
            com.squareup.okhttp.Headers r4 = r4.build()
            r5 = 0
            r6 = 0
        L1d:
            int r7 = r4.size()
            if (r6 >= r7) goto L31
            java.lang.String r7 = r4.name(r6)
            java.lang.String r8 = r4.value(r6)
            r1.addHeader(r7, r8)
            int r6 = r6 + 1
            goto L1d
        L31:
            boolean r3 = com.squareup.okhttp.internal.http.HttpMethod.permitsRequestBody(r16)
            if (r3 == 0) goto L62
            long r6 = r0.fixedContentLength
            r8 = -1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L49
            java.lang.String r3 = "Content-Length"
            java.lang.String r6 = java.lang.Long.toString(r6)
        L45:
            r1.header(r3, r6)
            goto L53
        L49:
            int r3 = r0.chunkLength
            if (r3 <= 0) goto L52
            java.lang.String r3 = "Transfer-Encoding"
            java.lang.String r6 = "chunked"
            goto L45
        L52:
            r5 = 1
        L53:
            java.lang.String r3 = "Content-Type"
            java.lang.String r6 = r4.get(r3)
            if (r6 != 0) goto L60
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r1.header(r3, r6)
        L60:
            r10 = r5
            goto L63
        L62:
            r10 = 0
        L63:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r4.get(r3)
            if (r4 != 0) goto L72
            java.lang.String r4 = r15.defaultUserAgent()
            r1.header(r3, r4)
        L72:
            com.squareup.okhttp.Request r9 = r1.build()
            com.squareup.okhttp.OkHttpClient r1 = r0.client
            com.squareup.okhttp.internal.Internal r3 = com.squareup.okhttp.internal.Internal.instance
            com.squareup.okhttp.internal.InternalCache r3 = r3.internalCache(r1)
            if (r3 == 0) goto L90
            boolean r3 = r15.getUseCaches()
            if (r3 != 0) goto L90
            com.squareup.okhttp.OkHttpClient r1 = r0.client
            com.squareup.okhttp.OkHttpClient r1 = r1.m14clone()
            com.squareup.okhttp.OkHttpClient r1 = r1.setCache(r2)
        L90:
            r8 = r1
            com.squareup.okhttp.internal.http.HttpEngine r1 = new com.squareup.okhttp.internal.http.HttpEngine
            r12 = 0
            r7 = r1
            r11 = r17
            r13 = r18
            r14 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.huc.HttpURLConnectionImpl.newHttpEngine(java.lang.String, com.squareup.okhttp.Connection, com.squareup.okhttp.internal.http.RetryableSink, com.squareup.okhttp.Response):com.squareup.okhttp.internal.http.HttpEngine");
    }

    private static String responseSourceHeader(Response response) {
        StringBuilder sb;
        String str;
        if (response.networkResponse() == null) {
            if (response.cacheResponse() == null) {
                return "NONE";
            }
            sb = new StringBuilder();
            str = "CACHE ";
        } else {
            if (response.cacheResponse() != null) {
                sb = new StringBuilder();
                sb.append("CONDITIONAL_CACHE ");
                response = response.networkResponse();
                sb.append(response.code());
                return sb.toString();
            }
            sb = new StringBuilder();
            str = "NETWORK ";
        }
        sb.append(str);
        sb.append(response.code());
        return sb.toString();
    }

    private void setProtocols(String str, boolean z9) {
        ArrayList arrayList = new ArrayList();
        if (z9) {
            arrayList.addAll(this.client.getProtocols());
        }
        for (String str2 : str.split(",", -1)) {
            try {
                arrayList.add(Protocol.get(str2));
            } catch (IOException e9) {
                throw new IllegalStateException(e9);
            }
        }
        this.client.setProtocols(arrayList);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 != null) {
            if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
                setProtocols(str2, true);
                return;
            } else {
                this.requestHeaders.add(str, str2);
                return;
            }
        }
        Platform.get().logW("Ignoring header " + str + " because its value was null.");
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        initHttpEngine();
        while (!execute(false)) {
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        HttpEngine httpEngine = this.httpEngine;
        if (httpEngine == null) {
            return;
        }
        httpEngine.disconnect();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.client.getConnectTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            HttpEngine response = getResponse();
            if (!response.hasResponseBody() || response.getResponse().code() < 400) {
                return null;
            }
            return response.getResponseBodyBytes();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i9) {
        try {
            return getHeaders().value(i9);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            return str == null ? StatusLine.get(getResponse().getResponse()).toString() : getHeaders().get(str);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i9) {
        try {
            return getHeaders().name(i9);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        try {
            return OkHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse().getResponse()).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        if (!((HttpURLConnection) this).doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        HttpEngine response = getResponse();
        if (getResponseCode() >= 400) {
            throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
        }
        InputStream responseBodyBytes = response.getResponseBodyBytes();
        if (responseBodyBytes != null) {
            return responseBodyBytes;
        }
        throw new ProtocolException("No response body exists; responseCode=" + getResponseCode());
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws IOException {
        connect();
        BufferedSink bufferedRequestBody = this.httpEngine.getBufferedRequestBody();
        if (bufferedRequestBody != null) {
            if (this.httpEngine.hasResponse()) {
                throw new ProtocolException("cannot write request body after response has been read");
            }
            return bufferedRequestBody.outputStream();
        }
        throw new ProtocolException("method does not support a request body: " + ((HttpURLConnection) this).method);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        String host = getURL().getHost();
        int effectivePort = Util.getEffectivePort(getURL());
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.client.getProxy().address();
            String hostName = inetSocketAddress.getHostName();
            effectivePort = inetSocketAddress.getPort();
            host = hostName;
        }
        return new SocketPermission(host + ":" + effectivePort, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.client.getReadTimeout();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return OkHeaders.toMultimap(this.requestHeaders.build(), null);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.requestHeaders.get(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() throws IOException {
        return getResponse().getResponse().code();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return getResponse().getResponse().message();
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i9) {
        this.client.setConnectTimeout(i9, TimeUnit.MILLISECONDS);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i9) {
        setFixedLengthStreamingMode(i9);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j9) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (((HttpURLConnection) this).chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j9 < 0) {
            throw new IllegalArgumentException("contentLength < 0");
        }
        this.fixedContentLength = j9;
        ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j9, 2147483647L);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j9) {
        super.setIfModifiedSince(j9);
        long j10 = ((HttpURLConnection) this).ifModifiedSince;
        Headers.Builder builder = this.requestHeaders;
        if (j10 != 0) {
            builder.set("If-Modified-Since", HttpDate.format(new Date(((HttpURLConnection) this).ifModifiedSince)));
        } else {
            builder.removeAll("If-Modified-Since");
        }
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z9) {
        this.client.setFollowRedirects(z9);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i9) {
        this.client.setReadTimeout(i9, TimeUnit.MILLISECONDS);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        if (HttpMethod.METHODS.contains(str)) {
            ((HttpURLConnection) this).method = str;
            return;
        }
        throw new ProtocolException("Expected one of " + HttpMethod.METHODS + " but was " + str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 != null) {
            if ("X-Android-Transports".equals(str) || "X-Android-Protocols".equals(str)) {
                setProtocols(str2, false);
                return;
            } else {
                this.requestHeaders.set(str, str2);
                return;
            }
        }
        Platform.get().logW("Ignoring header " + str + " because its value was null.");
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        Route route = this.route;
        Proxy proxy = route != null ? route.getProxy() : this.client.getProxy();
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }
}
