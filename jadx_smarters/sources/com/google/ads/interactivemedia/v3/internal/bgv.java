package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgv extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgv f21289a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21291e = bpb.f21870b;

    static {
        bgv bgvVar = new bgv();
        f21289a = bgvVar;
        bqn.aL(bgv.class, bgvVar);
    }

    private bgv() {
    }

    public static bgv c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgv) bqn.aC(f21289a, bpbVar, bqbVar);
    }

    public static bif g() {
        return (bif) f21289a.ay();
    }

    public final int a() {
        return this.f21290d;
    }

    public final bpb d() {
        return this.f21291e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21289a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgv();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21289a;
    }
}
