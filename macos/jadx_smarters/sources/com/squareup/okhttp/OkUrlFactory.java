package com.squareup.okhttp;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.huc.CacheAdapter;
import com.squareup.okhttp.internal.huc.HttpURLConnectionImpl;
import com.squareup.okhttp.internal.huc.HttpsURLConnectionImpl;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ResponseCache;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import org.apache.http.HttpHost;

/* JADX INFO: loaded from: classes4.dex */
public final class OkUrlFactory implements URLStreamHandlerFactory, Cloneable {
    private final OkHttpClient client;

    public OkUrlFactory(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public OkHttpClient client() {
        return this.client;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public OkUrlFactory m15clone() {
        return new OkUrlFactory(this.client.m14clone());
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals(HttpHost.DEFAULT_SCHEME_NAME) || str.equals(ClientConstants.DOMAIN_SCHEME)) {
            return new URLStreamHandler() { // from class: com.squareup.okhttp.OkUrlFactory.1
                @Override // java.net.URLStreamHandler
                public int getDefaultPort() {
                    if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                        return 80;
                    }
                    if (str.equals(ClientConstants.DOMAIN_SCHEME)) {
                        return 443;
                    }
                    throw new AssertionError();
                }

                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url) {
                    return OkUrlFactory.this.open(url);
                }

                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url, Proxy proxy) {
                    return OkUrlFactory.this.open(url, proxy);
                }
            };
        }
        return null;
    }

    public ResponseCache getResponseCache() {
        InternalCache internalCache = this.client.internalCache();
        if (internalCache instanceof CacheAdapter) {
            return ((CacheAdapter) internalCache).getDelegate();
        }
        return null;
    }

    public HttpURLConnection open(URL url) {
        return open(url, this.client.getProxy());
    }

    public HttpURLConnection open(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient okHttpClientCopyWithDefaults = this.client.copyWithDefaults();
        okHttpClientCopyWithDefaults.setProxy(proxy);
        if (protocol.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return new HttpURLConnectionImpl(url, okHttpClientCopyWithDefaults);
        }
        if (protocol.equals(ClientConstants.DOMAIN_SCHEME)) {
            return new HttpsURLConnectionImpl(url, okHttpClientCopyWithDefaults);
        }
        throw new IllegalArgumentException("Unexpected protocol: " + protocol);
    }

    public OkUrlFactory setResponseCache(ResponseCache responseCache) {
        this.client.setInternalCache(responseCache != null ? new CacheAdapter(responseCache) : null);
        return this;
    }
}
