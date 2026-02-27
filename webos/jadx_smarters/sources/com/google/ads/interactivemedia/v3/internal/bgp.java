package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgp extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgp f21271a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f21273e = bpb.f21870b;

    static {
        bgp bgpVar = new bgp();
        f21271a = bgpVar;
        bqn.aL(bgp.class, bgpVar);
    }

    private bgp() {
    }

    public static bgp c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgp) bqn.aC(f21271a, bpbVar, bqbVar);
    }

    public static bif g() {
        return (bif) f21271a.ay();
    }

    public final int a() {
        return this.f21272d;
    }

    public final bpb d() {
        return this.f21273e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21271a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgp();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (short[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21271a;
    }
}
