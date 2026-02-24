package org.apache.http.client.params;

import java.util.Collection;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ClientParamBean extends HttpAbstractParamBean {
    public ClientParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setAllowCircularRedirects(boolean z9) {
        this.params.setBooleanParameter(ClientPNames.ALLOW_CIRCULAR_REDIRECTS, z9);
    }

    @Deprecated
    public void setConnectionManagerFactoryClassName(String str) {
        this.params.setParameter(ClientPNames.CONNECTION_MANAGER_FACTORY_CLASS_NAME, str);
    }

    public void setConnectionManagerTimeout(long j9) {
        this.params.setLongParameter("http.conn-manager.timeout", j9);
    }

    public void setCookiePolicy(String str) {
        this.params.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public void setDefaultHeaders(Collection<Header> collection) {
        this.params.setParameter(ClientPNames.DEFAULT_HEADERS, collection);
    }

    public void setDefaultHost(HttpHost httpHost) {
        this.params.setParameter(ClientPNames.DEFAULT_HOST, httpHost);
    }

    public void setHandleAuthentication(boolean z9) {
        this.params.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z9);
    }

    public void setHandleRedirects(boolean z9) {
        this.params.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z9);
    }

    public void setMaxRedirects(int i9) {
        this.params.setIntParameter(ClientPNames.MAX_REDIRECTS, i9);
    }

    public void setRejectRelativeRedirect(boolean z9) {
        this.params.setBooleanParameter(ClientPNames.REJECT_RELATIVE_REDIRECT, z9);
    }

    public void setVirtualHost(HttpHost httpHost) {
        this.params.setParameter(ClientPNames.VIRTUAL_HOST, httpHost);
    }
}
