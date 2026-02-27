package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bty extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bty f22390a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f22393f = "*";

    static {
        bty btyVar = new bty();
        f22390a = btyVar;
        bqn.aL(bty.class, btyVar);
    }

    private bty() {
    }

    public static bty e() {
        return f22390a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f22390a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "e", btz.a(), "f"});
        }
        if (i10 == 3) {
            return new bty();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bub(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f22390a;
    }
}
