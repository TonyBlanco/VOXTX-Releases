package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.Socket;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
class LayeredSocketFactoryAdaptor extends SocketFactoryAdaptor implements LayeredSocketFactory {
    private final LayeredSchemeSocketFactory factory;

    public LayeredSocketFactoryAdaptor(LayeredSchemeSocketFactory layeredSchemeSocketFactory) {
        super(layeredSchemeSocketFactory);
        this.factory = layeredSchemeSocketFactory;
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i9, boolean z9) throws IOException {
        return this.factory.createLayeredSocket(socket, str, i9, z9);
    }
}
