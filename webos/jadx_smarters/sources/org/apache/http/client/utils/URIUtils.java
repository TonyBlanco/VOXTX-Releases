package org.apache.http.client.utils;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class URIUtils {
    private URIUtils() {
    }

    @Deprecated
    public static URI createURI(String str, String str2, int i9, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i9 > 0) {
                sb.append(':');
                sb.append(i9);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }

    public static HttpHost extractHost(URI uri) {
        int iIndexOf;
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        int port = uri.getPort();
        String host = uri.getHost();
        if (host == null && (host = uri.getAuthority()) != null) {
            int iIndexOf2 = host.indexOf(64);
            if (iIndexOf2 >= 0) {
                int i9 = iIndexOf2 + 1;
                host = host.length() > i9 ? host.substring(i9) : null;
            }
            if (host != null && (iIndexOf = host.indexOf(58)) >= 0) {
                int i10 = iIndexOf + 1;
                int i11 = 0;
                for (int i12 = i10; i12 < host.length() && Character.isDigit(host.charAt(i12)); i12++) {
                    i11++;
                }
                if (i11 > 0) {
                    try {
                        port = Integer.parseInt(host.substring(i10, i11 + i10));
                    } catch (NumberFormatException unused) {
                    }
                }
                host = host.substring(0, iIndexOf);
            }
        }
        String scheme = uri.getScheme();
        if (TextUtils.isBlank(host)) {
            return null;
        }
        try {
            return new HttpHost(host, port, scheme);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public static URI normalizeSyntax(URI uri) throws URISyntaxException {
        if (uri.isOpaque() || uri.getAuthority() == null) {
            return uri;
        }
        Args.check(uri.isAbsolute(), "Base URI must be absolute");
        URIBuilder uRIBuilder = new URIBuilder(uri);
        String path = uRIBuilder.getPath();
        if (path != null && !path.equals("/")) {
            String[] strArrSplit = path.split("/");
            Stack<String> stack = new Stack();
            for (String str : strArrSplit) {
                if (!str.isEmpty() && !InstructionFileId.DOT.equals(str)) {
                    if (!"..".equals(str)) {
                        stack.push(str);
                    } else if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : stack) {
                sb.append('/');
                sb.append(str2);
            }
            if (path.lastIndexOf(47) == path.length() - 1) {
                sb.append('/');
            }
            uRIBuilder.setPath(sb.toString());
        }
        if (uRIBuilder.getScheme() != null) {
            uRIBuilder.setScheme(uRIBuilder.getScheme().toLowerCase(Locale.ROOT));
        }
        if (uRIBuilder.getHost() != null) {
            uRIBuilder.setHost(uRIBuilder.getHost().toLowerCase(Locale.ROOT));
        }
        return uRIBuilder.build();
    }

    public static URI resolve(URI uri, String str) {
        return resolve(uri, URI.create(str));
    }

    public static URI resolve(URI uri, URI uri2) {
        URI uriResolve;
        Args.notNull(uri, "Base URI");
        Args.notNull(uri2, "Reference URI");
        String aSCIIString = uri2.toASCIIString();
        if (!aSCIIString.startsWith("?")) {
            if (aSCIIString.isEmpty()) {
                String aSCIIString2 = uri.resolve(URI.create(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)).toASCIIString();
                uriResolve = URI.create(aSCIIString2.substring(0, aSCIIString2.indexOf(35)));
            } else {
                uriResolve = uri.resolve(uri2);
            }
            try {
                return normalizeSyntax(uriResolve);
            } catch (URISyntaxException e9) {
                throw new IllegalArgumentException(e9);
            }
        }
        String aSCIIString3 = uri.toASCIIString();
        int iIndexOf = aSCIIString3.indexOf(63);
        if (iIndexOf > -1) {
            aSCIIString3 = aSCIIString3.substring(0, iIndexOf);
        }
        return URI.create(aSCIIString3 + aSCIIString);
    }

    public static URI resolve(URI uri, HttpHost httpHost, List<URI> list) throws URISyntaxException {
        URIBuilder uRIBuilder;
        Args.notNull(uri, "Request URI");
        if (list == null || list.isEmpty()) {
            uRIBuilder = new URIBuilder(uri);
        } else {
            uRIBuilder = new URIBuilder(list.get(list.size() - 1));
            String fragment = uRIBuilder.getFragment();
            for (int size = list.size() - 1; fragment == null && size >= 0; size--) {
                fragment = list.get(size).getFragment();
            }
            uRIBuilder.setFragment(fragment);
        }
        if (uRIBuilder.getFragment() == null) {
            uRIBuilder.setFragment(uri.getFragment());
        }
        if (httpHost != null && !uRIBuilder.isAbsolute()) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            uRIBuilder.setPort(httpHost.getPort());
        }
        return uRIBuilder.build();
    }

    public static URI rewriteURI(URI uri) throws URISyntaxException {
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (uRIBuilder.getUserInfo() != null) {
            uRIBuilder.setUserInfo(null);
        }
        if (TextUtils.isEmpty(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        if (uRIBuilder.getHost() != null) {
            uRIBuilder.setHost(uRIBuilder.getHost().toLowerCase(Locale.ROOT));
        }
        uRIBuilder.setFragment(null);
        return uRIBuilder.build();
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost) throws URISyntaxException {
        return rewriteURI(uri, httpHost, false);
    }

    public static URI rewriteURI(URI uri, HttpHost httpHost, boolean z9) throws URISyntaxException {
        int port;
        Args.notNull(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        URIBuilder uRIBuilder = new URIBuilder(uri);
        if (httpHost != null) {
            uRIBuilder.setScheme(httpHost.getSchemeName());
            uRIBuilder.setHost(httpHost.getHostName());
            port = httpHost.getPort();
        } else {
            uRIBuilder.setScheme(null);
            uRIBuilder.setHost(null);
            port = -1;
        }
        uRIBuilder.setPort(port);
        if (z9) {
            uRIBuilder.setFragment(null);
        }
        if (TextUtils.isEmpty(uRIBuilder.getPath())) {
            uRIBuilder.setPath("/");
        }
        return uRIBuilder.build();
    }

    public static URI rewriteURIForRoute(URI uri, RouteInfo routeInfo) throws URISyntaxException {
        if (uri == null) {
            return null;
        }
        return (routeInfo.getProxyHost() == null || routeInfo.isTunnelled()) ? uri.isAbsolute() ? rewriteURI(uri, null, true) : rewriteURI(uri) : !uri.isAbsolute() ? rewriteURI(uri, routeInfo.getTargetHost(), true) : rewriteURI(uri);
    }
}
