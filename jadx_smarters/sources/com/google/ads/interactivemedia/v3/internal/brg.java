package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class brg extends brh {
    private brg() {
    }

    public /* synthetic */ brg(byte[] bArr) {
    }

    public static bqt a(Object obj, long j9) {
        return (bqt) btf.h(obj, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brh
    public final List b(Object obj, long j9) {
        bqt bqtVarA = a(obj, j9);
        if (bqtVarA.c()) {
            return bqtVarA;
        }
        int size = bqtVarA.size();
        bqt bqtVarD = bqtVarA.d(size == 0 ? 10 : size + size);
        btf.w(obj, j9, bqtVarD);
        return bqtVarD;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brh
    public final void c(Object obj, long j9) {
        a(obj, j9).b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brh
    public final void d(Object obj, Object obj2, long j9) {
        bqt bqtVarA = a(obj, j9);
        bqt bqtVarA2 = a(obj2, j9);
        int size = bqtVarA.size();
        int size2 = bqtVarA2.size();
        if (size > 0 && size2 > 0) {
            if (!bqtVarA.c()) {
                bqtVarA = bqtVarA.d(size2 + size);
            }
            bqtVarA.addAll(bqtVarA2);
        }
        if (size > 0) {
            bqtVarA2 = bqtVarA;
        }
        btf.w(obj, j9, bqtVarA2);
    }
}
