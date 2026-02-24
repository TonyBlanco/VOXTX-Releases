package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class bnd extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        if (bohVar.r() == 9) {
            bohVar.m();
            return null;
        }
        String strH = bohVar.h();
        try {
            return UUID.fromString(strH);
        } catch (IllegalArgumentException e9) {
            throw new bkf("Failed parsing '" + strH + "' as UUID; at path " + bohVar.f(), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        bojVar.l(uuid == null ? null : uuid.toString());
    }
}
