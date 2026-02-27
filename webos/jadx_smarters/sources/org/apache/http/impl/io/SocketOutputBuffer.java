package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i9, HttpParams httpParams) throws IOException {
        Args.notNull(socket, "Socket");
        i9 = i9 < 0 ? socket.getSendBufferSize() : i9;
        init(socket.getOutputStream(), i9 < 1024 ? 1024 : i9, httpParams);
    }
}
