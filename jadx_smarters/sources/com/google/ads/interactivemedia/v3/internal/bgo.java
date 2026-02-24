package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgo extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgo f21269a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21270d;

    static {
        bgo bgoVar = new bgo();
        f21269a = bgoVar;
        bqn.aL(bgo.class, bgoVar);
    }

    private bgo() {
    }

    public static bgo c() {
        return f21269a;
    }

    public static bif e() {
        return (bif) f21269a.ay();
    }

    public final int a() {
        return this.f21270d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21269a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bgo();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21269a;
    }
}
