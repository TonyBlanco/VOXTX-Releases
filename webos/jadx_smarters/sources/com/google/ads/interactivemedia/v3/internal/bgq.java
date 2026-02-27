package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgq extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgq f21274a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21276e;

    static {
        bgq bgqVar = new bgq();
        f21274a = bgqVar;
        bqn.aL(bgq.class, bgqVar);
    }

    private bgq() {
    }

    public static bgq c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgq) bqn.aC(f21274a, bpbVar, bqbVar);
    }

    public static bif e() {
        return (bif) f21274a.ay();
    }

    public final int a() {
        return this.f21275d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21274a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgq();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, bArr, bArr, (short[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21274a;
    }
}
