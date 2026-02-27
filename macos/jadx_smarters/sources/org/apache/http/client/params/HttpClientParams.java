package org.apache.http.client.params;

import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class HttpClientParams {
    private HttpClientParams() {
    }

    public static long getConnectionManagerTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        Long l9 = (Long) httpParams.getParameter("http.conn-manager.timeout");
        return l9 != null ? l9.longValue() : HttpConnectionParams.getConnectionTimeout(httpParams);
    }

    public static String getCookiePolicy(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(ClientPNames.COOKIE_POLICY);
        return str == null ? "best-match" : str;
    }

    public static boolean isAuthenticating(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, true);
    }

    public static boolean isRedirecting(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, true);
    }

    public static void setAuthenticating(HttpParams httpParams, boolean z9) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z9);
    }

    public static void setConnectionManagerTimeout(HttpParams httpParams, long j9) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setLongParameter("http.conn-manager.timeout", j9);
    }

    public static void setCookiePolicy(HttpParams httpParams, String str) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public static void setRedirecting(HttpParams httpParams, boolean z9) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z9);
    }
}
