package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bgh extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bgh f21246a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bgj f21248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bhg f21249f;

    static {
        bgh bghVar = new bgh();
        f21246a = bghVar;
        bqn.aL(bgh.class, bghVar);
    }

    private bgh() {
    }

    public static bgh c(bpb bpbVar, bqb bqbVar) throws bqw {
        return (bgh) bqn.aC(f21246a, bpbVar, bqbVar);
    }

    public static /* synthetic */ void g(bgh bghVar, bgj bgjVar) {
        bgjVar.getClass();
        bghVar.f21248e = bgjVar;
    }

    public static /* synthetic */ void h(bgh bghVar, bhg bhgVar) {
        bhgVar.getClass();
        bghVar.f21249f = bhgVar;
    }

    public static bif j() {
        return (bif) f21246a.ay();
    }

    public final int a() {
        return this.f21247d;
    }

    public final bgj d() {
        bgj bgjVar = this.f21248e;
        return bgjVar == null ? bgj.c() : bgjVar;
    }

    public final bhg e() {
        bhg bhgVar = this.f21249f;
        return bhgVar == null ? bhg.c() : bhgVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21246a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bgh();
        }
        if (i10 == 4) {
            return new bif((byte[]) null, (short[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        }
        if (i10 != 5) {
            return null;
        }
        return f21246a;
    }
}
