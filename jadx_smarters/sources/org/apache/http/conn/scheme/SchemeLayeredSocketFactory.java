package org.apache.http.conn.scheme;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface SchemeLayeredSocketFactory extends SchemeSocketFactory {
    Socket createLayeredSocket(Socket socket, String str, int i9, HttpParams httpParams) throws IOException;
}
