package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bue extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bue f22425a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bqs f22426d = bqn.aE();

    static {
        bue bueVar = new bue();
        f22425a = bueVar;
        bqn.aL(bue.class, bueVar);
    }

    private bue() {
    }

    public static bue e() {
        return f22425a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f22425a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"d", bui.b()});
        }
        if (i10 == 3) {
            return new bue();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bub(bArr, (short[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f22425a;
    }
}
