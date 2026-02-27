package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afr extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afr f19490a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19492e;

    static {
        afr afrVar = new afr();
        f19490a = afrVar;
        bqn.aL(afr.class, afrVar);
    }

    private afr() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19490a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "e", afu.a()});
        }
        if (i10 == 3) {
            return new afr();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, bArr, bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19490a;
    }
}
