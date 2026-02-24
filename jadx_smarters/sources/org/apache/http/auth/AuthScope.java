package org.apache.http.auth;

import java.util.Locale;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class AuthScope {
    public static final AuthScope ANY = new AuthScope(null, -1, null, null);
    public static final String ANY_HOST = null;
    public static final int ANY_PORT = -1;
    public static final String ANY_REALM = null;
    public static final String ANY_SCHEME = null;
    private final String host;
    private final HttpHost origin;
    private final int port;
    private final String realm;
    private final String scheme;

    public AuthScope(String str, int i9) {
        this(str, i9, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(String str, int i9, String str2) {
        this(str, i9, str2, ANY_SCHEME);
    }

    public AuthScope(String str, int i9, String str2, String str3) {
        this.host = str == null ? ANY_HOST : str.toLowerCase(Locale.ROOT);
        this.port = i9 < 0 ? -1 : i9;
        this.realm = str2 == null ? ANY_REALM : str2;
        this.scheme = str3 == null ? ANY_SCHEME : str3.toUpperCase(Locale.ROOT);
        this.origin = null;
    }

    public AuthScope(HttpHost httpHost) {
        this(httpHost, ANY_REALM, ANY_SCHEME);
    }

    public AuthScope(HttpHost httpHost, String str, String str2) {
        Args.notNull(httpHost, "Host");
        String hostName = httpHost.getHostName();
        Locale locale = Locale.ROOT;
        this.host = hostName.toLowerCase(locale);
        this.port = httpHost.getPort() < 0 ? -1 : httpHost.getPort();
        this.realm = str == null ? ANY_REALM : str;
        this.scheme = str2 == null ? ANY_SCHEME : str2.toUpperCase(locale);
        this.origin = httpHost;
    }

    public AuthScope(AuthScope authScope) {
        Args.notNull(authScope, "Scope");
        this.host = authScope.getHost();
        this.port = authScope.getPort();
        this.realm = authScope.getRealm();
        this.scheme = authScope.getScheme();
        this.origin = authScope.getOrigin();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthScope)) {
            return super.equals(obj);
        }
        AuthScope authScope = (AuthScope) obj;
        return LangUtils.equals(this.host, authScope.host) && this.port == authScope.port && LangUtils.equals(this.realm, authScope.realm) && LangUtils.equals(this.scheme, authScope.scheme);
    }

    public String getHost() {
        return this.host;
    }

    public HttpHost getOrigin() {
        return this.origin;
    }

    public int getPort() {
        return this.port;
    }

    public String getRealm() {
        return this.realm;
    }

    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.host), this.port), this.realm), this.scheme);
    }

    public int match(AuthScope authScope) {
        int i9;
        if (LangUtils.equals(this.scheme, authScope.scheme)) {
            i9 = 1;
        } else {
            String str = this.scheme;
            String str2 = ANY_SCHEME;
            if (str != str2 && authScope.scheme != str2) {
                return -1;
            }
            i9 = 0;
        }
        if (LangUtils.equals(this.realm, authScope.realm)) {
            i9 += 2;
        } else {
            String str3 = this.realm;
            String str4 = ANY_REALM;
            if (str3 != str4 && authScope.realm != str4) {
                return -1;
            }
        }
        int i10 = this.port;
        int i11 = authScope.port;
        if (i10 == i11) {
            i9 += 4;
        } else if (i10 != -1 && i11 != -1) {
            return -1;
        }
        if (LangUtils.equals(this.host, authScope.host)) {
            return i9 + 8;
        }
        String str5 = this.host;
        String str6 = ANY_HOST;
        if (str5 == str6 || authScope.host == str6) {
            return i9;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.scheme;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(TokenParser.SP);
        }
        if (this.realm != null) {
            sb.append('\'');
            sb.append(this.realm);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.host != null) {
            sb.append('@');
            sb.append(this.host);
            if (this.port >= 0) {
                sb.append(':');
                sb.append(this.port);
            }
        }
        return sb.toString();
    }
}
