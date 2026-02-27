package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhm extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhm f21381a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bhn f21382d;

    static {
        bhm bhmVar = new bhm();
        f21381a = bhmVar;
        bqn.aL(bhm.class, bhmVar);
    }

    private bhm() {
    }

    public static bhm b(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhm) bqn.aC(f21381a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void d(bhm bhmVar, bhn bhnVar) {
        bhnVar.getClass();
        bhmVar.f21382d = bhnVar;
    }

    public static bif e() {
        return (bif) f21381a.ay();
    }

    public final bhn c() {
        bhn bhnVar = this.f21382d;
        return bhnVar == null ? bhn.b() : bhnVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21381a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"d"});
        }
        if (i10 == 3) {
            return new bhm();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (short[]) bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21381a;
    }
}
