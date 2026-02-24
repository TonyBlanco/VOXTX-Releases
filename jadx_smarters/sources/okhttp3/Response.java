package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.l;
import l8.k;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Response implements Closeable {

    @Nullable
    private final ResponseBody body;

    @Nullable
    private final Response cacheResponse;
    private final int code;

    @Nullable
    private final Exchange exchange;

    @Nullable
    private final Handshake handshake;

    @NotNull
    private final Headers headers;
    private CacheControl lazyCacheControl;

    @NotNull
    private final String message;

    @Nullable
    private final Response networkResponse;

    @Nullable
    private final Response priorResponse;

    @NotNull
    private final Protocol protocol;
    private final long receivedResponseAtMillis;

    @NotNull
    private final Request request;
    private final long sentRequestAtMillis;

    public static class Builder {

        @Nullable
        private ResponseBody body;

        @Nullable
        private Response cacheResponse;
        private int code;

        @Nullable
        private Exchange exchange;

        @Nullable
        private Handshake handshake;

        @NotNull
        private Headers.Builder headers;

        @Nullable
        private String message;

        @Nullable
        private Response networkResponse;

        @Nullable
        private Response priorResponse;

        @Nullable
        private Protocol protocol;
        private long receivedResponseAtMillis;

        @Nullable
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        public Builder(@NotNull Response response) {
            l.e(response, "response");
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }

        private final void checkPriorResponse(Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            if (response != null) {
                if (!(response.body() == null)) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (!(response.networkResponse() == null)) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (!(response.cacheResponse() == null)) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (response.priorResponse() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Builder body(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
            return this;
        }

        @NotNull
        public Response build() {
            int i9 = this.code;
            if (!(i9 >= 0)) {
                throw new IllegalStateException(("code < 0: " + this.code).toString());
            }
            Request request = this.request;
            if (request == null) {
                throw new IllegalStateException("request == null".toString());
            }
            Protocol protocol = this.protocol;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.message;
            if (str != null) {
                return new Response(request, protocol, str, i9, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
            }
            throw new IllegalStateException("message == null".toString());
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response response) {
            checkSupportResponse("cacheResponse", response);
            this.cacheResponse = response;
            return this;
        }

        @NotNull
        public Builder code(int i9) {
            this.code = i9;
            return this;
        }

        @Nullable
        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        @Nullable
        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        @Nullable
        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        @Nullable
        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @Nullable
        public final String getMessage$okhttp() {
            return this.message;
        }

        @Nullable
        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        @Nullable
        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        @Nullable
        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        @Nullable
        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        @NotNull
        public Builder header(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            this.headers.set(name, value);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers) {
            l.e(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@NotNull Exchange deferredTrailers) {
            l.e(deferredTrailers, "deferredTrailers");
            this.exchange = deferredTrailers;
        }

        @NotNull
        public Builder message(@NotNull String message) {
            l.e(message, "message");
            this.message = message;
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response response) {
            checkSupportResponse("networkResponse", response);
            this.networkResponse = response;
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response response) {
            checkPriorResponse(response);
            this.priorResponse = response;
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol) {
            l.e(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long j9) {
            this.receivedResponseAtMillis = j9;
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            l.e(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request) {
            l.e(request, "request");
            this.request = request;
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long j9) {
            this.sentRequestAtMillis = j9;
            return this;
        }

        public final void setBody$okhttp(@Nullable ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i9) {
            this.code = i9;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            l.e(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMessage$okhttp(@Nullable String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j9) {
            this.receivedResponseAtMillis = j9;
        }

        public final void setRequest$okhttp(@Nullable Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j9) {
            this.sentRequestAtMillis = j9;
        }
    }

    public Response(@NotNull Request request, @NotNull Protocol protocol, @NotNull String message, int i9, @Nullable Handshake handshake, @NotNull Headers headers, @Nullable ResponseBody responseBody, @Nullable Response response, @Nullable Response response2, @Nullable Response response3, long j9, long j10, @Nullable Exchange exchange) {
        l.e(request, "request");
        l.e(protocol, "protocol");
        l.e(message, "message");
        l.e(headers, "headers");
        this.request = request;
        this.protocol = protocol;
        this.message = message;
        this.code = i9;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j9;
        this.receivedResponseAtMillis = j10;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m143deprecated_body() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m144deprecated_cacheControl() {
        return cacheControl();
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m145deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* JADX INFO: renamed from: -deprecated_code, reason: not valid java name */
    public final int m146deprecated_code() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m147deprecated_handshake() {
        return this.handshake;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m148deprecated_headers() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_message, reason: not valid java name */
    public final String m149deprecated_message() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m150deprecated_networkResponse() {
        return this.networkResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m151deprecated_priorResponse() {
        return this.priorResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m152deprecated_protocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m153deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_request, reason: not valid java name */
    public final Request m154deprecated_request() {
        return this.request;
    }

    /* JADX INFO: renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m155deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @Nullable
    public final ResponseBody body() {
        return this.body;
    }

    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    @Nullable
    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    @NotNull
    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i9 = this.code;
        if (i9 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i9 != 407) {
                return k.f();
            }
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    public final int code() {
        return this.code;
    }

    @Nullable
    public final Exchange exchange() {
        return this.exchange;
    }

    @Nullable
    public final Handshake handshake() {
        return this.handshake;
    }

    @Nullable
    public final String header(@NotNull String str) {
        return header$default(this, str, null, 2, null);
    }

    @Nullable
    public final String header(@NotNull String name, @Nullable String str) {
        l.e(name, "name");
        String str2 = this.headers.get(name);
        return str2 != null ? str2 : str;
    }

    @NotNull
    public final List<String> headers(@NotNull String name) {
        l.e(name, "name");
        return this.headers.values(name);
    }

    @NotNull
    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i9 = this.code;
        if (i9 != 307 && i9 != 308) {
            switch (i9) {
                case 300:
                case 301:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i9 = this.code;
        return 200 <= i9 && 299 >= i9;
    }

    @NotNull
    public final String message() {
        return this.message;
    }

    @Nullable
    public final Response networkResponse() {
        return this.networkResponse;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public final ResponseBody peekBody(long j9) throws IOException {
        ResponseBody responseBody = this.body;
        l.b(responseBody);
        BufferedSource bufferedSourcePeek = responseBody.source().peek();
        Buffer buffer = new Buffer();
        bufferedSourcePeek.request(j9);
        buffer.write((Source) bufferedSourcePeek, Math.min(j9, bufferedSourcePeek.getBuffer().size()));
        return ResponseBody.Companion.create(buffer, this.body.contentType(), buffer.size());
    }

    @Nullable
    public final Response priorResponse() {
        return this.priorResponse;
    }

    @NotNull
    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    @NotNull
    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    @NotNull
    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }
}
