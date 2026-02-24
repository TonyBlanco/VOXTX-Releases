package de.blinkt.openvpn.core;

import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class D {
    public static SocketAddress a(f8.l lVar) {
        try {
            Proxy proxyB = b(new URL(String.format("https://%s:%s", lVar.f40915p0, lVar.f40917q0)));
            if (proxyB == null) {
                return null;
            }
            SocketAddress socketAddressAddress = proxyB.address();
            if (socketAddressAddress instanceof InetSocketAddress) {
                return socketAddressAddress;
            }
        } catch (MalformedURLException e9) {
            G.o(a7.j.f13329n2, e9.getLocalizedMessage());
        } catch (URISyntaxException e10) {
            G.o(a7.j.f13329n2, e10.getLocalizedMessage());
        }
        return null;
    }

    public static Proxy b(URL url) {
        System.setProperty("java.net.useSystemProxies", "true");
        List<Proxy> listSelect = ProxySelector.getDefault().select(url.toURI());
        if (listSelect == null) {
            return null;
        }
        for (Proxy proxy : listSelect) {
            if (proxy.address() != null) {
                return proxy;
            }
        }
        return null;
    }
}
