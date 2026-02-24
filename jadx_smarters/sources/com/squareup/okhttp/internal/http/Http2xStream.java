package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.FramedConnection;
import com.squareup.okhttp.internal.framed.FramedStream;
import com.squareup.okhttp.internal.framed.Header;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public final class Http2xStream implements HttpStream {
    private static final ByteString CONNECTION;
    private static final ByteString ENCODING;
    private static final ByteString HOST;
    private static final List<ByteString> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<ByteString> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private static final ByteString KEEP_ALIVE;
    private static final ByteString PROXY_CONNECTION;
    private static final List<ByteString> SPDY_3_SKIPPED_REQUEST_HEADERS;
    private static final List<ByteString> SPDY_3_SKIPPED_RESPONSE_HEADERS;
    private static final ByteString TE;
    private static final ByteString TRANSFER_ENCODING;
    private static final ByteString UPGRADE;
    private final FramedConnection framedConnection;
    private HttpEngine httpEngine;
    private FramedStream stream;
    private final StreamAllocation streamAllocation;

    public class StreamFinishingSource extends ForwardingSource {
        public StreamFinishingSource(Source source) {
            super(source);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2xStream.this.streamAllocation.streamFinished(Http2xStream.this);
            super.close();
        }
    }

    static {
        ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8("connection");
        CONNECTION = byteStringEncodeUtf8;
        ByteString byteStringEncodeUtf82 = ByteString.encodeUtf8("host");
        HOST = byteStringEncodeUtf82;
        ByteString byteStringEncodeUtf83 = ByteString.encodeUtf8("keep-alive");
        KEEP_ALIVE = byteStringEncodeUtf83;
        ByteString byteStringEncodeUtf84 = ByteString.encodeUtf8("proxy-connection");
        PROXY_CONNECTION = byteStringEncodeUtf84;
        ByteString byteStringEncodeUtf85 = ByteString.encodeUtf8("transfer-encoding");
        TRANSFER_ENCODING = byteStringEncodeUtf85;
        ByteString byteStringEncodeUtf86 = ByteString.encodeUtf8("te");
        TE = byteStringEncodeUtf86;
        ByteString byteStringEncodeUtf87 = ByteString.encodeUtf8("encoding");
        ENCODING = byteStringEncodeUtf87;
        ByteString byteStringEncodeUtf88 = ByteString.encodeUtf8("upgrade");
        UPGRADE = byteStringEncodeUtf88;
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.TARGET_AUTHORITY;
        ByteString byteString5 = Header.TARGET_HOST;
        ByteString byteString6 = Header.VERSION;
        SPDY_3_SKIPPED_REQUEST_HEADERS = Util.immutableList(byteStringEncodeUtf8, byteStringEncodeUtf82, byteStringEncodeUtf83, byteStringEncodeUtf84, byteStringEncodeUtf85, byteString, byteString2, byteString3, byteString4, byteString5, byteString6);
        SPDY_3_SKIPPED_RESPONSE_HEADERS = Util.immutableList(byteStringEncodeUtf8, byteStringEncodeUtf82, byteStringEncodeUtf83, byteStringEncodeUtf84, byteStringEncodeUtf85);
        HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(byteStringEncodeUtf8, byteStringEncodeUtf82, byteStringEncodeUtf83, byteStringEncodeUtf84, byteStringEncodeUtf86, byteStringEncodeUtf85, byteStringEncodeUtf87, byteStringEncodeUtf88, byteString, byteString2, byteString3, byteString4, byteString5, byteString6);
        HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(byteStringEncodeUtf8, byteStringEncodeUtf82, byteStringEncodeUtf83, byteStringEncodeUtf84, byteStringEncodeUtf86, byteStringEncodeUtf85, byteStringEncodeUtf87, byteStringEncodeUtf88);
    }

    public Http2xStream(StreamAllocation streamAllocation, FramedConnection framedConnection) {
        this.streamAllocation = streamAllocation;
        this.framedConnection = framedConnection;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_AUTHORITY, Util.hostHeader(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8(headers.name(i9).toLowerCase(Locale.US));
            if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(byteStringEncodeUtf8)) {
                arrayList.add(new Header(byteStringEncodeUtf8, headers.value(i9)));
            }
        }
        return arrayList;
    }

    private static String joinOnNull(String str, String str2) {
        return str + (char) 0 + str2;
    }

    public static Response.Builder readHttp2HeadersList(List<Header> list) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        for (int i9 = 0; i9 < size; i9++) {
            ByteString byteString = list.get(i9).name;
            String strUtf8 = list.get(i9).value.utf8();
            if (byteString.equals(Header.RESPONSE_STATUS)) {
                str = strUtf8;
            } else if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(byteString)) {
                builder.add(byteString.utf8(), strUtf8);
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        StatusLine statusLine = StatusLine.parse("HTTP/1.1 " + str);
        return new Response.Builder().protocol(Protocol.HTTP_2).code(statusLine.code).message(statusLine.message).headers(builder.build());
    }

    public static Response.Builder readSpdy3HeadersList(List<Header> list) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i9 = 0; i9 < size; i9++) {
            ByteString byteString = list.get(i9).name;
            String strUtf8 = list.get(i9).value.utf8();
            int i10 = 0;
            while (i10 < strUtf8.length()) {
                int iIndexOf = strUtf8.indexOf(0, i10);
                if (iIndexOf == -1) {
                    iIndexOf = strUtf8.length();
                }
                String strSubstring = strUtf8.substring(i10, iIndexOf);
                if (byteString.equals(Header.RESPONSE_STATUS)) {
                    str = strSubstring;
                } else if (byteString.equals(Header.VERSION)) {
                    str2 = strSubstring;
                } else if (!SPDY_3_SKIPPED_RESPONSE_HEADERS.contains(byteString)) {
                    builder.add(byteString.utf8(), strSubstring);
                }
                i10 = iIndexOf + 1;
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        StatusLine statusLine = StatusLine.parse(str2 + " " + str);
        return new Response.Builder().protocol(Protocol.SPDY_3).code(statusLine.code).message(statusLine.message).headers(builder.build());
    }

    public static List<Header> spdy3HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 5);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.httpUrl())));
        arrayList.add(new Header(Header.VERSION, "HTTP/1.1"));
        arrayList.add(new Header(Header.TARGET_HOST, Util.hostHeader(request.httpUrl())));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.httpUrl().scheme()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            ByteString byteStringEncodeUtf8 = ByteString.encodeUtf8(headers.name(i9).toLowerCase(Locale.US));
            if (!SPDY_3_SKIPPED_REQUEST_HEADERS.contains(byteStringEncodeUtf8)) {
                String strValue = headers.value(i9);
                if (linkedHashSet.add(byteStringEncodeUtf8)) {
                    arrayList.add(new Header(byteStringEncodeUtf8, strValue));
                } else {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        if (((Header) arrayList.get(i10)).name.equals(byteStringEncodeUtf8)) {
                            arrayList.set(i10, new Header(byteStringEncodeUtf8, joinOnNull(((Header) arrayList.get(i10)).value.utf8(), strValue)));
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public void cancel() {
        FramedStream framedStream = this.stream;
        if (framedStream != null) {
            framedStream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public Sink createRequestBody(Request request, long j9) throws IOException {
        return this.stream.getSink();
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public void finishRequest() throws IOException {
        this.stream.getSink().close();
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public ResponseBody openResponseBody(Response response) throws IOException {
        return new RealResponseBody(response.headers(), Okio.buffer(new StreamFinishingSource(this.stream.getSource())));
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public Response.Builder readResponseHeaders() throws IOException {
        return this.framedConnection.getProtocol() == Protocol.HTTP_2 ? readHttp2HeadersList(this.stream.getResponseHeaders()) : readSpdy3HeadersList(this.stream.getResponseHeaders());
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public void setHttpEngine(HttpEngine httpEngine) {
        this.httpEngine = httpEngine;
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public void writeRequestBody(RetryableSink retryableSink) throws IOException {
        retryableSink.writeToSocket(this.stream.getSink());
    }

    @Override // com.squareup.okhttp.internal.http.HttpStream
    public void writeRequestHeaders(Request request) throws IOException {
        if (this.stream != null) {
            return;
        }
        this.httpEngine.writingRequestHeaders();
        FramedStream framedStreamNewStream = this.framedConnection.newStream(this.framedConnection.getProtocol() == Protocol.HTTP_2 ? http2HeadersList(request) : spdy3HeadersList(request), this.httpEngine.permitsRequestBody(request), true);
        this.stream = framedStreamNewStream;
        Timeout timeout = framedStreamNewStream.readTimeout();
        long readTimeout = this.httpEngine.client.getReadTimeout();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeout, timeUnit);
        this.stream.writeTimeout().timeout(this.httpEngine.client.getWriteTimeout(), timeUnit);
    }
}
