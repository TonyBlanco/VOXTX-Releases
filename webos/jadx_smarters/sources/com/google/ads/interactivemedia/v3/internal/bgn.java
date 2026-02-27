package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgn extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgn f21266a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bgo f21267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21268e;

    static {
        bgn bgnVar = new bgn();
        f21266a = bgnVar;
        bqn.aL(bgn.class, bgnVar);
    }

    private bgn() {
    }

    public static bgn c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgn) bqn.aC(f21266a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void e(bgn bgnVar, bgo bgoVar) {
        bgoVar.getClass();
        bgnVar.f21267d = bgoVar;
    }

    public static bif g() {
        return (bif) f21266a.ay();
    }

    public final int a() {
        return this.f21268e;
    }

    public final bgo d() {
        bgo bgoVar = this.f21267d;
        return bgoVar == null ? bgo.c() : bgoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21266a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new bgn();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (char[]) null, (byte[]) null, (char[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21266a;
    }
}
