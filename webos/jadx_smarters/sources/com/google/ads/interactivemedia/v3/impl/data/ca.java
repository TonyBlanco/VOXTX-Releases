package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.bkl;
import com.google.ads.interactivemedia.v3.internal.boh;
import com.google.ads.interactivemedia.v3.internal.boj;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class ca extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public cb read(boh bohVar) throws IOException {
        if (bohVar.r() != 9) {
            return new cb(bohVar.h());
        }
        bohVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public void write(boj bojVar, cb cbVar) throws IOException {
        if (cbVar == null) {
            bojVar.g();
        } else {
            bojVar.l(cbVar.getName());
        }
    }
}
