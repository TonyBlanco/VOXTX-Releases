package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgu extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgu f21286a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21288e;

    static {
        bgu bguVar = new bgu();
        f21286a = bguVar;
        bqn.aL(bgu.class, bguVar);
    }

    private bgu() {
    }

    public static bgu c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgu) bqn.aC(f21286a, bpbVar, bqbVar);
    }

    public static bif e() {
        return (bif) f21286a.ay();
    }

    public final int a() {
        return this.f21287d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21286a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgu();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21286a;
    }
}
