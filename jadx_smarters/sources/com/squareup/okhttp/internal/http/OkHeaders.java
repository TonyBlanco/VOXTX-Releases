package com.squareup.okhttp.internal.http;

import com.amplifyframework.core.model.ModelIdentifier;
import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.Challenge;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.SM;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes4.dex */
public final class OkHeaders {
    private static final Comparator<String> FIELD_NAME_COMPARATOR = new Comparator<String>() { // from class: com.squareup.okhttp.internal.http.OkHeaders.1
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    };
    static final String PREFIX;
    public static final String RECEIVED_MILLIS;
    public static final String RESPONSE_SOURCE;
    public static final String SELECTED_PROTOCOL;
    public static final String SENT_MILLIS;

    static {
        String prefix = Platform.get().getPrefix();
        PREFIX = prefix;
        SENT_MILLIS = prefix + "-Sent-Millis";
        RECEIVED_MILLIS = prefix + "-Received-Millis";
        SELECTED_PROTOCOL = prefix + "-Selected-Protocol";
        RESPONSE_SOURCE = prefix + "-Response-Source";
    }

    private OkHeaders() {
    }

    public static void addCookies(Request.Builder builder, Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (SM.COOKIE.equalsIgnoreCase(key) || SM.COOKIE2.equalsIgnoreCase(key)) {
                if (!entry.getValue().isEmpty()) {
                    builder.addHeader(key, buildCookieHeader(entry.getValue()));
                }
            }
        }
    }

    private static String buildCookieHeader(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                sb.append("; ");
            }
            sb.append(list.get(i9));
        }
        return sb.toString();
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static long contentLength(Request request) {
        return contentLength(request.headers());
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    public static boolean isEndToEnd(String str) {
        return ("Connection".equalsIgnoreCase(str) || HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || HttpHeaders.TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (str.equalsIgnoreCase(headers.name(i9))) {
                String strValue = headers.value(i9);
                int iSkipWhitespace = 0;
                while (iSkipWhitespace < strValue.length()) {
                    int iSkipUntil = HeaderParser.skipUntil(strValue, iSkipWhitespace, " ");
                    String strTrim = strValue.substring(iSkipWhitespace, iSkipUntil).trim();
                    int iSkipWhitespace2 = HeaderParser.skipWhitespace(strValue, iSkipUntil);
                    if (!strValue.regionMatches(true, iSkipWhitespace2, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i10 = iSkipWhitespace2 + 7;
                    int iSkipUntil2 = HeaderParser.skipUntil(strValue, i10, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                    String strSubstring = strValue.substring(i10, iSkipUntil2);
                    iSkipWhitespace = HeaderParser.skipWhitespace(strValue, HeaderParser.skipUntil(strValue, iSkipUntil2 + 1, ",") + 1);
                    arrayList.add(new Challenge(strTrim, strSubstring));
                }
            }
        }
        return arrayList;
    }

    public static Request processAuthHeader(Authenticator authenticator, Response response, Proxy proxy) throws IOException {
        return response.code() == 407 ? authenticator.authenticateProxy(proxy, response) : authenticator.authenticate(proxy, response);
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Map<String, List<String>> toMultimap(Headers headers, String str) {
        TreeMap treeMap = new TreeMap(FIELD_NAME_COMPARATOR);
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = headers.name(i9);
            String strValue = headers.value(i9);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(strName);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(strValue);
            treeMap.put(strName, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> setEmptySet = Collections.emptySet();
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(headers.name(i9))) {
                String strValue = headers.value(i9);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strValue.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> setVaryFields = varyFields(headers2);
        if (setVaryFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i9 = 0; i9 < size; i9++) {
            String strName = headers.name(i9);
            if (setVaryFields.contains(strName)) {
                builder.add(strName, headers.value(i9));
            }
        }
        return builder.build();
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }
}
