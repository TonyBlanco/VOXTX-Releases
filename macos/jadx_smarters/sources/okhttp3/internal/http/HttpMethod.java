package okhttp3.internal.http;

import kotlin.jvm.internal.l;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPut;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(@NotNull String method) {
        l.e(method, "method");
        return (l.a(method, HttpGet.METHOD_NAME) || l.a(method, HttpHead.METHOD_NAME)) ? false : true;
    }

    public static final boolean requiresRequestBody(@NotNull String method) {
        l.e(method, "method");
        return l.a(method, "POST") || l.a(method, HttpPut.METHOD_NAME) || l.a(method, HttpPatch.METHOD_NAME) || l.a(method, "PROPPATCH") || l.a(method, "REPORT");
    }

    public final boolean invalidatesCache(@NotNull String method) {
        l.e(method, "method");
        return l.a(method, "POST") || l.a(method, HttpPatch.METHOD_NAME) || l.a(method, HttpPut.METHOD_NAME) || l.a(method, HttpDelete.METHOD_NAME) || l.a(method, "MOVE");
    }

    public final boolean redirectsToGet(@NotNull String method) {
        l.e(method, "method");
        return !l.a(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String method) {
        l.e(method, "method");
        return l.a(method, "PROPFIND");
    }
}
