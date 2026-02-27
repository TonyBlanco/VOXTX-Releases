package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afy extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afy f19551a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19554f = -1;

    static {
        afy afyVar = new afy();
        f19551a = afyVar;
        bqn.aL(afy.class, afyVar);
    }

    private afy() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19551a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"d", "e", aft.a(), "f"});
        }
        if (i10 == 3) {
            return new afy();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (short[]) bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19551a;
    }
}
