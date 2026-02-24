package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        return !request.isHttps() && type == Proxy.Type.HTTP;
    }

    @NotNull
    public final String get(@NotNull Request request, @NotNull Proxy.Type proxyType) {
        l.e(request, "request");
        l.e(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(TokenParser.SP);
        RequestLine requestLine = INSTANCE;
        boolean zIncludeAuthorityInRequestLine = requestLine.includeAuthorityInRequestLine(request, proxyType);
        HttpUrl httpUrlUrl = request.url();
        if (zIncludeAuthorityInRequestLine) {
            sb.append(httpUrlUrl);
        } else {
            sb.append(requestLine.requestPath(httpUrlUrl));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public final String requestPath(@NotNull HttpUrl url) {
        l.e(url, "url");
        String strEncodedPath = url.encodedPath();
        String strEncodedQuery = url.encodedQuery();
        if (strEncodedQuery == null) {
            return strEncodedPath;
        }
        return strEncodedPath + '?' + strEncodedQuery;
    }
}
