package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class buo extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final buo f22565a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f22567e = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bqt f22566d = bqn.aF();

    static {
        buo buoVar = new buo();
        f22565a = buoVar;
        bqn.aL(buo.class, buoVar);
    }

    private buo() {
    }

    public static buo e() {
        return f22565a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.f22567e);
        }
        if (i10 == 2) {
            return bqn.aI(f22565a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"d", bun.class});
        }
        if (i10 == 3) {
            return new buo();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bum(bArr, bArr);
        }
        if (i10 == 5) {
            return f22565a;
        }
        this.f22567e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
