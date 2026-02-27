package okhttp3;

import E8.n;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.i;
import kotlin.jvm.internal.l;
import l8.AbstractC2205B;
import l8.k;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class Request {

    @Nullable
    private final RequestBody body;

    @NotNull
    private final Headers headers;
    private CacheControl lazyCacheControl;

    @NotNull
    private final String method;

    @NotNull
    private final Map<Class<?>, Object> tags;

    @NotNull
    private final HttpUrl url;

    public static class Builder {

        @Nullable
        private RequestBody body;

        @NotNull
        private Headers.Builder headers;

        @NotNull
        private String method;

        @NotNull
        private Map<Class<?>, Object> tags;

        @Nullable
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = HttpGet.METHOD_NAME;
            this.headers = new Headers.Builder();
        }

        public Builder(@NotNull Request request) {
            l.e(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            this.tags = request.getTags$okhttp().isEmpty() ? new LinkedHashMap<>() : AbstractC2205B.n(request.getTags$okhttp());
            this.headers = request.headers().newBuilder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i9 & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        @NotNull
        public Builder addHeader(@NotNull String name, @NotNull String value) {
            l.e(name, "name");
            l.e(value, "value");
            this.headers.add(name, value);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl) {
            l.e(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        @NotNull
        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        @NotNull
        public Builder delete(@Nullable RequestBody requestBody) {
            return method(HttpDelete.METHOD_NAME, requestBody);
        }

        @NotNull
        public Builder get() {
            return method(HttpGet.METHOD_NAME, null);
        }

        @Nullable
        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        @NotNull
        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.method;
        }

        @NotNull
        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        @NotNull
        public Builder head() {
            return method(HttpHead.METHOD_NAME, null);
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

        @NotNull
        public Builder method(@NotNull String method, @Nullable RequestBody requestBody) {
            l.e(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (requestBody == null) {
                if (!(true ^ HttpMethod.requiresRequestBody(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = requestBody;
            return this;
        }

        @NotNull
        public Builder patch(@NotNull RequestBody body) {
            l.e(body, "body");
            return method(HttpPatch.METHOD_NAME, body);
        }

        @NotNull
        public Builder post(@NotNull RequestBody body) {
            l.e(body, "body");
            return method("POST", body);
        }

        @NotNull
        public Builder put(@NotNull RequestBody body) {
            l.e(body, "body");
            return method(HttpPut.METHOD_NAME, body);
        }

        @NotNull
        public Builder removeHeader(@NotNull String name) {
            l.e(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(@NotNull Headers.Builder builder) {
            l.e(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(@NotNull String str) {
            l.e(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(@NotNull Map<Class<?>, Object> map) {
            l.e(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        @NotNull
        public <T> Builder tag(@NotNull Class<? super T> type, @Nullable T t9) {
            l.e(type, "type");
            if (t9 == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T tCast = type.cast(t9);
                l.b(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        @NotNull
        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        @NotNull
        public Builder url(@NotNull String url) {
            StringBuilder sb;
            int i9;
            l.e(url, "url");
            if (!n.z(url, "ws:", true)) {
                if (n.z(url, "wss:", true)) {
                    sb = new StringBuilder();
                    sb.append("https:");
                    i9 = 4;
                }
                return url(HttpUrl.Companion.get(url));
            }
            sb = new StringBuilder();
            sb.append("http:");
            i9 = 3;
            String strSubstring = url.substring(i9);
            l.d(strSubstring, "(this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
            url = sb.toString();
            return url(HttpUrl.Companion.get(url));
        }

        @NotNull
        public Builder url(@NotNull URL url) {
            l.e(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            l.d(string, "url.toString()");
            return url(companion.get(string));
        }

        @NotNull
        public Builder url(@NotNull HttpUrl url) {
            l.e(url, "url");
            this.url = url;
            return this;
        }
    }

    public Request(@NotNull HttpUrl url, @NotNull String method, @NotNull Headers headers, @Nullable RequestBody requestBody, @NotNull Map<Class<?>, ? extends Object> tags) {
        l.e(url, "url");
        l.e(method, "method");
        l.e(headers, "headers");
        l.e(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    @Nullable
    /* JADX INFO: renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m138deprecated_body() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m139deprecated_cacheControl() {
        return cacheControl();
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m140deprecated_headers() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_method, reason: not valid java name */
    public final String m141deprecated_method() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m142deprecated_url() {
        return this.url;
    }

    @Nullable
    public final RequestBody body() {
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

    @NotNull
    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    @Nullable
    public final String header(@NotNull String name) {
        l.e(name, "name");
        return this.headers.get(name);
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

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    @NotNull
    public final String method() {
        return this.method;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return tag(Object.class);
    }

    @Nullable
    public final <T> T tag(@NotNull Class<? extends T> type) {
        l.e(type, "type");
        return type.cast(this.tags.get(type));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i9 = 0;
            for (i iVar : this.headers) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    k.n();
                }
                i iVar2 = iVar;
                String str = (String) iVar2.a();
                String str2 = (String) iVar2.b();
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i9 = i10;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.append('}');
        String string = sb.toString();
        l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final HttpUrl url() {
        return this.url;
    }
}
