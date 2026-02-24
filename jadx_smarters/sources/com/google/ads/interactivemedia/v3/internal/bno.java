package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bno extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() != 9) {
            return Boolean.valueOf(bohVar.h());
        }
        bohVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        bojVar.l(bool == null ? Constants.NULL_VERSION_ID : bool.toString());
    }
}
