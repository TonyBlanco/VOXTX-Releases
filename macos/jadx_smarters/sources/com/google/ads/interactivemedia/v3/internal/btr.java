package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class btr extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final btr f22300a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bqt f22301d = bqn.aF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bqs f22302e = bqn.aE();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bqs f22303f = bqn.aE();

    static {
        btr btrVar = new btr();
        f22300a = btrVar;
        bqn.aL(btr.class, btrVar);
    }

    private btr() {
    }

    public static btr e() {
        return f22300a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f22300a, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001e\u0005,", new Object[]{"d", "e", btv.a(), "f", btx.a()});
        }
        if (i10 == 3) {
            return new btr();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bts(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f22300a;
    }
}
