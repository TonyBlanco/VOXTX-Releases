package com.squareup.okhttp.internal.huc;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.http.CacheStrategy;
import java.io.IOException;
import java.io.OutputStream;
import java.net.CacheResponse;
import java.net.ResponseCache;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public final class CacheAdapter implements InternalCache {
    private final ResponseCache delegate;

    public CacheAdapter(ResponseCache responseCache) {
        this.delegate = responseCache;
    }

    private CacheResponse getJavaCachedResponse(Request request) throws IOException {
        return this.delegate.get(request.uri(), request.method(), JavaApiConverter.extractJavaHeaders(request));
    }

    @Override // com.squareup.okhttp.internal.InternalCache
    public Response get(Request request) throws IOException {
        CacheResponse javaCachedResponse = getJavaCachedResponse(request);
        if (javaCachedResponse == null) {
            return null;
        }
        return JavaApiConverter.createOkResponse(request, javaCachedResponse);
    }

    public ResponseCache getDelegate() {
        return this.delegate;
    }

    @Override // com.squareup.okhttp.internal.InternalCache
    public CacheRequest put(Response response) throws IOException {
        final java.net.CacheRequest cacheRequestPut = this.delegate.put(response.request().uri(), JavaApiConverter.createJavaUrlConnection(response));
        if (cacheRequestPut == null) {
            return null;
        }
        return new CacheRequest() { // from class: com.squareup.okhttp.internal.huc.CacheAdapter.1
            @Override // com.squareup.okhttp.internal.http.CacheRequest
            public void abort() {
                cacheRequestPut.abort();
            }

            @Override // com.squareup.okhttp.internal.http.CacheRequest
            public Sink body() throws IOException {
                OutputStream body = cacheRequestPut.getBody();
                if (body != null) {
                    return Okio.sink(body);
                }
                return null;
            }
        };
    }

    @Override // com.squareup.okhttp.internal.InternalCache
    public void remove(Request request) throws IOException {
    }

    @Override // com.squareup.okhttp.internal.InternalCache
    public void trackConditionalCacheHit() {
    }

    @Override // com.squareup.okhttp.internal.InternalCache
    public void trackResponse(CacheStrategy cacheStrategy) {
    }

    @Override // com.squareup.okhttp.internal.InternalCache
    public void update(Response response, Response response2) throws IOException {
    }
}
