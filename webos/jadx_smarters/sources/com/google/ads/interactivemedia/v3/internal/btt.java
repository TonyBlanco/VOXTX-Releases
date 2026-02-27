package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class btt extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final btt f22304a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bqt f22305d = bqn.aF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bqs f22306e = bqn.aE();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bqs f22307f = bqn.aE();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bqs f22308g = bqn.aE();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bqt f22309h = bqn.aF();

    static {
        btt bttVar = new btt();
        f22304a = bttVar;
        bqn.aL(btt.class, bttVar);
    }

    private btt() {
    }

    public static btt e() {
        return f22304a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f22304a, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0005\u0000\u0001\u001a\u0002\u001e\u0003\u0016\u0004\u001a\u0005,", new Object[]{"d", "e", btv.a(), "g", "h", "f", btx.a()});
        }
        if (i10 == 3) {
            return new btt();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bts(bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f22304a;
    }
}
