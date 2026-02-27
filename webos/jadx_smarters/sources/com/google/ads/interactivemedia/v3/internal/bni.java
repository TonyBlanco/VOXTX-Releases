package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
final class bni extends bkl {
    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ Object read(boh bohVar) throws IOException {
        BitSet bitSet = new BitSet();
        bohVar.i();
        int iR = bohVar.r();
        int i9 = 0;
        while (iR != 2) {
            int i10 = iR - 1;
            if (i10 == 5 || i10 == 6) {
                int iB = bohVar.b();
                if (iB != 0) {
                    if (iB != 1) {
                        throw new bkf("Invalid bitset value " + iB + ", expected 0 or 1; at path " + bohVar.f());
                    }
                    bitSet.set(i9);
                } else {
                    continue;
                }
            } else {
                if (i10 != 7) {
                    throw new bkf("Invalid bitset value type: " + boi.a(iR) + "; at path " + bohVar.e());
                }
                if (bohVar.q()) {
                    bitSet.set(i9);
                }
            }
            i9++;
            iR = bohVar.r();
        }
        bohVar.k();
        return bitSet;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkl
    public final /* bridge */ /* synthetic */ void write(boj bojVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bojVar.b();
        int length = bitSet.length();
        for (int i9 = 0; i9 < length; i9++) {
            bojVar.i(bitSet.get(i9) ? 1L : 0L);
        }
        bojVar.d();
    }
}
