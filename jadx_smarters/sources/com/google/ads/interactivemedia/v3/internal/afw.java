package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afw extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afw f19521a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19523e = -1;

    static {
        afw afwVar = new afw();
        f19521a = afwVar;
        bqn.aL(afw.class, afwVar);
    }

    private afw() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19521a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new afw();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (char[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0), (byte[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f19521a;
    }
}
