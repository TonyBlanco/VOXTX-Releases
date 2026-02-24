package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Address;
import com.squareup.okhttp.CertificatePinner;
import com.squareup.okhttp.Connection;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.Route;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.Version;
import com.squareup.okhttp.internal.http.CacheStrategy;
import com.squareup.okhttp.internal.io.RealConnection;
import java.io.Closeable;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpEngine {
    private static final ResponseBody EMPTY_BODY = new ResponseBody() { // from class: com.squareup.okhttp.internal.http.HttpEngine.1
        @Override // com.squareup.okhttp.ResponseBody
        public long contentLength() {
            return 0L;
        }

        @Override // com.squareup.okhttp.ResponseBody
        public MediaType contentType() {
            return null;
        }

        @Override // com.squareup.okhttp.ResponseBody
        public BufferedSource source() {
            return new Buffer();
        }
    };
    public static final int MAX_FOLLOW_UPS = 20;
    public final boolean bufferRequestBody;
    private BufferedSink bufferedRequestBody;
    private Response cacheResponse;
    private CacheStrategy cacheStrategy;
    private final boolean callerWritesRequestBody;
    final OkHttpClient client;
    private final boolean forWebSocket;
    private HttpStream httpStream;
    private Request networkRequest;
    private final Response priorResponse;
    private Sink requestBodyOut;
    long sentRequestMillis = -1;
    private CacheRequest storeRequest;
    public final StreamAllocation streamAllocation;
    private boolean transparentGzip;
    private final Request userRequest;
    private Response userResponse;

    public class NetworkInterceptorChain implements Interceptor.Chain {
        private int calls;
        private final int index;
        private final Request request;

        public NetworkInterceptorChain(int i9, Request request) {
            this.index = i9;
            this.request = request;
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Connection connection() {
            return HttpEngine.this.streamAllocation.connection();
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Response proceed(Request request) throws IOException {
            this.calls++;
            if (this.index > 0) {
                Interceptor interceptor = HttpEngine.this.client.networkInterceptors().get(this.index - 1);
                Address address = connection().getRoute().getAddress();
                if (!request.httpUrl().host().equals(address.getUriHost()) || request.httpUrl().port() != address.getUriPort()) {
                    throw new IllegalStateException("network interceptor " + interceptor + " must retain the same host and port");
                }
                if (this.calls > 1) {
                    throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
                }
            }
            if (this.index < HttpEngine.this.client.networkInterceptors().size()) {
                NetworkInterceptorChain networkInterceptorChain = HttpEngine.this.new NetworkInterceptorChain(this.index + 1, request);
                Interceptor interceptor2 = HttpEngine.this.client.networkInterceptors().get(this.index);
                Response responseIntercept = interceptor2.intercept(networkInterceptorChain);
                if (networkInterceptorChain.calls != 1) {
                    throw new IllegalStateException("network interceptor " + interceptor2 + " must call proceed() exactly once");
                }
                if (responseIntercept != null) {
                    return responseIntercept;
                }
                throw new NullPointerException("network interceptor " + interceptor2 + " returned null");
            }
            HttpEngine.this.httpStream.writeRequestHeaders(request);
            HttpEngine.this.networkRequest = request;
            if (HttpEngine.this.permitsRequestBody(request) && request.body() != null) {
                BufferedSink bufferedSinkBuffer = Okio.buffer(HttpEngine.this.httpStream.createRequestBody(request, request.body().contentLength()));
                request.body().writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
            Response networkResponse = HttpEngine.this.readNetworkResponse();
            int iCode = networkResponse.code();
            if ((iCode != 204 && iCode != 205) || networkResponse.body().contentLength() <= 0) {
                return networkResponse;
            }
            throw new ProtocolException("HTTP " + iCode + " had non-zero Content-Length: " + networkResponse.body().contentLength());
        }

        @Override // com.squareup.okhttp.Interceptor.Chain
        public Request request() {
            return this.request;
        }
    }

    public HttpEngine(OkHttpClient okHttpClient, Request request, boolean z9, boolean z10, boolean z11, StreamAllocation streamAllocation, RetryableSink retryableSink, Response response) {
        this.client = okHttpClient;
        this.userRequest = request;
        this.bufferRequestBody = z9;
        this.callerWritesRequestBody = z10;
        this.forWebSocket = z11;
        this.streamAllocation = streamAllocation == null ? new StreamAllocation(okHttpClient.getConnectionPool(), createAddress(okHttpClient, request)) : streamAllocation;
        this.requestBodyOut = retryableSink;
        this.priorResponse = response;
    }

    private Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        Sink sinkBody;
        if (cacheRequest == null || (sinkBody = cacheRequest.body()) == null) {
            return response;
        }
        final BufferedSource bufferedSourceSource = response.body().source();
        final BufferedSink bufferedSinkBuffer = Okio.buffer(sinkBody);
        return response.newBuilder().body(new RealResponseBody(response.headers(), Okio.buffer(new Source() { // from class: com.squareup.okhttp.internal.http.HttpEngine.2
            boolean cacheRequestClosed;

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                bufferedSourceSource.close();
            }

            @Override // okio.Source
            public long read(Buffer buffer, long j9) throws IOException {
                try {
                    long j10 = bufferedSourceSource.read(buffer, j9);
                    if (j10 != -1) {
                        buffer.copyTo(bufferedSinkBuffer.buffer(), buffer.size() - j10, j10);
                        bufferedSinkBuffer.emitCompleteSegments();
                        return j10;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        bufferedSinkBuffer.close();
                    }
                    return -1L;
                } catch (IOException e9) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e9;
                }
            }

            @Override // okio.Source
            public Timeout timeout() {
                return bufferedSourceSource.timeout();
            }
        }))).build();
    }

    private static Headers combine(Headers headers, Headers headers2) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = headers.name(i9);
            String strValue = headers.value(i9);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strName) || !strValue.startsWith("1")) && (!OkHeaders.isEndToEnd(strName) || headers2.get(strName) == null)) {
                builder.add(strName, strValue);
            }
        }
        int size2 = headers2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String strName2 = headers2.name(i10);
            if (!"Content-Length".equalsIgnoreCase(strName2) && OkHeaders.isEndToEnd(strName2)) {
                builder.add(strName2, headers2.value(i10));
            }
        }
        return builder.build();
    }

    private HttpStream connect() throws RouteException, RequestException, IOException {
        return this.streamAllocation.newStream(this.client.getConnectTimeout(), this.client.getReadTimeout(), this.client.getWriteTimeout(), this.client.getRetryOnConnectionFailure(), !this.networkRequest.method().equals(HttpGet.METHOD_NAME));
    }

    private static Address createAddress(OkHttpClient okHttpClient, Request request) {
        SSLSocketFactory sslSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (request.isHttps()) {
            sslSocketFactory = okHttpClient.getSslSocketFactory();
            hostnameVerifier = okHttpClient.getHostnameVerifier();
            certificatePinner = okHttpClient.getCertificatePinner();
        } else {
            sslSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(request.httpUrl().host(), request.httpUrl().port(), okHttpClient.getDns(), okHttpClient.getSocketFactory(), sslSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.getAuthenticator(), okHttpClient.getProxy(), okHttpClient.getProtocols(), okHttpClient.getConnectionSpecs(), okHttpClient.getProxySelector());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals(HttpHead.METHOD_NAME)) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && OkHeaders.contentLength(response) == -1 && !HTTP.CHUNK_CODING.equalsIgnoreCase(response.header("Transfer-Encoding"))) ? false : true;
    }

    private void maybeCache() throws IOException {
        InternalCache internalCache = Internal.instance.internalCache(this.client);
        if (internalCache == null) {
            return;
        }
        if (CacheStrategy.isCacheable(this.userResponse, this.networkRequest)) {
            this.storeRequest = internalCache.put(stripBody(this.userResponse));
        } else if (HttpMethod.invalidatesCache(this.networkRequest.method())) {
            try {
                internalCache.remove(this.networkRequest);
            } catch (IOException unused) {
            }
        }
    }

    private Request networkRequest(Request request) throws IOException {
        Request.Builder builderNewBuilder = request.newBuilder();
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", Util.hostHeader(request.httpUrl()));
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", HTTP.CONN_KEEP_ALIVE);
        }
        if (request.header(HttpHeaders.ACCEPT_ENCODING) == null) {
            this.transparentGzip = true;
            builderNewBuilder.header(HttpHeaders.ACCEPT_ENCODING, "gzip");
        }
        CookieHandler cookieHandler = this.client.getCookieHandler();
        if (cookieHandler != null) {
            OkHeaders.addCookies(builderNewBuilder, cookieHandler.get(request.uri(), OkHeaders.toMultimap(builderNewBuilder.build().headers(), null)));
        }
        if (request.header("User-Agent") == null) {
            builderNewBuilder.header("User-Agent", Version.userAgent());
        }
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response readNetworkResponse() throws IOException {
        this.httpStream.finishRequest();
        Response responseBuild = this.httpStream.readResponseHeaders().request(this.networkRequest).handshake(this.streamAllocation.connection().getHandshake()).header(OkHeaders.SENT_MILLIS, Long.toString(this.sentRequestMillis)).header(OkHeaders.RECEIVED_MILLIS, Long.toString(System.currentTimeMillis())).build();
        if (!this.forWebSocket) {
            responseBuild = responseBuild.newBuilder().body(this.httpStream.openResponseBody(responseBuild)).build();
        }
        if ("close".equalsIgnoreCase(responseBuild.request().header("Connection")) || "close".equalsIgnoreCase(responseBuild.header("Connection"))) {
            this.streamAllocation.noNewStreams();
        }
        return responseBuild;
    }

    private static Response stripBody(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body(null).build();
    }

    private Response unzip(Response response) throws IOException {
        if (!this.transparentGzip || !"gzip".equalsIgnoreCase(this.userResponse.header("Content-Encoding")) || response.body() == null) {
            return response;
        }
        GzipSource gzipSource = new GzipSource(response.body().source());
        Headers headersBuild = response.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build();
        return response.newBuilder().headers(headersBuild).body(new RealResponseBody(headersBuild, Okio.buffer(gzipSource))).build();
    }

    private static boolean validate(Response response, Response response2) {
        Date date;
        if (response2.code() == 304) {
            return true;
        }
        Date date2 = response.headers().getDate("Last-Modified");
        return (date2 == null || (date = response2.headers().getDate("Last-Modified")) == null || date.getTime() >= date2.getTime()) ? false : true;
    }

    public void cancel() {
        this.streamAllocation.cancel();
    }

    public StreamAllocation close() {
        Closeable closeable = this.bufferedRequestBody;
        if (closeable != null || (closeable = this.requestBodyOut) != null) {
            Util.closeQuietly(closeable);
        }
        Response response = this.userResponse;
        if (response != null) {
            Util.closeQuietly(response.body());
        } else {
            this.streamAllocation.connectionFailed();
        }
        return this.streamAllocation;
    }

    public Request followUpRequest() throws IOException {
        String strHeader;
        HttpUrl httpUrlResolve;
        if (this.userResponse == null) {
            throw new IllegalStateException();
        }
        RealConnection realConnectionConnection = this.streamAllocation.connection();
        Route route = realConnectionConnection != null ? realConnectionConnection.getRoute() : null;
        Proxy proxy = route != null ? route.getProxy() : this.client.getProxy();
        int iCode = this.userResponse.code();
        String strMethod = this.userRequest.method();
        if (iCode != 307 && iCode != 308) {
            if (iCode != 401) {
                if (iCode != 407) {
                    switch (iCode) {
                        case 300:
                        case 301:
                        case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                        case HttpStatus.SC_SEE_OTHER /* 303 */:
                            break;
                        default:
                            return null;
                    }
                } else if (proxy.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            }
            return OkHeaders.processAuthHeader(this.client.getAuthenticator(), this.userResponse, proxy);
        }
        if (!strMethod.equals(HttpGet.METHOD_NAME) && !strMethod.equals(HttpHead.METHOD_NAME)) {
            return null;
        }
        if (!this.client.getFollowRedirects() || (strHeader = this.userResponse.header("Location")) == null || (httpUrlResolve = this.userRequest.httpUrl().resolve(strHeader)) == null) {
            return null;
        }
        if (!httpUrlResolve.scheme().equals(this.userRequest.httpUrl().scheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = this.userRequest.newBuilder();
        if (HttpMethod.permitsRequestBody(strMethod)) {
            if (HttpMethod.redirectsToGet(strMethod)) {
                builderNewBuilder.method(HttpGet.METHOD_NAME, null);
            } else {
                builderNewBuilder.method(strMethod, null);
            }
            builderNewBuilder.removeHeader("Transfer-Encoding");
            builderNewBuilder.removeHeader("Content-Length");
            builderNewBuilder.removeHeader("Content-Type");
        }
        if (!sameConnection(httpUrlResolve)) {
            builderNewBuilder.removeHeader("Authorization");
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    public BufferedSink getBufferedRequestBody() {
        BufferedSink bufferedSink = this.bufferedRequestBody;
        if (bufferedSink != null) {
            return bufferedSink;
        }
        Sink requestBody = getRequestBody();
        if (requestBody == null) {
            return null;
        }
        BufferedSink bufferedSinkBuffer = Okio.buffer(requestBody);
        this.bufferedRequestBody = bufferedSinkBuffer;
        return bufferedSinkBuffer;
    }

    public Connection getConnection() {
        return this.streamAllocation.connection();
    }

    public Request getRequest() {
        return this.userRequest;
    }

    public Sink getRequestBody() {
        if (this.cacheStrategy != null) {
            return this.requestBodyOut;
        }
        throw new IllegalStateException();
    }

    public Response getResponse() {
        Response response = this.userResponse;
        if (response != null) {
            return response;
        }
        throw new IllegalStateException();
    }

    public boolean hasResponse() {
        return this.userResponse != null;
    }

    public boolean permitsRequestBody(Request request) {
        return HttpMethod.permitsRequestBody(request.method());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void readResponse() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.http.HttpEngine.readResponse():void");
    }

    public void receiveHeaders(Headers headers) throws IOException {
        CookieHandler cookieHandler = this.client.getCookieHandler();
        if (cookieHandler != null) {
            cookieHandler.put(this.userRequest.uri(), OkHeaders.toMultimap(headers, null));
        }
    }

    public HttpEngine recover(RouteException routeException) {
        if (!this.streamAllocation.recover(routeException) || !this.client.getRetryOnConnectionFailure()) {
            return null;
        }
        return new HttpEngine(this.client, this.userRequest, this.bufferRequestBody, this.callerWritesRequestBody, this.forWebSocket, close(), (RetryableSink) this.requestBodyOut, this.priorResponse);
    }

    public HttpEngine recover(IOException iOException) {
        return recover(iOException, this.requestBodyOut);
    }

    public HttpEngine recover(IOException iOException, Sink sink) {
        if (!this.streamAllocation.recover(iOException, sink) || !this.client.getRetryOnConnectionFailure()) {
            return null;
        }
        return new HttpEngine(this.client, this.userRequest, this.bufferRequestBody, this.callerWritesRequestBody, this.forWebSocket, close(), (RetryableSink) sink, this.priorResponse);
    }

    public void releaseStreamAllocation() throws IOException {
        this.streamAllocation.release();
    }

    public boolean sameConnection(HttpUrl httpUrl) {
        HttpUrl httpUrl2 = this.userRequest.httpUrl();
        return httpUrl2.host().equals(httpUrl.host()) && httpUrl2.port() == httpUrl.port() && httpUrl2.scheme().equals(httpUrl.scheme());
    }

    public void sendRequest() throws RouteException, RequestException, IOException {
        Sink sinkCreateRequestBody;
        if (this.cacheStrategy != null) {
            return;
        }
        if (this.httpStream != null) {
            throw new IllegalStateException();
        }
        Request requestNetworkRequest = networkRequest(this.userRequest);
        InternalCache internalCache = Internal.instance.internalCache(this.client);
        Response response = internalCache != null ? internalCache.get(requestNetworkRequest) : null;
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), requestNetworkRequest, response).get();
        this.cacheStrategy = cacheStrategy;
        this.networkRequest = cacheStrategy.networkRequest;
        this.cacheResponse = cacheStrategy.cacheResponse;
        if (internalCache != null) {
            internalCache.trackResponse(cacheStrategy);
        }
        if (response != null && this.cacheResponse == null) {
            Util.closeQuietly(response.body());
        }
        if (this.networkRequest == null) {
            Response response2 = this.cacheResponse;
            this.userResponse = (response2 != null ? response2.newBuilder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).cacheResponse(stripBody(this.cacheResponse)) : new Response.Builder().request(this.userRequest).priorResponse(stripBody(this.priorResponse)).protocol(Protocol.HTTP_1_1).code(HttpStatus.SC_GATEWAY_TIMEOUT).message("Unsatisfiable Request (only-if-cached)").body(EMPTY_BODY)).build();
            this.userResponse = unzip(this.userResponse);
            return;
        }
        HttpStream httpStreamConnect = connect();
        this.httpStream = httpStreamConnect;
        httpStreamConnect.setHttpEngine(this);
        if (this.callerWritesRequestBody && permitsRequestBody(this.networkRequest) && this.requestBodyOut == null) {
            long jContentLength = OkHeaders.contentLength(requestNetworkRequest);
            if (!this.bufferRequestBody) {
                this.httpStream.writeRequestHeaders(this.networkRequest);
                sinkCreateRequestBody = this.httpStream.createRequestBody(this.networkRequest, jContentLength);
            } else {
                if (jContentLength > 2147483647L) {
                    throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
                }
                if (jContentLength != -1) {
                    this.httpStream.writeRequestHeaders(this.networkRequest);
                    this.requestBodyOut = new RetryableSink((int) jContentLength);
                    return;
                }
                sinkCreateRequestBody = new RetryableSink();
            }
            this.requestBodyOut = sinkCreateRequestBody;
        }
    }

    public void writingRequestHeaders() {
        if (this.sentRequestMillis != -1) {
            throw new IllegalStateException();
        }
        this.sentRequestMillis = System.currentTimeMillis();
    }
}
