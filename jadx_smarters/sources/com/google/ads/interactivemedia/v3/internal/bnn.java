package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bnn extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        int iR = bohVar.r();
        if (iR != 9) {
            return Boolean.valueOf(iR == 6 ? Boolean.parseBoolean(bohVar.h()) : bohVar.q());
        }
        bohVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        bojVar.j((Boolean) obj);
    }
}
