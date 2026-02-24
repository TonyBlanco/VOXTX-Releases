package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes3.dex */
final class bnb extends bkl {
    public static final URI a(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        try {
            String strH = bohVar.h();
            if (Constants.NULL_VERSION_ID.equals(strH)) {
                return null;
            }
            return new URI(strH);
        } catch (URISyntaxException e9) {
            throw new bjz(e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        return a(bohVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bojVar.l(uri == null ? null : uri.toASCIIString());
    }
}
