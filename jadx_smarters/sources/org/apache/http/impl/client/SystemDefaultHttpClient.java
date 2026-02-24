package org.apache.http.impl.client;

import java.net.ProxySelector;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
public class SystemDefaultHttpClient extends DefaultHttpClient {
    public SystemDefaultHttpClient() {
        super(null, null);
    }

    public SystemDefaultHttpClient(HttpParams httpParams) {
        super(null, httpParams);
    }

    @Override // org.apache.http.impl.client.AbstractHttpClient
    public ClientConnectionManager createClientConnectionManager() {
        PoolingClientConnectionManager poolingClientConnectionManager = new PoolingClientConnectionManager(SchemeRegistryFactory.createSystemDefault());
        if ("true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
            int i9 = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
            poolingClientConnectionManager.setDefaultMaxPerRoute(i9);
            poolingClientConnectionManager.setMaxTotal(i9 * 2);
        }
        return poolingClientConnectionManager;
    }

    @Override // org.apache.http.impl.client.AbstractHttpClient
    public ConnectionReuseStrategy createConnectionReuseStrategy() {
        return "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true")) ? new DefaultConnectionReuseStrategy() : new NoConnectionReuseStrategy();
    }

    @Override // org.apache.http.impl.client.AbstractHttpClient
    public HttpRoutePlanner createHttpRoutePlanner() {
        return new ProxySelectorRoutePlanner(getConnectionManager().getSchemeRegistry(), ProxySelector.getDefault());
    }
}
