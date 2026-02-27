package okhttp3.internal.http;

import E8.n;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.l;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okio.BufferedSink;
import okio.Okio;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z9) {
        this.forWebSocket = z9;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Response.Builder responseHeaders;
        boolean z9;
        Response.Builder builderNewBuilder;
        ResponseBody responseBodyOpenResponseBody;
        l.e(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        l.b(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody requestBodyBody = request$okhttp.body();
        long jCurrentTimeMillis = System.currentTimeMillis();
        exchange$okhttp.writeRequestHeaders(request$okhttp);
        if (!HttpMethod.permitsRequestBody(request$okhttp.method()) || requestBodyBody == null) {
            exchange$okhttp.noRequestBody();
            responseHeaders = null;
            z9 = true;
        } else {
            if (n.o(HTTP.EXPECT_CONTINUE, request$okhttp.header("Expect"), true)) {
                exchange$okhttp.flushRequest();
                responseHeaders = exchange$okhttp.readResponseHeaders(true);
                exchange$okhttp.responseHeadersStart();
                z9 = false;
            } else {
                responseHeaders = null;
                z9 = true;
            }
            if (responseHeaders != null) {
                exchange$okhttp.noRequestBody();
                if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange$okhttp.noNewExchangesOnConnection();
                }
            } else if (requestBodyBody.isDuplex()) {
                exchange$okhttp.flushRequest();
                requestBodyBody.writeTo(Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, true)));
            } else {
                BufferedSink bufferedSinkBuffer = Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, false));
                requestBodyBody.writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
        }
        if (requestBodyBody == null || !requestBodyBody.isDuplex()) {
            exchange$okhttp.finishRequest();
        }
        if (responseHeaders == null) {
            responseHeaders = exchange$okhttp.readResponseHeaders(false);
            l.b(responseHeaders);
            if (z9) {
                exchange$okhttp.responseHeadersStart();
                z9 = false;
            }
        }
        Response responseBuild = responseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int iCode = responseBuild.code();
        if (iCode == 100) {
            Response.Builder responseHeaders2 = exchange$okhttp.readResponseHeaders(false);
            l.b(responseHeaders2);
            if (z9) {
                exchange$okhttp.responseHeadersStart();
            }
            responseBuild = responseHeaders2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(jCurrentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            iCode = responseBuild.code();
        }
        exchange$okhttp.responseHeadersEnd(responseBuild);
        if (this.forWebSocket && iCode == 101) {
            builderNewBuilder = responseBuild.newBuilder();
            responseBodyOpenResponseBody = Util.EMPTY_RESPONSE;
        } else {
            builderNewBuilder = responseBuild.newBuilder();
            responseBodyOpenResponseBody = exchange$okhttp.openResponseBody(responseBuild);
        }
        Response responseBuild2 = builderNewBuilder.body(responseBodyOpenResponseBody).build();
        if (n.o("close", responseBuild2.request().header("Connection"), true) || n.o("close", Response.header$default(responseBuild2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (iCode == 204 || iCode == 205) {
            ResponseBody responseBodyBody = responseBuild2.body();
            if ((responseBodyBody != null ? responseBodyBody.contentLength() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iCode);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody responseBodyBody2 = responseBuild2.body();
                sb.append(responseBodyBody2 != null ? Long.valueOf(responseBodyBody2.contentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return responseBuild2;
    }
}
