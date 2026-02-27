package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhg extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhg f21351a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bhi f21353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21354f = bpb.f21870b;

    static {
        bhg bhgVar = new bhg();
        f21351a = bhgVar;
        bqn.aL(bhg.class, bhgVar);
    }

    private bhg() {
    }

    public static bhg c() {
        return f21351a;
    }

    public static bhg d(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bhg) bqn.aC(f21351a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void g(bhg bhgVar, bhi bhiVar) {
        bhiVar.getClass();
        bhgVar.f21353e = bhiVar;
    }

    public static bif k() {
        return (bif) f21351a.ay();
    }

    public final int a() {
        return this.f21352d;
    }

    public final bhi e() {
        bhi bhiVar = this.f21353e;
        return bhiVar == null ? bhi.c() : bhiVar;
    }

    public final bpb f() {
        return this.f21354f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21351a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhg();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21351a;
    }
}
