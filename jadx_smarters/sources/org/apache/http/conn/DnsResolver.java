package org.apache.http.conn;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public interface DnsResolver {
    InetAddress[] resolve(String str) throws UnknownHostException;
}
