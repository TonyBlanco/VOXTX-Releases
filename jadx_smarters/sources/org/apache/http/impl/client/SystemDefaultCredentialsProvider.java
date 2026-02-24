package org.apache.http.impl.client;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.SAFE)
public class SystemDefaultCredentialsProvider implements CredentialsProvider {
    private static final Map<String, String> SCHEME_MAP;
    private final BasicCredentialsProvider internal = new BasicCredentialsProvider();

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        SCHEME_MAP = concurrentHashMap;
        Locale locale = Locale.ROOT;
        concurrentHashMap.put("Basic".toUpperCase(locale), "Basic");
        concurrentHashMap.put("Digest".toUpperCase(locale), "Digest");
        concurrentHashMap.put("NTLM".toUpperCase(locale), "NTLM");
        concurrentHashMap.put("Negotiate".toUpperCase(locale), "SPNEGO");
        concurrentHashMap.put("Kerberos".toUpperCase(locale), "Kerberos");
    }

    private static PasswordAuthentication getSystemCreds(String str, AuthScope authScope, Authenticator.RequestorType requestorType) {
        return Authenticator.requestPasswordAuthentication(authScope.getHost(), null, authScope.getPort(), str, null, translateScheme(authScope.getScheme()), null, requestorType);
    }

    private static String translateScheme(String str) {
        if (str == null) {
            return null;
        }
        String str2 = SCHEME_MAP.get(str);
        return str2 != null ? str2 : str;
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void clear() {
        this.internal.clear();
    }

    @Override // org.apache.http.client.CredentialsProvider
    public Credentials getCredentials(AuthScope authScope) {
        Args.notNull(authScope, "Auth scope");
        Credentials credentials = this.internal.getCredentials(authScope);
        if (credentials != null) {
            return credentials;
        }
        if (authScope.getHost() != null) {
            HttpHost origin = authScope.getOrigin();
            String schemeName = origin != null ? origin.getSchemeName() : authScope.getPort() == 443 ? ClientConstants.DOMAIN_SCHEME : HttpHost.DEFAULT_SCHEME_NAME;
            PasswordAuthentication systemCreds = getSystemCreds(schemeName, authScope, Authenticator.RequestorType.SERVER);
            if (systemCreds == null) {
                systemCreds = getSystemCreds(schemeName, authScope, Authenticator.RequestorType.PROXY);
            }
            if (systemCreds == null) {
                String property = System.getProperty(schemeName + ".proxyHost");
                if (property != null) {
                    String property2 = System.getProperty(schemeName + ".proxyPort");
                    if (property2 != null) {
                        try {
                            if (authScope.match(new AuthScope(property, Integer.parseInt(property2))) >= 0) {
                                String property3 = System.getProperty(schemeName + ".proxyUser");
                                if (property3 != null) {
                                    String property4 = System.getProperty(schemeName + ".proxyPassword");
                                    systemCreds = new PasswordAuthentication(property3, property4 != null ? property4.toCharArray() : new char[0]);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            if (systemCreds != null) {
                String property5 = System.getProperty("http.auth.ntlm.domain");
                return property5 != null ? new NTCredentials(systemCreds.getUserName(), new String(systemCreds.getPassword()), null, property5) : "NTLM".equalsIgnoreCase(authScope.getScheme()) ? new NTCredentials(systemCreds.getUserName(), new String(systemCreds.getPassword()), null, null) : new UsernamePasswordCredentials(systemCreds.getUserName(), new String(systemCreds.getPassword()));
            }
        }
        return null;
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void setCredentials(AuthScope authScope, Credentials credentials) {
        this.internal.setCredentials(authScope, credentials);
    }
}
