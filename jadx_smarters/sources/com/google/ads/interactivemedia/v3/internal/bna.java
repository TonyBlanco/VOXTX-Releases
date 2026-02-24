package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
final class bna extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        if (Constants.NULL_VERSION_ID.equals(strH)) {
            return null;
        }
        return new URL(strH);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bojVar.l(url == null ? null : url.toExternalForm());
    }
}
