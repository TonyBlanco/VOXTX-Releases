package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class buc extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final buc f22419a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bqs f22420d = bqn.aE();

    static {
        buc bucVar = new buc();
        f22419a = bucVar;
        bqn.aL(buc.class, bucVar);
    }

    private buc() {
    }

    public static buc e() {
        return f22419a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f22419a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"d", bui.b()});
        }
        if (i10 == 3) {
            return new buc();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bub(bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f22419a;
    }
}
