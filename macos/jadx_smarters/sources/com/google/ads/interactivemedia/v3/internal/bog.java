package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class bog extends bla {
    @Override // com.google.ads.interactivemedia.v3.internal.bla
    public final void a(boh bohVar) throws IOException {
        if (bohVar instanceof bmc) {
            ((bmc) bohVar).n();
            return;
        }
        int iS = bohVar.f21825a;
        if (iS == 0) {
            iS = bohVar.s();
        }
        if (iS == 13) {
            bohVar.f21825a = 9;
            return;
        }
        if (iS == 12) {
            bohVar.f21825a = 8;
            return;
        }
        if (iS == 14) {
            bohVar.f21825a = 10;
            return;
        }
        int iR = bohVar.r();
        throw new IllegalStateException("Expected a name but was " + boi.a(iR) + bohVar.t());
    }
}
