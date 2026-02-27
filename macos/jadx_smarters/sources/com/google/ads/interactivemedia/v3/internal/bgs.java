package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgs extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgs f21280a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21282e;

    static {
        bgs bgsVar = new bgs();
        f21280a = bgsVar;
        bqn.aL(bgs.class, bgsVar);
    }

    private bgs() {
    }

    public static bgs c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgs) bqn.aC(f21280a, bpbVar, bqbVar);
    }

    public static bif e() {
        return (bif) f21280a.ay();
    }

    public final int a() {
        return this.f21281d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21280a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"e", "d"});
        }
        if (i10 == 3) {
            return new bgs();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, bArr, (int[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21280a;
    }
}
