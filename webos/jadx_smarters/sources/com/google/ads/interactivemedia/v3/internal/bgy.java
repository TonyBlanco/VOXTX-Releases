package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgy extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgy f21299a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bht f21300d;

    static {
        bgy bgyVar = new bgy();
        f21299a = bgyVar;
        bqn.aL(bgy.class, bgyVar);
    }

    private bgy() {
    }

    public static bgy b() {
        return f21299a;
    }

    public static /* synthetic */ void d(bgy bgyVar, bht bhtVar) {
        bhtVar.getClass();
        bgyVar.f21300d = bhtVar;
    }

    public static bif e() {
        return (bif) f21299a.ay();
    }

    public final bht c() {
        bht bhtVar = this.f21300d;
        return bhtVar == null ? bht.b() : bhtVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21299a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bgy();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21299a;
    }
}
