package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgg extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgg f21244a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21245d;

    static {
        bgg bggVar = new bgg();
        f21244a = bggVar;
        bqn.aL(bgg.class, bggVar);
    }

    private bgg() {
    }

    public static bgg c() {
        return f21244a;
    }

    public static bif e() {
        return (bif) f21244a.ay();
    }

    public final int a() {
        return this.f21245d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21244a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bgg();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21244a;
    }
}
