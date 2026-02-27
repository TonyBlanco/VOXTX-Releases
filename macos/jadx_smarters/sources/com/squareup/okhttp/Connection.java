package com.squareup.okhttp;

import java.net.Socket;

/* JADX INFO: loaded from: classes4.dex */
public interface Connection {
    Handshake getHandshake();

    Protocol getProtocol();

    Route getRoute();

    Socket getSocket();
}
