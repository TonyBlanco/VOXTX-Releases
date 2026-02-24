package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes3.dex */
final class bnc extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() != 9) {
            return InetAddress.getByName(bohVar.h());
        }
        bohVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        bojVar.l(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
