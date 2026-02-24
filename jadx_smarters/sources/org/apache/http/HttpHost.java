package org.apache.http;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public final class HttpHost implements Cloneable, Serializable {
    public static final String DEFAULT_SCHEME_NAME = "http";
    private static final long serialVersionUID = -7529410654042457626L;
    protected final InetAddress address;
    protected final String hostname;
    protected final String lcHostname;
    protected final int port;
    protected final String schemeName;

    public HttpHost(String str) {
        this(str, -1, (String) null);
    }

    public HttpHost(String str, int i9) {
        this(str, i9, (String) null);
    }

    public HttpHost(String str, int i9, String str2) {
        this.hostname = (String) Args.containsNoBlanks(str, "Host name");
        Locale locale = Locale.ROOT;
        this.lcHostname = str.toLowerCase(locale);
        this.schemeName = str2 != null ? str2.toLowerCase(locale) : DEFAULT_SCHEME_NAME;
        this.port = i9;
        this.address = null;
    }

    public HttpHost(InetAddress inetAddress) {
        this(inetAddress, -1, (String) null);
    }

    public HttpHost(InetAddress inetAddress, int i9) {
        this(inetAddress, i9, (String) null);
    }

    public HttpHost(InetAddress inetAddress, int i9, String str) {
        this((InetAddress) Args.notNull(inetAddress, "Inet address"), inetAddress.getHostName(), i9, str);
    }

    public HttpHost(InetAddress inetAddress, String str, int i9, String str2) {
        this.address = (InetAddress) Args.notNull(inetAddress, "Inet address");
        String str3 = (String) Args.notNull(str, "Hostname");
        this.hostname = str3;
        Locale locale = Locale.ROOT;
        this.lcHostname = str3.toLowerCase(locale);
        this.schemeName = str2 != null ? str2.toLowerCase(locale) : DEFAULT_SCHEME_NAME;
        this.port = i9;
    }

    public HttpHost(HttpHost httpHost) {
        Args.notNull(httpHost, "HTTP host");
        this.hostname = httpHost.hostname;
        this.lcHostname = httpHost.lcHostname;
        this.schemeName = httpHost.schemeName;
        this.port = httpHost.port;
        this.address = httpHost.address;
    }

    public static HttpHost create(String str) {
        String strSubstring;
        int i9;
        Args.containsNoBlanks(str, "HTTP Host");
        int iIndexOf = str.indexOf("://");
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 3);
        } else {
            strSubstring = null;
        }
        int iLastIndexOf = str.lastIndexOf(":");
        if (iLastIndexOf > 0) {
            try {
                i9 = Integer.parseInt(str.substring(iLastIndexOf + 1));
                str = str.substring(0, iLastIndexOf);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Invalid HTTP host: " + str);
            }
        } else {
            i9 = -1;
        }
        return new HttpHost(str, i9, strSubstring);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHost)) {
            return false;
        }
        HttpHost httpHost = (HttpHost) obj;
        if (this.lcHostname.equals(httpHost.lcHostname) && this.port == httpHost.port && this.schemeName.equals(httpHost.schemeName)) {
            InetAddress inetAddress = this.address;
            InetAddress inetAddress2 = httpHost.address;
            if (inetAddress == null) {
                if (inetAddress2 == null) {
                    return true;
                }
            } else if (inetAddress.equals(inetAddress2)) {
                return true;
            }
        }
        return false;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public String getHostName() {
        return this.hostname;
    }

    public int getPort() {
        return this.port;
    }

    public String getSchemeName() {
        return this.schemeName;
    }

    public int hashCode() {
        int iHashCode = LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.lcHostname), this.port), this.schemeName);
        InetAddress inetAddress = this.address;
        return inetAddress != null ? LangUtils.hashCode(iHashCode, inetAddress) : iHashCode;
    }

    public String toHostString() {
        if (this.port == -1) {
            return this.hostname;
        }
        StringBuilder sb = new StringBuilder(this.hostname.length() + 6);
        sb.append(this.hostname);
        sb.append(":");
        sb.append(Integer.toString(this.port));
        return sb.toString();
    }

    public String toString() {
        return toURI();
    }

    public String toURI() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.schemeName);
        sb.append("://");
        sb.append(this.hostname);
        if (this.port != -1) {
            sb.append(':');
            sb.append(Integer.toString(this.port));
        }
        return sb.toString();
    }
}
